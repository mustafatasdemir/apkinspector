package android.support.v4.content; class WakefulBroadcastReceiver { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/content/WakefulBroadcastReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// .source "WakefulBroadcastReceiver.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final EXTRA_WAKE_LOCK_ID:Ljava/lang/String; = "android.support.content.wakelockid"
a=0;// 
a=0;// .field private static final mActiveWakeLocks:Landroid/util/SparseArray;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/PowerManager$WakeLock;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static mNextId:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     sput-object v0, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/content/WakefulBroadcastReceiver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static completeWakefulIntent(Landroid/content/Intent;)Z
a=0;//     .locals 7
a=0;//     .param p0, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     #v2=(Null);
a=0;//     const-string v4, "android.support.content.wakelockid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "id":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 118
a=0;//     :try_start_0
a=0;//     sget-object v2, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "wl":Landroid/os/PowerManager$WakeLock;
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V
a=0;// 
a=0;//     .line 121
a=0;//     sget-object v2, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/util/SparseArray;->remove(I)V
a=0;// 
a=0;//     .line 122
a=0;//     monitor-exit v4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_1
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     const-string v2, "WakefulBroadcastReceiver"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "No active wake lock id #"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 131
a=0;//     monitor-exit v4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v1    # "wl":Landroid/os/PowerManager$WakeLock;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public static startWakefulService(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     sget-object v5, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v5=(Reference,Landroid/util/SparseArray;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     .line 82
a=0;//     :try_start_0
a=0;//     sget v1, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     sget v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     sput v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     .line 84
a=0;//     sget v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     sput v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mNextId:I
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     const-string v4, "android.support.content.wakelockid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "comp":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "comp":Landroid/content/ComponentName;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .restart local v0    # "comp":Landroid/content/ComponentName;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v4, "power"
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/os/PowerManager;
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "pm":Landroid/os/PowerManager;
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "wake:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v4, v6}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 97
a=0;//     .local v3, "wl":Landroid/os/PowerManager$WakeLock;
a=0;//     #v3=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
a=0;// 
a=0;//     .line 98
a=0;//     const-wide/32 v6, 0xea60
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v3, v6, v7}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
a=0;// 
a=0;//     .line 99
a=0;//     sget-object v4, Landroid/support/v4/content/WakefulBroadcastReceiver;->mActiveWakeLocks:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v4, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 100
a=0;//     monitor-exit v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     .end local v0    # "comp":Landroid/content/ComponentName;
a=0;//     .end local v1    # "id":I
a=0;//     .end local v2    # "pm":Landroid/os/PowerManager;
a=0;//     .end local v3    # "wl":Landroid/os/PowerManager$WakeLock;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v4
a=0;// .end method
}}
