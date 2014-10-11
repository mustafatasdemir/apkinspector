package android.support.v7.internal.widget; class ActionBarContainer { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "ActionBarContainer.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mIsSplit:Z
a=0;// 
a=0;// .field private mIsStacked:Z
a=0;// 
a=0;// .field private mIsTransitioning:Z
a=0;// 
a=0;// .field private mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mTabContainer:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 58
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 60
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v3, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 64
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 65
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$id;->split_action_bar:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     .line 70
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 75
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 75
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_4
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V
a=0;//     .locals 3
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p2, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 325
a=0;//     .local v0, "bounds":Landroid/graphics/Rect;
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     instance-of v1, p1, Landroid/graphics/drawable/ColorDrawable;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 329
a=0;//     invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 334
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     invoke-super {p0}, Landroid/widget/FrameLayout;->drawableStateChanged()V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getTabContainer()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 1
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 226
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->drawBackgroundDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFinishInflate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V
a=0;// 
a=0;//     .line 82
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onHoverEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsTransitioning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLayout(ZIIII)V
a=0;//     .locals 13
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_1
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 275
a=0;//     .local v4, "hasTabs":Z
a=0;//     :goto_0
a=0;//     #v4=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_4
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 277
a=0;//     .local v2, "containerHeight":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 279
a=0;//     .local v7, "tabHeight":I
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "count":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v5=(Integer);v8=(Conflicted);
a=0;//     if-ge v5, v3, :cond_3
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/ActionBarContainer;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 285
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, v8, :cond_2
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 273
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v2    # "containerHeight":I
a=0;//     .end local v3    # "count":I
a=0;//     .end local v4    # "hasTabs":Z
a=0;//     .end local v5    # "i":I
a=0;//     .end local v7    # "tabHeight":I
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 289
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     .restart local v2    # "containerHeight":I
a=0;//     .restart local v3    # "count":I
a=0;//     .restart local v4    # "hasTabs":Z
a=0;//     .restart local v5    # "i":I
a=0;//     .restart local v7    # "tabHeight":I
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/view/View;);v2=(Integer);v3=(Integer);v4=(Boolean);v5=(Integer);v7=(Integer);v8=(Reference,Landroid/view/View;);v9=(PosByte);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v1, v7}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 293
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, p2, v9, v0, v7}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 299
a=0;//     .end local v2    # "containerHeight":I
a=0;//     .end local v3    # "count":I
a=0;//     .end local v5    # "i":I
a=0;//     .end local v7    # "tabHeight":I
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 300
a=0;//     .local v6, "needsInvalidate":Z
a=0;//     #v6=(Null);
a=0;//     iget-boolean v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 303
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 318
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v6=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_6
a=0;//     return-void
a=0;// 
a=0;//     .line 295
a=0;//     .end local v6    # "needsInvalidate":Z
a=0;//     .restart local v2    # "containerHeight":I
a=0;//     .restart local v7    # "tabHeight":I
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Integer);v9=(PosByte);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     sub-int v9, v2, v7
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v8, p2, v9, v0, v2}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 306
a=0;//     .end local v2    # "containerHeight":I
a=0;//     .end local v7    # "tabHeight":I
a=0;//     .restart local v6    # "needsInvalidate":Z
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Null);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v9}, Landroid/support/v7/internal/widget/ActionBarView;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v10}, Landroid/support/v7/internal/widget/ActionBarView;->getTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v11}, Landroid/support/v7/internal/widget/ActionBarView;->getRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v12}, Landroid/support/v7/internal/widget/ActionBarView;->getBottom()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 311
a=0;//     :cond_9
a=0;//     #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v8=(Boolean);
a=0;//     iput-boolean v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v10}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v12}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v8, v9, v10, v11, v12}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 314
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 311
a=0;//     :cond_a
a=0;//     #v6=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 254
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 255
a=0;//     .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 258
a=0;//     .local v0, "actionBarViewHeight":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Integer);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 260
a=0;//     .local v3, "mode":I
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, -0x80000000
a=0;// 
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 262
a=0;//     .local v2, "maxHeight":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v0
a=0;// 
a=0;//     invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0, v4, v5}, Landroid/support/v7/internal/widget/ActionBarContainer;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     .end local v0    # "actionBarViewHeight":I
a=0;//     .end local v2    # "maxHeight":I
a=0;//     .end local v3    # "mode":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v4, v5
a=0;// 
a=0;//     iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int v0, v4, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 7
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 91
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ActionBarView;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/ActionBarView;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActionBarView;->getBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v2=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSplitBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 5
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 128
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v1, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v2=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setStackedBackground(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 7
a=0;//     .param p1, "bg"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 110
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContainer;->invalidate()V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);v2=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 2
a=0;//     .param p1, "tabView"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mTabContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 207
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 210
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 212
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V
a=0;// 
a=0;//     .line 214
a=0;//     .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/View;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTransitioning(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isTransitioning"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsTransitioning:Z
a=0;// 
a=0;//     .line 177
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/high16 v0, 0x60000
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 179
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/high16 v0, 0x40000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 3
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 142
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "isVisible":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
a=0;// 
a=0;//     .line 145
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
a=0;// 
a=0;//     .line 146
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "isVisible":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 142
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startActionModeForChild(Landroid/view/View;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mStackedBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsStacked:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContainer;->mIsSplit:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/FrameLayout;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
