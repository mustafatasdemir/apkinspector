package android.support.v7.internal.widget; class ActionBarContainer {/*

.class public Landroid/support/v7/internal/widget/ActionBarContainer;
.super Landroid/widget/FrameLayout;
.source "ActionBarContainer.java"


# instance fields
.field private mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

.field private mBackground:Landroid/graphics/drawable/Drawable;

.field private mIsSplit:Z

.field private mIsStacked:Z

.field private mIsTransitioning:Z

.field private mSplitBackground:Landroid/graphics/drawable/Drawable;

.field private mStackedBackground:Landroid/graphics/drawable/Drawable;

.field private mTabContainer:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 54
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    .line 58
    #v1=(One);
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    #p0=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    sget-object v3, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    #v3=(Reference);
    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 64
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/16 v3, 0xa

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    .line 65
    const/16 v3, 0xb

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    .line 68
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getId()I

    move-result v3

    #v3=(Integer);
    sget v4, Landroid/support/v7/appcompat/R$id;->split_action_bar:I

    #v4=(Integer);
    if-ne v3, v4, :cond_0

    .line 69
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    .line 70
    const/16 v3, 0xc

    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    .line 73
    :cond_0
    #v3=(Conflicted);
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 75
    iget-boolean v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v3=(Boolean);
    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v3=(Reference);
    if-nez v3, :cond_2

    :cond_1
    :goto_0
    #v1=(Boolean);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V

    .line 77
    return-void

    :cond_2
    #v1=(One);
    move v1, v2

    .line 75
    #v1=(Null);
    goto :goto_0

    :cond_3
    #v1=(One);v3=(Boolean);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v3=(Reference);
    if-nez v3, :cond_4

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_1

    :cond_4
    move v1, v2

    #v1=(Null);
    goto :goto_0
.end method

.method private drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V
    .locals 3
    .parameter "d"
    .parameter "canvas"

    .prologue
    .line 324
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 325
    .local v0, bounds:Landroid/graphics/Rect;
    #v0=(Reference);
    instance-of v1, p1, Landroid/graphics/drawable/ColorDrawable;

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0xb

    #v2=(PosByte);
    if-ge v1, v2, :cond_0

    .line 327
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 328
    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 329
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 330
    invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V

    .line 334
    :goto_0
    #v2=(Conflicted);
    return-void

    .line 332
    :cond_0
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 2

    .prologue
    .line 156
    invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V

    .line 157
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 160
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 161
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 163
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 166
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public getTabContainer()Landroid/view/View;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .parameter "canvas"

    .prologue
    .line 222
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getWidth()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    if-nez v0, :cond_1

    .line 238
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 226
    :cond_1
    #v0=(Integer);
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .line 227
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 231
    :cond_2
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eqz v0, :cond_3

    .line 232
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V

    .line 234
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public onFinishInflate()V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 82
    sget v0, Landroid/support/v7/appcompat/R$id;->action_bar:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    .line 83
    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter "ev"

    .prologue
    .line 199
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter "ev"

    .prologue
    .line 183
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsTransitioning:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onLayout(ZIIII)V
    .locals 13
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 271
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 273
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    if-eqz v8, :cond_1

    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    #v8=(Integer);
    const/16 v9, 0x8

    #v9=(PosByte);
    if-eq v8, v9, :cond_1

    const/4 v4, 0x1

    .line 275
    .local v4, hasTabs:Z
    :goto_0
    #v4=(Boolean);v8=(Conflicted);v9=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    if-eqz v8, :cond_4

    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    #v8=(Integer);
    const/16 v9, 0x8

    #v9=(PosByte);
    if-eq v8, v9, :cond_4

    .line 276
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v2

    .line 277
    .local v2, containerHeight:I
    #v2=(Integer);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    .line 279
    .local v7, tabHeight:I
    #v7=(Integer);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v8}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v8

    #v8=(Integer);
    and-int/lit8 v8, v8, 0x2

    if-nez v8, :cond_7

    .line 281
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getChildCount()I

    move-result v3

    .line 282
    .local v3, count:I
    #v3=(Integer);
    const/4 v5, 0x0

    .local v5, i:I
    :goto_1
    #v1=(Conflicted);v5=(Integer);v8=(Conflicted);
    if-ge v5, v3, :cond_3

    .line 283
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/ActionBarContainer;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 285
    .local v1, child:Landroid/view/View;
    #v1=(Reference);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    if-ne v1, v8, :cond_2

    .line 282
    :cond_0
    :goto_2
    #v8=(Conflicted);
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 273
    .end local v1           #child:Landroid/view/View;
    .end local v2           #containerHeight:I
    .end local v3           #count:I
    .end local v4           #hasTabs:Z
    .end local v5           #i:I
    .end local v7           #tabHeight:I
    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Conflicted);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_0

    .line 289
    .restart local v1       #child:Landroid/view/View;
    .restart local v2       #containerHeight:I
    .restart local v3       #count:I
    .restart local v4       #hasTabs:Z
    .restart local v5       #i:I
    .restart local v7       #tabHeight:I
    :cond_2
    #v1=(Reference);v2=(Integer);v3=(Integer);v4=(Boolean);v5=(Integer);v7=(Integer);v8=(Reference);v9=(PosByte);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v8}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_0

    .line 290
    invoke-virtual {v1, v7}, Landroid/view/View;->offsetTopAndBottom(I)V

    goto :goto_2

    .line 293
    .end local v1           #child:Landroid/view/View;
    :cond_3
    #v1=(Conflicted);v8=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    const/4 v9, 0x0

    #v9=(Null);
    move/from16 v0, p4

    #v0=(Integer);
    invoke-virtual {v8, p2, v9, v0, v7}, Landroid/view/View;->layout(IIII)V

    .line 299
    .end local v2           #containerHeight:I
    .end local v3           #count:I
    .end local v5           #i:I
    .end local v7           #tabHeight:I
    :cond_4
    :goto_3
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    const/4 v6, 0x0

    .line 300
    .local v6, needsInvalidate:Z
    #v6=(Null);
    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v8=(Boolean);
    if-eqz v8, :cond_8

    .line 301
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v8=(Reference);
    if-eqz v8, :cond_5

    .line 302
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    const/4 v9, 0x0

    #v9=(Null);
    const/4 v10, 0x0

    #v10=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I

    move-result v11

    #v11=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v12

    #v12=(Integer);
    invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 303
    const/4 v6, 0x1

    .line 318
    :cond_5
    :goto_4
    #v6=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-eqz v6, :cond_6

    .line 319
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V

    .line 321
    :cond_6
    return-void

    .line 295
    .end local v6           #needsInvalidate:Z
    .restart local v2       #containerHeight:I
    .restart local v7       #tabHeight:I
    :cond_7
    #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Integer);v9=(PosByte);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v8=(Reference);
    sub-int v9, v2, v7

    #v9=(Integer);
    move/from16 v0, p4

    #v0=(Integer);
    invoke-virtual {v8, p2, v9, v0, v2}, Landroid/view/View;->layout(IIII)V

    goto :goto_3

    .line 306
    .end local v2           #containerHeight:I
    .end local v7           #tabHeight:I
    .restart local v6       #needsInvalidate:Z
    :cond_8
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Null);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v8=(Reference);
    if-eqz v8, :cond_9

    .line 307
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ActionBarView;->getLeft()I

    move-result v9

    #v9=(Integer);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v10=(Reference);
    invoke-virtual {v10}, Landroid/support/v7/internal/widget/ActionBarView;->getTop()I

    move-result v10

    #v10=(Integer);
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/support/v7/internal/widget/ActionBarView;->getRight()I

    move-result v11

    #v11=(Integer);
    iget-object v12, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v12=(Reference);
    invoke-virtual {v12}, Landroid/support/v7/internal/widget/ActionBarView;->getBottom()I

    move-result v12

    #v12=(Integer);
    invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 309
    const/4 v6, 0x1

    .line 311
    :cond_9
    #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-eqz v4, :cond_a

    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v8, :cond_a

    const/4 v8, 0x1

    :goto_5
    #v8=(Boolean);
    iput-boolean v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z

    if-eqz v8, :cond_5

    .line 312
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v8=(Reference);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    move-result v9

    #v9=(Integer);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v10=(Reference);
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v10

    #v10=(Integer);
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v11

    #v11=(Integer);
    iget-object v12, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v12=(Reference);
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    move-result v12

    #v12=(Integer);
    invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 314
    const/4 v6, 0x1

    #v6=(One);
    goto :goto_4

    .line 311
    :cond_a
    #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    const/4 v8, 0x0

    #v8=(Null);
    goto :goto_5
.end method

.method public onMeasure(II)V
    .locals 6
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 248
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 250
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v4=(Reference);
    if-nez v4, :cond_1

    .line 267
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 254
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 255
    .local v1, lp:Landroid/widget/FrameLayout$LayoutParams;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    const/4 v0, 0x0

    .line 258
    .local v0, actionBarViewHeight:I
    :goto_1
    #v0=(Integer);v4=(Integer);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v4=(Reference);
    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0x8

    #v5=(PosByte);
    if-eq v4, v5, :cond_0

    .line 259
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 260
    .local v3, mode:I
    #v3=(Integer);
    const/high16 v4, -0x8000

    if-ne v3, v4, :cond_0

    .line 261
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 262
    .local v2, maxHeight:I
    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I

    move-result v4

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    #v5=(Integer);
    add-int/2addr v5, v0

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {p0, v4, v5}, Landroid/support/v7/internal/widget/ActionBarContainer;->setMeasuredDimension(II)V

    goto :goto_0

    .line 255
    .end local v0           #actionBarViewHeight:I
    .end local v2           #maxHeight:I
    .end local v3           #mode:I
    :cond_2
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I

    move-result v4

    #v4=(Integer);
    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    #v5=(Integer);
    add-int/2addr v4, v5

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int v0, v4, v5

    #v0=(Integer);
    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .parameter "ev"

    .prologue
    .line 188
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 191
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 7
    .parameter "bg"

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 86
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 87
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 88
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    :cond_0
    #v3=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    .line 91
    if-eqz p1, :cond_1

    .line 92
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 93
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v2, :cond_1

    .line 94
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->getLeft()I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getTop()I

    move-result v4

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/internal/widget/ActionBarView;->getRight()I

    move-result v5

    #v5=(Integer);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActionBarView;->getBottom()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 99
    :cond_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v2=(Boolean);
    if-eqz v2, :cond_4

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_3

    :cond_2
    :goto_0
    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V

    .line 101
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V

    .line 102
    return-void

    :cond_3
    #v0=(One);
    move v0, v1

    .line 99
    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);v2=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_5

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    :cond_5
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public setSplitBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 5
    .parameter "bg"

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 123
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 124
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 125
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 127
    :cond_0
    #v3=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    .line 128
    if-eqz p1, :cond_1

    .line 129
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 130
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 131
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v2, v1, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 134
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v2=(Boolean);
    if-eqz v2, :cond_4

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_3

    :cond_2
    :goto_0
    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V

    .line 136
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V

    .line 137
    return-void

    :cond_3
    #v0=(One);
    move v0, v1

    .line 134
    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);v2=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_5

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    :cond_5
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public setStackedBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 7
    .parameter "bg"

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 105
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 106
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 107
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    :cond_0
    #v3=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    .line 110
    if-eqz p1, :cond_1

    .line 111
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 112
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 113
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v5

    #v5=(Integer);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 117
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v2=(Boolean);
    if-eqz v2, :cond_4

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_3

    :cond_2
    :goto_0
    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V

    .line 119
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V

    .line 120
    return-void

    :cond_3
    #v0=(One);
    move v0, v1

    .line 117
    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);v2=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_5

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    :cond_5
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
    .locals 2
    .parameter "tabView"

    .prologue
    .line 203
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 204
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V

    .line 206
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;

    .line 207
    if-eqz p1, :cond_1

    .line 208
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V

    .line 209
    invoke-virtual {p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 210
    .local v0, lp:Landroid/view/ViewGroup$LayoutParams;
    #v0=(Reference);
    const/4 v1, -0x1

    #v1=(Byte);
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 211
    const/4 v1, -0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 212
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V

    .line 214
    .end local v0           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_1
    #v0=(Conflicted);v1=(Reference);
    return-void
.end method

.method public setTransitioning(Z)V
    .locals 1
    .parameter "isTransitioning"

    .prologue
    .line 176
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsTransitioning:Z

    .line 177
    if-eqz p1, :cond_0

    const/high16 v0, 0x6

    :goto_0
    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setDescendantFocusability(I)V

    .line 179
    return-void

    .line 177
    :cond_0
    #v0=(Uninit);
    const/high16 v0, 0x4

    #v0=(Integer);
    goto :goto_0
.end method

.method public setVisibility(I)V
    .locals 3
    .parameter "visibility"

    .prologue
    const/4 v1, 0x0

    .line 141
    #v1=(Null);
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 142
    if-nez p1, :cond_3

    const/4 v0, 0x1

    .line 143
    .local v0, isVisible:Z
    :goto_0
    #v0=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 144
    :cond_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 145
    :cond_1
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 146
    :cond_2
    return-void

    .end local v0           #isVisible:Z
    :cond_3
    #v0=(Uninit);v2=(Uninit);
    move v0, v1

    .line 142
    #v0=(Null);
    goto :goto_0
.end method

.method public startActionModeForChild(Landroid/view/View;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
    .locals 1
    .parameter "child"
    .parameter "callback"

    .prologue
    .line 243
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .parameter "who"

    .prologue
    .line 150
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v0=(Boolean);
    if-eqz v0, :cond_3

    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-ne p1, v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z

    #v0=(Boolean);
    if-nez v0, :cond_3

    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-ne p1, v0, :cond_2

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z

    #v0=(Boolean);
    if-nez v0, :cond_3

    :cond_2
    #v0=(Conflicted);
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_4
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
