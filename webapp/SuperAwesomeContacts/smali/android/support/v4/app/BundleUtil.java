package android.support.v4.app; class BundleUtil { void a() { int a;
a=0;// .class Landroid/support/v4/app/BundleUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BundleUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/BundleUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
a=0;//     .locals 4
a=0;//     .param p0, "bundle"    # Landroid/os/Bundle;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 19
a=0;//     .local v0, "array":[Landroid/os/Parcelable;
a=0;//     #v0=(Reference,[Landroid/os/Parcelable;);
a=0;//     instance-of v2, v0, [Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 20
a=0;//     :cond_0
a=0;//     check-cast v0, [Landroid/os/Bundle;
a=0;// 
a=0;//     .end local v0    # "array":[Landroid/os/Parcelable;
a=0;//     check-cast v0, [Landroid/os/Bundle;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 25
a=0;//     :goto_0
a=0;//     #v1=(Reference,[Landroid/os/Bundle;);v2=(Integer);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 22
a=0;//     .restart local v0    # "array":[Landroid/os/Parcelable;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-class v3, [Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v1, [Landroid/os/Bundle;
a=0;// 
a=0;//     .line 24
a=0;//     .local v1, "typedArray":[Landroid/os/Bundle;
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
