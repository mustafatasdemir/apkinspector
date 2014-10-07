package android.support.v4.os; class EnvironmentCompat {/*

.class public Landroid/support/v4/os/EnvironmentCompat;
.super Ljava/lang/Object;
.source "EnvironmentCompat.java"


# static fields
.field public static final MEDIA_UNKNOWN:Ljava/lang/String; = "unknown"

.field private static final TAG:Ljava/lang/String; = "EnvironmentCompat"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getStorageState(Ljava/io/File;)Ljava/lang/String;
    .locals 7
    .parameter "path"

    .prologue
    .line 56
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .local v3, version:I
    #v3=(Integer);
    const/16 v4, 0x13

    #v4=(PosByte);
    if-lt v3, v4, :cond_0

    .line 58
    invoke-static {p0}, Landroid/support/v4/os/EnvironmentCompatKitKat;->getStorageState(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    .line 73
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference);v5=(Conflicted);v6=(Conflicted);
    return-object v4

    .line 62
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1

    .line 63
    .local v1, canonicalPath:Ljava/lang/String;
    #v1=(Reference);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    .line 66
    .local v0, canonicalExternal:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 67
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    #v4=(Reference);
    goto :goto_0

    .line 69
    .end local v0           #canonicalExternal:Ljava/lang/String;
    .end local v1           #canonicalPath:Ljava/lang/String;
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    move-exception v2

    .line 70
    .local v2, e:Ljava/io/IOException;
    #v2=(Reference);
    const-string v4, "EnvironmentCompat"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Failed to resolve canonical path: "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .end local v2           #e:Ljava/io/IOException;
    :cond_1
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const-string v4, "unknown"

    #v4=(Reference);
    goto :goto_0
.end method

*/}
