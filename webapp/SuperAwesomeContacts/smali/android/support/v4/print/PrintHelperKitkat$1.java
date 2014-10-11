package android.support.v4.print; class PrintHelperKitkat$1 { void a() { int a;
a=0;// .class Landroid/support/v4/print/PrintHelperKitkat$1;
a=0;// .super Landroid/print/PrintDocumentAdapter;
a=0;// .source "PrintHelperKitkat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;// .field final synthetic val$bitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field final synthetic val$fittingMode:I
a=0;// 
a=0;// .field final synthetic val$jobName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/graphics/Bitmap;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$jobName:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput p4, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$fittingMode:I
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelperKitkat$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "oldPrintAttributes"    # Landroid/print/PrintAttributes;
a=0;//     .param p2, "newPrintAttributes"    # Landroid/print/PrintAttributes;
a=0;//     .param p3, "cancellationSignal"    # Landroid/os/CancellationSignal;
a=0;//     .param p4, "layoutResultCallback"    # Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;//     .param p5, "bundle"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 189
a=0;//     #v0=(One);
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     .line 191
a=0;//     new-instance v2, Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/print/PrintDocumentInfo$Builder;);
a=0;//     iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$jobName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/print/PrintDocumentInfo$Builder;);
a=0;//     invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "info":Landroid/print/PrintDocumentInfo;
a=0;//     #v1=(Reference,Landroid/print/PrintDocumentInfo;);
a=0;//     invoke-virtual {p2, p1}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "changed":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p4, v1, v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     .end local v0    # "changed":Z
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
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
a=0;//     .line 203
a=0;//     new-instance v4, Landroid/print/pdf/PrintedPdfDocument;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/print/pdf/PrintedPdfDocument;);
a=0;//     iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     iget-object v5, v5, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     #v6=(Reference,Landroid/print/PrintAttributes;);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/print/pdf/PrintedPdfDocument;-><init>(Landroid/content/Context;Landroid/print/PrintAttributes;)V
a=0;// 
a=0;//     .line 206
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
a=0;//     .line 208
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
a=0;//     .line 210
a=0;//     .local v0, "content":Landroid/graphics/RectF;
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$fittingMode:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v5, v6, v7, v0, v8}, Landroid/support/v4/print/PrintHelperKitkat;->access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 214
a=0;//     .local v2, "matrix":Landroid/graphics/Matrix;
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5, v6, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v4, v3}, Landroid/print/pdf/PrintedPdfDocument;->finishPage(Landroid/graphics/pdf/PdfDocument$Page;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 221
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
a=0;//     .line 224
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
a=0;//     .line 232
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 237
a=0;//     :try_start_2
a=0;//     invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 226
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 228
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
a=0;//     .line 229
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFailed(Ljava/lang/CharSequence;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 232
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
a=0;//     .line 233
a=0;//     invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_2
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 237
a=0;//     :try_start_4
a=0;//     invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 240
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     throw v5
a=0;// 
a=0;//     .line 238
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
