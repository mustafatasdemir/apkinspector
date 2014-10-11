package android.support.v4.app; class ActivityOptionsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityOptionsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 135
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static makeCustomAnimation(Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompat;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "enterResId"    # I
a=0;//     .param p2, "exitResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;);
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeCustomAnimation(Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompat;
a=0;//     .locals 2
a=0;//     .param p0, "source"    # Landroid/view/View;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "startWidth"    # I
a=0;//     .param p4, "startHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;);
a=0;//     invoke-static {p0, p1, p2, p3, p4}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompat;
a=0;//     .locals 2
a=0;//     .param p0, "source"    # Landroid/view/View;
a=0;//     .param p1, "thumbnail"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "startX"    # I
a=0;//     .param p3, "startY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;);
a=0;//     invoke-static {p0, p1, p2, p3}, Landroid/support/v4/app/ActivityOptionsCompatJB;->makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;-><init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toBundle()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public update(Landroid/support/v4/app/ActivityOptionsCompat;)V
a=0;//     .locals 0
a=0;//     .param p1, "otherOptions"    # Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
}}
