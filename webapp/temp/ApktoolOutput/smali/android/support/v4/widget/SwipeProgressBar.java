package android.support.v4.widget; class SwipeProgressBar {/*

.class final Landroid/support/v4/widget/SwipeProgressBar;
.super Ljava/lang/Object;
.source "SwipeProgressBar.java"


# static fields
.field private static final ANIMATION_DURATION_MS:I = 0x7d0

.field private static final COLOR1:I = -0x4d000000

.field private static final COLOR2:I = -0x80000000

.field private static final COLOR3:I = 0x4d000000

.field private static final COLOR4:I = 0x1a000000

.field private static final FINISH_ANIMATION_DURATION_MS:I = 0x3e8

.field private static final INTERPOLATOR:Landroid/view/animation/Interpolator;


# instance fields
.field private mBounds:Landroid/graphics/Rect;

.field private final mClipRect:Landroid/graphics/RectF;

.field private mColor1:I

.field private mColor2:I

.field private mColor3:I

.field private mColor4:I

.field private mFinishTime:J

.field private final mPaint:Landroid/graphics/Paint;

.field private mParent:Landroid/view/View;

.field private mRunning:Z

.field private mStartTime:J

.field private mTriggerPercentage:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Landroid/support/v4/widget/BakedBezierInterpolator;->getInstance()Landroid/support/v4/widget/BakedBezierInterpolator;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .parameter "parent"

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    #p0=(Reference);
    new-instance v0, Landroid/graphics/Paint;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;

    .line 54
    new-instance v0, Landroid/graphics/RectF;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;

    .line 67
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    .line 70
    iput-object p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;

    .line 71
    const/high16 v0, -0x4d00

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    .line 72
    const/high16 v0, -0x8000

    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I

    .line 73
    const/high16 v0, 0x4d00

    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I

    .line 74
    const/high16 v0, 0x1a00

    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I

    .line 75
    return-void
.end method

.method private drawCircle(Landroid/graphics/Canvas;FFIF)V
    .locals 3
    .parameter "canvas"
    .parameter "cx"
    .parameter "cy"
    .parameter "color"
    .parameter "pct"

    .prologue
    const/4 v2, 0x0

    .line 255
    #v2=(Null);
    iget-object v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;

    #v1=(Reference);
    invoke-virtual {v1, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 256
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 257
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 258
    sget-object v1, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;

    invoke-interface {v1, p5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    .line 259
    .local v0, radiusScale:F
    #v0=(Float);
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 260
    iget-object v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v2, p2, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 261
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 262
    return-void
.end method

.method private drawTrigger(Landroid/graphics/Canvas;II)V
    .locals 4
    .parameter "canvas"
    .parameter "cx"
    .parameter "cy"

    .prologue
    .line 241
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 242
    int-to-float v0, p2

    #v0=(Float);
    int-to-float v1, p3

    #v1=(Float);
    int-to-float v2, p2

    #v2=(Float);
    iget v3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    #v3=(Integer);
    mul-float/2addr v2, v3

    iget-object v3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mPaint:Landroid/graphics/Paint;

    #v3=(Reference);
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 243
    return-void
.end method


# virtual methods
.method draw(Landroid/graphics/Canvas;)V
    .locals 25
    .parameter "canvas"

    .prologue
    .line 137
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v24

    .line 138
    .local v24, width:I
    #v24=(Integer);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v17

    .line 139
    .local v17, height:I
    #v17=(Integer);
    div-int/lit8 v9, v24, 0x2

    .line 140
    .local v9, cx:I
    #v9=(Integer);
    div-int/lit8 v10, v17, 0x2

    .line 141
    .local v10, cy:I
    #v10=(Integer);
    const/4 v11, 0x0

    .line 142
    .local v11, drawTriggerWhileFinishing:Z
    #v11=(Null);
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v23

    .line 143
    .local v23, restoreCount:I
    #v23=(Integer);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 145
    move-object/from16 v0, p0

    iget-boolean v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    #v2=(Boolean);
    if-nez v2, :cond_0

    move-object/from16 v0, p0

    iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-lez v2, :cond_e

    .line 146
    :cond_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v20

    .line 147
    .local v20, now:J
    #v20=(LongLo);v21=(LongHi);
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J

    #v2=(LongLo);v3=(LongHi);
    sub-long v2, v20, v2

    const-wide/16 v4, 0x7d0

    #v4=(LongLo);v5=(LongHi);
    rem-long v12, v2, v4

    .line 148
    .local v12, elapsed:J
    #v12=(LongLo);v13=(LongHi);
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J

    sub-long v2, v20, v2

    const-wide/16 v4, 0x7d0

    div-long v18, v2, v4

    .line 149
    .local v18, iterations:J
    #v18=(LongLo);v19=(LongHi);
    long-to-float v2, v12

    #v2=(Float);
    const/high16 v3, 0x41a0

    #v3=(Integer);
    div-float v22, v2, v3

    .line 153
    .local v22, rawProgress:F
    #v22=(Float);
    move-object/from16 v0, p0

    iget-boolean v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    #v2=(Boolean);
    if-nez v2, :cond_2

    .line 156
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    #v2=(LongLo);v3=(LongHi);
    sub-long v2, v20, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-ltz v2, :cond_1

    .line 157
    const-wide/16 v2, 0x0

    #v2=(LongLo);
    move-object/from16 v0, p0

    iput-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    .line 238
    .end local v12           #elapsed:J
    .end local v18           #iterations:J
    .end local v20           #now:J
    .end local v22           #rawProgress:F
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
    return-void

    .line 164
    .restart local v12       #elapsed:J
    .restart local v18       #iterations:J
    .restart local v20       #now:J
    .restart local v22       #rawProgress:F
    :cond_1
    #v1=(Uninit);v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Null);v12=(LongLo);v13=(LongHi);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(LongLo);v19=(LongHi);v20=(LongLo);v21=(LongHi);v22=(Float);
    move-object/from16 v0, p0

    iget-wide v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    #v2=(LongLo);
    sub-long v2, v20, v2

    const-wide/16 v4, 0x3e8

    rem-long v14, v2, v4

    .line 165
    .local v14, finishElapsed:J
    #v14=(LongLo);v15=(LongHi);
    long-to-float v2, v14

    #v2=(Float);
    const/high16 v3, 0x4120

    #v3=(Integer);
    div-float v16, v2, v3

    .line 166
    .local v16, finishProgress:F
    #v16=(Float);
    const/high16 v2, 0x42c8

    #v2=(Integer);
    div-float v7, v16, v2

    .line 168
    .local v7, pct:F
    #v7=(Float);
    div-int/lit8 v2, v24, 0x2

    int-to-float v2, v2

    #v2=(Float);
    sget-object v3, Landroid/support/v4/widget/SwipeProgressBar;->INTERPOLATOR:Landroid/view/animation/Interpolator;

    #v3=(Reference);
    invoke-interface {v3, v7}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    #v3=(Float);
    mul-float v8, v2, v3

    .line 169
    .local v8, clearRadius:F
    #v8=(Float);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;

    #v2=(Reference);
    int-to-float v3, v9

    sub-float/2addr v3, v8

    const/4 v4, 0x0

    #v4=(Null);
    int-to-float v5, v9

    #v5=(Float);
    add-float/2addr v5, v8

    move/from16 v0, v17

    #v0=(Integer);
    int-to-float v6, v0

    #v6=(Float);
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 170
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mClipRect:Landroid/graphics/RectF;

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 175
    const/4 v11, 0x1

    .line 179
    .end local v7           #pct:F
    .end local v8           #clearRadius:F
    .end local v14           #finishElapsed:J
    .end local v16           #finishProgress:F
    :cond_2
    #v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Boolean);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    cmp-long v2, v18, v2

    #v2=(Byte);
    if-nez v2, :cond_a

    .line 180
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    #v2=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 199
    :goto_1
    const/4 v2, 0x0

    #v2=(Null);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_3

    const/high16 v2, 0x41c8

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gtz v2, :cond_3

    .line 200
    const/high16 v2, 0x41c8

    #v2=(Integer);
    add-float v2, v2, v22

    #v2=(Float);
    const/high16 v3, 0x4000

    #v3=(Integer);
    mul-float/2addr v2, v3

    const/high16 v3, 0x42c8

    div-float v7, v2, v3

    .line 201
    .restart local v7       #pct:F
    #v7=(Float);
    int-to-float v4, v9

    #v4=(Float);
    int-to-float v5, v10

    #v5=(Float);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    #v6=(Integer);
    move-object/from16 v2, p0

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V

    .line 203
    .end local v7           #pct:F
    :cond_3
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_4

    const/high16 v2, 0x4248

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gtz v2, :cond_4

    .line 204
    const/high16 v2, 0x4000

    #v2=(Integer);
    mul-float v2, v2, v22

    #v2=(Float);
    const/high16 v3, 0x42c8

    #v3=(Integer);
    div-float v7, v2, v3

    .line 205
    .restart local v7       #pct:F
    #v7=(Float);
    int-to-float v4, v9

    #v4=(Float);
    int-to-float v5, v10

    #v5=(Float);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I

    #v6=(Integer);
    move-object/from16 v2, p0

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V

    .line 207
    .end local v7           #pct:F
    :cond_4
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/high16 v2, 0x41c8

    #v2=(Integer);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_5

    const/high16 v2, 0x4296

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gtz v2, :cond_5

    .line 208
    const/high16 v2, 0x41c8

    #v2=(Integer);
    sub-float v2, v22, v2

    #v2=(Float);
    const/high16 v3, 0x4000

    #v3=(Integer);
    mul-float/2addr v2, v3

    const/high16 v3, 0x42c8

    div-float v7, v2, v3

    .line 209
    .restart local v7       #pct:F
    #v7=(Float);
    int-to-float v4, v9

    #v4=(Float);
    int-to-float v5, v10

    #v5=(Float);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I

    #v6=(Integer);
    move-object/from16 v2, p0

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V

    .line 211
    .end local v7           #pct:F
    :cond_5
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/high16 v2, 0x4248

    #v2=(Integer);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_6

    const/high16 v2, 0x42c8

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gtz v2, :cond_6

    .line 212
    const/high16 v2, 0x4248

    #v2=(Integer);
    sub-float v2, v22, v2

    #v2=(Float);
    const/high16 v3, 0x4000

    #v3=(Integer);
    mul-float/2addr v2, v3

    const/high16 v3, 0x42c8

    div-float v7, v2, v3

    .line 213
    .restart local v7       #pct:F
    #v7=(Float);
    int-to-float v4, v9

    #v4=(Float);
    int-to-float v5, v10

    #v5=(Float);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I

    #v6=(Integer);
    move-object/from16 v2, p0

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V

    .line 215
    .end local v7           #pct:F
    :cond_6
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/high16 v2, 0x4296

    #v2=(Integer);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_7

    const/high16 v2, 0x42c8

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gtz v2, :cond_7

    .line 216
    const/high16 v2, 0x4296

    #v2=(Integer);
    sub-float v2, v22, v2

    #v2=(Float);
    const/high16 v3, 0x4000

    #v3=(Integer);
    mul-float/2addr v2, v3

    const/high16 v3, 0x42c8

    div-float v7, v2, v3

    .line 217
    .restart local v7       #pct:F
    #v7=(Float);
    int-to-float v4, v9

    #v4=(Float);
    int-to-float v5, v10

    #v5=(Float);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    #v6=(Integer);
    move-object/from16 v2, p0

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/SwipeProgressBar;->drawCircle(Landroid/graphics/Canvas;FFIF)V

    .line 219
    .end local v7           #pct:F
    :cond_7
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-lez v2, :cond_8

    if-eqz v11, :cond_8

    .line 224
    move-object/from16 v0, p1

    move/from16 v1, v23

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 225
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v23

    .line 226
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    #v2=(Reference);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 227
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-direct {v0, v1, v9, v10}, Landroid/support/v4/widget/SwipeProgressBar;->drawTrigger(Landroid/graphics/Canvas;II)V

    .line 230
    :cond_8
    #v1=(Conflicted);v2=(Conflicted);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;

    #v2=(Reference);
    invoke-static {v2}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 237
    .end local v12           #elapsed:J
    .end local v18           #iterations:J
    .end local v20           #now:J
    .end local v22           #rawProgress:F
    :cond_9
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);v13=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
    move-object/from16 v0, p1

    move/from16 v1, v23

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_0

    .line 182
    .restart local v12       #elapsed:J
    .restart local v18       #iterations:J
    .restart local v20       #now:J
    .restart local v22       #rawProgress:F
    :cond_a
    #v1=(Uninit);v2=(Byte);v3=(LongHi);v12=(LongLo);v13=(LongHi);v18=(LongLo);v19=(LongHi);v20=(LongLo);v21=(LongHi);v22=(Float);
    const/4 v2, 0x0

    #v2=(Null);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_b

    const/high16 v2, 0x41c8

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gez v2, :cond_b

    .line 183
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I

    #v2=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_1

    .line 184
    :cond_b
    #v2=(Byte);
    const/high16 v2, 0x41c8

    #v2=(Integer);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_c

    const/high16 v2, 0x4248

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gez v2, :cond_c

    .line 185
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    #v2=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_1

    .line 186
    :cond_c
    #v2=(Byte);
    const/high16 v2, 0x4248

    #v2=(Integer);
    cmpl-float v2, v22, v2

    #v2=(Byte);
    if-ltz v2, :cond_d

    const/high16 v2, 0x4296

    #v2=(Integer);
    cmpg-float v2, v22, v2

    #v2=(Byte);
    if-gez v2, :cond_d

    .line 187
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I

    #v2=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_1

    .line 189
    :cond_d
    #v2=(Byte);
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I

    #v2=(Integer);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_1

    .line 233
    .end local v12           #elapsed:J
    .end local v18           #iterations:J
    .end local v20           #now:J
    .end local v22           #rawProgress:F
    :cond_e
    #v2=(Byte);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-lez v2, :cond_9

    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide/high16 v4, 0x3ff0

    cmpg-double v2, v2, v4

    #v2=(Byte);
    if-gtz v2, :cond_9

    .line 234
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-direct {v0, v1, v9, v10}, Landroid/support/v4/widget/SwipeProgressBar;->drawTrigger(Landroid/graphics/Canvas;II)V

    goto :goto_2
.end method

.method isRunning()Z
    .locals 4

    .prologue
    .line 133
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_1

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Byte);v1=(LongHi);v2=(LongLo);v3=(LongHi);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method setBounds(IIII)V
    .locals 1
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 268
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    #v0=(Reference);
    iput p1, v0, Landroid/graphics/Rect;->left:I

    .line 269
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 270
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    iput p3, v0, Landroid/graphics/Rect;->right:I

    .line 271
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mBounds:Landroid/graphics/Rect;

    iput p4, v0, Landroid/graphics/Rect;->bottom:I

    .line 272
    return-void
.end method

.method setColorScheme(IIII)V
    .locals 0
    .parameter "color1"
    .parameter "color2"
    .parameter "color3"
    .parameter "color4"

    .prologue
    .line 88
    iput p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor1:I

    .line 89
    iput p2, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor2:I

    .line 90
    iput p3, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor3:I

    .line 91
    iput p4, p0, Landroid/support/v4/widget/SwipeProgressBar;->mColor4:I

    .line 92
    return-void
.end method

.method setTriggerPercentage(F)V
    .locals 2
    .parameter "triggerPercentage"

    .prologue
    .line 100
    iput p1, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    .line 101
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J

    .line 102
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 103
    return-void
.end method

.method start()V
    .locals 2

    .prologue
    .line 109
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 110
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    .line 111
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mStartTime:J

    .line 112
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    .line 113
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 115
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method stop()V
    .locals 2

    .prologue
    .line 121
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 122
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mTriggerPercentage:F

    .line 123
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mFinishTime:J

    .line 124
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mRunning:Z

    .line 125
    iget-object v0, p0, Landroid/support/v4/widget/SwipeProgressBar;->mParent:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 127
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

*/}
