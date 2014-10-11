package android.support.v7.internal.widget; class ListPopupWindow { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ListPopupWindow.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;,
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;,
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;,
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;,
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;,
a=0;//         Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final EXPAND_LIST_TIMEOUT:I = 0xfa
a=0;// 
a=0;// .field public static final FILL_PARENT:I = -0x1
a=0;// 
a=0;// .field public static final INPUT_METHOD_FROM_FOCUSABLE:I = 0x0
a=0;// 
a=0;// .field public static final INPUT_METHOD_NEEDED:I = 0x1
a=0;// 
a=0;// .field public static final INPUT_METHOD_NOT_NEEDED:I = 0x2
a=0;// 
a=0;// .field public static final POSITION_PROMPT_ABOVE:I = 0x0
a=0;// 
a=0;// .field public static final POSITION_PROMPT_BELOW:I = 0x1
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ListPopupWindow"
a=0;// 
a=0;// .field public static final WRAP_CONTENT:I = -0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDropDownAlwaysVisible:Z
a=0;// 
a=0;// .field private mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;// .field private mDropDownHeight:I
a=0;// 
a=0;// .field private mDropDownHorizontalOffset:I
a=0;// 
a=0;// .field private mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;// .field private mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mDropDownVerticalOffset:I
a=0;// 
a=0;// .field private mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;// .field private mDropDownWidth:I
a=0;// 
a=0;// .field private mForceIgnoreOutsideTouch:Z
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;
a=0;// 
a=0;// .field private mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field private mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;// .field private mLayoutDirection:I
a=0;// 
a=0;// .field mListItemExpandMaximum:I
a=0;// 
a=0;// .field private mModal:Z
a=0;// 
a=0;// .field private mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field private mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;// .field private mPromptPosition:I
a=0;// 
a=0;// .field private mPromptView:Landroid/view/View;
a=0;// 
a=0;// .field private final mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;// .field private final mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
a=0;// 
a=0;// .field private mShowDropDownRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 168
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     sget v0, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 179
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyleAttr"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     .line 72
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 77
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     .line 78
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z
a=0;// 
a=0;//     .line 79
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     .line 82
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v1}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 190
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 191
a=0;//     new-instance v1, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     invoke-direct {v1, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "locale":Ljava/util/Locale;
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private buildDropDown()I
a=0;//     .locals 21
a=0;// 
a=0;//     .prologue
a=0;//     .line 911
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 913
a=0;//     .local v17, "otherHeights":I
a=0;//     #v17=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 914
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 922
a=0;//     .local v8, "context":Landroid/content/Context;
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$1;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 932
a=0;//     new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-direct {v3, v8, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;-><init>(Landroid/content/Context;Z)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 933
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 934
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelector(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 936
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 937
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 938
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 939
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 940
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$2;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$2;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$2;);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 956
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 958
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 959
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 962
a=0;//     :cond_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 964
a=0;//     .local v9, "dropDownView":Landroid/view/ViewGroup;
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     .line 965
a=0;//     .local v13, "hintView":Landroid/view/View;
a=0;//     #v13=(Reference,Landroid/view/View;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 968
a=0;//     new-instance v11, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 969
a=0;//     .local v11, "hintContainer":Landroid/widget/LinearLayout;
a=0;//     #v11=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v11, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 971
a=0;//     new-instance v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v12, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 975
a=0;//     .local v12, "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 987
a=0;//     const-string v1, "ListPopupWindow"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Invalid hint position "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 993
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v3, -0x80000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 994
a=0;//     .local v20, "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 995
a=0;//     .local v10, "heightSpec":I
a=0;//     #v10=(Null);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v13, v0, v10}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 997
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     check-cast v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 998
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int v17, v1, v3
a=0;// 
a=0;//     .line 1001
a=0;//     #v17=(Integer);
a=0;//     move-object v9, v11
a=0;// 
a=0;//     .line 1004
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v20=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1, v9}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1018
a=0;//     .end local v8    # "context":Landroid/content/Context;
a=0;//     .end local v13    # "hintView":Landroid/view/View;
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v19=(Conflicted);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 1019
a=0;//     .local v18, "padding":I
a=0;//     #v18=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1020
a=0;//     .local v7, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 1021
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1022
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v18, v1, v3
a=0;// 
a=0;//     .line 1026
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 1027
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_9
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     .line 1036
a=0;//     .local v14, "ignoreBottomDecorations":Z
a=0;//     :goto_4
a=0;//     #v14=(Boolean);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3, v14}, Landroid/support/v7/internal/widget/ListPopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1039
a=0;//     .local v16, "maxHeight":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v1, v3, :cond_a
a=0;// 
a=0;//     .line 1040
a=0;//     :cond_5
a=0;//     #v3=(Integer);
a=0;//     add-int v1, v16, v18
a=0;// 
a=0;//     .line 1070
a=0;//     :goto_5
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v15=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 932
a=0;//     .end local v7    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .end local v14    # "ignoreBottomDecorations":Z
a=0;//     .end local v16    # "maxHeight":I
a=0;//     .end local v18    # "padding":I
a=0;//     .restart local v8    # "context":Landroid/content/Context;
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Landroid/content/Context;);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Null);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 977
a=0;//     .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .restart local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .restart local v13    # "hintView":Landroid/view/View;
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v3=(Null);v4=(Integer);v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);v11=(Reference,Landroid/widget/LinearLayout;);v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v13=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 978
a=0;//     invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 982
a=0;//     :pswitch_1
a=0;//     invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 983
a=0;//     invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1006
a=0;//     .end local v8    # "context":Landroid/content/Context;
a=0;//     .end local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v13    # "hintView":Landroid/view/View;
a=0;//     :cond_7
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);v3=(Uninit);v4=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1007
a=0;//     .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     .line 1008
a=0;//     .local v19, "view":Landroid/view/View;
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     if-eqz v19, :cond_3
a=0;// 
a=0;//     .line 1009
a=0;//     invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 1011
a=0;//     .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     add-int v17, v1, v3
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1030
a=0;//     .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .end local v19    # "view":Landroid/view/View;
a=0;//     .restart local v7    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v18    # "padding":I
a=0;//     :cond_8
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);v3=(Conflicted);v4=(Conflicted);v7=(Reference,Landroid/graphics/drawable/Drawable;);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Null);v19=(Conflicted);v20=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_9
a=0;//     #v1=(Integer);v3=(PosByte);v18=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1044
a=0;//     .restart local v14    # "ignoreBottomDecorations":Z
a=0;//     .restart local v16    # "maxHeight":I
a=0;//     :cond_a
a=0;//     #v3=(Byte);v14=(Boolean);v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_1
a=0;// 
a=0;//     .line 1058
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1062
a=0;//     .local v2, "childWidthSpec":I
a=0;//     :goto_6
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     sub-int v5, v16, v17
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->measureHeightOfChildrenCompat(IIIII)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1066
a=0;//     .local v15, "listContent":I
a=0;//     #v15=(Integer);
a=0;//     if-lez v15, :cond_b
a=0;// 
a=0;//     .line 1067
a=0;//     add-int v17, v17, v18
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_b
a=0;//     add-int v1, v15, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1046
a=0;//     .end local v2    # "childWidthSpec":I
a=0;//     .end local v15    # "listContent":I
a=0;//     :pswitch_2
a=0;//     #v2=(Uninit);v3=(Byte);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v4, v4, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     const/high16 v3, -0x80000000
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1050
a=0;//     .restart local v2    # "childWidthSpec":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1052
a=0;//     .end local v2    # "childWidthSpec":I
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);v3=(Byte);v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v3, v3, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v4, v4, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     sub-int/2addr v1, v3
a=0;// 
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1056
a=0;//     .restart local v2    # "childWidthSpec":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 975
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1044
a=0;//     :pswitch_data_1
a=0;//     .packed-switch -0x2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private removePromptView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 617
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 618
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 619
a=0;//     .local v1, "parent":Landroid/view/ViewParent;
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     instance-of v2, v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 620
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 621
a=0;//     .local v0, "group":Landroid/view/ViewGroup;
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 624
a=0;//     .end local v0    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v1    # "parent":Landroid/view/ViewParent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearListSelection()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 671
a=0;//     .local v0, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 673
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
a=0;// 
a=0;//     .line 675
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestLayout()V
a=0;// 
a=0;//     .line 677
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 600
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 601
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 603
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 604
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 605
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAnchorView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationStyle()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getAnimationStyle()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBackground()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHorizontalOffset()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getInputMethodMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 647
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getListView()Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaxAvailableHeight(Landroid/view/View;IZ)I
a=0;//     .locals 11
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;//     .param p2, "yOffset"    # I
a=0;//     .param p3, "ignoreBottomDecorations"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 1089
a=0;//     #v10=(One);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 1090
a=0;//     .local v2, "displayFrame":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1092
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v5, v8, [I
a=0;// 
a=0;//     .line 1093
a=0;//     .local v5, "mDrawingLocation":[I
a=0;//     #v5=(Reference,[I);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 1094
a=0;//     .local v0, "anchorPos":[I
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 1096
a=0;//     iget v1, v2, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 1097
a=0;//     .local v1, "bottomEdge":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 1098
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1099
a=0;//     .local v6, "res":Landroid/content/res/Resources;
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v1, v8, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     .line 1101
a=0;//     .end local v6    # "res":Landroid/content/res/Resources;
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     aget v8, v0, v10
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     sub-int v8, v1, v8
a=0;// 
a=0;//     sub-int v3, v8, p2
a=0;// 
a=0;//     .line 1102
a=0;//     .local v3, "distanceToBottom":I
a=0;//     #v3=(Integer);
a=0;//     aget v8, v0, v10
a=0;// 
a=0;//     iget v9, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     sub-int/2addr v8, v9
a=0;// 
a=0;//     add-int v4, v8, p2
a=0;// 
a=0;//     .line 1105
a=0;//     .local v4, "distanceToTop":I
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1106
a=0;//     .local v7, "returnedHeight":I
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 1107
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v8, v9}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1108
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v8, v8, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v9, v9, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v8, v9
a=0;// 
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     .line 1111
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     return v7
a=0;// .end method
a=0;// 
a=0;// .method public getPromptPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItem()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 718
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 719
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 721
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItem()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemId()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 743
a=0;//     const-wide/high16 v0, -0x8000000000000000L
a=0;// 
a=0;//     .line 745
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 730
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 731
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 733
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 755
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 757
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSoftInputMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getSoftInputMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getVerticalOffset()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 401
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 403
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isDropDownAlwaysVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isInputMethodNotNeeded()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 691
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isModal()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 683
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 13
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v12, 0x14
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/16 v11, 0x13
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 789
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_8
a=0;// 
a=0;//     .line 795
a=0;//     const/16 v9, 0x3e
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq p1, v9, :cond_8
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gez v9, :cond_0
a=0;// 
a=0;//     const/16 v9, 0x42
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq p1, v9, :cond_8
a=0;// 
a=0;//     const/16 v9, 0x17
a=0;// 
a=0;//     if-eq p1, v9, :cond_8
a=0;// 
a=0;//     .line 799
a=0;//     :cond_0
a=0;//     #v9=(Integer);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 802
a=0;//     .local v4, "curIndex":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/widget/PopupWindow;->isAboveAnchor()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 804
a=0;//     .local v2, "below":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 807
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     const v5, 0x7fffffff
a=0;// 
a=0;//     .line 808
a=0;//     .local v5, "firstItem":I
a=0;//     #v5=(Integer);
a=0;//     const/high16 v6, -0x80000000
a=0;// 
a=0;//     .line 810
a=0;//     .local v6, "lastItem":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 811
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 812
a=0;//     .local v1, "allEnabled":Z
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     move v5, v8
a=0;// 
a=0;//     .line 814
a=0;//     :goto_1
a=0;//     #v9=(Conflicted);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/lit8 v6, v9, -0x1
a=0;// 
a=0;//     .line 818
a=0;//     .end local v1    # "allEnabled":Z
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     if-ne p1, v11, :cond_2
a=0;// 
a=0;//     if-le v4, v5, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     if-ne p1, v12, :cond_7
a=0;// 
a=0;//     if-lt v4, v6, :cond_7
a=0;// 
a=0;//     .line 822
a=0;//     :cond_3
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v8, v7}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 824
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 872
a=0;//     .end local v0    # "adapter":Landroid/widget/ListAdapter;
a=0;//     .end local v2    # "below":Z
a=0;//     .end local v4    # "curIndex":I
a=0;//     .end local v5    # "firstItem":I
a=0;//     .end local v6    # "lastItem":I
a=0;//     :goto_3
a=0;//     :sswitch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Boolean);
a=0;//     return v7
a=0;// 
a=0;//     .restart local v4    # "curIndex":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(One);v8=(Null);v9=(Boolean);v10=(Uninit);
a=0;//     move v2, v8
a=0;// 
a=0;//     .line 802
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 812
a=0;//     .restart local v0    # "adapter":Landroid/widget/ListAdapter;
a=0;//     .restart local v1    # "allEnabled":Z
a=0;//     .restart local v2    # "below":Z
a=0;//     .restart local v5    # "firstItem":I
a=0;//     .restart local v6    # "lastItem":I
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);v1=(Boolean);v2=(Boolean);v5=(Integer);v6=(Integer);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-static {v9, v8, v7}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 814
a=0;//     :cond_6
a=0;//     #v9=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     invoke-static {v9, v10, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 829
a=0;//     .end local v1    # "allEnabled":Z
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-static {v9, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v9, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 837
a=0;//     .local v3, "consumed":Z
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 840
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 845
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestFocusFromTouch()Z
a=0;// 
a=0;//     .line 846
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 848
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .end local v0    # "adapter":Landroid/widget/ListAdapter;
a=0;//     .end local v2    # "below":Z
a=0;//     .end local v3    # "consumed":Z
a=0;//     .end local v4    # "curIndex":I
a=0;//     .end local v5    # "firstItem":I
a=0;//     .end local v6    # "lastItem":I
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 872
a=0;//     #v7=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 858
a=0;//     .restart local v0    # "adapter":Landroid/widget/ListAdapter;
a=0;//     .restart local v2    # "below":Z
a=0;//     .restart local v3    # "consumed":Z
a=0;//     .restart local v4    # "curIndex":I
a=0;//     .restart local v5    # "firstItem":I
a=0;//     .restart local v6    # "lastItem":I
a=0;//     :cond_9
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);v2=(Boolean);v3=(Boolean);v4=(Integer);v5=(Integer);v6=(Integer);v7=(One);v9=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     if-ne p1, v12, :cond_a
a=0;// 
a=0;//     .line 861
a=0;//     if-ne v4, v6, :cond_8
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 864
a=0;//     :cond_a
a=0;//     if-nez v2, :cond_8
a=0;// 
a=0;//     if-ne p1, v11, :cond_8
a=0;// 
a=0;//     if-ne v4, v5, :cond_8
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 848
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x13 -> :sswitch_0
a=0;//         0x14 -> :sswitch_0
a=0;//         0x17 -> :sswitch_0
a=0;//         0x42 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 886
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 887
a=0;//     .local v0, "consumed":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 888
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 900
a=0;//     .end local v0    # "consumed":Z
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 894
a=0;//     .restart local v0    # "consumed":Z
a=0;//     :sswitch_0
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 900
a=0;//     .end local v0    # "consumed":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 888
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x17 -> :sswitch_0
a=0;//         0x42 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public performItemClick(I)Z
a=0;//     .locals 7
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 702
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 703
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 704
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 705
a=0;//     .local v1, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 706
a=0;//     .local v2, "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 707
a=0;//     .local v6, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v6=(Reference,Landroid/widget/ListAdapter;);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     invoke-interface {v6, p1}, Landroid/widget/ListAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;// 
a=0;//     .line 709
a=0;//     .end local v1    # "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     .end local v2    # "child":Landroid/view/View;
a=0;//     .end local v6    # "adapter":Landroid/widget/ListAdapter;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 711
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public postShow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 507
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObserver;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 212
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ListAdapter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/DataSetObserver;);
a=0;//     invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAnchorView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 378
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationStyle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "animationStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 340
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentWidth(I)V
a=0;//     .locals 3
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 441
a=0;//     .local v0, "popupBackground":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v1, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 447
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 445
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);v2=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDropDownAlwaysVisible(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "dropDownAlwaysVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setForceIgnoreOutsideTouch(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "forceIgnoreOutsideTouch"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     .line 463
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHorizontalOffset(I)V
a=0;//     .locals 0
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     .line 394
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInputMethodMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 639
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setListItemExpandMax(I)V
a=0;//     .locals 0
a=0;//     .param p1, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 775
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     .line 776
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListSelector(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "selector"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setModal(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "modal"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 614
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "clickListener"    # Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 473
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "selectedListener"    # Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     .line 483
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptPosition(I)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "prompt"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 493
a=0;//     .local v0, "showing":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 494
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V
a=0;// 
a=0;//     .line 496
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;
a=0;// 
a=0;//     .line 497
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 498
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 500
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelection(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     .line 657
a=0;//     .local v0, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
a=0;// 
a=0;//     .line 659
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V
a=0;// 
a=0;//     .line 660
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChoiceMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 661
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setItemChecked(IZ)V
a=0;// 
a=0;//     .line 664
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSoftInputMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVerticalOffset(I)V
a=0;//     .locals 1
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     .line 413
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z
a=0;// 
a=0;//     .line 414
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWidth(I)V
a=0;//     .locals 0
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     .line 431
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v9, -0x2
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 514
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->buildDropDown()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 516
a=0;//     .local v6, "height":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 517
a=0;//     .local v4, "widthSpec":I
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 519
a=0;//     .local v5, "heightSpec":I
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isInputMethodNotNeeded()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 521
a=0;//     .local v7, "noInputMethod":Z
a=0;//     #v7=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     .line 522
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_2
a=0;// 
a=0;//     .line 525
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 532
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_8
a=0;// 
a=0;//     .line 535
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 536
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 537
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v8, v0, :cond_5
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     .line 552
a=0;//     :goto_3
a=0;//     #v0=(Integer);v2=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
a=0;// 
a=0;//     .line 554
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 594
a=0;//     :cond_1
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 526
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Null);v2=(Integer);v3=(One);v4=(Null);v5=(Null);v8=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     if-ne v2, v9, :cond_3
a=0;// 
a=0;//     .line 527
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 529
a=0;//     :cond_3
a=0;//     #v2=(Integer);v4=(Null);
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     move v5, v0
a=0;// 
a=0;//     .line 535
a=0;//     #v5=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);v5=(Integer);v8=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 537
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 541
a=0;//     :cond_6
a=0;//     #v0=(Byte);v2=(Integer);v8=(Uninit);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     if-ne v2, v0, :cond_7
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v8, v2, v0}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 546
a=0;//     :cond_8
a=0;//     #v2=(Integer);v5=(Null);v8=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v9, :cond_9
a=0;// 
a=0;//     .line 547
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 549
a=0;//     :cond_9
a=0;//     #v5=(Null);
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 557
a=0;//     :cond_a
a=0;//     #v0=(Byte);v2=(Boolean);v4=(Null);v5=(Null);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_d
a=0;// 
a=0;//     .line 558
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 567
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v4=(Byte);v8=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_f
a=0;// 
a=0;//     .line 568
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 577
a=0;//     :goto_7
a=0;//     #v2=(Conflicted);v5=(Byte);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V
a=0;// 
a=0;//     .line 581
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_11
a=0;// 
a=0;//     iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z
a=0;// 
a=0;//     if-nez v8, :cond_11
a=0;// 
a=0;//     :goto_8
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 583
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v8}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V
a=0;// 
a=0;//     .line 587
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 588
a=0;//     :cond_b
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V
a=0;// 
a=0;//     .line 590
a=0;//     :cond_c
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 591
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 560
a=0;//     :cond_d
a=0;//     #v0=(Byte);v1=(Null);v2=(Integer);v3=(One);v4=(Null);v5=(Null);v8=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     if-ne v2, v9, :cond_e
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 563
a=0;//     :cond_e
a=0;//     #v2=(Integer);v8=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 570
a=0;//     :cond_f
a=0;//     #v2=(Integer);v4=(Byte);v8=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     if-ne v2, v9, :cond_10
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setHeight(I)V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 573
a=0;//     :cond_10
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/PopupWindow;);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setHeight(I)V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_11
a=0;//     #v5=(Byte);v8=(Boolean);
a=0;//     move v3, v1
a=0;// 
a=0;//     .line 581
a=0;//     #v3=(Null);
a=0;//     goto :goto_8
a=0;// .end method
}}
