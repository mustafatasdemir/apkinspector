package android.support.v4.widget; class ExploreByTouchHelper {/*

.class public abstract Landroid/support/v4/widget/ExploreByTouchHelper;
.super Landroid/support/v4/view/AccessibilityDelegateCompat;
.source "ExploreByTouchHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/ExploreByTouchHelper$1;,
        Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
    }
.end annotation


# static fields
.field private static final DEFAULT_CLASS_NAME:Ljava/lang/String; = null

.field public static final INVALID_ID:I = -0x80000000


# instance fields
.field private mFocusedVirtualViewId:I

.field private mHoveredVirtualViewId:I

.field private final mManager:Landroid/view/accessibility/AccessibilityManager;

.field private mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;

.field private final mTempGlobalRect:[I

.field private final mTempParentRect:Landroid/graphics/Rect;

.field private final mTempScreenRect:Landroid/graphics/Rect;

.field private final mTempVisibleRect:Landroid/graphics/Rect;

.field private final mView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    const-class v0, Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3
    .parameter "forView"

    .prologue
    const/high16 v2, -0x8000

    .line 89
    #v2=(Integer);
    invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V

    .line 64
    #p0=(Reference);
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;

    .line 65
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    .line 66
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;

    .line 67
    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [I

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I

    .line 79
    iput v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    .line 82
    iput v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I

    .line 90
    if-nez p1, :cond_0

    .line 91
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    const-string v2, "View may not be null"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 94
    :cond_0
    #v2=(Integer);
    iput-object p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 96
    .local v0, context:Landroid/content/Context;
    #v0=(Reference);
    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    .line 97
    return-void
.end method

.method static synthetic access$100(Landroid/support/v4/widget/ExploreByTouchHelper;I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 56
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNode(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v4/widget/ExploreByTouchHelper;IILandroid/os/Bundle;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performAction(IILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method private clearAccessibilityFocus(I)Z
    .locals 1
    .parameter "virtualViewId"

    .prologue
    .line 563
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 564
    const/high16 v0, -0x8000

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    .line 565
    iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 566
    const/high16 v0, 0x1

    #v0=(Integer);
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    .line 568
    const/4 v0, 0x1

    .line 570
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private createEvent(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1
    .parameter "virtualViewId"
    .parameter "eventType"

    .prologue
    .line 255
    packed-switch p1, :pswitch_data_0

    .line 259
    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    .line 257
    :pswitch_0
    #v0=(Uninit);
    invoke-direct {p0, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    .line 255
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch
.end method

.method private createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 4
    .parameter "virtualViewId"
    .parameter "eventType"

    .prologue
    .line 287
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 288
    .local v0, event:Landroid/view/accessibility/AccessibilityEvent;
    #v0=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V

    .line 289
    sget-object v2, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 292
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateEventForVirtualView(ILandroid/view/accessibility/AccessibilityEvent;)V

    .line 295
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    if-nez v2, :cond_0

    .line 296
    new-instance v2, Ljava/lang/RuntimeException;

    #v2=(UninitRef);
    const-string v3, "Callbacks must add text or a content description in populateEventForVirtualViewId()"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 301
    :cond_0
    #v2=(Conflicted);v3=(Uninit);
    iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 303
    invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v1

    .line 304
    .local v1, record:Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    invoke-virtual {v1, v2, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setSource(Landroid/view/View;I)V

    .line 306
    return-object v0
.end method

.method private createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2
    .parameter "eventType"

    .prologue
    .line 271
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 272
    .local v0, event:Landroid/view/accessibility/AccessibilityEvent;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v1=(Reference);
    invoke-static {v1, v0}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 273
    return-object v0
.end method

.method private createNode(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    .locals 1
    .parameter "virtualViewId"

    .prologue
    .line 320
    packed-switch p1, :pswitch_data_0

    .line 324
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForChild(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    .line 322
    :pswitch_0
    #v0=(Uninit);
    invoke-direct {p0}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForHost()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    .line 320
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch
.end method

.method private createNodeForChild(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    .locals 8
    .parameter "virtualViewId"

    .prologue
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x1

    .line 378
    #v6=(One);
    invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v1

    .line 381
    .local v1, node:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    #v1=(Reference);
    invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V

    .line 382
    sget-object v4, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V

    .line 385
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateNodeForVirtualView(ILandroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 388
    invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    if-nez v4, :cond_0

    .line 389
    new-instance v4, Ljava/lang/RuntimeException;

    #v4=(UninitRef);
    const-string v5, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 393
    :cond_0
    #v5=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V

    .line 394
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 395
    new-instance v4, Ljava/lang/RuntimeException;

    #v4=(UninitRef);
    const-string v5, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 399
    :cond_1
    #v4=(Boolean);v5=(Uninit);
    invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I

    move-result v0

    .line 400
    .local v0, actions:I
    #v0=(Integer);
    and-int/lit8 v4, v0, 0x40

    #v4=(Integer);
    if-eqz v4, :cond_2

    .line 401
    new-instance v4, Ljava/lang/RuntimeException;

    #v4=(UninitRef);
    const-string v5, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 404
    :cond_2
    #v4=(Integer);v5=(Uninit);
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_3

    .line 405
    new-instance v4, Ljava/lang/RuntimeException;

    #v4=(UninitRef);
    const-string v5, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 410
    :cond_3
    #v4=(Integer);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V

    .line 411
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    invoke-virtual {v1, v4, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;I)V

    .line 412
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V

    .line 415
    iget v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    #v4=(Integer);
    if-ne v4, p1, :cond_5

    .line 416
    invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V

    .line 417
    const/16 v4, 0x80

    #v4=(PosShort);
    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    .line 424
    :goto_0
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    #v4=(Reference);
    invoke-direct {p0, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->intersectVisibleToUser(Landroid/graphics/Rect;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    .line 425
    invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V

    .line 426
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    #v4=(Reference);
    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V

    .line 430
    :cond_4
    #v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 431
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I

    aget v2, v4, v7

    .line 432
    .local v2, offsetX:I
    #v2=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I

    aget v3, v4, v6

    .line 433
    .local v3, offsetY:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;

    iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;

    invoke-virtual {v4, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 434
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;

    invoke-virtual {v4, v2, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 435
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;

    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 437
    return-object v1

    .line 419
    .end local v2           #offsetX:I
    .end local v3           #offsetY:I
    :cond_5
    #v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
    invoke-virtual {v1, v7}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V

    .line 420
    const/16 v4, 0x40

    #v4=(PosByte);
    invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V

    goto :goto_0
.end method

.method private createNodeForHost()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    .locals 6

    .prologue
    .line 335
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;

    move-result-object v2

    .line 336
    .local v2, node:Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    invoke-static {v4, v2}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V

    .line 339
    new-instance v3, Ljava/util/LinkedList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 340
    .local v3, virtualViewIds:Ljava/util/LinkedList;,"Ljava/util/LinkedList<Ljava/lang/Integer;>;"
    #v3=(Reference);
    invoke-virtual {p0, v3}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVisibleVirtualViews(Ljava/util/List;)V

    .line 342
    invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, i$:Ljava/util/Iterator;
    :goto_0
    #v0=(Conflicted);v1=(Reference);v5=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/Integer;

    .line 343
    .local v0, childVirtualViewId:Ljava/lang/Integer;
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v2, v4, v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;I)V

    goto :goto_0

    .line 346
    .end local v0           #childVirtualViewId:Ljava/lang/Integer;
    :cond_0
    #v0=(Conflicted);v4=(Boolean);v5=(Conflicted);
    return-object v2
.end method

.method private intersectVisibleToUser(Landroid/graphics/Rect;)Z
    .locals 5
    .parameter "localRect"

    .prologue
    const/4 v2, 0x0

    .line 484
    #v2=(Null);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 514
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 489
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_0

    .line 494
    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 495
    .local v1, viewParent:Landroid/view/ViewParent;
    :goto_1
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);v4=(Conflicted);
    instance-of v3, v1, Landroid/view/View;

    #v3=(Boolean);
    if-eqz v3, :cond_2

    move-object v0, v1

    .line 496
    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    .line 497
    .local v0, view:Landroid/view/View;
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F

    move-result v3

    #v3=(Float);
    const/4 v4, 0x0

    #v4=(Null);
    cmpg-float v3, v3, v4

    #v3=(Byte);
    if-lez v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_0

    .line 500
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 501
    goto :goto_1

    .line 504
    .end local v0           #view:Landroid/view/View;
    :cond_2
    #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);
    if-eqz v1, :cond_0

    .line 509
    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 514
    iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;

    #v2=(Reference);
    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0
.end method

.method private isAccessibilityFocused(I)Z
    .locals 1
    .parameter "virtualViewId"

    .prologue
    .line 523
    iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    #v0=(Integer);
    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private manageFocusForChild(IILandroid/os/Bundle;)Z
    .locals 1
    .parameter "virtualViewId"
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 464
    sparse-switch p2, :sswitch_data_0

    .line 470
    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    .line 466
    :sswitch_0
    #v0=(Uninit);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->requestAccessibilityFocus(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 468
    :sswitch_1
    #v0=(Uninit);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->clearAccessibilityFocus(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 464
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x40 -> :sswitch_0
        0x80 -> :sswitch_1
    .end sparse-switch
.end method

.method private performAction(IILandroid/os/Bundle;)Z
    .locals 1
    .parameter "virtualViewId"
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 441
    packed-switch p1, :pswitch_data_0

    .line 445
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForChild(IILandroid/os/Bundle;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    .line 443
    :pswitch_0
    #v0=(Uninit);
    invoke-direct {p0, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForHost(ILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 441
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch
.end method

.method private performActionForChild(IILandroid/os/Bundle;)Z
    .locals 1
    .parameter "virtualViewId"
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 454
    sparse-switch p2, :sswitch_data_0

    .line 459
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPerformActionForVirtualView(IILandroid/os/Bundle;)Z

    move-result v0

    :goto_0
    #v0=(Boolean);
    return v0

    .line 457
    :sswitch_0
    #v0=(Uninit);
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->manageFocusForChild(IILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 454
    #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x40 -> :sswitch_0
        0x80 -> :sswitch_0
    .end sparse-switch
.end method

.method private performActionForHost(ILandroid/os/Bundle;)Z
    .locals 1
    .parameter "action"
    .parameter "arguments"

    .prologue
    .line 450
    iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v0=(Reference);
    invoke-static {v0, p1, p2}, Landroid/support/v4/view/ViewCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method private requestAccessibilityFocus(I)Z
    .locals 2
    .parameter "virtualViewId"

    .prologue
    const/4 v0, 0x0

    .line 539
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 552
    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    .line 544
    :cond_1
    #v0=(Null);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 545
    iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    .line 547
    iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 548
    const v0, 0x8000

    #v0=(Char);
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    .line 550
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method private updateHoveredVirtualView(I)V
    .locals 2
    .parameter "virtualViewId"

    .prologue
    .line 230
    iget v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I

    #v1=(Integer);
    if-ne v1, p1, :cond_0

    .line 242
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 234
    :cond_0
    #v0=(Uninit);
    iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I

    .line 235
    .local v0, previousVirtualViewId:I
    #v0=(Integer);
    iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I

    .line 239
    const/16 v1, 0x80

    #v1=(PosShort);
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    .line 240
    const/16 v1, 0x100

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    goto :goto_0
.end method


# virtual methods
.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .parameter "event"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/high16 v5, -0x8000

    #v5=(Integer);
    const/4 v2, 0x0

    .line 133
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 151
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v3=(Integer);v4=(Conflicted);
    return v2

    .line 138
    :cond_1
    #v0=(Uninit);v1=(One);v2=(Null);v3=(Boolean);v4=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    #v3=(Integer);
    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 141
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    #v3=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    #v4=(Float);
    invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVirtualViewAt(FF)I

    move-result v0

    .line 142
    .local v0, virtualViewId:I
    #v0=(Integer);
    invoke-direct {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V

    .line 143
    if-eq v0, v5, :cond_2

    :goto_1
    #v1=(Boolean);
    move v2, v1

    #v2=(Boolean);
    goto :goto_0

    :cond_2
    #v1=(One);v2=(Null);
    move v1, v2

    #v1=(Null);
    goto :goto_1

    .line 145
    .end local v0           #virtualViewId:I
    :pswitch_2
    #v0=(Uninit);v1=(One);v3=(Integer);v4=(Uninit);
    iget v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    if-eq v3, v5, :cond_0

    .line 146
    invoke-direct {p0, v5}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V

    move v2, v1

    .line 147
    #v2=(One);
    goto :goto_0

    .line 138
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    .locals 2
    .parameter "host"

    .prologue
    .line 107
    iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 108
    new-instance v0, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;-><init>(Landroid/support/v4/widget/ExploreByTouchHelper;Landroid/support/v4/widget/ExploreByTouchHelper$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;

    .line 110
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;

    return-object v0
.end method

.method public getFocusedVirtualView()I
    .locals 1

    .prologue
    .line 218
    iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I

    #v0=(Integer);
    return v0
.end method

.method protected abstract getVirtualViewAt(FF)I
.end method

.method protected abstract getVisibleVirtualViews(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public invalidateRoot()V
    .locals 1

    .prologue
    .line 194
    const/4 v0, -0x1

    #v0=(Byte);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->invalidateVirtualView(I)V

    .line 195
    return-void
.end method

.method public invalidateVirtualView(I)V
    .locals 1
    .parameter "virtualViewId"

    .prologue
    .line 207
    const/16 v0, 0x800

    #v0=(PosShort);
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z

    .line 209
    return-void
.end method

.method protected abstract onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
.end method

.method protected abstract onPopulateEventForVirtualView(ILandroid/view/accessibility/AccessibilityEvent;)V
.end method

.method protected abstract onPopulateNodeForVirtualView(ILandroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
.end method

.method public sendEventForVirtualView(II)Z
    .locals 4
    .parameter "virtualViewId"
    .parameter "eventType"

    .prologue
    const/4 v2, 0x0

    .line 173
    #v2=(Null);
    const/high16 v3, -0x8000

    #v3=(Integer);
    if-eq p1, v3, :cond_0

    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 183
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
    return v2

    .line 177
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);
    iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 178
    .local v1, parent:Landroid/view/ViewParent;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 182
    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEvent(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 183
    .local v0, event:Landroid/view/accessibility/AccessibilityEvent;
    #v0=(Reference);
    iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/support/v4/view/ViewParentCompat;->requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0
.end method

*/}
