package android.support.v4.app; class ListFragment { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ListFragment;
a=0;// .super Landroid/support/v4/app/Fragment;
a=0;// .source "ListFragment.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final INTERNAL_EMPTY_ID:I = 0xff0001
a=0;// 
a=0;// .field static final INTERNAL_LIST_CONTAINER_ID:I = 0xff0003
a=0;// 
a=0;// .field static final INTERNAL_PROGRESS_CONTAINER_ID:I = 0xff0002
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field mEmptyText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field mList:Landroid/widget/ListView;
a=0;// 
a=0;// .field mListContainer:Landroid/view/View;
a=0;// 
a=0;// .field mListShown:Z
a=0;// 
a=0;// .field private final mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// .field mProgressContainer:Landroid/view/View;
a=0;// 
a=0;// .field private final mRequestFocus:Ljava/lang/Runnable;
a=0;// 
a=0;// .field mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Landroid/support/v4/app/ListFragment;);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Landroid/support/v4/app/ListFragment$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ListFragment$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/ListFragment$1;-><init>(Landroid/support/v4/app/ListFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ListFragment$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Landroid/support/v4/app/ListFragment$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ListFragment$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/ListFragment$2;-><init>(Landroid/support/v4/app/ListFragment;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ListFragment$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ListFragment;->mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureList()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 323
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ListView;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 327
a=0;//     .local v2, "root":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 328
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v4, "Content view not yet created"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 330
a=0;//     :cond_1
a=0;//     #v4=(Uninit);
a=0;//     instance-of v3, v2, Landroid/widget/ListView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 331
a=0;//     check-cast v2, Landroid/widget/ListView;
a=0;// 
a=0;//     .end local v2    # "root":Landroid/view/View;
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 360
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ListView;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mOnClickListener:Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/AdapterView$OnItemClickListener;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 362
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 364
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/ListFragment;->setListAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 373
a=0;//     .end local v0    # "adapter":Landroid/widget/ListAdapter;
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 333
a=0;//     .restart local v2    # "root":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     const v3, 0xff0001
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 335
a=0;//     const v3, 0x1020004
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 339
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);
a=0;//     const v3, 0xff0002
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 340
a=0;//     const v3, 0xff0003
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     .line 341
a=0;//     const v3, 0x102000a
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 342
a=0;//     .local v1, "rawListView":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     instance-of v3, v1, Landroid/widget/ListView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 343
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 344
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "Your content must have a ListView whose id attribute is \'android.R.id.list\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 337
a=0;//     .end local v1    # "rawListView":Landroid/view/View;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 348
a=0;//     .restart local v1    # "rawListView":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/view/View;);v3=(Boolean);v4=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "Content has view with id attribute \'android.R.id.list\' that is not a ListView class"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 352
a=0;//     :cond_7
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     check-cast v1, Landroid/widget/ListView;
a=0;// 
a=0;//     .end local v1    # "rawListView":Landroid/view/View;
a=0;//     iput-object v1, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 354
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 355
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 369
a=0;//     .end local v2    # "root":Landroid/view/View;
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 370
a=0;//     invoke-direct {p0, v5, v5}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private setListShown(ZZ)V
a=0;//     .locals 6
a=0;//     .param p1, "shown"    # Z
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const v5, 0x10a0001
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v4, 0x10a0000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 280
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Can\'t be used with a custom content view"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     .line 313
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
a=0;// 
a=0;//     .line 288
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 289
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 298
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 295
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 301
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v1, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 310
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getListAdapter()Landroid/widget/ListAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getListView()Landroid/widget/ListView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemId()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemId()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedItemPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ListView;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 12
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0x11
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, -0x2
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     .line 91
a=0;//     #v9=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "context":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     new-instance v5, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v5, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 97
a=0;//     .local v5, "root":Landroid/widget/FrameLayout;
a=0;//     #v5=(Reference,Landroid/widget/FrameLayout;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 98
a=0;//     .local v3, "pframe":Landroid/widget/LinearLayout;
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const v7, 0xff0002
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setId(I)V
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 100
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v3, v11}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v4, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const v8, 0x101007a
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v4, v0, v7, v8}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 105
a=0;//     .local v4, "progress":Landroid/widget/ProgressBar;
a=0;//     #v4=(Reference,Landroid/widget/ProgressBar;);
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v3, v4, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v5, v3, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v1, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 114
a=0;//     .local v1, "lframe":Landroid/widget/FrameLayout;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     const v7, 0xff0003
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v1, v7}, Landroid/widget/FrameLayout;->setId(I)V
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v6, Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 117
a=0;//     .local v6, "tv":Landroid/widget/TextView;
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     const v7, 0xff0001
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v6, v11}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v6, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v2, Landroid/widget/ListView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/ListView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v7}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 123
a=0;//     .local v2, "lv":Landroid/widget/ListView;
a=0;//     #v2=(Reference,Landroid/widget/ListView;);
a=0;//     const v7, 0x102000a
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Landroid/widget/ListView;->setId(I)V
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, v7}, Landroid/widget/ListView;->setDrawSelectorOnTop(Z)V
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v2, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v5, v1, v7}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v7, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v7, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 153
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mRequestFocus:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 154
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
a=0;// 
a=0;//     .line 156
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mListContainer:Landroid/view/View;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mProgressContainer:Landroid/view/View;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 157
a=0;//     iput-object v2, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 158
a=0;//     invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Landroid/widget/ListView;
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 145
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEmptyText(Ljava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Can\'t be used with a custom content view"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ListFragment;->mStandardEmptyView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 240
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mEmptyText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 4
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 179
a=0;//     #v1=(One);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "hadAdapter":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ListFragment;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-boolean v3, p0, Landroid/support/v4/app/ListFragment;->mListShown:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ListFragment;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-direct {p0, v1, v2}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
a=0;// 
a=0;//     .line 189
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hadAdapter":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Null);v3=(Reference,Landroid/widget/ListAdapter;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setListShown(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "shown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
a=0;// 
a=0;//     .line 259
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListShownNoAnimation(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "shown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/app/ListFragment;->setListShown(ZZ)V
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSelection(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ListFragment;->ensureList()V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ListFragment;->mList:Landroid/widget/ListView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
}}
