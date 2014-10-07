package android.support.v4.view; class AccessibilityDelegateCompatJellyBean {/*

.class Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;
.super Ljava/lang/Object;
.source "AccessibilityDelegateCompatJellyBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    #p0=(Reference);
    return-void
.end method

.method public static getAccessibilityNodeProvider(Ljava/lang/Object;Landroid/view/View;)Ljava/lang/Object;
    .locals 1
    .parameter "delegate"
    .parameter "host"

    .prologue
    .line 99
    check-cast p0, Landroid/view/View$AccessibilityDelegate;

    .end local p0
    invoke-virtual {p0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static newAccessibilityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)Ljava/lang/Object;
    .locals 1
    .parameter "bridge"

    .prologue
    .line 47
    new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)V

    #v0=(Reference);
    return-object v0
.end method

.method public static performAccessibilityAction(Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1
    .parameter "delegate"
    .parameter "host"
    .parameter "action"
    .parameter "args"

    .prologue
    .line 104
    check-cast p0, Landroid/view/View$AccessibilityDelegate;

    .end local p0
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
