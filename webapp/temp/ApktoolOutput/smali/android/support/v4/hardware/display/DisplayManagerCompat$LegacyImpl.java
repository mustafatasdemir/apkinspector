package android.support.v4.hardware.display; class DisplayManagerCompat$LegacyImpl {/*

.class Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;
.super Landroid/support/v4/hardware/display/DisplayManagerCompat;
.source "DisplayManagerCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/hardware/display/DisplayManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LegacyImpl"
.end annotation


# instance fields
.field private final mWindowManager:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 108
    invoke-direct {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat;-><init>()V

    .line 109
    #p0=(Reference);
    const-string v0, "window"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;

    .line 110
    return-void
.end method


# virtual methods
.method public getDisplay(I)Landroid/view/Display;
    .locals 2
    .parameter "displayId"

    .prologue
    .line 114
    iget-object v1, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;

    #v1=(Reference);
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 115
    .local v0, display:Landroid/view/Display;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I

    move-result v1

    #v1=(Integer);
    if-ne v1, p1, :cond_0

    .line 118
    .end local v0           #display:Landroid/view/Display;
    :goto_0
    return-object v0

    .restart local v0       #display:Landroid/view/Display;
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getDisplays()[Landroid/view/Display;
    .locals 3

    .prologue
    .line 123
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [Landroid/view/Display;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iget-object v2, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;

    #v2=(Reference);
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    aput-object v2, v0, v1

    return-object v0
.end method

.method public getDisplays(Ljava/lang/String;)[Landroid/view/Display;
    .locals 1
    .parameter "category"

    .prologue
    .line 128
    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->getDisplays()[Landroid/view/Display;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    new-array v0, v0, [Landroid/view/Display;

    #v0=(Reference);
    goto :goto_0
.end method

*/}
