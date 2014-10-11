package android.support.v4.view; class KeyEventCompat$BaseKeyEventVersionImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "KeyEventCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/KeyEventCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "BaseKeyEventVersionImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final META_ALL_MASK:I = 0xf7
a=0;// 
a=0;// .field private static final META_MODIFIER_MASK:I = 0xf7
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static metaStateFilterDirectionalModifiers(IIIII)I
a=0;//     .locals 5
a=0;//     .param p0, "metaState"    # I
a=0;//     .param p1, "modifiers"    # I
a=0;//     .param p2, "basic"    # I
a=0;//     .param p3, "left"    # I
a=0;//     .param p4, "right"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v3=(Null);
a=0;//     and-int v4, p1, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "wantBasic":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     or-int v0, p3, p4
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "directional":I
a=0;//     #v0=(Integer);
a=0;//     and-int v4, p1, v0
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "wantLeftOrRight":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 60
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "bad arguments"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .end local v0    # "directional":I
a=0;//     .end local v1    # "wantBasic":Z
a=0;//     .end local v2    # "wantLeftOrRight":Z
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Null);v4=(Integer);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 55
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "directional":I
a=0;//     .restart local v1    # "wantBasic":Z
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Boolean);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 57
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v2    # "wantLeftOrRight":Z
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     xor-int/lit8 v3, v0, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr p0, v3
a=0;// 
a=0;//     .line 67
a=0;//     .end local p0    # "metaState":I
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     return p0
a=0;// 
a=0;//     .line 64
a=0;//     .restart local p0    # "metaState":I
a=0;//     :cond_4
a=0;//     #v3=(Null);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     xor-int/lit8 v3, p2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr p0, v3
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;//     .param p2, "receiver"    # Landroid/view/KeyEvent$Callback;
a=0;//     .param p3, "state"    # Ljava/lang/Object;
a=0;//     .param p4, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-virtual {p1, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isTracking(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public metaStateHasModifiers(II)Z
a=0;//     .locals 4
a=0;//     .param p1, "metaState"    # I
a=0;//     .param p2, "modifiers"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 p1, v1, 0xf7
a=0;// 
a=0;//     .line 85
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {p1, p2, v0, v1, v2}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {p1, p2, v1, v2, v3}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 89
a=0;//     if-ne p1, p2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public metaStateHasNoModifiers(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "metaState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xf7
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public normalizeMetaState(I)I
a=0;//     .locals 1
a=0;//     .param p1, "metaState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     and-int/lit16 v0, p1, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     or-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     and-int/lit8 v0, p1, 0x30
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     or-int/lit8 p1, p1, 0x2
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     and-int/lit16 v0, p1, 0xf7
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public startTracking(Landroid/view/KeyEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
}}
