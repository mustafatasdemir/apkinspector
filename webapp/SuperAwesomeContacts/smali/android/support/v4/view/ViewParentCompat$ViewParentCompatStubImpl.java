package android.support.v4.view; class ViewParentCompat$ViewParentCompatStubImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewParentCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/ViewParentCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ViewParentCompatStubImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "parent"    # Landroid/view/ViewParent;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;//     .param p3, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "accessibility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "manager":Landroid/view/accessibility/AccessibilityManager;
a=0;//     invoke-virtual {v0, p3}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
