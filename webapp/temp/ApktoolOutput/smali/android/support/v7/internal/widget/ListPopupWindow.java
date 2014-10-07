package android.support.v7.internal.widget; class ListPopupWindow {/*

.class public Landroid/support/v7/internal/widget/ListPopupWindow;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;,
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;,
        Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;,
        Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;,
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;,
        Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final EXPAND_LIST_TIMEOUT:I = 0xfa

.field public static final FILL_PARENT:I = -0x1

.field public static final INPUT_METHOD_FROM_FOCUSABLE:I = 0x0

.field public static final INPUT_METHOD_NEEDED:I = 0x1

.field public static final INPUT_METHOD_NOT_NEEDED:I = 0x2

.field public static final POSITION_PROMPT_ABOVE:I = 0x0

.field public static final POSITION_PROMPT_BELOW:I = 0x1

.field private static final TAG:Ljava/lang/String; = "ListPopupWindow"

.field public static final WRAP_CONTENT:I = -0x2


# instance fields
.field private mAdapter:Landroid/widget/ListAdapter;

.field private mContext:Landroid/content/Context;

.field private mDropDownAlwaysVisible:Z

.field private mDropDownAnchorView:Landroid/view/View;

.field private mDropDownHeight:I

.field private mDropDownHorizontalOffset:I

.field private mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

.field private mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

.field private mDropDownVerticalOffset:I

.field private mDropDownVerticalOffsetSet:Z

.field private mDropDownWidth:I

.field private mForceIgnoreOutsideTouch:Z

.field private mHandler:Landroid/os/Handler;

.field private final mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

.field private mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private mLayoutDirection:I

.field mListItemExpandMaximum:I

.field private mModal:Z

.field private mObserver:Landroid/database/DataSetObserver;

.field private mPopup:Landroid/widget/PopupWindow;

.field private mPromptPosition:I

.field private mPromptView:Landroid/view/View;

.field private final mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

.field private final mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

.field private mShowDropDownRunnable:Ljava/lang/Runnable;

.field private mTempRect:Landroid/graphics/Rect;

.field private final mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 167
    const/4 v0, 0x0

    #v0=(Null);
    sget v1, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I

    #v1=(Integer);
    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 168
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 178
    sget v0, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I

    #v0=(Integer);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 179
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyleAttr"

    .prologue
    const/4 v1, -0x2

    #v1=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    .line 189
    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    #p0=(Reference);
    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    .line 72
    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 77
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    .line 78
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    .line 79
    const v1, 0x7fffffff

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I

    .line 82
    iput v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    .line 93
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    .line 94
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    .line 95
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    .line 96
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    .line 99
    new-instance v1, Landroid/os/Handler;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    .line 101
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    .line 190
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    .line 191
    new-instance v1, Landroid/widget/PopupWindow;

    #v1=(UninitRef);
    invoke-direct {v1, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    .line 192
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 194
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 196
    .local v0, locale:Ljava/util/Locale;
    #v0=(Reference);
    return-void
.end method

.method static synthetic access$1000(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/os/Handler;
    .locals 1
    .parameter "x0"

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;
    .locals 1
    .parameter "x0"

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
    .locals 1
    .parameter "x0"

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    #v0=(Reference);
    return-object v0
.end method

.method private buildDropDown()I
    .locals 21

    .prologue
    .line 911
    const/16 v17, 0x0

    .line 913
    .local v17, otherHeights:I
    #v17=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v1=(Reference);
    if-nez v1, :cond_7

    .line 914
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    .line 922
    .local v8, context:Landroid/content/Context;
    #v8=(Reference);
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$1;

    #v1=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$1;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    #v1=(Reference);
    move-object/from16 v0, p0

    iput-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;

    .line 932
    new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v3=(UninitRef);
    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    #v1=(Boolean);
    if-nez v1, :cond_6

    const/4 v1, 0x1

    :goto_0
    invoke-direct {v3, v8, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;-><init>(Landroid/content/Context;Z)V

    #v3=(Reference);
    move-object/from16 v0, p0

    iput-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 933
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 934
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 936
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 937
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 938
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusable(Z)V

    .line 939
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusableInTouchMode(Z)V

    .line 940
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$2;

    #v3=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$2;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 956
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 958
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v1, :cond_1

    .line 959
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 962
    :cond_1
    move-object/from16 v0, p0

    iget-object v9, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 964
    .local v9, dropDownView:Landroid/view/ViewGroup;
    #v9=(Reference);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    .line 965
    .local v13, hintView:Landroid/view/View;
    #v13=(Reference);
    if-eqz v13, :cond_2

    .line 968
    new-instance v11, Landroid/widget/LinearLayout;

    #v11=(UninitRef);
    invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 969
    .local v11, hintContainer:Landroid/widget/LinearLayout;
    #v11=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v11, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 971
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    #v12=(UninitRef);
    const/4 v1, -0x1

    #v1=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    const/high16 v4, 0x3f80

    #v4=(Integer);
    invoke-direct {v12, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 975
    .local v12, hintParams:Landroid/widget/LinearLayout$LayoutParams;
    #v12=(Reference);
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 987
    const-string v1, "ListPopupWindow"

    #v1=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Invalid hint position "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 993
    :goto_1
    #v1=(Conflicted);
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v1=(Integer);
    const/high16 v3, -0x8000

    #v3=(Integer);
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 994
    .local v20, widthSpec:I
    #v20=(Integer);
    const/4 v10, 0x0

    .line 995
    .local v10, heightSpec:I
    #v10=(Null);
    move/from16 v0, v20

    #v0=(Integer);
    invoke-virtual {v13, v0, v10}, Landroid/view/View;->measure(II)V

    .line 997
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    .end local v12           #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 998
    .restart local v12       #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v3

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v17, v1, v3

    .line 1001
    #v17=(Integer);
    move-object v9, v11

    .line 1004
    .end local v10           #heightSpec:I
    .end local v11           #hintContainer:Landroid/widget/LinearLayout;
    .end local v12           #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    .end local v20           #widthSpec:I
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v20=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v1=(Reference);
    invoke-virtual {v1, v9}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 1018
    .end local v8           #context:Landroid/content/Context;
    .end local v13           #hintView:Landroid/view/View;
    :cond_3
    :goto_2
    #v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v19=(Conflicted);
    const/16 v18, 0x0

    .line 1019
    .local v18, padding:I
    #v18=(Null);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 1020
    .local v7, background:Landroid/graphics/drawable/Drawable;
    #v7=(Reference);
    if-eqz v7, :cond_8

    .line 1021
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v7, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1022
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    #v1=(Integer);
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v3=(Reference);
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    #v3=(Integer);
    add-int v18, v1, v3

    .line 1026
    #v18=(Integer);
    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    #v1=(Boolean);
    if-nez v1, :cond_4

    .line 1027
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v1=(Reference);
    iget v1, v1, Landroid/graphics/Rect;->top:I

    #v1=(Integer);
    neg-int v1, v1

    move-object/from16 v0, p0

    iput v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    .line 1034
    :cond_4
    :goto_3
    #v1=(Conflicted);v3=(Conflicted);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v1

    #v1=(Integer);
    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v1, v3, :cond_9

    const/4 v14, 0x1

    .line 1036
    .local v14, ignoreBottomDecorations:Z
    :goto_4
    #v14=(Boolean);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    move-object/from16 v0, p0

    iget v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    #v3=(Integer);
    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v3, v14}, Landroid/support/v7/internal/widget/ListPopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I

    move-result v16

    .line 1039
    .local v16, maxHeight:I
    #v16=(Integer);
    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    #v1=(Boolean);
    if-nez v1, :cond_5

    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v1=(Integer);
    const/4 v3, -0x1

    #v3=(Byte);
    if-ne v1, v3, :cond_a

    .line 1040
    :cond_5
    #v3=(Integer);
    add-int v1, v16, v18

    .line 1070
    :goto_5
    #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v15=(Conflicted);
    return v1

    .line 932
    .end local v7           #background:Landroid/graphics/drawable/Drawable;
    .end local v9           #dropDownView:Landroid/view/ViewGroup;
    .end local v14           #ignoreBottomDecorations:Z
    .end local v16           #maxHeight:I
    .end local v18           #padding:I
    .restart local v8       #context:Landroid/content/Context;
    :cond_6
    #v1=(Boolean);v2=(Uninit);v3=(UninitRef);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Null);v18=(Uninit);v19=(Uninit);v20=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    goto/16 :goto_0

    .line 977
    .restart local v9       #dropDownView:Landroid/view/ViewGroup;
    .restart local v11       #hintContainer:Landroid/widget/LinearLayout;
    .restart local v12       #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    .restart local v13       #hintView:Landroid/view/View;
    :pswitch_0
    #v1=(Integer);v3=(Null);v4=(Integer);v9=(Reference);v11=(Reference);v12=(Reference);v13=(Reference);
    invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 978
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    .line 982
    :pswitch_1
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 983
    invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_1

    .line 1006
    .end local v8           #context:Landroid/content/Context;
    .end local v9           #dropDownView:Landroid/view/ViewGroup;
    .end local v11           #hintContainer:Landroid/widget/LinearLayout;
    .end local v12           #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    .end local v13           #hintView:Landroid/view/View;
    :cond_7
    #v1=(Reference);v3=(Uninit);v4=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Landroid/view/ViewGroup;

    .line 1007
    .restart local v9       #dropDownView:Landroid/view/ViewGroup;
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    move-object/from16 v19, v0

    .line 1008
    .local v19, view:Landroid/view/View;
    #v19=(Reference);
    if-eqz v19, :cond_3

    .line 1009
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    #v12=(Reference);
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 1011
    .restart local v12       #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    #v1=(Integer);
    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    #v3=(Integer);
    add-int/2addr v1, v3

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v17, v1, v3

    #v17=(Integer);
    goto/16 :goto_2

    .line 1030
    .end local v12           #hintParams:Landroid/widget/LinearLayout$LayoutParams;
    .end local v19           #view:Landroid/view/View;
    .restart local v7       #background:Landroid/graphics/drawable/Drawable;
    .restart local v18       #padding:I
    :cond_8
    #v1=(Reference);v3=(Conflicted);v4=(Conflicted);v7=(Reference);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Null);v19=(Conflicted);v20=(Conflicted);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    goto :goto_3

    .line 1034
    :cond_9
    #v1=(Integer);v3=(PosByte);v18=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_4

    .line 1044
    .restart local v14       #ignoreBottomDecorations:Z
    .restart local v16       #maxHeight:I
    :cond_a
    #v3=(Byte);v14=(Boolean);v16=(Integer);
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    packed-switch v1, :pswitch_data_1

    .line 1058
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    const/high16 v3, 0x4000

    #v3=(Integer);
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1062
    .local v2, childWidthSpec:I
    :goto_6
    #v2=(Integer);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v1=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, -0x1

    #v4=(Byte);
    sub-int v5, v16, v17

    #v5=(Integer);
    const/4 v6, -0x1

    #v6=(Byte);
    invoke-virtual/range {v1 .. v6}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->measureHeightOfChildrenCompat(IIIII)I

    move-result v15

    .line 1066
    .local v15, listContent:I
    #v15=(Integer);
    if-lez v15, :cond_b

    .line 1067
    add-int v17, v17, v18

    .line 1070
    :cond_b
    add-int v1, v15, v17

    #v1=(Integer);
    goto :goto_5

    .line 1046
    .end local v2           #childWidthSpec:I
    .end local v15           #listContent:I
    :pswitch_2
    #v2=(Uninit);v3=(Byte);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v15=(Uninit);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    #v1=(Integer);
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v3=(Reference);
    iget v3, v3, Landroid/graphics/Rect;->left:I

    #v3=(Integer);
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v4=(Reference);
    iget v4, v4, Landroid/graphics/Rect;->right:I

    #v4=(Integer);
    add-int/2addr v3, v4

    sub-int/2addr v1, v3

    const/high16 v3, -0x8000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1050
    .restart local v2       #childWidthSpec:I
    #v2=(Integer);
    goto :goto_6

    .line 1052
    .end local v2           #childWidthSpec:I
    :pswitch_3
    #v2=(Uninit);v3=(Byte);v4=(Conflicted);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    #v1=(Integer);
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v3=(Reference);
    iget v3, v3, Landroid/graphics/Rect;->left:I

    #v3=(Integer);
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v4=(Reference);
    iget v4, v4, Landroid/graphics/Rect;->right:I

    #v4=(Integer);
    add-int/2addr v3, v4

    sub-int/2addr v1, v3

    const/high16 v3, 0x4000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1056
    .restart local v2       #childWidthSpec:I
    #v2=(Integer);
    goto :goto_6

    .line 975
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1044
    :pswitch_data_1
    .packed-switch -0x2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private removePromptView()V
    .locals 3

    .prologue
    .line 617
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 618
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 619
    .local v1, parent:Landroid/view/ViewParent;
    #v1=(Reference);
    instance-of v2, v1, Landroid/view/ViewGroup;

    #v2=(Boolean);
    if-eqz v2, :cond_0

    move-object v0, v1

    .line 620
    #v0=(Reference);
    check-cast v0, Landroid/view/ViewGroup;

    .line 621
    .local v0, group:Landroid/view/ViewGroup;
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 624
    .end local v0           #group:Landroid/view/ViewGroup;
    .end local v1           #parent:Landroid/view/ViewParent;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method


# virtual methods
.method public clearListSelection()V
    .locals 2

    .prologue
    .line 670
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 671
    .local v0, list:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 673
    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 675
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestLayout()V

    .line 677
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public dismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 600
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 601
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V

    .line 602
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 603
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 604
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 605
    return-void
.end method

.method public getAnchorView()Landroid/view/View;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public getAnimationStyle()I
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getAnimationStyle()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 453
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v0=(Integer);
    return v0
.end method

.method public getHorizontalOffset()I
    .locals 1

    .prologue
    .line 384
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    #v0=(Integer);
    return v0
.end method

.method public getInputMethodMode()I
    .locals 1

    .prologue
    .line 647
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    return-object v0
.end method

.method public getMaxAvailableHeight(Landroid/view/View;IZ)I
    .locals 11
    .parameter "anchor"
    .parameter "yOffset"
    .parameter "ignoreBottomDecorations"

    .prologue
    const/4 v10, 0x1

    .line 1089
    #v10=(One);
    new-instance v2, Landroid/graphics/Rect;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 1090
    .local v2, displayFrame:Landroid/graphics/Rect;
    #v2=(Reference);
    invoke-virtual {p1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1092
    const/4 v8, 0x2

    #v8=(PosByte);
    new-array v5, v8, [I

    .line 1093
    .local v5, mDrawingLocation:[I
    #v5=(Reference);
    move-object v0, v5

    .line 1094
    .local v0, anchorPos:[I
    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1096
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 1097
    .local v1, bottomEdge:I
    #v1=(Integer);
    if-eqz p3, :cond_0

    .line 1098
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 1099
    .local v6, res:Landroid/content/res/Resources;
    #v6=(Reference);
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v1, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1101
    .end local v6           #res:Landroid/content/res/Resources;
    :cond_0
    #v6=(Conflicted);v8=(Conflicted);
    aget v8, v0, v10

    #v8=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v9

    #v9=(Integer);
    add-int/2addr v8, v9

    sub-int v8, v1, v8

    sub-int v3, v8, p2

    .line 1102
    .local v3, distanceToBottom:I
    #v3=(Integer);
    aget v8, v0, v10

    iget v9, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    add-int v4, v8, p2

    .line 1105
    .local v4, distanceToTop:I
    #v4=(Integer);
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 1106
    .local v7, returnedHeight:I
    #v7=(Integer);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 1107
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v9=(Reference);
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1108
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    #v8=(Integer);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    #v9=(Integer);
    add-int/2addr v8, v9

    sub-int/2addr v7, v8

    .line 1111
    :cond_1
    #v8=(Conflicted);
    return v7
.end method

.method public getPromptPosition()I
    .locals 1

    .prologue
    .line 238
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    #v0=(Integer);
    return v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 718
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 719
    const/4 v0, 0x0

    .line 721
    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public getSelectedItemId()J
    .locals 2

    .prologue
    .line 742
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 743
    const-wide/high16 v0, -0x8000

    .line 745
    :goto_0
    #v0=(LongLo);v1=(LongHi);
    return-wide v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemId()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .prologue
    .line 730
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 731
    const/4 v0, -0x1

    .line 733
    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public getSelectedView()Landroid/view/View;
    .locals 1

    .prologue
    .line 754
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 755
    const/4 v0, 0x0

    .line 757
    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public getSoftInputMode()I
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getSoftInputMode()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getVerticalOffset()I
    .locals 1

    .prologue
    .line 400
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 401
    const/4 v0, 0x0

    .line 403
    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Boolean);
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    #v0=(Integer);
    goto :goto_0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 420
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v0=(Integer);
    return v0
.end method

.method public isDropDownAlwaysVisible()Z
    .locals 1

    .prologue
    .line 293
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    #v0=(Boolean);
    return v0
.end method

.method public isInputMethodNotNeeded()Z
    .locals 2

    .prologue
    .line 691
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isModal()Z
    .locals 1

    .prologue
    .line 260
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    #v0=(Boolean);
    return v0
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 683
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 13
    .parameter "keyCode"
    .parameter "event"

    .prologue
    const/16 v12, 0x14

    #v12=(PosByte);
    const/16 v11, 0x13

    #v11=(PosByte);
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v7, 0x1

    .line 789
    #v7=(One);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_8

    .line 795
    const/16 v9, 0x3e

    #v9=(PosByte);
    if-eq p1, v9, :cond_8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v9

    #v9=(Integer);
    if-gez v9, :cond_0

    const/16 v9, 0x42

    #v9=(PosByte);
    if-eq p1, v9, :cond_8

    const/16 v9, 0x17

    if-eq p1, v9, :cond_8

    .line 799
    :cond_0
    #v9=(Integer);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v4

    .line 802
    .local v4, curIndex:I
    #v4=(Integer);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v9}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v9

    #v9=(Boolean);
    if-nez v9, :cond_4

    move v2, v7

    .line 804
    .local v2, below:Z
    :goto_0
    #v2=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    .line 807
    .local v0, adapter:Landroid/widget/ListAdapter;
    #v0=(Reference);
    const v5, 0x7fffffff

    .line 808
    .local v5, firstItem:I
    #v5=(Integer);
    const/high16 v6, -0x8000

    .line 810
    .local v6, lastItem:I
    #v6=(Integer);
    if-eqz v0, :cond_1

    .line 811
    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v1

    .line 812
    .local v1, allEnabled:Z
    #v1=(Boolean);
    if-eqz v1, :cond_5

    move v5, v8

    .line 814
    :goto_1
    #v9=(Conflicted);
    if-eqz v1, :cond_6

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v9

    #v9=(Integer);
    add-int/lit8 v6, v9, -0x1

    .line 818
    .end local v1           #allEnabled:Z
    :cond_1
    :goto_2
    #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-eqz v2, :cond_2

    if-ne p1, v11, :cond_2

    if-le v4, v5, :cond_3

    :cond_2
    if-nez v2, :cond_7

    if-ne p1, v12, :cond_7

    if-lt v4, v6, :cond_7

    .line 822
    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V

    .line 823
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v8=(Reference);
    invoke-virtual {v8, v7}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 824
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 872
    .end local v0           #adapter:Landroid/widget/ListAdapter;
    .end local v2           #below:Z
    .end local v4           #curIndex:I
    .end local v5           #firstItem:I
    .end local v6           #lastItem:I
    :goto_3
    :sswitch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);
    return v7

    .restart local v4       #curIndex:I
    :cond_4
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(One);v8=(Null);v9=(Boolean);v10=(Uninit);
    move v2, v8

    .line 802
    #v2=(Null);
    goto :goto_0

    .line 812
    .restart local v0       #adapter:Landroid/widget/ListAdapter;
    .restart local v1       #allEnabled:Z
    .restart local v2       #below:Z
    .restart local v5       #firstItem:I
    .restart local v6       #lastItem:I
    :cond_5
    #v0=(Reference);v1=(Boolean);v2=(Boolean);v5=(Integer);v6=(Integer);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v9=(Reference);
    invoke-static {v9, v8, v7}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I

    move-result v5

    goto :goto_1

    .line 814
    :cond_6
    #v9=(Conflicted);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v9=(Reference);
    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v10

    #v10=(Integer);
    add-int/lit8 v10, v10, -0x1

    invoke-static {v9, v10, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I

    move-result v6

    goto :goto_2

    .line 829
    .end local v1           #allEnabled:Z
    :cond_7
    #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v9=(Reference);
    invoke-static {v9, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 832
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    .line 837
    .local v3, consumed:Z
    #v3=(Boolean);
    if-eqz v3, :cond_9

    .line 840
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    const/4 v10, 0x2

    #v10=(PosByte);
    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 845
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestFocusFromTouch()Z

    .line 846
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 848
    sparse-switch p1, :sswitch_data_0

    .end local v0           #adapter:Landroid/widget/ListAdapter;
    .end local v2           #below:Z
    .end local v3           #consumed:Z
    .end local v4           #curIndex:I
    .end local v5           #firstItem:I
    .end local v6           #lastItem:I
    :cond_8
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    move v7, v8

    .line 872
    #v7=(Null);
    goto :goto_3

    .line 858
    .restart local v0       #adapter:Landroid/widget/ListAdapter;
    .restart local v2       #below:Z
    .restart local v3       #consumed:Z
    .restart local v4       #curIndex:I
    .restart local v5       #firstItem:I
    .restart local v6       #lastItem:I
    :cond_9
    #v0=(Reference);v2=(Boolean);v3=(Boolean);v4=(Integer);v5=(Integer);v6=(Integer);v7=(One);v9=(Reference);
    if-eqz v2, :cond_a

    if-ne p1, v12, :cond_a

    .line 861
    if-ne v4, v6, :cond_8

    goto :goto_3

    .line 864
    :cond_a
    if-nez v2, :cond_8

    if-ne p1, v11, :cond_8

    if-ne v4, v5, :cond_8

    goto :goto_3

    .line 848
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_0
        0x14 -> :sswitch_0
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 885
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v1

    #v1=(Integer);
    if-ltz v1, :cond_1

    .line 886
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v1=(Reference);
    invoke-virtual {v1, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    .line 887
    .local v0, consumed:Z
    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 888
    sparse-switch p1, :sswitch_data_0

    .line 900
    .end local v0           #consumed:Z
    :cond_0
    :goto_0
    #v1=(Conflicted);
    return v0

    .line 894
    .restart local v0       #consumed:Z
    :sswitch_0
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V

    goto :goto_0

    .line 900
    .end local v0           #consumed:Z
    :cond_1
    #v0=(Uninit);v1=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 888
    :sswitch_data_0
    .sparse-switch
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method public performItemClick(I)Z
    .locals 7
    .parameter "position"

    .prologue
    .line 702
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 703
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 704
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 705
    .local v1, list:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getFirstVisiblePosition()I

    move-result v0

    #v0=(Integer);
    sub-int v0, p1, v0

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 706
    .local v2, child:Landroid/view/View;
    #v2=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v6

    .line 707
    .local v6, adapter:Landroid/widget/ListAdapter;
    #v6=(Reference);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    #v0=(Reference);
    invoke-interface {v6, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    move v3, p1

    #v3=(Integer);
    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 709
    .end local v1           #list:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .end local v2           #child:Landroid/view/View;
    .end local v6           #adapter:Landroid/widget/ListAdapter;
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const/4 v0, 0x1

    .line 711
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public postShow()V
    .locals 2

    .prologue
    .line 506
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 507
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2
    .parameter "adapter"

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    #v0=(Reference);
    if-nez v0, :cond_3

    .line 206
    new-instance v0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    .line 210
    :cond_0
    :goto_0
    #v1=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    .line 211
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 215
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    if-eqz v0, :cond_2

    .line 216
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 218
    :cond_2
    #v1=(Conflicted);
    return-void

    .line 207
    :cond_3
    #v1=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_0
.end method

.method public setAnchorView(Landroid/view/View;)V
    .locals 0
    .parameter "anchor"

    .prologue
    .line 377
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;

    .line 378
    return-void
.end method

.method public setAnimationStyle(I)V
    .locals 1
    .parameter "animationStyle"

    .prologue
    .line 349
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 350
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "d"

    .prologue
    .line 340
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 341
    return-void
.end method

.method public setContentWidth(I)V
    .locals 3
    .parameter "width"

    .prologue
    .line 440
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 441
    .local v0, popupBackground:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 442
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 443
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    #v2=(Reference);
    iget v2, v2, Landroid/graphics/Rect;->right:I

    #v2=(Integer);
    add-int/2addr v1, v2

    add-int/2addr v1, p1

    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 447
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 445
    :cond_0
    #v1=(Reference);v2=(Uninit);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setWidth(I)V

    goto :goto_0
.end method

.method public setDropDownAlwaysVisible(Z)V
    .locals 0
    .parameter "dropDownAlwaysVisible"

    .prologue
    .line 285
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    .line 286
    return-void
.end method

.method public setForceIgnoreOutsideTouch(Z)V
    .locals 0
    .parameter "forceIgnoreOutsideTouch"

    .prologue
    .line 271
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    .line 272
    return-void
.end method

.method public setHeight(I)V
    .locals 0
    .parameter "height"

    .prologue
    .line 462
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    .line 463
    return-void
.end method

.method public setHorizontalOffset(I)V
    .locals 0
    .parameter "offset"

    .prologue
    .line 393
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    .line 394
    return-void
.end method

.method public setInputMethodMode(I)V
    .locals 1
    .parameter "mode"

    .prologue
    .line 638
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 639
    return-void
.end method

.method setListItemExpandMax(I)V
    .locals 0
    .parameter "max"

    .prologue
    .line 775
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I

    .line 776
    return-void
.end method

.method public setListSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .parameter "selector"

    .prologue
    .line 324
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    .line 325
    return-void
.end method

.method public setModal(Z)V
    .locals 1
    .parameter "modal"

    .prologue
    .line 250
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    .line 251
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 252
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1
    .parameter "listener"

    .prologue
    .line 613
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 614
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0
    .parameter "clickListener"

    .prologue
    .line 472
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 473
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0
    .parameter "selectedListener"

    .prologue
    .line 482
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 483
    return-void
.end method

.method public setPromptPosition(I)V
    .locals 0
    .parameter "position"

    .prologue
    .line 229
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    .line 230
    return-void
.end method

.method public setPromptView(Landroid/view/View;)V
    .locals 1
    .parameter "prompt"

    .prologue
    .line 492
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    .line 493
    .local v0, showing:Z
    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 494
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V

    .line 496
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    .line 497
    if-eqz v0, :cond_1

    .line 498
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 500
    :cond_1
    return-void
.end method

.method public setSelection(I)V
    .locals 2
    .parameter "position"

    .prologue
    .line 656
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 657
    .local v0, list:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 658
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 659
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V

    .line 660
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChoiceMode()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_0

    .line 661
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setItemChecked(IZ)V

    .line 664
    :cond_0
    #v1=(Integer);
    return-void
.end method

.method public setSoftInputMode(I)V
    .locals 1
    .parameter "mode"

    .prologue
    .line 305
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 306
    return-void
.end method

.method public setVerticalOffset(I)V
    .locals 1
    .parameter "offset"

    .prologue
    .line 412
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    .line 413
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    .line 414
    return-void
.end method

.method public setWidth(I)V
    .locals 0
    .parameter "width"

    .prologue
    .line 430
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 431
    return-void
.end method

.method public show()V
    .locals 10

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v9, -0x2

    #v9=(Byte);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, -0x1

    .line 514
    #v0=(Byte);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->buildDropDown()I

    move-result v6

    .line 516
    .local v6, height:I
    #v6=(Integer);
    const/4 v4, 0x0

    .line 517
    .local v4, widthSpec:I
    #v4=(Null);
    const/4 v5, 0x0

    .line 519
    .local v5, heightSpec:I
    #v5=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isInputMethodNotNeeded()Z

    move-result v7

    .line 521
    .local v7, noInputMethod:Z
    #v7=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_a

    .line 522
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v2=(Integer);
    if-ne v2, v0, :cond_2

    .line 525
    const/4 v4, -0x1

    .line 532
    :goto_0
    #v2=(Conflicted);v4=(Integer);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v2=(Integer);
    if-ne v2, v0, :cond_8

    .line 535
    if-eqz v7, :cond_4

    move v5, v6

    .line 536
    :goto_1
    #v5=(Integer);
    if-eqz v7, :cond_6

    .line 537
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v8=(Integer);
    if-ne v8, v0, :cond_5

    :goto_2
    invoke-virtual {v2, v0, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 552
    :goto_3
    #v0=(Integer);v2=(Conflicted);v8=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v0=(Reference);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    if-nez v2, :cond_0

    move v1, v3

    :cond_0
    #v1=(Boolean);
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 554
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    #v3=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 594
    :cond_1
    :goto_4
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 526
    :cond_2
    #v0=(Byte);v1=(Null);v2=(Integer);v3=(One);v4=(Null);v5=(Null);v8=(Uninit);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v9, :cond_3

    .line 527
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    #v4=(Integer);
    goto :goto_0

    .line 529
    :cond_3
    #v2=(Integer);v4=(Null);
    iget v4, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v4=(Integer);
    goto :goto_0

    :cond_4
    move v5, v0

    .line 535
    #v5=(Byte);
    goto :goto_1

    :cond_5
    #v2=(Reference);v5=(Integer);v8=(Integer);
    move v0, v1

    .line 537
    #v0=(Null);
    goto :goto_2

    .line 541
    :cond_6
    #v0=(Byte);v2=(Integer);v8=(Uninit);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v8=(Reference);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v0, :cond_7

    move v2, v0

    :goto_5
    #v2=(Byte);
    invoke-virtual {v8, v2, v0}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    goto :goto_3

    :cond_7
    #v2=(Integer);
    move v2, v1

    #v2=(Null);
    goto :goto_5

    .line 546
    :cond_8
    #v2=(Integer);v5=(Null);v8=(Uninit);
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v0=(Integer);
    if-ne v0, v9, :cond_9

    .line 547
    move v5, v6

    #v5=(Integer);
    goto :goto_3

    .line 549
    :cond_9
    #v5=(Null);
    iget v5, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v5=(Integer);
    goto :goto_3

    .line 557
    :cond_a
    #v0=(Byte);v2=(Boolean);v4=(Null);v5=(Null);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v2=(Integer);
    if-ne v2, v0, :cond_d

    .line 558
    const/4 v4, -0x1

    .line 567
    :goto_6
    #v2=(Conflicted);v4=(Byte);v8=(Conflicted);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v2=(Integer);
    if-ne v2, v0, :cond_f

    .line 568
    const/4 v5, -0x1

    .line 577
    :goto_7
    #v2=(Conflicted);v5=(Byte);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    invoke-virtual {v2, v4, v5}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 581
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    #v8=(Boolean);
    if-nez v8, :cond_11

    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    if-nez v8, :cond_11

    :goto_8
    #v3=(Boolean);
    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 582
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 583
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v2

    iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    #v3=(Integer);
    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    #v8=(Integer);
    invoke-virtual {v1, v2, v3, v8}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 585
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V

    .line 587
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    #v0=(Boolean);
    if-eqz v0, :cond_b

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_c

    .line 588
    :cond_b
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V

    .line 590
    :cond_c
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    if-nez v0, :cond_1

    .line 591
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    .line 560
    :cond_d
    #v0=(Byte);v1=(Null);v2=(Integer);v3=(One);v4=(Null);v5=(Null);v8=(Uninit);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v9, :cond_e

    .line 561
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    goto :goto_6

    .line 563
    :cond_e
    #v2=(Integer);v8=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    #v8=(Integer);
    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    goto :goto_6

    .line 570
    :cond_f
    #v2=(Integer);v4=(Byte);v8=(Conflicted);
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    if-ne v2, v9, :cond_10

    .line 571
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_7

    .line 573
    :cond_10
    #v2=(Integer);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    #v2=(Reference);
    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    #v8=(Integer);
    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_7

    :cond_11
    #v5=(Byte);v8=(Boolean);
    move v3, v1

    .line 581
    #v3=(Null);
    goto :goto_8
.end method

*/}
