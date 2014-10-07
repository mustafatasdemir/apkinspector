package android.support.v4.print; class PrintHelperKitkat$1 {/*

.class Landroid/support/v4/print/PrintHelperKitkat$1;
.super Landroid/print/PrintDocumentAdapter;
.source "PrintHelperKitkat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private mAttributes:Landroid/print/PrintAttributes;

.field final synthetic this$0:Landroid/support/v4/print/PrintHelperKitkat;

.field final synthetic val$bitmap:Landroid/graphics/Bitmap;

.field final synthetic val$fittingMode:I

.field final synthetic val$jobName:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/graphics/Bitmap;I)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 179
    iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;

    iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$jobName:Ljava/lang/String;

    iput-object p3, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;

    iput p4, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$fittingMode:I

    invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
    .locals 4
    .parameter "oldPrintAttributes"
    .parameter "newPrintAttributes"
    .parameter "cancellationSignal"
    .parameter "layoutResultCallback"
    .parameter "bundle"

    .prologue
    const/4 v0, 0x1

    .line 189
    #v0=(One);
    iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;

    .line 191
    new-instance v2, Landroid/print/PrintDocumentInfo$Builder;

    #v2=(UninitRef);
    iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$jobName:Ljava/lang/String;

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;

    move-result-object v1

    .line 195
    .local v1, info:Landroid/print/PrintDocumentInfo;
    #v1=(Reference);
    invoke-virtual {p2, p1}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 196
    .local v0, changed:Z
    :goto_0
    #v0=(Boolean);
    invoke-virtual {p4, v1, v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V

    .line 197
    return-void

    .line 195
    .end local v0           #changed:Z
    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V
    .locals 9
    .parameter "pageRanges"
    .parameter "fileDescriptor"
    .parameter "cancellationSignal"
    .parameter "writeResultCallback"

    .prologue
    .line 203
    new-instance v4, Landroid/print/pdf/PrintedPdfDocument;

    #v4=(UninitRef);
    iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;

    #v5=(Reference);
    iget-object v5, v5, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;

    iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;

    #v6=(Reference);
    invoke-direct {v4, v5, v6}, Landroid/print/pdf/PrintedPdfDocument;-><init>(Landroid/content/Context;Landroid/print/PrintAttributes;)V

    .line 206
    .local v4, pdfDocument:Landroid/print/pdf/PrintedPdfDocument;
    #v4=(Reference);
    const/4 v5, 0x1

    :try_start_0
    #v5=(One);
    invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->startPage(I)Landroid/graphics/pdf/PdfDocument$Page;

    move-result-object v3

    .line 208
    .local v3, page:Landroid/graphics/pdf/PdfDocument$Page;
    #v3=(Reference);
    new-instance v0, Landroid/graphics/RectF;

    #v0=(UninitRef);
    invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getInfo()Landroid/graphics/pdf/PdfDocument$PageInfo;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/graphics/pdf/PdfDocument$PageInfo;->getContentRect()Landroid/graphics/Rect;

    move-result-object v5

    invoke-direct {v0, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 210
    .local v0, content:Landroid/graphics/RectF;
    #v0=(Reference);
    iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;

    iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    #v6=(Integer);
    iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    #v7=(Integer);
    iget v8, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$fittingMode:I

    #v8=(Integer);
    invoke-static {v5, v6, v7, v0, v8}, Landroid/support/v4/print/PrintHelperKitkat;->access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v2

    .line 214
    .local v2, matrix:Landroid/graphics/Matrix;
    #v2=(Reference);
    invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getCanvas()Landroid/graphics/Canvas;

    move-result-object v5

    iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v5, v6, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 217
    invoke-virtual {v4, v3}, Landroid/print/pdf/PrintedPdfDocument;->finishPage(Landroid/graphics/pdf/PdfDocument$Page;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    :try_start_1
    new-instance v5, Ljava/io/FileOutputStream;

    #v5=(UninitRef);
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->writeTo(Ljava/io/OutputStream;)V

    .line 224
    const/4 v5, 0x1

    #v5=(One);
    new-array v5, v5, [Landroid/print/PageRange;

    #v5=(Reference);
    const/4 v6, 0x0

    #v6=(Null);
    sget-object v7, Landroid/print/PageRange;->ALL_PAGES:Landroid/print/PageRange;

    #v7=(Reference);
    aput-object v7, v5, v6

    invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFinished([Landroid/print/PageRange;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 232
    :goto_0
    #v1=(Conflicted);v6=(Reference);
    if-eqz v4, :cond_0

    .line 233
    invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V

    .line 235
    :cond_0
    if-eqz p2, :cond_1

    .line 237
    :try_start_2
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 243
    :cond_1
    :goto_1
    return-void

    .line 226
    :catch_0
    #v1=(Uninit);v5=(Conflicted);
    move-exception v1

    .line 228
    .local v1, ioe:Ljava/io/IOException;
    :try_start_3
    #v1=(Reference);
    const-string v5, "PrintHelperKitkat"

    #v5=(Reference);
    const-string v6, "Error writing printed content"

    invoke-static {v5, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 229
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFailed(Ljava/lang/CharSequence;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 232
    .end local v0           #content:Landroid/graphics/RectF;
    .end local v1           #ioe:Ljava/io/IOException;
    .end local v2           #matrix:Landroid/graphics/Matrix;
    .end local v3           #page:Landroid/graphics/pdf/PdfDocument$Page;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v5

    #v5=(Reference);
    if-eqz v4, :cond_2

    .line 233
    invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V

    .line 235
    :cond_2
    if-eqz p2, :cond_3

    .line 237
    :try_start_4
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 240
    :cond_3
    :goto_2
    throw v5

    .line 238
    .restart local v0       #content:Landroid/graphics/RectF;
    .restart local v2       #matrix:Landroid/graphics/Matrix;
    .restart local v3       #page:Landroid/graphics/pdf/PdfDocument$Page;
    :catch_1
    #v0=(Reference);v2=(Reference);v3=(Reference);v6=(Reference);v7=(Reference);v8=(Integer);
    move-exception v5

    goto :goto_1

    .end local v0           #content:Landroid/graphics/RectF;
    .end local v2           #matrix:Landroid/graphics/Matrix;
    .end local v3           #page:Landroid/graphics/pdf/PdfDocument$Page;
    :catch_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v6

    #v6=(Reference);
    goto :goto_2
.end method

*/}
