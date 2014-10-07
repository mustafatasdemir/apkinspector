package android.support.v4.app; class BackStackRecord {/*

.class final Landroid/support/v4/app/BackStackRecord;
.super Landroid/support/v4/app/FragmentTransaction;
.source "BackStackRecord.java"

# interfaces
.implements Landroid/support/v4/app/FragmentManager$BackStackEntry;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/BackStackRecord$Op;
    }
.end annotation


# static fields
.field static final OP_ADD:I = 0x1

.field static final OP_ATTACH:I = 0x7

.field static final OP_DETACH:I = 0x6

.field static final OP_HIDE:I = 0x4

.field static final OP_NULL:I = 0x0

.field static final OP_REMOVE:I = 0x3

.field static final OP_REPLACE:I = 0x2

.field static final OP_SHOW:I = 0x5

.field static final TAG:Ljava/lang/String; = "FragmentManager"


# instance fields
.field mAddToBackStack:Z

.field mAllowAddToBackStack:Z

.field mBreadCrumbShortTitleRes:I

.field mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

.field mBreadCrumbTitleRes:I

.field mBreadCrumbTitleText:Ljava/lang/CharSequence;

.field mCommitted:Z

.field mEnterAnim:I

.field mExitAnim:I

.field mHead:Landroid/support/v4/app/BackStackRecord$Op;

.field mIndex:I

.field final mManager:Landroid/support/v4/app/FragmentManagerImpl;

.field mName:Ljava/lang/String;

.field mNumOp:I

.field mPopEnterAnim:I

.field mPopExitAnim:I

.field mTail:Landroid/support/v4/app/BackStackRecord$Op;

.field mTransition:I

.field mTransitionStyle:I


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;)V
    .locals 1
    .parameter "manager"

    .prologue
    .line 333
    invoke-direct {p0}, Landroid/support/v4/app/FragmentTransaction;-><init>()V

    .line 209
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z

    .line 212
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    .line 334
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    .line 335
    return-void
.end method

.method private doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V
    .locals 4
    .parameter "containerViewId"
    .parameter "fragment"
    .parameter "tag"
    .parameter "opcmd"

    .prologue
    .line 394
    iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    iput-object v1, p2, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;

    .line 396
    if-eqz p3, :cond_1

    .line 397
    iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 398
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Can\'t change tag of fragment "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " now "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 402
    :cond_0
    #v1=(Conflicted);v2=(Uninit);v3=(Uninit);
    iput-object p3, p2, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    .line 405
    :cond_1
    if-eqz p1, :cond_3

    .line 406
    iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I

    #v1=(Integer);
    if-eqz v1, :cond_2

    iget v1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I

    if-eq v1, p1, :cond_2

    .line 407
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Can\'t change container ID of fragment "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " now "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 411
    :cond_2
    #v1=(Integer);v2=(Uninit);v3=(Uninit);
    iput p1, p2, Landroid/support/v4/app/Fragment;->mFragmentId:I

    iput p1, p2, Landroid/support/v4/app/Fragment;->mContainerId:I

    .line 414
    :cond_3
    #v1=(Conflicted);
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 415
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    iput p4, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 416
    iput-object p2, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 417
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 418
    return-void
.end method


# virtual methods
.method public add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "containerViewId"
    .parameter "fragment"

    .prologue
    .line 384
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V

    .line 385
    return-object p0
.end method

.method public add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "containerViewId"
    .parameter "fragment"
    .parameter "tag"

    .prologue
    .line 389
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V

    .line 390
    return-object p0
.end method

.method public add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"
    .parameter "tag"

    .prologue
    .line 379
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, v0, p1, p2, v1}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V

    .line 380
    return-object p0
.end method

.method addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
    .locals 1
    .parameter "op"

    .prologue
    .line 364
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 365
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;

    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 371
    :goto_0
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I

    #v0=(Integer);
    iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    .line 372
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I

    iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    .line 373
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I

    iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    .line 374
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I

    iput v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    .line 375
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I

    .line 376
    return-void

    .line 367
    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;

    iput-object v0, p1, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;

    .line 368
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;

    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    .line 369
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;

    goto :goto_0
.end method

.method public addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "name"

    .prologue
    .line 502
    iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 503
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 506
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    .line 507
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    .line 508
    return-object p0
.end method

.method public attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"

    .prologue
    .line 470
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 471
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    const/4 v1, 0x7

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 472
    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 473
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 475
    return-object p0
.end method

.method bumpBackStackNesting(I)V
    .locals 6
    .parameter "amt"

    .prologue
    .line 549
    iget-boolean v3, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 571
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 552
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);
    sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    if-eqz v3, :cond_2

    const-string v3, "FragmentManager"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "Bump nesting in "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " by "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 554
    :cond_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 555
    .local v1, op:Landroid/support/v4/app/BackStackRecord$Op;
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    if-eqz v1, :cond_0

    .line 556
    iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    #v3=(Reference);
    if-eqz v3, :cond_3

    .line 557
    iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    iget v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v4=(Integer);
    add-int/2addr v4, p1

    iput v4, v3, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    .line 558
    sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v3=(Boolean);
    if-eqz v3, :cond_3

    const-string v3, "FragmentManager"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "Bump nesting of "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v1, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    iget v5, v5, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 561
    :cond_3
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v3=(Reference);
    if-eqz v3, :cond_5

    .line 562
    iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    add-int/lit8 v0, v3, -0x1

    .local v0, i:I
    :goto_1
    #v0=(Integer);v3=(Conflicted);
    if-ltz v0, :cond_5

    .line 563
    iget-object v3, v1, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/Fragment;

    .line 564
    .local v2, r:Landroid/support/v4/app/Fragment;
    iget v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v3=(Integer);
    add-int/2addr v3, p1

    iput v3, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    .line 565
    sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v3=(Boolean);
    if-eqz v3, :cond_4

    const-string v3, "FragmentManager"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "Bump nesting of "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 562
    :cond_4
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 569
    .end local v0           #i:I
    .end local v2           #r:Landroid/support/v4/app/Fragment;
    :cond_5
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v1, v1, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    goto/16 :goto_0
.end method

.method public commit()I
    .locals 1

    .prologue
    .line 574
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public commitAllowingStateLoss()I
    .locals 1

    .prologue
    .line 578
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->commitInternal(Z)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method commitInternal(Z)I
    .locals 6
    .parameter "allowStateLoss"

    .prologue
    const/4 v5, 0x0

    .line 582
    #v5=(Null);
    iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/IllegalStateException;

    #v2=(UninitRef);
    const-string v3, "commit already called"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 583
    :cond_0
    #v2=(Boolean);v3=(Uninit);
    sget-boolean v2, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    if-eqz v2, :cond_1

    .line 584
    const-string v2, "FragmentManager"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Commit: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 585
    new-instance v0, Landroid/support/v4/util/LogWriter;

    #v0=(UninitRef);
    const-string v2, "FragmentManager"

    invoke-direct {v0, v2}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V

    .line 586
    .local v0, logw:Landroid/support/v4/util/LogWriter;
    #v0=(Reference);
    new-instance v1, Ljava/io/PrintWriter;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 587
    .local v1, pw:Ljava/io/PrintWriter;
    #v1=(Reference);
    const-string v2, "  "

    invoke-virtual {p0, v2, v5, v1, v5}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 589
    .end local v0           #logw:Landroid/support/v4/util/LogWriter;
    .end local v1           #pw:Ljava/io/PrintWriter;
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    iput-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z

    .line 590
    iget-boolean v2, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 591
    iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v2=(Reference);
    invoke-virtual {v2, p0}, Landroid/support/v4/app/FragmentManagerImpl;->allocBackStackIndex(Landroid/support/v4/app/BackStackRecord;)I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    .line 595
    :goto_0
    iget-object v2, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v2=(Reference);
    invoke-virtual {v2, p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V

    .line 596
    iget v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v2=(Integer);
    return v2

    .line 593
    :cond_2
    #v2=(Boolean);
    const/4 v2, -0x1

    #v2=(Byte);
    iput v2, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    goto :goto_0
.end method

.method public detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"

    .prologue
    .line 461
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 462
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    const/4 v1, 0x6

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 463
    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 464
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 466
    return-object p0
.end method

.method public disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;
    .locals 2

    .prologue
    .line 516
    iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 517
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "This transaction is already being added to the back stack"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 520
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z

    .line 521
    return-object p0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .parameter "prefix"
    .parameter "fd"
    .parameter "writer"
    .parameter "args"

    .prologue
    .line 237
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, p1, p3, v0}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 238
    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 7
    .parameter "prefix"
    .parameter "writer"
    .parameter "full"

    .prologue
    .line 241
    if-eqz p3, :cond_8

    .line 242
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mName="

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 243
    const-string v5, " mIndex="

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v5=(Integer);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 244
    const-string v5, " mCommitted="

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, p0, Landroid/support/v4/app/BackStackRecord;->mCommitted:Z

    #v5=(Boolean);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 245
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    if-eqz v5, :cond_0

    .line 246
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mTransition=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 247
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 248
    const-string v5, " mTransitionStyle=#"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 249
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 251
    :cond_0
    #v5=(Conflicted);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I

    #v5=(Integer);
    if-nez v5, :cond_1

    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I

    if-eqz v5, :cond_2

    .line 252
    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mEnterAnim=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 253
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 254
    const-string v5, " mExitAnim=#"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 255
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 257
    :cond_2
    #v5=(Conflicted);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I

    #v5=(Integer);
    if-nez v5, :cond_3

    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I

    if-eqz v5, :cond_4

    .line 258
    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mPopEnterAnim=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 259
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 260
    const-string v5, " mPopExitAnim=#"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 261
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 263
    :cond_4
    #v5=(Conflicted);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    #v5=(Integer);
    if-nez v5, :cond_5

    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    #v5=(Reference);
    if-eqz v5, :cond_6

    .line 264
    :cond_5
    #v5=(Conflicted);
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mBreadCrumbTitleRes=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 265
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 266
    const-string v5, " mBreadCrumbTitleText="

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 267
    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 269
    :cond_6
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v5=(Integer);
    if-nez v5, :cond_7

    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    #v5=(Reference);
    if-eqz v5, :cond_8

    .line 270
    :cond_7
    #v5=(Conflicted);
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mBreadCrumbShortTitleRes=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 271
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 272
    const-string v5, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 273
    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 277
    :cond_8
    #v5=(Conflicted);
    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    #v5=(Reference);
    if-eqz v5, :cond_10

    .line 278
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Operations:"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 279
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "    "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 280
    .local v2, innerPrefix:Ljava/lang/String;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 281
    .local v4, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v4=(Reference);
    const/4 v3, 0x0

    .line 282
    .local v3, num:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
    if-eqz v4, :cond_10

    .line 284
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v5=(Integer);
    packed-switch v5, :pswitch_data_0

    .line 293
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "cmd="

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v6=(Integer);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 295
    .local v0, cmdStr:Ljava/lang/String;
    :goto_1
    #v0=(Reference);v5=(Conflicted);v6=(Conflicted);
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  Op #"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(I)V

    .line 296
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 297
    const-string v5, " "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 298
    if-eqz p3, :cond_c

    .line 299
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    #v5=(Integer);
    if-nez v5, :cond_9

    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    if-eqz v5, :cond_a

    .line 300
    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "enterAnim=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 301
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 302
    const-string v5, " exitAnim=#"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 303
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 305
    :cond_a
    #v5=(Conflicted);
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    #v5=(Integer);
    if-nez v5, :cond_b

    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    if-eqz v5, :cond_c

    .line 306
    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "popEnterAnim=#"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 307
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    const-string v5, " popExitAnim=#"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 309
    iget v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    #v5=(Integer);
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 312
    :cond_c
    #v5=(Conflicted);
    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v5=(Reference);
    if-eqz v5, :cond_f

    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_f

    .line 313
    const/4 v1, 0x0

    .local v1, i:I
    :goto_2
    #v1=(Integer);v5=(Conflicted);
    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    if-ge v1, v5, :cond_f

    .line 314
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 315
    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    if-ne v5, v6, :cond_d

    .line 316
    const-string v5, "Removed: "

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    :goto_3
    iget-object v5, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 313
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 285
    .end local v0           #cmdStr:Ljava/lang/String;
    .end local v1           #i:I
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v5=(Integer);v6=(Conflicted);
    const-string v0, "NULL"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 286
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_1
    #v0=(Conflicted);
    const-string v0, "ADD"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 287
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_2
    #v0=(Conflicted);
    const-string v0, "REPLACE"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 288
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_3
    #v0=(Conflicted);
    const-string v0, "REMOVE"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 289
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_4
    #v0=(Conflicted);
    const-string v0, "HIDE"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 290
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_5
    #v0=(Conflicted);
    const-string v0, "SHOW"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 291
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_6
    #v0=(Conflicted);
    const-string v0, "DETACH"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 292
    .end local v0           #cmdStr:Ljava/lang/String;
    :pswitch_7
    #v0=(Conflicted);
    const-string v0, "ATTACH"

    .restart local v0       #cmdStr:Ljava/lang/String;
    #v0=(Reference);
    goto/16 :goto_1

    .line 318
    .restart local v1       #i:I
    :cond_d
    #v1=(Integer);v6=(One);
    if-nez v1, :cond_e

    .line 319
    const-string v5, "Removed:"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 321
    :cond_e
    #v5=(Conflicted);
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 322
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_3

    .line 327
    .end local v1           #i:I
    :cond_f
    #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v4, v4, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    .line 328
    add-int/lit8 v3, v3, 0x1

    .line 329
    goto/16 :goto_0

    .line 331
    .end local v0           #cmdStr:Ljava/lang/String;
    .end local v2           #innerPrefix:Ljava/lang/String;
    .end local v3           #num:I
    .end local v4           #op:Landroid/support/v4/app/BackStackRecord$Op;
    :cond_10
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 284
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public getBreadCrumbShortTitle()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 357
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;

    iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 360
    :goto_0
    #v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    #v0=(Reference);
    goto :goto_0
.end method

.method public getBreadCrumbShortTitleRes()I
    .locals 1

    .prologue
    .line 346
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v0=(Integer);
    return v0
.end method

.method public getBreadCrumbTitle()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 350
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;

    iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 353
    :goto_0
    #v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    #v0=(Reference);
    goto :goto_0
.end method

.method public getBreadCrumbTitleRes()I
    .locals 1

    .prologue
    .line 342
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    #v0=(Integer);
    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 338
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v0=(Integer);
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 775
    iget-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTransition()I
    .locals 1

    .prologue
    .line 779
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v0=(Integer);
    return v0
.end method

.method public getTransitionStyle()I
    .locals 1

    .prologue
    .line 783
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v0=(Integer);
    return v0
.end method

.method public hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"

    .prologue
    .line 443
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 444
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    const/4 v1, 0x4

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 445
    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 446
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 448
    return-object p0
.end method

.method public isAddToBackStackAllowed()Z
    .locals 1

    .prologue
    .line 512
    iget-boolean v0, p0, Landroid/support/v4/app/BackStackRecord;->mAllowAddToBackStack:Z

    #v0=(Boolean);
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 787
    iget v0, p0, Landroid/support/v4/app/BackStackRecord;->mNumOp:I

    #v0=(Integer);
    if-nez v0, :cond_0

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

.method public popFromBackStack(Z)V
    .locals 12
    .parameter "doStateMove"

    .prologue
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v9, 0x0

    #v9=(Null);
    const/4 v11, -0x1

    .line 691
    #v11=(Byte);
    sget-boolean v6, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v6=(Boolean);
    if-eqz v6, :cond_0

    .line 692
    const-string v6, "FragmentManager"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "popFromBackStack: "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    new-instance v2, Landroid/support/v4/util/LogWriter;

    #v2=(UninitRef);
    const-string v6, "FragmentManager"

    invoke-direct {v2, v6}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V

    .line 694
    .local v2, logw:Landroid/support/v4/util/LogWriter;
    #v2=(Reference);
    new-instance v5, Ljava/io/PrintWriter;

    #v5=(UninitRef);
    invoke-direct {v5, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 695
    .local v5, pw:Ljava/io/PrintWriter;
    #v5=(Reference);
    const-string v6, "  "

    invoke-virtual {p0, v6, v10, v5, v10}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 698
    .end local v2           #logw:Landroid/support/v4/util/LogWriter;
    .end local v5           #pw:Ljava/io/PrintWriter;
    :cond_0
    #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {p0, v11}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V

    .line 700
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mTail:Landroid/support/v4/app/BackStackRecord$Op;

    .line 701
    .local v4, op:Landroid/support/v4/app/BackStackRecord$Op;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference);
    if-eqz v4, :cond_3

    .line 702
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v6=(Integer);
    packed-switch v6, :pswitch_data_0

    .line 756
    new-instance v6, Ljava/lang/IllegalArgumentException;

    #v6=(UninitRef);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "Unknown cmd: "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v8, v4, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v8=(Integer);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    throw v6

    .line 704
    :pswitch_0
    #v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 705
    .local v0, f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 706
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V

    .line 760
    :cond_1
    :goto_1
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v4, v4, Landroid/support/v4/app/BackStackRecord$Op;->prev:Landroid/support/v4/app/BackStackRecord$Op;

    goto :goto_0

    .line 711
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_1
    #v0=(Conflicted);v6=(Integer);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 712
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 713
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 714
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V

    .line 718
    :cond_2
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v6=(Reference);
    if-eqz v6, :cond_1

    .line 719
    const/4 v1, 0x0

    .local v1, i:I
    :goto_2
    #v1=(Integer);
    iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    #v6=(Integer);
    if-ge v1, v6, :cond_1

    .line 720
    iget-object v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v6=(Reference);
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/app/Fragment;

    .line 721
    .local v3, old:Landroid/support/v4/app/Fragment;
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    #v6=(Integer);
    iput v6, v3, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 722
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    invoke-virtual {v6, v3, v9}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V

    .line 719
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 727
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    .end local v1           #i:I
    .end local v3           #old:Landroid/support/v4/app/Fragment;
    :pswitch_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Integer);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 728
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 729
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    invoke-virtual {v6, v0, v9}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V

    goto :goto_1

    .line 732
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_3
    #v0=(Conflicted);v6=(Integer);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 733
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 734
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V

    goto :goto_1

    .line 738
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_4
    #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 739
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 740
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V

    goto :goto_1

    .line 744
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_5
    #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 745
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 746
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V

    goto :goto_1

    .line 750
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_6
    #v0=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    iget-object v0, v4, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 751
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v6, v4, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    iput v6, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 752
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v7=(Integer);
    invoke-static {v7}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v7

    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v8=(Integer);
    invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 763
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :cond_3
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-eqz p1, :cond_4

    .line 764
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    iget v7, v7, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I

    #v7=(Integer);
    iget v8, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v8=(Integer);
    invoke-static {v8}, Landroid/support/v4/app/FragmentManagerImpl;->reverseTransit(I)I

    move-result v8

    iget v9, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v9=(Integer);
    const/4 v10, 0x1

    #v10=(One);
    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V

    .line 768
    :cond_4
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Boolean);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v6=(Integer);
    if-ltz v6, :cond_5

    .line 769
    iget-object v6, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v7=(Integer);
    invoke-virtual {v6, v7}, Landroid/support/v4/app/FragmentManagerImpl;->freeBackStackIndex(I)V

    .line 770
    iput v11, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    .line 772
    :cond_5
    #v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 702
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"

    .prologue
    .line 434
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 435
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 436
    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 437
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 439
    return-object p0
.end method

.method public replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "containerViewId"
    .parameter "fragment"

    .prologue
    .line 421
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/BackStackRecord;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "containerViewId"
    .parameter "fragment"
    .parameter "tag"

    .prologue
    .line 425
    if-nez p1, :cond_0

    .line 426
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Must use non-zero containerViewId"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 429
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/BackStackRecord;->doAddOp(ILandroid/support/v4/app/Fragment;Ljava/lang/String;I)V

    .line 430
    return-object p0
.end method

.method public run()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    #v8=(One);
    const/4 v7, 0x0

    .line 600
    #v7=(Null);
    sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v4=(Boolean);
    if-eqz v4, :cond_0

    const-string v4, "FragmentManager"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Run: "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    :cond_0
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 603
    iget v4, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v4=(Integer);
    if-gez v4, :cond_1

    .line 604
    new-instance v4, Ljava/lang/IllegalStateException;

    #v4=(UninitRef);
    const-string v5, "addToBackStack() called after commit()"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 608
    :cond_1
    #v4=(Integer);v5=(Conflicted);
    invoke-virtual {p0, v8}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V

    .line 610
    iget-object v3, p0, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 611
    .local v3, op:Landroid/support/v4/app/BackStackRecord$Op;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference);v4=(Conflicted);
    if-eqz v3, :cond_a

    .line 612
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v4=(Integer);
    packed-switch v4, :pswitch_data_0

    .line 675
    new-instance v4, Ljava/lang/IllegalArgumentException;

    #v4=(UninitRef);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Unknown cmd: "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v6=(Integer);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 614
    :pswitch_0
    #v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 615
    .local v0, f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 616
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4, v0, v7}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V

    .line 679
    :cond_2
    :goto_1
    #v4=(Conflicted);
    iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    goto :goto_0

    .line 619
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_1
    #v0=(Conflicted);v4=(Integer);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 620
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;

    if-eqz v4, :cond_9

    .line 621
    const/4 v1, 0x0

    .local v1, i:I
    :goto_2
    #v1=(Integer);v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    #v4=(Integer);
    if-ge v1, v4, :cond_9

    .line 622
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget-object v4, v4, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/Fragment;

    .line 623
    .local v2, old:Landroid/support/v4/app/Fragment;
    sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v4=(Boolean);
    if-eqz v4, :cond_3

    const-string v4, "FragmentManager"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "OP_REPLACE: adding="

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " old="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 625
    :cond_3
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz v0, :cond_4

    iget v4, v2, Landroid/support/v4/app/Fragment;->mContainerId:I

    #v4=(Integer);
    iget v5, v0, Landroid/support/v4/app/Fragment;->mContainerId:I

    #v5=(Integer);
    if-ne v4, v5, :cond_5

    .line 626
    :cond_4
    #v4=(Conflicted);v5=(Conflicted);
    if-ne v2, v0, :cond_6

    .line 627
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 621
    :cond_5
    :goto_3
    #v0=(Reference);
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 629
    :cond_6
    iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v4=(Reference);
    if-nez v4, :cond_7

    .line 630
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    iput-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    .line 632
    :cond_7
    iget-object v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 633
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    #v4=(Integer);
    iput v4, v2, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 634
    iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v4=(Boolean);
    if-eqz v4, :cond_8

    .line 635
    iget v4, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    iput v4, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    .line 636
    sget-boolean v4, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v4=(Boolean);
    if-eqz v4, :cond_8

    const-string v4, "FragmentManager"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Bump nesting of "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, v2, Landroid/support/v4/app/Fragment;->mBackStackNesting:I

    #v6=(Integer);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 639
    :cond_8
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v2, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V

    goto :goto_3

    .line 644
    .end local v1           #i:I
    .end local v2           #old:Landroid/support/v4/app/Fragment;
    :cond_9
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz v0, :cond_2

    .line 645
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    #v4=(Integer);
    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 646
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4, v0, v7}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V

    goto/16 :goto_1

    .line 650
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_2
    #v0=(Conflicted);v4=(Integer);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 651
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 652
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->removeFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 655
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_3
    #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 656
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 657
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->hideFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 660
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_4
    #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 661
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 662
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->showFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 665
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_5
    #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 666
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 667
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->detachFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 670
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :pswitch_6
    #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v0, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 671
    .restart local v0       #f:Landroid/support/v4/app/Fragment;
    #v0=(Reference);
    iget v4, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    iput v4, v0, Landroid/support/v4/app/Fragment;->mNextAnim:I

    .line 672
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v6=(Integer);
    invoke-virtual {v4, v0, v5, v6}, Landroid/support/v4/app/FragmentManagerImpl;->attachFragment(Landroid/support/v4/app/Fragment;II)V

    goto/16 :goto_1

    .line 682
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :cond_a
    #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v5=(Reference);
    iget v5, v5, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    #v7=(Integer);
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V

    .line 685
    iget-boolean v4, p0, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v4=(Boolean);
    if-eqz v4, :cond_b

    .line 686
    iget-object v4, p0, Landroid/support/v4/app/BackStackRecord;->mManager:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4, p0}, Landroid/support/v4/app/FragmentManagerImpl;->addBackStackState(Landroid/support/v4/app/BackStackRecord;)V

    .line 688
    :cond_b
    #v4=(Conflicted);
    return-void

    .line 612
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public setBreadCrumbShortTitle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "res"

    .prologue
    .line 537
    iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    .line 538
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    .line 539
    return-object p0
.end method

.method public setBreadCrumbShortTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "text"

    .prologue
    .line 543
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    .line 544
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    .line 545
    return-object p0
.end method

.method public setBreadCrumbTitle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "res"

    .prologue
    .line 525
    iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    .line 526
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    .line 527
    return-object p0
.end method

.method public setBreadCrumbTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "text"

    .prologue
    .line 531
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    .line 532
    iput-object p1, p0, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    .line 533
    return-object p0
.end method

.method public setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .parameter "enter"
    .parameter "exit"

    .prologue
    const/4 v0, 0x0

    .line 479
    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0, v0}, Landroid/support/v4/app/BackStackRecord;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;
    .locals 0
    .parameter "enter"
    .parameter "exit"
    .parameter "popEnter"
    .parameter "popExit"

    .prologue
    .line 484
    iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mEnterAnim:I

    .line 485
    iput p2, p0, Landroid/support/v4/app/BackStackRecord;->mExitAnim:I

    .line 486
    iput p3, p0, Landroid/support/v4/app/BackStackRecord;->mPopEnterAnim:I

    .line 487
    iput p4, p0, Landroid/support/v4/app/BackStackRecord;->mPopExitAnim:I

    .line 488
    return-object p0
.end method

.method public setTransition(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 0
    .parameter "transition"

    .prologue
    .line 492
    iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    .line 493
    return-object p0
.end method

.method public setTransitionStyle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 0
    .parameter "styleRes"

    .prologue
    .line 497
    iput p1, p0, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    .line 498
    return-object p0
.end method

.method public show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 2
    .parameter "fragment"

    .prologue
    .line 452
    new-instance v0, Landroid/support/v4/app/BackStackRecord$Op;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 453
    .local v0, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v0=(Reference);
    const/4 v1, 0x5

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 454
    iput-object p1, v0, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 455
    invoke-virtual {p0, v0}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 457
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const/16 v1, 0x80

    #v1=(PosShort);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 222
    .local v0, sb:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const-string v1, "BackStackEntry{"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v1=(Integer);
    if-ltz v1, :cond_0

    .line 225
    const-string v1, " #"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    iget v1, p0, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 229
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    iget-object v1, p0, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

*/}
