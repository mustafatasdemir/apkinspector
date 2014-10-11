package android.support.v4.app; class FragmentManagerImpl { void a() { int a;
a=0;// .class final Landroid/support/v4/app/FragmentManagerImpl;
a=0;// .super Landroid/support/v4/app/FragmentManager;
a=0;// .source "FragmentManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ACCELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final ACCELERATE_QUINT:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final ANIM_DUR:I = 0xdc
a=0;// 
a=0;// .field public static final ANIM_STYLE_CLOSE_ENTER:I = 0x3
a=0;// 
a=0;// .field public static final ANIM_STYLE_CLOSE_EXIT:I = 0x4
a=0;// 
a=0;// .field public static final ANIM_STYLE_FADE_ENTER:I = 0x5
a=0;// 
a=0;// .field public static final ANIM_STYLE_FADE_EXIT:I = 0x6
a=0;// 
a=0;// .field public static final ANIM_STYLE_OPEN_ENTER:I = 0x1
a=0;// 
a=0;// .field public static final ANIM_STYLE_OPEN_EXIT:I = 0x2
a=0;// 
a=0;// .field static DEBUG:Z = false
a=0;// 
a=0;// .field static final DECELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final DECELERATE_QUINT:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final HONEYCOMB:Z
a=0;// 
a=0;// .field static final TAG:Ljava/lang/String; = "FragmentManager"
a=0;// 
a=0;// .field static final TARGET_REQUEST_CODE_STATE_TAG:Ljava/lang/String; = "android:target_req_state"
a=0;// 
a=0;// .field static final TARGET_STATE_TAG:Ljava/lang/String; = "android:target_state"
a=0;// 
a=0;// .field static final USER_VISIBLE_HINT_TAG:Ljava/lang/String; = "android:user_visible_hint"
a=0;// 
a=0;// .field static final VIEW_STATE_TAG:Ljava/lang/String; = "android:view_state"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActive:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;// .field mAdded:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mAvailIndices:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mBackStack:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/BackStackRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mBackStackIndices:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/BackStackRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;// .field mCreatedMenus:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mCurState:I
a=0;// 
a=0;// .field mDestroyed:Z
a=0;// 
a=0;// .field mExecCommit:Ljava/lang/Runnable;
a=0;// 
a=0;// .field mExecutingActions:Z
a=0;// 
a=0;// .field mHavePendingDeferredStart:Z
a=0;// 
a=0;// .field mNeedMenuInvalidate:Z
a=0;// 
a=0;// .field mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;// .field mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// .field mPendingActions:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/Runnable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mStateArray:Landroid/util/SparseArray;
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
a=0;// .field mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;// .field mStateSaved:Z
a=0;// 
a=0;// .field mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/high16 v4, 0x40200000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v3, 0x3fc00000
a=0;// 
a=0;//     .line 406
a=0;//     #v3=(Integer);
a=0;//     sput-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     .line 409
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->HONEYCOMB:Z
a=0;// 
a=0;//     .line 742
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentManagerImpl;->DECELERATE_QUINT:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 743
a=0;//     new-instance v0, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentManagerImpl;->DECELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 744
a=0;//     new-instance v0, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v0, v4}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentManagerImpl;->ACCELERATE_QUINT:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 745
a=0;//     new-instance v0, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v0, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/app/FragmentManagerImpl;->ACCELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 405
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentManager;-><init>()V
a=0;// 
a=0;//     .line 432
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     .line 444
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 445
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 447
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentManagerImpl$1;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecCommit:Ljava/lang/Runnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkStateLoss()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1359
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1360
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Can not perform this action after onSaveInstanceState"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1363
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1364
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Can not perform this action inside of "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
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
a=0;//     .line 1367
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static makeFadeAnimation(Landroid/content/Context;FF)Landroid/view/animation/Animation;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "start"    # F
a=0;//     .param p2, "end"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 766
a=0;//     .local v0, "anim":Landroid/view/animation/AlphaAnimation;
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/FragmentManagerImpl;->DECELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 767
a=0;//     const-wide/16 v1, 0xdc
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 768
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static makeOpenCloseAnimation(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
a=0;//     .locals 11
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "startScale"    # F
a=0;//     .param p2, "endScale"    # F
a=0;//     .param p3, "startAlpha"    # F
a=0;//     .param p4, "endAlpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 751
a=0;//     new-instance v10, Landroid/view/animation/AnimationSet;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/view/animation/AnimationSet;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v10, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V
a=0;// 
a=0;//     .line 752
a=0;//     .local v10, "set":Landroid/view/animation/AnimationSet;
a=0;//     #v10=(Reference,Landroid/view/animation/AnimationSet;);
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/high16 v6, 0x3f000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/high16 v8, 0x3f000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     .line 754
a=0;//     .local v0, "scale":Landroid/view/animation/ScaleAnimation;
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/FragmentManagerImpl;->DECELERATE_QUINT:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 755
a=0;//     const-wide/16 v1, 0xdc
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 756
a=0;//     invoke-virtual {v10, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 757
a=0;//     new-instance v9, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-direct {v9, p3, p4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     .line 758
a=0;//     .local v9, "alpha":Landroid/view/animation/AlphaAnimation;
a=0;//     #v9=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     sget-object v1, Landroid/support/v4/app/FragmentManagerImpl;->DECELERATE_CUBIC:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v9, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 759
a=0;//     const-wide/16 v1, 0xdc
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {v9, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 760
a=0;//     invoke-virtual {v10, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 761
a=0;//     return-object v10
a=0;// .end method
a=0;// 
a=0;// .method public static reverseTransit(I)I
a=0;//     .locals 1
a=0;//     .param p0, "transit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2053
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2054
a=0;//     .local v0, "rev":I
a=0;//     #v0=(Null);
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     .line 2065
a=0;//     :goto_0
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// 
a=0;//     .line 2056
a=0;//     :sswitch_0
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x2002
a=0;// 
a=0;//     .line 2057
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2059
a=0;//     :sswitch_1
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x1001
a=0;// 
a=0;//     .line 2060
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2062
a=0;//     :sswitch_2
a=0;//     #v0=(Null);
a=0;//     const/16 v0, 0x1003
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2054
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1001 -> :sswitch_0
a=0;//         0x1003 -> :sswitch_2
a=0;//         0x2002 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private throwException(Ljava/lang/RuntimeException;)V
a=0;//     .locals 7
a=0;//     .param p1, "ex"    # Ljava/lang/RuntimeException;
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 456
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     const-string v4, "Activity state:"
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 457
a=0;//     new-instance v1, Landroid/support/v4/util/LogWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/util/LogWriter;);
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v1, v3}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 458
a=0;//     .local v1, "logw":Landroid/support/v4/util/LogWriter;
a=0;//     #v1=(Reference,Landroid/support/v4/util/LogWriter;);
a=0;//     new-instance v2, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 459
a=0;//     .local v2, "pw":Ljava/io/PrintWriter;
a=0;//     #v2=(Reference,Ljava/io/PrintWriter;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 461
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     const-string v4, "  "
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5, v2, v6}, Landroid/support/v4/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 472
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     throw p1
a=0;// 
a=0;//     .line 462
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 463
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     const-string v4, "Failed dumping state"
a=0;// 
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v3, "  "
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v4, v2, v5}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 468
a=0;//     :catch_1
a=0;//     #v4=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 469
a=0;//     .restart local v0    # "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     const-string v4, "Failed dumping state"
a=0;// 
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static transitToStyleIndex(IZ)I
a=0;//     .locals 1
a=0;//     .param p0, "transit"    # I
a=0;//     .param p1, "enter"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2077
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 2078
a=0;//     .local v0, "animAttr":I
a=0;//     #v0=(Byte);
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     .line 2089
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 2080
a=0;//     :sswitch_0
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2081
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2080
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2083
a=0;//     :sswitch_1
a=0;//     #v0=(Byte);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 2084
a=0;//     :goto_2
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2083
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2086
a=0;//     :sswitch_2
a=0;//     #v0=(Byte);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 2078
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1001 -> :sswitch_0
a=0;//         0x1003 -> :sswitch_2
a=0;//         0x2002 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method addBackStackState(Landroid/support/v4/app/BackStackRecord;)V
a=0;//     .locals 1
a=0;//     .param p1, "state"    # Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1516
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1517
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1519
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1520
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->reportBackStackChanged()V
a=0;// 
a=0;//     .line 1521
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;//     .locals 4
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "moveToStateNow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1185
a=0;//     #v3=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1186
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1188
a=0;//     :cond_0
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "add: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1189
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->makeActive(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1190
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1191
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1192
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment already added: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 1194
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1195
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1196
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     .line 1197
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1198
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1200
a=0;//     :cond_3
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 1201
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1204
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 552
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 554
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 555
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public allocBackStackIndex(Landroid/support/v4/app/BackStackRecord;)I
a=0;//     .locals 5
a=0;//     .param p1, "bse"    # Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1396
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 1397
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_3
a=0;// 
a=0;//     .line 1398
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1399
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1401
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1402
a=0;//     .local v0, "index":I
a=0;//     #v0=(Integer);
a=0;//     sget-boolean v2, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v2, "FragmentManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Setting back stack index "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " to "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1403
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1404
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 1410
a=0;//     .end local v0    # "index":I
a=0;//     .local v1, "index":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 1407
a=0;//     .end local v1    # "index":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1408
a=0;//     .restart local v0    # "index":I
a=0;//     #v0=(Integer);
a=0;//     sget-boolean v2, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const-string v2, "FragmentManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Adding back stack index "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " with "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1409
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1410
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .end local v0    # "index":I
a=0;//     .restart local v1    # "index":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1412
a=0;//     .end local v1    # "index":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;//     .param p1, "activity"    # Landroid/support/v4/app/FragmentActivity;
a=0;//     .param p2, "container"    # Landroid/support/v4/app/FragmentContainer;
a=0;//     .param p3, "parent"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1884
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Already attached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1885
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 1886
a=0;//     iput-object p2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     .line 1887
a=0;//     iput-object p3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1888
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public attachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transition"    # I
a=0;//     .param p3, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1281
a=0;//     #v5=(Null);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "attach: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1282
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1283
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     .line 1284
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 1285
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1286
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1288
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1289
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Fragment already added: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 1291
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "add from attach: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1292
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1293
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1294
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1295
a=0;//     iput-boolean v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1297
a=0;//     :cond_4
a=0;//     iget v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1300
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     new-instance v0, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/BackStackRecord;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/BackStackRecord;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public detachFragment(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transition"    # I
a=0;//     .param p3, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1262
a=0;//     #v2=(One);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "detach: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1263
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1264
a=0;//     iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     .line 1265
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1267
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1268
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "remove from detach: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1269
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1271
a=0;//     :cond_2
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1272
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1274
a=0;//     :cond_3
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     .line 1275
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1278
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchActivityCreated()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1900
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1901
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1902
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 3
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1945
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1946
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 1947
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1948
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1949
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->performConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 1946
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1953
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchContextItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 3
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2028
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 2029
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 2030
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 2031
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2032
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->performContextItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2033
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2038
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2029
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Integer);v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2038
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public dispatchCreate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1895
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1896
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1897
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;//     .locals 5
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;//     .param p2, "inflater"    # Landroid/view/MenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1967
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1968
a=0;//     .local v3, "show":Z
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1969
a=0;//     .local v2, "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1970
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Reference,Ljava/util/ArrayList;);v3=(Boolean);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_2
a=0;// 
a=0;//     .line 1971
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1972
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1973
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/Fragment;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1974
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1975
a=0;//     #v3=(One);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1976
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v2    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1978
a=0;//     .restart local v2    # "newMenus":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1970
a=0;//     :cond_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1984
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 1985
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_5
a=0;// 
a=0;//     .line 1986
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1987
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 1988
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->onDestroyOptionsMenu()V
a=0;// 
a=0;//     .line 1985
a=0;//     :cond_4
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1993
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1995
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public dispatchDestroy()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1936
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     .line 1937
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 1938
a=0;//     invoke-virtual {p0, v2, v2}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1939
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 1940
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     .line 1941
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1942
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchDestroyView()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1932
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1933
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchLowMemory()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1956
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1957
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 1958
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1959
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1960
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->performLowMemory()V
a=0;// 
a=0;//     .line 1957
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1964
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 3
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2014
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 2015
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 2016
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 2017
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2018
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->performOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2019
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2024
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2015
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v1=(Integer);v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2024
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public dispatchOptionsMenuClosed(Landroid/view/Menu;)V
a=0;//     .locals 3
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2042
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 2043
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 2044
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 2045
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2046
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->performOptionsMenuClosed(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 2043
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2050
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1915
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1916
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 4
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1999
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2000
a=0;//     .local v2, "show":Z
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 2001
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Boolean);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 2002
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 2003
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2004
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->performPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 2005
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2001
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2010
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public dispatchReallyStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1928
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1929
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1910
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1911
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1912
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchStart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1905
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1906
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1907
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1922
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1924
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IZ)V
a=0;// 
a=0;//     .line 1925
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 631
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "    "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 634
a=0;//     .local v4, "innerPrefix":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 635
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 636
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 637
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Active Fragments in "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 638
a=0;//     invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 639
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 640
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     if-ge v3, v0, :cond_1
a=0;// 
a=0;//     .line 641
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 642
a=0;//     .local v2, "f":Landroid/support/v4/app/Fragment;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 643
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 644
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 645
a=0;//     invoke-virtual {v2, v4, p2, p3, p4}, Landroid/support/v4/app/Fragment;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_0
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 651
a=0;//     .end local v0    # "N":I
a=0;//     .end local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 652
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 653
a=0;//     .restart local v0    # "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 654
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Added Fragments:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 655
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v0, :cond_2
a=0;// 
a=0;//     .line 656
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 657
a=0;//     .restart local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 658
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 655
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 663
a=0;//     .end local v0    # "N":I
a=0;//     .end local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 664
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 665
a=0;//     .restart local v0    # "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Fragments Created Menus:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 667
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v0, :cond_3
a=0;// 
a=0;//     .line 668
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCreatedMenus:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 669
a=0;//     .restart local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 670
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 667
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 675
a=0;//     .end local v0    # "N":I
a=0;//     .end local v2    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 676
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 677
a=0;//     .restart local v0    # "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     .line 678
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Back Stack:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 679
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     if-ge v3, v0, :cond_4
a=0;// 
a=0;//     .line 680
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .line 681
a=0;//     .local v1, "bs":Landroid/support/v4/app/BackStackRecord;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 682
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/BackStackRecord;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 683
a=0;//     invoke-virtual {v1, v4, p2, p3, p4}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 679
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 688
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "bs":Landroid/support/v4/app/BackStackRecord;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 689
a=0;//     :try_start_0
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 690
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 691
a=0;//     .restart local v0    # "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     .line 692
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Back Stack Indices:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 693
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_4
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v0, :cond_5
a=0;// 
a=0;//     .line 694
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .line 695
a=0;//     .restart local v1    # "bs":Landroid/support/v4/app/BackStackRecord;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 696
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 693
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 701
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "bs":Landroid/support/v4/app/BackStackRecord;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_6
a=0;// 
a=0;//     .line 702
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "mAvailBackStackIndices: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 703
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 705
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 707
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 708
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 709
a=0;//     .restart local v0    # "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     .line 710
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "Pending Actions:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 711
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_5
a=0;//     #v3=(Integer);v5=(Conflicted);
a=0;//     if-ge v3, v0, :cond_7
a=0;// 
a=0;//     .line 712
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 713
a=0;//     .local v5, "r":Ljava/lang/Runnable;
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  #"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 714
a=0;//     const-string v6, ": "
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 711
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 705
a=0;//     .end local v0    # "N":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "r":Ljava/lang/Runnable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Uninit);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     :try_start_1
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 719
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "FragmentManager misc state:"
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 720
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mActivity="
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 721
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mContainer="
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 722
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 723
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mParent="
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 725
a=0;//     :cond_8
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mCurState="
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V
a=0;// 
a=0;//     .line 726
a=0;//     const-string v6, " mStateSaved="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     .line 727
a=0;//     const-string v6, " mDestroyed="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-boolean v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 728
a=0;//     iget-boolean v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     .line 729
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mNeedMenuInvalidate="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 730
a=0;//     iget-boolean v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 732
a=0;//     :cond_9
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     .line 733
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mNoTransactionsBecause="
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 734
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNoTransactionsBecause:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 736
a=0;//     :cond_a
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_b
a=0;// 
a=0;//     .line 737
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v6, "  mAvailIndices: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 738
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 740
a=0;//     :cond_b
a=0;//     #v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public enqueueAction(Ljava/lang/Runnable;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "action"    # Ljava/lang/Runnable;
a=0;//     .param p2, "allowStateLoss"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1377
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 1378
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentManagerImpl;->checkStateLoss()V
a=0;// 
a=0;//     .line 1380
a=0;//     :cond_0
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 1381
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1382
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Activity has been destroyed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1392
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 1384
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1385
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1387
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1388
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 1389
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecCommit:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1390
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecCommit:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1392
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1393
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public execPendingActions()Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1455
a=0;//     #v7=(Null);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecutingActions:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 1456
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v6, "Recursive entry to executePendingTransactions"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1459
a=0;//     :cond_0
a=0;//     #v5=(Boolean);v6=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Looper;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v6, v6, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-eq v5, v6, :cond_1
a=0;// 
a=0;//     .line 1460
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v6, "Must be called from main thread of process"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 1463
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1468
a=0;//     .local v0, "didSomething":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 1469
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 1470
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 1491
a=0;//     iget-boolean v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mHavePendingDeferredStart:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_9
a=0;// 
a=0;//     .line 1492
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1493
a=0;//     .local v3, "loadersRunning":Z
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Boolean);v5=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v2, v5, :cond_8
a=0;// 
a=0;//     .line 1494
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1495
a=0;//     .local v1, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v5, v1, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 1496
a=0;//     iget-object v5, v1, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/app/LoaderManagerImpl;->hasRunningLoaders()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v3, v5
a=0;// 
a=0;//     .line 1493
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1473
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "loadersRunning":Z
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Conflicted);v3=(Uninit);v5=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1474
a=0;//     .local v4, "numActions":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v5, v4, :cond_6
a=0;// 
a=0;//     .line 1475
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);
a=0;//     new-array v5, v4, [Ljava/lang/Runnable;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Runnable;);
a=0;//     iput-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 1477
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 1478
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mPendingActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1479
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecCommit:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1480
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1482
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecutingActions:Z
a=0;// 
a=0;//     .line 1483
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v4, :cond_7
a=0;// 
a=0;//     .line 1484
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Runnable;);
a=0;//     aget-object v5, v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v5}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     .line 1485
a=0;//     iget-object v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mTmpActions:[Ljava/lang/Runnable;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Runnable;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v6, v5, v2
a=0;// 
a=0;//     .line 1483
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1480
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "numActions":I
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v5
a=0;// 
a=0;//     :try_start_2
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 1487
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "numActions":I
a=0;//     :cond_7
a=0;//     #v2=(Integer);v4=(Integer);v5=(Conflicted);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecutingActions:Z
a=0;// 
a=0;//     .line 1488
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1489
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1499
a=0;//     .end local v4    # "numActions":I
a=0;//     .restart local v3    # "loadersRunning":Z
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Integer);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     .line 1500
a=0;//     iput-boolean v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mHavePendingDeferredStart:Z
a=0;// 
a=0;//     .line 1501
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->startPendingDeferredFragments()V
a=0;// 
a=0;//     .line 1504
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "loadersRunning":Z
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public executePendingTransactions()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1303
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 1305
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     .line 1306
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1307
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_1
a=0;// 
a=0;//     .line 1321
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1305
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1312
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 1314
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     .line 1315
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1316
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, p1, :cond_0
a=0;// 
a=0;//     .line 1314
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1321
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1325
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 1327
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_2
a=0;// 
a=0;//     .line 1328
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1329
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1343
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1327
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1334
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     .line 1336
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     .line 1337
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1338
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1336
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1343
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public findFragmentByWho(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 3
a=0;//     .param p1, "who"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1347
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 1348
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 1349
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1350
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->findFragmentByWho(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1355
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1348
a=0;//     .restart local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Reference,Ljava/util/ArrayList;);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1355
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public freeBackStackIndex(I)V
a=0;//     .locals 3
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1441
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 1442
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1443
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1444
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1446
a=0;//     :cond_0
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Freeing back stack index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1447
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1448
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 1449
a=0;//     return-void
a=0;// 
a=0;//     .line 1448
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/FragmentManager$BackStackEntry;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBackStackEntryCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 541
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;//     .locals 5
a=0;//     .param p1, "bundle"    # Landroid/os/Bundle;
a=0;//     .param p2, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 575
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 576
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 577
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 588
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 579
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_2
a=0;// 
a=0;//     .line 580
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Fragment no longer exists for key "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ": index "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 583
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 584
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Fragment no longer exists for key "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ": index "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getFragments()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hideFragment(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 5
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transition"    # I
a=0;//     .param p3, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1224
a=0;//     #v4=(One);
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "hide: "
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
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1225
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 1226
a=0;//     iput-boolean v4, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     .line 1227
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1228
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v1, p3}, Landroid/support/v4/app/FragmentManagerImpl;->loadAnimation(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1230
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1231
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1233
a=0;//     :cond_1
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1235
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1236
a=0;//     iput-boolean v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1238
a=0;//     :cond_3
a=0;//     invoke-virtual {p1, v4}, Landroid/support/v4/app/Fragment;->onHiddenChanged(Z)V
a=0;// 
a=0;//     .line 1240
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isDestroyed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method loadAnimation(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;//     .locals 9
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transit"    # I
a=0;//     .param p3, "enter"    # Z
a=0;//     .param p4, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const v8, 0x3f79999a
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/high16 v6, 0x3f800000
a=0;// 
a=0;//     .line 773
a=0;//     #v6=(Integer);
a=0;//     iget v4, p1, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, p2, p3, v4}, Landroid/support/v4/app/Fragment;->onCreateAnimation(IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 775
a=0;//     .local v1, "animObj":Landroid/view/animation/Animation;
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 827
a=0;//     .end local v1    # "animObj":Landroid/view/animation/Animation;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Landroid/support/v4/app/FragmentActivity;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 779
a=0;//     .restart local v1    # "animObj":Landroid/view/animation/Animation;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Null);v4=(Integer);v5=(Uninit);
a=0;//     iget v4, p1, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget v5, p1, Landroid/support/v4/app/Fragment;->mNextAnim:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 781
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 782
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 786
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 787
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 790
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-static {p2, p3}, Landroid/support/v4/app/FragmentManagerImpl;->transitToStyleIndex(IZ)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 791
a=0;//     .local v2, "styleIndex":I
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_3
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 792
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 795
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 810
a=0;//     if-nez p4, :cond_4
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 811
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget p4, v4, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I
a=0;// 
a=0;//     .line 813
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     if-nez p4, :cond_5
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 814
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 797
a=0;//     :pswitch_0
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const/high16 v4, 0x3f900000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4, v6, v7, v6}, Landroid/support/v4/app/FragmentManagerImpl;->makeOpenCloseAnimation(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 799
a=0;//     :pswitch_1
a=0;//     #v3=(Null);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v3, v6, v8, v6, v7}, Landroid/support/v4/app/FragmentManagerImpl;->makeOpenCloseAnimation(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 801
a=0;//     :pswitch_2
a=0;//     #v3=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v3, v8, v6, v7, v6}, Landroid/support/v4/app/FragmentManagerImpl;->makeOpenCloseAnimation(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 803
a=0;//     :pswitch_3
a=0;//     #v3=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const v4, 0x3f89999a
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v6, v4, v6, v7}, Landroid/support/v4/app/FragmentManagerImpl;->makeOpenCloseAnimation(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 805
a=0;//     :pswitch_4
a=0;//     #v3=(Null);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v3, v7, v6}, Landroid/support/v4/app/FragmentManagerImpl;->makeFadeAnimation(Landroid/content/Context;FF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 807
a=0;//     :pswitch_5
a=0;//     #v3=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-static {v3, v6, v7}, Landroid/support/v4/app/FragmentManagerImpl;->makeFadeAnimation(Landroid/content/Context;FF)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 827
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 795
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method makeActive(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 3
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1151
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 1167
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1155
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_4
a=0;// 
a=0;//     .line 1156
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1157
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1159
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->setIndex(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1160
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1166
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Allocated fragment index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1163
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->setIndex(ILandroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1164
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method makeInactive(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 3
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1170
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 1182
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1174
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Freeing fragment index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1175
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1176
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1177
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1179
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1180
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->invalidateSupportFragment(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1181
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->initState()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method moveToState(IIIZ)V
a=0;//     .locals 8
a=0;//     .param p1, "newState"    # I
a=0;//     .param p2, "transit"    # I
a=0;//     .param p3, "transitStyle"    # I
a=0;//     .param p4, "always"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1107
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1108
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "No activity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1111
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     if-nez p4, :cond_2
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_2
a=0;// 
a=0;//     .line 1137
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1115
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iput p1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     .line 1116
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1117
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1118
a=0;//     .local v7, "loadersRunning":Z
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);v7=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_4
a=0;// 
a=0;//     .line 1119
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1120
a=0;//     .local v1, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     .line 1121
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1122
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1123
a=0;//     iget-object v0, v1, Landroid/support/v4/app/Fragment;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->hasRunningLoaders()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v7, v0
a=0;// 
a=0;//     .line 1118
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1128
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 1129
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->startPendingDeferredFragments()V
a=0;// 
a=0;//     .line 1132
a=0;//     :cond_5
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 1133
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->supportInvalidateOptionsMenu()V
a=0;// 
a=0;//     .line 1134
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method moveToState(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "newState"    # I
a=0;//     .param p2, "always"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1103
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0, v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(IIIZ)V
a=0;// 
a=0;//     .line 1104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method moveToState(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 6
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1099
a=0;//     #v3=(Null);
a=0;//     iget v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1100
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;//     .locals 10
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "newState"    # I
a=0;//     .param p3, "transit"    # I
a=0;//     .param p4, "transitionStyle"    # I
a=0;//     .param p5, "keepActive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-le p2, v0, :cond_1
a=0;// 
a=0;//     .line 846
a=0;//     const/4 p2, 0x1
a=0;// 
a=0;//     .line 848
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p2, v0, :cond_2
a=0;// 
a=0;//     .line 850
a=0;//     iget p2, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     .line 854
a=0;//     :cond_2
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDeferStart:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le p2, v0, :cond_3
a=0;// 
a=0;//     .line 855
a=0;//     const/4 p2, 0x3
a=0;// 
a=0;//     .line 857
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     if-ge v0, p2, :cond_1d
a=0;// 
a=0;//     .line 861
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1096
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 864
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 869
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     .line 870
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 872
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1095
a=0;//     :cond_6
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 874
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "moveto CREATED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 875
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 876
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:view_state"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 878
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:target_state"
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 880
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 881
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android:target_req_state"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     .line 884
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android:user_visible_hint"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     .line 886
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     .line 887
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDeferStart:Z
a=0;// 
a=0;//     .line 888
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le p2, v0, :cond_9
a=0;// 
a=0;//     .line 889
a=0;//     const/4 p2, 0x3
a=0;// 
a=0;//     .line 893
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 894
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 895
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     :goto_2
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 897
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 898
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 899
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_b
a=0;// 
a=0;//     .line 900
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
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onAttach()"
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
a=0;//     .line 895
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 903
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     .line 904
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentActivity;->onAttachFragment(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 907
a=0;//     :cond_c
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     .line 908
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->performCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 910
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     .line 911
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 915
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Landroid/support/v4/app/Fragment;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 917
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1b
a=0;// 
a=0;//     .line 918
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     .line 919
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->wrap(Landroid/view/View;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 920
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 921
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 927
a=0;//     :cond_f
a=0;//     :goto_3
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-le p2, v0, :cond_17
a=0;// 
a=0;//     .line 928
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "moveto ACTIVITY_CREATED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 929
a=0;//     :cond_10
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     .line 930
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 931
a=0;//     .local v7, "container":Landroid/view/ViewGroup;
a=0;//     #v7=(Null);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 932
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentContainer;);
a=0;//     iget v1, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/app/FragmentContainer;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .end local v7    # "container":Landroid/view/ViewGroup;
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 933
a=0;//     .restart local v7    # "container":Landroid/view/ViewGroup;
a=0;//     if-nez v7, :cond_11
a=0;// 
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRestored:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_11
a=0;// 
a=0;//     .line 934
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "No view found for id 0x"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ("
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p1, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ") for fragment "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 941
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-object v7, p1, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 942
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0, v7, v1}, Landroid/support/v4/app/Fragment;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 944
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_1c
a=0;// 
a=0;//     .line 945
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     .line 946
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->wrap(Landroid/view/View;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 947
a=0;//     if-eqz v7, :cond_13
a=0;// 
a=0;//     .line 948
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p3, v0, p4}, Landroid/support/v4/app/FragmentManagerImpl;->loadAnimation(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 950
a=0;//     .local v6, "anim":Landroid/view/animation/Animation;
a=0;//     #v6=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v6, :cond_12
a=0;// 
a=0;//     .line 951
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 953
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 955
a=0;//     .end local v6    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_13
a=0;//     #v6=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 956
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 962
a=0;//     .end local v7    # "container":Landroid/view/ViewGroup;
a=0;//     :cond_15
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->performActivityCreated(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 963
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 964
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->restoreViewState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 966
a=0;//     :cond_16
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 970
a=0;//     :cond_17
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le p2, v0, :cond_19
a=0;// 
a=0;//     .line 971
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "moveto STARTED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 972
a=0;//     :cond_18
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performStart()V
a=0;// 
a=0;//     .line 975
a=0;//     :cond_19
a=0;//     :pswitch_3
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le p2, v0, :cond_6
a=0;// 
a=0;//     .line 976
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1a
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "moveto RESUMED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 977
a=0;//     :cond_1a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mResumed:Z
a=0;// 
a=0;//     .line 978
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performResume()V
a=0;// 
a=0;//     .line 979
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 980
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 923
a=0;//     :cond_1b
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Null);v2=(Reference,Landroid/os/Bundle;);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 958
a=0;//     .restart local v7    # "container":Landroid/view/ViewGroup;
a=0;//     :cond_1c
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Reference,Landroid/os/Bundle;);v2=(Conflicted);v7=(Reference,Landroid/view/ViewGroup;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 983
a=0;//     .end local v7    # "container":Landroid/view/ViewGroup;
a=0;//     :cond_1d
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     if-le v0, p2, :cond_6
a=0;// 
a=0;//     .line 984
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1047
a=0;//     :cond_1e
a=0;//     :goto_5
a=0;//     :pswitch_4
a=0;//     #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ge p2, v0, :cond_6
a=0;// 
a=0;//     .line 1048
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1f
a=0;// 
a=0;//     .line 1049
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1f
a=0;// 
a=0;//     .line 1056
a=0;//     iget-object v9, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     .line 1057
a=0;//     .local v9, "v":Landroid/view/View;
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     .line 1058
a=0;//     invoke-virtual {v9}, Landroid/view/View;->clearAnimation()V
a=0;// 
a=0;//     .line 1061
a=0;//     .end local v9    # "v":Landroid/view/View;
a=0;//     :cond_1f
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2b
a=0;// 
a=0;//     .line 1066
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
a=0;// 
a=0;//     .line 1067
a=0;//     const/4 p2, 0x1
a=0;// 
a=0;//     #p2=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 986
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v2=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);p2=(Integer);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_21
a=0;// 
a=0;//     .line 987
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_20
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "movefrom RESUMED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 988
a=0;//     :cond_20
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performPause()V
a=0;// 
a=0;//     .line 989
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mResumed:Z
a=0;// 
a=0;//     .line 992
a=0;//     :cond_21
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_23
a=0;// 
a=0;//     .line 993
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_22
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "movefrom STARTED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 994
a=0;//     :cond_22
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performStop()V
a=0;// 
a=0;//     .line 997
a=0;//     :cond_23
a=0;//     :pswitch_7
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_25
a=0;// 
a=0;//     .line 998
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_24
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "movefrom STOPPED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 999
a=0;//     :cond_24
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performReallyStop()V
a=0;// 
a=0;//     .line 1002
a=0;//     :cond_25
a=0;//     :pswitch_8
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge p2, v0, :cond_1e
a=0;// 
a=0;//     .line 1003
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_26
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "movefrom ACTIVITY_CREATED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1004
a=0;//     :cond_26
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_27
a=0;// 
a=0;//     .line 1007
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_27
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-nez v0, :cond_27
a=0;// 
a=0;//     .line 1008
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->saveFragmentViewState(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1011
a=0;//     :cond_27
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performDestroyView()V
a=0;// 
a=0;//     .line 1012
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2a
a=0;// 
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-eqz v0, :cond_2a
a=0;// 
a=0;//     .line 1013
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1014
a=0;//     .restart local v6    # "anim":Landroid/view/animation/Animation;
a=0;//     #v6=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_28
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mDestroyed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_28
a=0;// 
a=0;//     .line 1015
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p3, v0, p4}, Landroid/support/v4/app/FragmentManagerImpl;->loadAnimation(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1018
a=0;//     :cond_28
a=0;//     #v0=(Integer);v6=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v6, :cond_29
a=0;// 
a=0;//     .line 1019
a=0;//     move-object v8, p1
a=0;// 
a=0;//     .line 1020
a=0;//     .local v8, "fragment":Landroid/support/v4/app/Fragment;
a=0;//     #v8=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     .line 1021
a=0;//     iput p2, p1, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
a=0;// 
a=0;//     .line 1022
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl$5;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl$5;);
a=0;//     invoke-direct {v0, p0, v8}, Landroid/support/v4/app/FragmentManagerImpl$5;-><init>(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$5;);
a=0;//     invoke-virtual {v6, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 1038
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1040
a=0;//     .end local v8    # "fragment":Landroid/support/v4/app/Fragment;
a=0;//     :cond_29
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1042
a=0;//     .end local v6    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_2a
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mContainer:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1043
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 1044
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 1069
a=0;//     :cond_2b
a=0;//     #v0=(Reference,Landroid/view/View;);v9=(Conflicted);
a=0;//     sget-boolean v0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2c
a=0;// 
a=0;//     const-string v0, "FragmentManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "movefrom CREATED: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_2c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2d
a=0;// 
a=0;//     .line 1071
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->performDestroy()V
a=0;// 
a=0;//     .line 1074
a=0;//     :cond_2d
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     .line 1075
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->onDetach()V
a=0;// 
a=0;//     .line 1076
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2e
a=0;// 
a=0;//     .line 1077
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
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " did not call through to super.onDetach()"
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
a=0;//     .line 1080
a=0;//     :cond_2e
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-nez p5, :cond_6
a=0;// 
a=0;//     .line 1081
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     if-nez v0, :cond_2f
a=0;// 
a=0;//     .line 1082
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->makeInactive(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1084
a=0;//     :cond_2f
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     .line 1085
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mParentFragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1086
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 1087
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 872
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 984
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_4
a=0;//         :pswitch_8
a=0;//         :pswitch_7
a=0;//         :pswitch_6
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public noteStateNotSaved()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1891
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1892
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performPendingDeferredStart(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 6
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 831
a=0;//     #v3=(Null);
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->mDeferStart:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 832
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mExecutingActions:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 834
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mHavePendingDeferredStart:Z
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 837
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->mDeferStart:Z
a=0;// 
a=0;//     .line 838
a=0;//     iget v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mCurState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public popBackStack()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentManagerImpl$2;-><init>(Landroid/support/v4/app/FragmentManagerImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$2;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V
a=0;// 
a=0;//     .line 492
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public popBackStack(II)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 520
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Bad id: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     .line 522
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl$4;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl$4;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/app/FragmentManagerImpl$4;-><init>(Landroid/support/v4/app/FragmentManagerImpl;II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$4;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V
a=0;// 
a=0;//     .line 527
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public popBackStack(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl$3;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/app/FragmentManagerImpl$3;-><init>(Landroid/support/v4/app/FragmentManagerImpl;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$3;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/FragmentManagerImpl;->enqueueAction(Ljava/lang/Runnable;Z)V
a=0;// 
a=0;//     .line 508
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public popBackStackImmediate()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 496
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentManagerImpl;->checkStateLoss()V
a=0;// 
a=0;//     .line 497
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->executePendingTransactions()Z
a=0;// 
a=0;//     .line 498
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v0, v1, v2, v3}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public popBackStackImmediate(II)Z
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentManagerImpl;->checkStateLoss()V
a=0;// 
a=0;//     .line 532
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->executePendingTransactions()Z
a=0;// 
a=0;//     .line 533
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Bad id: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     .line 536
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1, p1, p2}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public popBackStackImmediate(Ljava/lang/String;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentManagerImpl;->checkStateLoss()V
a=0;// 
a=0;//     .line 513
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->executePendingTransactions()Z
a=0;// 
a=0;//     .line 514
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v0, p1, v1, p2}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z
a=0;//     .locals 11
a=0;//     .param p1, "handler"    # Landroid/os/Handler;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "id"    # I
a=0;//     .param p4, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 1524
a=0;//     #v9=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 1583
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Boolean);v10=(Conflicted);
a=0;//     return v9
a=0;// 
a=0;//     .line 1527
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Reference,Ljava/util/ArrayList;);v7=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     if-gez p3, :cond_2
a=0;// 
a=0;//     and-int/lit8 v6, p4, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1528
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v4, v6, -0x1
a=0;// 
a=0;//     .line 1529
a=0;//     .local v4, "last":I
a=0;//     #v4=(Integer);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     .line 1532
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .line 1533
a=0;//     .local v1, "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     invoke-virtual {v1, v8}, Landroid/support/v4/app/BackStackRecord;->popFromBackStack(Z)V
a=0;// 
a=0;//     .line 1534
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->reportBackStackChanged()V
a=0;// 
a=0;//     .end local v1    # "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     .end local v4    # "last":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     move v9, v8
a=0;// 
a=0;//     .line 1583
a=0;//     #v9=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1536
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 1537
a=0;//     .local v3, "index":I
a=0;//     #v3=(Byte);
a=0;//     if-nez p2, :cond_3
a=0;// 
a=0;//     if-ltz p3, :cond_9
a=0;// 
a=0;//     .line 1540
a=0;//     :cond_3
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v3, v6, -0x1
a=0;// 
a=0;//     .line 1541
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-ltz v3, :cond_4
a=0;// 
a=0;//     .line 1542
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .line 1543
a=0;//     .restart local v1    # "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     if-eqz p2, :cond_7
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/BackStackRecord;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     .line 1551
a=0;//     .end local v1    # "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v6=(Conflicted);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 1554
a=0;//     and-int/lit8 v6, p4, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     .line 1555
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 1557
a=0;//     :goto_3
a=0;//     if-ltz v3, :cond_9
a=0;// 
a=0;//     .line 1558
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .line 1559
a=0;//     .restart local v1    # "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/BackStackRecord;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     if-ltz p3, :cond_9
a=0;// 
a=0;//     iget v6, v1, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne p3, v6, :cond_9
a=0;// 
a=0;//     .line 1561
a=0;//     :cond_6
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 1562
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1546
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);
a=0;//     if-ltz p3, :cond_8
a=0;// 
a=0;//     iget v6, v1, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq p3, v6, :cond_4
a=0;// 
a=0;//     .line 1549
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 1550
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1568
a=0;//     .end local v1    # "bss":Landroid/support/v4/app/BackStackRecord;
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     if-eq v3, v6, :cond_0
a=0;// 
a=0;//     .line 1571
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1573
a=0;//     .local v5, "states":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/BackStackRecord;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v2, v6, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_4
a=0;//     #v2=(Integer);v6=(Conflicted);
a=0;//     if-le v2, v3, :cond_a
a=0;// 
a=0;//     .line 1574
a=0;//     iget-object v6, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1573
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1576
a=0;//     :cond_a
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v0, v6, -0x1
a=0;// 
a=0;//     .line 1577
a=0;//     .local v0, "LAST":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     if-gt v2, v0, :cond_d
a=0;// 
a=0;//     .line 1578
a=0;//     sget-boolean v6, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     const-string v6, "FragmentManager"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Popping back stack state: "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1579
a=0;//     :cond_b
a=0;//     #v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     if-ne v2, v0, :cond_c
a=0;// 
a=0;//     move v7, v8
a=0;// 
a=0;//     :goto_6
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v4/app/BackStackRecord;->popFromBackStack(Z)V
a=0;// 
a=0;//     .line 1577
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_c
a=0;//     #v7=(Conflicted);
a=0;//     move v7, v9
a=0;// 
a=0;//     .line 1579
a=0;//     #v7=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1581
a=0;//     :cond_d
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->reportBackStackChanged()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 3
a=0;//     .param p1, "bundle"    # Landroid/os/Bundle;
a=0;//     .param p2, "key"    # Ljava/lang/String;
a=0;//     .param p3, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 566
a=0;//     iget v0, p3, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 567
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
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not currently in the FragmentManager"
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
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 570
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p3, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 571
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeFragment(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 7
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transition"    # I
a=0;//     .param p3, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1207
a=0;//     #v5=(Null);
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "remove: "
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
a=0;//     const-string v3, " nesting="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p1, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1208
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->isInBackStack()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     move v6, v0
a=0;// 
a=0;//     .line 1209
a=0;//     .local v6, "inactive":Z
a=0;//     :goto_0
a=0;//     #v6=(Boolean);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mDetached:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 1210
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1211
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1213
a=0;//     :cond_2
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1214
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1216
a=0;//     :cond_3
a=0;//     iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1217
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->mRemoving:Z
a=0;// 
a=0;//     .line 1218
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1221
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .end local v6    # "inactive":Z
a=0;//     :cond_5
a=0;//     #v0=(One);v1=(Boolean);v4=(Uninit);v6=(Uninit);
a=0;//     move v6, v5
a=0;// 
a=0;//     .line 1208
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v6    # "inactive":Z
a=0;//     :cond_6
a=0;//     #v6=(Boolean);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 1218
a=0;//     #v2=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method reportBackStackChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1508
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1509
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 1510
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackChangeListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;->onBackStackChanged()V
a=0;// 
a=0;//     .line 1509
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1513
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;//     .locals 12
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "nonConfig":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 1773
a=0;//     #v10=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 1880
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     .line 1774
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v2, Landroid/support/v4/app/FragmentManagerState;
a=0;// 
a=0;//     .line 1775
a=0;//     .local v2, "fms":Landroid/support/v4/app/FragmentManagerState;
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 1779
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 1780
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_4
a=0;// 
a=0;//     .line 1781
a=0;//     invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1782
a=0;//     .local v1, "f":Landroid/support/v4/app/Fragment;
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "restoreAllState: re-attaching retained "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1783
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     iget v8, v1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-object v3, v7, v8
a=0;// 
a=0;//     .line 1784
a=0;//     .local v3, "fs":Landroid/support/v4/app/FragmentState;
a=0;//     #v3=(Null);
a=0;//     iput-object v1, v3, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1785
a=0;//     iput-object v10, v1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 1786
a=0;//     iput v11, v1, Landroid/support/v4/app/Fragment;->mBackStackNesting:I
a=0;// 
a=0;//     .line 1787
a=0;//     iput-boolean v11, v1, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 1788
a=0;//     iput-boolean v11, v1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1789
a=0;//     iput-object v10, v1, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1790
a=0;//     iget-object v7, v3, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 1791
a=0;//     iget-object v7, v3, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 1792
a=0;//     iget-object v7, v3, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v8, "android:view_state"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, v1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 1780
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1800
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v3    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     .end local v4    # "i":I
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v8, v2, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v8=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1801
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 1802
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1804
a=0;//     :cond_5
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .restart local v4    # "i":I
a=0;//     :goto_2
a=0;//     #v4=(Integer);v8=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_a
a=0;// 
a=0;//     .line 1805
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     aget-object v3, v7, v4
a=0;// 
a=0;//     .line 1806
a=0;//     .restart local v3    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     #v3=(Null);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 1807
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/support/v4/app/FragmentState;->instantiate(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1808
a=0;//     .restart local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "restoreAllState: active #"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ": "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1809
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1813
a=0;//     iput-object v10, v3, Landroid/support/v4/app/FragmentState;->mInstance:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1804
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1815
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1816
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 1817
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1819
a=0;//     :cond_8
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "restoreAllState: avail #"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1820
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1825
a=0;//     .end local v3    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     if-eqz p2, :cond_d
a=0;// 
a=0;//     .line 1826
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_d
a=0;// 
a=0;//     .line 1827
a=0;//     invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1828
a=0;//     .restart local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     iget v7, v1, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     if-ltz v7, :cond_b
a=0;// 
a=0;//     .line 1829
a=0;//     iget v7, v1, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v7, v8, :cond_c
a=0;// 
a=0;//     .line 1830
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v8, v1, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iput-object v7, v1, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1826
a=0;//     :cond_b
a=0;//     :goto_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1832
a=0;//     :cond_c
a=0;//     #v7=(Integer);v8=(Integer);
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Re-attaching retained fragment "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " target no longer exists: "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v9, v1, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1834
a=0;//     iput-object v10, v1, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1841
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     if-eqz v7, :cond_11
a=0;// 
a=0;//     .line 1842
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v8, v2, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1843
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_12
a=0;// 
a=0;//     .line 1844
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v8, v2, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     aget v8, v8, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1845
a=0;//     .restart local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     .line 1846
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No instantiated fragment for index #"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, v2, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     aget v9, v9, v4
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 1849
a=0;//     :cond_e
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, v1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     .line 1850
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_f
a=0;// 
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "restoreAllState: added #"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ": "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1851
a=0;//     :cond_f
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v7, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_10
a=0;// 
a=0;//     .line 1852
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "Already added!"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1854
a=0;//     :cond_10
a=0;//     #v7=(Boolean);v8=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1843
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1857
a=0;//     .end local v1    # "f":Landroid/support/v4/app/Fragment;
a=0;//     :cond_11
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v10, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1861
a=0;//     :cond_12
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     if-eqz v7, :cond_15
a=0;// 
a=0;//     .line 1862
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v8, v2, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v8=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1863
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_0
a=0;// 
a=0;//     .line 1864
a=0;//     iget-object v7, v2, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v7=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     aget-object v7, v7, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7, p0}, Landroid/support/v4/app/BackStackState;->instantiate(Landroid/support/v4/app/FragmentManagerImpl;)Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1865
a=0;//     .local v0, "bse":Landroid/support/v4/app/BackStackRecord;
a=0;//     #v0=(Reference,Landroid/support/v4/app/BackStackRecord;);
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_13
a=0;// 
a=0;//     .line 1866
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "restoreAllState: back stack #"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " (index "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v9, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "): "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1868
a=0;//     new-instance v5, Landroid/support/v4/util/LogWriter;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v4/util/LogWriter;);
a=0;//     const-string v7, "FragmentManager"
a=0;// 
a=0;//     invoke-direct {v5, v7}, Landroid/support/v4/util/LogWriter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1869
a=0;//     .local v5, "logw":Landroid/support/v4/util/LogWriter;
a=0;//     #v5=(Reference,Landroid/support/v4/util/LogWriter;);
a=0;//     new-instance v6, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 1870
a=0;//     .local v6, "pw":Ljava/io/PrintWriter;
a=0;//     #v6=(Reference,Ljava/io/PrintWriter;);
a=0;//     const-string v7, "  "
a=0;// 
a=0;//     invoke-virtual {v0, v7, v6, v11}, Landroid/support/v4/app/BackStackRecord;->dump(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
a=0;// 
a=0;//     .line 1872
a=0;//     .end local v5    # "logw":Landroid/support/v4/util/LogWriter;
a=0;//     .end local v6    # "pw":Ljava/io/PrintWriter;
a=0;//     :cond_13
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1873
a=0;//     iget v7, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ltz v7, :cond_14
a=0;// 
a=0;//     .line 1874
a=0;//     iget v7, v0, Landroid/support/v4/app/BackStackRecord;->mIndex:I
a=0;// 
a=0;//     invoke-virtual {p0, v7, v0}, Landroid/support/v4/app/FragmentManagerImpl;->setBackStackIndex(ILandroid/support/v4/app/BackStackRecord;)V
a=0;// 
a=0;//     .line 1863
a=0;//     :cond_14
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 1878
a=0;//     .end local v0    # "bse":Landroid/support/v4/app/BackStackRecord;
a=0;//     :cond_15
a=0;//     #v0=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     iput-object v10, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method retainNonConfig()Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/Fragment;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1587
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1588
a=0;//     .local v1, "fragments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 1589
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/ArrayList;);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_3
a=0;// 
a=0;//     .line 1590
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1591
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/Fragment;->mRetainInstance:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1592
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1593
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v1    # "fragments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1595
a=0;//     .restart local v1    # "fragments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1596
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, v0, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     .line 1597
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v3, v3, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     iput v3, v0, Landroid/support/v4/app/Fragment;->mTargetIndex:I
a=0;// 
a=0;//     .line 1598
a=0;//     sget-boolean v3, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const-string v3, "FragmentManager"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "retainNonConfig: keeping retained "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1589
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1597
a=0;//     :cond_2
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1602
a=0;//     .end local v0    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v2    # "i":I
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method saveAllState()Landroid/os/Parcelable;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1657
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 1659
a=0;//     sget-boolean v9, Landroid/support/v4/app/FragmentManagerImpl;->HONEYCOMB:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 1669
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateSaved:Z
a=0;// 
a=0;//     .line 1672
a=0;//     :cond_0
a=0;//     #v9=(Boolean);
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gtz v9, :cond_2
a=0;// 
a=0;//     .line 1767
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Landroid/support/v4/app/FragmentManagerState;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1677
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Integer);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1678
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     .line 1679
a=0;//     .local v1, "active":[Landroid/support/v4/app/FragmentState;
a=0;//     #v1=(Reference,[Landroid/support/v4/app/FragmentState;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1680
a=0;//     .local v7, "haveFragments":Z
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v8, v0, :cond_9
a=0;// 
a=0;//     .line 1681
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1682
a=0;//     .local v4, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 1683
a=0;//     iget v9, v4, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gez v9, :cond_3
a=0;// 
a=0;//     .line 1684
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Failure saving state: active "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, " has cleared index: "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget v11, v4, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v9}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 1689
a=0;//     :cond_3
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1691
a=0;//     #v7=(One);
a=0;//     new-instance v6, Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/support/v4/app/FragmentState;);
a=0;//     invoke-direct {v6, v4}, Landroid/support/v4/app/FragmentState;-><init>(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1692
a=0;//     .local v6, "fs":Landroid/support/v4/app/FragmentState;
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentState;);
a=0;//     aput-object v6, v1, v8
a=0;// 
a=0;//     .line 1694
a=0;//     iget v9, v4, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lez v9, :cond_8
a=0;// 
a=0;//     iget-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     .line 1695
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/app/FragmentManagerImpl;->saveFragmentBasicState(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iput-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1697
a=0;//     iget-object v9, v4, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 1698
a=0;//     iget-object v9, v4, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v9, v9, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-gez v9, :cond_4
a=0;// 
a=0;//     .line 1699
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Failure saving state: "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, " has target not in fragment manager: "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, v4, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v9}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 1703
a=0;//     :cond_4
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     .line 1704
a=0;//     new-instance v9, Landroid/os/Bundle;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v9}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1706
a=0;//     :cond_5
a=0;//     iget-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v10, "android:target_state"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, v4, Landroid/support/v4/app/Fragment;->mTarget:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     invoke-virtual {p0, v9, v10, v11}, Landroid/support/v4/app/FragmentManagerImpl;->putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1708
a=0;//     iget v9, v4, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 1709
a=0;//     iget-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v10, "android:target_req_state"
a=0;// 
a=0;//     iget v11, v4, Landroid/support/v4/app/Fragment;->mTargetRequestCode:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v9, v10, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1719
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     sget-boolean v9, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_7
a=0;// 
a=0;//     const-string v9, "FragmentManager"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Saved state of "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, ": "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1680
a=0;//     .end local v6    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);v7=(Boolean);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1716
a=0;//     .restart local v6    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     :cond_8
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentState;);v7=(One);
a=0;//     iget-object v9, v4, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v9, v6, Landroid/support/v4/app/FragmentState;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1724
a=0;//     .end local v4    # "f":Landroid/support/v4/app/Fragment;
a=0;//     .end local v6    # "fs":Landroid/support/v4/app/FragmentState;
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Boolean);v9=(Conflicted);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 1725
a=0;//     sget-boolean v9, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     const-string v9, "FragmentManager"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "saveAllState: no fragments!"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1729
a=0;//     :cond_a
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1730
a=0;//     .local v2, "added":[I
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1733
a=0;//     .local v3, "backStack":[Landroid/support/v4/app/BackStackState;
a=0;//     #v3=(Null);
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v9, :cond_d
a=0;// 
a=0;//     .line 1734
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1735
a=0;//     if-lez v0, :cond_d
a=0;// 
a=0;//     .line 1736
a=0;//     new-array v2, v0, [I
a=0;// 
a=0;//     .line 1737
a=0;//     #v2=(Reference,[I);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);
a=0;//     if-ge v8, v0, :cond_d
a=0;// 
a=0;//     .line 1738
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget v9, v9, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aput v9, v2, v8
a=0;// 
a=0;//     .line 1739
a=0;//     aget v9, v2, v8
a=0;// 
a=0;//     if-gez v9, :cond_b
a=0;// 
a=0;//     .line 1740
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Failure saving state: active "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, " has cleared index: "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     aget v11, v2, v8
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v9}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 1744
a=0;//     :cond_b
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     sget-boolean v9, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_c
a=0;// 
a=0;//     const-string v9, "FragmentManager"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "saveAllState: adding fragment #"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, ": "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAdded:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1737
a=0;//     :cond_c
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1751
a=0;//     :cond_d
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v9, :cond_f
a=0;// 
a=0;//     .line 1752
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1753
a=0;//     if-lez v0, :cond_f
a=0;// 
a=0;//     .line 1754
a=0;//     new-array v3, v0, [Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     .line 1755
a=0;//     #v3=(Reference,[Landroid/support/v4/app/BackStackState;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v9=(Conflicted);
a=0;//     if-ge v8, v0, :cond_f
a=0;// 
a=0;//     .line 1756
a=0;//     new-instance v10, Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/support/v4/app/BackStackState;);
a=0;//     iget-object v9, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     invoke-direct {v10, p0, v9}, Landroid/support/v4/app/BackStackState;-><init>(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/BackStackRecord;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/app/BackStackState;);
a=0;//     aput-object v10, v3, v8
a=0;// 
a=0;//     .line 1757
a=0;//     sget-boolean v9, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_e
a=0;// 
a=0;//     const-string v9, "FragmentManager"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "saveAllState: adding back stack #"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, ": "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStack:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1755
a=0;//     :cond_e
a=0;//     #v9=(Conflicted);v11=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1763
a=0;//     :cond_f
a=0;//     #v10=(Conflicted);
a=0;//     new-instance v5, Landroid/support/v4/app/FragmentManagerState;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     invoke-direct {v5}, Landroid/support/v4/app/FragmentManagerState;-><init>()V
a=0;// 
a=0;//     .line 1764
a=0;//     .local v5, "fms":Landroid/support/v4/app/FragmentManagerState;
a=0;//     #v5=(Reference,Landroid/support/v4/app/FragmentManagerState;);
a=0;//     iput-object v1, v5, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
a=0;// 
a=0;//     .line 1765
a=0;//     iput-object v2, v5, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
a=0;// 
a=0;//     .line 1766
a=0;//     iput-object v3, v5, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method saveFragmentBasicState(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
a=0;//     .locals 3
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1622
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1624
a=0;//     .local v0, "result":Landroid/os/Bundle;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1625
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1627
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/support/v4/app/Fragment;->performSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1628
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Bundle;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1629
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1630
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateBundle:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1633
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1634
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->saveFragmentViewState(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1636
a=0;//     :cond_2
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1637
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1638
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local v0    # "result":Landroid/os/Bundle;
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 1640
a=0;//     .restart local v0    # "result":Landroid/os/Bundle;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android:view_state"
a=0;// 
a=0;//     iget-object v2, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 1643
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 1644
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 1645
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local v0    # "result":Landroid/os/Bundle;
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 1648
a=0;//     .restart local v0    # "result":Landroid/os/Bundle;
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android:user_visible_hint"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->mUserVisibleHint:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 1651
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;
a=0;//     .locals 5
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 598
a=0;//     #v1=(Null);
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Fragment "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " is not currently in the FragmentManager"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/app/FragmentManagerImpl;->throwException(Ljava/lang/RuntimeException;)V
a=0;// 
a=0;//     .line 602
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v2, p1, Landroid/support/v4/app/Fragment;->mState:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 603
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->saveFragmentBasicState(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 604
a=0;//     .local v0, "result":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v1, Landroid/support/v4/app/Fragment$SavedState;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v4/app/Fragment$SavedState;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 606
a=0;//     .end local v0    # "result":Landroid/os/Bundle;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/support/v4/app/Fragment$SavedState;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method saveFragmentViewState(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 2
a=0;//     .param p1, "f"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1606
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1619
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1609
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1610
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 1614
a=0;//     :goto_1
a=0;//     iget-object v0, p1, Landroid/support/v4/app/Fragment;->mInnerView:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 1615
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 1616
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/Fragment;->mSavedViewState:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 1617
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1612
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl;->mStateArray:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setBackStackIndex(ILandroid/support/v4/app/BackStackRecord;)V
a=0;//     .locals 4
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "bse"    # Landroid/support/v4/app/BackStackRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1416
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 1417
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1418
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1420
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1421
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_2
a=0;// 
a=0;//     .line 1422
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Setting back stack index "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " to "
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
a=0;//     .line 1423
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1437
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 1438
a=0;//     return-void
a=0;// 
a=0;//     .line 1425
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     if-ge v0, p1, :cond_5
a=0;// 
a=0;//     .line 1426
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1427
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 1428
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1430
a=0;//     :cond_3
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Adding available back stack index "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1431
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mAvailBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1432
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1434
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Adding back stack index "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " with "
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
a=0;//     .line 1435
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mBackStackIndices:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1437
a=0;//     .end local v0    # "N":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public showFragment(Landroid/support/v4/app/Fragment;II)V
a=0;//     .locals 6
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "transition"    # I
a=0;//     .param p3, "transitionStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1243
a=0;//     #v4=(Null);
a=0;//     sget-boolean v1, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "FragmentManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "show: "
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
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1244
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1245
a=0;//     iput-boolean v4, p1, Landroid/support/v4/app/Fragment;->mHidden:Z
a=0;// 
a=0;//     .line 1246
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1247
a=0;//     invoke-virtual {p0, p1, p2, v5, p3}, Landroid/support/v4/app/FragmentManagerImpl;->loadAnimation(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1249
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1250
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1252
a=0;//     :cond_1
a=0;//     iget-object v1, p1, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1254
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mAdded:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mHasMenu:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->mMenuVisible:Z
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1255
a=0;//     iput-boolean v5, p0, Landroid/support/v4/app/FragmentManagerImpl;->mNeedMenuInvalidate:Z
a=0;// 
a=0;//     .line 1257
a=0;//     :cond_3
a=0;//     invoke-virtual {p1, v4}, Landroid/support/v4/app/Fragment;->onHiddenChanged(Z)V
a=0;// 
a=0;//     .line 1259
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method startPendingDeferredFragments()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1140
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1148
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1142
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 1143
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 1144
a=0;//     .local v0, "f":Landroid/support/v4/app/Fragment;
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1145
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentManagerImpl;->performPendingDeferredStart(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 1142
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 616
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 617
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "FragmentManager{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 618
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
a=0;//     .line 619
a=0;//     const-string v1, " in "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 621
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mParent:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 625
a=0;//     :goto_0
a=0;//     const-string v1, "}}"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 626
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 623
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/util/DebugUtils;->buildShortClassTag(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
