package android.support.v4.print; class PrintHelper$PrintHelperKitkatImpl { void a() { int a;
a=0;// .class final Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PrintHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/print/PrintHelper;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "PrintHelperKitkatImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;);
a=0;//     new-instance v0, Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getColorMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getColorMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrientation()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getOrientation()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getScaleMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getScaleMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "jobName"    # Ljava/lang/String;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
a=0;//     .locals 1
a=0;//     .param p1, "jobName"    # Ljava/lang/String;
a=0;//     .param p2, "imageFile"    # Landroid/net/Uri;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "colorMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setColorMode(I)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOrientation(I)V
a=0;//     .locals 1
a=0;//     .param p1, "orientation"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setOrientation(I)V
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelperKitkat;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setScaleMode(I)V
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
}}
