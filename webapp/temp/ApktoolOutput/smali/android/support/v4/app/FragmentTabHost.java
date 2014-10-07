package android.support.v4.app; class FragmentTabHost {/*

.class public Landroid/support/v4/app/FragmentTabHost;
.super Landroid/widget/TabHost;
.source "FragmentTabHost.java"

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/FragmentTabHost$1;,
        Landroid/support/v4/app/FragmentTabHost$SavedState;,
        Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;,
        Landroid/support/v4/app/FragmentTabHost$TabInfo;
    }
.end annotation


# instance fields
.field private mAttached:Z

.field private mContainerId:I

.field private mContext:Landroid/content/Context;

.field private mFragmentManager:Landroid/support/v4/app/FragmentManager;

.field private mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

.field private mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;

.field private mRealTabContent:Landroid/widget/FrameLayout;

.field private final mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/FragmentTabHost$TabInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x0

    .line 130
    #v1=(Null);
    invoke-direct {p0, p1, v1}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    .line 131
    invoke-direct {p0, p1, v1}, Landroid/support/v4/app/FragmentTabHost;->initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 132
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 135
    invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    .line 136
    invoke-direct {p0, p1, p2}, Landroid/support/v4/app/FragmentTabHost;->initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 137
    return-void
.end method

.method private doTabChanged(Ljava/lang/String;Landroid/support/v4/app/FragmentTransaction;)Landroid/support/v4/app/FragmentTransaction;
    .locals 6
    .parameter "tabId"
    .parameter "ft"

    .prologue
    .line 322
    const/4 v1, 0x0

    .line 323
    .local v1, newTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    #v1=(Null);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_1

    .line 324
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/FragmentTabHost$TabInfo;

    .line 325
    .local v2, tab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    invoke-static {v2}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 326
    move-object v1, v2

    .line 323
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 329
    .end local v2           #tab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    :cond_1
    #v2=(Conflicted);v3=(Integer);
    if-nez v1, :cond_2

    .line 330
    new-instance v3, Ljava/lang/IllegalStateException;

    #v3=(UninitRef);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "No tab known for tag "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 332
    :cond_2
    #v3=(Integer);v4=(Uninit);v5=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    #v3=(Reference);
    if-eq v3, v1, :cond_6

    .line 333
    if-nez p2, :cond_3

    .line 334
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p2

    .line 336
    :cond_3
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    if-eqz v3, :cond_4

    .line 337
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 338
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroid/support/v4/app/FragmentTransaction;->detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 341
    :cond_4
    if-eqz v1, :cond_5

    .line 342
    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_7

    .line 343
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mContext:Landroid/content/Context;

    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$300(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/Class;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$400(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/os/Bundle;

    move-result-object v5

    #v5=(Reference);
    invoke-static {v3, v4, v5}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v4/app/FragmentTabHost$TabInfo;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    .line 345
    iget v3, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    #v3=(Integer);
    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v3, v4, v5}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 351
    :cond_5
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iput-object v1, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    .line 353
    :cond_6
    return-object p2

    .line 347
    :cond_7
    #v3=(Reference);v4=(Uninit);v5=(Uninit);
    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroid/support/v4/app/FragmentTransaction;->attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_1
.end method

.method private ensureContent()V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 213
    iget v0, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentTabHost;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    .line 214
    iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 215
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "No tab content FrameLayout found for id "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 219
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    return-void
.end method

.method private ensureHierarchy(Landroid/content/Context;)V
    .locals 8
    .parameter "context"

    .prologue
    const v4, 0x1020013

    #v4=(Integer);
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, -0x1

    .line 151
    #v5=(Byte);
    invoke-virtual {p0, v4}, Landroid/support/v4/app/FragmentTabHost;->findViewById(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 152
    new-instance v1, Landroid/widget/LinearLayout;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 153
    .local v1, ll:Landroid/widget/LinearLayout;
    #v1=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 154
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    #v3=(UninitRef);
    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    #v3=(Reference);
    invoke-virtual {p0, v1, v3}, Landroid/support/v4/app/FragmentTabHost;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    new-instance v2, Landroid/widget/TabWidget;

    #v2=(UninitRef);
    invoke-direct {v2, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V

    .line 159
    .local v2, tw:Landroid/widget/TabWidget;
    #v2=(Reference);
    invoke-virtual {v2, v4}, Landroid/widget/TabWidget;->setId(I)V

    .line 160
    invoke-virtual {v2, v6}, Landroid/widget/TabWidget;->setOrientation(I)V

    .line 161
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    #v3=(UninitRef);
    const/4 v4, -0x2

    #v4=(Byte);
    invoke-direct {v3, v5, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    new-instance v0, Landroid/widget/FrameLayout;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 166
    .local v0, fl:Landroid/widget/FrameLayout;
    #v0=(Reference);
    const v3, 0x1020011

    #v3=(Integer);
    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setId(I)V

    .line 167
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    #v3=(UninitRef);
    invoke-direct {v3, v6, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    #v3=(Reference);
    invoke-virtual {v1, v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    new-instance v0, Landroid/widget/FrameLayout;

    .end local v0           #fl:Landroid/widget/FrameLayout;
    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .restart local v0       #fl:Landroid/widget/FrameLayout;
    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    .line 170
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    iget v4, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setId(I)V

    .line 171
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    #v3=(UninitRef);
    const/high16 v4, 0x3f80

    invoke-direct {v3, v5, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    #v3=(Reference);
    invoke-virtual {v1, v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .end local v0           #fl:Landroid/widget/FrameLayout;
    .end local v1           #ll:Landroid/widget/LinearLayout;
    .end local v2           #tw:Landroid/widget/TabWidget;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method private initFragmentTabHost(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v3, 0x0

    .line 140
    #v3=(Null);
    const/4 v1, 0x1

    #v1=(One);
    new-array v1, v1, [I

    #v1=(Reference);
    const v2, 0x10100f3

    #v2=(Integer);
    aput v2, v1, v3

    invoke-virtual {p1, p2, v1, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 142
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    .line 143
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 145
    invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    .line 146
    return-void
.end method


# virtual methods
.method public addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 5
    .parameter "tabSpec"
    .parameter
    .parameter "args"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TabHost$TabSpec;",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .prologue
    .line 227
    .local p2, clss:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    new-instance v3, Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;

    #v3=(UninitRef);
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mContext:Landroid/content/Context;

    #v4=(Reference);
    invoke-direct {v3, v4}, Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    invoke-virtual {p1, v3}, Landroid/widget/TabHost$TabSpec;->setContent(Landroid/widget/TabHost$TabContentFactory;)Landroid/widget/TabHost$TabSpec;

    .line 228
    invoke-virtual {p1}, Landroid/widget/TabHost$TabSpec;->getTag()Ljava/lang/String;

    move-result-object v2

    .line 230
    .local v2, tag:Ljava/lang/String;
    #v2=(Reference);
    new-instance v1, Landroid/support/v4/app/FragmentTabHost$TabInfo;

    #v1=(UninitRef);
    invoke-direct {v1, v2, p2, p3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 232
    .local v1, info:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    #v1=(Reference);
    iget-boolean v3, p0, Landroid/support/v4/app/FragmentTabHost;->mAttached:Z

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 236
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v4/app/FragmentTabHost$TabInfo;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    .line 237
    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/Fragment;->isDetached()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 238
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 239
    .local v0, ft:Landroid/support/v4/app/FragmentTransaction;
    #v0=(Reference);
    invoke-static {v1}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentTransaction;->detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 240
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 244
    .end local v0           #ft:Landroid/support/v4/app/FragmentTransaction;
    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    .line 246
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 6

    .prologue
    .line 250
    invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V

    .line 252
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v0

    .line 256
    .local v0, currentTab:Ljava/lang/String;
    #v0=(Reference);
    const/4 v1, 0x0

    .line 257
    .local v1, ft:Landroid/support/v4/app/FragmentTransaction;
    #v1=(Null);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v1=(Reference);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    #v4=(Integer);
    if-ge v2, v4, :cond_3

    .line 258
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mTabs:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/app/FragmentTabHost$TabInfo;

    .line 259
    .local v3, tab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$102(Landroid/support/v4/app/FragmentTabHost$TabInfo;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    .line 260
    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/Fragment;->isDetached()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 261
    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$200(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 265
    iput-object v3, p0, Landroid/support/v4/app/FragmentTabHost;->mLastTab:Landroid/support/v4/app/FragmentTabHost$TabInfo;

    .line 257
    :cond_0
    :goto_1
    #v4=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 269
    :cond_1
    #v4=(Boolean);
    if-nez v1, :cond_2

    .line 270
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 272
    :cond_2
    #v4=(Conflicted);
    invoke-static {v3}, Landroid/support/v4/app/FragmentTabHost$TabInfo;->access$100(Landroid/support/v4/app/FragmentTabHost$TabInfo;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/support/v4/app/FragmentTransaction;->detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_1

    .line 279
    .end local v3           #tab:Landroid/support/v4/app/FragmentTabHost$TabInfo;
    :cond_3
    #v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    const/4 v4, 0x1

    #v4=(One);
    iput-boolean v4, p0, Landroid/support/v4/app/FragmentTabHost;->mAttached:Z

    .line 280
    invoke-direct {p0, v0, v1}, Landroid/support/v4/app/FragmentTabHost;->doTabChanged(Ljava/lang/String;Landroid/support/v4/app/FragmentTransaction;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 281
    if-eqz v1, :cond_4

    .line 282
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 283
    iget-object v4, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 285
    :cond_4
    #v4=(Conflicted);
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 289
    invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V

    .line 290
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/FragmentTabHost;->mAttached:Z

    .line 291
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2
    .parameter "state"

    .prologue
    .line 303
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/FragmentTabHost$SavedState;

    .line 304
    .local v0, ss:Landroid/support/v4/app/FragmentTabHost$SavedState;
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTabHost$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    #v1=(Reference);
    invoke-super {p0, v1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 305
    iget-object v1, v0, Landroid/support/v4/app/FragmentTabHost$SavedState;->curTab:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/support/v4/app/FragmentTabHost;->setCurrentTabByTag(Ljava/lang/String;)V

    .line 306
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 295
    invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 296
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v4/app/FragmentTabHost$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v4/app/FragmentTabHost$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 297
    .local v0, ss:Landroid/support/v4/app/FragmentTabHost$SavedState;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    iput-object v2, v0, Landroid/support/v4/app/FragmentTabHost$SavedState;->curTab:Ljava/lang/String;

    .line 298
    return-object v0
.end method

.method public onTabChanged(Ljava/lang/String;)V
    .locals 2
    .parameter "tabId"

    .prologue
    .line 310
    iget-boolean v1, p0, Landroid/support/v4/app/FragmentTabHost;->mAttached:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 311
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, v1}, Landroid/support/v4/app/FragmentTabHost;->doTabChanged(Ljava/lang/String;Landroid/support/v4/app/FragmentTransaction;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 312
    .local v0, ft:Landroid/support/v4/app/FragmentTransaction;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 313
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 316
    .end local v0           #ft:Landroid/support/v4/app/FragmentTransaction;
    :cond_0
    #v0=(Conflicted);v1=(Boolean);
    iget-object v1, p0, Landroid/support/v4/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 317
    iget-object v1, p0, Landroid/support/v4/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;

    invoke-interface {v1, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V

    .line 319
    :cond_1
    return-void
.end method

.method public setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
    .locals 0
    .parameter "l"

    .prologue
    .line 223
    iput-object p1, p0, Landroid/support/v4/app/FragmentTabHost;->mOnTabChangeListener:Landroid/widget/TabHost$OnTabChangeListener;

    .line 224
    return-void
.end method

.method public setup()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 183
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Must call setup() that takes a Context and FragmentManager"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public setup(Landroid/content/Context;Landroid/support/v4/app/FragmentManager;)V
    .locals 0
    .parameter "context"
    .parameter "manager"

    .prologue
    .line 188
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->ensureHierarchy(Landroid/content/Context;)V

    .line 189
    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    .line 190
    iput-object p1, p0, Landroid/support/v4/app/FragmentTabHost;->mContext:Landroid/content/Context;

    .line 191
    iput-object p2, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 192
    invoke-direct {p0}, Landroid/support/v4/app/FragmentTabHost;->ensureContent()V

    .line 193
    return-void
.end method

.method public setup(Landroid/content/Context;Landroid/support/v4/app/FragmentManager;I)V
    .locals 2
    .parameter "context"
    .parameter "manager"
    .parameter "containerId"

    .prologue
    .line 196
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentTabHost;->ensureHierarchy(Landroid/content/Context;)V

    .line 197
    invoke-super {p0}, Landroid/widget/TabHost;->setup()V

    .line 198
    iput-object p1, p0, Landroid/support/v4/app/FragmentTabHost;->mContext:Landroid/content/Context;

    .line 199
    iput-object p2, p0, Landroid/support/v4/app/FragmentTabHost;->mFragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 200
    iput p3, p0, Landroid/support/v4/app/FragmentTabHost;->mContainerId:I

    .line 201
    invoke-direct {p0}, Landroid/support/v4/app/FragmentTabHost;->ensureContent()V

    .line 202
    iget-object v0, p0, Landroid/support/v4/app/FragmentTabHost;->mRealTabContent:Landroid/widget/FrameLayout;

    #v0=(Reference);
    invoke-virtual {v0, p3}, Landroid/widget/FrameLayout;->setId(I)V

    .line 206
    invoke-virtual {p0}, Landroid/support/v4/app/FragmentTabHost;->getId()I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_0

    .line 207
    const v0, 0x1020012

    invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentTabHost;->setId(I)V

    .line 209
    :cond_0
    return-void
.end method

*/}
