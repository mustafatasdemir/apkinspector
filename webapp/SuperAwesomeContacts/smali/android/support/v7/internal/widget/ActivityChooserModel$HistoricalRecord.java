package android.support.v7.internal.widget; class ActivityChooserModel$HistoricalRecord { void a() { int a;
a=0;// .class public final Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "HistoricalRecord"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final activity:Landroid/content/ComponentName;
a=0;// 
a=0;// .field public final time:J
a=0;// 
a=0;// .field public final weight:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/ComponentName;JF)V
a=0;//     .locals 0
a=0;//     .param p1, "activityName"    # Landroid/content/ComponentName;
a=0;//     .param p2, "time"    # J
a=0;//     .param p4, "weight"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 809
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 810
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 811
a=0;//     iput-wide p2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     .line 812
a=0;//     iput p4, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     .line 813
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;JF)V
a=0;//     .locals 1
a=0;//     .param p1, "activityName"    # Ljava/lang/String;
a=0;//     .param p2, "time"    # J
a=0;//     .param p4, "weight"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 799
a=0;//     invoke-static {p1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-direct {p0, v0, p2, p3, p4}, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;-><init>(Landroid/content/ComponentName;JF)V
a=0;// 
a=0;//     .line 800
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 7
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 827
a=0;//     #v2=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     .line 850
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 830
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 831
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 833
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v3, v4, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 834
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 836
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 837
a=0;//     .local v0, "other":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 838
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 839
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 841
a=0;//     :cond_4
a=0;//     #v1=(One);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 842
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 844
a=0;//     :cond_5
a=0;//     #v1=(One);v3=(Conflicted);
a=0;//     iget-wide v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-wide v5, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 845
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 847
a=0;//     :cond_6
a=0;//     #v1=(One);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 848
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 817
a=0;//     const/16 v0, 0x1f
a=0;// 
a=0;//     .line 818
a=0;//     .local v0, "prime":I
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 819
a=0;//     .local v1, "result":I
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, 0x1f
a=0;// 
a=0;//     .line 820
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v2, v1, 0x1f
a=0;// 
a=0;//     iget-wide v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-wide v5, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/16 v7, 0x20
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     ushr-long/2addr v5, v7
a=0;// 
a=0;//     xor-long/2addr v3, v5
a=0;// 
a=0;//     long-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v1, v2, v3
a=0;// 
a=0;//     .line 821
a=0;//     mul-int/lit8 v2, v1, 0x1f
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int v1, v2, v3
a=0;// 
a=0;//     .line 822
a=0;//     return v1
a=0;// 
a=0;//     .line 819
a=0;//     :cond_0
a=0;//     #v1=(One);v2=(Reference,Landroid/content/ComponentName;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 856
a=0;//     .local v0, "builder":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 857
a=0;//     const-string v1, "; activity:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 858
a=0;//     const-string v1, "; time:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 859
a=0;//     const-string v1, "; weight:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/math/BigDecimal;-><init>(D)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/math/BigDecimal;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 860
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 861
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
