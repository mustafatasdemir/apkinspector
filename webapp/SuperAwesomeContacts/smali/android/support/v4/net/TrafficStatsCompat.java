package android.support.v4.net; class TrafficStatsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/net/TrafficStatsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TrafficStatsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/net/TrafficStatsCompat$1;,
a=0;//         Landroid/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;,
a=0;//         Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;,
a=0;//         Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Landroid/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$IcsTrafficStatsCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #p0=(Reference,Landroid/support/v4/net/TrafficStatsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clearThreadStatsTag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->clearThreadStatsTag()V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getThreadStatsTag()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->getThreadStatsTag()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static incrementOperationCount(I)V
a=0;//     .locals 1
a=0;//     .param p0, "operationCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->incrementOperationCount(I)V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static incrementOperationCount(II)V
a=0;//     .locals 1
a=0;//     .param p0, "tag"    # I
a=0;//     .param p1, "operationCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->incrementOperationCount(II)V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setThreadStatsTag(I)V
a=0;//     .locals 1
a=0;//     .param p0, "tag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->setThreadStatsTag(I)V
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static tagSocket(Ljava/net/Socket;)V
a=0;//     .locals 1
a=0;//     .param p0, "socket"    # Ljava/net/Socket;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/SocketException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->tagSocket(Ljava/net/Socket;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static untagSocket(Ljava/net/Socket;)V
a=0;//     .locals 1
a=0;//     .param p0, "socket"    # Ljava/net/Socket;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/SocketException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->untagSocket(Ljava/net/Socket;)V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
}}
