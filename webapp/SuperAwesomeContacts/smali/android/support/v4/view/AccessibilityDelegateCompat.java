package android.support.v4.view; class AccessibilityDelegateCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityDelegateCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;,
a=0;//         Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;,
a=0;//         Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;,
a=0;//         Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mBridge:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     .line 302
a=0;//     :goto_0
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->newAccessiblityDelegateDefaultImpl()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// 
a=0;//     .line 297
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 300
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 311
a=0;//     #p0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->newAccessiblityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat;->mBridge:Ljava/lang/Object;
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->dispatchPopulateAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 480
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->getAccessibilityNodeProvider(Ljava/lang/Object;Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getBridge()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat;->mBridge:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->onInitializeAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 420
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "info"    # Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->onInitializeAccessibilityNodeInfo(Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 439
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->onPopulateAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 400
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/ViewGroup;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;//     .param p3, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->onRequestSendAccessibilityEvent(Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->performAccessibilityAction(Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public sendAccessibilityEvent(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->sendAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;I)V
a=0;// 
a=0;//     .line 337
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     sget-object v0, Landroid/support/v4/view/AccessibilityDelegateCompat;->IMPL:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;);
a=0;//     sget-object v1, Landroid/support/v4/view/AccessibilityDelegateCompat;->DEFAULT_DELEGATE:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateImpl;->sendAccessibilityEventUnchecked(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 359
a=0;//     return-void
a=0;// .end method
}}
