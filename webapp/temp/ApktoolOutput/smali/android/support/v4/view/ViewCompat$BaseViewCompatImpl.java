package android.support.v4.view; class ViewCompat$BaseViewCompatImpl {/*

.class Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;
.super Ljava/lang/Object;
.source "ViewCompat.java"

# interfaces
.implements Landroid/support/v4/view/ViewCompat$ViewCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BaseViewCompatImpl"
.end annotation


# instance fields
.field private mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;

.field private mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;

.field private mTempDetachBound:Z

.field mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Landroid/support/v4/view/ViewPropertyAnimatorCompat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 322
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 326
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mViewPropertyAnimatorCompatMap:Ljava/util/WeakHashMap;

    return-void
.end method

.method private bindTempDetach()V
    .locals 4

    .prologue
    .line 510
    :try_start_0
    const-class v1, Landroid/view/View;

    #v1=(Reference);
    const-string v2, "dispatchStartTemporaryDetach"

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;

    .line 512
    const-class v1, Landroid/view/View;

    const-string v2, "dispatchFinishTemporaryDetach"

    const/4 v3, 0x0

    #v3=(Null);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 517
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z

    .line 518
    return-void

    .line 514
    :catch_0
    move-exception v0

    .line 515
    .local v0, e:Ljava/lang/NoSuchMethodException;
    #v0=(Reference);
    const-string v1, "ViewCompat"

    #v1=(Reference);
    const-string v2, "Couldn\'t find method"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method


# virtual methods
.method public animate(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    .locals 1
    .parameter "view"

    .prologue
    .line 577
    new-instance v0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;-><init>(Landroid/view/View;)V

    #v0=(Reference);
    return-object v0
.end method

.method public canScrollHorizontally(Landroid/view/View;I)Z
    .locals 1
    .parameter "v"
    .parameter "direction"

    .prologue
    .line 330
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public canScrollVertically(Landroid/view/View;I)Z
    .locals 1
    .parameter "v"
    .parameter "direction"

    .prologue
    .line 333
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public dispatchFinishTemporaryDetach(Landroid/view/View;)V
    .locals 3
    .parameter "view"

    .prologue
    .line 493
    iget-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 494
    invoke-direct {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->bindTempDetach()V

    .line 496
    :cond_0
    iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 498
    :try_start_0
    iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchFinishTemporaryDetach:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    #v2=(Null);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 506
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 499
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 500
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "ViewCompat"

    const-string v2, "Error calling dispatchFinishTemporaryDetach"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 504
    .end local v0           #e:Ljava/lang/Exception;
    :cond_1
    #v0=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Landroid/view/View;->onFinishTemporaryDetach()V

    goto :goto_0
.end method

.method public dispatchStartTemporaryDetach(Landroid/view/View;)V
    .locals 3
    .parameter "view"

    .prologue
    .line 476
    iget-boolean v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mTempDetachBound:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 477
    invoke-direct {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->bindTempDetach()V

    .line 479
    :cond_0
    iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 481
    :try_start_0
    iget-object v1, p0, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->mDispatchStartTemporaryDetach:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    #v2=(Null);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 489
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 482
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 483
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "ViewCompat"

    const-string v2, "Error calling dispatchStartTemporaryDetach"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 487
    .end local v0           #e:Ljava/lang/Exception;
    :cond_1
    #v0=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Landroid/view/View;->onStartTemporaryDetach()V

    goto :goto_0
.end method

.method public getAccessibilityLiveRegion(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 451
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    .locals 1
    .parameter "view"

    .prologue
    .line 385
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getAlpha(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 388
    const/high16 v0, 0x3f80

    #v0=(Integer);
    return v0
.end method

.method getFrameTime()J
    .locals 2

    .prologue
    .line 373
    const-wide/16 v0, 0xa

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getImportantForAccessibility(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 376
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getLabelFor(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 397
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getLayerType(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 394
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getLayoutDirection(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 408
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getMeasuredHeightAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 441
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getMeasuredState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 446
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getMeasuredWidthAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 436
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getMinimumHeight(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 572
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getMinimumWidth(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 567
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getOverScrollMode(Landroid/view/View;)I
    .locals 1
    .parameter "v"

    .prologue
    .line 336
    const/4 v0, 0x2

    #v0=(PosByte);
    return v0
.end method

.method public getPaddingEnd(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 466
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getPaddingStart(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 461
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1
    .parameter "view"

    .prologue
    .line 418
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getPivotX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 642
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getPivotY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 647
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getRotation(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 542
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getRotationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 547
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getRotationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 552
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getScaleX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 557
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getScaleY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 562
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getTranslationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 522
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getTranslationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 527
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 532
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 537
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public hasTransientState(Landroid/view/View;)Z
    .locals 1
    .parameter "view"

    .prologue
    .line 355
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public isOpaque(Landroid/view/View;)Z
    .locals 4
    .parameter "view"

    .prologue
    const/4 v1, 0x0

    .line 423
    #v1=(Null);
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 424
    .local v0, bg:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 425
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    #v2=(Integer);
    const/4 v3, -0x1

    #v3=(Byte);
    if-ne v2, v3, :cond_0

    const/4 v1, 0x1

    .line 427
    :cond_0
    #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .parameter "v"
    .parameter "event"

    .prologue
    .line 349
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    .locals 0
    .parameter "v"
    .parameter "info"

    .prologue
    .line 352
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .parameter "v"
    .parameter "event"

    .prologue
    .line 346
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1
    .parameter "view"
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 382
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public postInvalidateOnAnimation(Landroid/view/View;)V
    .locals 0
    .parameter "view"

    .prologue
    .line 361
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 362
    return-void
.end method

.method public postInvalidateOnAnimation(Landroid/view/View;IIII)V
    .locals 0
    .parameter "view"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 364
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->invalidate(IIII)V

    .line 365
    return-void
.end method

.method public postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 2
    .parameter "view"
    .parameter "action"

    .prologue
    .line 367
    invoke-virtual {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->getFrameTime()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 368
    return-void
.end method

.method public postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 2
    .parameter "view"
    .parameter "action"
    .parameter "delayMillis"

    .prologue
    .line 370
    invoke-virtual {p0}, Landroid/support/v4/view/ViewCompat$BaseViewCompatImpl;->getFrameTime()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    add-long/2addr v0, p3

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 371
    return-void
.end method

.method public resolveSizeAndState(III)I
    .locals 1
    .parameter "size"
    .parameter "measureSpec"
    .parameter "childMeasuredState"

    .prologue
    .line 431
    invoke-static {p1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    .locals 0
    .parameter "v"
    .parameter "delegate"

    .prologue
    .line 343
    return-void
.end method

.method public setAccessibilityLiveRegion(Landroid/view/View;I)V
    .locals 0
    .parameter "view"
    .parameter "mode"

    .prologue
    .line 457
    return-void
.end method

.method public setAlpha(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 598
    return-void
.end method

.method public setHasTransientState(Landroid/view/View;Z)V
    .locals 0
    .parameter "view"
    .parameter "hasTransientState"

    .prologue
    .line 359
    return-void
.end method

.method public setImportantForAccessibility(Landroid/view/View;I)V
    .locals 0
    .parameter "view"
    .parameter "mode"

    .prologue
    .line 380
    return-void
.end method

.method public setLabelFor(Landroid/view/View;I)V
    .locals 0
    .parameter "view"
    .parameter "id"

    .prologue
    .line 401
    return-void
.end method

.method public setLayerPaint(Landroid/view/View;Landroid/graphics/Paint;)V
    .locals 0
    .parameter "view"
    .parameter "p"

    .prologue
    .line 404
    return-void
.end method

.method public setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 0
    .parameter "view"
    .parameter "layerType"
    .parameter "paint"

    .prologue
    .line 392
    return-void
.end method

.method public setLayoutDirection(Landroid/view/View;I)V
    .locals 0
    .parameter "view"
    .parameter "layoutDirection"

    .prologue
    .line 414
    return-void
.end method

.method public setOverScrollMode(Landroid/view/View;I)V
    .locals 0
    .parameter "v"
    .parameter "mode"

    .prologue
    .line 340
    return-void
.end method

.method public setPaddingRelative(Landroid/view/View;IIII)V
    .locals 0
    .parameter "view"
    .parameter "start"
    .parameter "top"
    .parameter "end"
    .parameter "bottom"

    .prologue
    .line 471
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->setPadding(IIII)V

    .line 472
    return-void
.end method

.method public setPivotX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 633
    return-void
.end method

.method public setPivotY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 638
    return-void
.end method

.method public setRotation(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 583
    return-void
.end method

.method public setRotationX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 603
    return-void
.end method

.method public setRotationY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 608
    return-void
.end method

.method public setScaleX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 613
    return-void
.end method

.method public setScaleY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 618
    return-void
.end method

.method public setTranslationX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 588
    return-void
.end method

.method public setTranslationY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 593
    return-void
.end method

.method public setX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 623
    return-void
.end method

.method public setY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 628
    return-void
.end method

*/}
