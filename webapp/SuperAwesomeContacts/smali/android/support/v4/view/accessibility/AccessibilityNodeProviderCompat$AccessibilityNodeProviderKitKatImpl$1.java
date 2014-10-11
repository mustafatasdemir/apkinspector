package android.support.v4.view.accessibility; class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1 { void a() { int a;
a=0;// .class Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityNodeProviderCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;->newAccessibilityNodeProviderBridge(Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;)Ljava/lang/Object;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;
a=0;// 
a=0;// .field final synthetic val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iput-object p1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->this$0:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createAccessibilityNodeInfo(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->createAccessibilityNodeInfo(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "compatInfo":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
a=0;//     .locals 6
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "virtualViewId"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget-object v5, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     invoke-virtual {v5, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "compatInfos":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;>;"
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     .local v4, "infos":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 103
a=0;//     .local v3, "infoCount":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     .line 105
a=0;//     .local v2, "infoCompat":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 103
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     .end local v2    # "infoCompat":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method public findFocus(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "focus"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->findFocus(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "compatInfo":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performAction(IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->performAction(IILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
