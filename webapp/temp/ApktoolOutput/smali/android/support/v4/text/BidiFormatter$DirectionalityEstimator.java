package android.support.v4.text; class BidiFormatter$DirectionalityEstimator {/*

.class Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
.super Ljava/lang/Object;
.source "BidiFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/text/BidiFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DirectionalityEstimator"
.end annotation


# static fields
.field private static final DIR_TYPE_CACHE:[B = null

.field private static final DIR_TYPE_CACHE_SIZE:I = 0x700


# instance fields
.field private charIndex:I

.field private final isHtml:Z

.field private lastChar:C

.field private final length:I

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/16 v3, 0x700

    .line 505
    #v3=(PosShort);
    new-array v1, v3, [B

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B

    .line 506
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v2=(Conflicted);
    if-ge v0, v3, :cond_0

    .line 507
    sget-object v1, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B

    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v2

    #v2=(Byte);
    aput-byte v2, v1, v0

    .line 506
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 509
    :cond_0
    #v2=(Conflicted);
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .parameter "text"
    .parameter "isHtml"

    .prologue
    .line 549
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 550
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    .line 551
    iput-boolean p2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z

    .line 552
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    .line 553
    return-void
.end method

.method private static getCachedDirectionality(C)B
    .locals 1
    .parameter "c"

    .prologue
    .line 724
    const/16 v0, 0x700

    #v0=(PosShort);
    if-ge p0, v0, :cond_0

    sget-object v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->DIR_TYPE_CACHE:[B

    #v0=(Reference);
    aget-byte v0, v0, p0

    :goto_0
    #v0=(Byte);
    return v0

    :cond_0
    #v0=(PosShort);
    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v0

    #v0=(Byte);
    goto :goto_0
.end method

.method private skipEntityBackward()B
    .locals 4

    .prologue
    const/16 v3, 0x3b

    .line 865
    #v3=(PosByte);
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 866
    .local v0, initialCharIndex:I
    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v1=(Integer);
    if-lez v1, :cond_2

    .line 867
    iget-object v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    #v1=(Char);
    iput-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 868
    iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v2, 0x26

    #v2=(PosByte);
    if-ne v1, v2, :cond_1

    .line 869
    const/16 v1, 0xc

    .line 877
    :goto_0
    #v1=(PosByte);v2=(Conflicted);
    return v1

    .line 871
    :cond_1
    #v1=(Char);v2=(PosByte);
    iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    if-ne v1, v3, :cond_0

    .line 875
    :cond_2
    #v1=(Integer);v2=(Conflicted);
    iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 876
    iput-char v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 877
    const/16 v1, 0xd

    #v1=(PosByte);
    goto :goto_0
.end method

.method private skipEntityForward()B
    .locals 3

    .prologue
    .line 850
    :cond_0
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    #v1=(Integer);
    if-ge v0, v1, :cond_1

    iget-object v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    #v0=(Char);
    iput-char v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v1, 0x3b

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    .line 851
    :cond_1
    #v0=(Integer);v1=(Integer);v2=(Conflicted);
    const/16 v0, 0xc

    #v0=(PosByte);
    return v0
.end method

.method private skipTagBackward()B
    .locals 5

    .prologue
    const/16 v4, 0x3e

    .line 822
    #v4=(PosByte);
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 823
    .local v0, initialCharIndex:I
    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    if-lez v2, :cond_2

    .line 824
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 825
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x3c

    #v3=(PosByte);
    if-ne v2, v3, :cond_1

    .line 827
    const/16 v2, 0xc

    .line 841
    :goto_0
    #v2=(PosByte);v3=(Conflicted);
    return v2

    .line 829
    :cond_1
    #v2=(Char);v3=(PosByte);
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    if-ne v2, v4, :cond_3

    .line 839
    :cond_2
    #v2=(Integer);v3=(Conflicted);
    iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 840
    iput-char v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 841
    const/16 v2, 0xd

    #v2=(PosByte);
    goto :goto_0

    .line 832
    :cond_3
    #v2=(Char);v3=(PosByte);
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x22

    if-eq v2, v3, :cond_4

    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x27

    if-ne v2, v3, :cond_0

    .line 834
    :cond_4
    iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 835
    .local v1, quote:C
    :goto_1
    #v1=(Char);v3=(Integer);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    if-lez v2, :cond_0

    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    if-eq v2, v1, :cond_0

    goto :goto_1
.end method

.method private skipTagForward()B
    .locals 5

    .prologue
    .line 793
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 794
    .local v0, initialCharIndex:I
    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    #v3=(Integer);
    if-ge v2, v3, :cond_3

    .line 795
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    add-int/lit8 v4, v3, 0x1

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 796
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x3e

    #v3=(PosByte);
    if-ne v2, v3, :cond_1

    .line 798
    const/16 v2, 0xc

    .line 809
    :goto_0
    #v2=(PosByte);v3=(Integer);v4=(Conflicted);
    return v2

    .line 800
    :cond_1
    #v2=(Char);v3=(PosByte);v4=(Integer);
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x22

    if-eq v2, v3, :cond_2

    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x27

    if-ne v2, v3, :cond_0

    .line 802
    :cond_2
    iget-char v1, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 803
    .local v1, quote:C
    :goto_1
    #v1=(Char);v3=(Integer);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    if-ge v2, v3, :cond_0

    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    if-eq v2, v1, :cond_0

    goto :goto_1

    .line 807
    .end local v1           #quote:C
    :cond_3
    #v1=(Conflicted);v2=(Integer);v4=(Conflicted);
    iput v0, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 808
    const/16 v2, 0x3c

    #v2=(PosByte);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 809
    const/16 v2, 0xd

    goto :goto_0
.end method


# virtual methods
.method dirTypeBackward()B
    .locals 4

    .prologue
    .line 767
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 768
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 769
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-static {v2, v3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 770
    .local v0, codePoint:I
    #v0=(Integer);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 771
    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v1

    .line 783
    .end local v0           #codePoint:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Byte);
    return v1

    .line 773
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 774
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    #v2=(Char);
    invoke-static {v2}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getCachedDirectionality(C)B

    move-result v1

    .line 775
    .local v1, dirType:B
    #v1=(Byte);
    iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 777
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    #v2=(Char);
    const/16 v3, 0x3e

    #v3=(PosByte);
    if-ne v2, v3, :cond_2

    .line 778
    invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipTagBackward()B

    move-result v1

    goto :goto_0

    .line 779
    :cond_2
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x3b

    if-ne v2, v3, :cond_0

    .line 780
    invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipEntityBackward()B

    move-result v1

    goto :goto_0
.end method

.method dirTypeForward()B
    .locals 4

    .prologue
    .line 737
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    #v2=(Char);
    iput-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    .line 738
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 739
    iget-object v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->text:Ljava/lang/String;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    invoke-static {v2, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 740
    .local v0, codePoint:I
    #v0=(Integer);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 741
    invoke-static {v0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result v1

    .line 753
    .end local v0           #codePoint:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Byte);
    return v1

    .line 743
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 744
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    #v2=(Char);
    invoke-static {v2}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getCachedDirectionality(C)B

    move-result v1

    .line 745
    .local v1, dirType:B
    #v1=(Byte);
    iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->isHtml:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 747
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    #v2=(Char);
    const/16 v3, 0x3c

    #v3=(PosByte);
    if-ne v2, v3, :cond_2

    .line 748
    invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipTagForward()B

    move-result v1

    goto :goto_0

    .line 749
    :cond_2
    iget-char v2, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->lastChar:C

    const/16 v3, 0x26

    if-ne v2, v3, :cond_0

    .line 750
    invoke-direct {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->skipEntityForward()B

    move-result v1

    goto :goto_0
.end method

.method getEntryDir()I
    .locals 8

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, -0x1

    #v3=(Byte);
    const/4 v5, 0x0

    .line 567
    #v5=(Null);
    iput v5, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 568
    const/4 v0, 0x0

    .line 569
    .local v0, embeddingLevel:I
    #v0=(Null);
    const/4 v1, 0x0

    .line 570
    .local v1, embeddingLevelDir:I
    #v1=(Null);
    const/4 v2, 0x0

    .line 571
    .local v2, firstNonEmptyEmbeddingLevel:I
    :goto_0
    :pswitch_0
    #v0=(Integer);v1=(Byte);v2=(Integer);v6=(Conflicted);v7=(Conflicted);
    iget v6, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    #v7=(Integer);
    if-ge v6, v7, :cond_3

    if-nez v2, :cond_3

    .line 572
    invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeForward()B

    move-result v6

    #v6=(Byte);
    packed-switch v6, :pswitch_data_0

    .line 606
    :pswitch_1
    move v2, v0

    .line 607
    goto :goto_0

    .line 575
    :pswitch_2
    add-int/lit8 v0, v0, 0x1

    .line 576
    const/4 v1, -0x1

    .line 577
    goto :goto_0

    .line 580
    :pswitch_3
    add-int/lit8 v0, v0, 0x1

    .line 581
    const/4 v1, 0x1

    .line 582
    #v1=(One);
    goto :goto_0

    .line 584
    :pswitch_4
    #v1=(Byte);
    add-int/lit8 v0, v0, -0x1

    .line 588
    const/4 v1, 0x0

    .line 589
    #v1=(Null);
    goto :goto_0

    .line 593
    :pswitch_5
    #v1=(Byte);
    if-nez v0, :cond_1

    move v1, v3

    .line 649
    .end local v1           #embeddingLevelDir:I
    :cond_0
    :goto_1
    #v6=(Integer);
    return v1

    .line 596
    .restart local v1       #embeddingLevelDir:I
    :cond_1
    #v6=(Byte);
    move v2, v0

    .line 597
    goto :goto_0

    .line 600
    :pswitch_6
    if-nez v0, :cond_2

    move v1, v4

    .line 601
    #v1=(One);
    goto :goto_1

    .line 603
    :cond_2
    #v1=(Byte);
    move v2, v0

    .line 604
    goto :goto_0

    .line 613
    :cond_3
    #v6=(Integer);
    if-nez v2, :cond_4

    move v1, v5

    .line 616
    #v1=(Null);
    goto :goto_1

    .line 620
    :cond_4
    #v1=(Byte);
    if-nez v1, :cond_0

    .line 627
    :goto_2
    iget v6, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    if-lez v6, :cond_7

    .line 628
    invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeBackward()B

    move-result v6

    #v6=(Byte);
    packed-switch v6, :pswitch_data_1

    goto :goto_2

    .line 631
    :pswitch_7
    if-ne v2, v0, :cond_5

    move v1, v3

    .line 632
    goto :goto_1

    .line 634
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 635
    goto :goto_2

    .line 638
    :pswitch_8
    if-ne v2, v0, :cond_6

    move v1, v4

    .line 639
    #v1=(One);
    goto :goto_1

    .line 641
    :cond_6
    #v1=(Byte);
    add-int/lit8 v0, v0, -0x1

    .line 642
    goto :goto_2

    .line 644
    :pswitch_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    #v6=(Integer);
    move v1, v5

    .line 649
    #v1=(Null);
    goto :goto_1

    .line 572
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 628
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method getExitDir()I
    .locals 5

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, -0x1

    .line 665
    #v2=(Byte);
    iget v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->length:I

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    .line 666
    const/4 v0, 0x0

    .line 667
    .local v0, embeddingLevel:I
    #v0=(Null);
    const/4 v1, 0x0

    .line 668
    .local v1, lastNonEmptyEmbeddingLevel:I
    :cond_0
    :goto_0
    :pswitch_0
    #v0=(Integer);v1=(Integer);
    iget v4, p0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->charIndex:I

    if-lez v4, :cond_5

    .line 669
    invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->dirTypeBackward()B

    move-result v4

    #v4=(Byte);
    packed-switch v4, :pswitch_data_0

    .line 707
    :pswitch_1
    if-nez v1, :cond_0

    .line 708
    move v1, v0

    goto :goto_0

    .line 671
    :pswitch_2
    if-nez v0, :cond_2

    .line 713
    :cond_1
    :goto_1
    #v4=(Integer);
    return v2

    .line 674
    :cond_2
    #v4=(Byte);
    if-nez v1, :cond_0

    .line 675
    move v1, v0

    goto :goto_0

    .line 680
    :pswitch_3
    if-eq v1, v0, :cond_1

    .line 683
    add-int/lit8 v0, v0, -0x1

    .line 684
    goto :goto_0

    .line 687
    :pswitch_4
    if-nez v0, :cond_3

    move v2, v3

    .line 688
    #v2=(One);
    goto :goto_1

    .line 690
    :cond_3
    #v2=(Byte);
    if-nez v1, :cond_0

    .line 691
    move v1, v0

    goto :goto_0

    .line 696
    :pswitch_5
    if-ne v1, v0, :cond_4

    move v2, v3

    .line 697
    #v2=(One);
    goto :goto_1

    .line 699
    :cond_4
    #v2=(Byte);
    add-int/lit8 v0, v0, -0x1

    .line 700
    goto :goto_0

    .line 702
    :pswitch_6
    add-int/lit8 v0, v0, 0x1

    .line 703
    goto :goto_0

    .line 713
    :cond_5
    #v4=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1

    .line 669
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

*/}
