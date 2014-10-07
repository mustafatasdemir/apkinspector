package android.support.v4.app; class ShareCompat$ShareCompatImplBase {/*

.class Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;
.super Ljava/lang/Object;
.source "ShareCompat.java"

# interfaces
.implements Landroid/support/v4/app/ShareCompat$ShareCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ShareCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ShareCompatImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static withinStyle(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V
    .locals 5
    .parameter "out"
    .parameter "text"
    .parameter "start"
    .parameter "end"

    .prologue
    const/16 v4, 0x20

    .line 99
    #v4=(PosByte);
    move v1, p2

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v1, p3, :cond_7

    .line 100
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 102
    .local v0, c:C
    #v0=(Char);
    const/16 v2, 0x3c

    #v2=(PosByte);
    if-ne v0, v2, :cond_0

    .line 103
    const-string v2, "&lt;"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :goto_1
    #v2=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 104
    :cond_0
    #v2=(PosByte);
    const/16 v2, 0x3e

    if-ne v0, v2, :cond_1

    .line 105
    const-string v2, "&gt;"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 106
    :cond_1
    #v2=(PosByte);
    const/16 v2, 0x26

    if-ne v0, v2, :cond_2

    .line 107
    const-string v2, "&amp;"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 108
    :cond_2
    #v2=(PosByte);
    const/16 v2, 0x7e

    if-gt v0, v2, :cond_3

    if-ge v0, v4, :cond_4

    .line 109
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "&#"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 110
    :cond_4
    #v2=(PosByte);v3=(Conflicted);
    if-ne v0, v4, :cond_6

    .line 111
    :goto_2
    #v2=(Conflicted);
    add-int/lit8 v2, v1, 0x1

    #v2=(Integer);
    if-ge v2, p3, :cond_5

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    #v2=(Char);
    if-ne v2, v4, :cond_5

    .line 112
    const-string v2, "&nbsp;"

    #v2=(Reference);
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 116
    :cond_5
    #v2=(Integer);
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 118
    :cond_6
    #v2=(PosByte);
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 121
    .end local v0           #c:C
    :cond_7
    #v0=(Conflicted);v2=(Conflicted);
    return-void
.end method


# virtual methods
.method public configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
    .locals 1
    .parameter "item"
    .parameter "shareIntent"

    .prologue
    .line 88
    invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    .line 89
    return-void
.end method

.method public escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 3
    .parameter "text"

    .prologue
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .local v0, out:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    #v2=(Integer);
    invoke-static {v0, p1, v1, v2}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;->withinStyle(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V

    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    return-object v1
.end method

*/}
