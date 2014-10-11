package android.support.v4.view; class ViewPager$MyAccessibilityDelegate { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;
a=0;// .super Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/ViewPager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "MyAccessibilityDelegate"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/ViewPager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 2765
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private canScroll()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2817
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;//     .locals 3
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2769
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 2770
a=0;//     const-class v1, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 2771
a=0;//     invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2772
a=0;//     .local v0, "recordCompat":Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->canScroll()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setScrollable(Z)V
a=0;// 
a=0;//     .line 2773
a=0;//     invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2775
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setItemCount(I)V
a=0;// 
a=0;//     .line 2776
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V
a=0;// 
a=0;//     .line 2777
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V
a=0;// 
a=0;//     .line 2779
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "info"    # Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2783
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 2784
a=0;//     const-class v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 2785
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->canScroll()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V
a=0;// 
a=0;//     .line 2786
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2787
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 2789
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 2790
a=0;//     const/16 v0, 0x2000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 2792
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;//     .locals 4
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2796
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2813
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v4/view/ViewPager;);v2=(Integer);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2799
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2813
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2801
a=0;//     :sswitch_0
a=0;//     #v0=(One);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 2802
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v2}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2805
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2807
a=0;//     :sswitch_1
a=0;//     #v0=(One);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 2808
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-static {v2}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 2811
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2799
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1000 -> :sswitch_0
a=0;//         0x2000 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
