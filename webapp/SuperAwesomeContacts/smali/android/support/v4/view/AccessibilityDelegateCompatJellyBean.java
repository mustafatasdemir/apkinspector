package android.support.v4.view; class AccessibilityDelegateCompatJellyBean { void a() { int a;
a=0;// .class Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityDelegateCompatJellyBean.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAccessibilityNodeProvider(Ljava/lang/Object;Landroid/view/View;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "delegate"    # Ljava/lang/Object;
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     check-cast p0, Landroid/view/View$AccessibilityDelegate;
a=0;// 
a=0;//     .end local p0    # "delegate":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityNodeProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newAccessibilityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "bridge"    # Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static performAccessibilityAction(Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p0, "delegate"    # Ljava/lang/Object;
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     check-cast p0, Landroid/view/View$AccessibilityDelegate;
a=0;// 
a=0;//     .end local p0    # "delegate":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
