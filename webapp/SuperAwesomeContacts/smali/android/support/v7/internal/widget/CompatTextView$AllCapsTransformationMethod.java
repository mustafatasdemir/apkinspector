package android.support.v7.internal.widget; class CompatTextView$AllCapsTransformationMethod { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CompatTextView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/text/method/TransformationMethod;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/CompatTextView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "AllCapsTransformationMethod"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mLocale:Ljava/util/Locale;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;->mLocale:Ljava/util/Locale;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;//     .param p1, "source"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;->mLocale:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onFocusChanged(Landroid/view/View;Ljava/lang/CharSequence;ZILandroid/graphics/Rect;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "charSequence"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "b"    # Z
a=0;//     .param p4, "i"    # I
a=0;//     .param p5, "rect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
}}
