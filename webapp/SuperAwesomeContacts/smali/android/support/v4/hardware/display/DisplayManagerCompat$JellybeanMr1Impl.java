package android.support.v4.hardware.display; class DisplayManagerCompat$JellybeanMr1Impl { void a() { int a;
a=0;// .class Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;
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
a=0;//     name = "JellybeanMr1Impl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDisplayManagerObj:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     invoke-direct {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat;-><init>()V
a=0;// 
a=0;//     .line 136
a=0;//     #p0=(Reference,Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;);
a=0;//     invoke-static {p1}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplayManager(Landroid/content/Context;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDisplay(I)Landroid/view/Display;
a=0;//     .locals 1
a=0;//     .param p1, "displayId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplay(Ljava/lang/Object;I)Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplays()[Landroid/view/Display;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplays(Ljava/lang/Object;)[Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplays(Ljava/lang/String;)[Landroid/view/Display;
a=0;//     .locals 1
a=0;//     .param p1, "category"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplays(Ljava/lang/Object;Ljava/lang/String;)[Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
