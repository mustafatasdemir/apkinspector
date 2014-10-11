package android.support.v4.widget; class DrawerLayout$ChildAccessibilityDelegate { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
a=0;// .super Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .source "DrawerLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/DrawerLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "ChildAccessibilityDelegate"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/widget/DrawerLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1770
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "info"    # Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1774
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 1775
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->access$300(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1779
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1781
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
}}
