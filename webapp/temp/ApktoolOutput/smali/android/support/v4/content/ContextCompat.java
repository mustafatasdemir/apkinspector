package android.support.v4.content; class ContextCompat {/*

.class public Landroid/support/v4/content/ContextCompat;
.super Ljava/lang/Object;
.source "ContextCompat.java"


# static fields
.field private static final DIR_ANDROID:Ljava/lang/String; = "Android"

.field private static final DIR_CACHE:Ljava/lang/String; = "cache"

.field private static final DIR_DATA:Ljava/lang/String; = "data"

.field private static final DIR_FILES:Ljava/lang/String; = "files"

.field private static final DIR_OBB:Ljava/lang/String; = "obb"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .parameter "base"
    .parameter "segments"

    .prologue
    .line 290
    move-object v1, p0

    .line 291
    .local v1, cur:Ljava/io/File;
    #v1=(Reference);
    move-object v0, p1

    .local v0, arr$:[Ljava/lang/String;
    #v0=(Reference);
    array-length v4, v0

    .local v4, len$:I
    #v4=(Integer);
    const/4 v3, 0x0

    .local v3, i$:I
    #v3=(Null);
    move-object v2, v1

    .end local v1           #cur:Ljava/io/File;
    .local v2, cur:Ljava/io/File;
    :goto_0
    #v2=(Reference);v3=(Integer);v5=(Conflicted);
    if-ge v3, v4, :cond_1

    aget-object v5, v0, v3

    .line 292
    .local v5, segment:Ljava/lang/String;
    #v5=(Null);
    if-nez v2, :cond_0

    .line 293
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 291
    .end local v2           #cur:Ljava/io/File;
    .restart local v1       #cur:Ljava/io/File;
    :goto_1
    #v1=(Reference);
    add-int/lit8 v3, v3, 0x1

    move-object v2, v1

    .end local v1           #cur:Ljava/io/File;
    .restart local v2       #cur:Ljava/io/File;
    goto :goto_0

    .line 294
    :cond_0
    if-eqz v5, :cond_2

    .line 295
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .end local v2           #cur:Ljava/io/File;
    .restart local v1       #cur:Ljava/io/File;
    #v1=(Reference);
    goto :goto_1

    .line 298
    .end local v1           #cur:Ljava/io/File;
    .end local v5           #segment:Ljava/lang/String;
    .restart local v2       #cur:Ljava/io/File;
    :cond_1
    #v5=(Conflicted);
    return-object v2

    .restart local v5       #segment:Ljava/lang/String;
    :cond_2
    #v5=(Null);
    move-object v1, v2

    .end local v2           #cur:Ljava/io/File;
    .restart local v1       #cur:Ljava/io/File;
    goto :goto_1
.end method

.method public static getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;
    .locals 8
    .parameter "context"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    .line 274
    #v6=(Null);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 275
    .local v1, version:I
    #v1=(Integer);
    const/16 v2, 0x13

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 276
    invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v2

    .line 285
    :goto_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v2

    .line 279
    :cond_0
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    .line 280
    invoke-static {p0}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalCacheDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 285
    .local v0, single:Ljava/io/File;
    :goto_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    new-array v2, v7, [Ljava/io/File;

    #v2=(Reference);
    aput-object v0, v2, v6

    goto :goto_0

    .line 282
    .end local v0           #single:Ljava/io/File;
    :cond_1
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    #v2=(Reference);
    const/4 v3, 0x4

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/String;

    #v3=(Reference);
    const-string v4, "Android"

    #v4=(Reference);
    aput-object v4, v3, v6

    const-string v4, "data"

    aput-object v4, v3, v7

    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "cache"

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .restart local v0       #single:Ljava/io/File;
    #v0=(Reference);
    goto :goto_1
.end method

.method public static getExternalFilesDirs(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;
    .locals 8
    .parameter "context"
    .parameter "type"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    .line 214
    #v6=(Null);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 215
    .local v1, version:I
    #v1=(Integer);
    const/16 v2, 0x13

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 216
    invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalFilesDirs(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;

    move-result-object v2

    .line 225
    :goto_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v2

    .line 219
    :cond_0
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    .line 220
    invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalFilesDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 225
    .local v0, single:Ljava/io/File;
    :goto_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    new-array v2, v7, [Ljava/io/File;

    #v2=(Reference);
    aput-object v0, v2, v6

    goto :goto_0

    .line 222
    .end local v0           #single:Ljava/io/File;
    :cond_1
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    #v2=(Reference);
    const/4 v3, 0x5

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/String;

    #v3=(Reference);
    const-string v4, "Android"

    #v4=(Reference);
    aput-object v4, v3, v6

    const-string v4, "data"

    aput-object v4, v3, v7

    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "files"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .restart local v0       #single:Ljava/io/File;
    #v0=(Reference);
    goto :goto_1
.end method

.method public static getObbDirs(Landroid/content/Context;)[Ljava/io/File;
    .locals 8
    .parameter "context"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, 0x0

    .line 154
    #v6=(Null);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 155
    .local v1, version:I
    #v1=(Integer);
    const/16 v2, 0x13

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 156
    invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getObbDirs(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v2

    .line 165
    :goto_0
    #v0=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v2

    .line 159
    :cond_0
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    const/16 v2, 0xb

    if-lt v1, v2, :cond_1

    .line 160
    invoke-static {p0}, Landroid/support/v4/content/ContextCompatHoneycomb;->getObbDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 165
    .local v0, single:Ljava/io/File;
    :goto_1
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    new-array v2, v7, [Ljava/io/File;

    #v2=(Reference);
    aput-object v0, v2, v6

    goto :goto_0

    .line 162
    .end local v0           #single:Ljava/io/File;
    :cond_1
    #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    #v2=(Reference);
    const/4 v3, 0x3

    #v3=(PosByte);
    new-array v3, v3, [Ljava/lang/String;

    #v3=(Reference);
    const-string v4, "Android"

    #v4=(Reference);
    aput-object v4, v3, v6

    const-string v4, "obb"

    aput-object v4, v3, v7

    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .restart local v0       #single:Ljava/io/File;
    #v0=(Reference);
    goto :goto_1
.end method

.method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;)Z
    .locals 1
    .parameter "context"
    .parameter "intents"

    .prologue
    .line 67
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p0, p1, v0}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
    .locals 3
    .parameter "context"
    .parameter "intents"
    .parameter "options"

    .prologue
    const/4 v1, 0x1

    .line 99
    #v1=(One);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .local v0, version:I
    #v0=(Integer);
    const/16 v2, 0x10

    #v2=(PosByte);
    if-lt v0, v2, :cond_0

    .line 101
    invoke-static {p0, p1, p2}, Landroid/support/v4/content/ContextCompatJellybean;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 107
    :goto_0
    #v1=(Boolean);
    return v1

    .line 103
    :cond_0
    #v1=(One);
    const/16 v2, 0xb

    if-lt v0, v2, :cond_1

    .line 104
    invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatHoneycomb;->startActivities(Landroid/content/Context;[Landroid/content/Intent;)V

    goto :goto_0

    .line 107
    :cond_1
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

*/}