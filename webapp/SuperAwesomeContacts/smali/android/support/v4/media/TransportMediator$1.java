package android.support.v4.media; class TransportMediator$1 { void a() { int a;
a=0;// .class Landroid/support/v4/media/TransportMediator$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TransportMediator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/media/TransportMediator;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/media/TransportMediator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iput-object p1, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediator$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getPlaybackPosition()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public handleAudioFocusChange(I)V
a=0;//     .locals 1
a=0;//     .param p1, "focusChange"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/media/TransportPerformer;->onAudioFocusChange(I)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public handleKey(Landroid/view/KeyEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mKeyEventCallback:Landroid/view/KeyEvent$Callback;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;)Z
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public playbackPositionUpdate(J)V
a=0;//     .locals 1
a=0;//     .param p1, "newPositionMs"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator$1;->this$0:Landroid/support/v4/media/TransportMediator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     iget-object v0, v0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onSeekTo(J)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
}}
