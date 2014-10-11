package android.support.v4.app; class FragmentActivity { void a() { int a;
a=0;// .class public Landroid/support/v4/app/FragmentActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "FragmentActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/FragmentActivity$FragmentTag;,
a=0;//         Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final FRAGMENTS_TAG:Ljava/lang/String; = "android:support:fragments"
a=0;// 
a=0;// .field private static final HONEYCOMB:I = 0xb
a=0;// 
a=0;// .field static final MSG_REALLY_STOPPED:I = 0x1
a=0;// 
a=0;// .field static final MSG_RESUME_PENDING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "FragmentActivity"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/SimpleArrayMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/support/v4/app/LoaderManagerImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mCheckedForLoaderManager:Z
a=0;// 
a=0;// .field final mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;// .field mCreated:Z
a=0;// 
a=0;// .field final mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;// .field mLoadersStarted:Z
a=0;// 
a=0;// .field mOptionsMenuInvalidated:Z
a=0;// 
a=0;// .field mReallyStopped:Z
a=0;// 
a=0;// .field mResumed:Z
a=0;// 
a=0;// .field mRetaining:Z
a=0;// 
a=0;// .field mStopped:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 87
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentActivity$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$1;-><init>(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Landroid/support/v4/app/FragmentActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/FragmentActivity$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$2;-><init>(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p3, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 762
a=0;//     invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 763
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 764
a=0;//     const-string v3, "null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 780
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 767
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p3}, Landroid/support/v4/app/FragmentActivity;->viewToString(Landroid/view/View;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 768
a=0;//     instance-of v3, p3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move-object v1, p3
a=0;// 
a=0;//     .line 771
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 772
a=0;//     .local v1, "grp":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 773
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 776
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
a=0;//     const-string v4, "  "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 777
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 778
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, v3}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;// 
a=0;//     .line 777
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static viewToString(Landroid/view/View;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x56
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/16 v7, 0x46
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v11, 0x2c
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/16 v10, 0x20
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/16 v8, 0x2e
a=0;// 
a=0;//     .line 696
a=0;//     #v8=(PosByte);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v6, 0x80
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 697
a=0;//     .local v2, "out":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 698
a=0;//     const/16 v6, 0x7b
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 699
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
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 700
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 701
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     .line 705
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 707
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 708
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     const/16 v6, 0x45
a=0;// 
a=0;//     :goto_2
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 709
a=0;//     invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     move v6, v8
a=0;// 
a=0;//     :goto_3
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 710
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     const/16 v6, 0x48
a=0;// 
a=0;//     :goto_4
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 711
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     move v6, v9
a=0;// 
a=0;//     :goto_5
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 712
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isClickable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     const/16 v6, 0x43
a=0;// 
a=0;//     :goto_6
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 713
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     const/16 v6, 0x4c
a=0;// 
a=0;//     :goto_7
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 714
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 715
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isFocused()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     :goto_8
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isSelected()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     const/16 v6, 0x53
a=0;// 
a=0;//     :goto_9
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 717
a=0;//     invoke-virtual {p0}, Landroid/view/View;->isPressed()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     const/16 v8, 0x50
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 718
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 719
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 720
a=0;//     invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 721
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 722
a=0;//     const/16 v6, 0x2d
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 723
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 724
a=0;//     invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 725
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 726
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 727
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-eq v1, v6, :cond_1
a=0;// 
a=0;//     .line 728
a=0;//     const-string v6, " #"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 729
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 730
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 731
a=0;//     .local v4, "r":Landroid/content/res/Resources;
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 734
a=0;//     const/high16 v6, -0x1000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int/2addr v6, v1
a=0;// 
a=0;//     sparse-switch v6, :sswitch_data_1
a=0;// 
a=0;//     .line 742
a=0;//     :try_start_0
a=0;//     invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 745
a=0;//     .local v3, "pkgname":Ljava/lang/String;
a=0;//     :goto_a
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 746
a=0;//     .local v5, "typename":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 747
a=0;//     .local v0, "entryname":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, " "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 748
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 749
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 750
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 751
a=0;//     const-string v6, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 752
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 757
a=0;//     .end local v0    # "entryname":Ljava/lang/String;
a=0;//     .end local v3    # "pkgname":Ljava/lang/String;
a=0;//     .end local v4    # "r":Landroid/content/res/Resources;
a=0;//     .end local v5    # "typename":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v6, "}"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 758
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     return-object v6
a=0;// 
a=0;//     .line 702
a=0;//     .end local v1    # "id":I
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);
a=0;//     invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 703
a=0;//     :sswitch_1
a=0;//     const/16 v6, 0x49
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 704
a=0;//     :sswitch_2
a=0;//     #v6=(Integer);
a=0;//     const/16 v6, 0x47
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 707
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 708
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 709
a=0;//     :cond_4
a=0;//     #v6=(Boolean);
a=0;//     const/16 v6, 0x44
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 710
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 711
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 712
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_8
a=0;//     #v6=(Boolean);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 713
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_9
a=0;//     #v6=(Boolean);
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 715
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_a
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 716
a=0;//     #v6=(PosByte);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 736
a=0;//     .restart local v1    # "id":I
a=0;//     .restart local v4    # "r":Landroid/content/res/Resources;
a=0;//     :sswitch_3
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v4=(Reference,Landroid/content/res/Resources;);v6=(Integer);
a=0;//     const-string v3, "app"
a=0;// 
a=0;//     .line 737
a=0;//     .restart local v3    # "pkgname":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 739
a=0;//     .end local v3    # "pkgname":Ljava/lang/String;
a=0;//     :sswitch_4
a=0;//     #v3=(Uninit);
a=0;//     const-string v3, "android"
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 740
a=0;//     .restart local v3    # "pkgname":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 753
a=0;//     .end local v3    # "pkgname":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 701
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_0
a=0;//         0x4 -> :sswitch_1
a=0;//         0x8 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// 
a=0;//     .line 734
a=0;//     :sswitch_data_1
a=0;//     .sparse-switch
a=0;//         0x1000000 -> :sswitch_4
a=0;//         0x7f000000 -> :sswitch_3
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method doReallyStop(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "retaining"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 783
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 784
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     .line 785
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
a=0;// 
a=0;//     .line 786
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 787
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onReallyStop()V
a=0;// 
a=0;//     .line 789
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 673
a=0;//     :cond_0
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "Local FragmentActivity "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 674
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
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 675
a=0;//     const-string v1, " State:"
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 676
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
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 677
a=0;//     .local v0, "innerPrefix":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "mCreated="
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 678
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, "mResumed="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 679
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, " mStopped="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 680
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
a=0;// 
a=0;//     const-string v1, " mReallyStopped="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 681
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 682
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "mLoadersStarted="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 683
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 684
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 685
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "Loader Manager "
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 686
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 687
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 688
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "  "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 690
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 691
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "View Hierarchy:"
a=0;// 
a=0;//     invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 692
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
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v1, p3, v2}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
a=0;// 
a=0;//     .line 693
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getLastCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     .line 635
a=0;//     .local v0, "nc":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     .locals 2
a=0;//     .param p1, "who"    # Ljava/lang/String;
a=0;//     .param p2, "started"    # Z
a=0;//     .param p3, "create"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 886
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 887
a=0;//     new-instance v1, Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     .line 889
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 890
a=0;//     .local v0, "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 891
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 892
a=0;//     new-instance v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .end local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-direct {v0, p1, p0, p2}, Landroid/support/v4/app/LoaderManagerImpl;-><init>(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V
a=0;// 
a=0;//     .line 893
a=0;//     .restart local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 898
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 896
a=0;//     :cond_2
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/LoaderManagerImpl;->updateActivity(Landroid/support/v4/app/FragmentActivity;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 828
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportLoaderManager()Landroid/support/v4/app/LoaderManager;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 877
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 878
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 882
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 880
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 881
a=0;//     const-string v0, "(root)"
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 882
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method invalidateSupportFragment(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "who"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 860
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 861
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 862
a=0;//     .local v0, "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 863
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 864
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 867
a=0;//     .end local v0    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 5
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 154
a=0;//     shr-int/lit8 v1, p1, 0x10
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "index":I
a=0;//     #v1=(Short);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 156
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "FragmentActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Activity result fragment index out of range: 0x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "frag":Landroid/support/v4/app/Fragment;
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     const-string v2, "FragmentActivity"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Activity result no fragment exists for index: 0x"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     const v2, 0xffff
a=0;// 
a=0;//     #v2=(Char);
a=0;//     and-int/2addr v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     .end local v0    # "frag":Landroid/support/v4/app/Fragment;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Short);v2=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAttachFragment(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 0
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     .prologue
a=0;//     .line 821
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackImmediate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->finish()V
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 192
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentContainer;);
a=0;//     invoke-virtual {v3, p0, v4, v2}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "nc":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v3, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 213
a=0;//     const-string v3, "android:support:fragments"
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 214
a=0;//     .local v1, "p":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 216
a=0;//     .end local v1    # "p":Landroid/os/Parcelable;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 226
a=0;//     .local v0, "show":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MenuInflater;);
a=0;//     invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 227
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     .end local v0    # "show":Z
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 233
a=0;//     .restart local v0    # "show":Z
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     .end local v0    # "show":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;//     .locals 11
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//         .annotation build Landroid/support/annotation/NonNull;
a=0;//         .end annotation
a=0;//     .end param
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;//         .annotation build Landroid/support/annotation/NonNull;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 243
a=0;//     #v8=(Byte);
a=0;//     const-string v7, "fragment"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 324
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Reference,Landroid/support/v4/app/Fragment;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Landroid/view/View;);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Byte);v9=(Uninit);
a=0;//     const-string v7, "class"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v3, v7}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 248
a=0;//     .local v2, "fname":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Landroid/support/v4/app/FragmentActivity$FragmentTag;->Fragment:[I
a=0;// 
a=0;//     invoke-virtual {p2, p3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 249
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 250
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     invoke-virtual {v0, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 253
a=0;//     .local v4, "id":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 254
a=0;//     .local v6, "tag":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/app/Fragment;->isSupportFragmentClass(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 259
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :cond_2
a=0;//     #v7=(Boolean);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     .local v5, "parent":Landroid/view/View;
a=0;//     #v5=(Null);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 264
a=0;//     .local v1, "containerId":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v8, :cond_4
a=0;// 
a=0;//     if-ne v4, v8, :cond_4
a=0;// 
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 265
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ": Must specify unique android:id, android:tag, or have a parent with an id for "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 272
a=0;//     :cond_4
a=0;//     #v7=(Boolean);v8=(Byte);v9=(Uninit);
a=0;//     if-eq v4, v8, :cond_5
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v7, v4}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 273
a=0;//     .local v3, "fragment":Landroid/support/v4/app/Fragment;
a=0;//     :cond_5
a=0;//     #v3=(Reference,Landroid/support/v4/app/Fragment;);v7=(Conflicted);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v7, v6}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 276
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     if-eq v1, v8, :cond_7
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v7, v1}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 280
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     const-string v7, "FragmentActivity"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "onCreateView: id=0x"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " fname="
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " existing="
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 283
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 284
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 285
a=0;//     iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mFromLayout:Z
a=0;// 
a=0;//     .line 286
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     move v7, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     iput v7, v3, Landroid/support/v4/app/Fragment;->mFragmentId:I
a=0;// 
a=0;//     .line 287
a=0;//     iput v1, v3, Landroid/support/v4/app/Fragment;->mContainerId:I
a=0;// 
a=0;//     .line 288
a=0;//     iput-object v6, v3, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 289
a=0;//     iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iput-object v7, v3, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v3, p0, p3, v7}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v7, v3, v10}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V
a=0;// 
a=0;//     .line 314
a=0;//     :goto_2
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v7, :cond_d
a=0;// 
a=0;//     .line 315
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Fragment "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " did not create a view."
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     throw v7
a=0;// 
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move v7, v1
a=0;// 
a=0;//     .line 286
a=0;//     #v7=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 294
a=0;//     :cond_a
a=0;//     #v7=(Conflicted);
a=0;//     iget-boolean v7, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     .line 297
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ": Duplicate id 0x"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ", tag "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ", or parent id 0x"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " with another fragment for "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 304
a=0;//     :cond_b
a=0;//     #v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z
a=0;// 
a=0;//     .line 308
a=0;//     iget-boolean v7, v3, Landroid/support/v4/app/Fragment;->mRetaining:Z
a=0;// 
a=0;//     if-nez v7, :cond_c
a=0;// 
a=0;//     .line 309
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v3, p0, p3, v7}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 311
a=0;//     :cond_c
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v7, v3}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 318
a=0;//     :cond_d
a=0;//     if-eqz v4, :cond_e
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_e
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-nez v7, :cond_f
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 324
a=0;//     :cond_f
a=0;//     iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V
a=0;// 
a=0;//     .line 353
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 356
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLowMemory()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V
a=0;// 
a=0;//     .line 365
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V
a=0;// 
a=0;//     .line 366
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 385
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     sparse-switch p1, :sswitch_data_0
a=0;// 
a=0;//     .line 385
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 379
a=0;//     :sswitch_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     :sswitch_1
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 377
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_0
a=0;//         0x6 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 428
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 430
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPanelClosed(ILandroid/view/Menu;)V
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 399
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V
a=0;// 
a=0;//     .line 400
a=0;//     return-void
a=0;// 
a=0;//     .line 396
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 394
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 407
a=0;//     #v1=(PosByte);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 408
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V
a=0;// 
a=0;//     .line 414
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPostResume()V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 456
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
a=0;// 
a=0;//     .line 457
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 458
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 476
a=0;//     iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 477
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     .line 478
a=0;//     invoke-interface {p3}, Landroid/view/Menu;->clear()V
a=0;// 
a=0;//     .line 479
a=0;//     invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     .line 481
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 482
a=0;//     .local v0, "goforit":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1, p3}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 485
a=0;//     .end local v0    # "goforit":Z
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method onReallyStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 799
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 800
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 801
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 802
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V
a=0;// 
a=0;//     .line 810
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V
a=0;// 
a=0;//     .line 811
a=0;//     return-void
a=0;// 
a=0;//     .line 805
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 445
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z
a=0;// 
a=0;//     .line 446
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 447
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResumeFragments()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V
a=0;// 
a=0;//     .line 468
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 502
a=0;//     #v9=(Null);
a=0;//     iget-boolean v8, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 503
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
a=0;// 
a=0;//     .line 506
a=0;//     :cond_0
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 508
a=0;//     .local v1, "custom":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v8}, Landroid/support/v4/app/FragmentManagerImpl;->retainNonConfig()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 509
a=0;//     .local v2, "fragments":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 510
a=0;//     .local v7, "retainLoaders":Z
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 513
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/support/v4/util/SimpleArrayMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 514
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v5, v0, [Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 515
a=0;//     .local v5, "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v5=(Reference,[Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     add-int/lit8 v3, v0, -0x1
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_1
a=0;// 
a=0;//     .line 516
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     check-cast v8, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     aput-object v8, v5, v3
a=0;// 
a=0;//     .line 515
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 518
a=0;//     :cond_1
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v7=(Boolean);v8=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v3, v0, :cond_3
a=0;// 
a=0;//     .line 519
a=0;//     aget-object v4, v5, v3
a=0;// 
a=0;//     .line 520
a=0;//     .local v4, "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v4=(Null);
a=0;//     iget-boolean v8, v4, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 521
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 518
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 523
a=0;//     :cond_2
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V
a=0;// 
a=0;//     .line 524
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     iget-object v10, v4, Landroid/support/v4/app/LoaderManagerImpl;->mWho:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v10}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 528
a=0;//     .end local v0    # "N":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     .end local v5    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     move-object v6, v9
a=0;// 
a=0;//     .line 538
a=0;//     :goto_3
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 532
a=0;//     :cond_4
a=0;//     #v6=(Uninit);
a=0;//     new-instance v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     invoke-direct {v6}, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;-><init>()V
a=0;// 
a=0;//     .line 533
a=0;//     .local v6, "nci":Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
a=0;//     #v6=(Reference,Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;);
a=0;//     iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->activity:Ljava/lang/Object;
a=0;// 
a=0;//     .line 534
a=0;//     iput-object v1, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;
a=0;// 
a=0;//     .line 535
a=0;//     iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->children:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     .line 536
a=0;//     iput-object v2, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 537
a=0;//     iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     iput-object v8, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 548
a=0;//     .local v0, "p":Landroid/os/Parcelable;
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 549
a=0;//     const-string v1, "android:support:fragments"
a=0;// 
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 551
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStart()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 559
a=0;//     #v6=(One);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     .line 561
a=0;//     iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     .line 562
a=0;//     iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z
a=0;// 
a=0;//     .line 563
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4, v6}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 565
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 566
a=0;//     iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z
a=0;// 
a=0;//     .line 567
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V
a=0;// 
a=0;//     .line 570
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     .line 573
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 574
a=0;//     iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
a=0;// 
a=0;//     .line 584
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     .line 588
a=0;//     :cond_2
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/util/SimpleArrayMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 591
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v3, v0, [Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 592
a=0;//     .local v3, "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v3=(Reference,[Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     add-int/lit8 v1, v0, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_4
a=0;// 
a=0;//     .line 593
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     aput-object v4, v3, v1
a=0;// 
a=0;//     .line 592
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 577
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 578
a=0;//     const-string v4, "(root)"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p0, v4, v5, v7}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     iget-boolean v4, v4, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 581
a=0;//     iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/app/LoaderManagerImpl;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 595
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v3=(Reference,[Landroid/support/v4/app/LoaderManagerImpl;);v5=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     if-ge v1, v0, :cond_5
a=0;// 
a=0;//     .line 596
a=0;//     aget-object v2, v3, v1
a=0;// 
a=0;//     .line 597
a=0;//     .local v2, "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->finishRetain()V
a=0;// 
a=0;//     .line 598
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V
a=0;// 
a=0;//     .line 595
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 601
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "lm":Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     .end local v3    # "loaders":[Landroid/support/v4/app/LoaderManagerImpl;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 608
a=0;//     #v1=(One);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 610
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     .line 611
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 613
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V
a=0;// 
a=0;//     .line 614
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityForResult(Landroid/content/Intent;I)V
a=0;//     .locals 2
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "requestCode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 837
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     const/high16 v0, -0x10000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p2
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 838
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Can only use lower 16 bits for requestCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 841
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
a=0;//     .locals 2
a=0;//     .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;//     .param p3, "requestCode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 848
a=0;//     #v0=(Byte);
a=0;//     if-ne p3, v0, :cond_0
a=0;// 
a=0;//     .line 849
a=0;//     invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 856
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 852
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(Uninit);
a=0;//     const/high16 v0, -0x10000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p3
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 853
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Can only use lower 16 bits for requestCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 855
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     shl-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     const v1, 0xffff
a=0;// 
a=0;//     #v1=(Char);
a=0;//     and-int/2addr v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public supportInvalidateOptionsMenu()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 649
a=0;//     invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 656
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 655
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
