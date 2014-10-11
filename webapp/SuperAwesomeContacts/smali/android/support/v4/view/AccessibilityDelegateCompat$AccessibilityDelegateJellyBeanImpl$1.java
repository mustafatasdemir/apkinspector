package android.support.v4.view; class AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1 { void a() { int a;
a=0;// .class Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityDelegateCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;->newAccessiblityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;
a=0;// 
a=0;// .field final synthetic val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iput-object p1, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->this$0:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAccessibilityNodeProvider(Landroid/view/View;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     iget-object v1, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/AccessibilityDelegateCompat;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 262
a=0;//     .local v0, "provider":Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->getProvider()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "info"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     new-instance v1, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     invoke-direct {v1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 235
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 240
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/ViewGroup;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;//     .param p3, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public sendAccessibilityEvent(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEvent(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 256
a=0;//     return-void
a=0;// .end method
}}
