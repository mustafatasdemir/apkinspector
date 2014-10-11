package android.support.v4.view; class PagerTitleStripIcs$SingleLineAllCapsTransform { void a() { int a;
a=0;// .class Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;
a=0;// .super Landroid/text/method/SingleLineTransformationMethod;
a=0;// .source "PagerTitleStripIcs.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/PagerTitleStripIcs;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "SingleLineAllCapsTransform"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "SingleLineAllCapsTransform"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mLocale:Ljava/util/Locale;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Landroid/text/method/SingleLineTransformationMethod;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;);
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
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;->mLocale:Ljava/util/Locale;
a=0;// 
a=0;//     .line 38
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
a=0;//     .line 42
a=0;//     invoke-super {p0, p1, p2}, Landroid/text/method/SingleLineTransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 43
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;->mLocale:Ljava/util/Locale;
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
}}
