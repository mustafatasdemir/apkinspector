package android.support.v4.app; class Fragment$SavedState { void a() { int a;
a=0;// .class public Landroid/support/v4/app/Fragment$SavedState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Fragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/Fragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "SavedState"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mState:Landroid/os/Bundle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     new-instance v0, Landroid/support/v4/app/Fragment$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/Fragment$SavedState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/Fragment$SavedState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment$SavedState$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/Fragment$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "state"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 312
a=0;//     #p0=(Reference,Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 313
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;//     .param p2, "loader"    # Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 316
a=0;//     #p0=(Reference,Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 317
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 320
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "dest"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 330
a=0;//     return-void
a=0;// .end method
}}
