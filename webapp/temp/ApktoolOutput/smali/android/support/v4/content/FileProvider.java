package android.support.v4.content; class FileProvider {/*

.class public Landroid/support/v4/content/FileProvider;
.super Landroid/content/ContentProvider;
.source "FileProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/content/FileProvider$SimplePathStrategy;,
        Landroid/support/v4/content/FileProvider$PathStrategy;
    }
.end annotation


# static fields
.field private static final ATTR_NAME:Ljava/lang/String; = "name"

.field private static final ATTR_PATH:Ljava/lang/String; = "path"

.field private static final COLUMNS:[Ljava/lang/String; = null

.field private static final DEVICE_ROOT:Ljava/io/File; = null

.field private static final META_DATA_FILE_PROVIDER_PATHS:Ljava/lang/String; = "android.support.FILE_PROVIDER_PATHS"

.field private static final TAG_CACHE_PATH:Ljava/lang/String; = "cache-path"

.field private static final TAG_EXTERNAL:Ljava/lang/String; = "external-path"

.field private static final TAG_FILES_PATH:Ljava/lang/String; = "files-path"

.field private static final TAG_ROOT_PATH:Ljava/lang/String; = "root-path"

.field private static sCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v4/content/FileProvider$PathStrategy;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 303
    const/4 v0, 0x2

    #v0=(PosByte);
    new-array v0, v0, [Ljava/lang/String;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const-string v2, "_display_name"

    #v2=(Reference);
    aput-object v2, v0, v1

    const/4 v1, 0x1

    #v1=(One);
    const-string v2, "_size"

    aput-object v2, v0, v1

    sput-object v0, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;

    .line 317
    new-instance v0, Ljava/io/File;

    #v0=(UninitRef);
    const-string v1, "/"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;

    .line 320
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 302
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 630
    #p0=(Reference);
    return-void
.end method

.method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .parameter "base"
    .parameter "segments"

    .prologue
    .line 753
    move-object v1, p0

    .line 754
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
    if-ge v3, v4, :cond_0

    aget-object v5, v0, v3

    .line 755
    .local v5, segment:Ljava/lang/String;
    #v5=(Null);
    if-eqz v5, :cond_1

    .line 756
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 754
    .end local v2           #cur:Ljava/io/File;
    .restart local v1       #cur:Ljava/io/File;
    :goto_1
    #v1=(Reference);
    add-int/lit8 v3, v3, 0x1

    move-object v2, v1

    .end local v1           #cur:Ljava/io/File;
    .restart local v2       #cur:Ljava/io/File;
    goto :goto_0

    .line 759
    .end local v5           #segment:Ljava/lang/String;
    :cond_0
    #v5=(Conflicted);
    return-object v2

    .restart local v5       #segment:Ljava/lang/String;
    :cond_1
    #v5=(Null);
    move-object v1, v2

    .end local v2           #cur:Ljava/io/File;
    .restart local v1       #cur:Ljava/io/File;
    goto :goto_1
.end method

.method private static copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 2
    .parameter "original"
    .parameter "newLength"

    .prologue
    const/4 v1, 0x0

    .line 769
    #v1=(Null);
    new-array v0, p1, [Ljava/lang/Object;

    .line 770
    .local v0, result:[Ljava/lang/Object;
    #v0=(Reference);
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 771
    return-object v0
.end method

.method private static copyOf([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 2
    .parameter "original"
    .parameter "newLength"

    .prologue
    const/4 v1, 0x0

    .line 763
    #v1=(Null);
    new-array v0, p1, [Ljava/lang/String;

    .line 764
    .local v0, result:[Ljava/lang/String;
    #v0=(Reference);
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 765
    return-object v0
.end method

.method private static getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    .locals 5
    .parameter "context"
    .parameter "authority"

    .prologue
    .line 530
    sget-object v3, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;

    #v3=(Reference);
    monitor-enter v3

    .line 531
    :try_start_0
    sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/content/FileProvider$PathStrategy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 532
    .local v1, strat:Landroid/support/v4/content/FileProvider$PathStrategy;
    if-nez v1, :cond_0

    .line 534
    :try_start_1
    invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 542
    :try_start_2
    sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    :cond_0
    monitor-exit v3

    .line 545
    return-object v1

    .line 535
    :catch_0
    move-exception v0

    .line 536
    .local v0, e:Ljava/io/IOException;
    #v0=(Reference);
    new-instance v2, Ljava/lang/IllegalArgumentException;

    #v2=(UninitRef);
    const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    #v4=(Reference);
    invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v2=(Reference);
    throw v2

    .line 544
    .end local v0           #e:Ljava/io/IOException;
    .end local v1           #strat:Landroid/support/v4/content/FileProvider$PathStrategy;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    move-exception v2

    #v2=(Reference);
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v2

    .line 538
    .restart local v1       #strat:Landroid/support/v4/content/FileProvider$PathStrategy;
    :catch_1
    #v0=(Uninit);v1=(Reference);v4=(Uninit);
    move-exception v0

    .line 539
    .local v0, e:Lorg/xmlpull/v1/XmlPullParserException;
    :try_start_3
    #v0=(Reference);
    new-instance v2, Ljava/lang/IllegalArgumentException;

    #v2=(UninitRef);
    const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"

    #v4=(Reference);
    invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v2=(Reference);
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method

.method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    .locals 2
    .parameter "context"
    .parameter "authority"
    .parameter "file"

    .prologue
    .line 376
    invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;

    move-result-object v0

    .line 377
    .local v0, strategy:Landroid/support/v4/content/FileProvider$PathStrategy;
    #v0=(Reference);
    invoke-interface {v0, p2}, Landroid/support/v4/content/FileProvider$PathStrategy;->getUriForFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    #v1=(Reference);
    return-object v1
.end method

.method private static modeToMode(Ljava/lang/String;)I
    .locals 4
    .parameter "mode"

    .prologue
    .line 729
    const-string v1, "r"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 730
    const/high16 v0, 0x1000

    .line 749
    .local v0, modeBits:I
    :goto_0
    #v0=(Integer);
    return v0

    .line 731
    .end local v0           #modeBits:I
    :cond_0
    #v0=(Uninit);
    const-string v1, "w"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    const-string v1, "wt"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 732
    :cond_1
    const/high16 v0, 0x2c00

    .restart local v0       #modeBits:I
    #v0=(Integer);
    goto :goto_0

    .line 735
    .end local v0           #modeBits:I
    :cond_2
    #v0=(Uninit);
    const-string v1, "wa"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    .line 736
    const/high16 v0, 0x2a00

    .restart local v0       #modeBits:I
    #v0=(Integer);
    goto :goto_0

    .line 739
    .end local v0           #modeBits:I
    :cond_3
    #v0=(Uninit);
    const-string v1, "rw"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    .line 740
    const/high16 v0, 0x3800

    .restart local v0       #modeBits:I
    #v0=(Integer);
    goto :goto_0

    .line 742
    .end local v0           #modeBits:I
    :cond_4
    #v0=(Uninit);
    const-string v1, "rwt"

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    .line 743
    const/high16 v0, 0x3c00

    .restart local v0       #modeBits:I
    #v0=(Integer);
    goto :goto_0

    .line 747
    .end local v0           #modeBits:I
    :cond_5
    #v0=(Uninit);
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Invalid mode: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1
.end method

.method private static parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
    .locals 13
    .parameter "context"
    .parameter "authority"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    const/4 v12, 0x0

    #v12=(Null);
    const/4 v11, 0x0

    #v11=(Null);
    const/4 v10, 0x1

    .line 556
    #v10=(One);
    new-instance v4, Landroid/support/v4/content/FileProvider$SimplePathStrategy;

    #v4=(UninitRef);
    invoke-direct {v4, p1}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;-><init>(Ljava/lang/String;)V

    .line 558
    .local v4, strat:Landroid/support/v4/content/FileProvider$SimplePathStrategy;
    #v4=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    #v8=(Reference);
    const/16 v9, 0x80

    #v9=(PosShort);
    invoke-virtual {v8, p1, v9}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v1

    .line 560
    .local v1, info:Landroid/content/pm/ProviderInfo;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    const-string v9, "android.support.FILE_PROVIDER_PATHS"

    #v9=(Reference);
    invoke-virtual {v1, v8, v9}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    .line 562
    .local v0, in:Landroid/content/res/XmlResourceParser;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 563
    new-instance v8, Ljava/lang/IllegalArgumentException;

    #v8=(UninitRef);
    const-string v9, "Missing android.support.FILE_PROVIDER_PATHS meta-data"

    invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    throw v8

    .line 568
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->next()I

    move-result v7

    .local v7, type:I
    #v7=(Integer);
    if-eq v7, v10, :cond_5

    .line 569
    const/4 v8, 0x2

    #v8=(PosByte);
    if-ne v7, v8, :cond_0

    .line 570
    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 572
    .local v5, tag:Ljava/lang/String;
    #v5=(Reference);
    const-string v8, "name"

    #v8=(Reference);
    invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 573
    .local v2, name:Ljava/lang/String;
    #v2=(Reference);
    const-string v8, "path"

    invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 575
    .local v3, path:Ljava/lang/String;
    #v3=(Reference);
    const/4 v6, 0x0

    .line 576
    .local v6, target:Ljava/io/File;
    #v6=(Null);
    const-string v8, "root-path"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_2

    .line 577
    sget-object v8, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;

    #v8=(Reference);
    new-array v9, v10, [Ljava/lang/String;

    aput-object v3, v9, v11

    invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    .line 586
    :cond_1
    :goto_1
    #v6=(Reference);v8=(Conflicted);
    if-eqz v6, :cond_0

    .line 587
    invoke-virtual {v4, v2, v6}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->addRoot(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    .line 578
    :cond_2
    #v6=(Null);v8=(Boolean);
    const-string v8, "files-path"

    #v8=(Reference);
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_3

    .line 579
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    #v8=(Reference);
    new-array v9, v10, [Ljava/lang/String;

    aput-object v3, v9, v11

    invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    #v6=(Reference);
    goto :goto_1

    .line 580
    :cond_3
    #v6=(Null);v8=(Boolean);
    const-string v8, "cache-path"

    #v8=(Reference);
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    .line 581
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v8

    #v8=(Reference);
    new-array v9, v10, [Ljava/lang/String;

    aput-object v3, v9, v11

    invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    #v6=(Reference);
    goto :goto_1

    .line 582
    :cond_4
    #v6=(Null);v8=(Boolean);
    const-string v8, "external-path"

    #v8=(Reference);
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_1

    .line 583
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v8

    #v8=(Reference);
    new-array v9, v10, [Ljava/lang/String;

    aput-object v3, v9, v11

    invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    #v6=(Reference);
    goto :goto_1

    .line 592
    .end local v2           #name:Ljava/lang/String;
    .end local v3           #path:Ljava/lang/String;
    .end local v5           #tag:Ljava/lang/String;
    .end local v6           #target:Ljava/io/File;
    :cond_5
    #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    return-object v4
.end method


# virtual methods
.method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2
    .parameter "context"
    .parameter "info"

    .prologue
    .line 342
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 345
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 346
    new-instance v0, Ljava/lang/SecurityException;

    #v0=(UninitRef);
    const-string v1, "Provider must not be exported"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 348
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z

    if-nez v0, :cond_1

    .line 349
    new-instance v0, Ljava/lang/SecurityException;

    #v0=(UninitRef);
    const-string v1, "Provider must grant uri permissions"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 352
    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {p1, v0}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;

    .line 353
    return-void
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2
    .parameter "uri"
    .parameter "selection"
    .parameter "selectionArgs"

    .prologue
    .line 497
    iget-object v1, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;

    #v1=(Reference);
    invoke-interface {v1, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    .line 498
    .local v0, file:Ljava/io/File;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 6
    .parameter "uri"

    .prologue
    .line 451
    iget-object v4, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;

    #v4=(Reference);
    invoke-interface {v4, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    .line 453
    .local v1, file:Ljava/io/File;
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2e

    #v5=(PosByte);
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    .line 454
    .local v2, lastDot:I
    #v2=(Integer);
    if-ltz v2, :cond_0

    .line 455
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    #v5=(Integer);
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 456
    .local v0, extension:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 457
    .local v3, mime:Ljava/lang/String;
    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 462
    .end local v0           #extension:Ljava/lang/String;
    .end local v3           #mime:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);
    return-object v3

    :cond_0
    #v3=(Conflicted);
    const-string v3, "application/octet-stream"

    #v3=(Reference);
    goto :goto_0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2
    .parameter "uri"
    .parameter "values"

    .prologue
    .line 471
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "No external inserts"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public onCreate()Z
    .locals 1

    .prologue
    .line 330
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 3
    .parameter "uri"
    .parameter "mode"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 519
    iget-object v2, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;

    #v2=(Reference);
    invoke-interface {v2, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v0

    .line 520
    .local v0, file:Ljava/io/File;
    #v0=(Reference);
    invoke-static {p2}, Landroid/support/v4/content/FileProvider;->modeToMode(Ljava/lang/String;)I

    move-result v1

    .line 521
    .local v1, fileMode:I
    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    return-object v2
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 12
    .parameter "uri"
    .parameter "projection"
    .parameter "selection"
    .parameter "selectionArgs"
    .parameter "sortOrder"

    .prologue
    .line 412
    iget-object v10, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;

    #v10=(Reference);
    invoke-interface {v10, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v4

    .line 414
    .local v4, file:Ljava/io/File;
    #v4=(Reference);
    if-nez p2, :cond_0

    .line 415
    sget-object p2, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;

    .line 418
    :cond_0
    array-length v10, p2

    #v10=(Integer);
    new-array v2, v10, [Ljava/lang/String;

    .line 419
    .local v2, cols:[Ljava/lang/String;
    #v2=(Reference);
    array-length v10, p2

    new-array v9, v10, [Ljava/lang/Object;

    .line 420
    .local v9, values:[Ljava/lang/Object;
    #v9=(Reference);
    const/4 v5, 0x0

    .line 421
    .local v5, i:I
    #v5=(Null);
    move-object v0, p2

    .local v0, arr$:[Ljava/lang/String;
    #v0=(Reference);
    array-length v8, v0

    .local v8, len$:I
    #v8=(Integer);
    const/4 v7, 0x0

    .local v7, i$:I
    #v7=(Null);
    move v6, v5

    .end local v5           #i:I
    .local v6, i:I
    :goto_0
    #v1=(Conflicted);v5=(Integer);v6=(Integer);v7=(Integer);v10=(Conflicted);v11=(Conflicted);
    if-ge v7, v8, :cond_2

    aget-object v1, v0, v7

    .line 422
    .local v1, col:Ljava/lang/String;
    #v1=(Null);
    const-string v10, "_display_name"

    #v10=(Reference);
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    #v10=(Boolean);
    if-eqz v10, :cond_1

    .line 423
    const-string v10, "_display_name"

    #v10=(Reference);
    aput-object v10, v2, v6

    .line 424
    add-int/lit8 v5, v6, 0x1

    .end local v6           #i:I
    .restart local v5       #i:I
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v6

    .line 421
    :goto_1
    #v10=(Conflicted);
    add-int/lit8 v7, v7, 0x1

    move v6, v5

    .end local v5           #i:I
    .restart local v6       #i:I
    goto :goto_0

    .line 425
    :cond_1
    #v10=(Boolean);
    const-string v10, "_size"

    #v10=(Reference);
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    #v10=(Boolean);
    if-eqz v10, :cond_3

    .line 426
    const-string v10, "_size"

    #v10=(Reference);
    aput-object v10, v2, v6

    .line 427
    add-int/lit8 v5, v6, 0x1

    .end local v6           #i:I
    .restart local v5       #i:I
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v10

    #v10=(LongLo);v11=(LongHi);
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    #v10=(Reference);
    aput-object v10, v9, v6

    goto :goto_1

    .line 431
    .end local v1           #col:Ljava/lang/String;
    .end local v5           #i:I
    .restart local v6       #i:I
    :cond_2
    #v1=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    invoke-static {v2, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v2

    .line 432
    invoke-static {v9, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    .line 434
    new-instance v3, Landroid/database/MatrixCursor;

    #v3=(UninitRef);
    const/4 v10, 0x1

    #v10=(One);
    invoke-direct {v3, v2, v10}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 435
    .local v3, cursor:Landroid/database/MatrixCursor;
    #v3=(Reference);
    invoke-virtual {v3, v9}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 436
    return-object v3

    .end local v3           #cursor:Landroid/database/MatrixCursor;
    .restart local v1       #col:Ljava/lang/String;
    :cond_3
    #v1=(Null);v3=(Uninit);v10=(Boolean);
    move v5, v6

    .end local v6           #i:I
    .restart local v5       #i:I
    goto :goto_1
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2
    .parameter "uri"
    .parameter "values"
    .parameter "selection"
    .parameter "selectionArgs"

    .prologue
    .line 480
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "No external updates"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

*/}
