package android.support.v4.view; class ViewCompat {/*

.class public Landroid/support/v4/view/ViewCompat;
.super Ljava/lang/Object;
.source "ViewCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ViewCompat$KitKatViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$JbMr1ViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$JBViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$HCViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$GBViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$EclairMr1ViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$ViewCompatImpl;,
        Landroid/support/v4/view/ViewCompat$ResolvedLayoutDirectionMode;,
        Landroid/support/v4/view/ViewCompat$LayoutDirectionMode;,
        Landroid/support/v4/view/ViewCompat$LayerType;,
        Landroid/support/v4/view/ViewCompat$AccessibilityLiveRegion;,
        Landroid/support/v4/view/ViewCompat$ImportantForAccessibility;,
        Landroid/support/v4/view/ViewCompat$OverScroll;
    }
.end annotation


# static fields
.field public static final ACCESSIBILITY_LIVE_REGION_ASSERTIVE:I = 0x2

.field public static final ACCESSIBILITY_LIVE_REGION_NONE:I = 0x0

.field public static final ACCESSIBILITY_LIVE_REGION_POLITE:I = 0x1

.field private static final FAKE_FRAME_TIME:J = 0xaL

.field static final IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl; = null

.field public static final IMPORTANT_FOR_ACCESSIBILITY_AUTO:I = 0x0

.field public static final IMPORTANT_FOR_ACCESSIBILITY_NO:I = 0x2

.field public static final IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS:I = 0x4

.field public static final IMPORTANT_FOR_ACCESSIBILITY_YES:I = 0x1

.field public static final LAYER_TYPE_HARDWARE:I = 0x2

.field public static final LAYER_TYPE_NONE:I = 0x0

.field public static final LAYER_TYPE_SOFTWARE:I = 0x1

.field public static final LAYOUT_DIRECTION_INHERIT:I = 0x2

.field public static final LAYOUT_DIRECTION_LOCALE:I = 0x3

.field public static final LAYOUT_DIRECTION_LTR:I = 0x0

.field public static final LAYOUT_DIRECTION_RTL:I = 0x1

.field public static final MEASURED_HEIGHT_STATE_SHIFT:I = 0x10

.field public static final MEASURED_SIZE_MASK:I = 0xffffff

.field public static final MEASURED_STATE_MASK:I = -0x1000000

.field public static final MEASURED_STATE_TOO_SMALL:I = 0x1000000

.field public static final OVER_SCROLL_ALWAYS:I = 0x0

.field public static final OVER_SCROLL_IF_CONTENT_SCROLLS:I = 0x1

.field public static final OVER_SCROLL_NEVER:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ViewCompat"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 981
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 982
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x13

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 983
    new-instance v1, Landroid/support/v4/view/ViewCompat$KitKatViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$KitKatViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    .line 997
    :goto_0
    return-void

    .line 984
    :cond_0
    #v1=(PosByte);
    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 985
    new-instance v1, Landroid/support/v4/view/ViewCompat$JbMr1ViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$JbMr1ViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0

    .line 986
    :cond_1
    #v1=(PosByte);
    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 987
    new-instance v1, Landroid/support/v4/view/ViewCompat$JBViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$JBViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0

    .line 988
    :cond_2
    #v1=(PosByte);
    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 989
    new-instance v1, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$ICSViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0

    .line 990
    :cond_3
    #v1=(PosByte);
    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 991
    new-instance v1, Landroid/support/v4/view/ViewCompat$HCViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$HCViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0

    .line 992
    :cond_4
    #v1=(PosByte);
    const/16 v1, 0x9

    if-lt v0, v1, :cond_5

    .line 993
    new-instance v1, Landroid/support/v4/view/ViewCompat$GBViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$GBViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0

    .line 995
    :cond_5
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 962
    #p0=(Reference);
    return-void
.end method

.method public static animate(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    .locals 1
    .parameter "view"

    .prologue
    .line 1748
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->animate(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object v0

    return-object v0
.end method

.method public static canScrollHorizontally(Landroid/view/View;I)Z
    .locals 1
    .parameter "v"
    .parameter "direction"

    .prologue
    .line 1007
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static canScrollVertically(Landroid/view/View;I)Z
    .locals 1
    .parameter "v"
    .parameter "direction"

    .prologue
    .line 1018
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static dispatchFinishTemporaryDetach(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 1688
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->dispatchFinishTemporaryDetach(Landroid/view/View;)V

    .line 1689
    return-void
.end method

.method public static dispatchStartTemporaryDetach(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 1681
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->dispatchStartTemporaryDetach(Landroid/view/View;)V

    .line 1682
    return-void
.end method

.method public static getAccessibilityLiveRegion(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1601
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAccessibilityLiveRegion(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    .locals 1
    .parameter "view"

    .prologue
    .line 1341
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;

    move-result-object v0

    return-object v0
.end method

.method public static getAlpha(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1352
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAlpha(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getImportantForAccessibility(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1272
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getLabelFor(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1427
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLabelFor(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getLayerType(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1416
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLayerType(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getLayoutDirection(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1487
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredHeightAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1577
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredHeightAndState(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1588
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredState(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredWidthAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1563
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredWidthAndState(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMinimumHeight(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1736
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMinimumHeight(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMinimumWidth(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1725
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMinimumWidth(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getOverScrollMode(Landroid/view/View;)I
    .locals 1
    .parameter "v"

    .prologue
    .line 1032
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getOverScrollMode(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getPaddingEnd(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1657
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPaddingEnd(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getPaddingStart(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 1645
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPaddingStart(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1
    .parameter "view"

    .prologue
    .line 1519
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method public static getTranslationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1701
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTranslationX(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getTranslationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1714
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTranslationY(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static hasTransientState(Landroid/view/View;)Z
    .locals 1
    .parameter "view"

    .prologue
    .line 1181
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->hasTransientState(Landroid/view/View;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static isOpaque(Landroid/view/View;)Z
    .locals 1
    .parameter "view"

    .prologue
    .line 1532
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->isOpaque(Landroid/view/View;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .parameter "v"
    .parameter "event"

    .prologue
    .line 1118
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1119
    return-void
.end method

.method public static onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 1
    .parameter "v"
    .parameter "info"

    .prologue
    .line 1154
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 1155
    return-void
.end method

.method public static onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .parameter "v"
    .parameter "event"

    .prologue
    .line 1085
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1086
    return-void
.end method

.method public static performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1
    .parameter "view"
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 1314
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static postInvalidateOnAnimation(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 1205
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1206
    return-void
.end method

.method public static postInvalidateOnAnimation(Landroid/view/View;IIII)V
    .locals 6
    .parameter "view"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 1223
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    move-object v1, p0

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postInvalidateOnAnimation(Landroid/view/View;IIII)V

    .line 1224
    return-void
.end method

.method public static postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1
    .parameter "view"
    .parameter "action"

    .prologue
    .line 1237
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1238
    return-void
.end method

.method public static postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 1
    .parameter "view"
    .parameter "action"
    .parameter "delayMillis"

    .prologue
    .line 1254
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 1255
    return-void
.end method

.method public static resolveSizeAndState(III)I
    .locals 1
    .parameter "size"
    .parameter "measureSpec"
    .parameter "childMeasuredState"

    .prologue
    .line 1549
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->resolveSizeAndState(III)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    .locals 1
    .parameter "v"
    .parameter "delegate"

    .prologue
    .line 1169
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 1170
    return-void
.end method

.method public static setAccessibilityLiveRegion(Landroid/view/View;I)V
    .locals 1
    .parameter "view"
    .parameter "mode"

    .prologue
    .line 1633
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAccessibilityLiveRegion(Landroid/view/View;I)V

    .line 1634
    return-void
.end method

.method public static setAlpha(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1794
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAlpha(Landroid/view/View;F)V

    .line 1795
    return-void
.end method

.method public static setHasTransientState(Landroid/view/View;Z)V
    .locals 1
    .parameter "view"
    .parameter "hasTransientState"

    .prologue
    .line 1192
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setHasTransientState(Landroid/view/View;Z)V

    .line 1193
    return-void
.end method

.method public static setImportantForAccessibility(Landroid/view/View;I)V
    .locals 1
    .parameter "view"
    .parameter "mode"

    .prologue
    .line 1296
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 1297
    return-void
.end method

.method public static setLabelFor(Landroid/view/View;I)V
    .locals 1
    .parameter "view"
    .parameter "labeledId"

    .prologue
    .line 1438
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLabelFor(Landroid/view/View;I)V

    .line 1439
    return-void
.end method

.method public static setLayerPaint(Landroid/view/View;Landroid/graphics/Paint;)V
    .locals 1
    .parameter "view"
    .parameter "paint"

    .prologue
    .line 1472
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayerPaint(Landroid/view/View;Landroid/graphics/Paint;)V

    .line 1473
    return-void
.end method

.method public static setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 1
    .parameter "view"
    .parameter "layerType"
    .parameter "paint"

    .prologue
    .line 1395
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 1396
    return-void
.end method

.method public static setLayoutDirection(Landroid/view/View;I)V
    .locals 1
    .parameter "view"
    .parameter "layoutDirection"

    .prologue
    .line 1507
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayoutDirection(Landroid/view/View;I)V

    .line 1508
    return-void
.end method

.method public static setOverScrollMode(Landroid/view/View;I)V
    .locals 1
    .parameter "v"
    .parameter "overScrollMode"

    .prologue
    .line 1048
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setOverScrollMode(Landroid/view/View;I)V

    .line 1049
    return-void
.end method

.method public static setPaddingRelative(Landroid/view/View;IIII)V
    .locals 6
    .parameter "view"
    .parameter "start"
    .parameter "top"
    .parameter "end"
    .parameter "bottom"

    .prologue
    .line 1674
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    move-object v1, p0

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPaddingRelative(Landroid/view/View;IIII)V

    .line 1675
    return-void
.end method

.method public static setRotation(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1834
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotation(Landroid/view/View;F)V

    .line 1835
    return-void
.end method

.method public static setRotationX(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1847
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotationX(Landroid/view/View;F)V

    .line 1848
    return-void
.end method

.method public static setRotationY(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1860
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotationY(Landroid/view/View;F)V

    .line 1861
    return-void
.end method

.method public static setScaleX(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1872
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setScaleX(Landroid/view/View;F)V

    .line 1873
    return-void
.end method

.method public static setScaleY(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1884
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setScaleY(Landroid/view/View;F)V

    .line 1885
    return-void
.end method

.method public static setTranslationX(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1762
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTranslationX(Landroid/view/View;F)V

    .line 1763
    return-void
.end method

.method public static setTranslationY(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1778
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTranslationY(Landroid/view/View;F)V

    .line 1779
    return-void
.end method

.method public static setX(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1808
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setX(Landroid/view/View;F)V

    .line 1809
    return-void
.end method

.method public static setY(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1822
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setY(Landroid/view/View;F)V

    .line 1823
    return-void
.end method


# virtual methods
.method public getPivotX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1895
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPivotX(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getPivotY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1922
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPivotY(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getRotation(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1941
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotation(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getRotationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1945
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotationX(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getRotationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1949
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotationY(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getScaleX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1953
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getScaleX(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getScaleY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1957
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getScaleY(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1961
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getX(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 1965
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getY(Landroid/view/View;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public setPivotX(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1910
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPivotX(Landroid/view/View;F)V

    .line 1911
    return-void
.end method

.method public setPivotY(Landroid/view/View;F)V
    .locals 1
    .parameter "view"
    .parameter "value"

    .prologue
    .line 1937
    sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPivotX(Landroid/view/View;F)V

    .line 1938
    return-void
.end method

*/}
