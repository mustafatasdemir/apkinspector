package android.support.v4.database; class DatabaseUtilsCompat {/*

.class public Landroid/support/v4/database/DatabaseUtilsCompat;
.super Ljava/lang/Object;
.source "DatabaseUtilsCompat.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    #p0=(Reference);
    return-void
.end method

.method public static appendSelectionArgs([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 4
    .parameter "originalValues"
    .parameter "newValues"

    .prologue
    const/4 v3, 0x0

    .line 50
    #v3=(Null);
    if-eqz p0, :cond_0

    array-length v1, p0

    #v1=(Integer);
    if-nez v1, :cond_1

    :cond_0
    #v1=(Conflicted);
    move-object v0, p1

    .line 56
    :goto_0
    #v0=(Reference);v2=(Conflicted);
    return-object v0

    .line 53
    :cond_1
    #v0=(Uninit);v1=(Integer);v2=(Uninit);
    array-length v1, p0

    array-length v2, p1

    #v2=(Integer);
    add-int/2addr v1, v2

    new-array v0, v1, [Ljava/lang/String;

    .line 54
    .local v0, result:[Ljava/lang/String;
    #v0=(Reference);
    array-length v1, p0

    invoke-static {p0, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    array-length v1, p0

    array-length v2, p1

    invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public static concatenateWhere(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "a"
    .parameter "b"

    .prologue
    .line 35
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 42
    .end local p1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-object p1

    .line 38
    .restart local p1
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p1, p0

    .line 39
    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v1, "("

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AND ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

*/}
