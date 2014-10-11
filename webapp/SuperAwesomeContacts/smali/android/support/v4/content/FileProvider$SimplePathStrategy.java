package android.support.v4.content; class FileProvider$SimplePathStrategy { void a() { int a;
a=0;// .class Landroid/support/v4/content/FileProvider$SimplePathStrategy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FileProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/content/FileProvider$PathStrategy;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/content/FileProvider;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "SimplePathStrategy"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAuthority:Ljava/lang/String;
a=0;// 
a=0;// .field private final mRoots:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "authority"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 632
a=0;//     #p0=(Reference,Landroid/support/v4/content/FileProvider$SimplePathStrategy;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mRoots:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 635
a=0;//     iput-object p1, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mAuthority:Ljava/lang/String;
a=0;// 
a=0;//     .line 636
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addRoot(Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 4
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "root"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 643
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 644
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "Name must not be empty"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 649
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 655
a=0;//     iget-object v1, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mRoots:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 656
a=0;//     return-void
a=0;// 
a=0;//     .line 650
a=0;//     :catch_0
a=0;//     #v1=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 651
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Failed to resolve canonical path for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getFileForUri(Landroid/net/Uri;)Ljava/io/File;
a=0;//     .locals 9
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 698
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 700
a=0;//     .local v2, "path":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x2f
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6, v7}, Ljava/lang/String;->indexOf(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 701
a=0;//     .local v4, "splitIndex":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 702
a=0;//     .local v5, "tag":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v6, v4, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 704
a=0;//     iget-object v6, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mRoots:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/io/File;
a=0;// 
a=0;//     .line 705
a=0;//     .local v3, "root":Ljava/io/File;
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 706
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Unable to find configured root for "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 709
a=0;//     :cond_0
a=0;//     #v7=(One);v8=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 711
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 717
a=0;//     new-instance v6, Ljava/lang/SecurityException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/SecurityException;);
a=0;//     const-string v7, "Resolved path jumped beyond configured root"
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/SecurityException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 712
a=0;//     :catch_0
a=0;//     #v7=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 713
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Failed to resolve canonical path for "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 720
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v6=(Boolean);v8=(Uninit);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getUriForFile(Ljava/io/File;)Landroid/net/Uri;
a=0;//     .locals 9
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 662
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 668
a=0;//     .local v3, "path":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 669
a=0;//     .local v2, "mostSpecific":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     #v2=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mRoots:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Reference,Ljava/util/Map$Entry;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 670
a=0;//     .local v4, "root":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 671
a=0;//     .local v5, "rootPath":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v7, v6, :cond_0
a=0;// 
a=0;//     .line 673
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     move-object v2, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 663
a=0;//     .end local v1    # "i$":Ljava/util/Iterator;
a=0;//     .end local v2    # "mostSpecific":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .end local v3    # "path":Ljava/lang/String;
a=0;//     .end local v4    # "root":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .end local v5    # "rootPath":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 664
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Failed to resolve canonical path for "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 677
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     .restart local v1    # "i$":Ljava/util/Iterator;
a=0;//     .restart local v2    # "mostSpecific":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/io/File;>;"
a=0;//     .restart local v3    # "path":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/util/Iterator;);v2=(Reference,Ljava/util/Map$Entry;);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Uninit);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 678
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Failed to find configured root that contains "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 683
a=0;//     :cond_3
a=0;//     #v6=(Boolean);v7=(Conflicted);v8=(Uninit);
a=0;//     invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 684
a=0;//     .restart local v5    # "rootPath":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "/"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 685
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 691
a=0;//     :goto_1
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v6}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/16 v7, 0x2f
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "/"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v7}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 692
a=0;//     new-instance v6, Landroid/net/Uri$Builder;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/net/Uri$Builder;);
a=0;//     invoke-direct {v6}, Landroid/net/Uri$Builder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Landroid/net/Uri$Builder;);
a=0;//     const-string v7, "content"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/content/FileProvider$SimplePathStrategy;->mAuthority:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 687
a=0;//     :cond_4
a=0;//     #v6=(Boolean);v7=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
