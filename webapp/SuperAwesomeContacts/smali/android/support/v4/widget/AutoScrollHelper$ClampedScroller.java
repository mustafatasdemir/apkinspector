package android.support.v4.widget; class AutoScrollHelper$ClampedScroller { void a() { int a;
a=0;// .class Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoScrollHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/AutoScrollHelper;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "ClampedScroller"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDeltaTime:J
a=0;// 
a=0;// .field private mDeltaX:I
a=0;// 
a=0;// .field private mDeltaY:I
a=0;// 
a=0;// .field private mEffectiveRampDown:I
a=0;// 
a=0;// .field private mRampDownDuration:I
a=0;// 
a=0;// .field private mRampUpDuration:I
a=0;// 
a=0;// .field private mStartTime:J
a=0;// 
a=0;// .field private mStopTime:J
a=0;// 
a=0;// .field private mStopValue:F
a=0;// 
a=0;// .field private mTargetVelocityX:F
a=0;// 
a=0;// .field private mTargetVelocityY:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 743
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 744
a=0;//     #p0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     const-wide/high16 v0, -0x8000000000000000L
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     .line 745
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     .line 746
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
a=0;// 
a=0;//     .line 747
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
a=0;// 
a=0;//     .line 748
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
a=0;// 
a=0;//     .line 749
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getValueAt(J)F
a=0;//     .locals 10
a=0;//     .param p1, "currentTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 787
a=0;//     #v4=(Null);
a=0;//     iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v5, p1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_0
a=0;// 
a=0;//     .line 794
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Float);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 789
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Byte);v6=(LongHi);v7=(Uninit);v8=(Uninit);
a=0;//     iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_1
a=0;// 
a=0;//     iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmp-long v5, p1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_2
a=0;// 
a=0;//     .line 790
a=0;//     :cond_1
a=0;//     iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     sub-long v2, p1, v5
a=0;// 
a=0;//     .line 791
a=0;//     .local v2, "elapsedSinceStart":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/high16 v5, 0x3f000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     long-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     invoke-static {v6, v4, v9}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 793
a=0;//     .end local v2    # "elapsedSinceStart":J
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Byte);v6=(LongHi);v7=(LongLo);
a=0;//     iget-wide v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     sub-long v0, p1, v5
a=0;// 
a=0;//     .line 794
a=0;//     .local v0, "elapsedSinceEnd":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float v5, v9, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     long-to-float v7, v0
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iget v8, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     div-float/2addr v7, v8
a=0;// 
a=0;//     invoke-static {v7, v4, v9}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, v6
a=0;// 
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private interpolateValue(F)F
a=0;//     .locals 2
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 807
a=0;//     const/high16 v0, -0x3f800000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, p1
a=0;// 
a=0;//     const/high16 v1, 0x40800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public computeScrollDelta()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 818
a=0;//     iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v6, v6, v8
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 819
a=0;//     new-instance v6, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v7, "Cannot compute scroll delta before calling start()"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 822
a=0;//     :cond_0
a=0;//     #v6=(Byte);v7=(LongHi);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 823
a=0;//     .local v0, "currentTime":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 824
a=0;//     .local v5, "value":F
a=0;//     #v5=(Float);
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->interpolateValue(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 825
a=0;//     .local v4, "scale":F
a=0;//     #v4=(Float);
a=0;//     iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     sub-long v2, v0, v6
a=0;// 
a=0;//     .line 827
a=0;//     .local v2, "elapsedSinceDelta":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
a=0;// 
a=0;//     .line 828
a=0;//     long-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v4
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
a=0;// 
a=0;//     .line 829
a=0;//     long-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, v4
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
a=0;// 
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
a=0;// 
a=0;//     .line 830
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getDeltaX()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 856
a=0;//     iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDeltaY()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 864
a=0;//     iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHorizontalDirection()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getVerticalDirection()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isFinished()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 782
a=0;//     iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestStop()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 775
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 776
a=0;//     .local v0, "currentTime":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v2, v0, v2
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$800(III)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
a=0;// 
a=0;//     .line 777
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
a=0;// 
a=0;//     .line 778
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     .line 779
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRampDownDuration(I)V
a=0;//     .locals 0
a=0;//     .param p1, "durationMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 756
a=0;//     iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I
a=0;// 
a=0;//     .line 757
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRampUpDuration(I)V
a=0;//     .locals 0
a=0;//     .param p1, "durationMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 752
a=0;//     iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I
a=0;// 
a=0;//     .line 753
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTargetVelocity(FF)V
a=0;//     .locals 0
a=0;//     .param p1, "x"    # F
a=0;//     .param p2, "y"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 839
a=0;//     iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
a=0;// 
a=0;//     .line 840
a=0;//     iput p2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
a=0;// 
a=0;//     .line 841
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 763
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     .line 764
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
a=0;// 
a=0;//     .line 765
a=0;//     iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
a=0;// 
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
a=0;// 
a=0;//     .line 766
a=0;//     const/high16 v0, 0x3f000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
a=0;// 
a=0;//     .line 767
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
a=0;// 
a=0;//     .line 768
a=0;//     iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
a=0;// 
a=0;//     .line 769
a=0;//     return-void
a=0;// .end method
}}
