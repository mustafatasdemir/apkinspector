package android.support.v4.print; class PrintHelperKitkat {/*

.class Landroid/support/v4/print/PrintHelperKitkat;
.super Ljava/lang/Object;
.source "PrintHelperKitkat.java"


# static fields
.field public static final COLOR_MODE_COLOR:I = 0x2

.field public static final COLOR_MODE_MONOCHROME:I = 0x1

.field private static final LOG_TAG:Ljava/lang/String; = "PrintHelperKitkat"

.field private static final MAX_PRINT_SIZE:I = 0xdac

.field public static final ORIENTATION_LANDSCAPE:I = 0x1

.field public static final ORIENTATION_PORTRAIT:I = 0x2

.field public static final SCALE_MODE_FILL:I = 0x2

.field public static final SCALE_MODE_FIT:I = 0x1


# instance fields
.field mColorMode:I

.field final mContext:Landroid/content/Context;

.field mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

.field private final mLock:Ljava/lang/Object;

.field mOrientation:I

.field mScaleMode:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x2

    .line 87
    #v1=(PosByte);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    .line 52
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;

    .line 81
    iput v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I

    .line 83
    iput v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I

    .line 85
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I

    .line 88
    iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    .line 89
    return-void
.end method

.method static synthetic access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"
    .parameter "x4"

    .prologue
    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/print/PrintHelperKitkat;->getMatrix(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v4/print/PrintHelperKitkat;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Landroid/support/v4/print/PrintHelperKitkat;->loadConstrainedBitmap(Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v4/print/PrintHelperKitkat;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method private getMatrix(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    .locals 7
    .parameter "imageWidth"
    .parameter "imageHeight"
    .parameter "content"
    .parameter "fittingMode"

    .prologue
    const/high16 v6, 0x4000

    .line 257
    #v6=(Integer);
    new-instance v0, Landroid/graphics/Matrix;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 260
    .local v0, matrix:Landroid/graphics/Matrix;
    #v0=(Reference);
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v4

    #v4=(Float);
    int-to-float v5, p1

    #v5=(Float);
    div-float v1, v4, v5

    .line 261
    .local v1, scale:F
    #v1=(Float);
    const/4 v4, 0x2

    #v4=(PosByte);
    if-ne p4, v4, :cond_0

    .line 262
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v4

    #v4=(Float);
    int-to-float v5, p2

    div-float/2addr v4, v5

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 266
    :goto_0
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 269
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v4

    int-to-float v5, p1

    mul-float/2addr v5, v1

    sub-float/2addr v4, v5

    div-float v2, v4, v6

    .line 271
    .local v2, translateX:F
    #v2=(Float);
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v4

    int-to-float v5, p2

    mul-float/2addr v5, v1

    sub-float/2addr v4, v5

    div-float v3, v4, v6

    .line 273
    .local v3, translateY:F
    #v3=(Float);
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 274
    return-object v0

    .line 264
    .end local v2           #translateX:F
    .end local v3           #translateY:F
    :cond_0
    #v2=(Uninit);v3=(Uninit);v4=(PosByte);
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v4

    #v4=(Float);
    int-to-float v5, p2

    div-float/2addr v4, v5

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    goto :goto_0
.end method

.method private loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 5
    .parameter "uri"
    .parameter "o"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 507
    if-eqz p1, :cond_0

    iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    #v2=(Reference);
    if-nez v2, :cond_1

    .line 508
    :cond_0
    #v2=(Conflicted);
    new-instance v2, Ljava/lang/IllegalArgumentException;

    #v2=(UninitRef);
    const-string v3, "bad argument to loadBitmap"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 510
    :cond_1
    #v3=(Uninit);
    const/4 v0, 0x0

    .line 512
    .local v0, is:Ljava/io/InputStream;
    :try_start_0
    #v0=(Null);
    iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 513
    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v0, v2, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 515
    #v2=(Reference);
    if-eqz v0, :cond_2

    .line 517
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 520
    :cond_2
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v2

    .line 518
    :catch_0
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);
    move-exception v1

    .line 519
    .local v1, t:Ljava/io/IOException;
    #v1=(Reference);
    const-string v3, "PrintHelperKitkat"

    #v3=(Reference);
    const-string v4, "close fail "

    #v4=(Reference);
    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 515
    .end local v1           #t:Ljava/io/IOException;
    :catchall_0
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);
    move-exception v2

    if-eqz v0, :cond_3

    .line 517
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 520
    :cond_3
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    throw v2

    .line 518
    :catch_1
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);
    move-exception v1

    .line 519
    .restart local v1       #t:Ljava/io/IOException;
    #v1=(Reference);
    const-string v3, "PrintHelperKitkat"

    #v3=(Reference);
    const-string v4, "close fail "

    #v4=(Reference);
    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private loadConstrainedBitmap(Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    .locals 9
    .parameter "uri"
    .parameter "maxSideLength"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    #v8=(One);
    const/4 v6, 0x0

    .line 457
    #v6=(Null);
    if-lez p2, :cond_0

    if-eqz p1, :cond_0

    iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    #v7=(Reference);
    if-nez v7, :cond_1

    .line 458
    :cond_0
    #v7=(Conflicted);
    new-instance v6, Ljava/lang/IllegalArgumentException;

    #v6=(UninitRef);
    const-string v7, "bad argument to getScaledBitmap"

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    throw v6

    .line 461
    :cond_1
    #v6=(Null);
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 462
    .local v3, opt:Landroid/graphics/BitmapFactory$Options;
    #v3=(Reference);
    iput-boolean v8, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 463
    invoke-direct {p0, p1, v3}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 465
    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 466
    .local v5, w:I
    #v5=(Integer);
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 469
    .local v1, h:I
    #v1=(Integer);
    if-lez v5, :cond_2

    if-gtz v1, :cond_3

    .line 498
    :cond_2
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Reference);v7=(Conflicted);v8=(Boolean);
    return-object v6

    .line 474
    :cond_3
    #v0=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Null);v7=(Reference);v8=(One);
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 476
    .local v2, imageSide:I
    #v2=(Integer);
    const/4 v4, 0x1

    .line 477
    .local v4, sampleSize:I
    :goto_1
    #v4=(Integer);
    if-le v2, p2, :cond_4

    .line 478
    ushr-int/lit8 v2, v2, 0x1

    .line 479
    shl-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 483
    :cond_4
    if-lez v4, :cond_2

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v7

    #v7=(Integer);
    div-int/2addr v7, v4

    if-lez v7, :cond_2

    .line 486
    const/4 v0, 0x0

    .line 487
    .local v0, decodeOptions:Landroid/graphics/BitmapFactory$Options;
    #v0=(Null);
    iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;

    #v7=(Reference);
    monitor-enter v7

    .line 488
    :try_start_0
    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    #v6=(Reference);
    iput-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    .line 489
    iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    const/4 v8, 0x1

    iput-boolean v8, v6, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 490
    iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    iput v4, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 491
    iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    .line 492
    #v0=(Reference);
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 494
    :try_start_1
    invoke-direct {p0, p1, v0}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-result-object v6

    .line 496
    iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;

    monitor-enter v7

    .line 497
    const/4 v8, 0x0

    :try_start_2
    #v8=(Null);
    iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    .line 498
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v6

    .line 492
    :catchall_1
    #v6=(Conflicted);v8=(One);
    move-exception v6

    :try_start_3
    #v6=(Reference);
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v6

    .line 496
    :catchall_2
    move-exception v6

    iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;

    monitor-enter v7

    .line 497
    const/4 v8, 0x0

    :try_start_4
    #v8=(Null);
    iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;

    .line 498
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v6

    :catchall_3
    move-exception v6

    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v6
.end method


# virtual methods
.method public getColorMode()I
    .locals 1

    .prologue
    .line 154
    iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I

    #v0=(Integer);
    return v0
.end method

.method public getOrientation()I
    .locals 1

    .prologue
    .line 144
    iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I

    #v0=(Integer);
    return v0
.end method

.method public getScaleMode()I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I

    #v0=(Integer);
    return v0
.end method

.method public printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 6
    .parameter "jobName"
    .parameter "bitmap"

    .prologue
    .line 164
    if-nez p2, :cond_0

    .line 245
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 167
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I

    .line 168
    .local v1, fittingMode:I
    #v1=(Integer);
    iget-object v4, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    #v4=(Reference);
    const-string v5, "print"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/print/PrintManager;

    .line 169
    .local v3, printManager:Landroid/print/PrintManager;
    sget-object v2, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;

    .line 170
    .local v2, mediaSize:Landroid/print/PrintAttributes$MediaSize;
    #v2=(Reference);
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    #v5=(Integer);
    if-le v4, v5, :cond_1

    .line 171
    sget-object v2, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;

    .line 173
    :cond_1
    new-instance v4, Landroid/print/PrintAttributes$Builder;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/print/PrintAttributes$Builder;-><init>()V

    #v4=(Reference);
    invoke-virtual {v4, v2}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;

    move-result-object v4

    iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I

    invoke-virtual {v4, v5}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    move-result-object v0

    .line 178
    .local v0, attr:Landroid/print/PrintAttributes;
    #v0=(Reference);
    new-instance v4, Landroid/support/v4/print/PrintHelperKitkat$1;

    #v4=(UninitRef);
    invoke-direct {v4, p0, p1, p2, v1}, Landroid/support/v4/print/PrintHelperKitkat$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    #v4=(Reference);
    invoke-virtual {v3, p1, v4, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    goto :goto_0
.end method

.method public printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 7
    .parameter "jobName"
    .parameter "imageFile"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 287
    iget v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I

    .line 289
    .local v2, fittingMode:I
    #v2=(Integer);
    new-instance v3, Landroid/support/v4/print/PrintHelperKitkat$2;

    #v3=(UninitRef);
    invoke-direct {v3, p0, p1, p2, v2}, Landroid/support/v4/print/PrintHelperKitkat$2;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/net/Uri;I)V

    .line 434
    .local v3, printDocumentAdapter:Landroid/print/PrintDocumentAdapter;
    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    #v5=(Reference);
    const-string v6, "print"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/print/PrintManager;

    .line 435
    .local v4, printManager:Landroid/print/PrintManager;
    new-instance v1, Landroid/print/PrintAttributes$Builder;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 436
    .local v1, builder:Landroid/print/PrintAttributes$Builder;
    #v1=(Reference);
    iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I

    #v5=(Integer);
    invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;

    .line 438
    iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I

    const/4 v6, 0x1

    #v6=(One);
    if-ne v5, v6, :cond_1

    .line 439
    sget-object v5, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;

    #v5=(Reference);
    invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;

    .line 443
    :cond_0
    :goto_0
    #v5=(Conflicted);v6=(PosByte);
    invoke-virtual {v1}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    move-result-object v0

    .line 445
    .local v0, attr:Landroid/print/PrintAttributes;
    #v0=(Reference);
    invoke-virtual {v4, p1, v3, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    .line 446
    return-void

    .line 440
    .end local v0           #attr:Landroid/print/PrintAttributes;
    :cond_1
    #v0=(Uninit);v5=(Integer);v6=(One);
    iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I

    const/4 v6, 0x2

    #v6=(PosByte);
    if-ne v5, v6, :cond_0

    .line 441
    sget-object v5, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;

    #v5=(Reference);
    invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;

    goto :goto_0
.end method

.method public setColorMode(I)V
    .locals 0
    .parameter "colorMode"

    .prologue
    .line 124
    iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I

    .line 125
    return-void
.end method

.method public setOrientation(I)V
    .locals 0
    .parameter "orientation"

    .prologue
    .line 134
    iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I

    .line 135
    return-void
.end method

.method public setScaleMode(I)V
    .locals 0
    .parameter "scaleMode"

    .prologue
    .line 102
    iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I

    .line 103
    return-void
.end method

*/}
