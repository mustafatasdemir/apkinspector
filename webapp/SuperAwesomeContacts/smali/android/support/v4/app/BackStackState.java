package android.support.v4.app; class BackStackState { void a() { int a;
a=0;// .class final Landroid/support/v4/app/BackStackState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BackStackRecord.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/BackStackState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mBreadCrumbShortTitleRes:I
a=0;// 
a=0;// .field final mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final mBreadCrumbTitleRes:I
a=0;// 
a=0;// .field final mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final mIndex:I
a=0;// 
a=0;// .field final mName:Ljava/lang/String;
a=0;// 
a=0;// .field final mOps:[I
a=0;// 
a=0;// .field final mTransition:I
a=0;// 
a=0;// .field final mTransitionStyle:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/BackStackState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackState$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #p0=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     .line 90
a=0;//     sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     .line 92
a=0;//     sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/BackStackRecord;)V
a=0;//     .locals 8
a=0;//     .param p1, "fm"    # Landroid/support/v4/app/FragmentManagerImpl;
a=0;//     .param p2, "bse"    # Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     .local v2, "numRemoved":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p2, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 43
a=0;//     .local v3, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);v6=(Conflicted);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v2, v6
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mNumOp:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v6, v6, 0x7
a=0;// 
a=0;//     add-int/2addr v6, v2
a=0;// 
a=0;//     new-array v6, v6, [I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     .line 49
a=0;//     iget-boolean v6, p2, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v6, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v7, "Not on back stack"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 53
a=0;//     :cond_2
a=0;//     #v6=(Boolean);v7=(Uninit);
a=0;//     iget-object v3, p2, Landroid/support/v4/app/BackStackRecord;->mHead:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "pos":I
a=0;//     #v4=(Null);
a=0;//     move v5, v4
a=0;// 
a=0;//     .line 55
a=0;//     .end local v4    # "pos":I
a=0;//     .local v5, "pos":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aput v7, v6, v5
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v7, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v6, v6, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(Integer);
a=0;//     aput v6, v7, v4
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aput v7, v6, v5
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     aput v7, v6, v4
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     aput v7, v6, v5
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     iget v7, v3, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     aput v7, v6, v4
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 64
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     aput v0, v6, v5
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     #v1=(Null);
a=0;//     move v5, v4
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     :goto_3
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v7, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     iget-object v6, v3, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v6, v6, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v7, v5
a=0;// 
a=0;//     .line 65
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 57
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "i":I
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 71
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "i":I
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/BackStackRecord$Op;->next:Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 69
a=0;//     :cond_5
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);v7=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "pos":I
a=0;//     .restart local v4    # "pos":I
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput v7, v6, v5
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 73
a=0;//     .end local v4    # "pos":I
a=0;//     .restart local v5    # "pos":I
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
a=0;// 
a=0;//     .line 74
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     iput v6, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 76
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
a=0;// 
a=0;//     .line 77
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     iput v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 79
a=0;//     iget v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v6, p2, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public instantiate(Landroid/support/v4/app/FragmentManagerImpl;)Landroid/support/v4/app/BackStackRecord;
a=0;//     .locals 14
a=0;//     .param p1, "fm"    # Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     .line 96
a=0;//     #v13=(One);
a=0;//     new-instance v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/BackStackRecord;);
a=0;//     invoke-direct {v1, p1}, Landroid/support/v4/app/BackStackRecord;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V
a=0;// 
a=0;//     .line 97
a=0;//     .local v1, "bse":Landroid/support/v4/app/BackStackRecord;
a=0;//     #v1=(Reference,Landroid/support/v4/app/BackStackRecord;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 98
a=0;//     .local v7, "pos":I
a=0;//     #v7=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     .local v5, "num":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     array-length v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ge v7, v10, :cond_4
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v6, Landroid/support/v4/app/BackStackRecord$Op;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     invoke-direct {v6}, Landroid/support/v4/app/BackStackRecord$Op;-><init>()V
a=0;// 
a=0;//     .line 101
a=0;//     .local v6, "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     #v6=(Reference,Landroid/support/v4/app/BackStackRecord$Op;);
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .local v8, "pos":I
a=0;//     #v8=(Integer);
a=0;//     aget v10, v10, v7
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->cmd:I
a=0;// 
a=0;//     .line 102
a=0;//     sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     const-string v10, "FragmentManager"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "Instantiate "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " op #"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " base fragment #"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     aget v12, v12, v8
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "pos":I
a=0;//     .restart local v7    # "pos":I
a=0;//     aget v3, v10, v8
a=0;// 
a=0;//     .line 105
a=0;//     .local v3, "findex":I
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_2
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 107
a=0;//     .local v2, "f":Landroid/support/v4/app/Fragment;
a=0;//     iput-object v2, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 111
a=0;//     .end local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .restart local v8    # "pos":I
a=0;//     aget v10, v10, v7
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->enterAnim:I
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "pos":I
a=0;//     .restart local v7    # "pos":I
a=0;//     aget v10, v10, v8
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->exitAnim:I
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .restart local v8    # "pos":I
a=0;//     aget v10, v10, v7
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popEnterAnim:I
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "pos":I
a=0;//     .restart local v7    # "pos":I
a=0;//     aget v10, v10, v8
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->popExitAnim:I
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .restart local v8    # "pos":I
a=0;//     aget v0, v10, v7
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 117
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     if-ge v4, v0, :cond_3
a=0;// 
a=0;//     .line 119
a=0;//     sget-boolean v10, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     const-string v10, "FragmentManager"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "Instantiate "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " set remove fragment #"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     aget v12, v12, v8
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v10, p1, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v11, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v11=(Reference,[I);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "pos":I
a=0;//     .restart local v7    # "pos":I
a=0;//     aget v11, v11, v8
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 122
a=0;//     .local v9, "r":Landroid/support/v4/app/Fragment;
a=0;//     iget-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->removed:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 118
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     move v8, v7
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .restart local v8    # "pos":I
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "N":I
a=0;//     .end local v4    # "i":I
a=0;//     .end local v8    # "pos":I
a=0;//     .end local v9    # "r":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v7    # "pos":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iput-object v10, v6, Landroid/support/v4/app/BackStackRecord$Op;->fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v7    # "pos":I
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v8    # "pos":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);v10=(Reference,Ljava/lang/Object;);
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 125
a=0;//     .end local v8    # "pos":I
a=0;//     .restart local v7    # "pos":I
a=0;//     invoke-virtual {v1, v6}, Landroid/support/v4/app/BackStackRecord;->addOp(Landroid/support/v4/app/BackStackRecord$Op;)V
a=0;// 
a=0;//     .line 126
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 127
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v0    # "N":I
a=0;//     .end local v3    # "findex":I
a=0;//     .end local v6    # "op":Landroid/support/v4/app/BackStackRecord$Op;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Integer);
a=0;//     iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
a=0;// 
a=0;//     iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransition:I
a=0;// 
a=0;//     .line 129
a=0;//     iget v10, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
a=0;// 
a=0;//     iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mTransitionStyle:I
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mName:Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     iget v10, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     .line 132
a=0;//     iput-boolean v13, v1, Landroid/support/v4/app/BackStackRecord;->mAddToBackStack:Z
a=0;// 
a=0;//     .line 133
a=0;//     iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 135
a=0;//     iget v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iput v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v10, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v10, v1, Landroid/support/v4/app/BackStackRecord;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v1, v13}, Landroid/support/v4/app/BackStackRecord;->bumpBackStackNesting(I)V
a=0;// 
a=0;//     .line 138
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 2
a=0;//     .param p1, "dest"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mOps:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V
a=0;// 
a=0;//     .line 147
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 148
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->mTransitionStyle:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 151
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleRes:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 153
a=0;//     iget v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Landroid/support/v4/app/BackStackState;->mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
}}
