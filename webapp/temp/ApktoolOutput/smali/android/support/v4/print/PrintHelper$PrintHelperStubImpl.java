package android.support.v4.print; class PrintHelper$PrintHelperStubImpl {/*

.class final Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;
.super Ljava/lang/Object;
.source "PrintHelper.java"

# interfaces
.implements Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/print/PrintHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PrintHelperStubImpl"
.end annotation


# instance fields
.field mColorMode:I

.field mOrientation:I

.field mScaleMode:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x2

    .line 101
    #v0=(PosByte);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    #p0=(Reference);
    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    .line 103
    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    .line 104
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/print/PrintHelper$1;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 101
    invoke-direct {p0}, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getColorMode()I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    #v0=(Integer);
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .prologue
    .line 124
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    #v0=(Integer);
    return v0
.end method

.method public getScaleMode()I
    .locals 1

    .prologue
    .line 128
    iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    #v0=(Integer);
    return v0
.end method

.method public printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0
    .parameter "jobName"
    .parameter "bitmap"

    .prologue
    .line 133
    return-void
.end method

.method public printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0
    .parameter "jobName"
    .parameter "imageFile"

    .prologue
    .line 137
    return-void
.end method

.method public setColorMode(I)V
    .locals 0
    .parameter "colorMode"

    .prologue
    .line 117
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I

    .line 118
    return-void
.end method

.method public setOrientation(I)V
    .locals 0
    .parameter "orientation"

    .prologue
    .line 121
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I

    return-void
.end method

.method public setScaleMode(I)V
    .locals 0
    .parameter "scaleMode"

    .prologue
    .line 107
    iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I

    .line 108
    return-void
.end method

*/}
