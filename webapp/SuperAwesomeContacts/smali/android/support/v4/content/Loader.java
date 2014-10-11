package android.support.v4.content; class Loader { void a() { int a;
a=0;// .class public Landroid/support/v4/content/Loader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Loader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/Loader$OnLoadCompleteListener;,
a=0;//         Landroid/support/v4/content/Loader$ForceLoadContentObserver;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<D:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAbandoned:Z
a=0;// 
a=0;// .field mContentChanged:Z
a=0;// 
a=0;// .field mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mId:I
a=0;// 
a=0;// .field mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/content/Loader$OnLoadCompleteListener",
a=0;//             "<TD;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mProcessingChange:Z
a=0;// 
a=0;// .field mReset:Z
a=0;// 
a=0;// .field mStarted:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     .line 39
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     .line 41
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/Loader;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abandon()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onAbandon()V
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public commitContentChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dataToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TD;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TD;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 369
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 370
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public deliverResult(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TD;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TD;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader$OnLoadCompleteListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/content/Loader$OnLoadCompleteListener;->onLoadComplete(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mId="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/content/Loader;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 394
a=0;//     const-string v0, " mListener="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 395
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 396
a=0;//     :cond_0
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mStarted="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 397
a=0;//     const-string v0, " mContentChanged="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 398
a=0;//     const-string v0, " mProcessingChange="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 400
a=0;//     :cond_1
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 401
a=0;//     :cond_2
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mAbandoned="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 402
a=0;//     const-string v0, " mReset="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 404
a=0;//     :cond_3
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public forceLoad()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onForceLoad()V
a=0;// 
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget v0, p0, Landroid/support/v4/content/Loader;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isAbandoned()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isReset()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isStarted()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAbandon()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onContentChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->forceLoad()V
a=0;// 
a=0;//     .line 361
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 359
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onForceLoad()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onReset()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStartLoading()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStopLoading()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public registerListener(ILandroid/support/v4/content/Loader$OnLoadCompleteListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Landroid/support/v4/content/Loader$OnLoadCompleteListener",
a=0;//             "<TD;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     .local p2, "listener":Landroid/support/v4/content/Loader$OnLoadCompleteListener;, "Landroid/support/v4/content/Loader$OnLoadCompleteListener<TD;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader$OnLoadCompleteListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "There is already a listener registered"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-object p2, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     .line 134
a=0;//     iput p1, p0, Landroid/support/v4/content/Loader;->mId:I
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public reset()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 291
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onReset()V
a=0;// 
a=0;//     .line 292
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     .line 293
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     .line 294
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     .line 295
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     .line 296
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public rollbackContentChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final startLoading()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     .line 196
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mReset:Z
a=0;// 
a=0;//     .line 197
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mAbandoned:Z
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onStartLoading()V
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public stopLoading()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/Loader;->mStarted:Z
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/Loader;->onStopLoading()V
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public takeContentChanged()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     .line 315
a=0;//     .local v0, "res":Z
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mContentChanged:Z
a=0;// 
a=0;//     .line 316
a=0;//     iget-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v1, v0
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v4/content/Loader;->mProcessingChange:Z
a=0;// 
a=0;//     .line 317
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 377
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 378
a=0;//     const-string v1, " id="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 379
a=0;//     iget v1, p0, Landroid/support/v4/content/Loader;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 380
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 381
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public unregisterListener(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/content/Loader$OnLoadCompleteListener",
a=0;//             "<TD;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     .local p0, "this":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<TD;>;"
a=0;//     .local p1, "listener":Landroid/support/v4/content/Loader$OnLoadCompleteListener;, "Landroid/support/v4/content/Loader$OnLoadCompleteListener<TD;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader$OnLoadCompleteListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No listener register"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 147
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Attempting to unregister the wrong listener"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/Loader;->mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
}}
