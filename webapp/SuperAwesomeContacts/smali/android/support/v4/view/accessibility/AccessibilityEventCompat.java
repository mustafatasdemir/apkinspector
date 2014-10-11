package android.support.v4.view.accessibility; class AccessibilityEventCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/accessibility/AccessibilityEventCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AccessibilityEventCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;,
a=0;//         Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;// .field public static final TYPES_ALL_MASK:I = -0x1
a=0;// 
a=0;// .field public static final TYPE_ANNOUNCEMENT:I = 0x4000
a=0;// 
a=0;// .field public static final TYPE_GESTURE_DETECTION_END:I = 0x80000
a=0;// 
a=0;// .field public static final TYPE_GESTURE_DETECTION_START:I = 0x40000
a=0;// 
a=0;// .field public static final TYPE_TOUCH_EXPLORATION_GESTURE_END:I = 0x400
a=0;// 
a=0;// .field public static final TYPE_TOUCH_EXPLORATION_GESTURE_START:I = 0x200
a=0;// 
a=0;// .field public static final TYPE_TOUCH_INTERACTION_END:I = 0x200000
a=0;// 
a=0;// .field public static final TYPE_TOUCH_INTERACTION_START:I = 0x100000
a=0;// 
a=0;// .field public static final TYPE_VIEW_ACCESSIBILITY_FOCUSED:I = 0x8000
a=0;// 
a=0;// .field public static final TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED:I = 0x10000
a=0;// 
a=0;// .field public static final TYPE_VIEW_HOVER_ENTER:I = 0x80
a=0;// 
a=0;// .field public static final TYPE_VIEW_HOVER_EXIT:I = 0x100
a=0;// 
a=0;// .field public static final TYPE_VIEW_SCROLLED:I = 0x1000
a=0;// 
a=0;// .field public static final TYPE_VIEW_TEXT_SELECTION_CHANGED:I = 0x2000
a=0;// 
a=0;// .field public static final TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY:I = 0x20000
a=0;// 
a=0;// .field public static final TYPE_WINDOW_CONTENT_CHANGED:I = 0x800
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventStubImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 186
a=0;//     #p0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static appendRecord(Landroid/view/accessibility/AccessibilityEvent;Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;)V
a=0;//     .locals 2
a=0;//     .param p0, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;//     .param p1, "record"    # Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->getImpl()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, p0, v1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->appendRecord(Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getRecord(Landroid/view/accessibility/AccessibilityEvent;I)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;//     .locals 2
a=0;//     .param p0, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     sget-object v1, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;);
a=0;//     invoke-interface {v1, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->getRecord(Landroid/view/accessibility/AccessibilityEvent;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getRecordCount(Landroid/view/accessibility/AccessibilityEvent;)I
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->getRecordCount(Landroid/view/accessibility/AccessibilityEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
