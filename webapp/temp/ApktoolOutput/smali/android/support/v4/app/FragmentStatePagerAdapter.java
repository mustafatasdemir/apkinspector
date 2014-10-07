package android.support.v4.app; class FragmentStatePagerAdapter {/*

.class public abstract Landroid/support/v4/app/FragmentStatePagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "FragmentStatePagerAdapter.java"


# static fields
.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "FragmentStatePagerAdapter"


# instance fields
.field private mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

.field private mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

.field private final mFragmentManager:Landroid/support/v4/app/FragmentManager;

.field private mFragments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private mSavedState:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment$SavedState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;)V
    .locals 2
    .parameter "fm"

    .prologue
    const/4 v1, 0x0

    .line 75
    #v1=(Null);
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 69
    #p0=(Reference);
    iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    .line 73
    iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    .line 76
    iput-object p1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 77
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 4
    .parameter "container"
    .parameter "position"
    .parameter "object"

    .prologue
    const/4 v3, 0x0

    .line 126
    #v3=(Null);
    move-object v0, p3

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 128
    .local v0, fragment:Landroid/support/v4/app/Fragment;
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 129
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 133
    :cond_0
    :goto_0
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-gt v1, p2, :cond_1

    .line 134
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 136
    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 137
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 140
    return-void
.end method

.method public finishUpdate(Landroid/view/ViewGroup;)V
    .locals 1
    .parameter "container"

    .prologue
    .line 160
    iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 162
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 163
    iget-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 165
    :cond_0
    return-void
.end method

.method public abstract getItem(I)Landroid/support/v4/app/Fragment;
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6
    .parameter "container"
    .parameter "position"

    .prologue
    const/4 v5, 0x0

    .line 94
    #v5=(Null);
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-le v3, p2, :cond_0

    .line 95
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 96
    .local v0, f:Landroid/support/v4/app/Fragment;
    if-eqz v0, :cond_0

    .line 121
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-object v0

    .line 101
    :cond_0
    #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Conflicted);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    #v3=(Reference);
    if-nez v3, :cond_1

    .line 102
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 105
    :cond_1
    invoke-virtual {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 107
    .local v1, fragment:Landroid/support/v4/app/Fragment;
    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-le v3, p2, :cond_2

    .line 108
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/Fragment$SavedState;

    .line 109
    .local v2, fss:Landroid/support/v4/app/Fragment$SavedState;
    if-eqz v2, :cond_2

    .line 110
    invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setInitialSavedState(Landroid/support/v4/app/Fragment$SavedState;)V

    .line 113
    .end local v2           #fss:Landroid/support/v4/app/Fragment$SavedState;
    :cond_2
    :goto_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-gt v3, p2, :cond_3

    .line 114
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 116
    :cond_3
    #v3=(Integer);v4=(Conflicted);
    invoke-virtual {v1, v5}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V

    .line 117
    invoke-virtual {v1, v5}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 118
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v3, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-object v0, v1

    .line 121
    #v0=(Reference);
    goto :goto_0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1
    .parameter "view"
    .parameter "object"

    .prologue
    .line 169
    check-cast p2, Landroid/support/v4/app/Fragment;

    .end local p2
    invoke-virtual {p2}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 11
    .parameter "state"
    .parameter "loader"

    .prologue
    .line 196
    if-eqz p1, :cond_4

    move-object v0, p1

    .line 197
    #v0=(Reference);
    check-cast v0, Landroid/os/Bundle;

    .line 198
    .local v0, bundle:Landroid/os/Bundle;
    invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 199
    const-string v8, "states"

    #v8=(Reference);
    invoke-virtual {v0, v8}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v2

    .line 200
    .local v2, fss:[Landroid/os/Parcelable;
    #v2=(Reference);
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 201
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 202
    if-eqz v2, :cond_0

    .line 203
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v3=(Integer);v9=(Conflicted);
    array-length v8, v2

    #v8=(Integer);
    if-ge v3, v8, :cond_0

    .line 204
    iget-object v9, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v9=(Reference);
    aget-object v8, v2, v3

    #v8=(Null);
    check-cast v8, Landroid/support/v4/app/Fragment$SavedState;

    #v8=(Reference);
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 207
    .end local v3           #i:I
    :cond_0
    #v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v7

    .line 208
    .local v7, keys:Ljava/lang/Iterable;,"Ljava/lang/Iterable<Ljava/lang/String;>;"
    #v7=(Reference);
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, i$:Ljava/util/Iterator;
    :cond_1
    :goto_1
    #v1=(Conflicted);v4=(Reference);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/lang/String;

    .line 209
    .local v6, key:Ljava/lang/String;
    const-string v8, "f"

    #v8=(Reference);
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_1

    .line 210
    const/4 v8, 0x1

    #v8=(One);
    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 211
    .local v5, index:I
    #v5=(Integer);
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v8, v0, v6}, Landroid/support/v4/app/FragmentManager;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 212
    .local v1, f:Landroid/support/v4/app/Fragment;
    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 213
    :goto_2
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    #v8=(Integer);
    if-gt v8, v5, :cond_2

    .line 214
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v8=(Reference);
    const/4 v9, 0x0

    #v9=(Null);
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 216
    :cond_2
    #v8=(Integer);v9=(Conflicted);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-virtual {v1, v8}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V

    .line 217
    iget-object v8, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v5, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 219
    :cond_3
    const-string v8, "FragmentStatePagerAdapter"

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    const-string v10, "Bad fragment at key "

    #v10=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 224
    .end local v0           #bundle:Landroid/os/Bundle;
    .end local v1           #f:Landroid/support/v4/app/Fragment;
    .end local v2           #fss:[Landroid/os/Parcelable;
    .end local v4           #i$:Ljava/util/Iterator;
    .end local v5           #index:I
    .end local v6           #key:Ljava/lang/String;
    .end local v7           #keys:Ljava/lang/Iterable;,"Ljava/lang/Iterable<Ljava/lang/String;>;"
    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 7

    .prologue
    .line 174
    const/4 v4, 0x0

    .line 175
    .local v4, state:Landroid/os/Bundle;
    #v4=(Null);
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    if-lez v5, :cond_0

    .line 176
    new-instance v4, Landroid/os/Bundle;

    .end local v4           #state:Landroid/os/Bundle;
    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 177
    .restart local v4       #state:Landroid/os/Bundle;
    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    new-array v1, v5, [Landroid/support/v4/app/Fragment$SavedState;

    .line 178
    .local v1, fss:[Landroid/support/v4/app/Fragment$SavedState;
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mSavedState:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 179
    const-string v5, "states"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 181
    .end local v1           #fss:[Landroid/support/v4/app/Fragment$SavedState;
    :cond_0
    #v1=(Conflicted);v5=(Conflicted);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    if-ge v2, v5, :cond_3

    .line 182
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragments:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 183
    .local v0, f:Landroid/support/v4/app/Fragment;
    if-eqz v0, :cond_2

    .line 184
    if-nez v4, :cond_1

    .line 185
    new-instance v4, Landroid/os/Bundle;

    .end local v4           #state:Landroid/os/Bundle;
    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 187
    .restart local v4       #state:Landroid/os/Bundle;
    :cond_1
    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "f"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 188
    .local v3, key:Ljava/lang/String;
    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v5, v4, v3, v0}, Landroid/support/v4/app/FragmentManager;->putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 181
    .end local v3           #key:Ljava/lang/String;
    :cond_2
    #v3=(Conflicted);v6=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 191
    .end local v0           #f:Landroid/support/v4/app/Fragment;
    :cond_3
    #v0=(Conflicted);v5=(Integer);
    return-object v4
.end method

.method public setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 4
    .parameter "container"
    .parameter "position"
    .parameter "object"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 144
    #v2=(Null);
    move-object v0, p3

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 145
    .local v0, fragment:Landroid/support/v4/app/Fragment;
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    #v1=(Reference);
    if-eq v0, v1, :cond_2

    .line 146
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    if-eqz v1, :cond_0

    .line 147
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V

    .line 148
    iget-object v1, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 150
    :cond_0
    if-eqz v0, :cond_1

    .line 151
    invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setMenuVisibility(Z)V

    .line 152
    invoke-virtual {v0, v3}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 154
    :cond_1
    iput-object v0, p0, Landroid/support/v4/app/FragmentStatePagerAdapter;->mCurrentPrimaryItem:Landroid/support/v4/app/Fragment;

    .line 156
    :cond_2
    return-void
.end method

.method public startUpdate(Landroid/view/ViewGroup;)V
    .locals 0
    .parameter "container"

    .prologue
    .line 86
    return-void
.end method

*/}
