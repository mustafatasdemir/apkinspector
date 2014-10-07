package android.support.v4.text; class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl {/*

.class abstract Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;
.super Ljava/lang/Object;
.source "TextDirectionHeuristicsCompat.java"

# interfaces
.implements Landroid/support/v4/text/TextDirectionHeuristicCompat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/text/TextDirectionHeuristicsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "TextDirectionHeuristicImpl"
.end annotation


# instance fields
.field private final mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;


# direct methods
.method public constructor <init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;)V
    .locals 0
    .parameter "algorithm"

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;

    .line 116
    return-void
.end method

.method private doCheck(Ljava/lang/CharSequence;II)Z
    .locals 1
    .parameter "cs"
    .parameter "start"
    .parameter "count"

    .prologue
    .line 140
    iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;

    #v0=(Reference);
    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;->checkRtl(Ljava/lang/CharSequence;II)I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 146
    invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    .line 142
    :pswitch_0
    #v0=(Integer);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    .line 144
    :pswitch_1
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 140
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method protected abstract defaultIsRtl()Z
.end method

.method public isRtl(Ljava/lang/CharSequence;II)Z
    .locals 1
    .parameter "cs"
    .parameter "start"
    .parameter "count"

    .prologue
    .line 130
    if-eqz p1, :cond_0

    if-ltz p2, :cond_0

    if-ltz p3, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    #v0=(Integer);
    sub-int/2addr v0, p3

    if-ge v0, p2, :cond_1

    .line 131
    :cond_0
    #v0=(Conflicted);
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v0=(Reference);
    throw v0

    .line 133
    :cond_1
    #v0=(Integer);
    iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;

    #v0=(Reference);
    if-nez v0, :cond_2

    .line 134
    invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z

    move-result v0

    .line 136
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_2
    #v0=(Reference);
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->doCheck(Ljava/lang/CharSequence;II)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public isRtl([CII)Z
    .locals 1
    .parameter "array"
    .parameter "start"
    .parameter "count"

    .prologue
    .line 125
    invoke-static {p1}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
