package android.support.v4.os; class EnvironmentCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/os/EnvironmentCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EnvironmentCompat.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final MEDIA_UNKNOWN:Ljava/lang/String; = "unknown"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "EnvironmentCompat"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/os/EnvironmentCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getStorageState(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .param p0, "path"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "version":I
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x13
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {p0}, Landroid/support/v4/os/EnvironmentCompatKitKat;->getStorageState(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(PosByte);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 63
a=0;//     .local v1, "canonicalPath":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "canonicalExternal":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     .end local v0    # "canonicalExternal":Ljava/lang/String;
a=0;//     .end local v1    # "canonicalPath":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v4, "EnvironmentCompat"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Failed to resolve canonical path: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 73
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v4, "unknown"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
