package android.support.v4.text; class BidiFormatter$DirectionalityEstimator { void a() { int a;
a=0;// .class Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BidiFormatter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/text/BidiFormatter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DirectionalityEstimator"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DIR_TYPE_CACHE:[B
a=0;// 
a=0;// .field private static final DIR_TYPE_CACHE_SIZE:I = 0x700
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private charIndex:I
a=0;// 
a=0;// .field private final isHtml:Z
a=0;// 
a=0;// .field private lastChar:C
a=0;// 
a=0;// .field private final length:I
a=0;// 
a=0;// .field private final text:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x700
a=0;// 
a=0;//     .line 505
a=0;//     #v3=(PosShort);
a=0;//     new-array v1, v3, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     sput-object v1, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B
a=0;// 
a=0;//     .line 506
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 507
a=0;//     sget-object v1, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v0
a=0;// 
a=0;//     .line 506
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/String;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "isHtml"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 549
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 550
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;);
a=0;//     iput-object p1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     .line 551
a=0;//     iput-boolean p2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z
a=0;// 
a=0;//     .line 552
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     .line 553
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getCachedDirectionality(C)B
a=0;//     .locals 1
a=0;//     .param p0, "c"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 724
a=0;//     const/16 v0, 0x700
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     aget-byte v0, v0, p0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {p0}, Ljava/lang/Character;->getDirectionality(C)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private skipEntityBackward()B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x3b
a=0;// 
a=0;//     .line 865
a=0;//     #v3=(PosByte);
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 866
a=0;//     .local v0, "initialCharIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 867
a=0;//     iget-object v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     iput-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 868
a=0;//     iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 869
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     .line 877
a=0;//     :goto_0
a=0;//     #v1=(PosByte);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 871
a=0;//     :cond_1
a=0;//     #v1=(Char);v2=(PosByte);
a=0;//     iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 875
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 876
a=0;//     iput-char v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 877
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private skipEntityForward()B
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 850
a=0;//     :cond_0
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iput-char v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v1, 0x3b
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 851
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private skipTagBackward()B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x3e
a=0;// 
a=0;//     .line 822
a=0;//     #v4=(PosByte);
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 823
a=0;//     .local v0, "initialCharIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 824
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 825
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x3c
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 827
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     .line 841
a=0;//     :goto_0
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 829
a=0;//     :cond_1
a=0;//     #v2=(Char);v3=(PosByte);
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     if-ne v2, v4, :cond_3
a=0;// 
a=0;//     .line 839
a=0;//     :cond_2
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 840
a=0;//     iput-char v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 841
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 832
a=0;//     :cond_3
a=0;//     #v2=(Char);v3=(PosByte);
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x22
a=0;// 
a=0;//     if-eq v2, v3, :cond_4
a=0;// 
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x27
a=0;// 
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 834
a=0;//     :cond_4
a=0;//     iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 835
a=0;//     .local v1, "quote":C
a=0;//     :goto_1
a=0;//     #v1=(Char);v3=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     if-eq v2, v1, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private skipTagForward()B
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 793
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 794
a=0;//     .local v0, "initialCharIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_3
a=0;// 
a=0;//     .line 795
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 796
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x3e
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 798
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     .line 809
a=0;//     :goto_0
a=0;//     #v2=(PosByte);v3=(Integer);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 800
a=0;//     :cond_1
a=0;//     #v2=(Char);v3=(PosByte);v4=(Integer);
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x22
a=0;// 
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x27
a=0;// 
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 802
a=0;//     :cond_2
a=0;//     iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 803
a=0;//     .local v1, "quote":C
a=0;//     :goto_1
a=0;//     #v1=(Char);v3=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     if-eq v2, v1, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 807
a=0;//     .end local v1    # "quote":C
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 808
a=0;//     const/16 v2, 0x3c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 809
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method dirTypeBackward()B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 768
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 769
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 770
a=0;//     .local v0, "codePoint":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->charCount(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 771
a=0;//     invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 783
a=0;//     .end local v0    # "codePoint":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Byte);
a=0;//     return v1
a=0;// 
a=0;//     .line 773
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 774
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-static {v2}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getCachedDirectionality(C)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 775
a=0;//     .local v1, "dirType":B
a=0;//     #v1=(Byte);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 777
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     #v2=(Char);
a=0;//     const/16 v3, 0x3e
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 778
a=0;//     invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipTagBackward()B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 779
a=0;//     :cond_2
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x3b
a=0;// 
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 780
a=0;//     invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipEntityBackward()B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dirTypeForward()B
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 737
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     .line 738
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 740
a=0;//     .local v0, "codePoint":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->charCount(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 741
a=0;//     invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 753
a=0;//     .end local v0    # "codePoint":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Byte);
a=0;//     return v1
a=0;// 
a=0;//     .line 743
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 744
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-static {v2}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getCachedDirectionality(C)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 745
a=0;//     .local v1, "dirType":B
a=0;//     #v1=(Byte);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 747
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     #v2=(Char);
a=0;//     const/16 v3, 0x3c
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 748
a=0;//     invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipTagForward()B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 749
a=0;//     :cond_2
a=0;//     iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C
a=0;// 
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 750
a=0;//     invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipEntityForward()B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getEntryDir()I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 567
a=0;//     #v5=(Null);
a=0;//     iput v5, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 568
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 569
a=0;//     .local v0, "embeddingLevel":I
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 570
a=0;//     .local v1, "embeddingLevelDir":I
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 571
a=0;//     .local v2, "firstNonEmptyEmbeddingLevel":I
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Byte);v2=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget v6, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v6, v7, :cond_3
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 572
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeForward()B
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     packed-switch v6, :pswitch_data_0
a=0;// 
a=0;//     .line 606
a=0;//     :pswitch_1
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 607
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 575
a=0;//     :pswitch_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 576
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 577
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 580
a=0;//     :pswitch_3
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 581
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 582
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 584
a=0;//     :pswitch_4
a=0;//     #v1=(Byte);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 588
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 589
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 593
a=0;//     :pswitch_5
a=0;//     #v1=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 649
a=0;//     .end local v1    # "embeddingLevelDir":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v6=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 596
a=0;//     .restart local v1    # "embeddingLevelDir":I
a=0;//     :cond_1
a=0;//     #v6=(Byte);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 597
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 600
a=0;//     :pswitch_6
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 601
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 603
a=0;//     :cond_2
a=0;//     #v1=(Byte);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 604
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 613
a=0;//     :cond_3
a=0;//     #v6=(Integer);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 616
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 620
a=0;//     :cond_4
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 627
a=0;//     :goto_2
a=0;//     iget v6, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     if-lez v6, :cond_7
a=0;// 
a=0;//     .line 628
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeBackward()B
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     packed-switch v6, :pswitch_data_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 631
a=0;//     :pswitch_7
a=0;//     if-ne v2, v0, :cond_5
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 632
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 634
a=0;//     :cond_5
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 635
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 638
a=0;//     :pswitch_8
a=0;//     if-ne v2, v0, :cond_6
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 639
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 641
a=0;//     :cond_6
a=0;//     #v1=(Byte);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 642
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 644
a=0;//     :pswitch_9
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Integer);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 649
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 572
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_6
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 628
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0xe
a=0;//         :pswitch_7
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method getExitDir()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 665
a=0;//     #v2=(Byte);
a=0;//     iget v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     .line 666
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 667
a=0;//     .local v0, "embeddingLevel":I
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 668
a=0;//     .local v1, "lastNonEmptyEmbeddingLevel":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I
a=0;// 
a=0;//     if-lez v4, :cond_5
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeBackward()B
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 707
a=0;//     :pswitch_1
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 708
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 671
a=0;//     :pswitch_2
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 713
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 674
a=0;//     :cond_2
a=0;//     #v4=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 675
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 680
a=0;//     :pswitch_3
a=0;//     if-eq v1, v0, :cond_1
a=0;// 
a=0;//     .line 683
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 684
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 687
a=0;//     :pswitch_4
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 688
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 690
a=0;//     :cond_3
a=0;//     #v2=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 691
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 696
a=0;//     :pswitch_5
a=0;//     if-ne v1, v0, :cond_4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 697
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 699
a=0;//     :cond_4
a=0;//     #v2=(Byte);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 700
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 702
a=0;//     :pswitch_6
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 703
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 713
a=0;//     :cond_5
a=0;//     #v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 669
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
}}
