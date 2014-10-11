package android.support.v4.view; class AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1 { void a() { int a;
a=0;// .class Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityDelegateCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;->newAccessiblityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;
a=0;// 
a=0;// .field final synthetic val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iput-object p1, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->this$0:Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;);
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
a=0;//     .line 132
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
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
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "info"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
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
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 149
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
a=0;//     .line 154
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
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
a=0;// .method public sendAccessibilityEvent(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEvent(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 160
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 1
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
}}
