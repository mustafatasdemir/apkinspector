package android.support.v4.widget; class DrawerLayout$AccessibilityDelegate {/*

.class Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "DrawerLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AccessibilityDelegate"
.end annotation


# instance fields
.field private final mTmpRect:Landroid/graphics/Rect;

.field final synthetic this$0:Landroid/support/v4/widget/DrawerLayout;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/DrawerLayout;)V
    .locals 1
    .parameter

    .prologue
    .line 1667
    iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    .line 1668
    #p0=(Reference);
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->mTmpRect:Landroid/graphics/Rect;

    return-void
.end method

.method private addChildrenForAccessibility(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/view/ViewGroup;)V
    .locals 4
    .parameter "info"
    .parameter "v"

    .prologue
    .line 1720
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 1721
    .local v1, childCount:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
    if-ge v2, v1, :cond_1

    .line 1722
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1723
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/DrawerLayout;->access$300(Landroid/view/View;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 1724
    invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;)V

    .line 1721
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1727
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method private copyNodeInfoNoChildren(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 2
    .parameter "dest"
    .parameter "src"

    .prologue
    .line 1745
    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->mTmpRect:Landroid/graphics/Rect;

    .line 1747
    .local v0, rect:Landroid/graphics/Rect;
    #v0=(Reference);
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 1748
    invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 1750
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1751
    invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 1753
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isVisibleToUser()Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V

    .line 1754
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V

    .line 1755
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getClassName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 1756
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1758
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isEnabled()Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V

    .line 1759
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isClickable()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClickable(Z)V

    .line 1760
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocusable()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocusable(Z)V

    .line 1761
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocused()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocused(Z)V

    .line 1762
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isAccessibilityFocused()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V

    .line 1763
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isSelected()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSelected(Z)V

    .line 1764
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isLongClickable()Z

    move-result v1

    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setLongClickable(Z)V

    .line 1766
    invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 1767
    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6
    .parameter "host"
    .parameter "event"

    .prologue
    .line 1702
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v4

    #v4=(Integer);
    const/16 v5, 0x20

    #v5=(PosByte);
    if-ne v4, v5, :cond_1

    .line 1703
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    .line 1704
    .local v1, eventText:Ljava/util/List;,"Ljava/util/List<Ljava/lang/CharSequence;>;"
    #v1=(Reference);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/DrawerLayout;->access$200(Landroid/support/v4/widget/DrawerLayout;)Landroid/view/View;

    move-result-object v3

    .line 1705
    .local v3, visibleDrawer:Landroid/view/View;
    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 1706
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v4, v3}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I

    move-result v0

    .line 1707
    .local v0, edgeGravity:I
    #v0=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v4, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerTitle(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 1708
    .local v2, title:Ljava/lang/CharSequence;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 1709
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1713
    .end local v0           #edgeGravity:I
    .end local v2           #title:Ljava/lang/CharSequence;
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    const/4 v4, 0x1

    .line 1716
    .end local v1           #eventText:Ljava/util/List;,"Ljava/util/List<Ljava/lang/CharSequence;>;"
    .end local v3           #visibleDrawer:Landroid/view/View;
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Boolean);
    return v4

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v4

    #v4=(Boolean);
    goto :goto_0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .parameter "host"
    .parameter "event"

    .prologue
    .line 1690
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1692
    const-class v0, Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 1693
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 3
    .parameter "host"
    .parameter "info"

    .prologue
    .line 1672
    invoke-static {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v1

    .line 1673
    .local v1, superNode:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    #v1=(Reference);
    invoke-super {p0, p1, v1}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1675
    const-class v2, Landroid/support/v4/widget/DrawerLayout;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 1676
    invoke-virtual {p2, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;)V

    .line 1677
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    .line 1678
    .local v0, parent:Landroid/view/ViewParent;
    #v0=(Reference);
    instance-of v2, v0, Landroid/view/View;

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 1679
    check-cast v0, Landroid/view/View;

    .end local v0           #parent:Landroid/view/ViewParent;
    invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V

    .line 1681
    :cond_0
    invoke-direct {p0, p2, v1}, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->copyNodeInfoNoChildren(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1683
    invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->recycle()V

    .line 1685
    check-cast p1, Landroid/view/ViewGroup;

    .end local p1
    invoke-direct {p0, p2, p1}, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;->addChildrenForAccessibility(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/view/ViewGroup;)V

    .line 1686
    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .parameter "host"
    .parameter "child"
    .parameter "event"

    .prologue
    .line 1732
    invoke-static {p2}, Landroid/support/v4/widget/DrawerLayout;->access$300(Landroid/view/View;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1733
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    .line 1735
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
