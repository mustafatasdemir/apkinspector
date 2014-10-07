package android.support.v4.app; class FragmentState {/*

.class final Landroid/support/v4/app/FragmentState;
.super Ljava/lang/Object;
.source "Fragment.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Landroid/support/v4/app/FragmentState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mArguments:Landroid/os/Bundle;

.field final mClassName:Ljava/lang/String;

.field final mContainerId:I

.field final mDetached:Z

.field final mFragmentId:I

.field final mFromLayout:Z

.field final mIndex:I

.field mInstance:Landroid/support/v4/app/Fragment;

.field final mRetainInstance:Z

.field mSavedFragmentState:Landroid/os/Bundle;

.field final mTag:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 138
    new-instance v0, Landroid/support/v4/app/FragmentState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/FragmentState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/FragmentState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3
    .parameter "in"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 77
    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_2

    :goto_2
    #v1=(Boolean);
    iput-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;

    .line 88
    return-void

    :cond_0
    #v0=(Integer);v1=(One);
    move v0, v2

    .line 80
    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Integer);
    move v0, v2

    .line 84
    #v0=(Null);
    goto :goto_1

    :cond_2
    #v0=(Integer);
    move v1, v2

    .line 85
    #v1=(Null);
    goto :goto_2
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;)V
    .locals 1
    .parameter "frag"

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    #p0=(Reference);
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;

    .line 67
    iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I

    .line 68
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mFromLayout:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z

    .line 69
    iget v0, p1, Landroid/support/v4/app/Fragment;->mFragmentId:I

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I

    .line 70
    iget v0, p1, Landroid/support/v4/app/Fragment;->mContainerId:I

    iput v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I

    .line 71
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;

    .line 72
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetainInstance:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z

    .line 73
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z

    iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z

    .line 74
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    .line 75
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public instantiate(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
    .locals 3
    .parameter "activity"
    .parameter "parent"

    .prologue
    .line 91
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    .line 118
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 95
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 99
    :cond_1
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;

    iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    #v1=(Reference);
    invoke-static {p1, v0, v1}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    .line 101
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 102
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 103
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;

    iput-object v1, v0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    .line 105
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget v1, p0, Landroid/support/v4/app/FragmentState;->mIndex:I

    #v1=(Integer);
    invoke-virtual {v0, v1, p2}, Landroid/support/v4/app/Fragment;->setIndex(ILandroid/support/v4/app/Fragment;)V

    .line 106
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z

    #v1=(Boolean);
    iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mFromLayout:Z

    .line 107
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRestored:Z

    .line 108
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget v1, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I

    #v1=(Integer);
    iput v1, v0, Landroid/support/v4/app/Fragment;->mFragmentId:I

    .line 109
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget v1, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I

    iput v1, v0, Landroid/support/v4/app/Fragment;->mContainerId:I

    .line 110
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;

    #v1=(Reference);
    iput-object v1, v0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    .line 111
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z

    #v1=(Boolean);
    iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z

    .line 112
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z

    iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mDetached:Z

    .line 113
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    iget-object v1, p1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    iput-object v1, v0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;

    .line 115
    sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const-string v0, "FragmentManager"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Instantiated fragment "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    :cond_3
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;

    #v0=(Reference);
    goto/16 :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .parameter "dest"
    .parameter "flags"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 126
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 127
    iget v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 128
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 129
    iget v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    iget v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 132
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z

    if-eqz v0, :cond_2

    :goto_2
    #v1=(Boolean);
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 134
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 135
    iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 136
    return-void

    :cond_0
    #v0=(Boolean);v1=(One);
    move v0, v2

    .line 128
    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Boolean);
    move v0, v2

    .line 132
    #v0=(Null);
    goto :goto_1

    :cond_2
    #v0=(Boolean);
    move v1, v2

    .line 133
    #v1=(Null);
    goto :goto_2
.end method

*/}
