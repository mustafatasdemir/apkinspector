package android.support.v4.view.accessibility; class AccessibilityNodeProviderCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityNodeProviderCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mProvider:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;// 
a=0;//     .line 146
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 152
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl;->newAccessibilityNodeProviderBridge(Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->mProvider:Ljava/lang/Object;
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "provider"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 162
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->mProvider:Ljava/lang/Object;
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createAccessibilityNodeInfo(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "virtualViewId"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public findFocus(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 1
a=0;//     .param p1, "focus"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getProvider()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->mProvider:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public performAction(IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
}}
