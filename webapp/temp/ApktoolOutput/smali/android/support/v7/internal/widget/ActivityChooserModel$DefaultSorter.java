package android.support.v7.internal.widget; class ActivityChooserModel$DefaultSorter {/*

.class final Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;
.super Ljava/lang/Object;
.source "ActivityChooserModel.java"

# interfaces
.implements Landroid/support/v7/internal/widget/ActivityChooserModel$ActivitySorter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActivityChooserModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "DefaultSorter"
.end annotation


# static fields
.field private static final WEIGHT_DECAY_COEFFICIENT:F = 0.95f


# instance fields
.field private final mPackageNameToActivityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
    .locals 1
    .parameter

    .prologue
    .line 930
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 933
    #p0=(Reference);
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;->mPackageNameToActivityMap:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 930
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public sort(Landroid/content/Intent;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .parameter "intent"
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;",
            ">;",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 938
    .local p2, activities:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
    .local p3, historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$DefaultSorter;->mPackageNameToActivityMap:Ljava/util/Map;

    .line 940
    .local v7, packageNameToActivityMap:Ljava/util/Map;,"Ljava/util/Map<Ljava/lang/String;Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;>;"
    #v7=(Reference);
    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 942
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    .line 943
    .local v1, activityCount:I
    #v1=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v0=(Conflicted);v3=(Integer);v6=(Conflicted);v8=(Conflicted);
    if-ge v3, v1, :cond_0

    .line 944
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 945
    .local v0, activity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    const/4 v8, 0x0

    #v8=(Null);
    iput v8, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F

    .line 946
    iget-object v8, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;

    #v8=(Reference);
    iget-object v8, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 947
    .local v6, packageName:Ljava/lang/String;
    #v6=(Reference);
    invoke-interface {v7, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 950
    .end local v0           #activity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v6           #packageName:Ljava/lang/String;
    :cond_0
    #v0=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v8

    #v8=(Integer);
    add-int/lit8 v4, v8, -0x1

    .line 951
    .local v4, lastShareIndex:I
    #v4=(Integer);
    const/high16 v5, 0x3f80

    .line 952
    .local v5, nextRecordWeight:F
    #v5=(Integer);
    move v3, v4

    :goto_1
    #v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-ltz v3, :cond_2

    .line 953
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    .line 954
    .local v2, historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    iget-object v8, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 955
    .restart local v6       #packageName:Ljava/lang/String;
    #v6=(Reference);
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;

    .line 956
    .restart local v0       #activity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    if-eqz v0, :cond_1

    .line 957
    iget v8, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F

    #v8=(Integer);
    iget v9, v2, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    #v9=(Integer);
    mul-float/2addr v9, v5

    #v9=(Float);
    add-float/2addr v8, v9

    #v8=(Float);
    iput v8, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F

    .line 958
    const v8, 0x3f733333

    #v8=(Integer);
    mul-float/2addr v5, v8

    .line 952
    :cond_1
    #v8=(Conflicted);v9=(Conflicted);
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 962
    .end local v0           #activity:Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
    .end local v2           #historicalRecord:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    .end local v6           #packageName:Ljava/lang/String;
    :cond_2
    #v0=(Conflicted);v2=(Conflicted);v6=(Conflicted);
    invoke-static {p2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 969
    return-void
.end method

*/}
