package android.support.v4.print; class PrintHelperKitkat { void a() { int a;
a=0;// .class Landroid/support/v4/print/PrintHelperKitkat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PrintHelperKitkat.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final COLOR_MODE_COLOR:I = 0x2
a=0;// 
a=0;// .field public static final COLOR_MODE_MONOCHROME:I = 0x1
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "PrintHelperKitkat"
a=0;// 
a=0;// .field private static final MAX_PRINT_SIZE:I = 0xdac
a=0;// 
a=0;// .field public static final ORIENTATION_LANDSCAPE:I = 0x1
a=0;// 
a=0;// .field public static final ORIENTATION_PORTRAIT:I = 0x2
a=0;// 
a=0;// .field public static final SCALE_MODE_FILL:I = 0x2
a=0;// 
a=0;// .field public static final SCALE_MODE_FIT:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mColorMode:I
a=0;// 
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;// .field private final mLock:Ljava/lang/Object;
a=0;// 
a=0;// .field mOrientation:I
a=0;// 
a=0;// .field mScaleMode:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 87
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 81
a=0;//     iput v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
a=0;// 
a=0;//     .line 83
a=0;//     iput v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/print/PrintHelperKitkat;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # I
a=0;//     .param p3, "x3"    # Landroid/graphics/RectF;
a=0;//     .param p4, "x4"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v4/print/PrintHelperKitkat;->getMatrix(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/print/PrintHelperKitkat;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/print/PrintHelperKitkat;
a=0;//     .param p1, "x1"    # Landroid/net/Uri;
a=0;//     .param p2, "x2"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/print/PrintHelperKitkat;->loadConstrainedBitmap(Landroid/net/Uri;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/print/PrintHelperKitkat;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getMatrix(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
a=0;//     .locals 7
a=0;//     .param p1, "imageWidth"    # I
a=0;//     .param p2, "imageHeight"    # I
a=0;//     .param p3, "content"    # Landroid/graphics/RectF;
a=0;//     .param p4, "fittingMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x40000000
a=0;// 
a=0;//     .line 257
a=0;//     #v6=(Integer);
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 260
a=0;//     .local v0, "matrix":Landroid/graphics/Matrix;
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p3}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, p1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float v1, v4, v5
a=0;// 
a=0;//     .line 261
a=0;//     .local v1, "scale":F
a=0;//     #v1=(Float);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne p4, v4, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, p2
a=0;// 
a=0;//     div-float/2addr v4, v5
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 266
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p3}, Landroid/graphics/RectF;->width()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     int-to-float v5, p1
a=0;// 
a=0;//     mul-float/2addr v5, v1
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     div-float v2, v4, v6
a=0;// 
a=0;//     .line 271
a=0;//     .local v2, "translateX":F
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     int-to-float v5, p2
a=0;// 
a=0;//     mul-float/2addr v5, v1
a=0;// 
a=0;//     sub-float/2addr v4, v5
a=0;// 
a=0;//     div-float v3, v4, v6
a=0;// 
a=0;//     .line 273
a=0;//     .local v3, "translateY":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 274
a=0;//     return-object v0
a=0;// 
a=0;//     .line 264
a=0;//     .end local v2    # "translateX":F
a=0;//     .end local v3    # "translateY":F
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(PosByte);
a=0;//     invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, p2
a=0;// 
a=0;//     div-float/2addr v4, v5
a=0;// 
a=0;//     invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     .locals 5
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "o"    # Landroid/graphics/BitmapFactory$Options;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "bad argument to loadBitmap"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 510
a=0;//     :cond_1
a=0;//     #v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 512
a=0;//     .local v0, "is":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 513
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 515
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 517
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 520
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 518
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 519
a=0;//     .local v1, "t":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const-string v3, "PrintHelperKitkat"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "close fail "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 515
a=0;//     .end local v1    # "t":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 517
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 520
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 518
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 519
a=0;//     .restart local v1    # "t":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const-string v3, "PrintHelperKitkat"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "close fail "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private loadConstrainedBitmap(Landroid/net/Uri;I)Landroid/graphics/Bitmap;
a=0;//     .locals 9
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "maxSideLength"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 457
a=0;//     #v6=(Null);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 458
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v7, "bad argument to getScaledBitmap"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 461
a=0;//     :cond_1
a=0;//     #v6=(Null);
a=0;//     new-instance v3, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 462
a=0;//     .local v3, "opt":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v3=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v8, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 463
a=0;//     invoke-direct {p0, p1, v3}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 465
a=0;//     iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 466
a=0;//     .local v5, "w":I
a=0;//     #v5=(Integer);
a=0;//     iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 469
a=0;//     .local v1, "h":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     if-gtz v1, :cond_3
a=0;// 
a=0;//     .line 498
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Reference,Landroid/graphics/Bitmap;);v7=(Conflicted);v8=(Boolean);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 474
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Null);v7=(Reference,Landroid/content/Context;);v8=(One);
a=0;//     invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 476
a=0;//     .local v2, "imageSide":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 477
a=0;//     .local v4, "sampleSize":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     if-le v2, p2, :cond_4
a=0;// 
a=0;//     .line 478
a=0;//     ushr-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 479
a=0;//     shl-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 483
a=0;//     :cond_4
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-int/2addr v7, v4
a=0;// 
a=0;//     if-lez v7, :cond_2
a=0;// 
a=0;//     .line 486
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 487
a=0;//     .local v0, "decodeOptions":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v0=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v7
a=0;// 
a=0;//     .line 488
a=0;//     :try_start_0
a=0;//     new-instance v6, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 489
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     iput-boolean v8, v6, Landroid/graphics/BitmapFactory$Options;->inMutable:Z
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     iput v4, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 492
a=0;//     #v0=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     monitor-exit v7
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 494
a=0;//     :try_start_1
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v7
a=0;// 
a=0;//     .line 497
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v8=(Null);
a=0;//     iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 498
a=0;//     monitor-exit v7
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v6
a=0;// 
a=0;//     monitor-exit v7
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 492
a=0;//     :catchall_1
a=0;//     #v6=(Conflicted);v8=(One);
a=0;//     move-exception v6
a=0;// 
a=0;//     :try_start_3
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v7
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 496
a=0;//     :catchall_2
a=0;//     move-exception v6
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v7
a=0;// 
a=0;//     .line 497
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v8=(Null);
a=0;//     iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 498
a=0;//     monitor-exit v7
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     :catchall_3
a=0;//     move-exception v6
a=0;// 
a=0;//     :try_start_5
a=0;//     monitor-exit v7
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getColorMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrientation()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 6
a=0;//     .param p1, "jobName"    # Ljava/lang/String;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
a=0;// 
a=0;//     .line 168
a=0;//     .local v1, "fittingMode":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const-string v5, "print"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/print/PrintManager;
a=0;// 
a=0;//     .line 169
a=0;//     .local v3, "printManager":Landroid/print/PrintManager;
a=0;//     sget-object v2, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;
a=0;// 
a=0;//     .line 170
a=0;//     .local v2, "mediaSize":Landroid/print/PrintAttributes$MediaSize;
a=0;//     #v2=(Reference,Landroid/print/PrintAttributes$MediaSize;);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v4, v5, :cond_1
a=0;// 
a=0;//     .line 171
a=0;//     sget-object v2, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     new-instance v4, Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/print/PrintAttributes$Builder;);
a=0;//     invoke-direct {v4}, Landroid/print/PrintAttributes$Builder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/print/PrintAttributes$Builder;);
a=0;//     invoke-virtual {v4, v2}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "attr":Landroid/print/PrintAttributes;
a=0;//     #v0=(Reference,Landroid/print/PrintAttributes;);
a=0;//     new-instance v4, Landroid/support/v4/print/PrintHelperKitkat$1;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/print/PrintHelperKitkat$1;);
a=0;//     invoke-direct {v4, p0, p1, p2, v1}, Landroid/support/v4/print/PrintHelperKitkat$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/graphics/Bitmap;I)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/print/PrintHelperKitkat$1;);
a=0;//     invoke-virtual {v3, p1, v4, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
a=0;//     .locals 7
a=0;//     .param p1, "jobName"    # Ljava/lang/String;
a=0;//     .param p2, "imageFile"    # Landroid/net/Uri;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     iget v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
a=0;// 
a=0;//     .line 289
a=0;//     .local v2, "fittingMode":I
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     invoke-direct {v3, p0, p1, p2, v2}, Landroid/support/v4/print/PrintHelperKitkat$2;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/net/Uri;I)V
a=0;// 
a=0;//     .line 434
a=0;//     .local v3, "printDocumentAdapter":Landroid/print/PrintDocumentAdapter;
a=0;//     #v3=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "print"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/print/PrintManager;
a=0;// 
a=0;//     .line 435
a=0;//     .local v4, "printManager":Landroid/print/PrintManager;
a=0;//     new-instance v1, Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/print/PrintAttributes$Builder;);
a=0;//     invoke-direct {v1}, Landroid/print/PrintAttributes$Builder;-><init>()V
a=0;// 
a=0;//     .line 436
a=0;//     .local v1, "builder":Landroid/print/PrintAttributes$Builder;
a=0;//     #v1=(Reference,Landroid/print/PrintAttributes$Builder;);
a=0;//     iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     .line 438
a=0;//     iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 439
a=0;//     sget-object v5, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;
a=0;// 
a=0;//     #v5=(Reference,Landroid/print/PrintAttributes$MediaSize;);
a=0;//     invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     .line 443
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);v6=(PosByte);
a=0;//     invoke-virtual {v1}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 445
a=0;//     .local v0, "attr":Landroid/print/PrintAttributes;
a=0;//     #v0=(Reference,Landroid/print/PrintAttributes;);
a=0;//     invoke-virtual {v4, p1, v3, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
a=0;// 
a=0;//     .line 446
a=0;//     return-void
a=0;// 
a=0;//     .line 440
a=0;//     .end local v0    # "attr":Landroid/print/PrintAttributes;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v5=(Integer);v6=(One);
a=0;//     iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
a=0;// 
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 441
a=0;//     sget-object v5, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;
a=0;// 
a=0;//     #v5=(Reference,Landroid/print/PrintAttributes$MediaSize;);
a=0;//     invoke-virtual {v1, v5}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setColorMode(I)V
a=0;//     .locals 0
a=0;//     .param p1, "colorMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOrientation(I)V
a=0;//     .locals 0
a=0;//     .param p1, "orientation"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleMode(I)V
a=0;//     .locals 0
a=0;//     .param p1, "scaleMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
}}
