package android.support.v4.net; class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl { void a() { int a;
a=0;// .class Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConnectivityManagerCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/net/ConnectivityManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "BaseConnectivityManagerCompatImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
a=0;//     .locals 3
a=0;//     .param p1, "cm"    # Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 40
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "info":Landroid/net/NetworkInfo;
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(One);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 47
a=0;//     .local v1, "type":I
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :pswitch_1
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 47
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
