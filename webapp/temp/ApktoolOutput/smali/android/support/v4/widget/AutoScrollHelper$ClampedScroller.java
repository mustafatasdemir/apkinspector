package android.support.v4.widget; class AutoScrollHelper$ClampedScroller {/*

.class Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
.super Ljava/lang/Object;
.source "AutoScrollHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/AutoScrollHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ClampedScroller"
.end annotation


# instance fields
.field private mDeltaTime:J

.field private mDeltaX:I

.field private mDeltaY:I

.field private mEffectiveRampDown:I

.field private mRampDownDuration:I

.field private mRampUpDuration:I

.field private mStartTime:J

.field private mStopTime:J

.field private mStopValue:F

.field private mTargetVelocityX:F

.field private mTargetVelocityY:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 743
    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 744
    #p0=(Reference);
    const-wide/high16 v0, -0x8000

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    .line 745
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    .line 746
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J

    .line 747
    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I

    .line 748
    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I

    .line 749
    return-void
.end method

.method private getValueAt(J)F
    .locals 10
    .parameter "currentTime"

    .prologue
    const/high16 v9, 0x3f80

    #v9=(Integer);
    const/4 v4, 0x0

    .line 787
    #v4=(Null);
    iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    #v5=(LongLo);v6=(LongHi);
    cmp-long v5, p1, v5

    #v5=(Byte);
    if-gez v5, :cond_0

    .line 794
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Float);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v4

    .line 789
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Byte);v6=(LongHi);v7=(Uninit);v8=(Uninit);
    iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    #v5=(LongLo);
    const-wide/16 v7, 0x0

    #v7=(LongLo);v8=(LongHi);
    cmp-long v5, v5, v7

    #v5=(Byte);
    if-ltz v5, :cond_1

    iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    #v5=(LongLo);
    cmp-long v5, p1, v5

    #v5=(Byte);
    if-gez v5, :cond_2

    .line 790
    :cond_1
    iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    #v5=(LongLo);
    sub-long v2, p1, v5

    .line 791
    .local v2, elapsedSinceStart:J
    #v2=(LongLo);v3=(LongHi);
    const/high16 v5, 0x3f00

    #v5=(Integer);
    long-to-float v6, v2

    #v6=(Float);
    iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    div-float/2addr v6, v7

    invoke-static {v6, v4, v9}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F

    move-result v4

    #v4=(Float);
    mul-float/2addr v4, v5

    goto :goto_0

    .line 793
    .end local v2           #elapsedSinceStart:J
    :cond_2
    #v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Byte);v6=(LongHi);v7=(LongLo);
    iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    #v5=(LongLo);
    sub-long v0, p1, v5

    .line 794
    .local v0, elapsedSinceEnd:J
    #v0=(LongLo);v1=(LongHi);
    iget v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F

    #v5=(Integer);
    sub-float v5, v9, v5

    #v5=(Float);
    iget v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F

    #v6=(Integer);
    long-to-float v7, v0

    #v7=(Float);
    iget v8, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    div-float/2addr v7, v8

    invoke-static {v7, v4, v9}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F

    move-result v4

    #v4=(Float);
    mul-float/2addr v4, v6

    add-float/2addr v4, v5

    goto :goto_0
.end method

.method private interpolateValue(F)F
    .locals 2
    .parameter "value"

    .prologue
    .line 807
    const/high16 v0, -0x3f80

    #v0=(Integer);
    mul-float/2addr v0, p1

    #v0=(Float);
    mul-float/2addr v0, p1

    const/high16 v1, 0x4080

    #v1=(Integer);
    mul-float/2addr v1, p1

    #v1=(Float);
    add-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public computeScrollDelta()V
    .locals 10

    .prologue
    .line 818
    iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J

    #v6=(LongLo);v7=(LongHi);
    const-wide/16 v8, 0x0

    #v8=(LongLo);v9=(LongHi);
    cmp-long v6, v6, v8

    #v6=(Byte);
    if-nez v6, :cond_0

    .line 819
    new-instance v6, Ljava/lang/RuntimeException;

    #v6=(UninitRef);
    const-string v7, "Cannot compute scroll delta before calling start()"

    #v7=(Reference);
    invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v6=(Reference);
    throw v6

    .line 822
    :cond_0
    #v6=(Byte);v7=(LongHi);
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    .line 823
    .local v0, currentTime:J
    #v0=(LongLo);v1=(LongHi);
    invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F

    move-result v5

    .line 824
    .local v5, value:F
    #v5=(Float);
    invoke-direct {p0, v5}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->interpolateValue(F)F

    move-result v4

    .line 825
    .local v4, scale:F
    #v4=(Float);
    iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J

    #v6=(LongLo);
    sub-long v2, v0, v6

    .line 827
    .local v2, elapsedSinceDelta:J
    #v2=(LongLo);v3=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J

    .line 828
    long-to-float v6, v2

    #v6=(Float);
    mul-float/2addr v6, v4

    iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F

    #v7=(Integer);
    mul-float/2addr v6, v7

    float-to-int v6, v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I

    .line 829
    long-to-float v6, v2

    #v6=(Float);
    mul-float/2addr v6, v4

    iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F

    mul-float/2addr v6, v7

    float-to-int v6, v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I

    .line 830
    return-void
.end method

.method public getDeltaX()I
    .locals 1

    .prologue
    .line 856
    iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I

    #v0=(Integer);
    return v0
.end method

.method public getDeltaY()I
    .locals 1

    .prologue
    .line 864
    iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I

    #v0=(Integer);
    return v0
.end method

.method public getHorizontalDirection()I
    .locals 2

    .prologue
    .line 844
    iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    #v1=(Float);
    div-float/2addr v0, v1

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    return v0
.end method

.method public getVerticalDirection()I
    .locals 2

    .prologue
    .line 848
    iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F

    #v1=(Integer);
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    #v1=(Float);
    div-float/2addr v0, v1

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    return v0
.end method

.method public isFinished()Z
    .locals 6

    .prologue
    .line 782
    iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_0

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);
    iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I

    #v4=(Integer);
    int-to-long v4, v4

    #v4=(LongLo);v5=(LongHi);
    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_0
    #v0=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public requestStop()V
    .locals 5

    .prologue
    .line 775
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    .line 776
    .local v0, currentTime:J
    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    #v2=(LongLo);v3=(LongHi);
    sub-long v2, v0, v2

    long-to-int v2, v2

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I

    #v4=(Integer);
    invoke-static {v2, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$800(III)I

    move-result v2

    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I

    .line 777
    invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F

    move-result v2

    #v2=(Float);
    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F

    .line 778
    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    .line 779
    return-void
.end method

.method public setRampDownDuration(I)V
    .locals 0
    .parameter "durationMillis"

    .prologue
    .line 756
    iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I

    .line 757
    return-void
.end method

.method public setRampUpDuration(I)V
    .locals 0
    .parameter "durationMillis"

    .prologue
    .line 752
    iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I

    .line 753
    return-void
.end method

.method public setTargetVelocity(FF)V
    .locals 0
    .parameter "x"
    .parameter "y"

    .prologue
    .line 839
    iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F

    .line 840
    iput p2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F

    .line 841
    return-void
.end method

.method public start()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 763
    #v2=(Null);
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    .line 764
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J

    .line 765
    iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J

    iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J

    .line 766
    const/high16 v0, 0x3f00

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F

    .line 767
    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I

    .line 768
    iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I

    .line 769
    return-void
.end method

*/}
