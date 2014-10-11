package android.support.v7.internal.widget; class ActivityChooserModel { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// .super Landroid/database/DataSetObservable;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$1;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityChooserModelClient;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRIBUTE_ACTIVITY:Ljava/lang/String; = "activity"
a=0;// 
a=0;// .field private static final ATTRIBUTE_TIME:Ljava/lang/String; = "time"
a=0;// 
a=0;// .field private static final ATTRIBUTE_WEIGHT:Ljava/lang/String; = "weight"
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final DEFAULT_ACTIVITY_INFLATION:I = 0x5
a=0;// 
a=0;// .field private static final DEFAULT_HISTORICAL_RECORD_WEIGHT:F = 1.0f
a=0;// 
a=0;// .field public static final DEFAULT_HISTORY_FILE_NAME:Ljava/lang/String; = "activity_choser_model_history.xml"
a=0;// 
a=0;// .field public static final DEFAULT_HISTORY_MAX_LENGTH:I = 0x32
a=0;// 
a=0;// .field private static final HISTORY_FILE_EXTENSION:Ljava/lang/String; = ".xml"
a=0;// 
a=0;// .field private static final INVALID_INDEX:I = -0x1
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static final TAG_HISTORICAL_RECORD:Ljava/lang/String; = "historical-record"
a=0;// 
a=0;// .field private static final TAG_HISTORICAL_RECORDS:Ljava/lang/String; = "historical-records"
a=0;// 
a=0;// .field private static final sDataModelRegistry:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/support/v7/internal/widget/ActivityChooserModel;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActivities:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// .field private mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;// .field private mCanReadHistoricalData:Z
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mHistoricalRecords:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mHistoricalRecordsChanged:Z
a=0;// 
a=0;// .field private final mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;// .field private mHistoryMaxSize:I
a=0;// 
a=0;// .field private final mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private mReadShareHistoryCalled:Z
a=0;// 
a=0;// .field private mReloadActivities:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     const-class v0, Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 221
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "historyFileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 349
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObservable;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     .line 242
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     .line 262
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .line 267
a=0;//     const/16 v0, 0x32
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     .line 277
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     .line 288
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     .line 296
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 301
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 351
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, ".xml"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 353
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".xml"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 357
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 355
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/widget/ActivityChooserModel;)Landroid/content/Context;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     sget-object v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;//     .locals 2
a=0;//     .param p1, "historicalRecord"    # Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 743
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 744
a=0;//     .local v0, "added":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 745
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 746
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V
a=0;// 
a=0;//     .line 747
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->persistHistoricalDataIfNeeded()V
a=0;// 
a=0;//     .line 748
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z
a=0;// 
a=0;//     .line 749
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     .line 751
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private ensureConsistentState()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->loadActivitiesIfNeeded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 671
a=0;//     .local v0, "stateChanged":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->readHistoricalDataIfNeeded()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 672
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V
a=0;// 
a=0;//     .line 673
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 674
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z
a=0;// 
a=0;//     .line 675
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     .line 677
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private executePersistHistoryAsyncTaskBase()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 586
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 588
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private executePersistHistoryAsyncTaskSDK11()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 591
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     sget-object v1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 593
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "historyFileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     sget-object v2, Landroid/support/v7/internal/widget/ActivityChooserModel;->sRegistryLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 334
a=0;//     :try_start_0
a=0;//     sget-object v1, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     .end local v0    # "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 337
a=0;//     .restart local v0    # "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     sget-object v1, Landroid/support/v7/internal/widget/ActivityChooserModel;->sDataModelRegistry:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 340
a=0;//     .end local v0    # "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private loadActivitiesIfNeeded()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 703
a=0;//     #v4=(Null);
a=0;//     iget-boolean v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 704
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z
a=0;// 
a=0;//     .line 705
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 706
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v5, v6, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 708
a=0;//     .local v3, "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 709
a=0;//     .local v2, "resolveInfoCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Reference,Ljava/util/List;);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 710
a=0;//     invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 711
a=0;//     .local v1, "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;);
a=0;//     invoke-direct {v5, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/pm/ResolveInfo;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 709
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 713
a=0;//     .end local v1    # "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 715
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "resolveInfoCount":I
a=0;//     .end local v3    # "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v4
a=0;// .end method
a=0;// 
a=0;// .method private persistHistoricalDataIfNeeded()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No preceding call to #readHistoricalData"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 572
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 575
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 577
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 578
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->executePersistHistoryAsyncTaskSDK11()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 580
a=0;//     :cond_3
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->executePersistHistoryAsyncTaskBase()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pruneExcessiveHistoricalRecordsIfNeeded()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 758
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v1, v2, v3
a=0;// 
a=0;//     .line 759
a=0;//     .local v1, "pruneCount":I
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     .line 769
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 762
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     .line 763
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 764
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 763
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private readHistoricalDataIfNeeded()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 726
a=0;//     #v1=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecordsChanged:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 728
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mCanReadHistoricalData:Z
a=0;// 
a=0;//     .line 729
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReadShareHistoryCalled:Z
a=0;// 
a=0;//     .line 730
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->readHistoricalDataImpl()V
a=0;// 
a=0;//     .line 733
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private readHistoricalDataImpl()V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 976
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 978
a=0;//     .local v2, "fis":Ljava/io/FileInputStream;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     iget-object v14, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v14=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 986
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 987
a=0;//     .local v7, "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     #v7=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-interface {v7, v2, v14}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 989
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 990
a=0;//     .local v11, "type":I
a=0;//     :goto_0
a=0;//     #v11=(Integer);v14=(PosByte);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     if-eq v11, v14, :cond_1
a=0;// 
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-eq v11, v14, :cond_1
a=0;// 
a=0;//     .line 991
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 979
a=0;//     .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v11    # "type":I
a=0;//     :catch_0
a=0;//     #v2=(Null);v7=(Uninit);v11=(Uninit);v14=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 1044
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 994
a=0;//     .restart local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v11    # "type":I
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Uninit);v14=(PosByte);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     const-string v14, "historical-records"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_2
a=0;// 
a=0;//     .line 995
a=0;//     new-instance v14, Lorg/xmlpull/v1/XmlPullParserException;
a=0;// 
a=0;//     #v14=(UninitRef,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     const-string v15, "Share records file does not start with historical-records tag."
a=0;// 
a=0;//     invoke-direct {v14, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     throw v14
a=0;//     :try_end_1
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1031
a=0;//     .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v11    # "type":I
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 1032
a=0;//     .local v13, "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_2
a=0;//     #v13=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     sget-object v14, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Error reading historical recrod file: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1036
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1038
a=0;//     :try_start_3
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1039
a=0;//     :catch_2
a=0;//     move-exception v14
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 999
a=0;//     .end local v13    # "xppe":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     .restart local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v11    # "type":I
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v1=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Uninit);v14=(Boolean);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     .line 1000
a=0;//     .local v4, "historicalRecords":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 1003
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v14=(Conflicted);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;//     :try_end_4
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1004
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     if-ne v11, v14, :cond_4
a=0;// 
a=0;//     .line 1036
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1038
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1039
a=0;//     :catch_3
a=0;//     move-exception v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1007
a=0;//     :cond_4
a=0;//     #v14=(One);
a=0;//     const/4 v14, 0x3
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     if-eq v11, v14, :cond_3
a=0;// 
a=0;//     const/4 v14, 0x4
a=0;// 
a=0;//     if-eq v11, v14, :cond_3
a=0;// 
a=0;//     .line 1010
a=0;//     :try_start_6
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1011
a=0;//     .local v6, "nodeName":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "historical-record"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_5
a=0;// 
a=0;//     .line 1012
a=0;//     new-instance v14, Lorg/xmlpull/v1/XmlPullParserException;
a=0;// 
a=0;//     #v14=(UninitRef,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     const-string v15, "Share records file not well-formed."
a=0;// 
a=0;//     invoke-direct {v14, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     throw v14
a=0;//     :try_end_6
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 1033
a=0;//     .end local v4    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v6    # "nodeName":Ljava/lang/String;
a=0;//     .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v11    # "type":I
a=0;//     :catch_4
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 1034
a=0;//     .local v5, "ioe":Ljava/io/IOException;
a=0;//     :try_start_7
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     sget-object v14, Landroid/support/v7/internal/widget/ActivityChooserModel;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Error reading historical recrod file: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     .line 1036
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1038
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1039
a=0;//     :catch_5
a=0;//     move-exception v14
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1015
a=0;//     .end local v5    # "ioe":Ljava/io/IOException;
a=0;//     .restart local v4    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .restart local v6    # "nodeName":Ljava/lang/String;
a=0;//     .restart local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .restart local v11    # "type":I
a=0;//     :cond_5
a=0;//     #v4=(Reference,Ljava/util/List;);v5=(Uninit);v6=(Reference,Ljava/lang/String;);v7=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v11=(Integer);v14=(Boolean);v16=(Uninit);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     :try_start_9
a=0;//     #v14=(Null);
a=0;//     const-string v15, "activity"
a=0;// 
a=0;//     invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1016
a=0;//     .local v1, "activity":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     const-string v15, "time"
a=0;// 
a=0;//     invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     .line 1018
a=0;//     .local v9, "time":J
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const-string v15, "weight"
a=0;// 
a=0;//     invoke-interface {v7, v14, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1020
a=0;//     .local v12, "weight":F
a=0;//     #v12=(Float);
a=0;//     new-instance v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-direct {v8, v1, v9, v10, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Ljava/lang/String;JF)V
a=0;// 
a=0;//     .line 1021
a=0;//     .local v8, "readRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v8=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_9
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1036
a=0;//     .end local v1    # "activity":Ljava/lang/String;
a=0;//     .end local v4    # "historicalRecords":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     .end local v6    # "nodeName":Ljava/lang/String;
a=0;//     .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .end local v8    # "readRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     .end local v9    # "time":J
a=0;//     .end local v11    # "type":I
a=0;//     .end local v12    # "weight":F
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 1038
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6
a=0;// 
a=0;//     .line 1041
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     throw v14
a=0;// 
a=0;//     .line 1039
a=0;//     :catch_6
a=0;//     move-exception v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private sortActivitiesIfNeeded()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 687
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 689
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;->sort(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 691
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 693
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public chooseActivity(I)Landroid/content/Intent;
a=0;//     .locals 10
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v7
a=0;// 
a=0;//     .line 461
a=0;//     :try_start_0
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 462
a=0;//     monitor-exit v7
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 490
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 465
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v8=(Reference,Landroid/content/Intent;);v9=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v8, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 469
a=0;//     .local v2, "chosenActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     new-instance v3, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v8, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     iget-object v8, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v9, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v9, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v9, v9, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, v8, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 473
a=0;//     .local v3, "chosenName":Landroid/content/ComponentName;
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 474
a=0;//     .local v0, "choiceIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 478
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 479
a=0;//     .local v1, "choiceIntentCopy":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     invoke-interface {v8, p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;->onChooseActivity(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 481
a=0;//     .local v4, "handled":Z
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 482
a=0;//     monitor-exit v7
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 486
a=0;//     .end local v1    # "choiceIntentCopy":Landroid/content/Intent;
a=0;//     .end local v4    # "handled":Z
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/high16 v6, 0x3f800000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v5, v3, v8, v9, v6}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V
a=0;// 
a=0;//     .line 488
a=0;//     .local v5, "historicalRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;// 
a=0;//     .line 490
a=0;//     monitor-exit v7
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 491
a=0;//     .end local v0    # "choiceIntent":Landroid/content/Intent;
a=0;//     .end local v2    # "chosenActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .end local v3    # "chosenName":Landroid/content/ComponentName;
a=0;//     .end local v5    # "historicalRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v7
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 414
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 416
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityCount()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 399
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 401
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActivityIndex(Landroid/content/pm/ResolveInfo;)I
a=0;//     .locals 6
a=0;//     .param p1, "activity"    # Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     .line 428
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     .line 430
a=0;//     .local v0, "activities":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 431
a=0;//     .local v1, "activityCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     if-ge v3, v1, :cond_1
a=0;// 
a=0;//     .line 432
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 433
a=0;//     .local v2, "currentActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     iget-object v4, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     .line 434
a=0;//     monitor-exit v5
a=0;// 
a=0;//     .line 437
a=0;//     .end local v2    # "currentActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .end local v3    # "i":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 431
a=0;//     .restart local v2    # "currentActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;);v4=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 437
a=0;//     .end local v2    # "currentActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 438
a=0;//     .end local v0    # "activities":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
a=0;//     .end local v1    # "activityCount":I
a=0;//     .end local v3    # "i":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 515
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 516
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 518
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 521
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 520
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 521
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 520
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getHistoryMaxSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 647
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 648
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getHistorySize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 657
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 658
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 659
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoricalRecords:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 660
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 387
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActivitySorter(Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;)V
a=0;//     .locals 2
a=0;//     .param p1, "activitySorter"    # Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 604
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 605
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 612
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 607
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivitySorter:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;
a=0;// 
a=0;//     .line 608
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 609
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     .line 611
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setDefaultActivity(I)V
a=0;//     .locals 9
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v6
a=0;// 
a=0;//     .line 536
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 538
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 539
a=0;//     .local v2, "newDefaultActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivities:Ljava/util/List;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 542
a=0;//     .local v3, "oldDefaultActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     iget v5, v3, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v7, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v5, v7
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/high16 v7, 0x40a00000
a=0;// 
a=0;//     add-float v4, v5, v7
a=0;// 
a=0;//     .line 550
a=0;//     .local v4, "weight":F
a=0;//     :goto_0
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v5, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v7, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v7, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v5, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 553
a=0;//     .local v0, "defaultName":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-direct {v1, v0, v7, v8, v4}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V
a=0;// 
a=0;//     .line 555
a=0;//     .local v1, "historicalRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->addHisoricalRecord(Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;)Z
a=0;// 
a=0;//     .line 556
a=0;//     monitor-exit v6
a=0;// 
a=0;//     .line 557
a=0;//     return-void
a=0;// 
a=0;//     .line 547
a=0;//     .end local v0    # "defaultName":Landroid/content/ComponentName;
a=0;//     .end local v1    # "historicalRecord":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     .end local v4    # "weight":F
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v7=(Null);v8=(Uninit);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     .restart local v4    # "weight":F
a=0;//     #v4=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     .end local v2    # "newDefaultActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .end local v3    # "oldDefaultActivity":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     .end local v4    # "weight":F
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v6
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public setHistoryMaxSize(I)V
a=0;//     .locals 2
a=0;//     .param p1, "historyMaxSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 628
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 629
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 630
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 638
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 632
a=0;//     :cond_0
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mHistoryMaxSize:I
a=0;// 
a=0;//     .line 633
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->pruneExcessiveHistoricalRecordsIfNeeded()V
a=0;// 
a=0;//     .line 634
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->sortActivitiesIfNeeded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 635
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->notifyChanged()V
a=0;// 
a=0;//     .line 637
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 370
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 371
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 377
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 373
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 374
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mReloadActivities:Z
a=0;// 
a=0;//     .line 375
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->ensureConsistentState()V
a=0;// 
a=0;//     .line 376
a=0;//     monitor-exit v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnChooseActivityListener(Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "listener"    # Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mInstanceLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 501
a=0;//     :try_start_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel;->mActivityChoserModelPolicy:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .line 502
a=0;//     monitor-exit v1
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// 
a=0;//     .line 502
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
