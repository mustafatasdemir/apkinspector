package android.support.v4.hardware.display; class DisplayManagerJellybeanMr1 {/*

.class final Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;
.super Ljava/lang/Object;
.source "DisplayManagerJellybeanMr1.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getDisplay(Ljava/lang/Object;I)Landroid/view/Display;
    .locals 1
    .parameter "displayManagerObj"
    .parameter "displayId"

    .prologue
    .line 28
    check-cast p0, Landroid/hardware/display/DisplayManager;

    .end local p0
    invoke-virtual {p0, p1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static getDisplayManager(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1
    .parameter "context"

    .prologue
    .line 24
    const-string v0, "display"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static getDisplays(Ljava/lang/Object;)[Landroid/view/Display;
    .locals 1
    .parameter "displayManagerObj"

    .prologue
    .line 32
    check-cast p0, Landroid/hardware/display/DisplayManager;

    .end local p0
    invoke-virtual {p0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static getDisplays(Ljava/lang/Object;Ljava/lang/String;)[Landroid/view/Display;
    .locals 1
    .parameter "displayManagerObj"
    .parameter "category"

    .prologue
    .line 36
    check-cast p0, Landroid/hardware/display/DisplayManager;

    .end local p0
    invoke-virtual {p0, p1}, Landroid/hardware/display/DisplayManager;->getDisplays(Ljava/lang/String;)[Landroid/view/Display;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}