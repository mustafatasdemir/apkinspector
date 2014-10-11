package android.support.v4.print; class PrintHelper { void a() { int a;
a=0;// .class public final Landroid/support/v4/print/PrintHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PrintHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/print/PrintHelper$1;,
a=0;//         Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;,
a=0;//         Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;,
a=0;//         Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final COLOR_MODE_COLOR:I = 0x2
a=0;// 
a=0;// .field public static final COLOR_MODE_MONOCHROME:I = 0x1
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
a=0;// .field mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 198
a=0;//     #p0=(Reference,Landroid/support/v4/print/PrintHelper;);
a=0;//     invoke-static {}, Landroid/support/v4/print/PrintHelper;->systemSupportsPrint()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     .line 203
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;-><init>(Landroid/support/v4/print/PrintHelper$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static systemSupportsPrint()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getColorMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getColorMode()I
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
a=0;//     .line 268
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getOrientation()I
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
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getScaleMode()I
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
a=0;//     .line 278
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 279
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
a=0;//     .line 291
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "colorMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setColorMode(I)V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOrientation(I)V
a=0;//     .locals 1
a=0;//     .param p1, "orientation"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setOrientation(I)V
a=0;// 
a=0;//     .line 259
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setScaleMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setScaleMode(I)V
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// .end method
}}
