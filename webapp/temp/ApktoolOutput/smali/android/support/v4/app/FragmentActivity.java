package android.support.v4.app; class FragmentActivity {/*

.class public Landroid/support/v4/app/FragmentActivity;
.super Landroid/app/Activity;
.source "FragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/FragmentActivity$FragmentTag;,
        Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    }
.end annotation


# static fields
.field static final FRAGMENTS_TAG:Ljava/lang/String; = "android:support:fragments"

.field private static final HONEYCOMB:I = 0xb

.field static final MSG_REALLY_STOPPED:I = 0x1

.field static final MSG_RESUME_PENDING:I = 0x2

.field private static final TAG:Ljava/lang/String; = "FragmentActivity"


# instance fields
.field mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v4/app/LoaderManagerImpl;",
            ">;"
        }
    .end annotation
.end field

.field mCheckedForLoaderManager:Z

.field final mContainer:Landroid/support/v4/app/FragmentContainer;

.field mCreated:Z

.field final mFragments:Landroid/support/v4/app/FragmentManagerImpl;

.field final mHandler:Landroid/os/Handler;

.field mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

.field mLoadersStarted:Z

.field mOptionsMenuInvalidated:Z

.field mReallyStopped:Z

.field mResumed:Z

.field mRetaining:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 87
    #p0=(Reference);
    new-instance v0, Landroid/support/v4/app/FragmentActivity$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$1;-><init>(Landroid/support/v4/app/FragmentActivity;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    .line 106
    new-instance v0, Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerImpl;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    .line 107
    new-instance v0, Landroid/support/v4/app/FragmentActivity$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/FragmentActivity$2;-><init>(Landroid/support/v4/app/FragmentActivity;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;

    .line 135
    return-void
.end method

.method private dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    .locals 5
    .parameter "prefix"
    .parameter "writer"
    .parameter "view"

    .prologue
    .line 762
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 763
    if-nez p3, :cond_1

    .line 764
    const-string v3, "null"

    #v3=(Reference);
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 780
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 767
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-static {p3}, Landroid/support/v4/app/FragmentActivity;->viewToString(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 768
    instance-of v3, p3, Landroid/view/ViewGroup;

    #v3=(Boolean);
    if-eqz v3, :cond_0

    move-object v1, p3

    .line 771
    #v1=(Reference);
    check-cast v1, Landroid/view/ViewGroup;

    .line 772
    .local v1, grp:Landroid/view/ViewGroup;
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 773
    .local v0, N:I
    #v0=(Integer);
    if-lez v0, :cond_0

    .line 776
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "  "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 777
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v2=(Integer);
    if-ge v2, v0, :cond_0

    .line 778
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, p1, p2, v3}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 777
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private static viewToString(Landroid/view/View;)Ljava/lang/String;
    .locals 12
    .parameter "view"

    .prologue
    const/16 v9, 0x56

    #v9=(PosByte);
    const/16 v7, 0x46

    #v7=(PosByte);
    const/16 v11, 0x2c

    #v11=(PosByte);
    const/16 v10, 0x20

    #v10=(PosByte);
    const/16 v8, 0x2e

    .line 696
    #v8=(PosByte);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    const/16 v6, 0x80

    #v6=(PosShort);
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 697
    .local v2, out:Ljava/lang/StringBuilder;
    #v2=(Reference);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    const/16 v6, 0x7b

    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 699
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v6

    #v6=(Integer);
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 701
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v6

    #v6=(Integer);
    sparse-switch v6, :sswitch_data_0

    .line 705
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 707
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    move v6, v7

    :goto_1
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 708
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    const/16 v6, 0x45

    :goto_2
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 709
    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_4

    move v6, v8

    :goto_3
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 710
    invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_5

    const/16 v6, 0x48

    :goto_4
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 711
    invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_6

    move v6, v9

    :goto_5
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 712
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_7

    const/16 v6, 0x43

    :goto_6
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 713
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_8

    const/16 v6, 0x4c

    :goto_7
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 714
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 715
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_9

    :goto_8
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 716
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x53

    :goto_9
    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 717
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_0

    const/16 v8, 0x50

    :cond_0
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 718
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 719
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 720
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 721
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 722
    const/16 v6, 0x2d

    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 723
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v6

    #v6=(Integer);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 724
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 725
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 726
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    .line 727
    .local v1, id:I
    #v1=(Integer);
    const/4 v6, -0x1

    #v6=(Byte);
    if-eq v1, v6, :cond_1

    .line 728
    const-string v6, " #"

    #v6=(Reference);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 731
    .local v4, r:Landroid/content/res/Resources;
    #v4=(Reference);
    if-eqz v1, :cond_1

    if-eqz v4, :cond_1

    .line 734
    const/high16 v6, -0x100

    #v6=(Integer);
    and-int/2addr v6, v1

    sparse-switch v6, :sswitch_data_1

    .line 742
    :try_start_0
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v3

    .line 745
    .local v3, pkgname:Ljava/lang/String;
    :goto_a
    #v3=(Reference);
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v5

    .line 746
    .local v5, typename:Ljava/lang/String;
    #v5=(Reference);
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    .line 747
    .local v0, entryname:Ljava/lang/String;
    #v0=(Reference);
    const-string v6, " "

    #v6=(Reference);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    const-string v6, ":"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 757
    .end local v0           #entryname:Ljava/lang/String;
    .end local v3           #pkgname:Ljava/lang/String;
    .end local v4           #r:Landroid/content/res/Resources;
    .end local v5           #typename:Ljava/lang/String;
    :cond_1
    :goto_b
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    const-string v6, "}"

    #v6=(Reference);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 702
    .end local v1           #id:I
    :sswitch_0
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 703
    :sswitch_1
    const/16 v6, 0x49

    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 704
    :sswitch_2
    #v6=(Integer);
    const/16 v6, 0x47

    #v6=(PosByte);
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_2
    #v6=(Boolean);
    move v6, v8

    .line 707
    #v6=(PosByte);
    goto/16 :goto_1

    :cond_3
    #v6=(Boolean);
    move v6, v8

    .line 708
    #v6=(PosByte);
    goto/16 :goto_2

    .line 709
    :cond_4
    #v6=(Boolean);
    const/16 v6, 0x44

    #v6=(PosByte);
    goto/16 :goto_3

    :cond_5
    #v6=(Boolean);
    move v6, v8

    .line 710
    #v6=(PosByte);
    goto/16 :goto_4

    :cond_6
    #v6=(Boolean);
    move v6, v8

    .line 711
    #v6=(PosByte);
    goto/16 :goto_5

    :cond_7
    #v6=(Boolean);
    move v6, v8

    .line 712
    #v6=(PosByte);
    goto/16 :goto_6

    :cond_8
    #v6=(Boolean);
    move v6, v8

    .line 713
    #v6=(PosByte);
    goto/16 :goto_7

    :cond_9
    #v6=(Boolean);
    move v7, v8

    .line 715
    goto/16 :goto_8

    :cond_a
    move v6, v8

    .line 716
    #v6=(PosByte);
    goto/16 :goto_9

    .line 736
    .restart local v1       #id:I
    .restart local v4       #r:Landroid/content/res/Resources;
    :sswitch_3
    :try_start_1
    #v1=(Integer);v4=(Reference);v6=(Integer);
    const-string v3, "app"

    .line 737
    .restart local v3       #pkgname:Ljava/lang/String;
    #v3=(Reference);
    goto :goto_a

    .line 739
    .end local v3           #pkgname:Ljava/lang/String;
    :sswitch_4
    #v3=(Uninit);
    const-string v3, "android"
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 740
    .restart local v3       #pkgname:Ljava/lang/String;
    #v3=(Reference);
    goto :goto_a

    .line 753
    .end local v3           #pkgname:Ljava/lang/String;
    :catch_0
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v6

    #v6=(Reference);
    goto :goto_b

    .line 701
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_2
    .end sparse-switch

    .line 734
    :sswitch_data_1
    .sparse-switch
        0x1000000 -> :sswitch_4
        0x7f000000 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method doReallyStop(Z)V
    .locals 2
    .parameter "retaining"

    .prologue
    const/4 v1, 0x1

    .line 783
    #v1=(One);
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 784
    iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z

    .line 785
    iput-boolean p1, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z

    .line 786
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 787
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onReallyStop()V

    .line 789
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4
    .parameter "prefix"
    .parameter "fd"
    .parameter "writer"
    .parameter "args"

    .prologue
    .line 669
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0xb

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 673
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Local FragmentActivity "

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 674
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 675
    const-string v1, " State:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 676
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 677
    .local v0, innerPrefix:Ljava/lang/String;
    #v0=(Reference);
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 678
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z

    #v1=(Boolean);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, "mResumed="

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 679
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z

    #v1=(Boolean);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 680
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z

    #v1=(Boolean);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mReallyStopped="

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 681
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z

    #v1=(Boolean);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 682
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mLoadersStarted="

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 683
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    #v1=(Boolean);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 684
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 685
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Loader Manager "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 686
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 687
    const-string v1, ":"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 688
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p2, p3, p4}, Landroid/support/v4/app/LoaderManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 690
    :cond_1
    #v3=(Conflicted);
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/support/v4/app/FragmentManagerImpl;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 691
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "View Hierarchy:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 692
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v1, p3, v2}, Landroid/support/v4/app/FragmentActivity;->dumpViewHierarchy(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 693
    return-void
.end method

.method public getLastCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 633
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;

    .line 635
    .local v0, nc:Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    if-eqz v0, :cond_0

    iget-object v1, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;

    :goto_0
    #v1=(Reference);
    return-object v1

    :cond_0
    #v1=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
    .locals 2
    .parameter "who"
    .parameter "started"
    .parameter "create"

    .prologue
    .line 886
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 887
    new-instance v1, Landroid/support/v4/util/SimpleArrayMap;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    .line 889
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;

    .line 890
    .local v0, lm:Landroid/support/v4/app/LoaderManagerImpl;
    if-nez v0, :cond_2

    .line 891
    if-eqz p3, :cond_1

    .line 892
    new-instance v0, Landroid/support/v4/app/LoaderManagerImpl;

    .end local v0           #lm:Landroid/support/v4/app/LoaderManagerImpl;
    #v0=(UninitRef);
    invoke-direct {v0, p1, p0, p2}, Landroid/support/v4/app/LoaderManagerImpl;-><init>(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V

    .line 893
    .restart local v0       #lm:Landroid/support/v4/app/LoaderManagerImpl;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    :cond_1
    :goto_0
    return-object v0

    .line 896
    :cond_2
    invoke-virtual {v0, p0}, Landroid/support/v4/app/LoaderManagerImpl;->updateActivity(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_0
.end method

.method public getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
    .locals 1

    .prologue
    .line 828
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    return-object v0
.end method

.method public getSupportLoaderManager()Landroid/support/v4/app/LoaderManager;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 877
    #v2=(One);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 878
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    .line 882
    :goto_0
    #v1=(Conflicted);
    return-object v0

    .line 880
    :cond_0
    #v1=(Uninit);
    iput-boolean v2, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z

    .line 881
    const-string v0, "(root)"

    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    #v1=(Boolean);
    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    .line 882
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    goto :goto_0
.end method

.method invalidateSupportFragment(Ljava/lang/String;)V
    .locals 2
    .parameter "who"

    .prologue
    .line 860
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 861
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/LoaderManagerImpl;

    .line 862
    .local v0, lm:Landroid/support/v4/app/LoaderManagerImpl;
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 863
    invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V

    .line 864
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .end local v0           #lm:Landroid/support/v4/app/LoaderManagerImpl;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 153
    iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V

    .line 154
    shr-int/lit8 v1, p1, 0x10

    .line 155
    .local v1, index:I
    #v1=(Short);
    if-eqz v1, :cond_3

    .line 156
    add-int/lit8 v1, v1, -0x1

    .line 157
    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    if-ltz v1, :cond_0

    iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-lt v1, v2, :cond_1

    .line 158
    :cond_0
    #v2=(Conflicted);
    const-string v2, "FragmentActivity"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Activity result fragment index out of range: 0x"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 162
    :cond_1
    #v0=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
    iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v2=(Reference);
    iget-object v2, v2, Landroid/support/v4/app/FragmentManagerImpl;->mActive:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 163
    .local v0, frag:Landroid/support/v4/app/Fragment;
    if-nez v0, :cond_2

    .line 164
    const-string v2, "FragmentActivity"

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Activity result no fragment exists for index: 0x"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 167
    :cond_2
    #v3=(Uninit);v4=(Uninit);
    const v2, 0xffff

    #v2=(Char);
    and-int/2addr v2, p1

    #v2=(Integer);
    invoke-virtual {v0, v2, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 172
    .end local v0           #frag:Landroid/support/v4/app/Fragment;
    :cond_3
    #v0=(Uninit);v1=(Short);v2=(Reference);
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onAttachFragment(Landroid/support/v4/app/Fragment;)V
    .locals 0
    .parameter "fragment"

    .prologue
    .line 821
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackImmediate()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 181
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 183
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter "newConfig"

    .prologue
    .line 190
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 191
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 192
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter "savedInstanceState"

    .prologue
    const/4 v2, 0x0

    .line 199
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mContainer:Landroid/support/v4/app/FragmentContainer;

    #v4=(Reference);
    invoke-virtual {v3, p0, v4, v2}, Landroid/support/v4/app/FragmentManagerImpl;->attachActivity(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V

    .line 201
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v3

    if-nez v3, :cond_0

    .line 202
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-virtual {v3, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 205
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 207
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;

    .line 209
    .local v0, nc:Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    if-eqz v0, :cond_1

    .line 210
    iget-object v3, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;

    iput-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    .line 212
    :cond_1
    if-eqz p1, :cond_3

    .line 213
    const-string v3, "android:support:fragments"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    .line 214
    .local v1, p:Landroid/os/Parcelable;
    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    if-eqz v0, :cond_2

    iget-object v2, v0, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;

    :cond_2
    #v2=(Reference);
    invoke-virtual {v3, v1, v2}, Landroid/support/v4/app/FragmentManagerImpl;->restoreAllState(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 216
    .end local v1           #p:Landroid/os/Parcelable;
    :cond_3
    #v1=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreate()V

    .line 217
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 3
    .parameter "featureId"
    .parameter "menu"

    .prologue
    .line 224
    if-nez p1, :cond_1

    .line 225
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 226
    .local v0, show:Z
    #v0=(Boolean);
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    #v1=(Boolean);
    or-int/2addr v0, v1

    .line 227
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0xb

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 235
    .end local v0           #show:Z
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return v0

    .line 233
    .restart local v0       #show:Z
    :cond_0
    #v1=(Integer);v2=(PosByte);
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    .line 235
    .end local v0           #show:Z
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11
    .parameter "name"
    .end parameter
    .parameter "context"
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end parameter
    .parameter "attrs"
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end parameter

    .prologue
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v10, 0x1

    #v10=(One);
    const/4 v8, -0x1

    .line 243
    #v8=(Byte);
    const-string v7, "fragment"

    #v7=(Reference);
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_0

    .line 244
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v7

    .line 324
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference);v8=(Conflicted);v9=(Conflicted);
    return-object v7

    .line 247
    :cond_0
    #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Byte);v9=(Uninit);
    const-string v7, "class"

    #v7=(Reference);
    invoke-interface {p3, v3, v7}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 248
    .local v2, fname:Ljava/lang/String;
    #v2=(Reference);
    sget-object v7, Landroid/support/v4/app/FragmentActivity$FragmentTag;->Fragment:[I

    invoke-virtual {p2, p3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 249
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    if-nez v2, :cond_1

    .line 250
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 252
    :cond_1
    invoke-virtual {v0, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 253
    .local v4, id:I
    #v4=(Integer);
    const/4 v7, 0x2

    #v7=(PosByte);
    invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 254
    .local v6, tag:Ljava/lang/String;
    #v6=(Reference);
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 256
    invoke-static {p0, v2}, Landroid/support/v4/app/Fragment;->isSupportFragmentClass(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_2

    .line 259
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    goto :goto_0

    .line 262
    :cond_2
    #v7=(Boolean);
    const/4 v5, 0x0

    .line 263
    .local v5, parent:Landroid/view/View;
    #v5=(Null);
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v1

    .line 264
    .local v1, containerId:I
    :cond_3
    #v1=(Integer);
    if-ne v1, v8, :cond_4

    if-ne v4, v8, :cond_4

    if-nez v6, :cond_4

    .line 265
    new-instance v7, Ljava/lang/IllegalArgumentException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 272
    :cond_4
    #v7=(Boolean);v8=(Byte);v9=(Uninit);
    if-eq v4, v8, :cond_5

    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    invoke-virtual {v7, v4}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 273
    .local v3, fragment:Landroid/support/v4/app/Fragment;
    :cond_5
    #v3=(Reference);v7=(Conflicted);
    if-nez v3, :cond_6

    if-eqz v6, :cond_6

    .line 274
    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    invoke-virtual {v7, v6}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 276
    :cond_6
    #v7=(Conflicted);
    if-nez v3, :cond_7

    if-eq v1, v8, :cond_7

    .line 277
    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    invoke-virtual {v7, v1}, Landroid/support/v4/app/FragmentManagerImpl;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 280
    :cond_7
    #v7=(Conflicted);
    sget-boolean v7, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z

    #v7=(Boolean);
    if-eqz v7, :cond_8

    const-string v7, "FragmentActivity"

    #v7=(Reference);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "onCreateView: id=0x"

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " fname="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " existing="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    :cond_8
    #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-nez v3, :cond_a

    .line 284
    invoke-static {p0, v2}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 285
    iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mFromLayout:Z

    .line 286
    if-eqz v4, :cond_9

    move v7, v4

    :goto_1
    #v7=(Integer);
    iput v7, v3, Landroid/support/v4/app/Fragment;->mFragmentId:I

    .line 287
    iput v1, v3, Landroid/support/v4/app/Fragment;->mContainerId:I

    .line 288
    iput-object v6, v3, Landroid/support/v4/app/Fragment;->mTag:Ljava/lang/String;

    .line 289
    iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z

    .line 290
    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    iput-object v7, v3, Landroid/support/v4/app/Fragment;->mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;

    .line 291
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v3, p0, p3, v7}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 292
    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v7, v3, v10}, Landroid/support/v4/app/FragmentManagerImpl;->addFragment(Landroid/support/v4/app/Fragment;Z)V

    .line 314
    :goto_2
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;

    if-nez v7, :cond_d

    .line 315
    new-instance v7, Ljava/lang/IllegalStateException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "Fragment "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " did not create a view."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    :cond_9
    #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move v7, v1

    .line 286
    #v7=(Integer);
    goto :goto_1

    .line 294
    :cond_a
    #v7=(Conflicted);
    iget-boolean v7, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z

    #v7=(Boolean);
    if-eqz v7, :cond_b

    .line 297
    new-instance v7, Ljava/lang/IllegalArgumentException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ": Duplicate id 0x"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ", tag "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ", or parent id 0x"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " with another fragment for "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 304
    :cond_b
    #v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
    iput-boolean v10, v3, Landroid/support/v4/app/Fragment;->mInLayout:Z

    .line 308
    iget-boolean v7, v3, Landroid/support/v4/app/Fragment;->mRetaining:Z

    if-nez v7, :cond_c

    .line 309
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    #v7=(Reference);
    invoke-virtual {v3, p0, p3, v7}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 311
    :cond_c
    #v7=(Conflicted);
    iget-object v7, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v7=(Reference);
    invoke-virtual {v7, v3}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;)V

    goto :goto_2

    .line 318
    :cond_d
    if-eqz v4, :cond_e

    .line 319
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v7, v4}, Landroid/view/View;->setId(I)V

    .line 321
    :cond_e
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_f

    .line 322
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v7, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 324
    :cond_f
    iget-object v7, v3, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 332
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 334
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V

    .line 336
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchDestroy()V

    .line 337
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    if-eqz v0, :cond_0

    .line 338
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V

    .line 340
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 347
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/4 v1, 0x5

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    const/4 v0, 0x4

    #v0=(PosByte);
    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    .line 352
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V

    .line 353
    const/4 v0, 0x1

    .line 356
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 364
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 365
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchLowMemory()V

    .line 366
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .parameter "featureId"
    .parameter "item"

    .prologue
    .line 373
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 374
    const/4 v0, 0x1

    .line 385
    :goto_0
    return v0

    .line 377
    :cond_0
    sparse-switch p1, :sswitch_data_0

    .line 385
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 379
    :sswitch_0
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 382
    :sswitch_1
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 377
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .parameter "intent"

    .prologue
    .line 428
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 429
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V

    .line 430
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1
    .parameter "featureId"
    .parameter "menu"

    .prologue
    .line 394
    packed-switch p1, :pswitch_data_0

    .line 399
    :goto_0
    #v0=(Conflicted);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 400
    return-void

    .line 396
    :pswitch_0
    #v0=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchOptionsMenuClosed(Landroid/view/Menu;)V

    goto :goto_0

    .line 394
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 407
    #v1=(PosByte);
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 408
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z

    .line 409
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 411
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V

    .line 413
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPause()V

    .line 414
    return-void
.end method

.method protected onPostResume()V
    .locals 2

    .prologue
    .line 454
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 455
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 456
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V

    .line 457
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z

    .line 458
    return-void
.end method

.method protected onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 1
    .parameter "view"
    .parameter "menu"

    .prologue
    .line 492
    const/4 v0, 0x0

    #v0=(Null);
    invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 2
    .parameter "featureId"
    .parameter "view"
    .parameter "menu"

    .prologue
    .line 475
    if-nez p1, :cond_1

    if-eqz p3, :cond_1

    .line 476
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 477
    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z

    .line 478
    invoke-interface {p3}, Landroid/view/Menu;->clear()V

    .line 479
    invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/FragmentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 481
    :cond_0
    #v1=(Boolean);
    invoke-virtual {p0, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 482
    .local v0, goforit:Z
    #v0=(Boolean);
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    invoke-virtual {v1, p3}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v1

    #v1=(Boolean);
    or-int/2addr v0, v1

    .line 485
    .end local v0           #goforit:Z
    :goto_0
    #v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method onReallyStop()V
    .locals 1

    .prologue
    .line 799
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 800
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    .line 801
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 802
    iget-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mRetaining:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 803
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doStop()V

    .line 810
    :cond_0
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchReallyStop()V

    .line 811
    return-void

    .line 805
    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/LoaderManagerImpl;->doRetain()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 443
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 444
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 445
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mResumed:Z

    .line 446
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z

    .line 447
    return-void
.end method

.method protected onResumeFragments()V
    .locals 1

    .prologue
    .line 467
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchResume()V

    .line 468
    return-void
.end method

.method public onRetainCustomNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 625
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 11

    .prologue
    const/4 v9, 0x0

    .line 502
    #v9=(Null);
    iget-boolean v8, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z

    #v8=(Boolean);
    if-eqz v8, :cond_0

    .line 503
    const/4 v8, 0x1

    #v8=(One);
    invoke-virtual {p0, v8}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V

    .line 506
    :cond_0
    #v8=(Boolean);
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->onRetainCustomNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    .line 508
    .local v1, custom:Ljava/lang/Object;
    #v1=(Reference);
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/support/v4/app/FragmentManagerImpl;->retainNonConfig()Ljava/util/ArrayList;

    move-result-object v2

    .line 509
    .local v2, fragments:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
    #v2=(Reference);
    const/4 v7, 0x0

    .line 510
    .local v7, retainLoaders:Z
    #v7=(Null);
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    if-eqz v8, :cond_3

    .line 513
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v8}, Landroid/support/v4/util/SimpleArrayMap;->size()I

    move-result v0

    .line 514
    .local v0, N:I
    #v0=(Integer);
    new-array v5, v0, [Landroid/support/v4/app/LoaderManagerImpl;

    .line 515
    .local v5, loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    #v5=(Reference);
    add-int/lit8 v3, v0, -0x1

    .local v3, i:I
    :goto_0
    #v3=(Integer);
    if-ltz v3, :cond_1

    .line 516
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v8, v3}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/support/v4/app/LoaderManagerImpl;

    aput-object v8, v5, v3

    .line 515
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 518
    :cond_1
    const/4 v3, 0x0

    :goto_1
    #v4=(Conflicted);v7=(Boolean);v8=(Conflicted);v10=(Conflicted);
    if-ge v3, v0, :cond_3

    .line 519
    aget-object v4, v5, v3

    .line 520
    .local v4, lm:Landroid/support/v4/app/LoaderManagerImpl;
    #v4=(Null);
    iget-boolean v8, v4, Landroid/support/v4/app/LoaderManagerImpl;->mRetaining:Z

    #v8=(Boolean);
    if-eqz v8, :cond_2

    .line 521
    const/4 v7, 0x1

    .line 518
    :goto_2
    #v8=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 523
    :cond_2
    #v8=(Boolean);
    invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doDestroy()V

    .line 524
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    #v8=(Reference);
    iget-object v10, v4, Landroid/support/v4/app/LoaderManagerImpl;->mWho:Ljava/lang/String;

    #v10=(Reference);
    invoke-virtual {v8, v10}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 528
    .end local v0           #N:I
    .end local v3           #i:I
    .end local v4           #lm:Landroid/support/v4/app/LoaderManagerImpl;
    .end local v5           #loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    :cond_3
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);
    if-nez v2, :cond_4

    if-nez v7, :cond_4

    if-nez v1, :cond_4

    move-object v6, v9

    .line 538
    :goto_3
    #v6=(Reference);
    return-object v6

    .line 532
    :cond_4
    #v6=(Uninit);
    new-instance v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;-><init>()V

    .line 533
    .local v6, nci:Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
    #v6=(Reference);
    iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->activity:Ljava/lang/Object;

    .line 534
    iput-object v1, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->custom:Ljava/lang/Object;

    .line 535
    iput-object v9, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->children:Landroid/support/v4/util/SimpleArrayMap;

    .line 536
    iput-object v2, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->fragments:Ljava/util/ArrayList;

    .line 537
    iget-object v8, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    #v8=(Reference);
    iput-object v8, v6, Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;->loaders:Landroid/support/v4/util/SimpleArrayMap;

    goto :goto_3
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .parameter "outState"

    .prologue
    .line 546
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 547
    iget-object v1, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManagerImpl;->saveAllState()Landroid/os/Parcelable;

    move-result-object v0

    .line 548
    .local v0, p:Landroid/os/Parcelable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 549
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 551
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x1

    .line 559
    #v6=(One);
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 561
    iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z

    .line 562
    iput-boolean v7, p0, Landroid/support/v4/app/FragmentActivity;->mReallyStopped:Z

    .line 563
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v4=(Reference);
    invoke-virtual {v4, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 565
    iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 566
    iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCreated:Z

    .line 567
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchActivityCreated()V

    .line 570
    :cond_0
    #v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->noteStateNotSaved()V

    .line 571
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z

    .line 573
    iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    #v4=(Boolean);
    if-nez v4, :cond_2

    .line 574
    iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    .line 575
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v4=(Reference);
    if-eqz v4, :cond_3

    .line 576
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V

    .line 584
    :cond_1
    :goto_0
    #v4=(Conflicted);v5=(Conflicted);
    iput-boolean v6, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z

    .line 588
    :cond_2
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStart()V

    .line 589
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    if-eqz v4, :cond_5

    .line 590
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v4}, Landroid/support/v4/util/SimpleArrayMap;->size()I

    move-result v0

    .line 591
    .local v0, N:I
    #v0=(Integer);
    new-array v3, v0, [Landroid/support/v4/app/LoaderManagerImpl;

    .line 592
    .local v3, loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    #v3=(Reference);
    add-int/lit8 v1, v0, -0x1

    .local v1, i:I
    :goto_1
    #v1=(Integer);
    if-ltz v1, :cond_4

    .line 593
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v4, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/app/LoaderManagerImpl;

    aput-object v4, v3, v1

    .line 592
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 577
    .end local v0           #N:I
    .end local v1           #i:I
    .end local v3           #loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    :cond_3
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(Uninit);
    iget-boolean v4, p0, Landroid/support/v4/app/FragmentActivity;->mCheckedForLoaderManager:Z

    #v4=(Boolean);
    if-nez v4, :cond_1

    .line 578
    const-string v4, "(root)"

    #v4=(Reference);
    iget-boolean v5, p0, Landroid/support/v4/app/FragmentActivity;->mLoadersStarted:Z

    #v5=(Boolean);
    invoke-virtual {p0, v4, v5, v7}, Landroid/support/v4/app/FragmentActivity;->getLoaderManager(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;

    move-result-object v4

    iput-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    .line 580
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    if-eqz v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    iget-boolean v4, v4, Landroid/support/v4/app/LoaderManagerImpl;->mStarted:Z

    #v4=(Boolean);
    if-nez v4, :cond_1

    .line 581
    iget-object v4, p0, Landroid/support/v4/app/FragmentActivity;->mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/LoaderManagerImpl;->doStart()V

    goto :goto_0

    .line 595
    .restart local v0       #N:I
    .restart local v1       #i:I
    .restart local v3       #loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    :cond_4
    #v0=(Integer);v1=(Integer);v3=(Reference);v5=(Conflicted);
    const/4 v1, 0x0

    :goto_2
    #v2=(Conflicted);
    if-ge v1, v0, :cond_5

    .line 596
    aget-object v2, v3, v1

    .line 597
    .local v2, lm:Landroid/support/v4/app/LoaderManagerImpl;
    #v2=(Null);
    invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->finishRetain()V

    .line 598
    invoke-virtual {v2}, Landroid/support/v4/app/LoaderManagerImpl;->doReportStart()V

    .line 595
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 601
    .end local v0           #N:I
    .end local v1           #i:I
    .end local v2           #lm:Landroid/support/v4/app/LoaderManagerImpl;
    .end local v3           #loaders:[Landroid/support/v4/app/LoaderManagerImpl;
    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 608
    #v1=(One);
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 610
    iput-boolean v1, p0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z

    .line 611
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 613
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->dispatchStop()V

    .line 614
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 2
    .parameter "intent"
    .parameter "requestCode"

    .prologue
    .line 837
    const/4 v0, -0x1

    #v0=(Byte);
    if-eq p2, v0, :cond_0

    const/high16 v0, -0x1

    #v0=(Integer);
    and-int/2addr v0, p2

    if-eqz v0, :cond_0

    .line 838
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Can only use lower 16 bits for requestCode"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 840
    :cond_0
    #v0=(Integer);v1=(Uninit);
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 841
    return-void
.end method

.method public startActivityFromFragment(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    .locals 2
    .parameter "fragment"
    .parameter "intent"
    .parameter "requestCode"

    .prologue
    const/4 v0, -0x1

    .line 848
    #v0=(Byte);
    if-ne p3, v0, :cond_0

    .line 849
    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 856
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    return-void

    .line 852
    :cond_0
    #v0=(Byte);v1=(Uninit);
    const/high16 v0, -0x1

    #v0=(Integer);
    and-int/2addr v0, p3

    if-eqz v0, :cond_1

    .line 853
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Can only use lower 16 bits for requestCode"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 855
    :cond_1
    #v0=(Integer);v1=(Uninit);
    iget v0, p1, Landroid/support/v4/app/Fragment;->mIndex:I

    add-int/lit8 v0, v0, 0x1

    shl-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    #v1=(Char);
    and-int/2addr v1, p3

    #v1=(Integer);
    add-int/2addr v0, v1

    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 2

    .prologue
    .line 646
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 649
    invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V

    .line 656
    :goto_0
    return-void

    .line 655
    :cond_0
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentActivity;->mOptionsMenuInvalidated:Z

    goto :goto_0
.end method

*/}
