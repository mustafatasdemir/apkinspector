package android.support.v4.net; class ConnectivityManagerCompatGingerbread { void a() { int a;
a=0;// .class Landroid/support/v4/net/ConnectivityManagerCompatGingerbread;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConnectivityManagerCompatGingerbread.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompatGingerbread;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
a=0;//     .locals 3
a=0;//     .param p0, "cm"    # Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 35
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
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
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(One);
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 42
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
a=0;//     .line 42
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
