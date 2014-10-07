package android.support.v7.internal.widget; class ListPopupWindow$DropDownListView {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
.super Landroid/widget/ListView;
.source "ListPopupWindow.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DropDownListView"
.end annotation


# static fields
.field public static final INVALID_POSITION:I = -0x1

.field static final NO_POSITION:I = -0x1

.field private static final TAG:Ljava/lang/String; = "ListPopupWindow.DropDownListView"


# instance fields
.field private mHijackFocus:Z

.field private mListSelectionHidden:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2
    .parameter "context"
    .parameter "hijackFocus"

    .prologue
    .line 1170
    const/4 v0, 0x0

    #v0=(Null);
    sget v1, Landroid/support/v7/appcompat/R$attr;->dropDownListViewStyle:I

    #v1=(Integer);
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1171
    #p0=(Reference);
    iput-boolean p2, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    .line 1172
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setCacheColorHint(I)V

    .line 1173
    return-void
.end method

.method static synthetic access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1119
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z

    return p1
.end method

.method static synthetic access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 1119
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->lookForSelectablePosition(IZ)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private lookForSelectablePosition(IZ)I
    .locals 4
    .parameter "position"
    .parameter "lookDown"

    .prologue
    const/4 v2, -0x1

    .line 1184
    #v2=(Byte);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 1185
    .local v0, adapter:Landroid/widget/ListAdapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 1211
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
    return v2

    .line 1189
    :cond_1
    #v1=(Uninit);v2=(Byte);v3=(Boolean);
    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 1190
    .local v1, count:I
    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v3}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_4

    .line 1191
    if-eqz p2, :cond_2

    .line 1192
    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1193
    :goto_1
    #v3=(Boolean);
    if-ge p1, v1, :cond_3

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1194
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 1197
    :cond_2
    add-int/lit8 v3, v1, -0x1

    #v3=(Integer);
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1198
    :goto_2
    if-ltz p1, :cond_3

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_3

    .line 1199
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    .line 1203
    :cond_3
    #v3=(Integer);
    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    move v2, p1

    .line 1206
    #v2=(Integer);
    goto :goto_0

    .line 1208
    :cond_4
    #v2=(Byte);v3=(Boolean);
    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    move v2, p1

    .line 1211
    #v2=(Integer);
    goto :goto_0
.end method


# virtual methods
.method public hasFocus()Z
    .locals 1

    .prologue
    .line 1248
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

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

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 1228
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

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

.method public isFocused()Z
    .locals 1

    .prologue
    .line 1238
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

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

