package android.support.v7.internal.widget; class ActionBarView$HomeView {/*

.class Landroid/support/v7/internal/widget/ActionBarView$HomeView;
.super Landroid/widget/FrameLayout;
.source "ActionBarView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HomeView"
.end annotation


# instance fields
.field private mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

.field private mIconView:Landroid/widget/ImageView;

.field private mUpIndicatorRes:I

.field private mUpView:Landroid/widget/ImageView;

.field private mUpWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 1254
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1255
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 1258
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1259
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2
    .parameter "event"

    .prologue
    .line 1291
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    .line 1292
    .local v0, cdesc:Ljava/lang/CharSequence;
    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 1293
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1295
    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    return v1
.end method

.method public getLeftOffset()I
    .locals 2

    .prologue
    .line 1306
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x8

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter "newConfig"

    .prologue
    .line 1282
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1283
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 1285
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(I)V

    .line 1287
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 1300
    sget v0, Landroid/support/v7/appcompat/R$id;->up:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    .line 1301
    sget v0, Landroid/support/v7/appcompat/R$id;->home:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    .line 1302
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    .line 1303
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 17
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 1354
    sub-int v14, p5, p3

    #v14=(Integer);
    div-int/lit8 v12, v14, 0x2

    .line 1355
    .local v12, vCenter:I
    #v12=(Integer);
    sub-int v13, p4, p2

    .line 1356
    .local v13, width:I
    #v13=(Integer);
    const/4 v9, 0x0

    .line 1357
    .local v9, upOffset:I
    #v9=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v14=(Reference);
    invoke-virtual {v14}, Landroid/widget/ImageView;->getVisibility()I

    move-result v14

    #v14=(Integer);
    const/16 v15, 0x8

    #v15=(PosByte);
    if-eq v14, v15, :cond_0

    .line 1358
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v14=(Reference);
    invoke-virtual {v14}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 1359
    .local v8, upLp:Landroid/widget/FrameLayout$LayoutParams;
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v7

    .line 1360
    .local v7, upHeight:I
    #v7=(Integer);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v11

    .line 1361
    .local v11, upWidth:I
    #v11=(Integer);
    div-int/lit8 v14, v7, 0x2

    #v14=(Integer);
    sub-int v10, v12, v14

    .line 1362
    .local v10, upTop:I
    #v10=(Integer);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v14=(Reference);
    const/4 v15, 0x0

    #v15=(Null);
    add-int v16, v10, v7

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v14, v15, v10, v11, v0}, Landroid/widget/ImageView;->layout(IIII)V

    .line 1363
    iget v14, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    #v14=(Integer);
    add-int/2addr v14, v11

    iget v15, v8, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    #v15=(Integer);
    add-int v9, v14, v15

    .line 1364
    #v9=(Integer);
    sub-int/2addr v13, v9

    .line 1365
    add-int p2, p2, v9

    .line 1367
    .end local v7           #upHeight:I
    .end local v8           #upLp:Landroid/widget/FrameLayout$LayoutParams;
    .end local v10           #upTop:I
    .end local v11           #upWidth:I
    :cond_0
    #v0=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v16=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    #v14=(Reference);
    invoke-virtual {v14}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 1368
    .local v4, iconLp:Landroid/widget/FrameLayout$LayoutParams;
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v2

    .line 1369
    .local v2, iconHeight:I
    #v2=(Integer);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v6

    .line 1370
    .local v6, iconWidth:I
    #v6=(Integer);
    sub-int v14, p4, p2

    #v14=(Integer);
    div-int/lit8 v1, v14, 0x2

    .line 1371
    .local v1, hCenter:I
    #v1=(Integer);
    iget v14, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    div-int/lit8 v15, v6, 0x2

    sub-int v15, v1, v15

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int v3, v9, v14

    .line 1372
    .local v3, iconLeft:I
    #v3=(Integer);
    iget v14, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    div-int/lit8 v15, v2, 0x2

    sub-int v15, v12, v15

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1373
    .local v5, iconTop:I
    #v5=(Integer);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    #v14=(Reference);
    add-int v15, v3, v6

    add-int v16, v5, v2

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    invoke-virtual {v14, v3, v5, v15, v0}, Landroid/widget/ImageView;->layout(IIII)V

    .line 1374
    return-void
.end method

.method protected onMeasure(II)V
    .locals 13
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 1311
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v1=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(Reference);
    move v2, p1

    #v2=(Integer);
    move v4, p2

    #v4=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1312
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 1313
    .local v10, upLp:Landroid/widget/FrameLayout$LayoutParams;
    iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    .line 1314
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x8

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    const/4 v3, 0x0

    .line 1315
    .local v3, width:I
    :goto_0
    #v3=(Integer);
    iget v0, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    iget v1, v10, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int v6, v0, v1

    .line 1316
    .local v6, height:I
    #v6=(Integer);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    #v1=(Reference);
    const/4 v5, 0x0

    move-object v0, p0

    #v0=(Reference);
    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1317
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 1318
    .local v9, iconLp:Landroid/widget/FrameLayout$LayoutParams;
    iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    add-int/2addr v3, v0

    .line 1319
    iget v0, v9, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    iget v1, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 1322
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 1323
    .local v11, widthMode:I
    #v11=(Integer);
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v7

    .line 1324
    .local v7, heightMode:I
    #v7=(Integer);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v12

    .line 1325
    .local v12, widthSize:I
    #v12=(Integer);
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    .line 1327
    .local v8, heightSize:I
    #v8=(Integer);
    sparse-switch v11, :sswitch_data_0

    .line 1338
    :goto_1
    sparse-switch v7, :sswitch_data_1

    .line 1349
    :goto_2
    invoke-virtual {p0, v3, v6}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setMeasuredDimension(II)V

    .line 1350
    return-void

    .line 1314
    .end local v3           #width:I
    .end local v6           #height:I
    .end local v7           #heightMode:I
    .end local v8           #heightSize:I
    .end local v9           #iconLp:Landroid/widget/FrameLayout$LayoutParams;
    .end local v11           #widthMode:I
    .end local v12           #widthSize:I
    :cond_0
    #v1=(PosByte);v3=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpWidth:I

    #v3=(Integer);
    goto :goto_0

    .line 1329
    .restart local v3       #width:I
    .restart local v6       #height:I
    .restart local v7       #heightMode:I
    .restart local v8       #heightSize:I
    .restart local v9       #iconLp:Landroid/widget/FrameLayout$LayoutParams;
    .restart local v11       #widthMode:I
    .restart local v12       #widthSize:I
    :sswitch_0
    #v1=(Integer);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Reference);v11=(Integer);v12=(Integer);
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1330
    goto :goto_1

    .line 1332
    :sswitch_1
    move v3, v12

    .line 1333
    goto :goto_1

    .line 1340
    :sswitch_2
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 1341
    goto :goto_2

    .line 1343
    :sswitch_3
    move v6, v8

    .line 1344
    goto :goto_2

    .line 1327
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_1
    .end sparse-switch

    .line 1338
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_2
        0x40000000 -> :sswitch_3
    .end sparse-switch
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "icon"

    .prologue
    .line 1266
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mIconView:Landroid/widget/ImageView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1267
    return-void
.end method

.method public setUp(Z)V
    .locals 2
    .parameter "isUp"

    .prologue
    .line 1262
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v1=(Reference);
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(PosByte);
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1263
    return-void

    .line 1262
    :cond_0
    #v0=(Uninit);
    const/16 v0, 0x8

    #v0=(PosByte);
    goto :goto_0
.end method

.method public setUpIndicator(I)V
    .locals 2
    .parameter "resId"

    .prologue
    .line 1275
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    .line 1276
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v1=(Reference);
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1278
    return-void

    .line 1276
    :cond_0
    #v0=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    goto :goto_0
.end method

.method public setUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "d"

    .prologue
    .line 1270
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpView:Landroid/widget/ImageView;

    #v0=(Reference);
    if-eqz p1, :cond_0

    .end local p1
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1271
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mUpIndicatorRes:I

    .line 1272
    return-void

    .line 1270
    .restart local p1
    :cond_0
    #v0=(Reference);
    iget-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->mDefaultUpIndicator:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method

*/}
