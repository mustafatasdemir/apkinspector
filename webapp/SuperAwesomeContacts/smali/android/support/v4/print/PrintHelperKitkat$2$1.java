package android.support.v4.print; class PrintHelperKitkat$2$1 { void a() { int a;
a=0;// .class Landroid/support/v4/print/PrintHelperKitkat$2$1;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "PrintHelperKitkat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/print/PrintHelperKitkat$2;->onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Landroid/net/Uri;",
a=0;//         "Ljava/lang/Boolean;",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;// .field final synthetic val$cancellationSignal:Landroid/os/CancellationSignal;
a=0;// 
a=0;// .field final synthetic val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;// 
a=0;// .field final synthetic val$newPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;// .field final synthetic val$oldPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/print/PrintHelperKitkat$2;Landroid/os/CancellationSignal;Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     iput-object p1, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$cancellationSignal:Landroid/os/CancellationSignal;
a=0;// 
a=0;//     iput-object p3, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$newPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     iput-object p4, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$oldPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     iput-object p5, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs doInBackground([Landroid/net/Uri;)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;//     .param p1, "uris"    # [Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     iget-object v0, v0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     iget-object v1, v1, Landroid/support/v4/print/PrintHelperKitkat$2;->val$imageFile:Landroid/net/Uri;
a=0;// 
a=0;//     const/16 v2, 0xdac
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/print/PrintHelperKitkat;->access$200(Landroid/support/v4/print/PrintHelperKitkat;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 338
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 335
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 338
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     check-cast p1, [Landroid/net/Uri;
a=0;// 
a=0;//     .end local p1    # "x0":[Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->doInBackground([Landroid/net/Uri;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/print/PrintDocumentAdapter$LayoutResultCallback;);
a=0;//     invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutCancelled()V
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     check-cast p1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->onCancelled(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Landroid/graphics/Bitmap;)V
a=0;//     .locals 4
a=0;//     .param p1, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 343
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     iput-object p1, v2, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 345
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 346
a=0;//     new-instance v2, Landroid/print/PrintDocumentInfo$Builder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/print/PrintDocumentInfo$Builder;);
a=0;//     iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);
a=0;//     iget-object v3, v3, Landroid/support/v4/print/PrintHelperKitkat$2;->val$jobName:Ljava/lang/String;
a=0;// 
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
a=0;//     .line 350
a=0;//     .local v1, "info":Landroid/print/PrintDocumentInfo;
a=0;//     #v1=(Reference,Landroid/print/PrintDocumentInfo;);
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$newPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$oldPrintAttributes:Landroid/print/PrintAttributes;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "changed":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;// 
a=0;//     #v2=(Reference,Landroid/print/PrintDocumentAdapter$LayoutResultCallback;);
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V
a=0;// 
a=0;//     .line 357
a=0;//     .end local v0    # "changed":Z
a=0;//     .end local v1    # "info":Landroid/print/PrintDocumentInfo;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 350
a=0;//     .restart local v1    # "info":Landroid/print/PrintDocumentInfo;
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Reference,Landroid/print/PrintDocumentInfo;);v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     .end local v1    # "info":Landroid/print/PrintDocumentInfo;
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);v2=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2;);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFailed(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     check-cast p1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->onPostExecute(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$cancellationSignal:Landroid/os/CancellationSignal;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/CancellationSignal;);
a=0;//     new-instance v1, Landroid/support/v4/print/PrintHelperKitkat$2$1$1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/print/PrintHelperKitkat$2$1$1;);
a=0;//     invoke-direct {v1, p0}, Landroid/support/v4/print/PrintHelperKitkat$2$1$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat$2$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/print/PrintHelperKitkat$2$1$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
}}
