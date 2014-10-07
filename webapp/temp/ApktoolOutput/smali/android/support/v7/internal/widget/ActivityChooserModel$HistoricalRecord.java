package android.support.v7.internal.widget; class ActivityChooserModel$HistoricalRecord {/*

.class public final Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
.super Ljava/lang/Object;
.source "ActivityChooserModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActivityChooserModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HistoricalRecord"
.end annotation


# instance fields
.field public final activity:Landroid/content/ComponentName;

.field public final time:J

.field public final weight:F


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;JF)V
    .locals 0
    .parameter "activityName"
    .parameter "time"
    .parameter "weight"

    .prologue
    .line 809
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 810
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    .line 811
    iput-wide p2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    .line 812
    iput p4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    .line 813
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JF)V
    .locals 1
    .parameter "activityName"
    .parameter "time"
    .parameter "weight"

    .prologue
    .line 799
    invoke-static {p1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v0

    #v0=(Reference);
    invoke-direct {p0, v0, p2, p3, p4}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V

    .line 800
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .parameter "obj"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 827
    #v2=(Null);
    if-ne p0, p1, :cond_1

    .line 850
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v1

    .line 830
    :cond_1
    #v0=(Uninit);v1=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    if-nez p1, :cond_2

    move v1, v2

    .line 831
    #v1=(Null);
    goto :goto_0

    .line 833
    :cond_2
    #v1=(One);
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    #v4=(Reference);
    if-eq v3, v4, :cond_3

    move v1, v2

    .line 834
    #v1=(Null);
    goto :goto_0

    :cond_3
    #v1=(One);
    move-object v0, p1

    .line 836
    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    .line 837
    .local v0, other:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    if-nez v3, :cond_4

    .line 838
    iget-object v3, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    if-eqz v3, :cond_5

    move v1, v2

    .line 839
    #v1=(Null);
    goto :goto_0

    .line 841
    :cond_4
    #v1=(One);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    iget-object v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    invoke-virtual {v3, v4}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_5

    move v1, v2

    .line 842
    #v1=(Null);
    goto :goto_0

    .line 844
    :cond_5
    #v1=(One);v3=(Conflicted);
    iget-wide v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v3=(LongLo);v4=(LongHi);
    iget-wide v5, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v5=(LongLo);v6=(LongHi);
    cmp-long v3, v3, v5

    #v3=(Byte);
    if-eqz v3, :cond_6

    move v1, v2

    .line 845
    #v1=(Null);
    goto :goto_0

    .line 847
    :cond_6
    #v1=(One);
    iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    iget v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    #v4=(Integer);
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-eq v3, v4, :cond_0

    move v1, v2

    .line 848
    #v1=(Null);
    goto :goto_0
.end method

.method public hashCode()I
    .locals 8

    .prologue
    .line 817
    const/16 v0, 0x1f

    .line 818
    .local v0, prime:I
    #v0=(PosByte);
    const/4 v1, 0x1

    .line 819
    .local v1, result:I
    #v1=(One);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    #v2=(Reference);
    if-nez v2, :cond_0

    const/4 v2, 0x0

    :goto_0
    #v2=(Integer);
    add-int/lit8 v1, v2, 0x1f

    .line 820
    #v1=(Integer);
    mul-int/lit8 v2, v1, 0x1f

    iget-wide v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v3=(LongLo);v4=(LongHi);
    iget-wide v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v5=(LongLo);v6=(LongHi);
    const/16 v7, 0x20

    #v7=(PosByte);
    ushr-long/2addr v5, v7

    xor-long/2addr v3, v5

    long-to-int v3, v3

    #v3=(Integer);
    add-int v1, v2, v3

    .line 821
    mul-int/lit8 v2, v1, 0x1f

    iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    add-int v1, v2, v3

    .line 822
    return v1

    .line 819
    :cond_0
    #v1=(One);v2=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroid/content/ComponentName;->hashCode()I

    move-result v2

    #v2=(Integer);
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 855
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 856
    .local v0, builder:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const-string v1, "["

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 857
    const-string v1, "; activity:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 858
    const-string v1, "; time:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 859
    const-string v1, "; weight:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/math/BigDecimal;

    #v2=(UninitRef);
    iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    #v3=(Integer);
    float-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-direct {v2, v3, v4}, Ljava/math/BigDecimal;-><init>(D)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 860
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 861
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

*/}
