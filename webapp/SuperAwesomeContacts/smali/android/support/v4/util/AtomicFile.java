package android.support.v4.util; class AtomicFile { void a() { int a;
a=0;// .class public Landroid/support/v4/util/AtomicFile;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AtomicFile.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mBackupName:Ljava/io/File;
a=0;// 
a=0;// .field private final mBaseName:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p1, "baseName"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Landroid/support/v4/util/AtomicFile;);
a=0;//     iput-object p1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     .line 53
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ".bak"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static sync(Ljava/io/FileOutputStream;)Z
a=0;//     .locals 1
a=0;//     .param p0, "stream"    # Ljava/io/FileOutputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileDescriptor;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 211
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 209
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 211
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public delete()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public failWrite(Ljava/io/FileOutputStream;)V
a=0;//     .locals 3
a=0;//     .param p1, "str"    # Ljava/io/FileOutputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {p1}, Landroid/support/v4/util/AtomicFile;->sync(Ljava/io/FileOutputStream;)Z
a=0;// 
a=0;//     .line 142
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 145
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "AtomicFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "failWrite: Got exception:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public finishWrite(Ljava/io/FileOutputStream;)V
a=0;//     .locals 3
a=0;//     .param p1, "str"    # Ljava/io/FileOutputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {p1}, Landroid/support/v4/util/AtomicFile;->sync(Ljava/io/FileOutputStream;)Z
a=0;// 
a=0;//     .line 125
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 127
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "AtomicFile"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "finishWrite: Got exception:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBaseFile()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public openRead()Ljava/io/FileInputStream;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public readFully()[B
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/AtomicFile;->openRead()Ljava/io/FileInputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 178
a=0;//     .local v5, "stream":Ljava/io/FileInputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     .local v4, "pos":I
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->available()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "avail":I
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [B
a=0;// 
a=0;//     .line 182
a=0;//     .local v2, "data":[B
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,[B);v3=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     array-length v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v4
a=0;// 
a=0;//     invoke-virtual {v5, v2, v4, v6}, Ljava/io/FileInputStream;->read([BII)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "amt":I
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     add-int/2addr v4, v0
a=0;// 
a=0;//     .line 191
a=0;//     :try_start_1
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->available()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 192
a=0;//     array-length v6, v2
a=0;// 
a=0;//     sub-int/2addr v6, v4
a=0;// 
a=0;//     if-le v1, v6, :cond_0
a=0;// 
a=0;//     .line 193
a=0;//     add-int v6, v4, v1
a=0;// 
a=0;//     new-array v3, v6, [B
a=0;// 
a=0;//     .line 194
a=0;//     .local v3, "newData":[B
a=0;//     #v3=(Reference,[B);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v2, v6, v3, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 195
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     .end local v0    # "amt":I
a=0;//     .end local v1    # "avail":I
a=0;//     .end local v2    # "data":[B
a=0;//     .end local v3    # "newData":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public startWrite()Ljava/io/FileOutputStream;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const-string v4, "AtomicFile"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Couldn\'t rename file "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " to backup file "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBackupName:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     .local v3, "str":Ljava/io/FileOutputStream;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     .end local v3    # "str":Ljava/io/FileOutputStream;
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v3    # "str":Ljava/io/FileOutputStream;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 95
a=0;//     .end local v3    # "str":Ljava/io/FileOutputStream;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "e":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "parent":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdir()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v4, Ljava/io/IOException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Couldn\'t create directory "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 107
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v4=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .restart local v3    # "str":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     .end local v3    # "str":Ljava/io/FileOutputStream;
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 109
a=0;//     .local v1, "e2":Ljava/io/FileNotFoundException;
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v4, Ljava/io/IOException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Couldn\'t create "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/AtomicFile;->mBaseName:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     throw v4
a=0;// .end method
}}
