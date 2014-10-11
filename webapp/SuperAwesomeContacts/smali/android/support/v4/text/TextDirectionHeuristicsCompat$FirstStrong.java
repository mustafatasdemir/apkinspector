package android.support.v4.text; class TextDirectionHeuristicsCompat$FirstStrong { void a() { int a;
a=0;// .class Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TextDirectionHeuristicsCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/text/TextDirectionHeuristicsCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "FirstStrong"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;->INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 191
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkRtl(Ljava/lang/CharSequence;II)I
a=0;//     .locals 4
a=0;//     .param p1, "cs"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 184
a=0;//     .local v2, "result":I
a=0;//     #v2=(PosByte);
a=0;//     move v1, p2
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     #v1=(Integer);
a=0;//     add-int v0, p2, p3
a=0;// 
a=0;//     .local v0, "e":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-static {v3}, Ljava/lang/Character;->getDirectionality(C)B
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->access$100(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 184
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return v2
a=0;// .end method
}}
