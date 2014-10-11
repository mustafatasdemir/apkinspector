package android.support.v4.hardware.display; class DisplayManagerCompat$LegacyImpl { void a() { int a;
a=0;// .class Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;
a=0;// .super Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;// .source "DisplayManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "LegacyImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-direct {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat;-><init>()V
a=0;// 
a=0;//     .line 109
a=0;//     #p0=(Reference,Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;);
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDisplay(I)Landroid/view/Display;
a=0;//     .locals 2
a=0;//     .param p1, "displayId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     iget-object v1, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "display":Landroid/view/Display;
a=0;//     #v0=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p1, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     .end local v0    # "display":Landroid/view/Display;
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "display":Landroid/view/Display;
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplays()[Landroid/view/Display;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Landroid/view/Display;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/view/Display;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplays(Ljava/lang/String;)[Landroid/view/Display;
a=0;//     .locals 1
a=0;//     .param p1, "category"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->getDisplays()[Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Landroid/view/Display;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Landroid/view/Display;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/view/Display;);
a=0;//     goto :goto_0
a=0;// .end method
}}
