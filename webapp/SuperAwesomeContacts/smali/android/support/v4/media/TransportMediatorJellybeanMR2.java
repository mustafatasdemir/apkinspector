package android.support.v4.media; class TransportMediatorJellybeanMR2 { void a() { int a;
a=0;// .class Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TransportMediatorJellybeanMR2.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/media/RemoteControlClient$OnGetPlaybackPositionListener;
a=0;// .implements Landroid/media/RemoteControlClient$OnPlaybackPositionUpdateListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
a=0;// 
a=0;// .field mAudioFocused:Z
a=0;// 
a=0;// .field final mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mFocused:Z
a=0;// 
a=0;// .field final mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field final mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// .field mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field mPlayState:I
a=0;// 
a=0;// .field final mReceiverAction:Ljava/lang/String;
a=0;// 
a=0;// .field final mReceiverFilter:Landroid/content/IntentFilter;
a=0;// 
a=0;// .field mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;// .field final mTargetView:Landroid/view/View;
a=0;// 
a=0;// .field final mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;// .field final mWindowAttachListener:Landroid/view/ViewTreeObserver$OnWindowAttachListener;
a=0;// 
a=0;// .field final mWindowFocusListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/view/View;Landroid/support/v4/media/TransportMediatorCallback;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "audioManager"    # Landroid/media/AudioManager;
a=0;//     .param p3, "view"    # Landroid/view/View;
a=0;//     .param p4, "transportCallback"    # Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediatorJellybeanMR2$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2$1;-><init>(Landroid/support/v4/media/TransportMediatorJellybeanMR2;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowAttachListener:Landroid/view/ViewTreeObserver$OnWindowAttachListener;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediatorJellybeanMR2$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2$2;-><init>(Landroid/support/v4/media/TransportMediatorJellybeanMR2;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowFocusListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;-><init>(Landroid/support/v4/media/TransportMediatorJellybeanMR2;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediatorJellybeanMR2$4;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediatorJellybeanMR2$4;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2$4;-><init>(Landroid/support/v4/media/TransportMediatorJellybeanMR2;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2$4;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     .line 87
a=0;//     iput-object p1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     .line 89
a=0;//     iput-object p3, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
a=0;// 
a=0;//     .line 90
a=0;//     iput-object p4, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ":transport:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverAction:Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverAction:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverFilter:Landroid/content/IntentFilter;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverFilter:Landroid/content/IntentFilter;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverAction:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowAttachListener:Landroid/view/ViewTreeObserver$OnWindowAttachListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowAttachListener(Landroid/view/ViewTreeObserver$OnWindowAttachListener;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowFocusListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->windowDetached()V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowAttachListener:Landroid/view/ViewTreeObserver$OnWindowAttachListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewTreeObserver$OnWindowAttachListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowAttachListener(Landroid/view/ViewTreeObserver$OnWindowAttachListener;)V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTargetView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mWindowFocusListener:Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dropAudioFocus()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/AudioManager;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/AudioManager$OnAudioFocusChangeListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method gainFocus()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/AudioManager;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerMediaButtonEventReceiver(Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/AudioManager;->registerRemoteControlClient(Landroid/media/RemoteControlClient;)V
a=0;// 
a=0;//     .line 124
a=0;//     iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->takeAudioFocus()V
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getRemoteControlClient()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method loseFocus()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
a=0;// 
a=0;//     .line 191
a=0;//     iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/AudioManager;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterRemoteControlClient(Landroid/media/RemoteControlClient;)V
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterMediaButtonEventReceiver(Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onGetPlaybackPosition()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorCallback;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/media/TransportMediatorCallback;->getPlaybackPosition()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public onPlaybackPositionUpdate(J)V
a=0;//     .locals 1
a=0;//     .param p1, "newPositionMs"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mTransportCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorCallback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/media/TransportMediatorCallback;->playbackPositionUpdate(J)V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public pausePlaying()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 167
a=0;//     #v2=(PosByte);
a=0;//     iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     iput v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     invoke-virtual {v0, v2}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public refreshState(ZJI)V
a=0;//     .locals 3
a=0;//     .param p1, "playing"    # Z
a=0;//     .param p2, "position"    # J
a=0;//     .param p4, "transportControls"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v2=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     const/high16 v0, 0x3f800000
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v1, p2, p3, v0}, Landroid/media/RemoteControlClient;->setPlaybackState(IJF)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     invoke-virtual {v0, p4}, Landroid/media/RemoteControlClient;->setTransportControlFlags(I)V
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 160
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public startPlaying()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     .line 139
a=0;//     #v1=(PosByte);
a=0;//     iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     iput v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mFocused:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->takeAudioFocus()V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public stopPlaying()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 175
a=0;//     #v1=(One);
a=0;//     iget v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     iput v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPlayState:I
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/media/RemoteControlClient;->setPlaybackState(I)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->dropAudioFocus()V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method takeAudioFocus()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 131
a=0;//     #v3=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     iput-boolean v3, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocused:Z
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/AudioManager;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/media/AudioManager$OnAudioFocusChangeListener;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method windowAttached()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/BroadcastReceiver;);
a=0;//     iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mReceiverFilter:Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/IntentFilter;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v0, Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/media/RemoteControlClient;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-direct {v0, v1}, Landroid/media/RemoteControlClient;-><init>(Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/media/RemoteControlClient;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/media/RemoteControlClient;->setOnGetPlaybackPositionListener(Landroid/media/RemoteControlClient$OnGetPlaybackPositionListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/media/RemoteControlClient;->setPlaybackPositionUpdateListener(Landroid/media/RemoteControlClient$OnPlaybackPositionUpdateListener;)V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method windowDetached()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->loseFocus()V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mMediaButtonReceiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/BroadcastReceiver;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/PendingIntent;->cancel()V
a=0;// 
a=0;//     .line 203
a=0;//     iput-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mPendingIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 204
a=0;//     iput-object v2, p0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->mRemoteControl:Landroid/media/RemoteControlClient;
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
