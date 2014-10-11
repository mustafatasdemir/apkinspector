package android.support.v4.content; class ContextCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/content/ContextCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ContextCompat.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DIR_ANDROID:Ljava/lang/String; = "Android"
a=0;// 
a=0;// .field private static final DIR_CACHE:Ljava/lang/String; = "cache"
a=0;// 
a=0;// .field private static final DIR_DATA:Ljava/lang/String; = "data"
a=0;// 
a=0;// .field private static final DIR_FILES:Ljava/lang/String; = "files"
a=0;// 
a=0;// .field private static final DIR_OBB:Ljava/lang/String; = "obb"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/content/ContextCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static varargs buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 6
a=0;//     .param p0, "base"    # Ljava/io/File;
a=0;//     .param p1, "segments"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 291
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
a=0;//     if-ge v3, v4, :cond_1
a=0;// 
a=0;//     aget-object v5, v0, v3
a=0;// 
a=0;//     .line 292
a=0;//     .local v5, "segment":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
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
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 295
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .end local v2    # "cur":Ljava/io/File;
a=0;//     .restart local v1    # "cur":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 298
a=0;//     .end local v1    # "cur":Ljava/io/File;
a=0;//     .end local v5    # "segment":Ljava/lang/String;
a=0;//     .restart local v2    # "cur":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .restart local v5    # "segment":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v5=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "cur":Ljava/io/File;
a=0;//     .restart local v1    # "cur":Ljava/io/File;
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 274
a=0;//     #v6=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 275
a=0;//     .local v1, "version":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x13
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 276
a=0;//     invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 285
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/io/File;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {p0}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalCacheDir(Landroid/content/Context;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 285
a=0;//     .local v0, "single":Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-array v2, v7, [Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 282
a=0;//     .end local v0    # "single":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v4, "Android"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v6
a=0;// 
a=0;//     const-string v4, "data"
a=0;// 
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     const-string v5, "cache"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "single":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getExternalFilesDirs(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     #v6=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 215
a=0;//     .local v1, "version":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x13
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatKitKat;->getExternalFilesDirs(Landroid/content/Context;Ljava/lang/String;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 225
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/io/File;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatFroyo;->getExternalFilesDir(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 225
a=0;//     .local v0, "single":Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-array v2, v7, [Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     .end local v0    # "single":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v4, "Android"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v6
a=0;// 
a=0;//     const-string v4, "data"
a=0;// 
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     const-string v5, "files"
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "single":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getObbDirs(Landroid/content/Context;)[Ljava/io/File;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     #v6=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "version":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x13
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {p0}, Landroid/support/v4/content/ContextCompatKitKat;->getObbDirs(Landroid/content/Context;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/io/File;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 160
a=0;//     invoke-static {p0}, Landroid/support/v4/content/ContextCompatHoneycomb;->getObbDir(Landroid/content/Context;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "single":Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-array v2, v7, [Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 162
a=0;//     .end local v0    # "single":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v4, "Android"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v6
a=0;// 
a=0;//     const-string v4, "obb"
a=0;// 
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->buildPath(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "single":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;)Z
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "intents"    # [Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "intents"    # [Landroid/content/Intent;
a=0;//     .param p2, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     #v1=(One);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/content/ContextCompatJellybean;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 107
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/content/ContextCompatHoneycomb;->startActivities(Landroid/content/Context;[Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
