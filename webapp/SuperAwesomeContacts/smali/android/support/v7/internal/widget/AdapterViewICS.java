package android.support.v7.internal.widget; class AdapterViewICS { void a() { int a;
a=0;// .class abstract Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "AdapterViewICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$1;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$AdapterContextMenuInfo;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;,
a=0;//         Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T::",
a=0;//         "Landroid/widget/Adapter;",
a=0;//         ">",
a=0;//         "Landroid/view/ViewGroup;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INVALID_POSITION:I = -0x1
a=0;// 
a=0;// .field public static final INVALID_ROW_ID:J = -0x8000000000000000L
a=0;// 
a=0;// .field static final ITEM_VIEW_TYPE_HEADER_OR_FOOTER:I = -0x2
a=0;// 
a=0;// .field static final ITEM_VIEW_TYPE_IGNORE:I = -0x1
a=0;// 
a=0;// .field static final SYNC_FIRST_POSITION:I = 0x1
a=0;// 
a=0;// .field static final SYNC_MAX_DURATION_MILLIS:I = 0x64
a=0;// 
a=0;// .field static final SYNC_SELECTED_POSITION:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mBlockLayoutRequests:Z
a=0;// 
a=0;// .field mDataChanged:Z
a=0;// 
a=0;// .field private mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;// .field private mDesiredFocusableState:Z
a=0;// 
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field mFirstPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "scrolling"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mInLayout:Z
a=0;// 
a=0;// .field mItemCount:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mLayoutHeight:I
a=0;// 
a=0;// .field mNeedSync:Z
a=0;// 
a=0;// .field mNextSelectedPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mNextSelectedRowId:J
a=0;// 
a=0;// .field mOldItemCount:I
a=0;// 
a=0;// .field mOldSelectedPosition:I
a=0;// 
a=0;// .field mOldSelectedRowId:J
a=0;// 
a=0;// .field mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;// .field mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
a=0;// 
a=0;// .field mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;// .field mSelectedPosition:I
a=0;//     .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
a=0;//         category = "list"
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mSelectedRowId:J
a=0;// 
a=0;// .field private mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v7/internal/widget/AdapterViewICS",
a=0;//             "<TT;>.SelectionNotifier;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mSpecificTop:I
a=0;// 
a=0;// .field mSyncHeight:J
a=0;// 
a=0;// .field mSyncMode:I
a=0;// 
a=0;// .field mSyncPosition:I
a=0;// 
a=0;// .field mSyncRowId:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z
a=0;// 
a=0;//     .line 152
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 163
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 232
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z
a=0;// 
a=0;//     .line 152
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 163
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 236
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     .line 84
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 94
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z
a=0;// 
a=0;//     .line 152
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 158
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 163
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 169
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 201
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 206
a=0;//     iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 225
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     .line 237
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;//     .param p1, "x1"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/widget/AdapterViewICS;)Landroid/os/Parcelable;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private fireOnSelected()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 891
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 902
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 894
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 895
a=0;//     .local v3, "selection":I
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_1
a=0;// 
a=0;//     .line 896
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 897
a=0;//     .local v2, "v":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Adapter;);
a=0;//     invoke-interface {v1, v3}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onItemSelected(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 900
a=0;//     .end local v2    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onNothingSelected(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateEmptyStatus(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "empty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 733
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 734
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 738
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 740
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 749
a=0;//     :goto_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 750
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 756
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 743
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 753
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 754
a=0;//     :cond_4
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, int) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, int, LayoutParams) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "addView(View, LayoutParams) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected canAnimate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 916
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->canAnimate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
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
a=0;// .method checkFocus()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 714
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 715
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 716
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 720
a=0;//     .local v2, "focusable":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 721
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z
a=0;// 
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V
a=0;// 
a=0;//     .line 722
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 723
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     move v5, v4
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V
a=0;// 
a=0;//     .line 725
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     .end local v2    # "focusable":Z
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Integer);v5=(Null);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 715
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v3=(Boolean);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 716
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v2    # "focusable":Z
a=0;//     :cond_7
a=0;//     #v2=(Boolean);v3=(Conflicted);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 720
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Boolean);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 721
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method checkSelectionChanged()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 984
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->selectionChanged()V
a=0;// 
a=0;//     .line 985
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I
a=0;// 
a=0;//     .line 986
a=0;//     iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J
a=0;// 
a=0;//     .line 988
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 906
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 907
a=0;//     .local v0, "selectedView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 909
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 911
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 793
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 794
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 785
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 786
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method findSyncPosition()I
a=0;//     .locals 19
a=0;// 
a=0;//     .prologue
a=0;//     .line 999
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     .line 1001
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1002
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     .line 1074
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return v14
a=0;// 
a=0;//     .line 1005
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v8, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 1006
a=0;//     .local v8, "idToMatch":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v14, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I
a=0;// 
a=0;//     .line 1009
a=0;//     .local v14, "seed":I
a=0;//     #v14=(Integer);
a=0;//     const-wide/high16 v15, -0x8000000000000000L
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     cmp-long v15, v8, v15
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-nez v15, :cond_2
a=0;// 
a=0;//     .line 1010
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1014
a=0;//     :cond_2
a=0;//     #v14=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1015
a=0;//     add-int/lit8 v15, v2, -0x1
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1017
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     const-wide/16 v17, 0x64
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     add-long v3, v15, v17
a=0;// 
a=0;//     .line 1022
a=0;//     .local v3, "endTime":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move v5, v14
a=0;// 
a=0;//     .line 1025
a=0;//     .local v5, "first":I
a=0;//     #v5=(Integer);
a=0;//     move v10, v14
a=0;// 
a=0;//     .line 1028
a=0;//     .local v10, "last":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1038
a=0;//     .local v11, "next":Z
a=0;//     #v11=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1039
a=0;//     .local v1, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v1=(Reference,Landroid/widget/Adapter;);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 1040
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1058
a=0;//     .local v6, "hitFirst":Z
a=0;//     .local v7, "hitLast":Z
a=0;//     .local v12, "rowId":J
a=0;//     :cond_3
a=0;//     #v6=(Boolean);v7=(Boolean);v11=(Boolean);v12=(LongLo);v13=(LongHi);v14=(Integer);v15=(Integer);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     if-eqz v11, :cond_9
a=0;// 
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 1060
a=0;//     :cond_4
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     .line 1061
a=0;//     move v14, v10
a=0;// 
a=0;//     .line 1063
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1043
a=0;//     .end local v6    # "hitFirst":Z
a=0;//     .end local v7    # "hitLast":Z
a=0;//     .end local v12    # "rowId":J
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);
a=0;//     cmp-long v15, v15, v3
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     if-gtz v15, :cond_6
a=0;// 
a=0;//     .line 1044
a=0;//     invoke-interface {v1, v14}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     .line 1045
a=0;//     .restart local v12    # "rowId":J
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v15, v12, v8
a=0;// 
a=0;//     if-eqz v15, :cond_0
a=0;// 
a=0;//     .line 1050
a=0;//     add-int/lit8 v15, v2, -0x1
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-ne v10, v15, :cond_7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1051
a=0;//     .restart local v7    # "hitLast":Z
a=0;//     :goto_2
a=0;//     #v7=(Boolean);
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 1053
a=0;//     .restart local v6    # "hitFirst":Z
a=0;//     :goto_3
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 1074
a=0;//     .end local v6    # "hitFirst":Z
a=0;//     .end local v7    # "hitLast":Z
a=0;//     .end local v12    # "rowId":J
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1050
a=0;//     .restart local v12    # "rowId":J
a=0;//     :cond_7
a=0;//     #v12=(LongLo);v13=(LongHi);v14=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1051
a=0;//     .restart local v7    # "hitLast":Z
a=0;//     :cond_8
a=0;//     #v7=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1064
a=0;//     .restart local v6    # "hitFirst":Z
a=0;//     :cond_9
a=0;//     #v6=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_a
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1067
a=0;//     move v14, v5
a=0;// 
a=0;//     .line 1069
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public abstract getAdapter()Landroid/widget/Adapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 591
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmptyView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 674
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFirstVisiblePosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemAtPosition(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 766
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemIdAtPosition(I)J
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 770
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 771
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-gez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-wide/high16 v1, -0x8000000000000000L
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getLastVisiblePosition()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 644
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemLongClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 356
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getOnItemSelectedListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPositionForView(Landroid/view/View;)I
a=0;//     .locals 7
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 604
a=0;//     #v5=(Byte);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 607
a=0;//     .local v3, "listItem":Landroid/view/View;
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/view/View;);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v4, Landroid/view/View;
a=0;// 
a=0;//     .local v4, "v":Landroid/view/View;
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 608
a=0;//     move-object v3, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 610
a=0;//     .end local v4    # "v":Landroid/view/View;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 624
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Integer);
a=0;//     return v5
a=0;// 
a=0;//     .line 616
a=0;//     .restart local v4    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Reference,Landroid/view/View;);v5=(Byte);v6=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 617
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 618
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 619
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 617
a=0;//     :cond_2
a=0;//     #v5=(Byte);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItem()Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 576
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 577
a=0;//     .local v1, "selection":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 578
a=0;//     invoke-interface {v0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 580
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemId()J
a=0;//     .locals 2
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemPosition()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract getSelectedView()Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method handleDataChanged()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const-wide/high16 v8, -0x8000000000000000L
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 920
a=0;//     #v5=(Null);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     .line 921
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 923
a=0;//     .local v1, "found":Z
a=0;//     #v1=(Null);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 928
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 931
a=0;//     iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 935
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->findSyncPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 936
a=0;//     .local v2, "newPos":I
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     .line 938
a=0;//     invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 939
a=0;//     .local v3, "selectablePos":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v2, :cond_0
a=0;// 
a=0;//     .line 941
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 942
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 946
a=0;//     .end local v2    # "newPos":I
a=0;//     .end local v3    # "selectablePos":I
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 948
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 951
a=0;//     .restart local v2    # "newPos":I
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, v0, :cond_1
a=0;// 
a=0;//     .line 952
a=0;//     add-int/lit8 v2, v0, -0x1
a=0;// 
a=0;//     .line 954
a=0;//     :cond_1
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 955
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 959
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 960
a=0;//     .restart local v3    # "selectablePos":I
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 962
a=0;//     invoke-virtual {p0, v2, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 964
a=0;//     :cond_3
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     .line 965
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 966
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 967
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 971
a=0;//     .end local v2    # "newPos":I
a=0;//     .end local v3    # "selectablePos":I
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 973
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 974
a=0;//     iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 975
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 976
a=0;//     iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 977
a=0;//     iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 978
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 980
a=0;//     :cond_5
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method isInFilterMode()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method lookForSelectablePosition(IZ)I
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "lookDown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 849
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 850
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 851
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I
a=0;// 
a=0;//     .line 543
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performItemClick(Landroid/view/View;IJ)Z
a=0;//     .locals 7
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 303
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 305
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {p1, v6}, Landroid/view/View;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;->onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method rememberSyncState()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1119
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 1120
a=0;//     iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 1121
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncHeight:J
a=0;// 
a=0;//     .line 1122
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     .line 1124
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1125
a=0;//     .local v1, "v":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 1126
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I
a=0;// 
a=0;//     .line 1127
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1128
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I
a=0;// 
a=0;//     .line 1130
a=0;//     :cond_0
a=0;//     iput v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I
a=0;// 
a=0;//     .line 1147
a=0;//     .end local v1    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1133
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(LongHi);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1134
a=0;//     .restart local v1    # "v":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1135
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     if-ltz v2, :cond_4
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_4
a=0;// 
a=0;//     .line 1136
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 1140
a=0;//     :goto_1
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I
a=0;// 
a=0;//     .line 1141
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1142
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I
a=0;// 
a=0;//     .line 1144
a=0;//     :cond_3
a=0;//     iput v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1138
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeAllViews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeAllViews() is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public removeView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeView(View) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public removeViewAt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 527
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "removeViewAt(int) is not supported in AdapterView"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method selectionChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 869
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 870
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 875
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 876
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// 
a=0;//     .line 878
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 885
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 886
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 888
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 880
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract setAdapter(Landroid/widget/Adapter;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public setEmptyView(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "emptyView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 659
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 662
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 663
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V
a=0;// 
a=0;//     .line 664
a=0;//     return-void
a=0;// 
a=0;//     .line 662
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setFocusable(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "focusable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 689
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 690
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 692
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z
a=0;// 
a=0;//     .line 693
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 694
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     .line 697
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V
a=0;// 
a=0;//     .line 698
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v3=(One);v4=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 690
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v4=(Conflicted);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 697
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setFocusableInTouchMode(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "focusable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 702
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 703
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 705
a=0;//     .local v1, "empty":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z
a=0;// 
a=0;//     .line 706
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 707
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z
a=0;// 
a=0;//     .line 710
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 711
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "empty":Z
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v3=(One);v4=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 703
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "empty":Z
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v4=(Conflicted);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 710
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setNextSelectedPositionInt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1104
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 1105
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 1107
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     .line 1108
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I
a=0;// 
a=0;//     .line 1109
a=0;//     iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J
a=0;// 
a=0;//     .line 1111
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "l"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 776
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .line 283
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemLongClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isLongClickable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 346
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->setLongClickable(Z)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
a=0;// 
a=0;//     .line 349
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     .line 399
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSelectedPositionInt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1094
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 1095
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 1096
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setSelection(I)V
a=0;// .end method
}}
