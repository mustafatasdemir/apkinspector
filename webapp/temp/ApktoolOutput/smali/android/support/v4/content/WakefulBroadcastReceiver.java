package android.support.v4.content; class WakefulBroadcastReceiver {/*

.class public abstract Landroid/support/v4/content/WakefulBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "WakefulBroadcastReceiver.java"


# static fields
.field private static final EXTRA_WAKE_LOCK_ID:Ljava/lang/String; = "android.support.content.wakelockid"

.field private static final mActiveWakeLocks:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/PowerManager$WakeLock;",
            ">;"
        }
    .end annotation
.end field

.field private static mNextId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    .line 64
    const/4 v0, 0x1

    #v0=(One);
    sput v0, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static completeWakefulIntent(Landroid/content/Intent;)Z
    .locals 7
    .parameter "intent"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 113
    #v2=(Null);
    const-string v4, "android.support.content.wakelockid"

    #v4=(Reference);
    invoke-virtual {p0, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 114
    .local v0, id:I
    #v0=(Integer);
    if-nez v0, :cond_0

    .line 131
    :goto_0
    #v1=(Conflicted);v2=(Boolean);v5=(Conflicted);v6=(Conflicted);
    return v2

    .line 117
    :cond_0
    #v1=(Uninit);v2=(Null);v5=(Uninit);v6=(Uninit);
    sget-object v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    monitor-enter v4

    .line 118
    :try_start_0
    sget-object v2, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/os/PowerManager$WakeLock;

    .line 119
    .local v1, wl:Landroid/os/PowerManager$WakeLock;
    if-eqz v1, :cond_1

    .line 120
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 121
    sget-object v2, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 122
    monitor-exit v4

    move v2, v3

    #v2=(One);
    goto :goto_0

    .line 130
    :cond_1
    #v2=(Reference);
    const-string v2, "WakefulBroadcastReceiver"

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "No active wake lock id #"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    monitor-exit v4

    move v2, v3

    #v2=(One);
    goto :goto_0

    .line 132
    .end local v1           #wl:Landroid/os/PowerManager$WakeLock;
    :catchall_0
    #v1=(Conflicted);v2=(Reference);v5=(Conflicted);v6=(Conflicted);
    move-exception v2

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static startWakefulService(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 8
    .parameter "context"
    .parameter "intent"

    .prologue
    .line 81
    sget-object v5, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    #v5=(Reference);
    monitor-enter v5

    .line 82
    :try_start_0
    sget v1, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    .line 83
    .local v1, id:I
    #v1=(Integer);
    sget v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    sput v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    .line 84
    sget v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    if-gtz v4, :cond_0

    .line 85
    const/4 v4, 0x1

    #v4=(One);
    sput v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I

    .line 88
    :cond_0
    #v4=(Integer);
    const-string v4, "android.support.content.wakelockid"

    #v4=(Reference);
    invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 89
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    .line 90
    .local v0, comp:Landroid/content/ComponentName;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 91
    const/4 v0, 0x0

    #v0=(Null);
    monitor-exit v5

    .line 100
    .end local v0           #comp:Landroid/content/ComponentName;
    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v0

    .line 94
    .restart local v0       #comp:Landroid/content/ComponentName;
    :cond_1
    #v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);
    const-string v4, "power"

    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/os/PowerManager;

    .line 95
    .local v2, pm:Landroid/os/PowerManager;
    const/4 v4, 0x1

    #v4=(One);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "wake:"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v3

    .line 97
    .local v3, wl:Landroid/os/PowerManager$WakeLock;
    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v3, v4}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 98
    const-wide/32 v6, 0xea60

    #v6=(LongLo);v7=(LongHi);
    invoke-virtual {v3, v6, v7}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 99
    sget-object v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;

    #v4=(Reference);
    invoke-virtual {v4, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 100
    monitor-exit v5

    goto :goto_0

    .line 101
    .end local v0           #comp:Landroid/content/ComponentName;
    .end local v1           #id:I
    .end local v2           #pm:Landroid/os/PowerManager;
    .end local v3           #wl:Landroid/os/PowerManager$WakeLock;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v4

    #v4=(Reference);
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

*/}
