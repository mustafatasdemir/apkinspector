package android.support.v7.internal.widget; class ListPopupWindow$DropDownListView { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// .super Landroid/widget/ListView;
a=0;// .source "ListPopupWindow.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DropDownListView"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INVALID_POSITION:I = -0x1
a=0;// 
a=0;// .field static final NO_POSITION:I = -0x1
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ListPopupWindow.DropDownListView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mHijackFocus:Z
a=0;// 
a=0;// .field private mListSelectionHidden:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "hijackFocus"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1170
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Landroid/support/v7/appcompat/R$attr;->dropDownListViewStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 1171
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     iput-boolean p2, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z
a=0;// 
a=0;//     .line 1172
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setCacheColorHint(I)V
a=0;// 
a=0;//     .line 1173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1119
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1119
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private lookForSelectablePosition(IZ)I
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "lookDown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 1184
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1185
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1211
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1189
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Byte);v3=(Boolean);
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1190
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ListAdapter;);
a=0;//     invoke-interface {v3}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 1191
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 1192
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 1193
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     if-ge p1, v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 1194
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1197
a=0;//     :cond_2
a=0;//     add-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 1198
a=0;//     :goto_2
a=0;//     if-ltz p1, :cond_3
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 1199
a=0;//     add-int/lit8 p1, p1, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1203
a=0;//     :cond_3
a=0;//     #v3=(Integer);
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     if-ge p1, v1, :cond_0
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     .line 1206
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1208
a=0;//     :cond_4
a=0;//     #v2=(Byte);v3=(Boolean);
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     if-ge p1, v1, :cond_0
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     .line 1211
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasFocus()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1248
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z
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
a=0;// .method public hasWindowFocus()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1228
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z
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
a=0;// .method public isFocused()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1238
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z
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
a=0;// .method public isInTouchMode()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1218
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final measureHeightOfChildrenCompat(IIIII)I
a=0;//     .locals 21
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "startPosition"    # I
a=0;//     .param p3, "endPosition"    # I
a=0;//     .param p4, "maxHeight"    # I
a=0;//     .param p5, "disallowPartialChildPosition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1281
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingTop()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1282
a=0;//     .local v14, "paddingTop":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingBottom()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1283
a=0;//     .local v11, "paddingBottom":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingLeft()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1284
a=0;//     .local v12, "paddingLeft":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingRight()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1285
a=0;//     .local v13, "paddingRight":I
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDividerHeight()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1286
a=0;//     .local v16, "reportedDividerHeight":I
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDivider()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1288
a=0;//     .local v6, "divider":Landroid/graphics/drawable/Drawable;
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1290
a=0;//     .local v2, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v2=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1291
a=0;//     add-int v15, v14, v11
a=0;// 
a=0;//     .line 1350
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v15=(Integer);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     return v15
a=0;// 
a=0;//     .line 1295
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     add-int v17, v14, v11
a=0;// 
a=0;//     .line 1296
a=0;//     .local v17, "returnedHeight":I
a=0;//     #v17=(Integer);
a=0;//     if-lez v16, :cond_5
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     move/from16 v7, v16
a=0;// 
a=0;//     .line 1301
a=0;//     .local v7, "dividerHeight":I
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 1303
a=0;//     .local v15, "prevHeightWithoutPartialChild":I
a=0;//     #v15=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1304
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Null);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 1305
a=0;//     .local v18, "viewType":I
a=0;//     #v18=(Null);
a=0;//     invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1306
a=0;//     .local v5, "count":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Landroid/view/View;);v4=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);v15=(Integer);v18=(Integer);v19=(Conflicted);v20=(Conflicted);
a=0;//     if-ge v9, v5, :cond_9
a=0;// 
a=0;//     .line 1307
a=0;//     invoke-interface {v2, v9}, Landroid/widget/ListAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1308
a=0;//     .local v10, "newType":I
a=0;//     #v10=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v10, v0, :cond_2
a=0;// 
a=0;//     .line 1309
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1310
a=0;//     #v3=(Null);
a=0;//     move/from16 v18, v10
a=0;// 
a=0;//     .line 1312
a=0;//     :cond_2
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-interface {v2, v9, v3, v0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1316
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1317
a=0;//     .local v4, "childLp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-lez v19, :cond_6
a=0;// 
a=0;//     .line 1318
a=0;//     iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     const/high16 v20, 0x40000000
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1323
a=0;//     .local v8, "heightMeasureSpec":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v8=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1325
a=0;//     if-lez v9, :cond_3
a=0;// 
a=0;//     .line 1327
a=0;//     add-int v17, v17, v7
a=0;// 
a=0;//     .line 1330
a=0;//     :cond_3
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     add-int v17, v17, v19
a=0;// 
a=0;//     .line 1332
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, p4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_7
a=0;// 
a=0;//     .line 1335
a=0;//     if-ltz p5, :cond_4
a=0;// 
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     if-le v9, v0, :cond_4
a=0;// 
a=0;//     if-lez v15, :cond_4
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, p4
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     :cond_4
a=0;//     move/from16 v15, p4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1296
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v5    # "count":I
a=0;//     .end local v7    # "dividerHeight":I
a=0;//     .end local v8    # "heightMeasureSpec":I
a=0;//     .end local v9    # "i":I
a=0;//     .end local v10    # "newType":I
a=0;//     .end local v15    # "prevHeightWithoutPartialChild":I
a=0;//     .end local v18    # "viewType":I
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v15=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1321
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     .restart local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v5    # "count":I
a=0;//     .restart local v7    # "dividerHeight":I
a=0;//     .restart local v9    # "i":I
a=0;//     .restart local v10    # "newType":I
a=0;//     .restart local v15    # "prevHeightWithoutPartialChild":I
a=0;//     .restart local v18    # "viewType":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Landroid/view/View;);v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);v5=(Integer);v7=(Integer);v8=(Conflicted);v9=(Integer);v10=(Integer);v15=(Integer);v18=(Integer);v19=(Conflicted);v20=(Conflicted);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "heightMeasureSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1343
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Integer);v19=(Integer);v20=(Integer);
a=0;//     if-ltz p5, :cond_8
a=0;// 
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     if-lt v9, v0, :cond_8
a=0;// 
a=0;//     .line 1344
a=0;//     move/from16 v15, v17
a=0;// 
a=0;//     .line 1306
a=0;//     :cond_8
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v8    # "heightMeasureSpec":I
a=0;//     .end local v10    # "newType":I
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v8=(Conflicted);v10=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     move/from16 v15, v17
a=0;// 
a=0;//     .line 1350
a=0;//     goto :goto_0
a=0;// .end method
}}
