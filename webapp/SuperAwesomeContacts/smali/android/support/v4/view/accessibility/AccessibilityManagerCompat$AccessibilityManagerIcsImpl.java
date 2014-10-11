package android.support.v4.view.accessibility; class AccessibilityManagerCompat$AccessibilityManagerIcsImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;
a=0;// .super Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;
a=0;// .source "AccessibilityManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "AccessibilityManagerIcsImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p2, "listener"    # Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v0, p2, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;->mListener:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p2, "feedbackTypeFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/view/accessibility/AccessibilityManager;",
a=0;//             "I)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/accessibilityservice/AccessibilityServiceInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/view/accessibility/AccessibilityManager;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/accessibilityservice/AccessibilityServiceInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public newAccessiblityStateChangeListener(Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;-><init>(Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->newAccessibilityStateChangeListener(Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;//     .locals 1
a=0;//     .param p1, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p2, "listener"    # Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget-object v0, p2, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;->mListener:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
