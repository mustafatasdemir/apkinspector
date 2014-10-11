package android.support.v4.app; class NotificationCompatSideChannelService { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/NotificationCompatSideChannelService;
a=0;// .super Landroid/app/Service;
a=0;// .source "NotificationCompatSideChannelService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompatSideChannelService$1;,
a=0;//         Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BUILD_VERSION_CODE_KITKAT_WATCH:I = 0x14
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatSideChannelService;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/app/NotificationCompatSideChannelService;ILjava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/app/NotificationCompatSideChannelService;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/app/NotificationCompatSideChannelService;->checkPermission(ILjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkPermission(ILjava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "callingUid"    # I
a=0;//     .param p2, "packageName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatSideChannelService;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v4, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     .line 114
a=0;//     .local v3, "validPackage":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     .end local v3    # "validPackage":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "NotificationSideChannelService: Uid "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " is not authorized for package "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract cancel(Ljava/lang/String;ILjava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract cancelAll(Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;// .end method
a=0;// 
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 3
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;);
a=0;//     invoke-direct {v1, p0, v0}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;-><init>(Landroid/support/v4/app/NotificationCompatSideChannelService;Landroid/support/v4/app/NotificationCompatSideChannelService$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;);
a=0;//     goto :goto_0
a=0;// .end method
}}
