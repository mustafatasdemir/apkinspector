package android.support.v4.text; class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale { void a() { int a;
a=0;// .class Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;
a=0;// .super Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;
a=0;// .source "TextDirectionHeuristicsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/text/TextDirectionHeuristicsCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "TextDirectionHeuristicLocale"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;->INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;)V
a=0;// 
a=0;//     .line 246
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected defaultIsRtl()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 250
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {v2}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "dir":I
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
