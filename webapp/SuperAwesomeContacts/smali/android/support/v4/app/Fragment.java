package android.support.v4.app; class Fragment { void a() { int a;
a=0;// .class public Landroid/support/v4/app/Fragment;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Fragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/ComponentCallbacks;
a=0;// .implements Landroid/view/View$OnCreateContextMenuListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/Fragment$InstantiationException;,
a=0;//         Landroid/support/v4/app/Fragment$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ACTIVITY_CREATED:I = 0x2
a=0;// 
a=0;// .field static final CREATED:I = 0x1
a=0;// 
a=0;// .field static final INITIALIZING:I = 0x0
a=0;// 
a=0;// .field static final RESUMED:I = 0x5
a=0;// 
a=0;// .field static final STARTED:I = 0x4
a=0;// 
a=0;// .field static final STOPPED:I = 0x3
a=0;// 
a=0;// .field private static final sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/SimpleArrayMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;// .field mAdded:Z
a=0;// 
a=0;// .field mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;// .field mArguments:Landroid/os/Bundle;
a=0;// 
a=0;// .field mBackStackNesting:I
a=0;// 
a=0;// .field mCalled:Z
a=0;// 
a=0;// .field mCheckedForLoaderManager:Z
a=0;// 
a=0;// .field mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field mContainerId:I
a=0;// 
a=0;// .field mDeferStart:Z
a=0;// 
a=0;// .field mDetached:Z
a=0;// 
a=0;// .field mFragmentId:I
a=0;// 
a=0;// .field mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field mFromLayout:Z
a=0;// 
a=0;// .field mHasMenu:Z
a=0;// 
a=0;// .field mHidden:Z
a=0;// 
a=0;// .field mInLayout:Z
a=0;// 
a=0;// .field mIndex:I
a=0;// 
a=0;// .field mInnerView:Landroid/view/View;
a=0;// 
a=0;// .field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;// .field mLoadersStarted:Z
a=0;// 
a=0;// .field mMenuVisible:Z
a=0;// 
a=0;// .field mNextAnim:I
a=0;// 
a=0;// .field mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field mRemoving:Z
a=0;// 
a=0;// .field mRestored:Z
a=0;// 
a=0;// .field mResumed:Z
a=0;// 
a=0;// .field mRetainInstance:Z
a=0;// 
a=0;// .field mRetaining:Z
a=0;// 
a=0;// .field mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;// .field mSavedViewState:Landroid/util/SparseArray;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mState:I
a=0;// 
a=0;// .field mStateAfterAnimating:I
a=0;// 
a=0;// .field mTag:Ljava/lang/String;
a=0;// 
a=0;// .field mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field mTargetIndex:I
a=0;// 
a=0;// .field mTargetRequestCode:I
a=0;// 
a=0;// .field mUserVisibleHint:Z
a=0;// 
a=0;// .field mView:Landroid/view/View;
a=0;// 
a=0;// .field mWho:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     new-instance v0, Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     sput-object v0, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 371
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 176
a=0;//     #p0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     .line 192
a=0;//     iput v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     .line 204
a=0;//     iput v1, p0, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     .line 275
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     .line 297
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     .line 372
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static instantiate(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fname"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fname"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     :try_start_0
a=0;//     sget-object v3, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 399
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 401
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 402
a=0;//     sget-object v3, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v3, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 404
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 405
a=0;//     .local v2, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 406
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 407
a=0;//     iput-object p2, v2, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     return-object v2
a=0;// 
a=0;//     .line 410
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 411
a=0;//     .local v1, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Unable to instantiate fragment "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ": make sure class name exists, is public, and has an"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " empty constructor that is public"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 414
a=0;//     .end local v1    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 415
a=0;//     .local v1, "e":Ljava/lang/InstantiationException;
a=0;//     #v1=(Reference,Ljava/lang/InstantiationException;);
a=0;//     new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Unable to instantiate fragment "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ": make sure class name exists, is public, and has an"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " empty constructor that is public"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 418
a=0;//     .end local v1    # "e":Ljava/lang/InstantiationException;
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 419
a=0;//     .local v1, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v3, Landroid/support/v4/app/Fragment$InstantiationException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Unable to instantiate fragment "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ": make sure class name exists, is public, and has an"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " empty constructor that is public"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v1}, Landroid/support/v4/app/Fragment$InstantiationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment$InstantiationException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method static isSupportFragmentClass(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fname"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     :try_start_0
a=0;//     sget-object v2, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 438
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 439
a=0;//     sget-object v2, Landroid/support/v4/app/Fragment;->sClassMap:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 441
a=0;//     :cond_0
a=0;//     const-class v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 443
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 442
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 443
a=0;//     .local v1, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1377
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mFragmentId=#"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1378
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1379
a=0;//     const-string v0, " mContainerId=#"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1380
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1381
a=0;//     const-string v0, " mTag="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1382
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mState="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 1383
a=0;//     const-string v0, " mIndex="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 1384
a=0;//     const-string v0, " mWho="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1385
a=0;//     const-string v0, " mBackStackNesting="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     .line 1386
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mAdded="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1387
a=0;//     const-string v0, " mRemoving="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1388
a=0;//     const-string v0, " mResumed="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1389
a=0;//     const-string v0, " mFromLayout="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1390
a=0;//     const-string v0, " mInLayout="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 1391
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mHidden="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1392
a=0;//     const-string v0, " mDetached="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1393
a=0;//     const-string v0, " mMenuVisible="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1394
a=0;//     const-string v0, " mHasMenu="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 1395
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mRetainInstance="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1396
a=0;//     const-string v0, " mRetaining="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 1397
a=0;//     const-string v0, " mUserVisibleHint="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 1398
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1399
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mFragmentManager="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1400
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1402
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1403
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mActivity="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1404
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1406
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1407
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mParentFragment="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1408
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1410
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1411
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mArguments="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1413
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1414
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mSavedFragmentState="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1415
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1417
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1418
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mSavedViewState="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1419
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1421
a=0;//     :cond_5
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 1422
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mTarget="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1423
a=0;//     const-string v0, " mTargetRequestCode="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1424
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     .line 1426
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 1427
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mNextAnim="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     .line 1429
a=0;//     :cond_7
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 1430
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mContainer="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1432
a=0;//     :cond_8
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 1433
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mView="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1435
a=0;//     :cond_9
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 1436
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mInnerView="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1438
a=0;//     :cond_a
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 1439
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mAnimatingAway="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1440
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mStateAfterAnimating="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1441
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V
a=0;// 
a=0;//     .line 1443
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 1444
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Loader Manager:"
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1445
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
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
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1447
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 1448
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Child "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1449
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
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
a=0;//     invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1451
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method findFragmentByWho(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1454
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1460
a=0;//     .end local p0    # "this":Landroid/support/v4/app/Fragment;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 1457
a=0;//     .restart local p0    # "this":Landroid/support/v4/app/Fragment;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1458
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentByWho(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1460
a=0;//     :cond_1
a=0;//     const/4 p0, 0x0
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getArguments()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getChildFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 660
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->instantiateChildFragmentManager()V
a=0;// 
a=0;//     .line 662
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 663
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
a=0;// 
a=0;//     .line 672
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 664
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 665
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 666
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 667
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 668
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 669
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 652
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 917
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLoaderManager()Landroid/support/v4/app/LoaderManager;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 861
a=0;//     #v3=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 862
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 869
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 864
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 865
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " not attached to Activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 867
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 868
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 869
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final getParentFragment()Landroid/support/v4/app/Fragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getResources()Landroid/content/res/Resources;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 602
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 603
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " not attached to Activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getRetainInstance()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getString(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;//     .param p2, "formatArgs"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getTag()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 520
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getTargetFragment()Landroid/support/v4/app/Fragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getTargetRequestCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final getText(I)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUserVisibleHint()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 854
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getView()Landroid/view/View;
a=0;//     .locals 1
a=0;//     .annotation build Landroid/support/annotation/Nullable;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1044
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final hasOptionsMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 750
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 484
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method initState()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1194
a=0;//     #v1=(Null);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     .line 1195
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     .line 1196
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1197
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     .line 1198
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
a=0;// 
a=0;//     .line 1199
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     .line 1200
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 1201
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRestored:Z
a=0;// 
a=0;//     .line 1202
a=0;//     iput v1, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     .line 1203
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 1204
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 1205
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 1206
a=0;//     iput v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     .line 1207
a=0;//     iput v1, p0, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     .line 1208
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 1209
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     .line 1210
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     .line 1211
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     .line 1212
a=0;//     iput-object v2, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 1213
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 1214
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 1215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method instantiateChildFragmentManager()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1464
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 1465
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     new-instance v2, Landroid/support/v4/app/Fragment$1;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/app/Fragment$1;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/app/Fragment$1;-><init>(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/Fragment$1;);
a=0;//     invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1474
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final isAdded()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 687
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final isDetached()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 696
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isHidden()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 745
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method final isInBackStack()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final isInLayout()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isMenuVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 755
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isRemoving()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isResumed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 724
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mResumed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 1061
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1062
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 0
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 909
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAttach(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 971
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 972
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1132
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onContextItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1364
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 996
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 997
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;//     .param p1, "transit"    # I
a=0;//     .param p2, "enter"    # Z
a=0;//     .param p3, "nextAnim"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 978
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/view/ContextMenu;
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;//     .param p3, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1318
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
a=0;// 
a=0;//     .line 1319
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;//     .param p2, "inflater"    # Landroid/view/MenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1239
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 1020
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1175
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1178
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1179
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 1180
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 1182
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1183
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 1185
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyOptionsMenu()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1266
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1167
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetach()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1222
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onHiddenChanged(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "hidden"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 963
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 964
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLowMemory()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1154
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1287
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onOptionsMenuClosed(Landroid/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1298
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1141
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1142
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareOptionsMenu(Landroid/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1256
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1106
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1085
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1087
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1088
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 1089
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1090
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 1091
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 1093
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1094
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
a=0;// 
a=0;//     .line 1097
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1150
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 1034
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewStateRestored(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 1076
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1077
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performActivityCreated(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1508
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1509
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 1511
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1512
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1513
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1514
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onActivityCreated()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1517
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1518
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
a=0;// 
a=0;//     .line 1520
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1559
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 1560
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1561
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 1563
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performContextItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1626
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1627
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onContextItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1636
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1630
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1631
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1636
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method performCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1477
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1478
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 1480
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1481
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1482
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1483
a=0;//     new-instance v1, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Fragment "
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
a=0;//     const-string v3, " did not call through to super.onCreate()"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1486
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 1487
a=0;//     const-string v1, "android:support:fragments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1489
a=0;//     .local v0, "p":Landroid/os/Parcelable;
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1490
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1491
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->instantiateChildFragmentManager()V
a=0;// 
a=0;//     .line 1493
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 1494
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
a=0;// 
a=0;//     .line 1497
a=0;//     .end local v0    # "p":Landroid/os/Parcelable;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;//     .param p2, "inflater"    # Landroid/view/MenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1582
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1583
a=0;//     .local v0, "show":Z
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1584
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1585
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1586
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
a=0;// 
a=0;//     .line 1588
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1589
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 1592
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "inflater"    # Landroid/view/LayoutInflater;
a=0;//     .param p2, "container"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1501
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1502
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 1504
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method performDestroy()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1720
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1721
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V
a=0;// 
a=0;//     .line 1723
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1724
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V
a=0;// 
a=0;//     .line 1725
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1726
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onDestroy()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1729
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performDestroyView()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1705
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1706
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroyView()V
a=0;// 
a=0;//     .line 1708
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1709
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V
a=0;// 
a=0;//     .line 1710
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1711
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onDestroyView()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1714
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1715
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doReportNextStart()V
a=0;// 
a=0;//     .line 1717
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performLowMemory()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1566
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onLowMemory()V
a=0;// 
a=0;//     .line 1567
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1568
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V
a=0;// 
a=0;//     .line 1570
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1610
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1611
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1612
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1622
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1616
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1617
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1622
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method performOptionsMenuClosed(Landroid/view/Menu;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1640
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1641
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1642
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsMenuClosed(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 1644
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1645
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 1648
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performPause()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1661
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1662
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V
a=0;// 
a=0;//     .line 1664
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1665
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onPause()V
a=0;// 
a=0;//     .line 1666
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1667
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onPause()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1670
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1596
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1597
a=0;//     .local v0, "show":Z
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1598
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1599
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1600
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onPrepareOptionsMenu(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 1602
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1603
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 1606
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method performReallyStop()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1685
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1686
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V
a=0;// 
a=0;//     .line 1688
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1689
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 1690
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1691
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 1692
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->mLoadersStarted:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 1694
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1695
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1696
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V
a=0;// 
a=0;//     .line 1702
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1698
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method performResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1542
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1543
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 1544
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 1546
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1547
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onResume()V
a=0;// 
a=0;//     .line 1548
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1549
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onResume()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1552
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1553
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
a=0;// 
a=0;//     .line 1554
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 1556
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1651
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1652
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1653
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1654
a=0;//     .local v0, "p":Landroid/os/Parcelable;
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1655
a=0;//     const-string v1, "android:support:fragments"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1658
a=0;//     .end local v0    # "p":Landroid/os/Parcelable;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performStart()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1523
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1524
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 1525
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 1527
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1528
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onStart()V
a=0;// 
a=0;//     .line 1529
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1530
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onStart()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1533
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1534
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
a=0;// 
a=0;//     .line 1536
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1537
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V
a=0;// 
a=0;//     .line 1539
a=0;//     :cond_3
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method performStop()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1673
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1674
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V
a=0;// 
a=0;//     .line 1676
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1677
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onStop()V
a=0;// 
a=0;//     .line 1678
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1679
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onStop()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1682
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public registerForContextMenu(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1332
a=0;//     invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V
a=0;// 
a=0;//     .line 1333
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final restoreViewState(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 450
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 452
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 453
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onViewStateRestored(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 454
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 455
a=0;//     new-instance v0, Landroid/support/v4/app/SuperNotCalledException;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " did not call through to super.onViewStateRestored()"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/SuperNotCalledException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/SuperNotCalledException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 458
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setArguments(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "args"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 532
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Fragment already active"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 534
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/Fragment;->mArguments:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 535
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHasOptionsMenu(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "hasMenu"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 803
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     .line 804
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->supportInvalidateOptionsMenu()V
a=0;// 
a=0;//     .line 808
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final setIndex(ILandroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "parent"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     iput p1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     .line 462
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p2, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     .line 467
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 465
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "android:fragment:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setInitialSavedState(Landroid/support/v4/app/Fragment$SavedState;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Fragment already active"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 557
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 559
a=0;//     return-void
a=0;// 
a=0;//     .line 557
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setMenuVisibility(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menuVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 821
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     .line 822
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isAdded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->isHidden()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->supportInvalidateOptionsMenu()V
a=0;// 
a=0;//     .line 826
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRetainInstance(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "retain"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 784
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Can\'t retain fragements that are nested in other fragments"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 787
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     .line 788
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTargetFragment(Landroid/support/v4/app/Fragment;I)V
a=0;//     .locals 0
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "requestCode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     iput-object p1, p0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 574
a=0;//     iput p2, p0, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     .line 575
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUserVisibleHint(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "isVisibleToUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 842
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 843
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentManagerImpl;->performPendingDeferredStart(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 845
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     .line 846
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->mDeferStart:Z
a=0;// 
a=0;//     .line 847
a=0;//     return-void
a=0;// 
a=0;//     .line 846
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startActivity(Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 877
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 878
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " not attached to Activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 880
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, p0, p1, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 881
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityForResult(Landroid/content/Intent;I)V
a=0;//     .locals 3
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "requestCode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 888
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 889
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment "
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
a=0;//     const-string v2, " not attached to Activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 891
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 892
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 491
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 492
a=0;//     const-string v1, " #"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 493
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 496
a=0;//     const-string v1, " id=0x"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 497
a=0;//     iget v1, p0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 499
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 500
a=0;//     const-string v1, " "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 501
a=0;//     iget-object v1, p0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 503
a=0;//     :cond_2
a=0;//     const/16 v1, 0x7d
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public unregisterForContextMenu(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1343
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V
a=0;// 
a=0;//     .line 1344
a=0;//     return-void
a=0;// .end method
}}
