package android.support.v4.text; class BidiFormatter {/*

.class public final Landroid/support/v4/text/BidiFormatter;
.super Ljava/lang/Object;
.source "BidiFormatter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/text/BidiFormatter$1;,
        Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;,
        Landroid/support/v4/text/BidiFormatter$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_FLAGS:I = 0x2

.field private static final DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter; = null

.field private static final DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter; = null

.field private static DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat; = null

.field private static final DIR_LTR:I = -0x1

.field private static final DIR_RTL:I = 0x1

.field private static final DIR_UNKNOWN:I = 0x0

.field private static final EMPTY_STRING:Ljava/lang/String; = ""

.field private static final FLAG_STEREO_RESET:I = 0x2

.field private static final LRE:C = '\u202a'

.field private static final LRM:C = '\u200e'

.field private static final LRM_STRING:Ljava/lang/String; = null

.field private static final PDF:C = '\u202c'

.field private static final RLE:C = '\u202b'

.field private static final RLM:C = '\u200f'

.field private static final RLM_STRING:Ljava/lang/String;


# instance fields
.field private final mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

.field private final mFlags:I

.field private final mIsRtlContext:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 83
    #v3=(PosByte);
    sget-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    .line 113
    const/16 v0, 0x200e

    #v0=(PosShort);
    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;

    .line 118
    const/16 v0, 0x200f

    #v0=(PosShort);
    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;

    .line 215
    new-instance v0, Landroid/support/v4/text/BidiFormatter;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v2=(Reference);
    invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter;

    .line 220
    new-instance v0, Landroid/support/v4/text/BidiFormatter;

    #v0=(UninitRef);
    const/4 v1, 0x1

    #v1=(One);
    sget-object v2, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter;

    return-void
.end method

.method private constructor <init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V
    .locals 0
    .parameter "isRtlContext"
    .parameter "flags"
    .parameter "heuristic"

    .prologue
    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    #p0=(Reference);
    iput-boolean p1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    .line 262
    iput p2, p0, Landroid/support/v4/text/BidiFormatter;->mFlags:I

    .line 263
    iput-object p3, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    .line 264
    return-void
.end method

.method synthetic constructor <init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;Landroid/support/v4/text/BidiFormatter$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"

    .prologue
    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V

    #p0=(Reference);
    return-void
.end method

.method static synthetic access$000(Ljava/util/Locale;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 78
    invoke-static {p0}, Landroid/support/v4/text/BidiFormatter;->isRtlLocale(Ljava/util/Locale;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200()Landroid/support/v4/text/BidiFormatter;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300()Landroid/support/v4/text/BidiFormatter;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter;

    #v0=(Reference);
    return-object v0
.end method

.method private static getEntryDir(Ljava/lang/String;)I
    .locals 2
    .parameter "str"

    .prologue
    .line 479
    new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getEntryDir()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private static getExitDir(Ljava/lang/String;)I
    .locals 2
    .parameter "str"

    .prologue
    .line 462
    new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getExitDir()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getInstance()Landroid/support/v4/text/BidiFormatter;
    .locals 1

    .prologue
    .line 234
    new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Ljava/util/Locale;)Landroid/support/v4/text/BidiFormatter;
    .locals 1
    .parameter "locale"

    .prologue
    .line 252
    new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Ljava/util/Locale;)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Z)Landroid/support/v4/text/BidiFormatter;
    .locals 1
    .parameter "rtlContext"

    .prologue
    .line 243
    new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Z)V

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    return-object v0
.end method

.method private static isRtlLocale(Ljava/util/Locale;)Z
    .locals 2
    .parameter "locale"

    .prologue
    const/4 v0, 0x1

    .line 437
    #v0=(One);
    invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v1

    #v1=(Integer);
    if-ne v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private markAfter(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
    .locals 3
    .parameter "str"
    .parameter "heuristic"

    .prologue
    .line 297
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v0

    .line 299
    .local v0, isRtl:Z
    #v0=(Boolean);
    iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v1, v2, :cond_1

    .line 300
    :cond_0
    #v2=(Integer);
    sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;

    .line 305
    :goto_0
    #v1=(Reference);
    return-object v1

    .line 302
    :cond_1
    #v1=(Integer);
    iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne v1, v2, :cond_3

    .line 303
    :cond_2
    #v2=(Integer);
    sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;

    #v1=(Reference);
    goto :goto_0

    .line 305
    :cond_3
    #v1=(Integer);
    const-string v1, ""

    #v1=(Reference);
    goto :goto_0
.end method

.method private markBefore(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
    .locals 3
    .parameter "str"
    .parameter "heuristic"

    .prologue
    .line 324
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v0

    .line 326
    .local v0, isRtl:Z
    #v0=(Boolean);
    iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v1=(Boolean);
    if-nez v1, :cond_1

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v1, v2, :cond_1

    .line 327
    :cond_0
    #v2=(Integer);
    sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;

    .line 332
    :goto_0
    #v1=(Reference);
    return-object v1

    .line 329
    :cond_1
    #v1=(Integer);
    iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne v1, v2, :cond_3

    .line 330
    :cond_2
    #v2=(Integer);
    sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;

    #v1=(Reference);
    goto :goto_0

    .line 332
    :cond_3
    #v1=(Integer);
    const-string v1, ""

    #v1=(Reference);
    goto :goto_0
.end method


# virtual methods
.method public getStereoReset()Z
    .locals 1

    .prologue
    .line 278
    iget v0, p0, Landroid/support/v4/text/BidiFormatter;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isRtl(Ljava/lang/String;)Z
    .locals 3
    .parameter "str"

    .prologue
    .line 343
    iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    invoke-interface {v0, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isRtlContext()Z
    .locals 1

    .prologue
    .line 270
    iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v0=(Boolean);
    return v0
.end method

.method public unicodeWrap(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "str"

    .prologue
    .line 427
    iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
    .locals 1
    .parameter "str"
    .parameter "heuristic"

    .prologue
    .line 403
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
    .locals 4
    .parameter "str"
    .parameter "heuristic"
    .parameter "isolate"

    .prologue
    .line 374
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    invoke-interface {p2, p1, v2, v3}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result v0

    .line 375
    .local v0, isRtl:Z
    #v0=(Boolean);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 376
    .local v1, result:Ljava/lang/StringBuilder;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter;->getStereoReset()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    if-eqz p3, :cond_0

    .line 377
    if-eqz v0, :cond_2

    sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    :goto_0
    #v2=(Reference);
    invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markBefore(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    :cond_0
    #v2=(Conflicted);
    iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z

    #v2=(Boolean);
    if-eq v0, v2, :cond_4

    .line 381
    if-eqz v0, :cond_3

    const/16 v2, 0x202b

    :goto_1
    #v2=(PosShort);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 382
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    const/16 v2, 0x202c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 387
    :goto_2
    if-eqz p3, :cond_1

    .line 388
    if-eqz v0, :cond_5

    sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    :goto_3
    #v2=(Reference);
    invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markAfter(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    :cond_1
    #v2=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    return-object v2

    .line 377
    :cond_2
    #v2=(Boolean);
    sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v2=(Reference);
    goto :goto_0

    .line 381
    :cond_3
    #v2=(Boolean);
    const/16 v2, 0x202a

    #v2=(PosShort);
    goto :goto_1

    .line 385
    :cond_4
    #v2=(Boolean);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 388
    :cond_5
    #v2=(PosShort);
    sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v2=(Reference);
    goto :goto_3
.end method

.method public unicodeWrap(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1
    .parameter "str"
    .parameter "isolate"

    .prologue
    .line 416
    iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    invoke-virtual {p0, p1, v0, p2}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
