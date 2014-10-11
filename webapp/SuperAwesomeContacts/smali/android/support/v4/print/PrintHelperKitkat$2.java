package android.support.v4.print; class PrintHelperKitkat$2 { void a() { int a;
a=0;// .class Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// .super Landroid/print/PrintDocumentAdapter;
a=0;// .source "PrintHelperKitkat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field loadBitmap:Landroid/os/AsyncTask;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/AsyncTask",
a=0;//             "<",
a=0;//             "Landroid/net/Uri;",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;// .field mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;// .field final synthetic val$fittingMode:I
a=0;// 
a=0;// .field final synthetic val$imageFile:Landroid/net/Uri;
a=0;// 
a=0;// .field final synthetic val$jobName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/net/Uri;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->val$jobName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->val$imageFile:Landroid/net/Uri;
a=0;// 
a=0;//     iput p4, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->val$fittingMode:I
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V
a=0;// 
a=0;//     .line 292
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/print/PrintHelperKitkat$2;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     invoke-direct {p0}, Landroid/support/v4/print/PrintHelperKitkat$2;->cancelLoad()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private cancelLoad()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 371
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-static {v0}, Landroid/support/v4/print/PrintHelperKitkat;->access$300(Landroid/support/v4/print/PrintHelperKitkat;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 372
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/BitmapFactory$Options;->requestCancelDecode()V
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .line 376
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// 
a=0;//     .line 376
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onFinish()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     invoke-super {p0}, Landroid/print/PrintDocumentAdapter;->onFinish()V
a=0;// 
a=0;//     .line 382
a=0;//     invoke-direct {p0}, Landroid/support/v4/print/PrintHelperKitkat$2;->cancelLoad()V
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->loadBitmap:Landroid/os/AsyncTask;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/AsyncTask;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z
a=0;// 
a=0;//     .line 384
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
a=0;//     .locals 9
a=0;//     .param p1, "oldPrintAttributes"    # Landroid/print/PrintAttributes;
a=0;//     .param p2, "newPrintAttributes"    # Landroid/print/PrintAttributes;
a=0;//     .param p3, "cancellationSignal"    # Landroid/os/CancellationSignal;
a=0;//     .param p4, "layoutResultCallback"    # Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;//     .param p5, "bundle"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 300
a=0;//     #v6=(One);
a=0;//     invoke-virtual {p3}, Landroid/os/CancellationSignal;->isCanceled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {p4}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutCancelled()V
a=0;// 
a=0;//     .line 302
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     .line 368
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 306
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 307
a=0;//     new-instance v0, Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/print/PrintDocumentInfo$Builder;);
a=0;//     iget-object v1, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->val$jobName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/print/PrintDocumentInfo$Builder;);
a=0;//     invoke-virtual {v0, v6}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 311
a=0;//     .local v7, "info":Landroid/print/PrintDocumentInfo;
a=0;//     #v7=(Reference,Landroid/print/PrintDocumentInfo;);
a=0;//     invoke-virtual {p2, p1}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 312
a=0;//     .local v6, "changed":Z
a=0;//     :goto_1
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {p4, v7, v6}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v6    # "changed":Z
a=0;//     :cond_1
a=0;//     #v6=(One);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 311
a=0;//     #v6=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 316
a=0;//     .end local v7    # "info":Landroid/print/PrintDocumentInfo;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Uninit);v6=(One);v7=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/print/PrintHelperKitkat$2$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/print/PrintHelperKitkat$2$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/CancellationSignal;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Landroid/print/PrintAttributes;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/print/PrintAttributes;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Landroid/print/PrintDocumentAdapter$LayoutResultCallback;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/print/PrintHelperKitkat$2$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat$2;Landroid/os/CancellationSignal;Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->loadBitmap:Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 365
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->loadBitmap:Landroid/os/AsyncTask;
a=0;// 
a=0;//     new-array v1, v8, [Landroid/net/Uri;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 367
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V
a=0;//     .locals 9
a=0;//     .param p1, "pageRanges"    # [Landroid/print/PageRange;
a=0;//     .param p2, "fileDescriptor"    # Landroid/os/ParcelFileDescriptor;
a=0;//     .param p3, "cancellationSignal"    # Landroid/os/CancellationSignal;
a=0;//     .param p4, "writeResultCallback"    # Landroid/print/PrintDocumentAdapter$WriteResultCallback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     new-instance v4, Landroid/print/pdf/PrintedPdfDocument;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/print/pdf/PrintedPdfDocument;);
a=0;//     iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     iget-object v5, v5, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     #v6=(Reference,Landroid/print/PrintAttributes;);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/print/pdf/PrintedPdfDocument;-><init>(Landroid/content/Context;Landroid/print/PrintAttributes;)V
a=0;// 
a=0;//     .line 394
a=0;//     .local v4, "pdfDocument":Landroid/print/pdf/PrintedPdfDocument;
a=0;//     #v4=(Reference,Landroid/print/pdf/PrintedPdfDocument;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->startPage(I)Landroid/graphics/pdf/PdfDocument$Page;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 395
a=0;//     .local v3, "page":Landroid/graphics/pdf/PdfDocument$Page;
a=0;//     #v3=(Reference,Landroid/graphics/pdf/PdfDocument$Page;);
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getInfo()Landroid/graphics/pdf/PdfDocument$PageInfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/pdf/PdfDocument$PageInfo;);
a=0;//     invoke-virtual {v5}, Landroid/graphics/pdf/PdfDocument$PageInfo;->getContentRect()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v0, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 398
a=0;//     .local v0, "content":Landroid/graphics/RectF;
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->val$fittingMode:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v5, v6, v7, v0, v8}, Landroid/support/v4/print/PrintHelperKitkat;->access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 402
a=0;//     .local v2, "matrix":Landroid/graphics/Matrix;
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v6, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v4, v3}, Landroid/print/pdf/PrintedPdfDocument;->finishPage(Landroid/graphics/pdf/PdfDocument$Page;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 409
a=0;//     :try_start_1
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 412
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Landroid/print/PageRange;
a=0;// 
a=0;//     #v5=(Reference,[Landroid/print/PageRange;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     sget-object v7, Landroid/print/PageRange;->ALL_PAGES:Landroid/print/PageRange;
a=0;// 
a=0;//     #v7=(Reference,Landroid/print/PageRange;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFinished([Landroid/print/PageRange;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 420
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 421
a=0;//     invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
a=0;// 
a=0;//     .line 423
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     :try_start_2
a=0;//     invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 431
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 414
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 416
a=0;//     .local v1, "ioe":Ljava/io/IOException;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const-string v5, "PrintHelperKitkat"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Error writing printed content"
a=0;// 
a=0;//     invoke-static {v5, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 417
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFailed(Ljava/lang/CharSequence;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 420
a=0;//     .end local v0    # "content":Landroid/graphics/RectF;
a=0;//     .end local v1    # "ioe":Ljava/io/IOException;
a=0;//     .end local v2    # "matrix":Landroid/graphics/Matrix;
a=0;//     .end local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 421
a=0;//     invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
a=0;// 
a=0;//     .line 423
a=0;//     :cond_2
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 425
a=0;//     :try_start_4
a=0;//     invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 428
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     throw v5
a=0;// 
a=0;//     .line 426
a=0;//     .restart local v0    # "content":Landroid/graphics/RectF;
a=0;//     .restart local v2    # "matrix":Landroid/graphics/Matrix;
a=0;//     .restart local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
a=0;//     :catch_1
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);v2=(Reference,Landroid/graphics/Matrix;);v3=(Reference,Landroid/graphics/pdf/PdfDocument$Page;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Landroid/print/PageRange;);v8=(Integer);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "content":Landroid/graphics/RectF;
a=0;//     .end local v2    # "matrix":Landroid/graphics/Matrix;
a=0;//     .end local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_2
a=0;// .end method
}}
