package android.support.v4.app; class ActivityOptionsCompatJB { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityOptionsCompatJB.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActivityOptions:Landroid/app/ActivityOptions;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/app/ActivityOptions;)V
a=0;//     .locals 0
a=0;//     .param p1, "activityOptions"    # Landroid/app/ActivityOptions;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static makeCustomAnimation(Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "enterResId"    # I
a=0;//     .param p2, "exitResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-static {p0, p1, p2}, Landroid/app/ActivityOptions;->makeCustomAnimation(Landroid/content/Context;II)Landroid/app/ActivityOptions;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ActivityOptions;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;//     .locals 2
a=0;//     .param p0, "source"    # Landroid/view/View;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "startWidth"    # I
a=0;//     .param p4, "startHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-static {p0, p1, p2, p3, p4}, Landroid/app/ActivityOptions;->makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/app/ActivityOptions;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ActivityOptions;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;//     .locals 2
a=0;//     .param p0, "source"    # Landroid/view/View;
a=0;//     .param p1, "thumbnail"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "startX"    # I
a=0;//     .param p3, "startY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-static {p0, p1, p2, p3}, Landroid/app/ActivityOptions;->makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/app/ActivityOptions;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ActivityOptions;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toBundle()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActivityOptions;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public update(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;//     .locals 2
a=0;//     .param p1, "otherOptions"    # Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActivityOptions;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ActivityOptions;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->update(Landroid/app/ActivityOptions;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
}}
