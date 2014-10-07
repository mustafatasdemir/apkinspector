package android.support.v7.internal.widget; class ScrollingTabContainerView$TabView {/*

.class public Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
.super Landroid/widget/LinearLayout;
.source "ScrollingTabContainerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TabView"
.end annotation


# instance fields
.field private mCustomView:Landroid/view/View;

.field private mIconView:Landroid/widget/ImageView;

.field private mParent:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field private mTab:Landroid/support/v7/app/ActionBar$Tab;

.field private mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 336
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 337
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method attach(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)V
    .locals 1
    .parameter "parent"
    .parameter "tab"
    .parameter "forList"

    .prologue
    .line 340
    iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mParent:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    .line 341
    iput-object p2, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTab:Landroid/support/v7/app/ActionBar$Tab;

    .line 343
    if-eqz p3, :cond_0

    .line 344
    const/16 v0, 0x13

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setGravity(I)V

    .line 347
    :cond_0
    #v0=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->update()V

    .line 348
    return-void
.end method

.method public bindTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 0
    .parameter "tab"

    .prologue
    .line 351
    iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTab:Landroid/support/v7/app/ActionBar$Tab;

    .line 352
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->update()V

    .line 353
    return-void
.end method

.method public getTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTab:Landroid/support/v7/app/ActionBar$Tab;

    #v0=(Reference);
    return-object v0
.end method

.method public onMeasure(II)V
    .locals 2
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 357
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 359
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mParent:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mParent:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    iget v0, v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    .line 362
    .local v0, maxTabWidth:I
    :goto_0
    #v0=(Integer);
    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    if-le v1, v0, :cond_0

    .line 363
    const/high16 v1, 0x4000

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-super {p0, v1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 366
    :cond_0
    #v1=(Conflicted);
    return-void

    .line 359
    .end local v0           #maxTabWidth:I
    :cond_1
    #v0=(Uninit);v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public update()V
    .locals 14

    .prologue
    const/16 v13, 0x10

    #v13=(PosByte);
    const/4 v12, 0x0

    #v12=(Null);
    const/16 v9, 0x8

    #v9=(PosByte);
    const/4 v11, -0x2

    #v11=(Byte);
    const/4 v10, 0x0

    .line 369
    #v10=(Null);
    iget-object v5, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTab:Landroid/support/v7/app/ActionBar$Tab;

    .line 370
    .local v5, tab:Landroid/support/v7/app/ActionBar$Tab;
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/app/ActionBar$Tab;->getCustomView()Landroid/view/View;

    move-result-object v0

    .line 371
    .local v0, custom:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_4

    .line 372
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 373
    .local v1, customParent:Landroid/view/ViewParent;
    #v1=(Reference);
    if-eq v1, p0, :cond_1

    .line 374
    if-eqz v1, :cond_0

    .line 375
    check-cast v1, Landroid/view/ViewGroup;

    .end local v1           #customParent:Landroid/view/ViewParent;
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 377
    :cond_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->addView(Landroid/view/View;)V

    .line 379
    :cond_1
    iput-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mCustomView:Landroid/view/View;

    .line 380
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    #v8=(Reference);
    if-eqz v8, :cond_2

    .line 381
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 383
    :cond_2
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    if-eqz v8, :cond_3

    .line 384
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 385
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 436
    :cond_3
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    return-void

    .line 388
    :cond_4
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(PosByte);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mCustomView:Landroid/view/View;

    #v8=(Reference);
    if-eqz v8, :cond_5

    .line 389
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mCustomView:Landroid/view/View;

    invoke-virtual {p0, v8}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->removeView(Landroid/view/View;)V

    .line 390
    iput-object v10, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mCustomView:Landroid/view/View;

    .line 393
    :cond_5
    invoke-virtual {v5}, Landroid/support/v7/app/ActionBar$Tab;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 394
    .local v2, icon:Landroid/graphics/drawable/Drawable;
    #v2=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/app/ActionBar$Tab;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 396
    .local v6, text:Ljava/lang/CharSequence;
    #v6=(Reference);
    if-eqz v2, :cond_a

    .line 397
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    if-nez v8, :cond_6

    .line 398
    new-instance v3, Landroid/widget/ImageView;

    #v3=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v3, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 399
    .local v3, iconView:Landroid/widget/ImageView;
    #v3=(Reference);
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    #v4=(UninitRef);
    invoke-direct {v4, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 401
    .local v4, lp:Landroid/widget/LinearLayout$LayoutParams;
    #v4=(Reference);
    iput v13, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 402
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 403
    invoke-virtual {p0, v3, v12}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->addView(Landroid/view/View;I)V

    .line 404
    iput-object v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    .line 406
    .end local v3           #iconView:Landroid/widget/ImageView;
    .end local v4           #lp:Landroid/widget/LinearLayout$LayoutParams;
    :cond_6
    #v3=(Conflicted);v4=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 407
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 413
    :cond_7
    :goto_1
    if-eqz v6, :cond_b

    .line 414
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    if-nez v8, :cond_8

    .line 415
    new-instance v7, Landroid/support/v7/internal/widget/CompatTextView;

    #v7=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getContext()Landroid/content/Context;

    move-result-object v8

    sget v9, Landroid/support/v7/appcompat/R$attr;->actionBarTabTextStyle:I

    #v9=(Integer);
    invoke-direct {v7, v8, v10, v9}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 417
    .local v7, textView:Landroid/widget/TextView;
    #v7=(Reference);
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 418
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    #v4=(UninitRef);
    invoke-direct {v4, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 420
    .restart local v4       #lp:Landroid/widget/LinearLayout$LayoutParams;
    #v4=(Reference);
    iput v13, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 421
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 422
    invoke-virtual {p0, v7}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->addView(Landroid/view/View;)V

    .line 423
    iput-object v7, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    .line 425
    .end local v4           #lp:Landroid/widget/LinearLayout$LayoutParams;
    .end local v7           #textView:Landroid/widget/TextView;
    :cond_8
    #v4=(Conflicted);v7=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 426
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 432
    :cond_9
    :goto_2
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    if-eqz v8, :cond_3

    .line 433
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/support/v7/app/ActionBar$Tab;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 408
    :cond_a
    #v3=(Uninit);v4=(Uninit);v7=(Uninit);v9=(PosByte);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    if-eqz v8, :cond_7

    .line 409
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 410
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 427
    :cond_b
    #v3=(Conflicted);v4=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    if-eqz v8, :cond_9

    .line 428
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 429
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

*/}
