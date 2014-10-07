package android.support.v4.util; class DebugUtils {/*

.class public Landroid/support/v4/util/DebugUtils;
.super Ljava/lang/Object;
.source "DebugUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
    .locals 3
    .parameter "cls"
    .parameter "out"

    .prologue
    .line 28
    if-nez p0, :cond_0

    .line 29
    const-string v2, "null"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 31
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 32
    .local v1, simpleName:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-gtz v2, :cond_2

    .line 33
    :cond_1
    #v2=(Conflicted);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 34
    const/16 v2, 0x2e

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 35
    .local v0, end:I
    #v0=(Integer);
    if-lez v0, :cond_2

    .line 36
    add-int/lit8 v2, v0, 0x1

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 39
    .end local v0           #end:I
    :cond_2
    #v0=(Conflicted);
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    const/16 v2, 0x7b

    #v2=(PosByte);
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    #v2=(Integer);
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

*/}
