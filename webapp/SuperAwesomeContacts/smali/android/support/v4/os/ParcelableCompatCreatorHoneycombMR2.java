package android.support.v4.os; class ParcelableCompatCreatorHoneycombMR2 { void a() { int a;
a=0;// .class Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ParcelableCompatHoneycombMR2.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable$ClassLoaderCreator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/os/Parcelable$ClassLoaderCreator",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/os/ParcelableCompatCreatorCallbacks",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/os/ParcelableCompatCreatorCallbacks",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     .local p0, "this":Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;, "Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2<TT;>;"
a=0;//     .local p1, "callbacks":Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;, "Landroid/support/v4/os/ParcelableCompatCreatorCallbacks<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;);
a=0;//     iput-object p1, p0, Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/os/Parcel;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     .local p0, "this":Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;, "Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;//     .param p2, "loader"    # Ljava/lang/ClassLoader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/os/Parcel;",
a=0;//             "Ljava/lang/ClassLoader;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;, "Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public newArray(I)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "size"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     .local p0, "this":Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;, "Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->newArray(I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
