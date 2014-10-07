package android.support.v4.app; class ListFragment {/*

.class public Landroid/support/v4/app/ListFragment;
.super Landroid/support/v4/app/Fragment;
.source "ListFragment.java"


# static fields
.field static final INTERNAL_EMPTY_ID:I = 0xff0001

.field static final INTERNAL_LIST_CONTAINER_ID:I = 0xff0003

.field static final INTERNAL_PROGRESS_CONTAINER_ID:I = 0xff0002


# instance fields
.field mAdapter:Landroid/widget/ListAdapter;

.field mEmptyText:Ljava/lang/CharSequence;

.field mEmptyView:Landroid/view/View;

.field private final mHandler:Landroid/os/Handler;

.field mList:Landroid/widget/ListView;

.field mListContainer:Landroid/view/View;

.field mListShown:Z

.field private final mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field mProgressContainer:Landroid/view/View;

.field private final mRequestFocus:Ljava/lang/Runnable;

.field mStandardEmptyView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    #p0=(Reference);
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;

    .line 49
    new-instance v0, Landroid/support/v4/app/ListFragment$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/ListFragment$1;-><init>(Landroid/support/v4/app/ListFragment;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;

    .line 55
    new-instance v0, Landroid/support/v4/app/ListFragment$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/ListFragment$2;-><init>(Landroid/support/v4/app/ListFragment;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 72
    return-void
.end method

.method private ensureList()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 323
    #v5=(Null);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 374
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void

    .line 326
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;

    move-result-object v2

    .line 327
    .local v2, root:Landroid/view/View;
    #v2=(Reference);
    if-nez v2, :cond_1

    .line 328
    new-instance v3, Ljava/lang/IllegalStateException;

    #v3=(UninitRef);
    const-string v4, "Content view not yet created"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 330
    :cond_1
    #v4=(Uninit);
    instance-of v3, v2, Landroid/widget/ListView;

    #v3=(Boolean);
    if-eqz v3, :cond_4

    .line 331
    check-cast v2, Landroid/widget/ListView;

    .end local v2           #root:Landroid/view/View;
    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    .line 360
    :cond_2
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z

    .line 361
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 362
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v3, :cond_9

    .line 363
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    .line 364
    .local v0, adapter:Landroid/widget/ListAdapter;
    #v0=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    .line 365
    invoke-virtual {p0, v0}, Landroid/support/v4/app/ListFragment;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 373
    .end local v0           #adapter:Landroid/widget/ListAdapter;
    :cond_3
    :goto_2
    #v0=(Conflicted);v3=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;

    iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 333
    .restart local v2       #root:Landroid/view/View;
    :cond_4
    #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Uninit);
    const v3, 0xff0001

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    .line 334
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    if-nez v3, :cond_5

    .line 335
    const v3, 0x1020004

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;

    .line 339
    :goto_3
    #v4=(Conflicted);
    const v3, 0xff0002

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    .line 340
    const v3, 0xff0003

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    .line 341
    const v3, 0x102000a

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 342
    .local v1, rawListView:Landroid/view/View;
    #v1=(Reference);
    instance-of v3, v1, Landroid/widget/ListView;

    #v3=(Boolean);
    if-nez v3, :cond_7

    .line 343
    if-nez v1, :cond_6

    .line 344
    new-instance v3, Ljava/lang/RuntimeException;

    #v3=(UninitRef);
    const-string v4, "Your content must have a ListView whose id attribute is \'android.R.id.list\'"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 337
    .end local v1           #rawListView:Landroid/view/View;
    :cond_5
    #v1=(Uninit);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    const/16 v4, 0x8

    #v4=(PosByte);
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 348
    .restart local v1       #rawListView:Landroid/view/View;
    :cond_6
    #v1=(Reference);v3=(Boolean);v4=(Conflicted);
    new-instance v3, Ljava/lang/RuntimeException;

    #v3=(UninitRef);
    const-string v4, "Content has view with id attribute \'android.R.id.list\' that is not a ListView class"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 352
    :cond_7
    #v3=(Boolean);v4=(Conflicted);
    check-cast v1, Landroid/widget/ListView;

    .end local v1           #rawListView:Landroid/view/View;
    iput-object v1, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    .line 353
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;

    #v3=(Reference);
    if-eqz v3, :cond_8

    .line 354
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    goto :goto_1

    .line 355
    :cond_8
    #v4=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;

    if-eqz v3, :cond_2

    .line 356
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    goto/16 :goto_1

    .line 369
    .end local v2           #root:Landroid/view/View;
    :cond_9
    #v1=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    if-eqz v3, :cond_3

    .line 370
    invoke-direct {p0, v5, v5}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V

    goto/16 :goto_2
.end method

.method private setListShown(ZZ)V
    .locals 6
    .parameter "shown"
    .parameter "animate"

    .prologue
    const v5, 0x10a0001

    #v5=(Integer);
    const/high16 v4, 0x10a

    #v4=(Integer);
    const/16 v3, 0x8

    #v3=(PosByte);
    const/4 v2, 0x0

    .line 280
    #v2=(Null);
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 281
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 282
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Can\'t be used with a custom content view"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 284
    :cond_0
    #v1=(Uninit);
    iget-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z

    #v0=(Boolean);
    if-ne v0, p1, :cond_1

    .line 313
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 287
    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iput-boolean p1, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z

    .line 288
    if-eqz p1, :cond_3

    .line 289
    if-eqz p2, :cond_2

    .line 290
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 292
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 298
    :goto_1
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 295
    :cond_2
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 296
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_1

    .line 301
    :cond_3
    #v0=(Boolean);
    if-eqz p2, :cond_4

    .line 302
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 304
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 310
    :goto_2
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 307
    :cond_4
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 308
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_2
.end method


# virtual methods
.method public getListAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 319
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 222
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 223
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v0=(Reference);
    return-object v0
.end method

.method public getSelectedItemId()J
    .locals 2

    .prologue
    .line 214
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 215
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemId()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .prologue
    .line 206
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 207
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemPosition()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12
    .parameter "inflater"
    .parameter "container"
    .parameter "savedInstanceState"

    .prologue
    const/16 v11, 0x11

    #v11=(PosByte);
    const/4 v10, -0x2

    #v10=(Byte);
    const/4 v9, -0x1

    .line 91
    #v9=(Byte);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 93
    .local v0, context:Landroid/content/Context;
    #v0=(Reference);
    new-instance v5, Landroid/widget/FrameLayout;

    #v5=(UninitRef);
    invoke-direct {v5, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 97
    .local v5, root:Landroid/widget/FrameLayout;
    #v5=(Reference);
    new-instance v3, Landroid/widget/LinearLayout;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 98
    .local v3, pframe:Landroid/widget/LinearLayout;
    #v3=(Reference);
    const v7, 0xff0002

    #v7=(Integer);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setId(I)V

    .line 99
    const/4 v7, 0x1

    #v7=(One);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 100
    const/16 v7, 0x8

    #v7=(PosByte);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 101
    invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 103
    new-instance v4, Landroid/widget/ProgressBar;

    #v4=(UninitRef);
    const/4 v7, 0x0

    #v7=(Null);
    const v8, 0x101007a

    #v8=(Integer);
    invoke-direct {v4, v0, v7, v8}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 105
    .local v4, progress:Landroid/widget/ProgressBar;
    #v4=(Reference);
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v3, v4, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v5, v3, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    new-instance v1, Landroid/widget/FrameLayout;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 114
    .local v1, lframe:Landroid/widget/FrameLayout;
    #v1=(Reference);
    const v7, 0xff0003

    #v7=(Integer);
    invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setId(I)V

    .line 116
    new-instance v6, Landroid/widget/TextView;

    #v6=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 117
    .local v6, tv:Landroid/widget/TextView;
    #v6=(Reference);
    const v7, 0xff0001

    #v7=(Integer);
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setId(I)V

    .line 118
    invoke-virtual {v6, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 119
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v1, v6, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    new-instance v2, Landroid/widget/ListView;

    #v2=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-direct {v2, v7}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 123
    .local v2, lv:Landroid/widget/ListView;
    #v2=(Reference);
    const v7, 0x102000a

    #v7=(Integer);
    invoke-virtual {v2, v7}, Landroid/widget/ListView;->setId(I)V

    .line 124
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v2, v7}, Landroid/widget/ListView;->setDrawSelectorOnTop(Z)V

    .line 125
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v1, v2, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v5, v1, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    #v7=(UninitRef);
    invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v7=(Reference);
    invoke-virtual {v5, v7}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    return-object v5
.end method

.method public onDestroyView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 153
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 154
    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    .line 155
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z

    .line 156
    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;

    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;

    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;

    .line 157
    iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    .line 158
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 159
    return-void
.end method

.method public onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 0
    .parameter "l"
    .parameter "v"
    .parameter "position"
    .parameter "id"

    .prologue
    .line 173
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .parameter "view"
    .parameter "savedInstanceState"

    .prologue
    .line 144
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 145
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 146
    return-void
.end method

.method public setEmptyText(Ljava/lang/CharSequence;)V
    .locals 2
    .parameter "text"

    .prologue
    .line 232
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 233
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 234
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Can\'t be used with a custom content view"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 236
    :cond_0
    #v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    .line 238
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 240
    :cond_1
    #v1=(Conflicted);
    iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;

    .line 241
    return-void
.end method

.method public setListAdapter(Landroid/widget/ListAdapter;)V
    .locals 4
    .parameter "adapter"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    .line 179
    #v1=(One);
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    #v3=(Reference);
    if-eqz v3, :cond_2

    move v0, v1

    .line 180
    .local v0, hadAdapter:Z
    :goto_0
    #v0=(Boolean);
    iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;

    .line 181
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    if-eqz v3, :cond_1

    .line 182
    iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    invoke-virtual {v3, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 183
    iget-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z

    #v3=(Boolean);
    if-nez v3, :cond_1

    if-nez v0, :cond_1

    .line 186
    invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_0

    move v2, v1

    :cond_0
    #v2=(Boolean);
    invoke-direct {p0, v1, v2}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V

    .line 189
    :cond_1
    #v3=(Conflicted);
    return-void

    .end local v0           #hadAdapter:Z
    :cond_2
    #v0=(Uninit);v2=(Null);v3=(Reference);
    move v0, v2

    .line 179
    #v0=(Null);
    goto :goto_0
.end method

.method public setListShown(Z)V
    .locals 1
    .parameter "shown"

    .prologue
    .line 258
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V

    .line 259
    return-void
.end method

.method public setListShownNoAnimation(Z)V
    .locals 1
    .parameter "shown"

    .prologue
    .line 266
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V

    .line 267
    return-void
.end method

.method public setSelection(I)V
    .locals 1
    .parameter "position"

    .prologue
    .line 198
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V

    .line 199
    iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    .line 200
    return-void
.end method

*/}
