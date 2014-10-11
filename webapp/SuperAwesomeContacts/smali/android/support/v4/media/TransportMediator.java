package android.support.v4.media; class TransportMediator { void a() { int a;
a=0;// .class public Landroid/support/v4/media/TransportMediator;
a=0;// .super Landroid/support/v4/media/TransportController;
a=0;// .source "TransportMediator.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FLAG_KEY_MEDIA_FAST_FORWARD:I = 0x40
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_NEXT:I = 0x80
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_PAUSE:I = 0x10
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_PLAY:I = 0x4
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_PLAY_PAUSE:I = 0x8
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_PREVIOUS:I = 0x1
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_REWIND:I = 0x2
a=0;// 
a=0;// .field public static final FLAG_KEY_MEDIA_STOP:I = 0x20
a=0;// 
a=0;// .field public static final KEYCODE_MEDIA_PAUSE:I = 0x7f
a=0;// 
a=0;// .field public static final KEYCODE_MEDIA_PLAY:I = 0x7e
a=0;// 
a=0;// .field public static final KEYCODE_MEDIA_RECORD:I = 0x82
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;// .field final mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field final mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;// .field final mDispatcherState:Ljava/lang/Object;
a=0;// 
a=0;// .field final mKeyEventCallback:Landroid/view/KeyEvent$Callback;
a=0;// 
a=0;// .field final mListeners:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/media/TransportStateListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final mTransportKeyCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;// .field final mView:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/support/v4/media/TransportPerformer;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "callbacks"    # Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, p2}, Landroid/support/v4/media/TransportMediator;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/support/v4/media/TransportPerformer;)V
a=0;// 
a=0;//     .line 153
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/app/Activity;Landroid/view/View;Landroid/support/v4/media/TransportPerformer;)V
a=0;//     .locals 5
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "callbacks"    # Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportController;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediator$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediator$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediator$1;-><init>(Landroid/support/v4/media/TransportMediator;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mTransportKeyCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediator$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediator$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/media/TransportMediator$2;-><init>(Landroid/support/v4/media/TransportMediator;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediator$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mKeyEventCallback:Landroid/view/KeyEvent$Callback;
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 161
a=0;//     iput-object p3, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "audio"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/media/AudioManager;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     .line 163
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .end local p2    # "view":Landroid/view/View;
a=0;//     :cond_0
a=0;//     iput-object p2, p0, Landroid/support/v4/media/TransportMediator;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/view/KeyEventCompat;->getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mDispatcherState:Ljava/lang/Object;
a=0;// 
a=0;//     .line 165
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x12
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 166
a=0;//     new-instance v0, Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Landroid/support/v4/media/TransportMediator;->mAudioManager:Landroid/media/AudioManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/media/AudioManager;);
a=0;//     iget-object v3, p0, Landroid/support/v4/media/TransportMediator;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Landroid/support/v4/media/TransportMediator;->mTransportKeyCallback:Landroid/support/v4/media/TransportMediatorCallback;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/media/TransportMediatorCallback;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/view/View;Landroid/support/v4/media/TransportMediatorCallback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     .line 171
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 160
a=0;//     .restart local p2    # "view":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     .end local p2    # "view":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;Landroid/support/v4/media/TransportPerformer;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "callbacks"    # Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1, p2}, Landroid/support/v4/media/TransportMediator;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/support/v4/media/TransportPerformer;)V
a=0;// 
a=0;//     .line 157
a=0;//     #p0=(Reference,Landroid/support/v4/media/TransportMediator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getListeners()[Landroid/support/v4/media/TransportStateListener;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 217
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Landroid/support/v4/media/TransportStateListener;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v0, v1, [Landroid/support/v4/media/TransportStateListener;
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "listeners":[Landroid/support/v4/media/TransportStateListener;
a=0;//     #v0=(Reference,[Landroid/support/v4/media/TransportStateListener;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static isMediaKey(I)Z
a=0;//     .locals 1
a=0;//     .param p0, "keyCode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 124
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x4f -> :sswitch_0
a=0;//         0x55 -> :sswitch_0
a=0;//         0x56 -> :sswitch_0
a=0;//         0x57 -> :sswitch_0
a=0;//         0x58 -> :sswitch_0
a=0;//         0x59 -> :sswitch_0
a=0;//         0x5a -> :sswitch_0
a=0;//         0x5b -> :sswitch_0
a=0;//         0x7e -> :sswitch_0
a=0;//         0x7f -> :sswitch_0
a=0;//         0x82 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private pushControllerState()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/media/TransportPerformer;->onGetTransportControlFlags()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->refreshState(ZJI)V
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private reportPlayingChanged()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->getListeners()[Landroid/support/v4/media/TransportStateListener;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 222
a=0;//     .local v4, "listeners":[Landroid/support/v4/media/TransportStateListener;
a=0;//     #v4=(Reference,[Landroid/support/v4/media/TransportStateListener;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     move-object v0, v4
a=0;// 
a=0;//     .local v0, "arr$":[Landroid/support/v4/media/TransportStateListener;
a=0;//     #v0=(Reference,[Landroid/support/v4/media/TransportStateListener;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     .line 224
a=0;//     .local v3, "listener":Landroid/support/v4/media/TransportStateListener;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v4/media/TransportStateListener;->onPlayingChanged(Landroid/support/v4/media/TransportController;)V
a=0;// 
a=0;//     .line 223
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 227
a=0;//     .end local v0    # "arr$":[Landroid/support/v4/media/TransportStateListener;
a=0;//     .end local v1    # "i$":I
a=0;//     .end local v2    # "len$":I
a=0;//     .end local v3    # "listener":Landroid/support/v4/media/TransportStateListener;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private reportTransportControlsChanged()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->getListeners()[Landroid/support/v4/media/TransportStateListener;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 231
a=0;//     .local v4, "listeners":[Landroid/support/v4/media/TransportStateListener;
a=0;//     #v4=(Reference,[Landroid/support/v4/media/TransportStateListener;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     move-object v0, v4
a=0;// 
a=0;//     .local v0, "arr$":[Landroid/support/v4/media/TransportStateListener;
a=0;//     #v0=(Reference,[Landroid/support/v4/media/TransportStateListener;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v3, "listener":Landroid/support/v4/media/TransportStateListener;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v4/media/TransportStateListener;->onTransportControlsChanged(Landroid/support/v4/media/TransportController;)V
a=0;// 
a=0;//     .line 232
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     .end local v0    # "arr$":[Landroid/support/v4/media/TransportStateListener;
a=0;//     .end local v1    # "i$":I
a=0;//     .end local v2    # "len$":I
a=0;//     .end local v3    # "listener":Landroid/support/v4/media/TransportStateListener;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->destroy()V
a=0;// 
a=0;//     .line 342
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mKeyEventCallback:Landroid/view/KeyEvent$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/KeyEvent$Callback;);
a=0;//     iget-object v1, p0, Landroid/support/v4/media/TransportMediator;->mDispatcherState:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {p1, v0, v1, p0}, Landroid/support/v4/view/KeyEventCompat;->dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBufferPercentage()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetBufferPercentage()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentPosition()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetCurrentPosition()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetDuration()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getRemoteControlClient()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->getRemoteControlClient()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTransportControlFlags()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onGetTransportControlFlags()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isPlaying()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onIsPlaying()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public pausePlaying()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->pausePlaying()V
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onPause()V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
a=0;// 
a=0;//     .line 277
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
a=0;// 
a=0;//     .line 278
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public refreshState()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
a=0;// 
a=0;//     .line 248
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportTransportControlsChanged()V
a=0;// 
a=0;//     .line 250
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public registerStateListener(Landroid/support/v4/media/TransportStateListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/media/TransportStateListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public seekTo(J)V
a=0;//     .locals 1
a=0;//     .param p1, "pos"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportPerformer;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/TransportPerformer;->onSeekTo(J)V
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startPlaying()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->startPlaying()V
a=0;// 
a=0;//     .line 261
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onStart()V
a=0;// 
a=0;//     .line 262
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
a=0;// 
a=0;//     .line 263
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public stopPlaying()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/media/TransportMediatorJellybeanMR2;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 287
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mController:Landroid/support/v4/media/TransportMediatorJellybeanMR2;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportMediatorJellybeanMR2;->stopPlaying()V
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mCallbacks:Landroid/support/v4/media/TransportPerformer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/media/TransportPerformer;->onStop()V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->pushControllerState()V
a=0;// 
a=0;//     .line 291
a=0;//     invoke-direct {p0}, Landroid/support/v4/media/TransportMediator;->reportPlayingChanged()V
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unregisterStateListener(Landroid/support/v4/media/TransportStateListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/media/TransportStateListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     iget-object v0, p0, Landroid/support/v4/media/TransportMediator;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
}}
