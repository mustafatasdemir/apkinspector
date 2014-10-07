package android.support.v7.internal.widget; class ActivityChooserModel {/*

.class public Landroid/support/v7/internal/widget/ActivityChooserModel;
.super Landroid/database/DataSetObservable;
.source "ActivityChooserModel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ActivityChooserModel$1;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;,
        Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityChooserModelClient;
    }
.end annotation


# static fields
.field private static final ATTRIBUTE_ACTIVITY:Ljava/lang/String; = "activity"

.field private static final ATTRIBUTE_TIME:Ljava/lang/String; = "time"

.field private static final ATTRIBUTE_WEIGHT:Ljava/lang/String; = "weight"

.field private static final DEBUG:Z = false

.field private static final DEFAULT_ACTIVITY_INFLATION:I = 0x5

.field private static final DEFAULT_HISTORICAL_RECORD_WEIGHT:F = 1.0f

.field public static final DEFAULT_HISTORY_FILE_NAME:Ljava/lang/String; = "activity_choser_model_history.xml"

.field public static final DEFAULT_HISTORY_MAX_LENGTH:I = 0x32

.field private static final HISTORY_FILE_EXTENSION:Ljava/lang/String; = ".xml"

.field private static final INVALID_INDEX:I = -0x1

.field private static final LOG_TAG:Ljava/lang/String; = null

.field private static final TAG_HISTORICAL_RECORD:Ljava/lang/String; = "historical-record"

.field private static final TAG_HISTORICAL_RECORDS:Ljava/lang/String; = "historical-records"

.field private static final sDataModelRegistry:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v7/internal/widget/ActivityChooserModel;",
            ">;"
        }
    .end annotation
.end field

.field private static final sRegistryLock:Ljava/lang/Object;


# instance fields
.field private final mActivities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

.field private mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

.field private mCanReadHistoricalData:Z

.field private final mContext:Landroid/content/Context;

.field private final mHistoricalRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;",
            ">;"
        }
    .end annotation
.end field

.field private mHistoricalRecordsChanged:Z

.field private final mHistoryFileName:Ljava/lang/String;

.field private mHistoryMaxSize:I

.field private final mInstanceLock:Ljava/lang/Object;

.field private mIntent:Landroid/content/Intent;

.field private mReadShareHistoryCalled:Z

.field private mReloadActivities:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 160
    const-class v0, Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;

    .line 221
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;

    .line 226
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4
    .parameter "context"
    .parameter "historyFileName"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 349
    #v2=(Null);
    invoke-direct {p0}, Landroid/database/DataSetObservable;-><init>()V

    .line 232
    #p0=(Reference);
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    .line 237
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    .line 262
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

    .line 267
    const/16 v0, 0x32

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I

    .line 277
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z

    .line 288
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z

    .line 296
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    .line 301
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z

    .line 350
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;

    .line 351
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, ".xml"

    #v0=(Reference);
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".xml"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    .line 357
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 355
    :cond_0
    #v0=(Boolean);v1=(Null);
    iput-object p2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/ActivityChooserModel;)Landroid/content/Context;
    .locals 1
    .parameter "x0"

    .prologue
    .line 93
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    sget-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
    .locals 1
    .parameter "x0"

    .prologue
    .line 93
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 93
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z

    return p1
.end method

.method private addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z
    .locals 2
    .parameter "historicalRecord"

    .prologue
    .line 743
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 744
    .local v0, added:Z
    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 745
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    .line 746
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V

    .line 747
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->persistHistoricalDataIfNeeded()V

    .line 748
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z

    .line 749
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V

    .line 751
    :cond_0
    #v1=(Conflicted);
    return v0
.end method

.method private ensureConsistentState()V
    .locals 2

    .prologue
    .line 670
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->loadActivitiesIfNeeded()Z

    move-result v0

    .line 671
    .local v0, stateChanged:Z
    #v0=(Boolean);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->readHistoricalDataIfNeeded()Z

    move-result v1

    #v1=(Boolean);
    or-int/2addr v0, v1

    .line 672
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V

    .line 673
    if-eqz v0, :cond_0

    .line 674
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z

    .line 675
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V

    .line 677
    :cond_0
    return-void
.end method

.method private executePersistHistoryAsyncTaskBase()V
    .locals 5

    .prologue
    .line 586
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 588
    return-void
.end method

.method private executePersistHistoryAsyncTaskSDK11()V
    .locals 6

    .prologue
    .line 591
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V

    #v0=(Reference);
    sget-object v1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    #v1=(Reference);
    const/4 v2, 0x2

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 593
    return-void
.end method

.method public static get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
    .locals 3
    .parameter "context"
    .parameter "historyFileName"

    .prologue
    .line 333
    sget-object v2, Landroid/support/v7/internal/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;

    #v2=(Reference);
    monitor-enter v2

    .line 334
    :try_start_0
    sget-object v1, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel;

    .line 335
    .local v0, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    if-nez v0, :cond_0

    .line 336
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel;

    .end local v0           #dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 337
    .restart local v0       #dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    sget-object v1, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    :cond_0
    monitor-exit v2

    return-object v0

    .line 340
    .end local v0           #dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private loadActivitiesIfNeeded()Z
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 703
    #v4=(Null);
    iget-boolean v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z

    #v5=(Boolean);
    if-eqz v5, :cond_1

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v5=(Reference);
    if-eqz v5, :cond_1

    .line 704
    iput-boolean v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z

    .line 705
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 706
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v6=(Reference);
    invoke-virtual {v5, v6, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 708
    .local v3, resolveInfos:Ljava/util/List;,"Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    #v3=(Reference);
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    .line 709
    .local v2, resolveInfoCount:I
    #v2=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v4=(Reference);
    if-ge v0, v2, :cond_0

    .line 710
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 711
    .local v1, resolveInfo:Landroid/content/pm/ResolveInfo;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    #v5=(UninitRef);
    invoke-direct {v5, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/pm/ResolveInfo;)V

    #v5=(Reference);
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 709
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 713
    .end local v1           #resolveInfo:Landroid/content/pm/ResolveInfo;
    :cond_0
    #v1=(Conflicted);
    const/4 v4, 0x1

    .line 715
    .end local v0           #i:I
    .end local v2           #resolveInfoCount:I
    .end local v3           #resolveInfos:Ljava/util/List;,"Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);
    return v4
.end method

.method private persistHistoricalDataIfNeeded()V
    .locals 2

    .prologue
    .line 569
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 570
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "No preceding call to #readHistoricalData"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 572
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    if-nez v0, :cond_2

    .line 583
    :cond_1
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    return-void

    .line 575
    :cond_2
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    .line 576
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 577
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_3

    .line 578
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->executePersistHistoryAsyncTaskSDK11()V

    goto :goto_0

    .line 580
    :cond_3
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->executePersistHistoryAsyncTaskBase()V

    goto :goto_0
.end method

.method private pruneExcessiveHistoricalRecordsIfNeeded()V
    .locals 4

    .prologue
    .line 758
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    #v2=(Integer);
    iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I

    #v3=(Integer);
    sub-int v1, v2, v3

    .line 759
    .local v1, pruneCount:I
    #v1=(Integer);
    if-gtz v1, :cond_1

    .line 769
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 762
    :cond_1
    #v0=(Uninit);v2=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    .line 763
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v2=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 764
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    .line 763
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private readHistoricalDataIfNeeded()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 726
    #v1=(Null);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    #v2=(Reference);
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 728
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z

    .line 729
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z

    .line 730
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->readHistoricalDataImpl()V

    .line 733
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method private readHistoricalDataImpl()V
    .locals 17

    .prologue
    .line 976
    const/4 v2, 0x0

    .line 978
    .local v2, fis:Ljava/io/FileInputStream;
    :try_start_0
    #v2=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v14, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;

    #v14=(Reference);
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    #v15=(Reference);
    invoke-virtual {v14, v15}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 986
    :try_start_1
    #v2=(Reference);
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v7

    .line 987
    .local v7, parser:Lorg/xmlpull/v1/XmlPullParser;
    #v7=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    invoke-interface {v7, v2, v14}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 989
    const/4 v11, 0x0

    .line 990
    .local v11, type:I
    :goto_0
    #v11=(Integer);v14=(PosByte);
    const/4 v14, 0x1

    #v14=(One);
    if-eq v11, v14, :cond_1

    const/4 v14, 0x2

    #v14=(PosByte);
    if-eq v11, v14, :cond_1

    .line 991
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v11

    goto :goto_0

    .line 979
    .end local v7           #parser:Lorg/xmlpull/v1/XmlPullParser;
    .end local v11           #type:I
    :catch_0
    #v2=(Null);v7=(Uninit);v11=(Uninit);v14=(Conflicted);v15=(Conflicted);
    move-exception v3

    .line 1044
    :cond_0
    :goto_1
    #v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v16=(Conflicted);
    return-void

    .line 994
    .restart local v7       #parser:Lorg/xmlpull/v1/XmlPullParser;
    .restart local v11       #type:I
    :cond_1
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Uninit);v14=(PosByte);v15=(Reference);v16=(Uninit);
    const-string v14, "historical-records"

    #v14=(Reference);
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    #v14=(Boolean);
    if-nez v14, :cond_2

    .line 995
    new-instance v14, Lorg/xmlpull/v1/XmlPullParserException;

    #v14=(UninitRef);
    const-string v15, "Share records file does not start with historical-records tag."

    invoke-direct {v14, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    #v14=(Reference);
    throw v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4

    .line 1031
    .end local v7           #parser:Lorg/xmlpull/v1/XmlPullParser;
    .end local v11           #type:I
    :catch_1
    #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);
    move-exception v13

    .line 1032
    .local v13, xppe:Lorg/xmlpull/v1/XmlPullParserException;
    :try_start_2
    #v13=(Reference);
    sget-object v14, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;

    #v14=(Reference);
    new-instance v15, Ljava/lang/StringBuilder;

    #v15=(UninitRef);
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    #v15=(Reference);
    const-string v16, "Error reading historical recrod file: "

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1036
    if-eqz v2, :cond_0

    .line 1038
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 1039
    :catch_2
    move-exception v14

    goto :goto_1

    .line 999
    .end local v13           #xppe:Lorg/xmlpull/v1/XmlPullParserException;
    .restart local v7       #parser:Lorg/xmlpull/v1/XmlPullParser;
    .restart local v11       #type:I
    :cond_2
    :try_start_4
    #v1=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Reference);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Uninit);v14=(Boolean);v16=(Uninit);
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    .line 1000
    .local v4, historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    #v4=(Reference);
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 1003
    :cond_3
    :goto_2
    #v1=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v14=(Conflicted);
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    move-result v11

    .line 1004
    const/4 v14, 0x1

    #v14=(One);
    if-ne v11, v14, :cond_4

    .line 1036
    if-eqz v2, :cond_0

    .line 1038
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_1

    .line 1039
    :catch_3
    move-exception v14

    #v14=(Reference);
    goto :goto_1

    .line 1007
    :cond_4
    #v14=(One);
    const/4 v14, 0x3

    #v14=(PosByte);
    if-eq v11, v14, :cond_3

    const/4 v14, 0x4

    if-eq v11, v14, :cond_3

    .line 1010
    :try_start_6
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    .line 1011
    .local v6, nodeName:Ljava/lang/String;
    #v6=(Reference);
    const-string v14, "historical-record"

    #v14=(Reference);
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    #v14=(Boolean);
    if-nez v14, :cond_5

    .line 1012
    new-instance v14, Lorg/xmlpull/v1/XmlPullParserException;

    #v14=(UninitRef);
    const-string v15, "Share records file not well-formed."

    invoke-direct {v14, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    #v14=(Reference);
    throw v14
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 1033
    .end local v4           #historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    .end local v6           #nodeName:Ljava/lang/String;
    .end local v7           #parser:Lorg/xmlpull/v1/XmlPullParser;
    .end local v11           #type:I
    :catch_4
    #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);v14=(Conflicted);
    move-exception v5

    .line 1034
    .local v5, ioe:Ljava/io/IOException;
    :try_start_7
    #v5=(Reference);
    sget-object v14, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;

    #v14=(Reference);
    new-instance v15, Ljava/lang/StringBuilder;

    #v15=(UninitRef);
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    #v15=(Reference);
    const-string v16, "Error reading historical recrod file: "

    #v16=(Reference);
    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1036
    if-eqz v2, :cond_0

    .line 1038
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto/16 :goto_1

    .line 1039
    :catch_5
    move-exception v14

    goto/16 :goto_1

    .line 1015
    .end local v5           #ioe:Ljava/io/IOException;
    .restart local v4       #historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    .restart local v6       #nodeName:Ljava/lang/String;
    .restart local v7       #parser:Lorg/xmlpull/v1/XmlPullParser;
    .restart local v11       #type:I
    :cond_5
    #v4=(Reference);v5=(Uninit);v6=(Reference);v7=(Reference);v11=(Integer);v14=(Boolean);v16=(Uninit);
    const/4 v14, 0x0

    :try_start_9
    #v14=(Null);
    const-string v15, "activity"

    invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1016
    .local v1, activity:Ljava/lang/String;
    #v1=(Reference);
    const/4 v14, 0x0

    const-string v15, "time"

    invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    #v14=(Reference);
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 1018
    .local v9, time:J
    #v9=(LongLo);v10=(LongHi);
    const/4 v14, 0x0

    #v14=(Null);
    const-string v15, "weight"

    invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    #v14=(Reference);
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v12

    .line 1020
    .local v12, weight:F
    #v12=(Float);
    new-instance v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    #v8=(UninitRef);
    invoke-direct {v8, v1, v9, v10, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Ljava/lang/String;JF)V

    .line 1021
    .local v8, readRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    #v8=(Reference);
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_2

    .line 1036
    .end local v1           #activity:Ljava/lang/String;
    .end local v4           #historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    .end local v6           #nodeName:Ljava/lang/String;
    .end local v7           #parser:Lorg/xmlpull/v1/XmlPullParser;
    .end local v8           #readRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    .end local v9           #time:J
    .end local v11           #type:I
    .end local v12           #weight:F
    :catchall_0
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    move-exception v14

    #v14=(Reference);
    if-eqz v2, :cond_6

    .line 1038
    :try_start_a
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6

    .line 1041
    :cond_6
    :goto_3
    throw v14

    .line 1039
    :catch_6
    move-exception v15

    #v15=(Reference);
    goto :goto_3
.end method

.method private sortActivitiesIfNeeded()Z
    .locals 4

    .prologue
    .line 687
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 689
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v3=(Reference);
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;->sort(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V

    .line 691
    const/4 v0, 0x1

    .line 693
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_0
    #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public chooseActivity(I)Landroid/content/Intent;
    .locals 10
    .parameter "index"

    .prologue
    const/4 v6, 0x0

    .line 460
    #v6=(Null);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v7=(Reference);
    monitor-enter v7

    .line 461
    :try_start_0
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v8=(Reference);
    if-nez v8, :cond_0

    .line 462
    monitor-exit v7

    move-object v0, v6

    .line 490
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    .line 465
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v8=(Reference);v9=(Uninit);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 467
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    invoke-interface {v8, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 469
    .local v2, chosenActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    new-instance v3, Landroid/content/ComponentName;

    #v3=(UninitRef);
    iget-object v8, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    iget-object v8, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v9, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    #v9=(Reference);
    iget-object v9, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v8, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    .local v3, chosenName:Landroid/content/ComponentName;
    #v3=(Reference);
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 474
    .local v0, choiceIntent:Landroid/content/Intent;
    #v0=(Reference);
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 476
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    if-eqz v8, :cond_1

    .line 478
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 479
    .local v1, choiceIntentCopy:Landroid/content/Intent;
    #v1=(Reference);
    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    invoke-interface {v8, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;->onChooseActivity(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/Intent;)Z

    move-result v4

    .line 481
    .local v4, handled:Z
    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 482
    monitor-exit v7

    move-object v0, v6

    #v0=(Null);
    goto :goto_0

    .line 486
    .end local v1           #choiceIntentCopy:Landroid/content/Intent;
    .end local v4           #handled:Z
    :cond_1
    #v0=(Reference);v1=(Conflicted);v4=(Conflicted);
    new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    #v5=(UninitRef);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    #v8=(LongLo);v9=(LongHi);
    const/high16 v6, 0x3f80

    #v6=(Integer);
    invoke-direct {v5, v3, v8, v9, v6}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V

    .line 488
    .local v5, historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    #v5=(Reference);
    invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z

    .line 490
    monitor-exit v7

    goto :goto_0

    .line 491
    .end local v0           #choiceIntent:Landroid/content/Intent;
    .end local v2           #chosenActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v3           #chosenName:Landroid/content/ComponentName;
    .end local v5           #historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    move-exception v6

    #v6=(Reference);
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v6
.end method

.method public getActivity(I)Landroid/content/pm/ResolveInfo;
    .locals 2
    .parameter "index"

    .prologue
    .line 413
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 414
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 415
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    monitor-exit v1

    return-object v0

    .line 416
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getActivityCount()I
    .locals 2

    .prologue
    .line 398
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 399
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 400
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    monitor-exit v1

    return v0

    .line 401
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getActivityIndex(Landroid/content/pm/ResolveInfo;)I
    .locals 6
    .parameter "activity"

    .prologue
    .line 427
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v5=(Reference);
    monitor-enter v5

    .line 428
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 429
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    .line 430
    .local v0, activities:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 431
    .local v1, activityCount:I
    #v1=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v2=(Conflicted);v3=(Integer);v4=(Conflicted);
    if-ge v3, v1, :cond_1

    .line 432
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 433
    .local v2, currentActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    iget-object v4, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    #v4=(Reference);
    if-ne v4, p1, :cond_0

    .line 434
    monitor-exit v5

    .line 437
    .end local v2           #currentActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v3           #i:I
    :goto_1
    #v2=(Conflicted);v4=(Conflicted);
    return v3

    .line 431
    .restart local v2       #currentActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .restart local v3       #i:I
    :cond_0
    #v2=(Reference);v4=(Reference);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 437
    .end local v2           #currentActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    :cond_1
    #v2=(Conflicted);v4=(Conflicted);
    const/4 v3, -0x1

    #v3=(Byte);
    monitor-exit v5

    goto :goto_1

    .line 438
    .end local v0           #activities:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
    .end local v1           #activityCount:I
    .end local v3           #i:I
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    move-exception v4

    #v4=(Reference);
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

.method public getDefaultActivity()Landroid/content/pm/ResolveInfo;
    .locals 3

    .prologue
    .line 515
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 516
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 517
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 518
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    monitor-exit v1

    .line 521
    :goto_0
    #v2=(Conflicted);
    return-object v0

    .line 520
    :cond_0
    #v0=(Boolean);v2=(Uninit);
    monitor-exit v1

    .line 521
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 520
    :catchall_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getHistoryMaxSize()I
    .locals 2

    .prologue
    .line 646
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 647
    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I

    #v0=(Integer);
    monitor-exit v1

    return v0

    .line 648
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getHistorySize()I
    .locals 2

    .prologue
    .line 657
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 658
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 659
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    monitor-exit v1

    return v0

    .line 660
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 2

    .prologue
    .line 385
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 386
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    monitor-exit v1

    return-object v0

    .line 387
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setActivitySorter(Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;)V
    .locals 2
    .parameter "activitySorter"

    .prologue
    .line 603
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 604
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

    #v0=(Reference);
    if-ne v0, p1, :cond_0

    .line 605
    monitor-exit v1

    .line 612
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 607
    :cond_0
    #v0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;

    .line 608
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 609
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V

    .line 611
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setDefaultActivity(I)V
    .locals 9
    .parameter "index"

    .prologue
    .line 535
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v6=(Reference);
    monitor-enter v6

    .line 536
    :try_start_0
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 538
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    #v5=(Reference);
    invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 539
    .local v2, newDefaultActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;

    const/4 v7, 0x0

    #v7=(Null);
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 542
    .local v3, oldDefaultActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    if-eqz v3, :cond_0

    .line 544
    iget v5, v3, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F

    #v5=(Integer);
    iget v7, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F

    #v7=(Integer);
    sub-float/2addr v5, v7

    #v5=(Float);
    const/high16 v7, 0x40a0

    add-float v4, v5, v7

    .line 550
    .local v4, weight:F
    :goto_0
    #v4=(Integer);v5=(Conflicted);
    new-instance v0, Landroid/content/ComponentName;

    #v0=(UninitRef);
    iget-object v5, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    #v5=(Reference);
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v7, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    #v7=(Reference);
    iget-object v7, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v5, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .local v0, defaultName:Landroid/content/ComponentName;
    #v0=(Reference);
    new-instance v1, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    #v1=(UninitRef);
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    #v7=(LongLo);v8=(LongHi);
    invoke-direct {v1, v0, v7, v8, v4}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V

    .line 555
    .local v1, historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    #v1=(Reference);
    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z

    .line 556
    monitor-exit v6

    .line 557
    return-void

    .line 547
    .end local v0           #defaultName:Landroid/content/ComponentName;
    .end local v1           #historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    .end local v4           #weight:F
    :cond_0
    #v0=(Uninit);v1=(Uninit);v4=(Uninit);v7=(Null);v8=(Uninit);
    const/high16 v4, 0x3f80

    .restart local v4       #weight:F
    #v4=(Integer);
    goto :goto_0

    .line 556
    .end local v2           #newDefaultActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v3           #oldDefaultActivity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v4           #weight:F
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v5

    #v5=(Reference);
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v5
.end method

.method public setHistoryMaxSize(I)V
    .locals 2
    .parameter "historyMaxSize"

    .prologue
    .line 628
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 629
    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I

    #v0=(Integer);
    if-ne v0, p1, :cond_0

    .line 630
    monitor-exit v1

    .line 638
    :goto_0
    return-void

    .line 632
    :cond_0
    iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I

    .line 633
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V

    .line 634
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 635
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V

    .line 637
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 2
    .parameter "intent"

    .prologue
    .line 369
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 370
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    if-ne v0, p1, :cond_0

    .line 371
    monitor-exit v1

    .line 377
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 373
    :cond_0
    #v0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;

    .line 374
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z

    .line 375
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V

    .line 376
    monitor-exit v1

    goto :goto_0

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setOnChooseActivityListener(Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;)V
    .locals 2
    .parameter "listener"

    .prologue
    .line 500
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 501
    :try_start_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    .line 502
    monitor-exit v1

    .line 503
    return-void

    .line 502
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

*/}
