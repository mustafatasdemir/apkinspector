package android.support.v4.app; class FragmentState { void a() { int a;
a=0;// .class final Landroid/support/v4/app/FragmentState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Fragment.java"
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
a=0;//             "Landroid/support/v4/app/FragmentState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mArguments:Landroid/os/Bundle;
a=0;// 
a=0;// .field final mClassName:Ljava/lang/String;
a=0;// 
a=0;// .field final mContainerId:I
a=0;// 
a=0;// .field final mDetached:Z
a=0;// 
a=0;// .field final mFragmentId:I
a=0;// 
a=0;// .field final mFromLayout:Z
a=0;// 
a=0;// .field final mIndex:I
a=0;// 
a=0;// .field mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field final mRetainInstance:Z
a=0;// 
a=0;// .field mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;// .field final mTag:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentState$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 3
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 1
a=0;//     .param p1, "frag"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 67
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
a=0;// 
a=0;//     .line 68
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
a=0;// 
a=0;//     .line 69
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
a=0;// 
a=0;//     .line 70
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
a=0;// 
a=0;//     .line 73
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public instantiate(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;//     .param p1, "activity"    # Landroid/support/v4/app/FragmentActivity;
a=0;//     .param p2, "parent"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {p1, v0, v1}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/support/v4/app/Fragment;->setIndex(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRestored:Z
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 115
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Instantiated fragment "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 118
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 3
a=0;//     .param p1, "dest"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 126
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 129
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->mFragmentId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 130
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentState;->mContainerId:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mRetainInstance:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentState;->mDetached:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 132
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 133
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
