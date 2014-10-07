package android.support.v4.view; class ViewParentCompat {/*

.class public Landroid/support/v4/view/ViewParentCompat;
.super Ljava/lang/Object;
.source "ViewParentCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ViewParentCompat$ViewParentCompatICSImpl;,
        Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;,
        Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;
    }
.end annotation


# static fields
.field static final IMPL:Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 62
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 64
    new-instance v1, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatICSImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatICSImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewParentCompat;->IMPL:Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;

    .line 68
    :goto_0
    return-void

    .line 66
    :cond_0
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatStubImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ViewParentCompat;->IMPL:Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    #p0=(Reference);
    return-void
.end method

.method public static requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .parameter "parent"
    .parameter "child"
    .parameter "event"

    .prologue
    .line 96
    sget-object v0, Landroid/support/v4/view/ViewParentCompat;->IMPL:Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewParentCompat$ViewParentCompatImpl;->requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
