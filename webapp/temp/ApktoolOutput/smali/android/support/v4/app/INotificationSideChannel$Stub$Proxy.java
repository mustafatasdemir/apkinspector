package android.support.v4.app; class INotificationSideChannel$Stub$Proxy {/*

.class Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
.super Ljava/lang/Object;
.source "INotificationSideChannel.java"

# interfaces
.implements Landroid/support/v4/app/INotificationSideChannel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/INotificationSideChannel$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Proxy"
.end annotation


# instance fields
.field private mRemote:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0
    .parameter "remote"

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    .line 99
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    #v0=(Reference);
    return-object v0
.end method

.method public cancel(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5
    .parameter "packageName"
    .parameter "id"
    .parameter "tag"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 137
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 139
    .local v0, _data:Landroid/os/Parcel;
    :try_start_0
    #v0=(Reference);
    const-string v1, "android.support.v4.app.INotificationSideChannel"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v2, 0x2

    #v2=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x1

    #v4=(One);
    invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 148
    return-void

    .line 146
    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw v1
.end method

.method public cancelAll(Ljava/lang/String;)V
    .locals 5
    .parameter "packageName"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 154
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 156
    .local v0, _data:Landroid/os/Parcel;
    :try_start_0
    #v0=(Reference);
    const-string v1, "android.support.v4.app.INotificationSideChannel"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x1

    #v4=(One);
    invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 163
    return-void

    .line 161
    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw v1
.end method

.method public getInterfaceDescriptor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 106
    const-string v0, "android.support.v4.app.INotificationSideChannel"

    #v0=(Reference);
    return-object v0
.end method

.method public notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    .locals 5
    .parameter "packageName"
    .parameter "id"
    .parameter "tag"
    .parameter "notification"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 113
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    .line 115
    .local v0, _data:Landroid/os/Parcel;
    :try_start_0
    #v0=(Reference);
    const-string v1, "android.support.v4.app.INotificationSideChannel"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 119
    if-eqz p4, :cond_0

    .line 120
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p4, v0, v1}, Landroid/app/Notification;->writeToParcel(Landroid/os/Parcel;I)V

    .line 126
    :goto_0
    iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x1

    #v4=(One);
    invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 131
    return-void

    .line 124
    :cond_0
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);
    const/4 v1, 0x0

    :try_start_1
    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 129
    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw v1
.end method

*/}
