package android.support.v4.view.accessibility; class AccessibilityNodeInfoCompatJellybeanMr2 {/*

.class Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatJellybeanMr2;
.super Ljava/lang/Object;
.source "AccessibilityNodeInfoCompatJellybeanMr2.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getViewIdResourceName(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .parameter "info"

    .prologue
    .line 28
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    .end local p0
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static setViewIdResourceName(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .parameter "info"
    .parameter "viewId"

    .prologue
    .line 24
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;

    .end local p0
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 25
    return-void
.end method

*/}
