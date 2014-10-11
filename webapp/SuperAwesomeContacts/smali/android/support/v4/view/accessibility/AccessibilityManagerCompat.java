package android.support.v4.view.accessibility; class AccessibilityManagerCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     .line 130
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 202
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;//     .locals 1
a=0;//     .param p0, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p0, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p1, "feedbackTypeFlags"    # I
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
a=0;//     .line 186
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p0, "manager"    # Landroid/view/accessibility/AccessibilityManager;
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
a=0;//     .line 167
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;//     .locals 1
a=0;//     .param p0, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;//     .locals 1
a=0;//     .param p0, "manager"    # Landroid/view/accessibility/AccessibilityManager;
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
