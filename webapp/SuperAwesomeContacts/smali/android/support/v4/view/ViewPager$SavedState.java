package android.support.v4.view; class ViewPager$SavedState { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewPager$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/ViewPager;
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
a=0;//             "Landroid/support/v4/view/ViewPager$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;// .field position:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1241
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$SavedState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$SavedState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$SavedState$1;);
a=0;//     invoke-static {v0}, Landroid/support/v4/os/ParcelableCompat;->newCreator(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;//     .param p2, "loader"    # Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1254
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 1255
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 1256
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 1258
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     .line 1259
a=0;//     invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1260
a=0;//     iput-object p2, p0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 1261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1224
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1225
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1236
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "FragmentPager.SavedState{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
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
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " position="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1229
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 1230
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1231
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
a=0;// 
a=0;//     .line 1232
a=0;//     return-void
a=0;// .end method
}}
