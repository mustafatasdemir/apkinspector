package android.support.v4.app; class BackStackRecord { void a() { int a;
a=0;// .class final Landroid/support/v4/app/BackStackRecord;
a=0;// .super Landroid/support/v4/app/FragmentTransaction;
a=0;// .source "BackStackRecord.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/FragmentManager$BackStackEntry;
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final OP_ADD:I = 0x1
a=0;// 
a=0;// .field static final OP_ATTACH:I = 0x7
a=0;// 
a=0;// .field static final OP_DETACH:I = 0x6
a=0;// 
a=0;// .field static final OP_HIDE:I = 0x4
a=0;// 
a=0;// .field static final OP_NULL:I = 0x0
a=0;// 
a=0;// .field static final OP_REMOVE:I = 0x3
a=0;// 
a=0;// .field static final OP_REPLACE:I = 0x2
a=0;// 
a=0;// .field static final OP_SHOW:I = 0x5
a=0;// 
a=0;// .field static final TAG:Ljava/lang/String; = "FragmentManager"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAddToBackStack:Z
a=0;// 
a=0;// .field mAllowAddToBackStack:Z
a=0;// 
a=0;// .field mBreadCrumbShortTitleRes:I
a=0;// 
a=0;// .field mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mBreadCrumbTitleRes:I
a=0;// 
a=0;// .field mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mCommitted:Z
a=0;// 
a=0;// .field mEnterAnim:I
a=0;// 
a=0;// .field mExitAnim:I
a=0;// 
a=0;// .field mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;// .field mIndex:I
a=0;// 
a=0;// .field final mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field mName:Ljava/lang/String;
a=0;// 
a=0;// .field mNumOp:I
a=0;// 
a=0;// .field mPopEnterAnim:I
a=0;// 
a=0;// .field mPopExitAnim:I
a=0;// 
a=0;// .field mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;// .field mTransition:I
a=0;// 
a=0;// .field mTransitionStyle:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;)V
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentTransaction;-><init>()V
a=0;// 
a=0;//     .line 209
a=0;//     #p0=(Reference,Landroid/support/v4/app/BackStackRecord;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
a=0;// 
a=0;//     .line 212
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     .line 334
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 335
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
a=0;//     .locals 4
a=0;//     .param p1, "containerViewId"    # I
a=0;//     .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;//     .param p4, "opcmd"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v1, p2, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 396
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 398
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t change tag of fragment "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": was "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " now "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 402
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     iput-object p3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 405
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 406
a=0;//     iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     if-eq v1, p1, :cond_2
a=0;// 
a=0;//     .line 407
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t change container ID of fragment "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": was "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " now "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 411
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iput p1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     iput p1, p2, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     .line 414
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 415
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     iput p4, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 416
a=0;//     iput-object p2, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 418
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "containerViewId"    # I
a=0;//     .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 385
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "containerViewId"    # I
a=0;//     .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 390
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v0, p1, p2, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 380
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;//     .locals 1
a=0;//     .param p1, "op"    # Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 371
a=0;//     :goto_0
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     .line 372
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     .line 373
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     .line 374
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
a=0;// 
a=0;//     iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     .line 375
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
a=0;// 
a=0;//     .line 376
a=0;//     return-void
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 369
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 503
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 506
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     .line 507
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 508
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 471
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 472
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 473
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 475
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method bumpBackStackNesting(I)V
a=0;//     .locals 6
a=0;//     .param p1, "amt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 549
a=0;//     iget-boolean v3, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 552
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Bump nesting in "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " by "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 554
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 555
a=0;//     .local v1, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 557
a=0;//     iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, p1
a=0;// 
a=0;//     iput v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     .line 558
a=0;//     sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Bump nesting of "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " to "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v5, v5, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 561
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 562
a=0;//     iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ltz v0, :cond_5
a=0;// 
a=0;//     .line 563
a=0;//     iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 564
a=0;//     .local v2, "r":Landroid/support/v4/app/Fragment;
a=0;//     iget v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v3, p1
a=0;// 
a=0;//     iput v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     .line 565
a=0;//     sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Bump nesting of "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " to "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 562
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 569
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "r":Landroid/support/v4/app/Fragment;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public commit()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public commitAllowingStateLoss()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method commitInternal(Z)I
a=0;//     .locals 6
a=0;//     .param p1, "allowStateLoss"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 582
a=0;//     #v5=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "commit already called"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 583
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     sget-boolean v2, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 584
a=0;//     const-string v2, "FragmentManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Commit: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 585
a=0;//     new-instance v0, Landroid/support/v4/util/LogWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/LogWriter;);
a=0;//     const-string v2, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 586
a=0;//     .local v0, "logw":Landroid/support/v4/util/LogWriter;
a=0;//     #v0=(Reference,Landroid/support/v4/util/LogWriter;);
a=0;//     new-instance v1, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 587
a=0;//     .local v1, "pw":Ljava/io/PrintWriter;
a=0;//     #v1=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     invoke-virtual {p0, v2, v5, v1, v5}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 589
a=0;//     .end local v0    # "logw":Landroid/support/v4/util/LogWriter;
a=0;//     .end local v1    # "pw":Ljava/io/PrintWriter;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
a=0;// 
a=0;//     .line 590
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 591
a=0;//     iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v4/app/FragmentManagerImpl;->allocBackStackIndex(Landroid/support/v4/app/BackStackRecord;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     .line 595
a=0;//     :goto_0
a=0;//     iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v2, p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V
a=0;// 
a=0;//     .line 596
a=0;//     iget v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 593
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 462
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 463
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 464
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 466
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 517
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "This transaction is already being added to the back stack"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 520
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
a=0;// 
a=0;//     .line 521
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p3, v0}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;//     .locals 7
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p3, "full"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     if-eqz p3, :cond_8
a=0;// 
a=0;//     .line 242
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mName="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     const-string v5, " mIndex="
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 244
a=0;//     const-string v5, " mCommitted="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v5, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 245
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mTransition=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 248
a=0;//     const-string v5, " mTransitionStyle=#"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 249
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mEnterAnim=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 253
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 254
a=0;//     const-string v5, " mExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 255
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
a=0;// 
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 258
a=0;//     :cond_3
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mPopEnterAnim=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 260
a=0;//     const-string v5, " mPopExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 261
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 263
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 264
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mBreadCrumbTitleRes=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     const-string v5, " mBreadCrumbTitleText="
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_6
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_7
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     .line 270
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "mBreadCrumbShortTitleRes=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 271
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 272
a=0;//     const-string v5, " mBreadCrumbShortTitleText="
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 277
a=0;//     :cond_8
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     if-eqz v5, :cond_10
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "Operations:"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 279
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "    "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 280
a=0;//     .local v2, "innerPrefix":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 281
a=0;//     .local v4, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v4=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "num":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     .line 284
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 293
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "cmd="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 295
a=0;//     .local v0, "cmdStr":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  Op #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 296
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     const-string v5, " "
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 298
a=0;//     if-eqz p3, :cond_c
a=0;// 
a=0;//     .line 299
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_9
a=0;// 
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     .line 300
a=0;//     :cond_9
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "enterAnim=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     const-string v5, " exitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_a
a=0;//     #v5=(Conflicted);
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_b
a=0;// 
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     .line 306
a=0;//     :cond_b
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "popEnterAnim=#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 308
a=0;//     const-string v5, " popExitAnim=#"
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 309
a=0;//     iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     :cond_c
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v5, :cond_f
a=0;// 
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_f
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_f
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_d
a=0;// 
a=0;//     .line 316
a=0;//     const-string v5, "Removed: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 324
a=0;//     :goto_3
a=0;//     iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 313
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 285
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     .end local v1    # "i":I
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     const-string v0, "NULL"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 286
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "ADD"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "REPLACE"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 288
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "REMOVE"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 289
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_4
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "HIDE"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 290
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_5
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "SHOW"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 291
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_6
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "DETACH"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 292
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     :pswitch_7
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "ATTACH"
a=0;// 
a=0;//     .restart local v0    # "cmdStr":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 318
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_d
a=0;//     #v1=(Integer);v6=(One);
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     .line 319
a=0;//     const-string v5, "Removed:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_e
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v5, "  #"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 322
a=0;//     const-string v5, ": "
a=0;// 
a=0;//     invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 327
a=0;//     .end local v1    # "i":I
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 328
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     .line 329
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     .end local v0    # "cmdStr":Ljava/lang/String;
a=0;//     .end local v2    # "innerPrefix":Ljava/lang/String;
a=0;//     .end local v3    # "num":I
a=0;//     .end local v4    # "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 284
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getBreadCrumbShortTitle()Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 360
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBreadCrumbShortTitleRes()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBreadCrumbTitle()Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 353
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBreadCrumbTitleRes()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 338
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 775
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 779
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTransitionStyle()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 444
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 445
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 448
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public isAddToBackStackAllowed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 787
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
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
a=0;// .method public popFromBackStack(Z)V
a=0;//     .locals 12
a=0;//     .param p1, "doStateMove"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 691
a=0;//     #v11=(Byte);
a=0;//     sget-boolean v6, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 692
a=0;//     const-string v6, "FragmentManager"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "popFromBackStack: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 693
a=0;//     new-instance v2, Landroid/support/v4/util/LogWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/util/LogWriter;);
a=0;//     const-string v6, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v2, v6}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 694
a=0;//     .local v2, "logw":Landroid/support/v4/util/LogWriter;
a=0;//     #v2=(Reference,Landroid/support/v4/util/LogWriter;);
a=0;//     new-instance v5, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v5, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 695
a=0;//     .local v5, "pw":Ljava/io/PrintWriter;
a=0;//     #v5=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v6, "  "
a=0;// 
a=0;//     invoke-virtual {p0, v6, v10, v5, v10}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 698
a=0;//     .end local v2    # "logw":Landroid/support/v4/util/LogWriter;
a=0;//     .end local v5    # "pw":Ljava/io/PrintWriter;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p0, v11}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
a=0;// 
a=0;//     .line 700
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 701
a=0;//     .local v4, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 702
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     packed-switch v6, :pswitch_data_0
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Unknown cmd: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget v8, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 704
a=0;//     :pswitch_0
a=0;//     #v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 705
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 706
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     .line 760
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 711
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);v6=(Integer);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 712
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 713
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     .line 718
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 719
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v1, v6, :cond_1
a=0;// 
a=0;//     .line 720
a=0;//     iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 721
a=0;//     .local v3, "old":Landroid/support/v4/app/Fragment;
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 722
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v6, v3, v9}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     .line 719
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 727
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "old":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Integer);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 728
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 729
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v6, v0, v9}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 732
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_3
a=0;//     #v0=(Conflicted);v6=(Integer);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 733
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 734
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 738
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_4
a=0;//     #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 739
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 740
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 744
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_5
a=0;//     #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 745
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 746
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 750
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_6
a=0;//     #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 751
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 752
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 763
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     .line 764
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, v7, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iget v9, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V
a=0;// 
a=0;//     .line 768
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Boolean);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ltz v6, :cond_5
a=0;// 
a=0;//     .line 769
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v4/app/FragmentManagerImpl;->freeBackStackIndex(I)V
a=0;// 
a=0;//     .line 770
a=0;//     iput v11, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     .line 772
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 702
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 435
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 436
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 437
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 439
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "containerViewId"    # I
a=0;//     .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/BackStackRecord;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "containerViewId"    # I
a=0;//     .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 426
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Must use non-zero containerViewId"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 430
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 600
a=0;//     #v7=(Null);
a=0;//     sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const-string v4, "FragmentManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Run: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 602
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 603
a=0;//     iget v4, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     .line 604
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "addToBackStack() called after commit()"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 608
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
a=0;// 
a=0;//     .line 610
a=0;//     iget-object v3, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 611
a=0;//     .local v3, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);v4=(Conflicted);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     .line 612
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 675
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Unknown cmd: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 614
a=0;//     :pswitch_0
a=0;//     #v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 615
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4, v0, v7}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     .line 679
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 619
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 620
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     .line 621
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_9
a=0;// 
a=0;//     .line 622
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 623
a=0;//     .local v2, "old":Landroid/support/v4/app/Fragment;
a=0;//     sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     const-string v4, "FragmentManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "OP_REPLACE: adding="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " old="
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 625
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget v4, v2, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v0, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_5
a=0;// 
a=0;//     .line 626
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ne v2, v0, :cond_6
a=0;// 
a=0;//     .line 627
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 621
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 629
a=0;//     :cond_6
a=0;//     iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 630
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 632
a=0;//     :cond_7
a=0;//     iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 633
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 634
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 635
a=0;//     iget v4, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     .line 636
a=0;//     sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     const-string v4, "FragmentManager"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Bump nesting of "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " to "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v6, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 639
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v2, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 644
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "old":Landroid/support/v4/app/Fragment;
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 645
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 646
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4, v0, v7}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 650
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_2
a=0;//     #v0=(Conflicted);v4=(Integer);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 651
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 652
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 655
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_3
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 656
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 660
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_4
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 661
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 662
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 665
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_5
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 666
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 667
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 670
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :pswitch_6
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 671
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     .line 672
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 682
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget v5, v5, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v5, v6, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V
a=0;// 
a=0;//     .line 685
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     .line 686
a=0;//     iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v4/app/FragmentManagerImpl;->addBackStackState(Landroid/support/v4/app/BackStackRecord;)V
a=0;// 
a=0;//     .line 688
a=0;//     :cond_b
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 612
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setBreadCrumbShortTitle(I)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     .line 538
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 539
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setBreadCrumbShortTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     .line 544
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 545
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setBreadCrumbTitle(I)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "res"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     .line 526
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 527
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setBreadCrumbTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     .line 532
a=0;//     iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 533
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .param p1, "enter"    # I
a=0;//     .param p2, "exit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, v0}, Landroid/support/v4/app/BackStackRecord;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 0
a=0;//     .param p1, "enter"    # I
a=0;//     .param p2, "exit"    # I
a=0;//     .param p3, "popEnter"    # I
a=0;//     .param p4, "popExit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I
a=0;// 
a=0;//     .line 485
a=0;//     iput p2, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I
a=0;// 
a=0;//     .line 486
a=0;//     iput p3, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I
a=0;// 
a=0;//     .line 487
a=0;//     iput p4, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I
a=0;// 
a=0;//     .line 488
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTransition(I)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 0
a=0;//     .param p1, "transition"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     .line 493
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTransitionStyle(I)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 0
a=0;//     .param p1, "styleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     .line 498
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 453
a=0;//     .local v0, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 454
a=0;//     iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 455
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 457
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 222
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "BackStackEntry{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 223
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 224
a=0;//     iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     const-string v1, " #"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 226
a=0;//     iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 229
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 232
a=0;//     :cond_1
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
