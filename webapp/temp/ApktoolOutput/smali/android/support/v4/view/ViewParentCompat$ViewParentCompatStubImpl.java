package android.support.v4.view; class ViewParentCompat$ViewParentCompatStubImpl {/*

.class Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;
.super Ljava/lang/Object;
.source "ViewParentCompat.java"

# interfaces
.implements Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewParentCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ViewParentCompatStubImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3
    .parameter "parent"
    .parameter "child"
    .parameter "event"

    .prologue
    .line 42
    if-nez p2, :cond_0

    .line 43
    const/4 v1, 0x0

    .line 48
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
    return v1

    .line 45
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "accessibility"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 47
    .local v0, manager:Landroid/view/accessibility/AccessibilityManager;
    invoke-virtual {v0, p3}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 48
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

*/}
