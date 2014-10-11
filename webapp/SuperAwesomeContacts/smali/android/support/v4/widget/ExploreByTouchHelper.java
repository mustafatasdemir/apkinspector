package android.support.v4.widget; class ExploreByTouchHelper { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/widget/ExploreByTouchHelper;
a=0;// .super Landroid/support/v4/view/AccessibilityDelegateCompat;
a=0;// .source "ExploreByTouchHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/ExploreByTouchHelper$1;,
a=0;//         Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CLASS_NAME:Ljava/lang/String;
a=0;// 
a=0;// .field public static final INVALID_ID:I = -0x80000000
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFocusedVirtualViewId:I
a=0;// 
a=0;// .field private mHoveredVirtualViewId:I
a=0;// 
a=0;// .field private final mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;// .field private mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;// 
a=0;// .field private final mTempGlobalRect:[I
a=0;// 
a=0;// .field private final mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mTempScreenRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mTempVisibleRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private final mView:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const-class v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "forView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v2, -0x80000000
a=0;// 
a=0;//     .line 89
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/AccessibilityDelegateCompat;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ExploreByTouchHelper;);
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
a=0;// 
a=0;//     .line 79
a=0;//     iput v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     .line 82
a=0;//     iput v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
a=0;// 
a=0;//     .line 90
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "View may not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "context":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "accessibility"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/widget/ExploreByTouchHelper;I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ExploreByTouchHelper;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNode(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/ExploreByTouchHelper;IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ExploreByTouchHelper;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # I
a=0;//     .param p3, "x3"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performAction(IILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private clearAccessibilityFocus(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 564
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     .line 565
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 566
a=0;//     const/high16 v0, 0x10000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
a=0;// 
a=0;//     .line 568
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 570
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private createEvent(II)Landroid/view/accessibility/AccessibilityEvent;
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 259
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 257
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;
a=0;//     .locals 4
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V
a=0;// 
a=0;//     .line 289
a=0;//     sget-object v2, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateEventForVirtualView(ILandroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 295
a=0;//     invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityEvent;->getContentDescription()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v3, "Callbacks must add text or a content description in populateEventForVirtualViewId()"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 303
a=0;//     invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 304
a=0;//     .local v1, "record":Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v2, p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setSource(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 306
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;
a=0;//     .locals 2
a=0;//     .param p1, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 272
a=0;//     .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v1, v0}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
a=0;// 
a=0;//     .line 273
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createNode(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 324
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForChild(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 322
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ExploreByTouchHelper;->createNodeForHost()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 320
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private createNodeForChild(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 8
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 378
a=0;//     #v6=(One);
a=0;//     invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 381
a=0;//     .local v1, "node":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V
a=0;// 
a=0;//     .line 382
a=0;//     sget-object v4, Landroid/support/v4/widget/ExploreByTouchHelper;->DEFAULT_CLASS_NAME:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 385
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPopulateNodeForVirtualView(ILandroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 388
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     new-instance v4, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v5, "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 393
a=0;//     :cond_0
a=0;//     #v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 395
a=0;//     new-instance v4, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v5, "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 399
a=0;//     :cond_1
a=0;//     #v4=(Boolean);v5=(Uninit);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 400
a=0;//     .local v0, "actions":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v4, v0, 0x40
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 401
a=0;//     new-instance v4, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v5, "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 404
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(Uninit);
a=0;//     and-int/lit16 v4, v0, 0x80
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v4, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v5, "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 410
a=0;//     :cond_3
a=0;//     #v4=(Integer);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v4, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V
a=0;// 
a=0;//     .line 415
a=0;//     iget v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_5
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
a=0;// 
a=0;//     .line 417
a=0;//     const/16 v4, 0x80
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     .line 424
a=0;//     :goto_0
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->intersectVisibleToUser(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v1, v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 430
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
a=0;// 
a=0;//     aget v2, v4, v7
a=0;// 
a=0;//     .line 432
a=0;//     .local v2, "offsetX":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempGlobalRect:[I
a=0;// 
a=0;//     aget v3, v4, v6
a=0;// 
a=0;//     .line 433
a=0;//     .local v3, "offsetY":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempParentRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v4, v2, v3}, Landroid/graphics/Rect;->offset(II)V
a=0;// 
a=0;//     .line 435
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempScreenRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 437
a=0;//     return-object v1
a=0;// 
a=0;//     .line 419
a=0;//     .end local v2    # "offsetX":I
a=0;//     .end local v3    # "offsetY":I
a=0;//     :cond_5
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     invoke-virtual {v1, v7}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
a=0;// 
a=0;//     .line 420
a=0;//     const/16 v4, 0x40
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private createNodeForHost()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 336
a=0;//     .local v2, "node":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
a=0;//     #v2=(Reference,Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {v4, v2}, Landroid/support/v4/view/ViewCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// 
a=0;//     .line 339
a=0;//     new-instance v3, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 340
a=0;//     .local v3, "virtualViewIds":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/Integer;>;"
a=0;//     #v3=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVisibleVirtualViews(Ljava/util/List;)V
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 343
a=0;//     .local v0, "childVirtualViewId":Ljava/lang/Integer;
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 346
a=0;//     .end local v0    # "childVirtualViewId":Ljava/lang/Integer;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Boolean);v5=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private intersectVisibleToUser(Landroid/graphics/Rect;)Z
a=0;//     .locals 5
a=0;//     .param p1, "localRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 484
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 489
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 495
a=0;//     .local v1, "viewParent":Landroid/view/ViewParent;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/ViewParent;);v3=(Conflicted);v4=(Conflicted);
a=0;//     instance-of v3, v1, Landroid/view/View;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 496
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 497
a=0;//     .local v0, "view":Landroid/view/View;
a=0;//     invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getAlpha(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     cmpg-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 500
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 501
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 504
a=0;//     .end local v0    # "view":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 509
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v3, v4}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 514
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mTempVisibleRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p1, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isAccessibilityFocused(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private manageFocusForChild(IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     .line 470
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 466
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->requestAccessibilityFocus(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 468
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->clearAccessibilityFocus(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 464
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x40 -> :sswitch_0
a=0;//         0x80 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private performAction(IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 441
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 445
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForChild(IILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 443
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->performActionForHost(ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private performActionForChild(IILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "action"    # I
a=0;//     .param p3, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     sparse-switch p2, :sswitch_data_0
a=0;// 
a=0;//     .line 459
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 457
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ExploreByTouchHelper;->manageFocusForChild(IILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 454
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x40 -> :sswitch_0
a=0;//         0x80 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method private performActionForHost(ILandroid/os/Bundle;)Z
a=0;//     .locals 1
a=0;//     .param p1, "action"    # I
a=0;//     .param p2, "arguments"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 450
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v0, p1, p2}, Landroid/support/v4/view/ViewCompat;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private requestAccessibilityFocus(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 539
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 552
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 544
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ExploreByTouchHelper;->isAccessibilityFocused(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 545
a=0;//     iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     .line 548
a=0;//     const v0, 0x8000
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
a=0;// 
a=0;//     .line 550
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateHoveredVirtualView(I)V
a=0;//     .locals 2
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget v1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p1, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "previousVirtualViewId":I
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mHoveredVirtualViewId:I
a=0;// 
a=0;//     .line 239
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
a=0;// 
a=0;//     .line 240
a=0;//     const/16 v1, 0x100
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/high16 v5, -0x80000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-static {v3}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v3=(Integer);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 138
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/ExploreByTouchHelper;->getVirtualViewAt(FF)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "virtualViewId":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V
a=0;// 
a=0;//     .line 143
a=0;//     if-eq v0, v5, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v2=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     .end local v0    # "virtualViewId":I
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(One);v3=(Integer);v4=(Uninit);
a=0;//     iget v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     if-eq v3, v5, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/widget/ExploreByTouchHelper;->updateHoveredVirtualView(I)V
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 147
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x7
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v0, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;-><init>(Landroid/support/v4/widget/ExploreByTouchHelper;Landroid/support/v4/widget/ExploreByTouchHelper$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mNodeProvider:Landroid/support/v4/widget/ExploreByTouchHelper$ExploreByTouchNodeProvider;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFocusedVirtualView()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     iget v0, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mFocusedVirtualViewId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getVirtualViewAt(FF)I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getVisibleVirtualViews(Ljava/util/List;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public invalidateRoot()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->invalidateVirtualView(I)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public invalidateVirtualView(I)V
a=0;//     .locals 1
a=0;//     .param p1, "virtualViewId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     const/16 v0, 0x800
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/ExploreByTouchHelper;->sendEventForVirtualView(II)Z
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
a=0;// .end method
a=0;// 
a=0;// .method protected abstract onPopulateEventForVirtualView(ILandroid/view/accessibility/AccessibilityEvent;)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract onPopulateNodeForVirtualView(ILandroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
a=0;// .end method
a=0;// 
a=0;// .method public sendEventForVirtualView(II)Z
a=0;//     .locals 4
a=0;//     .param p1, "virtualViewId"    # I
a=0;//     .param p2, "eventType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     #v2=(Null);
a=0;//     const/high16 v3, -0x80000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq p1, v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mManager:Landroid/view/accessibility/AccessibilityManager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/accessibility/AccessibilityManager;);
a=0;//     invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "parent":Landroid/view/ViewParent;
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/ExploreByTouchHelper;->createEvent(II)Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "event":Landroid/view/accessibility/AccessibilityEvent;
a=0;//     #v0=(Reference,Landroid/view/accessibility/AccessibilityEvent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ExploreByTouchHelper;->mView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/support/v4/view/ViewParentCompat;->requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
