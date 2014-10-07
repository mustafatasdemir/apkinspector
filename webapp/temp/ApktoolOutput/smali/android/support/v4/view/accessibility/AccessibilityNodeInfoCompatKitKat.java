package android.support.v4.view.accessibility; class AccessibilityNodeInfoCompatKitKat {/*

.class Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatKitKat;
.super Ljava/lang/Object;
.source "AccessibilityNodeInfoCompatKitKat.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getLiveRegion(Ljava/lang/Object;)I
    .locals 1
    .parameter "info"

    .prologue
    .line 26
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    .end local p0
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLiveRegion()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static setLiveRegion(Ljava/lang/Object;I)V
    .locals 0
    .parameter "info"
    .parameter "mode"

    .prologue
    .line 30
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    .end local p0
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 31
    return-void
.end method

*/}
