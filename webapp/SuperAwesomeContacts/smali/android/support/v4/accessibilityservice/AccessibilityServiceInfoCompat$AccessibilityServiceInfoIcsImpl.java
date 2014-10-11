package android.support.v4.accessibilityservice; class AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl { void a() { int a;
a=0;// .class Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;
a=0;// .super Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;
a=0;// .source "AccessibilityServiceInfoCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "AccessibilityServiceInfoIcsImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCapabilities(Landroid/accessibilityservice/AccessibilityServiceInfo;)I
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl;->getCanRetrieveWindowContent(Landroid/accessibilityservice/AccessibilityServiceInfo;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getDescription(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getId(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getResolveInfo(Landroid/accessibilityservice/AccessibilityServiceInfo;)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "info"    # Landroid/accessibilityservice/AccessibilityServiceInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {p1}, Landroid/support/v4/accessibilityservice/AccessibilityServiceInfoCompatIcs;->getSettingsActivityName(Landroid/accessibilityservice/AccessibilityServiceInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
