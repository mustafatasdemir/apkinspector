package android.support.v4.text; class TextDirectionHeuristicsCompat$AnyStrong {/*

.class Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
.super Ljava/lang/Object;
.source "TextDirectionHeuristicsCompat.java"

# interfaces
.implements Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/text/TextDirectionHeuristicsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AnyStrong"
.end annotation


# static fields
.field public static final INSTANCE_LTR:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;

.field public static final INSTANCE_RTL:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;


# instance fields
.field private final mLookForRtl:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 235
    new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;

    #v0=(UninitRef);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {v0, v1}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;-><init>(Z)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->INSTANCE_RTL:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;

    .line 236
    new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, v1}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;-><init>(Z)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->INSTANCE_LTR:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0
    .parameter "lookForRtl"

    .prologue
    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 232
    #p0=(Reference);
    iput-boolean p1, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z

    .line 233
    return-void
.end method


# virtual methods
.method public checkRtl(Ljava/lang/CharSequence;II)I
    .locals 6
    .parameter "cs"
    .parameter "start"
    .parameter "count"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    .line 206
    #v4=(Null);
    const/4 v1, 0x0

    .line 207
    .local v1, haveUnlookedFor:Z
    #v1=(Null);
    move v2, p2

    .local v2, i:I
    #v2=(Integer);
    add-int v0, p2, p3

    .local v0, e:I
    :goto_0
    #v0=(Integer);v1=(Boolean);v5=(Conflicted);
    if-ge v2, v0, :cond_2

    .line 208
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    #v5=(Char);
    invoke-static {v5}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v5

    #v5=(Byte);
    invoke-static {v5}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->access$200(I)I

    move-result v5

    #v5=(Integer);
    packed-switch v5, :pswitch_data_0

    .line 207
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 210
    :pswitch_0
    iget-boolean v5, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z

    #v5=(Boolean);
    if-eqz v5, :cond_1

    move v3, v4

    .line 228
    :cond_0
    :goto_2
    #v3=(PosByte);v5=(Conflicted);
    return v3

    .line 213
    :cond_1
    #v3=(One);v5=(Boolean);
    const/4 v1, 0x1

    .line 214
    #v1=(One);
    goto :goto_1

    .line 216
    :pswitch_1
    #v1=(Boolean);v5=(Integer);
    iget-boolean v5, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    .line 219
    const/4 v1, 0x1

    .line 220
    #v1=(One);
    goto :goto_1

    .line 225
    :cond_2
    #v1=(Boolean);v5=(Conflicted);
    if-eqz v1, :cond_3

    .line 226
    iget-boolean v5, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->mLookForRtl:Z

    #v5=(Boolean);
    if-nez v5, :cond_0

    move v3, v4

    #v3=(Null);
    goto :goto_2

    .line 228
    :cond_3
    #v3=(One);v5=(Conflicted);
    const/4 v3, 0x2

    #v3=(PosByte);
    goto :goto_2

    .line 208
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
