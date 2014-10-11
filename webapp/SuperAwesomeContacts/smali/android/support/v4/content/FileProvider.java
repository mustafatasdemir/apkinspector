package android.support.v4.content; class FileProvider { void a() { int a;
a=0;// .class public Landroid/support/v4/content/FileProvider;
a=0;// .super Landroid/content/ContentProvider;
a=0;// .source "FileProvider.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/FileProvider$SimplePathStrategy;,
a=0;//         Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTR_NAME:Ljava/lang/String; = "name"
a=0;// 
a=0;// .field private static final ATTR_PATH:Ljava/lang/String; = "path"
a=0;// 
a=0;// .field private static final COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;// .field private static final DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;// .field private static final META_DATA_FILE_PROVIDER_PATHS:Ljava/lang/String; = "android.support.FILE_PROVIDER_PATHS"
a=0;// 
a=0;// .field private static final TAG_CACHE_PATH:Ljava/lang/String; = "cache-path"
a=0;// 
a=0;// .field private static final TAG_EXTERNAL:Ljava/lang/String; = "external-path"
a=0;// 
a=0;// .field private static final TAG_FILES_PATH:Ljava/lang/String; = "files-path"
a=0;// 
a=0;// .field private static final TAG_ROOT_PATH:Ljava/lang/String; = "root-path"
a=0;// 
a=0;// .field private static sCache:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/support/v4/content/FileProvider$PathStrategy;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "_display_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "_size"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 317
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;//     .line 320
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V
a=0;// 
a=0;//     .line 630
a=0;//     #p0=(Reference,Landroid/support/v4/content/FileProvider;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 6
a=0;//     .param p0, "base"    # Ljava/io/File;
a=0;//     .param p1, "segments"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 753
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 754
a=0;//     .local v1, "cur":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     #v3=(Null);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .end local v1    # "cur":Ljava/io/File;
a=0;//     .local v2, "cur":Ljava/io/File;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/io/File;);v3=(Integer);v5=(Conflicted);
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     aget-object v5, v0, v3
a=0;// 
a=0;//     .line 755
a=0;//     .local v5, "segment":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 756
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 754
a=0;//     .end local v2    # "cur":Ljava/io/File;
a=0;//     .restart local v1    # "cur":Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .end local v1    # "cur":Ljava/io/File;
a=0;//     .restart local v2    # "cur":Ljava/io/File;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 759
a=0;//     .end local v5    # "segment":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .restart local v5    # "segment":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v5=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "cur":Ljava/io/File;
a=0;//     .restart local v1    # "cur":Ljava/io/File;
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p0, "original"    # [Ljava/lang/Object;
a=0;//     .param p1, "newLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 769
a=0;//     #v1=(Null);
a=0;//     new-array v0, p1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 770
a=0;//     .local v0, "result":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 771
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static copyOf([Ljava/lang/String;I)[Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "original"    # [Ljava/lang/String;
a=0;//     .param p1, "newLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 763
a=0;//     #v1=(Null);
a=0;//     new-array v0, p1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 764
a=0;//     .local v0, "result":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 765
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "authority"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 530
a=0;//     sget-object v3, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 531
a=0;//     :try_start_0
a=0;//     sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 532
a=0;//     .local v1, "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     :try_start_1
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 542
a=0;//     :try_start_2
a=0;//     sget-object v2, Landroid/support/v4/content/FileProvider;->sCache:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 544
a=0;//     :cond_0
a=0;//     monitor-exit v3
a=0;// 
a=0;//     .line 545
a=0;//     return-object v1
a=0;// 
a=0;//     .line 535
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 536
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 544
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .end local v1    # "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 538
a=0;//     .restart local v1    # "strat":Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 539
a=0;//     .local v0, "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public static getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "authority"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 377
a=0;//     .local v0, "strategy":Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     #v0=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v0, p2}, Landroid/support/v4/content/FileProvider$PathStrategy;->getUriForFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static modeToMode(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "mode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     const-string v1, "r"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 730
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     .line 749
a=0;//     .local v0, "modeBits":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 731
a=0;//     .end local v0    # "modeBits":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const-string v1, "w"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "wt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 732
a=0;//     :cond_1
a=0;//     const/high16 v0, 0x2c000000
a=0;// 
a=0;//     .restart local v0    # "modeBits":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 735
a=0;//     .end local v0    # "modeBits":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     const-string v1, "wa"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 736
a=0;//     const/high16 v0, 0x2a000000
a=0;// 
a=0;//     .restart local v0    # "modeBits":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 739
a=0;//     .end local v0    # "modeBits":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);
a=0;//     const-string v1, "rw"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 740
a=0;//     const/high16 v0, 0x38000000
a=0;// 
a=0;//     .restart local v0    # "modeBits":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 742
a=0;//     .end local v0    # "modeBits":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);
a=0;//     const-string v1, "rwt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 743
a=0;//     const/high16 v0, 0x3c000000
a=0;// 
a=0;//     .restart local v0    # "modeBits":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 747
a=0;//     .end local v0    # "modeBits":I
a=0;//     :cond_5
a=0;//     #v0=(Uninit);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Invalid mode: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static parsePathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;//     .locals 13
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "authority"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lorg/xmlpull/v1/XmlPullParserException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 556
a=0;//     #v10=(One);
a=0;//     new-instance v4, Landroid/support/v4/content/FileProvider$SimplePathStrategy;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/content/FileProvider$SimplePathStrategy;);
a=0;//     invoke-direct {v4, p1}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 558
a=0;//     .local v4, "strat":Landroid/support/v4/content/FileProvider$SimplePathStrategy;
a=0;//     #v4=(Reference,Landroid/support/v4/content/FileProvider$SimplePathStrategy;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v9, 0x80
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-virtual {v8, p1, v9}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 560
a=0;//     .local v1, "info":Landroid/content/pm/ProviderInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/ProviderInfo;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "android.support.FILE_PROVIDER_PATHS"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v8, v9}, Landroid/content/pm/ProviderInfo;->loadXmlMetaData(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 562
a=0;//     .local v0, "in":Landroid/content/res/XmlResourceParser;
a=0;//     #v0=(Reference,Landroid/content/res/XmlResourceParser;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 563
a=0;//     new-instance v8, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v9, "Missing android.support.FILE_PROVIDER_PATHS meta-data"
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 568
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->next()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .local v7, "type":I
a=0;//     #v7=(Integer);
a=0;//     if-eq v7, v10, :cond_5
a=0;// 
a=0;//     .line 569
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 572
a=0;//     .local v5, "tag":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "name"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 573
a=0;//     .local v2, "name":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "path"
a=0;// 
a=0;//     invoke-interface {v0, v12, v8}, Landroid/content/res/XmlResourceParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 575
a=0;//     .local v3, "path":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     .local v6, "target":Ljava/io/File;
a=0;//     #v6=(Null);
a=0;//     const-string v8, "root-path"
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 577
a=0;//     sget-object v8, Landroid/support/v4/content/FileProvider;->DEVICE_ROOT:Ljava/io/File;
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     new-array v9, v10, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v9, v11
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 586
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v6=(Reference,Ljava/io/File;);v8=(Conflicted);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     invoke-virtual {v4, v2, v6}, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->addRoot(Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 578
a=0;//     :cond_2
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     const-string v8, "files-path"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 579
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     new-array v9, v10, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v9, v11
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 580
a=0;//     :cond_3
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     const-string v8, "cache-path"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 581
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     new-array v9, v10, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v9, v11
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 582
a=0;//     :cond_4
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     const-string v8, "external-path"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 583
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     new-array v9, v10, [Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v9, v11
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/support/v4/content/FileProvider;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 592
a=0;//     .end local v2    # "name":Ljava/lang/String;
a=0;//     .end local v3    # "path":Ljava/lang/String;
a=0;//     .end local v5    # "tag":Ljava/lang/String;
a=0;//     .end local v6    # "target":Ljava/io/File;
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "info"    # Landroid/content/pm/ProviderInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
a=0;// 
a=0;//     .line 345
a=0;//     iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->exported:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 346
a=0;//     new-instance v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     const-string v1, "Provider must not be exported"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p2, Landroid/content/pm/ProviderInfo;->grantUriPermissions:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     new-instance v0, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     const-string v1, "Provider must grant uri permissions"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/content/FileProvider;->getPathStrategy(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "selection"    # Ljava/lang/String;
a=0;//     .param p3, "selectionArgs"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v1, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v1, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 498
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getType(Landroid/net/Uri;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     iget-object v4, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v4, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 453
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x2e
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 454
a=0;//     .local v2, "lastDot":I
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     .line 455
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     add-int/lit8 v5, v2, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 456
a=0;//     .local v0, "extension":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 457
a=0;//     .local v3, "mime":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     .end local v0    # "extension":Ljava/lang/String;
a=0;//     .end local v3    # "mime":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "application/octet-stream"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
a=0;//     .locals 2
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "values"    # Landroid/content/ContentValues;
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "No external inserts"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
a=0;//     .locals 3
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "mode"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     iget-object v2, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v2, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 520
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {p2}, Landroid/support/v4/content/FileProvider;->modeToMode(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 521
a=0;//     .local v1, "fileMode":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;//     .locals 12
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "projection"    # [Ljava/lang/String;
a=0;//     .param p3, "selection"    # Ljava/lang/String;
a=0;//     .param p4, "selectionArgs"    # [Ljava/lang/String;
a=0;//     .param p5, "sortOrder"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iget-object v10, p0, Landroid/support/v4/content/FileProvider;->mStrategy:Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/content/FileProvider$PathStrategy;);
a=0;//     invoke-interface {v10, p1}, Landroid/support/v4/content/FileProvider$PathStrategy;->getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 414
a=0;//     .local v4, "file":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 415
a=0;//     sget-object p2, Landroid/support/v4/content/FileProvider;->COLUMNS:[Ljava/lang/String;
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     array-length v10, p2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     new-array v2, v10, [Ljava/lang/String;
a=0;// 
a=0;//     .line 419
a=0;//     .local v2, "cols":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v10, p2
a=0;// 
a=0;//     new-array v9, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 420
a=0;//     .local v9, "values":[Ljava/lang/Object;
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 421
a=0;//     .local v5, "i":I
a=0;//     #v5=(Null);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v8, v0
a=0;// 
a=0;//     .local v8, "len$":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .local v7, "i$":I
a=0;//     #v7=(Null);
a=0;//     move v6, v5
a=0;// 
a=0;//     .end local v5    # "i":I
a=0;//     .local v6, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Integer);v6=(Integer);v7=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v7, v8, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v7
a=0;// 
a=0;//     .line 422
a=0;//     .local v1, "col":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     const-string v10, "_display_name"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 423
a=0;//     const-string v10, "_display_name"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     aput-object v10, v2, v6
a=0;// 
a=0;//     .line 424
a=0;//     add-int/lit8 v5, v6, 0x1
a=0;// 
a=0;//     .end local v6    # "i":I
a=0;//     .restart local v5    # "i":I
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     aput-object v10, v9, v6
a=0;// 
a=0;//     .line 421
a=0;//     :goto_1
a=0;//     #v10=(Conflicted);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     .end local v5    # "i":I
a=0;//     .restart local v6    # "i":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :cond_1
a=0;//     #v10=(Boolean);
a=0;//     const-string v10, "_size"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 426
a=0;//     const-string v10, "_size"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     aput-object v10, v2, v6
a=0;// 
a=0;//     .line 427
a=0;//     add-int/lit8 v5, v6, 0x1
a=0;// 
a=0;//     .end local v6    # "i":I
a=0;//     .restart local v5    # "i":I
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v10, v9, v6
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 431
a=0;//     .end local v1    # "col":Ljava/lang/String;
a=0;//     .end local v5    # "i":I
a=0;//     .restart local v6    # "i":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {v2, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 432
a=0;//     invoke-static {v9, v6}, Landroid/support/v4/content/FileProvider;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v3, Landroid/database/MatrixCursor;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/database/MatrixCursor;);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-direct {v3, v2, v10}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 435
a=0;//     .local v3, "cursor":Landroid/database/MatrixCursor;
a=0;//     #v3=(Reference,Landroid/database/MatrixCursor;);
a=0;//     invoke-virtual {v3, v9}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 436
a=0;//     return-object v3
a=0;// 
a=0;//     .end local v3    # "cursor":Landroid/database/MatrixCursor;
a=0;//     .restart local v1    # "col":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v1=(Null);v3=(Uninit);v10=(Boolean);
a=0;//     move v5, v6
a=0;// 
a=0;//     .end local v6    # "i":I
a=0;//     .restart local v5    # "i":I
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .param p2, "values"    # Landroid/content/ContentValues;
a=0;//     .param p3, "selection"    # Ljava/lang/String;
a=0;//     .param p4, "selectionArgs"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 480
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "No external updates"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
