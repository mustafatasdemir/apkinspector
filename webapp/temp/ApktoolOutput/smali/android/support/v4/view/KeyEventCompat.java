package android.support.v4.view; class KeyEventCompat {/*

.class public Landroid/support/v4/view/KeyEventCompat;
.super Ljava/lang/Object;
.source "KeyEventCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/KeyEventCompat$HoneycombKeyEventVersionImpl;,
        Landroid/support/v4/view/KeyEventCompat$EclairKeyEventVersionImpl;,
        Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;,
        Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    }
.end annotation


# static fields
.field static final IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 166
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 167
    new-instance v0, Landroid/support/v4/view/KeyEventCompat$HoneycombKeyEventVersionImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/KeyEventCompat$HoneycombKeyEventVersionImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    .line 171
    :goto_0
    return-void

    .line 169
    :cond_0
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    #p0=(Reference);
    return-void
.end method

.method public static dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .parameter "event"
    .parameter "receiver"
    .parameter "state"
    .parameter "target"

    .prologue
    .line 209
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
    .locals 1
    .parameter "view"

    .prologue
    .line 204
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static hasModifiers(Landroid/view/KeyEvent;I)Z
    .locals 2
    .parameter "event"
    .parameter "modifiers"

    .prologue
    .line 188
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    #v1=(Integer);
    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasModifiers(II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static hasNoModifiers(Landroid/view/KeyEvent;)Z
    .locals 2
    .parameter "event"

    .prologue
    .line 192
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    #v1=(Integer);
    invoke-interface {v0, v1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasNoModifiers(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static isTracking(Landroid/view/KeyEvent;)Z
    .locals 1
    .parameter "event"

    .prologue
    .line 200
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static metaStateHasModifiers(II)Z
    .locals 1
    .parameter "metaState"
    .parameter "modifiers"

    .prologue
    .line 180
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasModifiers(II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static metaStateHasNoModifiers(I)Z
    .locals 1
    .parameter "metaState"

    .prologue
    .line 184
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasNoModifiers(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static normalizeMetaState(I)I
    .locals 1
    .parameter "metaState"

    .prologue
    .line 176
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->normalizeMetaState(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static startTracking(Landroid/view/KeyEvent;)V
    .locals 1
    .parameter "event"

    .prologue
    .line 196
    sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->startTracking(Landroid/view/KeyEvent;)V

    .line 197
    return-void
.end method

*/}
