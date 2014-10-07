package android.support.v4.app; class INotificationSideChannel$Stub {/*

.class public abstract Landroid/support/v4/app/INotificationSideChannel$Stub;
.super Landroid/os/Binder;
.source "INotificationSideChannel.java"

# interfaces
.implements Landroid/support/v4/app/INotificationSideChannel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/INotificationSideChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "android.support.v4.app.INotificationSideChannel"

.field static final TRANSACTION_cancel:I = 0x2

.field static final TRANSACTION_cancelAll:I = 0x3

.field static final TRANSACTION_notify:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 21
    #p0=(Reference);
    const-string v0, "android.support.v4.app.INotificationSideChannel"

    #v0=(Reference);
    invoke-virtual {p0, p0, v0}, Landroid/support/v4/app/INotificationSideChannel$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Landroid/support/v4/app/INotificationSideChannel;
    .locals 2
    .parameter "obj"

    .prologue
    .line 29
    if-nez p0, :cond_0

    .line 30
    const/4 v0, 0x0

    .line 36
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    .line 32
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const-string v1, "android.support.v4.app.INotificationSideChannel"

    #v1=(Reference);
    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 33
    .local v0, iin:Landroid/os/IInterface;
    #v0=(Reference);
    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/support/v4/app/INotificationSideChannel;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 34
    check-cast v0, Landroid/support/v4/app/INotificationSideChannel;

    goto :goto_0

    .line 36
    :cond_1
    #v1=(Conflicted);
    new-instance v0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;

    .end local v0           #iin:Landroid/os/IInterface;
    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 40
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6
    .parameter "code"
    .parameter "data"
    .parameter "reply"
    .parameter "flags"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 44
    #v4=(One);
    sparse-switch p1, :sswitch_data_0

    .line 91
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v4

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);
    return v4

    .line 48
    :sswitch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v5=(Uninit);
    const-string v5, "android.support.v4.app.INotificationSideChannel"

    #v5=(Reference);
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 53
    :sswitch_1
    #v5=(Uninit);
    const-string v5, "android.support.v4.app.INotificationSideChannel"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 57
    .local v0, _arg0:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 59
    .local v1, _arg1:I
    #v1=(Integer);
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 61
    .local v2, _arg2:Ljava/lang/String;
    #v2=(Reference);
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    #v5=(Integer);
    if-eqz v5, :cond_0

    .line 62
    sget-object v5, Landroid/app/Notification;->CREATOR:Landroid/os/Parcelable$Creator;

    #v5=(Reference);
    invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/app/Notification;

    .line 67
    .local v3, _arg3:Landroid/app/Notification;
    :goto_1
    #v5=(Conflicted);
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel$Stub;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    goto :goto_0

    .line 65
    .end local v3           #_arg3:Landroid/app/Notification;
    :cond_0
    #v3=(Uninit);v5=(Integer);
    const/4 v3, 0x0

    .restart local v3       #_arg3:Landroid/app/Notification;
    #v3=(Null);
    goto :goto_1

    .line 72
    .end local v0           #_arg0:Ljava/lang/String;
    .end local v1           #_arg1:I
    .end local v2           #_arg2:Ljava/lang/String;
    .end local v3           #_arg3:Landroid/app/Notification;
    :sswitch_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
    const-string v5, "android.support.v4.app.INotificationSideChannel"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 76
    .restart local v0       #_arg0:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 78
    .restart local v1       #_arg1:I
    #v1=(Integer);
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 79
    .restart local v2       #_arg2:Ljava/lang/String;
    #v2=(Reference);
    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancel(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    .line 84
    .end local v0           #_arg0:Ljava/lang/String;
    .end local v1           #_arg1:I
    .end local v2           #_arg2:Ljava/lang/String;
    :sswitch_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v5=(Uninit);
    const-string v5, "android.support.v4.app.INotificationSideChannel"

    #v5=(Reference);
    invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 87
    .restart local v0       #_arg0:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancelAll(Ljava/lang/String;)V

    goto :goto_0

    .line 44
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method

*/}
