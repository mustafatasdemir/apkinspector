package android.support.v4.app; class INotificationSideChannel$Stub { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/INotificationSideChannel$Stub;
a=0;// .super Landroid/os/Binder;
a=0;// .source "INotificationSideChannel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/INotificationSideChannel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Stub"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DESCRIPTOR:Ljava/lang/String; = "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;// .field static final TRANSACTION_cancel:I = 0x2
a=0;// 
a=0;// .field static final TRANSACTION_cancelAll:I = 0x3
a=0;// 
a=0;// .field static final TRANSACTION_notify:I = 0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Landroid/os/Binder;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Landroid/support/v4/app/INotificationSideChannel$Stub;);
a=0;//     const-string v0, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p0, v0}, Landroid/support/v4/app/INotificationSideChannel$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asInterface(Landroid/os/IBinder;)Landroid/support/v4/app/INotificationSideChannel;
a=0;//     .locals 2
a=0;//     .param p0, "obj"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const-string v1, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "iin":Landroid/os/IInterface;
a=0;//     #v0=(Reference,Landroid/os/IInterface;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     instance-of v1, v0, Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     check-cast v0, Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
a=0;// 
a=0;//     .end local v0    # "iin":Landroid/os/IInterface;
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public asBinder()Landroid/os/IBinder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;//     .locals 6
a=0;//     .param p1, "code"    # I
a=0;//     .param p2, "data"    # Landroid/os/Parcel;
a=0;//     .param p3, "reply"    # Landroid/os/Parcel;
a=0;//     .param p4, "flags"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 44
a=0;//     #v4=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 91
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 48
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v5=(Uninit);
a=0;//     const-string v5, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 53
a=0;//     :sswitch_1
a=0;//     #v5=(Uninit);
a=0;//     const-string v5, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 59
a=0;//     .local v1, "_arg1":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 61
a=0;//     .local v2, "_arg2":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v5, Landroid/app/Notification;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Parcelable$Creator;);
a=0;//     invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/app/Notification;
a=0;// 
a=0;//     .line 67
a=0;//     .local v3, "_arg3":Landroid/app/Notification;
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p0, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel$Stub;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     .end local v3    # "_arg3":Landroid/app/Notification;
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "_arg3":Landroid/app/Notification;
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "_arg0":Ljava/lang/String;
a=0;//     .end local v1    # "_arg1":I
a=0;//     .end local v2    # "_arg2":Ljava/lang/String;
a=0;//     .end local v3    # "_arg3":Landroid/app/Notification;
a=0;//     :sswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     const-string v5, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 76
a=0;//     .restart local v0    # "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 78
a=0;//     .restart local v1    # "_arg1":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 79
a=0;//     .restart local v2    # "_arg2":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancel(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .end local v0    # "_arg0":Ljava/lang/String;
a=0;//     .end local v1    # "_arg1":I
a=0;//     .end local v2    # "_arg2":Ljava/lang/String;
a=0;//     :sswitch_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v5=(Uninit);
a=0;//     const-string v5, "android.support.v4.app.INotificationSideChannel"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v0    # "_arg0":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancelAll(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_2
a=0;//         0x3 -> :sswitch_3
a=0;//         0x5f4e5446 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
