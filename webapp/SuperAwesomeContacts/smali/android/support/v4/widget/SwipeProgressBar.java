package android.support.v4.widget; class SwipeProgressBar { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/SwipeProgressBar;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SwipeProgressBar.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ANIMATION_DURATION_MS:I = 0x7d0
a=0;// 
a=0;// .field private static final COLOR1:I = -0x4d000000
a=0;// 
a=0;// .field private static final COLOR2:I = -0x80000000
a=0;// 
a=0;// .field private static final COLOR3:I = 0x4d000000
a=0;// 
a=0;// .field private static final COLOR4:I = 0x1a000000
a=0;// 
a=0;// .field private static final FINISH_ANIMATION_DURATION_MS:I = 0x3e8
a=0;// 
a=0;// .field private static final INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mClipRect:Landroid/graphics/RectF;
a=0;// 
a=0;// .field private mColor1:I
a=0;// 
a=0;// .field private mColor2:I
a=0;// 
a=0;// .field private mColor3:I
a=0;// 
a=0;// .field private mColor4:I
a=0;// 
a=0;// .field private mFinishTime:J
a=0;// 
a=0;// .field private final mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mParent:Landroid/view/View;
a=0;// 
a=0;// .field private mRunning:Z
a=0;// 
a=0;// .field private mStartTime:J
a=0;// 
a=0;// .field private mTriggerPercentage:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-static {}, Landroid/support/v4/widget/BakedBezierInterpolator;->getInstance()Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "parent"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/RectF;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 70
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;
a=0;// 
a=0;//     .line 71
a=0;//     const/high16 v0, -0x4d000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     .line 72
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I
a=0;// 
a=0;//     .line 73
a=0;//     const/high16 v0, 0x4d000000
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I
a=0;// 
a=0;//     .line 74
a=0;//     const/high16 v0, 0x1a000000
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;//     .locals 3
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "cx"    # F
a=0;//     .param p3, "cy"    # F
a=0;//     .param p4, "color"    # I
a=0;//     .param p5, "pct"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 255
a=0;//     #v2=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v1, p4}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 256
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 257
a=0;//     invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 258
a=0;//     sget-object v1, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v1, p5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 259
a=0;//     .local v0, "radiusScale":F
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-virtual {p1, v2, v2, p2, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private drawTrigger(Landroid/graphics/Canvas;II)V
a=0;//     .locals 4
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "cx"    # I
a=0;//     .param p3, "cy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 242
a=0;//     int-to-float v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v1, p3
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, p2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 243
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 25
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 138
a=0;//     .local v24, "width":I
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 139
a=0;//     .local v17, "height":I
a=0;//     #v17=(Integer);
a=0;//     div-int/lit8 v9, v24, 0x2
a=0;// 
a=0;//     .line 140
a=0;//     .local v9, "cx":I
a=0;//     #v9=(Integer);
a=0;//     div-int/lit8 v10, v17, 0x2
a=0;// 
a=0;//     .line 141
a=0;//     .local v10, "cy":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     .local v11, "drawTriggerWhileFinishing":Z
a=0;//     #v11=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 143
a=0;//     .local v23, "restoreCount":I
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 145
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_e
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v20
a=0;// 
a=0;//     .line 147
a=0;//     .local v20, "now":J
a=0;//     #v20=(LongLo);v21=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v2, v20, v2
a=0;// 
a=0;//     const-wide/16 v4, 0x7d0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     rem-long v12, v2, v4
a=0;// 
a=0;//     .line 148
a=0;//     .local v12, "elapsed":J
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J
a=0;// 
a=0;//     sub-long v2, v20, v2
a=0;// 
a=0;//     const-wide/16 v4, 0x7d0
a=0;// 
a=0;//     div-long v18, v2, v4
a=0;// 
a=0;//     .line 149
a=0;//     .local v18, "iterations":J
a=0;//     #v18=(LongLo);v19=(LongHi);
a=0;//     long-to-float v2, v12
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x41a00000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float v22, v2, v3
a=0;// 
a=0;//     .line 153
a=0;//     .local v22, "rawProgress":F
a=0;//     #v22=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v2, v20, v2
a=0;// 
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     .line 157
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     .line 238
a=0;//     .end local v12    # "elapsed":J
a=0;//     .end local v18    # "iterations":J
a=0;//     .end local v20    # "now":J
a=0;//     .end local v22    # "rawProgress":F
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 164
a=0;//     .restart local v12    # "elapsed":J
a=0;//     .restart local v18    # "iterations":J
a=0;//     .restart local v20    # "now":J
a=0;//     .restart local v22    # "rawProgress":F
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Null);v12=(LongLo);v13=(LongHi);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(LongLo);v19=(LongHi);v20=(LongLo);v21=(LongHi);v22=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sub-long v2, v20, v2
a=0;// 
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     rem-long v14, v2, v4
a=0;// 
a=0;//     .line 165
a=0;//     .local v14, "finishElapsed":J
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     long-to-float v2, v14
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x41200000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float v16, v2, v3
a=0;// 
a=0;//     .line 166
a=0;//     .local v16, "finishProgress":F
a=0;//     #v16=(Float);
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-float v7, v16, v2
a=0;// 
a=0;//     .line 168
a=0;//     .local v7, "pct":F
a=0;//     #v7=(Float);
a=0;//     div-int/lit8 v2, v24, 0x2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sget-object v3, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-interface {v3, v7}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float v8, v2, v3
a=0;// 
a=0;//     .line 169
a=0;//     .local v8, "clearRadius":F
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/RectF;);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     sub-float/2addr v3, v8
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     int-to-float v5, v9
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v5, v8
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v6, v0
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V
a=0;// 
a=0;//     .line 170
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     .line 179
a=0;//     .end local v7    # "pct":F
a=0;//     .end local v8    # "clearRadius":F
a=0;//     .end local v14    # "finishElapsed":J
a=0;//     .end local v16    # "finishProgress":F
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Boolean);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v18, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 180
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     .line 199
a=0;//     :goto_1
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_3
a=0;// 
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_3
a=0;// 
a=0;//     .line 200
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-float v2, v2, v22
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x42c80000
a=0;// 
a=0;//     div-float v7, v2, v3
a=0;// 
a=0;//     .line 201
a=0;//     .restart local v7    # "pct":F
a=0;//     #v7=(Float);
a=0;//     int-to-float v4, v9
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v10
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;// 
a=0;//     .line 203
a=0;//     .end local v7    # "pct":F
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_4
a=0;// 
a=0;//     const/high16 v2, 0x42480000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_4
a=0;// 
a=0;//     .line 204
a=0;//     const/high16 v2, 0x40000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float v2, v2, v22
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x42c80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float v7, v2, v3
a=0;// 
a=0;//     .line 205
a=0;//     .restart local v7    # "pct":F
a=0;//     #v7=(Float);
a=0;//     int-to-float v4, v9
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v10
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;// 
a=0;//     .line 207
a=0;//     .end local v7    # "pct":F
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_5
a=0;// 
a=0;//     const/high16 v2, 0x42960000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_5
a=0;// 
a=0;//     .line 208
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x42c80000
a=0;// 
a=0;//     div-float v7, v2, v3
a=0;// 
a=0;//     .line 209
a=0;//     .restart local v7    # "pct":F
a=0;//     #v7=(Float);
a=0;//     int-to-float v4, v9
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v10
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;// 
a=0;//     .line 211
a=0;//     .end local v7    # "pct":F
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/high16 v2, 0x42480000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_6
a=0;// 
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_6
a=0;// 
a=0;//     .line 212
a=0;//     const/high16 v2, 0x42480000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x42c80000
a=0;// 
a=0;//     div-float v7, v2, v3
a=0;// 
a=0;//     .line 213
a=0;//     .restart local v7    # "pct":F
a=0;//     #v7=(Float);
a=0;//     int-to-float v4, v9
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v10
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;// 
a=0;//     .line 215
a=0;//     .end local v7    # "pct":F
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/high16 v2, 0x42960000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_7
a=0;// 
a=0;//     const/high16 v2, 0x42c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_7
a=0;// 
a=0;//     .line 216
a=0;//     const/high16 v2, 0x42960000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     const/high16 v3, 0x42c80000
a=0;// 
a=0;//     div-float v7, v2, v3
a=0;// 
a=0;//     .line 217
a=0;//     .restart local v7    # "pct":F
a=0;//     #v7=(Float);
a=0;//     int-to-float v4, v9
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v10
a=0;// 
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V
a=0;// 
a=0;//     .line 219
a=0;//     .end local v7    # "pct":F
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     if-eqz v11, :cond_8
a=0;// 
a=0;//     .line 224
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 226
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 227
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1, v9, v10}, Landroid/support/v4/widget/SwipeProgressBar;->drawTrigger(Landroid/graphics/Canvas;II)V
a=0;// 
a=0;//     .line 230
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v2}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 237
a=0;//     .end local v12    # "elapsed":J
a=0;//     .end local v18    # "iterations":J
a=0;//     .end local v20    # "now":J
a=0;//     .end local v22    # "rawProgress":F
a=0;//     :cond_9
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     .restart local v12    # "elapsed":J
a=0;//     .restart local v18    # "iterations":J
a=0;//     .restart local v20    # "now":J
a=0;//     .restart local v22    # "rawProgress":F
a=0;//     :cond_a
a=0;//     #v1=(Uninit);v2=(Byte);v3=(LongHi);v12=(LongLo);v13=(LongHi);v18=(LongLo);v19=(LongHi);v20=(LongLo);v21=(LongHi);v22=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_b
a=0;// 
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_b
a=0;// 
a=0;//     .line 183
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_b
a=0;//     #v2=(Byte);
a=0;//     const/high16 v2, 0x41c80000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_c
a=0;// 
a=0;//     const/high16 v2, 0x42480000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_c
a=0;// 
a=0;//     .line 185
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 186
a=0;//     :cond_c
a=0;//     #v2=(Byte);
a=0;//     const/high16 v2, 0x42480000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_d
a=0;// 
a=0;//     const/high16 v2, 0x42960000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpg-float v2, v22, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_d
a=0;// 
a=0;//     .line 187
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 189
a=0;//     :cond_d
a=0;//     #v2=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 233
a=0;//     .end local v12    # "elapsed":J
a=0;//     .end local v18    # "iterations":J
a=0;//     .end local v20    # "now":J
a=0;//     .end local v22    # "rawProgress":F
a=0;//     :cond_e
a=0;//     #v2=(Byte);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide/high16 v4, 0x3ff0000000000000L
a=0;// 
a=0;//     cmpg-double v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_9
a=0;// 
a=0;//     .line 234
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1, v9, v10}, Landroid/support/v4/widget/SwipeProgressBar;->drawTrigger(Landroid/graphics/Canvas;II)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method isRunning()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setBounds(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "left"    # I
a=0;//     .param p2, "top"    # I
a=0;//     .param p3, "right"    # I
a=0;//     .param p4, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput p1, v0, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     iput p2, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     iput p3, v0, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;
a=0;// 
a=0;//     iput p4, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setColorScheme(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "color1"    # I
a=0;//     .param p2, "color2"    # I
a=0;//     .param p3, "color3"    # I
a=0;//     .param p4, "color4"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I
a=0;// 
a=0;//     .line 89
a=0;//     iput p2, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I
a=0;// 
a=0;//     .line 90
a=0;//     iput p3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I
a=0;// 
a=0;//     .line 91
a=0;//     iput p4, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setTriggerPercentage(F)V
a=0;//     .locals 2
a=0;//     .param p1, "triggerPercentage"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     .line 101
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method start()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     .line 111
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J
a=0;// 
a=0;//     .line 112
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method stop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F
a=0;// 
a=0;//     .line 123
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
