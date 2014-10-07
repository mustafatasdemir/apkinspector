package android.support.v4.app; class NotificationCompatSideChannelService {/*

.class public abstract Landroid/support/v4/app/NotificationCompatSideChannelService;
.super Landroid/app/Service;
.source "NotificationCompatSideChannelService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompatSideChannelService$1;,
        Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;
    }
.end annotation


# static fields
.field private static final BUILD_VERSION_CODE_KITKAT_WATCH:I = 0x14


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 76
    #p0=(Reference);
    return-void
.end method

.method static synthetic access$100(Landroid/support/v4/app/NotificationCompatSideChannelService;ILjava/lang/String;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Landroid/support/v4/app/NotificationCompatSideChannelService;->checkPermission(ILjava/lang/String;)V

    return-void
.end method

.method private checkPermission(ILjava/lang/String;)V
    .locals 7
    .parameter "callingUid"
    .parameter "packageName"

    .prologue
    .line 113
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatSideChannelService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v0

    .local v0, arr$:[Ljava/lang/String;
    #v0=(Reference);
    array-length v2, v0

    .local v2, len$:I
    #v2=(Integer);
    const/4 v1, 0x0

    .local v1, i$:I
    :goto_0
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 114
    .local v3, validPackage:Ljava/lang/String;
    #v3=(Null);
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 115
    return-void

    .line 113
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 118
    .end local v3           #validPackage:Ljava/lang/String;
    :cond_1
    #v3=(Conflicted);v4=(Conflicted);
    new-instance v4, Ljava/lang/SecurityException;

    #v4=(UninitRef);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "NotificationSideChannelService: Uid "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " is not authorized for package "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4
.end method


# virtual methods
.method public abstract cancel(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public abstract cancelAll(Ljava/lang/String;)V
.end method

.method public abstract notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3
    .parameter "intent"

    .prologue
    const/4 v0, 0x0

    .line 50
    #v0=(Null);
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 53
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0x14

    #v2=(PosByte);
    if-lt v1, v2, :cond_1

    .line 58
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 56
    :cond_1
    #v0=(Null);v1=(Integer);v2=(PosByte);
    new-instance v1, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v0}, Landroid/support/v4/app/NotificationCompatSideChannelService$NotificationSideChannelStub;-><init>(Landroid/support/v4/app/NotificationCompatSideChannelService;Landroid/support/v4/app/NotificationCompatSideChannelService$1;)V

    #v1=(Reference);
    move-object v0, v1

    #v0=(Reference);
    goto :goto_0
.end method

*/}
