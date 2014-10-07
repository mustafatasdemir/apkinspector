package android.support.v4.text; class BidiFormatter$Builder {/*

.class public final Landroid/support/v4/text/BidiFormatter$Builder;
.super Ljava/lang/Object;
.source "BidiFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/text/BidiFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mFlags:I

.field private mIsRtlContext:Z

.field private mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    #p0=(Reference);
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/text/BidiFormatter;->access$000(Ljava/util/Locale;)Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V

    .line 139
    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 1
    .parameter "locale"

    .prologue
    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    #p0=(Reference);
    invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->access$000(Ljava/util/Locale;)Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V

    .line 157
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0
    .parameter "rtlContext"

    .prologue
    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    #p0=(Reference);
    invoke-direct {p0, p1}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V

    .line 148
    return-void
.end method

.method private static getDefaultInstanceFromContext(Z)Landroid/support/v4/text/BidiFormatter;
    .locals 1
    .parameter "isRtlContext"

    .prologue
    .line 196
    if-eqz p0, :cond_0

    invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$200()Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Uninit);
    invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$300()Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method private initialize(Z)V
    .locals 1
    .parameter "isRtlContext"

    .prologue
    .line 165
    iput-boolean p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z

    .line 166
    invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    .line 167
    const/4 v0, 0x2

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    .line 168
    return-void
.end method


# virtual methods
.method public build()Landroid/support/v4/text/BidiFormatter;
    .locals 5

    .prologue
    .line 203
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v0=(Reference);
    invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;

    move-result-object v1

    #v1=(Reference);
    if-ne v0, v1, :cond_0

    .line 205
    iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z

    #v0=(Boolean);
    invoke-static {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->getDefaultInstanceFromContext(Z)Landroid/support/v4/text/BidiFormatter;

    move-result-object v0

    .line 207
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v0, Landroid/support/v4/text/BidiFormatter;

    #v0=(UninitRef);
    iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z

    #v1=(Boolean);
    iget v2, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    #v2=(Integer);
    iget-object v3, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;Landroid/support/v4/text/BidiFormatter$1;)V

    #v0=(Reference);
    goto :goto_0
.end method

.method public setTextDirectionHeuristic(Landroid/support/v4/text/TextDirectionHeuristicCompat;)Landroid/support/v4/text/BidiFormatter$Builder;
    .locals 0
    .parameter "heuristic"

    .prologue
    .line 191
    iput-object p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;

    .line 192
    return-object p0
.end method

.method public stereoReset(Z)Landroid/support/v4/text/BidiFormatter$Builder;
    .locals 1
    .parameter "stereoReset"

    .prologue
    .line 175
    if-eqz p1, :cond_0

    .line 176
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    #v0=(Integer);
    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    .line 180
    :goto_0
    return-object p0

    .line 178
    :cond_0
    #v0=(Uninit);
    iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I

    goto :goto_0
.end method

*/}
