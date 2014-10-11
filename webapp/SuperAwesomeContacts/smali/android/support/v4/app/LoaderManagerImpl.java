package android.support.v4.app; class LoaderManagerImpl { void a() { int a;
a=0;// .class Landroid/support/v4/app/LoaderManagerImpl;
a=0;// .super Landroid/support/v4/app/LoaderManager;
a=0;// .source "LoaderManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static DEBUG:Z = false
a=0;// 
a=0;// .field static final TAG:Ljava/lang/String; = "LoaderManager"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;// .field mCreatingLoader:Z
a=0;// 
a=0;// .field final mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/SparseArrayCompat",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/SparseArrayCompat",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mRetaining:Z
a=0;// 
a=0;// .field mRetainingStarted:Z
a=0;// 
a=0;// .field mStarted:Z
a=0;// 
a=0;// .field final mWho:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Ljava/lang/String;
a=0;//     .param p2, "activity"    # Landroid/support/v4/app/FragmentActivity;
a=0;//     .param p3, "started"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/LoaderManager;-><init>()V
a=0;// 
a=0;//     .line 194
a=0;//     #p0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     new-instance v0, Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v0, Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     .line 478
a=0;//     iput-object p1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     .line 479
a=0;//     iput-object p2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 480
a=0;//     iput-boolean p3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     .line 481
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createAndInstallLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Landroid/os/Bundle;",
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "callback":Landroid/support/v4/app/LoaderManager$LoaderCallbacks;, "Landroid/support/v4/app/LoaderManager$LoaderCallbacks<Ljava/lang/Object;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 498
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     .line 499
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/LoaderManagerImpl;->createLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 500
a=0;//     .local v0, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/LoaderManagerImpl;->installLoader(Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 503
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .end local v0    # "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private createLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Landroid/os/Bundle;",
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     .local p3, "callback":Landroid/support/v4/app/LoaderManager$LoaderCallbacks;, "Landroid/support/v4/app/LoaderManager$LoaderCallbacks<Ljava/lang/Object;>;"
a=0;//     new-instance v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;-><init>(Landroid/support/v4/app/LoaderManagerImpl;ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)V
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     invoke-interface {p3, p1, p2}, Landroid/support/v4/app/LoaderManager$LoaderCallbacks;->onCreateLoader(ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 491
a=0;//     .local v1, "loader":Landroid/support/v4/content/Loader;, "Landroid/support/v4/content/Loader<Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     .line 492
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public destroyLoader(I)V
a=0;//     .locals 5
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 658
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 659
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Called while creating a loader"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 662
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
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
a=0;//     const-string v4, "destroyLoader in "
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
a=0;//     const-string v4, " of "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 663
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 664
a=0;//     .local v0, "idx":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     .line 665
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 666
a=0;//     .local v1, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V
a=0;// 
a=0;//     .line 667
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 669
a=0;//     .end local v1    # "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->indexOfKey(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 670
a=0;//     if-ltz v0, :cond_3
a=0;// 
a=0;//     .line 671
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 672
a=0;//     .restart local v1    # "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V
a=0;// 
a=0;//     .line 673
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 675
a=0;//     .end local v1    # "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/LoaderManagerImpl;->hasRunningLoaders()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 676
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->startPendingDeferredFragments()V
a=0;// 
a=0;//     .line 678
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method doDestroy()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 774
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
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
a=0;//     const-string v3, "Destroying Active in "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 775
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 776
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 775
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 778
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->clear()V
a=0;// 
a=0;//     .line 781
a=0;//     .end local v0    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
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
a=0;//     const-string v3, "Destroying Inactive in "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 782
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .restart local v0    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_4
a=0;// 
a=0;//     .line 783
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 782
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 785
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->clear()V
a=0;// 
a=0;//     .line 786
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method doReportNextStart()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 761
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 762
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mReportNextStart:Z
a=0;// 
a=0;//     .line 761
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 764
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method doReportStart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->reportStart()V
a=0;// 
a=0;//     .line 767
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 770
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method doRetain()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 734
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
a=0;//     const-string v4, "Retaining in "
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
a=0;//     .line 735
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 736
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "here"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 737
a=0;//     .local v0, "e":Ljava/lang/RuntimeException;
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 738
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Called doRetain when not started: "
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
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 747
a=0;//     .end local v0    # "e":Ljava/lang/RuntimeException;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 742
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     .line 743
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     .line 744
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 745
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->retain()V
a=0;// 
a=0;//     .line 744
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method doStart()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 701
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
a=0;//     const-string v4, "Starting in "
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
a=0;//     .line 702
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 703
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "here"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 704
a=0;//     .local v0, "e":Ljava/lang/RuntimeException;
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 705
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Called doStart when already started: "
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
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 716
a=0;//     .end local v0    # "e":Ljava/lang/RuntimeException;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 709
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     .line 713
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->start()V
a=0;// 
a=0;//     .line 713
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method doStop()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 719
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
a=0;//     const-string v4, "Stopping in "
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
a=0;//     .line 720
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 721
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v2, "here"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 722
a=0;//     .local v0, "e":Ljava/lang/RuntimeException;
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 723
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Called doStop when not started: "
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
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 731
a=0;//     .end local v0    # "e":Ljava/lang/RuntimeException;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 727
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     .line 728
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->stop()V
a=0;// 
a=0;//     .line 727
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 730
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 801
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 802
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "Active Loaders:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 803
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "    "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 804
a=0;//     .local v1, "innerPrefix":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 806
a=0;//     .local v2, "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 807
a=0;//     const-string v3, ": "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 808
a=0;//     invoke-virtual {v2, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 804
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 811
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "innerPrefix":Ljava/lang/String;
a=0;//     .end local v2    # "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 812
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "Inactive Loaders:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 813
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "    "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 814
a=0;//     .restart local v1    # "innerPrefix":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .restart local v0    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     .line 815
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 816
a=0;//     .restart local v2    # "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 817
a=0;//     const-string v3, ": "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 818
a=0;//     invoke-virtual {v2, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 814
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 821
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "innerPrefix":Ljava/lang/String;
a=0;//     .end local v2    # "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method finishRetain()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 750
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 751
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
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
a=0;//     const-string v3, "Finished Retaining in "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 753
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     .line 754
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 755
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->finishRetain()V
a=0;// 
a=0;//     .line 754
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 758
a=0;//     .end local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getLoader(I)Landroid/support/v4/content/Loader;
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(I)",
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<TD;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 686
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 687
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Called while creating a loader"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 690
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 691
a=0;//     .local v0, "loaderInfo":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 692
a=0;//     iget-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 693
a=0;//     iget-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     .line 697
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 695
a=0;//     :cond_1
a=0;//     iget-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 697
a=0;//     :cond_2
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasRunningLoaders()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 825
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 826
a=0;//     .local v3, "loadersRunning":Z
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 827
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v4, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v4, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 829
a=0;//     .local v2, "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     iget-boolean v4, v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-boolean v4, v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     or-int/2addr v3, v4
a=0;// 
a=0;//     .line 827
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 829
a=0;//     :cond_0
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 831
a=0;//     .end local v2    # "li":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public initLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
a=0;//     .locals 4
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(I",
a=0;//             "Landroid/os/Bundle;",
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<TD;>;)",
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<TD;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     .local p3, "callback":Landroid/support/v4/app/LoaderManager$LoaderCallbacks;, "Landroid/support/v4/app/LoaderManager$LoaderCallbacks<TD;>;"
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Called while creating a loader"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 547
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 549
a=0;//     .local v0, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
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
a=0;//     const-string v3, "initLoader in "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ": args="
a=0;// 
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
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 551
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 553
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/LoaderManagerImpl;->createAndInstallLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 554
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
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
a=0;//     const-string v3, "  Created new loader "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 560
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 562
a=0;//     iget-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     iget-object v2, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mData:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->callOnLoadFinished(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 565
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 556
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     sget-boolean v1, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
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
a=0;//     const-string v3, "  Re-using existing loader "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 557
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object p3, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method installLoader(Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "info"    # Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 508
a=0;//     iget-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iget v1, p1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 509
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 513
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->start()V
a=0;// 
a=0;//     .line 515
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public restartLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/content/Loader;
a=0;//     .locals 6
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "args"    # Landroid/os/Bundle;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<D:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(I",
a=0;//             "Landroid/os/Bundle;",
a=0;//             "Landroid/support/v4/app/LoaderManager$LoaderCallbacks",
a=0;//             "<TD;>;)",
a=0;//             "Landroid/support/v4/content/Loader",
a=0;//             "<TD;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "callback":Landroid/support/v4/app/LoaderManager$LoaderCallbacks;, "Landroid/support/v4/app/LoaderManager$LoaderCallbacks<TD;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 593
a=0;//     #v5=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mCreatingLoader:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 594
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Called while creating a loader"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 597
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 598
a=0;//     .local v1, "info":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
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
a=0;//     const-string v4, "restartLoader in "
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
a=0;//     const-string v4, ": args="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 599
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 600
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 601
a=0;//     .local v0, "inactive":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 602
a=0;//     iget-boolean v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mHaveData:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 607
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v2, :cond_2
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
a=0;//     const-string v4, "  Removing last inactive loader: "
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
a=0;//     .line 608
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mDeliveredData:Z
a=0;// 
a=0;//     .line 609
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 610
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/content/Loader;->abandon()V
a=0;// 
a=0;//     .line 611
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 646
a=0;//     .end local v0    # "inactive":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/LoaderManagerImpl;->createAndInstallLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 647
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 615
a=0;//     .restart local v0    # "inactive":Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);v2=(Boolean);
a=0;//     iget-boolean v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mStarted:Z
a=0;// 
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 619
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "  Current loader is stopped; replacing"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 620
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     invoke-virtual {v2, p1, v5}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 626
a=0;//     :cond_6
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 627
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
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
a=0;//     const-string v4, "  Removing pending loader: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 628
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->destroy()V
a=0;// 
a=0;//     .line 629
a=0;//     iput-object v5, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 631
a=0;//     :cond_8
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const-string v2, "LoaderManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "  Enqueuing as new pending loader"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 632
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/LoaderManagerImpl;->createLoader(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;);
a=0;//     iput-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     .line 634
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 640
a=0;//     :cond_a
a=0;//     sget-boolean v2, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
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
a=0;//     const-string v4, "  Making last loader inactive: "
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
a=0;//     .line 641
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, v1, Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;->mLoader:Landroid/support/v4/content/Loader;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/Loader;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/content/Loader;->abandon()V
a=0;// 
a=0;//     .line 642
a=0;//     iget-object v2, p0, Landroid/support/v4/app/LoaderManagerImpl;->mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 790
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 791
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "LoaderManager{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 792
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
a=0;//     .line 793
a=0;//     const-string v1, " in "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 795
a=0;//     const-string v1, "}}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 796
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method updateActivity(Landroid/support/v4/app/FragmentActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     iput-object p1, p0, Landroid/support/v4/app/LoaderManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 485
a=0;//     return-void
a=0;// .end method
}}
