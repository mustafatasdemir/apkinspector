package android.support.v4.text; class TextUtilsCompat {/*

.class public Landroid/support/v4/text/TextUtilsCompat;
.super Ljava/lang/Object;
.source "TextUtilsCompat.java"


# static fields
.field private static ARAB_SCRIPT_SUBTAG:Ljava/lang/String;

.field private static HEBR_SCRIPT_SUBTAG:Ljava/lang/String;

.field public static final ROOT:Ljava/util/Locale;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 114
    new-instance v0, Ljava/util/Locale;

    #v0=(UninitRef);
    const-string v1, ""

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->ROOT:Ljava/util/Locale;

    .line 116
    const-string v0, "Arab"

    sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->ARAB_SCRIPT_SUBTAG:Ljava/lang/String;

    .line 117
    const-string v0, "Hebr"

    sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->HEBR_SCRIPT_SUBTAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static getLayoutDirectionFromFirstChar(Ljava/util/Locale;)I
    .locals 2
    .parameter "locale"

    .prologue
    const/4 v0, 0x0

    .line 103
    #v0=(Null);
    invoke-virtual {p0, p0}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    #v1=(Char);
    invoke-static {v1}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v1

    #v1=(Byte);
    packed-switch v1, :pswitch_data_0

    .line 110
    :goto_0
    #v0=(Boolean);
    return v0

    .line 106
    :pswitch_0
    #v0=(Null);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    .line 103
    #v0=(Unknown);v1=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static getLayoutDirectionFromLocale(Ljava/util/Locale;)I
    .locals 2
    .parameter "locale"
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end parameter

    .prologue
    .line 76
    if-eqz p0, :cond_2

    sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ROOT:Ljava/util/Locale;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    .line 77
    invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->addLikelySubtags(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->getScript(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    .local v0, scriptSubtag:Ljava/lang/String;
    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromFirstChar(Ljava/util/Locale;)I

    move-result v1

    .line 87
    .end local v0           #scriptSubtag:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Integer);
    return v1

    .line 81
    .restart local v0       #scriptSubtag:Ljava/lang/String;
    :cond_0
    #v0=(Reference);v1=(Reference);
    sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ARAB_SCRIPT_SUBTAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->HEBR_SCRIPT_SUBTAG:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 83
    :cond_1
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0

    .line 87
    .end local v0           #scriptSubtag:Ljava/lang/String;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public static htmlEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter "s"
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end parameter
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .local v2, sb:Ljava/lang/StringBuilder;
    #v2=(Reference);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    #v3=(Integer);
    if-ge v1, v3, :cond_0

    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 38
    .local v0, c:C
    #v0=(Char);
    sparse-switch v0, :sswitch_data_0

    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    :goto_1
    #v3=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 40
    :sswitch_0
    #v3=(Integer);
    const-string v3, "&lt;"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 43
    :sswitch_1
    #v3=(Integer);
    const-string v3, "&gt;"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 46
    :sswitch_2
    #v3=(Integer);
    const-string v3, "&amp;"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 53
    :sswitch_3
    #v3=(Integer);
    const-string v3, "&#39;"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 56
    :sswitch_4
    #v3=(Integer);
    const-string v3, "&quot;"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 62
    .end local v0           #c:C
    :cond_0
    #v0=(Conflicted);v3=(Integer);
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    return-object v3

    .line 38
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_4
        0x26 -> :sswitch_2
        0x27 -> :sswitch_3
        0x3c -> :sswitch_0
        0x3e -> :sswitch_1
    .end sparse-switch
.end method

*/}
