package android.support.v4.media; class TransportPerformer { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/media/TransportPerformer;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TransportPerformer.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final AUDIOFOCUS_GAIN:I = 0x1
a=0;// 
a=0;// .field static final AUDIOFOCUS_GAIN_TRANSIENT:I = 0x2
a=0;// 
a=0;// .field static final AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:I = 0x3
a=0;// 
a=0;// .field static final AUDIOFOCUS_LOSS:I = -0x1
a=0;// 
a=0;// .field static final AUDIOFOCUS_LOSS_TRANSIENT:I = -0x2
a=0;// 
a=0;// .field static final AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:I = -0x3
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAudioFocusChange(I)V
a=0;//     .locals 8
a=0;//     .param p1, "focusChange"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     .local v6, "keyCode":I
a=0;//     #v6=(Null);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     #v6=(PosByte);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 198
a=0;//     .local v1, "now":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-wide v3, v1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/view/KeyEvent;-><init>(JJIII)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/KeyEvent;);
a=0;//     invoke-virtual {p0, v6, v0}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v0, Landroid/view/KeyEvent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/KeyEvent;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     move-wide v3, v1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/view/KeyEvent;-><init>(JJIII)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/KeyEvent;);
a=0;//     invoke-virtual {p0, v6, v0}, Landroid/support/v4/media/TransportPerformer;->onMediaButtonUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     .line 201
a=0;//     .end local v1    # "now":J
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 193
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Uninit);
a=0;//     const/16 v6, 0x7f
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 189
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onGetBufferPercentage()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract onGetCurrentPosition()J
a=0;// .end method
a=0;// 
a=0;// .method public abstract onGetDuration()J
a=0;// .end method
a=0;// 
a=0;// .method public onGetTransportControlFlags()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const/16 v0, 0x3c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract onIsPlaying()Z
a=0;// .end method
a=0;// 
a=0;// .method public onMediaButtonDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 127
a=0;//     #v1=(One);
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 129
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     :sswitch_1
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :sswitch_2
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStop()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :sswitch_3
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x4f -> :sswitch_3
a=0;//         0x55 -> :sswitch_3
a=0;//         0x56 -> :sswitch_2
a=0;//         0x7e -> :sswitch_0
a=0;//         0x7f -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public onMediaButtonUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract onPause()V
a=0;// .end method
a=0;// 
a=0;// .method public abstract onSeekTo(J)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract onStart()V
a=0;// .end method
a=0;// 
a=0;// .method public abstract onStop()V
a=0;// .end method
}}
