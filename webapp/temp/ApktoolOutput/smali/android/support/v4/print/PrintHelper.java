package android.support.v4.print; class PrintHelper {/*

.class public final Landroid/support/v4/print/PrintHelper;
.super Ljava/lang/Object;
.source "PrintHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/print/PrintHelper$1;,
        Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;,
        Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;,
        Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    }
.end annotation


# static fields
.field public static final COLOR_MODE_COLOR:I = 0x2

.field public static final COLOR_MODE_MONOCHROME:I = 0x1

.field public static final ORIENTATION_LANDSCAPE:I = 0x1

.field public static final ORIENTATION_PORTRAIT:I = 0x2

.field public static final SCALE_MODE_FILL:I = 0x2

.field public static final SCALE_MODE_FIT:I = 0x1


# instance fields
.field mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    #p0=(Reference);
    invoke-static {}, Landroid/support/v4/print/PrintHelper;->systemSupportsPrint()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 199
    new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    .line 203
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 201
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, v1}, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;-><init>(Landroid/support/v4/print/PrintHelper$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    goto :goto_0
.end method

.method public static systemSupportsPrint()Z
    .locals 2

    .prologue
    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x13

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 70
    const/4 v0, 0x1

    .line 72
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public getColorMode()I
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getColorMode()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getOrientation()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getScaleMode()I
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getScaleMode()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1
    .parameter "jobName"
    .parameter "bitmap"

    .prologue
    .line 278
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 279
    return-void
.end method

.method public printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1
    .parameter "jobName"
    .parameter "imageFile"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 291
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p1, p2}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/net/Uri;)V

    .line 292
    return-void
.end method

.method public setColorMode(I)V
    .locals 1
    .parameter "colorMode"

    .prologue
    .line 237
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setColorMode(I)V

    .line 238
    return-void
.end method

.method public setOrientation(I)V
    .locals 1
    .parameter "orientation"

    .prologue
    .line 258
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setOrientation(I)V

    .line 259
    return-void
.end method

.method public setScaleMode(I)V
    .locals 1
    .parameter "scaleMode"

    .prologue
    .line 215
    iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;

    #v0=(Reference);
    invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setScaleMode(I)V

    .line 216
    return-void
.end method

*/}
