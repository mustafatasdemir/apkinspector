package android.support.v7.internal.widget; class LinearLayoutICS { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/LinearLayoutICS;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// .source "LinearLayoutICS.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SHOW_DIVIDER_BEGINNING:I = 0x1
a=0;// 
a=0;// .field private static final SHOW_DIVIDER_END:I = 0x4
a=0;// 
a=0;// .field private static final SHOW_DIVIDER_MIDDLE:I = 0x2
a=0;// 
a=0;// .field private static final SHOW_DIVIDER_NONE:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private final mDividerHeight:I
a=0;// 
a=0;// .field private final mDividerPadding:I
a=0;// 
a=0;// .field private final mDividerWidth:I
a=0;// 
a=0;// .field private final mShowDividers:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/LinearLayoutICS;);
a=0;//     sget-object v3, Landroid/support/v7/appcompat/R$styleable;->LinearLayoutICS:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     .line 51
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method drawSupportDividersHorizontal(Landroid/graphics/Canvas;)V
a=0;//     .locals 7
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 136
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-eq v5, v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 141
a=0;//     .local v3, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0, p1, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 136
a=0;//     .end local v3    # "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 145
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     add-int/lit8 v5, v1, -0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     .local v4, "right":I
a=0;//     #v4=(Null);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     sub-int v4, v5, v6
a=0;// 
a=0;//     .line 153
a=0;//     :goto_1
a=0;//     #v4=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v4}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 155
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v4    # "right":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     .restart local v4    # "right":I
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/View;);v4=(Null);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method drawSupportDividersVertical(Landroid/graphics/Canvas;)V
a=0;//     .locals 7
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 113
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v3, v2, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 115
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-eq v5, v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 118
a=0;//     .local v4, "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0, p1, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 113
a=0;//     .end local v4    # "lp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 123
a=0;//     add-int/lit8 v5, v2, -0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 124
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Null);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     sub-int v0, v5, v6
a=0;// 
a=0;//     .line 130
a=0;//     :goto_1
a=0;//     #v0=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "bottom":I
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v0    # "bottom":I
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method drawSupportHorizontalDivider(Landroid/graphics/Canvas;I)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "top"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     add-int/2addr v3, p2
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method drawSupportVerticalDivider(Landroid/graphics/Canvas;I)V
a=0;//     .locals 5
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "left"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     add-int/2addr v2, p2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerPadding:I
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getSupportDividerWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected hasSupportDividerBeforeChildAt(I)Z
a=0;//     .locals 5
a=0;//     .param p1, "childIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(PosByte);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 177
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_2
a=0;//     #v2=(One);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne p1, v4, :cond_3
a=0;// 
a=0;//     .line 179
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I
a=0;// 
a=0;//     and-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_3
a=0;//     #v2=(One);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mShowDividers:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "hasVisibleViewBefore":Z
a=0;//     #v0=(Null);
a=0;//     add-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v3=(PosByte);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     if-eq v2, v3, :cond_5
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 188
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_5
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "hasVisibleViewBefore":Z
a=0;//     .end local v1    # "i":I
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 190
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected measureChildWithMargins(Landroid/view/View;IIII)V
a=0;//     .locals 5
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "parentWidthMeasureSpec"    # I
a=0;//     .param p3, "widthUsed"    # I
a=0;//     .param p4, "parentHeightMeasureSpec"    # I
a=0;//     .param p5, "heightUsed"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->indexOfChild(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "childIndex":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 88
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 92
a=0;//     .local v2, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getOrientation()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 107
a=0;//     .end local v0    # "childIndex":I
a=0;//     .end local v1    # "count":I
a=0;//     .end local v2    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->measureChildWithMargins(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v0    # "childIndex":I
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v2    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v3=(Boolean);v4=(One);
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_3
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDividerWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/LinearLayoutICS;->mDivider:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->getOrientation()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportDividersVertical(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->drawSupportDividersHorizontal(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
