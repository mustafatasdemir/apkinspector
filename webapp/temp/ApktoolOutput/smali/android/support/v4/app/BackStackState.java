package android.support.v4.app; class BackStackState {/*

.class final Landroid/support/v4/app/BackStackState;
.super Ljava/lang/Object;
.source "BackStackRecord.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Landroid/support/v4/app/BackStackState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mBreadCrumbShortTitleRes:I

.field final mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

.field final mBreadCrumbTitleRes:I

.field final mBreadCrumbTitleText:Ljava/lang/CharSequence;

.field final mIndex:I

.field final mName:Ljava/lang/String;

.field final mOps:[I

.field final mTransition:I

.field final mTransitionStyle:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 157
    new-instance v0, Landroid/support/v4/app/BackStackState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/BackStackState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .parameter "in"

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/BackStackState;->mTransition:I

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/BackStackState;->mIndex:I

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I

    .line 90
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I

    .line 92
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    .line 93
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/BackStackRecord;)V
    .locals 8
    .parameter "fm"
    .parameter "bse"

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    #p0=(Reference);
    const/4 v2, 0x0

    .line 42
    .local v2, numRemoved:I
    #v2=(Null);
    iget-object v3, p2, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 43
    .local v3, op:Landroid/support/v4/app/BackStackRecord$Op;
    :goto_0
    #v2=(Integer);v3=(Reference);v6=(Conflicted);
    if-eqz v3, :cond_1

    .line 44
    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v6=(Reference);
    if-eqz v6, :cond_0

    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    #v6=(Integer);
    add-int/2addr v2, v6

    .line 45
    :cond_0
    #v6=(Conflicted);
    iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    goto :goto_0

    .line 47
    :cond_1
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mNumOp:I

    #v6=(Integer);
    mul-int/lit8 v6, v6, 0x7

    add-int/2addr v6, v2

    new-array v6, v6, [I

    #v6=(Reference);
    iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    .line 49
    iget-boolean v6, p2, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    #v6=(Boolean);
    if-nez v6, :cond_2

    .line 50
    new-instance v6, Ljava/lang/IllegalStateException;

    #v6=(UninitRef);
    const-string v7, "Not on back stack"

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    throw v6

    .line 53
    :cond_2
    #v6=(Boolean);v7=(Uninit);
    iget-object v3, p2, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;

    .line 54
    const/4 v4, 0x0

    .local v4, pos:I
    #v4=(Null);
    move v5, v4

    .line 55
    .end local v4           #pos:I
    .local v5, pos:I
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
    if-eqz v3, :cond_6

    .line 56
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v6=(Reference);
    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    #v7=(Integer);
    aput v7, v6, v5

    .line 57
    iget-object v7, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v7=(Reference);
    add-int/lit8 v5, v4, 0x1

    .end local v4           #pos:I
    .restart local v5       #pos:I
    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    if-eqz v6, :cond_3

    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    iget v6, v6, Landroid/support/v4/app/Fragment;->mIndex:I

    :goto_2
    #v6=(Integer);
    aput v6, v7, v4

    .line 58
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v6=(Reference);
    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    #v7=(Integer);
    aput v7, v6, v5

    .line 59
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v5, v4, 0x1

    .end local v4           #pos:I
    .restart local v5       #pos:I
    iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    aput v7, v6, v4

    .line 60
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    aput v7, v6, v5

    .line 61
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v5, v4, 0x1

    .end local v4           #pos:I
    .restart local v5       #pos:I
    iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    aput v7, v6, v4

    .line 62
    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    if-eqz v6, :cond_5

    .line 63
    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 64
    .local v0, N:I
    #v0=(Integer);
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    aput v0, v6, v5

    .line 65
    const/4 v1, 0x0

    .local v1, i:I
    #v1=(Null);
    move v5, v4

    .end local v4           #pos:I
    .restart local v5       #pos:I
    :goto_3
    #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
    if-ge v1, v0, :cond_4

    .line 66
    iget-object v7, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v7=(Reference);
    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    #v6=(Reference);
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/support/v4/app/Fragment;

    iget v6, v6, Landroid/support/v4/app/Fragment;->mIndex:I

    #v6=(Integer);
    aput v6, v7, v5

    .line 65
    add-int/lit8 v1, v1, 0x1

    move v5, v4

    .end local v4           #pos:I
    .restart local v5       #pos:I
    goto :goto_3

    .line 57
    .end local v0           #N:I
    .end local v1           #i:I
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v6=(Reference);
    const/4 v6, -0x1

    #v6=(Byte);
    goto :goto_2

    .restart local v0       #N:I
    .restart local v1       #i:I
    :cond_4
    #v0=(Integer);v1=(Integer);v6=(Conflicted);v7=(Conflicted);
    move v4, v5

    .line 71
    .end local v0           #N:I
    .end local v1           #i:I
    .end local v5           #pos:I
    .restart local v4       #pos:I
    :goto_4
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;

    move v5, v4

    .end local v4           #pos:I
    .restart local v5       #pos:I
    goto :goto_1

    .line 69
    :cond_5
    #v6=(Reference);v7=(Integer);
    iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v4, v5, 0x1

    .end local v5           #pos:I
    .restart local v4       #pos:I
    const/4 v7, 0x0

    #v7=(Null);
    aput v7, v6, v5

    goto :goto_4

    .line 73
    .end local v4           #pos:I
    .restart local v5       #pos:I
    :cond_6
    #v6=(Conflicted);v7=(Conflicted);
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    #v6=(Integer);
    iput v6, p0, Landroid/support/v4/app/BackStackState;->mTransition:I

    .line 74
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    iput v6, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I

    .line 75
    iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    #v6=(Reference);
    iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;

    .line 76
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    #v6=(Integer);
    iput v6, p0, Landroid/support/v4/app/BackStackState;->mIndex:I

    .line 77
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    iput v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I

    .line 78
    iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    #v6=(Reference);
    iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    .line 79
    iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    #v6=(Integer);
    iput v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I

    .line 80
    iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    #v6=(Reference);
    iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    .line 81
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public instantiate(Landroid/support/v4/app/FragmentManagerImpl;)Landroid/support/v4/app/BackStackRecord;
    .locals 14
    .parameter "fm"

    .prologue
    const/4 v13, 0x1

    .line 96
    #v13=(One);
    new-instance v1, Landroid/support/v4/app/BackStackRecord;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Landroid/support/v4/app/BackStackRecord;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V

    .line 97
    .local v1, bse:Landroid/support/v4/app/BackStackRecord;
    #v1=(Reference);
    const/4 v7, 0x0

    .line 98
    .local v7, pos:I
    #v7=(Null);
    const/4 v5, 0x0

    .line 99
    .local v5, num:I
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    array-length v10, v10

    #v10=(Integer);
    if-ge v7, v10, :cond_4

    .line 100
    new-instance v6, Landroid/support/v4/app/BackStackRecord$Op;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V

    .line 101
    .local v6, op:Landroid/support/v4/app/BackStackRecord$Op;
    #v6=(Reference);
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v8, v7, 0x1

    .end local v7           #pos:I
    .local v8, pos:I
    #v8=(Integer);
    aget v10, v10, v7

    #v10=(Integer);
    iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I

    .line 102
    sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v10=(Boolean);
    if-eqz v10, :cond_0

    const-string v10, "FragmentManager"

    #v10=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "Instantiate "

    #v12=(Reference);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " op #"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " base fragment #"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    aget v12, v12, v8

    #v12=(Integer);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    :cond_0
    #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v7, v8, 0x1

    .end local v8           #pos:I
    .restart local v7       #pos:I
    aget v3, v10, v8

    .line 105
    .local v3, findex:I
    #v3=(Integer);
    if-ltz v3, :cond_2

    .line 106
    iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/Fragment;

    .line 107
    .local v2, f:Landroid/support/v4/app/Fragment;
    iput-object v2, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    .line 111
    .end local v2           #f:Landroid/support/v4/app/Fragment;
    :goto_1
    #v2=(Conflicted);
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    add-int/lit8 v8, v7, 0x1

    .end local v7           #pos:I
    .restart local v8       #pos:I
    aget v10, v10, v7

    #v10=(Integer);
    iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I

    .line 112
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v7, v8, 0x1

    .end local v8           #pos:I
    .restart local v7       #pos:I
    aget v10, v10, v8

    #v10=(Integer);
    iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I

    .line 113
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v8, v7, 0x1

    .end local v7           #pos:I
    .restart local v8       #pos:I
    aget v10, v10, v7

    #v10=(Integer);
    iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I

    .line 114
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v7, v8, 0x1

    .end local v8           #pos:I
    .restart local v7       #pos:I
    aget v10, v10, v8

    #v10=(Integer);
    iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I

    .line 115
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v10=(Reference);
    add-int/lit8 v8, v7, 0x1

    .end local v7           #pos:I
    .restart local v8       #pos:I
    aget v0, v10, v7

    .line 116
    .local v0, N:I
    #v0=(Integer);
    if-lez v0, :cond_3

    .line 117
    new-instance v10, Ljava/util/ArrayList;

    #v10=(UninitRef);
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    #v10=(Reference);
    iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    .line 118
    const/4 v4, 0x0

    .local v4, i:I
    :goto_2
    #v4=(Integer);
    if-ge v4, v0, :cond_3

    .line 119
    sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v10=(Boolean);
    if-eqz v10, :cond_1

    const-string v10, "FragmentManager"

    #v10=(Reference);
    new-instance v11, Ljava/lang/StringBuilder;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    #v11=(Reference);
    const-string v12, "Instantiate "

    #v12=(Reference);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " set remove fragment #"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    aget v12, v12, v8

    #v12=(Integer);
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    :cond_1
    #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;

    #v10=(Reference);
    iget-object v11, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v11=(Reference);
    add-int/lit8 v7, v8, 0x1

    .end local v8           #pos:I
    .restart local v7       #pos:I
    aget v11, v11, v8

    #v11=(Integer);
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Landroid/support/v4/app/Fragment;

    .line 122
    .local v9, r:Landroid/support/v4/app/Fragment;
    iget-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    add-int/lit8 v4, v4, 0x1

    move v8, v7

    .end local v7           #pos:I
    .restart local v8       #pos:I
    goto :goto_2

    .line 109
    .end local v0           #N:I
    .end local v4           #i:I
    .end local v8           #pos:I
    .end local v9           #r:Landroid/support/v4/app/Fragment;
    .restart local v7       #pos:I
    :cond_2
    #v0=(Conflicted);v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    const/4 v10, 0x0

    #v10=(Null);
    iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;

    goto :goto_1

    .end local v7           #pos:I
    .restart local v0       #N:I
    .restart local v8       #pos:I
    :cond_3
    #v0=(Integer);v10=(Reference);
    move v7, v8

    .line 125
    .end local v8           #pos:I
    .restart local v7       #pos:I
    invoke-virtual {v1, v6}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V

    .line 126
    add-int/lit8 v5, v5, 0x1

    .line 127
    goto/16 :goto_0

    .line 128
    .end local v0           #N:I
    .end local v3           #findex:I
    .end local v6           #op:Landroid/support/v4/app/BackStackRecord$Op;
    :cond_4
    #v0=(Conflicted);v3=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Integer);
    iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransition:I

    iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransition:I

    .line 129
    iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I

    iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I

    .line 130
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;

    #v10=(Reference);
    iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;

    .line 131
    iget v10, p0, Landroid/support/v4/app/BackStackState;->mIndex:I

    #v10=(Integer);
    iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mIndex:I

    .line 132
    iput-boolean v13, v1, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z

    .line 133
    iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I

    iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I

    .line 134
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    #v10=(Reference);
    iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    .line 135
    iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I

    #v10=(Integer);
    iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I

    .line 136
    iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    #v10=(Reference);
    iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    .line 137
    invoke-virtual {v1, v13}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V

    .line 138
    return-object v1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .parameter "dest"
    .parameter "flags"

    .prologue
    const/4 v1, 0x0

    .line 146
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mOps:[I

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 147
    iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransition:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 148
    iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 149
    iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget v0, p0, Landroid/support/v4/app/BackStackState;->mIndex:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;

    #v0=(Reference);
    invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 153
    iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 154
    iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;

    #v0=(Reference);
    invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 155
    return-void
.end method

*/}
