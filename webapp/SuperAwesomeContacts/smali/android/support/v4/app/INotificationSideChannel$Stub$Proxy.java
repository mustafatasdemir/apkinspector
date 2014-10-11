package android.support.v4.app; class INotificationSideChannel$Stub$Proxy { void a() { int a;
a=0;// .class Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "INotificationSideChannel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/INotificationSideChannel$Stub;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "Proxy"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mRemote:Landroid/os/IBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/os/IBinder;)V
a=0;//     .locals 0
a=0;//     .param p1, "remote"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     #p0=(Reference,Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iget-object v0, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/IBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public cancel(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v1, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// 
a=0;//     .line 146
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v1, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getInterfaceDescriptor()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     const-string v0, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;//     .locals 5
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;//     .param p4, "notification"    # Landroid/app/Notification;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "_data":Landroid/os/Parcel;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/os/Parcel;);
a=0;//     const-string v1, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p4, v0, v1}, Landroid/app/Notification;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/IBinder;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
}}
