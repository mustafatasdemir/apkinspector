package android.support.v4.app; class LoaderManagerImpl$LoaderInfo { void a() { int a;
a=0;// .class final Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoaderManager.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/content/Loader$OnLoadCompleteListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/LoaderManagerImpl;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "LoaderInfo"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/support/v4/content/Loader$OnLoadCompleteListener",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mArgs:Landroid/os/Bundle;
a=0;// 
a=0;// .field mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mData:Ljava/lang/Object;
a=0;// 
a=0;// .field mDeliveredData:Z
a=0;// 
a=0;// .field mDestroyed:Z
a=0;// 
a=0;// .field mHaveData:Z
a=0;// 
a=0;// .field final mId:I
a=0;// 
a=0;// .field mListenerRegistered:Z
a=0;// 
a=0;// .field mLoader:Landroid/support/v4/content/Loader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;// .field mReportNextStart:Z
a=0;// 
a=0;// .field mRetaining:Z
a=0;// 
a=0;// .field mRetainingStarted:Z
a=0;// 
a=0;// .field mStarted:Z
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/app/LoaderManagerImpl;ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)V
a=0;//     .locals 0
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Landroid/os/Bundle;",
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     .local p4, "callbacks":Landroid/support/v4/app/LoaderManager$LoaderCallbacks;, "Landroid/support/v4/app/LoaderManager$LoaderCallbacks<Ljava/lang/Object;>;"
a=0;//     iput-object p1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 229
a=0;//     #p0=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     iput p2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     .line 230
a=0;//     iput-object p3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mArgs:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 231
a=0;//     iput-object p4, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     .line 232
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method callOnLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p2, "data"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     .local p1, "loader":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<Ljava/lang/Object;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManager$LoaderCallbacks;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 419
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 420
a=0;//     .local v0, "lastBecause":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 422
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     const-string v2, "onLoadFinished"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 425
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, "LoaderManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "  onLoadFinished in "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Landroid/support/v4/content/Loader;->dataToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 427
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManager$LoaderCallbacks;);
a=0;//     invoke-interface {v1, p1, p2}, Landroid/support/v4/app/LoaderManager$LoaderCallbacks;->onLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput-object v0, v1, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 433
a=0;//     :cond_2
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     .line 435
a=0;//     .end local v0    # "lastBecause":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 429
a=0;//     .restart local v0    # "lastBecause":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput-object v0, v2, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     :cond_4
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method destroy()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 327
a=0;//     #v5=(Null);
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "  Destroying: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 328
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDestroyed:Z
a=0;// 
a=0;//     .line 329
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     .line 330
a=0;//     .local v1, "needReset":Z
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManager$LoaderCallbacks;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "  Reseting: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 333
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 334
a=0;//     .local v0, "lastBecause":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v0, v2, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 336
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     const-string v3, "onLoaderReset"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v2, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 339
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-interface {v2, v3}, Landroid/support/v4/app/LoaderManager$LoaderCallbacks;->onLoaderReset(Landroid/support/v4/content/Loader;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput-object v0, v2, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     .line 346
a=0;//     .end local v0    # "lastBecause":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     .line 347
a=0;//     iput-object v6, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     .line 348
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 350
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 351
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v4/content/Loader;->unregisterListener(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
a=0;// 
a=0;//     .line 354
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/content/Loader;->reset()V
a=0;// 
a=0;//     .line 356
a=0;//     :cond_5
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 359
a=0;//     :cond_6
a=0;//     return-void
a=0;// 
a=0;//     .line 341
a=0;//     .restart local v0    # "lastBecause":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-exception v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v3, v3, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput-object v0, v3, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     :cond_7
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mId="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 452
a=0;//     const-string v0, " mArgs="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mArgs:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 453
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mCallbacks="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 454
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mLoader="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/content/Loader;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 458
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 459
a=0;//     :cond_1
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mHaveData="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 460
a=0;//     const-string v0, "  mDeliveredData="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 461
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mData="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 463
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mStarted="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 464
a=0;//     const-string v0, " mReportNextStart="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mReportNextStart:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 465
a=0;//     const-string v0, " mDestroyed="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 466
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mRetaining="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 467
a=0;//     const-string v0, " mRetainingStarted="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetainingStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 468
a=0;//     const-string v0, " mListenerRegistered="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 469
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 470
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Pending Loader "
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v0, ":"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 472
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "  "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 474
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method finishRetain()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 279
a=0;//     sget-boolean v0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "LoaderManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "  Finished Retaining: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     .line 281
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetainingStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 282
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->stop()V
a=0;// 
a=0;//     .line 291
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mReportNextStart:Z
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->callOnLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 300
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLoadComplete(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;//     .param p2, "data"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "loader":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<Ljava/lang/Object;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 362
a=0;//     #v5=(Null);
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "onLoadComplete: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 364
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDestroyed:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 365
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "  Ignoring load complete -- destroyed"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 415
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 369
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eq v2, p0, :cond_3
a=0;// 
a=0;//     .line 372
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "  Ignoring load complete -- not active"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     :cond_3
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 377
a=0;//     .local v1, "pending":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 381
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "  Switching to pending loader: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 382
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iput-object v5, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, v5}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 384
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/app/LoaderManagerImpl;->installLoader(Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 391
a=0;//     :cond_5
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     if-ne v2, p2, :cond_6
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 392
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     iput-object p2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     .line 393
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     .line 394
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->callOnLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 405
a=0;//     :cond_7
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 406
a=0;//     .local v0, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     if-eq v0, p0, :cond_8
a=0;// 
a=0;//     .line 407
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/util/SparseArrayCompat;->remove(I)V
a=0;// 
a=0;//     .line 412
a=0;//     :cond_8
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->hasRunningLoaders()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->this$0:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->startPendingDeferredFragments()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method reportStart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 304
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mReportNextStart:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 305
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mReportNextStart:Z
a=0;// 
a=0;//     .line 306
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->callOnLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method retain()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     sget-boolean v0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "LoaderManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "  Retaining: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     .line 272
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetainingStarted:Z
a=0;// 
a=0;//     .line 273
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     .line 274
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     .line 275
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method start()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 235
a=0;//     #v3=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetainingStarted:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 239
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     .line 250
a=0;//     sget-boolean v0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "LoaderManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "  Starting: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 251
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mArgs:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/support/v4/app/LoaderManager$LoaderCallbacks;->onCreateLoader(ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     .line 254
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 257
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Object returned from onCreateLoader must not be a non-static inner member class: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iget v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p0}, Landroid/support/v4/content/Loader;->registerListener(ILandroid/support/v4/content/Loader$OnLoadCompleteListener;)V
a=0;// 
a=0;//     .line 263
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     .line 265
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/Loader;->startLoading()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method stop()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 314
a=0;//     #v3=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "LoaderManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "  Stopping: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     .line 316
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 319
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mListenerRegistered:Z
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/content/Loader;->unregisterListener(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/Loader;->stopLoading()V
a=0;// 
a=0;//     .line 324
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 440
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "LoaderInfo{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 441
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 442
a=0;//     const-string v1, " #"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 443
a=0;//     iget v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 444
a=0;//     const-string v1, " : "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 445
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 446
a=0;//     const-string v1, "}}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
