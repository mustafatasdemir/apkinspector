package android.support.v4.net; class ConnectivityManagerCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/net/ConnectivityManagerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ConnectivityManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;,
a=0;//         Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;,
a=0;//         Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;,
a=0;//         Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;,
a=0;//         Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 74
a=0;//     #p0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getNetworkInfoFromBroadcast(Landroid/net/ConnectivityManager;Landroid/content/Intent;)Landroid/net/NetworkInfo;
a=0;//     .locals 2
a=0;//     .param p0, "cm"    # Landroid/net/ConnectivityManager;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     const-string v1, "networkInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/net/NetworkInfo;
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "info":Landroid/net/NetworkInfo;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/net/NetworkInfo;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
a=0;//     .locals 1
a=0;//     .param p0, "cm"    # Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     sget-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;->isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