.method public isInTouchMode()Z
    .locals 1

    .prologue
    .line 1218
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method final measureHeightOfChildrenCompat(IIIII)I
    .locals 21
    .parameter "widthMeasureSpec"
    .parameter "startPosition"
    .parameter "endPosition"
    .parameter "maxHeight"
    .parameter "disallowPartialChildPosition"

    .prologue
    .line 1281
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingTop()I

    move-result v14

    .line 1282
    .local v14, paddingTop:I
    #v14=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingBottom()I

    move-result v11

    .line 1283
    .local v11, paddingBottom:I
    #v11=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingLeft()I

    move-result v12

    .line 1284
    .local v12, paddingLeft:I
    #v12=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingRight()I

    move-result v13

    .line 1285
    .local v13, paddingRight:I
    #v13=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDividerHeight()I

    move-result v16

    .line 1286
    .local v16, reportedDividerHeight:I
    #v16=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 1288
    .local v6, divider:Landroid/graphics/drawable/Drawable;
    #v6=(Reference);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 1290
    .local v2, adapter:Landroid/widget/ListAdapter;
    #v2=(Reference);
    if-nez v2, :cond_1

    .line 1291
    add-int v15, v14, v11

    .line 1350
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v15=(Integer);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    return v15

    .line 1295
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
    add-int v17, v14, v11

    .line 1296
    .local v17, returnedHeight:I
    #v17=(Integer);
    if-lez v16, :cond_5

    if-eqz v6, :cond_5

    move/from16 v7, v16

    .line 1301
    .local v7, dividerHeight:I
    :goto_1
    #v7=(Integer);
    const/4 v15, 0x0

    .line 1303
    .local v15, prevHeightWithoutPartialChild:I
    #v15=(Null);
    const/4 v3, 0x0

    .line 1304
    .local v3, child:Landroid/view/View;
    #v3=(Null);
    const/16 v18, 0x0

    .line 1305
    .local v18, viewType:I
    #v18=(Null);
    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v5

    .line 1306
    .local v5, count:I
    #v5=(Integer);
    const/4 v9, 0x0

    .local v9, i:I
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Reference);v4=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);v15=(Integer);v18=(Integer);v19=(Conflicted);v20=(Conflicted);
    if-ge v9, v5, :cond_9

    .line 1307
    invoke-interface {v2, v9}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v10

    .line 1308
    .local v10, newType:I
    #v10=(Integer);
    move/from16 v0, v18

    #v0=(Integer);
    if-eq v10, v0, :cond_2

    .line 1309
    const/4 v3, 0x0

    .line 1310
    #v3=(Null);
    move/from16 v18, v10

    .line 1312
    :cond_2
    #v3=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-interface {v2, v9, v3, v0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1316
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 1317
    .local v4, childLp:Landroid/view/ViewGroup$LayoutParams;
    #v4=(Reference);
    if-eqz v4, :cond_6

    iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    if-lez v19, :cond_6

    .line 1318
    iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v19, v0

    const/high16 v20, 0x4000

    #v20=(Integer);
    invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 1323
    .local v8, heightMeasureSpec:I
    :goto_3
    #v0=(Conflicted);v8=(Integer);
    move/from16 v0, p1

    #v0=(Integer);
    invoke-virtual {v3, v0, v8}, Landroid/view/View;->measure(II)V

    .line 1325
    if-lez v9, :cond_3

    .line 1327
    add-int v17, v17, v7

    .line 1330
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v19

    add-int v17, v17, v19

    .line 1332
    move/from16 v0, v17

    move/from16 v1, p4

    #v1=(Integer);
    if-lt v0, v1, :cond_7

    .line 1335
    if-ltz p5, :cond_4

    move/from16 v0, p5

    if-le v9, v0, :cond_4

    if-lez v15, :cond_4

    move/from16 v0, v17

    move/from16 v1, p4

    if-ne v0, v1, :cond_0

    :cond_4
    move/from16 v15, p4

    goto :goto_0

    .line 1296
    .end local v3           #child:Landroid/view/View;
    .end local v4           #childLp:Landroid/view/ViewGroup$LayoutParams;
    .end local v5           #count:I
    .end local v7           #dividerHeight:I
    .end local v8           #heightMeasureSpec:I
    .end local v9           #i:I
    .end local v10           #newType:I
    .end local v15           #prevHeightWithoutPartialChild:I
    .end local v18           #viewType:I
    :cond_5
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v15=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_1

    .line 1321
    .restart local v3       #child:Landroid/view/View;
    .restart local v4       #childLp:Landroid/view/ViewGroup$LayoutParams;
    .restart local v5       #count:I
    .restart local v7       #dividerHeight:I
    .restart local v9       #i:I
    .restart local v10       #newType:I
    .restart local v15       #prevHeightWithoutPartialChild:I
    .restart local v18       #viewType:I
    :cond_6
    #v0=(Conflicted);v1=(Conflicted);v3=(Reference);v4=(Reference);v5=(Integer);v7=(Integer);v8=(Conflicted);v9=(Integer);v10=(Integer);v15=(Integer);v18=(Integer);v19=(Conflicted);v20=(Conflicted);
    const/16 v19, 0x0

    #v19=(Null);
    const/16 v20, 0x0

    #v20=(Null);
    invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #heightMeasureSpec:I
    #v8=(Integer);
    goto :goto_3

    .line 1343
    :cond_7
    #v0=(Integer);v1=(Integer);v19=(Integer);v20=(Integer);
    if-ltz p5, :cond_8

    move/from16 v0, p5

    if-lt v9, v0, :cond_8

    .line 1344
    move/from16 v15, v17

    .line 1306
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .end local v4           #childLp:Landroid/view/ViewGroup$LayoutParams;
    .end local v8           #heightMeasureSpec:I
    .end local v10           #newType:I
    :cond_9
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v8=(Conflicted);v10=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    move/from16 v15, v17

    .line 1350
    goto :goto_0
.end method

*/}
