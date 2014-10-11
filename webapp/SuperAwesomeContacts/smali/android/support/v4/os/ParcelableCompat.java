package android.support.v4.os; class ParcelableCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/os/ParcelableCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ParcelableCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/os/ParcelableCompat$CompatCreator;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Landroid/support/v4/os/ParcelableCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static newCreator(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)Landroid/os/Parcelable$Creator;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Landroid/support/v4/os/ParcelableCompatCreatorCallbacks",
a=0;//             "<TT;>;)",
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     .local p0, "callbacks":Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;, "Landroid/support/v4/os/ParcelableCompatCreatorCallbacks<TT;>;"
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     invoke-static {p0}, Landroid/support/v4/os/ParcelableCompatCreatorHoneycombMR2Stub;->instantiate(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     new-instance v0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/os/ParcelableCompat$CompatCreator;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/os/ParcelableCompat$CompatCreator;-><init>(Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/os/ParcelableCompat$CompatCreator;);
a=0;//     return-object v0
a=0;// .end method
}}
