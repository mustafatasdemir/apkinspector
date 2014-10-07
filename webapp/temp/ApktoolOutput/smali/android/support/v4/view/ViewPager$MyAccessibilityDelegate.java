package android.support.v4.view; class ViewPager$MyAccessibilityDelegate {/*

.class Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "ViewPager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyAccessibilityDelegate"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/view/ViewPager;


# direct methods
.method constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0
    .parameter

    .prologue
    .line 2765
    iput-object p1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private canScroll()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2817
    #v0=(One);
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    #v1=(Integer);
    if-le v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3
    .parameter "host"
    .parameter "event"

    .prologue
    .line 2769
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2770
    const-class v1, Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 2771
    invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v0

    .line 2772
    .local v0, recordCompat:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    #v0=(Reference);
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->canScroll()Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setScrollable(Z)V

    .line 2773
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0x1000

    #v2=(PosShort);
    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2775
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setItemCount(I)V

    .line 2776
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V

    .line 2777
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V

    .line 2779
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 2
    .parameter "host"
    .parameter "info"

    .prologue
    .line 2783
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 2784
    const-class v0, Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 2785
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->canScroll()Z

    move-result v0

    #v0=(Boolean);
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setScrollable(Z)V

    .line 2786
    iget-object v0, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 2787
    const/16 v0, 0x1000

    #v0=(PosShort);
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 2789
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 2790
    const/16 v0, 0x2000

    #v0=(PosShort);
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 2792
    :cond_1
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4
    .parameter "host"
    .parameter "action"
    .parameter "args"

    .prologue
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v0, 0x1

    .line 2796
    #v0=(One);
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 2813
    :goto_0
    #v0=(Boolean);v1=(Reference);v2=(Integer);v3=(Conflicted);
    return v0

    .line 2799
    :cond_0
    #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    .line 2813
    #v0=(Null);
    goto :goto_0

    .line 2801
    :sswitch_0
    #v0=(One);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 2802
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v2=(Reference);
    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_1
    #v1=(Null);v2=(Boolean);
    move v0, v1

    .line 2805
    #v0=(Null);
    goto :goto_0

    .line 2807
    :sswitch_1
    #v0=(One);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v2=(Reference);
    const/4 v3, -0x1

    #v3=(Byte);
    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 2808
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;->this$0:Landroid/support/v4/view/ViewPager;

    #v2=(Reference);
    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->access$300(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_2
    #v1=(Null);v2=(Boolean);
    move v0, v1

    .line 2811
    #v0=(Null);
    goto :goto_0

    .line 2799
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_1
    .end sparse-switch
.end method

*/}
