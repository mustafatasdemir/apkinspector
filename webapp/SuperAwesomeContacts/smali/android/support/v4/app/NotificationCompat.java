package android.support.v4.app; class NotificationCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompat$1;,
a=0;//         Landroid/support/v4/app/NotificationCompat$WearableExtender;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Extender;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Action;,
a=0;//         Landroid/support/v4/app/NotificationCompat$InboxStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$BigTextStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$BigPictureStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Style;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Builder;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplApi20;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT_ALL:I = -0x1
a=0;// 
a=0;// .field public static final DEFAULT_LIGHTS:I = 0x4
a=0;// 
a=0;// .field public static final DEFAULT_SOUND:I = 0x1
a=0;// 
a=0;// .field public static final DEFAULT_VIBRATE:I = 0x2
a=0;// 
a=0;// .field public static final EXTRA_INFO_TEXT:Ljava/lang/String; = "android.infoText"
a=0;// 
a=0;// .field public static final EXTRA_LARGE_ICON:Ljava/lang/String; = "android.largeIcon"
a=0;// 
a=0;// .field public static final EXTRA_LARGE_ICON_BIG:Ljava/lang/String; = "android.largeIcon.big"
a=0;// 
a=0;// .field public static final EXTRA_PEOPLE:Ljava/lang/String; = "android.people"
a=0;// 
a=0;// .field public static final EXTRA_PICTURE:Ljava/lang/String; = "android.picture"
a=0;// 
a=0;// .field public static final EXTRA_PROGRESS:Ljava/lang/String; = "android.progress"
a=0;// 
a=0;// .field public static final EXTRA_PROGRESS_INDETERMINATE:Ljava/lang/String; = "android.progressIndeterminate"
a=0;// 
a=0;// .field public static final EXTRA_PROGRESS_MAX:Ljava/lang/String; = "android.progressMax"
a=0;// 
a=0;// .field public static final EXTRA_SHOW_CHRONOMETER:Ljava/lang/String; = "android.showChronometer"
a=0;// 
a=0;// .field public static final EXTRA_SMALL_ICON:Ljava/lang/String; = "android.icon"
a=0;// 
a=0;// .field public static final EXTRA_SUB_TEXT:Ljava/lang/String; = "android.subText"
a=0;// 
a=0;// .field public static final EXTRA_SUMMARY_TEXT:Ljava/lang/String; = "android.summaryText"
a=0;// 
a=0;// .field public static final EXTRA_TEXT:Ljava/lang/String; = "android.text"
a=0;// 
a=0;// .field public static final EXTRA_TEXT_LINES:Ljava/lang/String; = "android.textLines"
a=0;// 
a=0;// .field public static final EXTRA_TITLE:Ljava/lang/String; = "android.title"
a=0;// 
a=0;// .field public static final EXTRA_TITLE_BIG:Ljava/lang/String; = "android.title.big"
a=0;// 
a=0;// .field public static final FLAG_AUTO_CANCEL:I = 0x10
a=0;// 
a=0;// .field public static final FLAG_FOREGROUND_SERVICE:I = 0x40
a=0;// 
a=0;// .field public static final FLAG_GROUP_SUMMARY:I = 0x200
a=0;// 
a=0;// .field public static final FLAG_HIGH_PRIORITY:I = 0x80
a=0;// 
a=0;// .field public static final FLAG_INSISTENT:I = 0x4
a=0;// 
a=0;// .field public static final FLAG_LOCAL_ONLY:I = 0x100
a=0;// 
a=0;// .field public static final FLAG_NO_CLEAR:I = 0x20
a=0;// 
a=0;// .field public static final FLAG_ONGOING_EVENT:I = 0x2
a=0;// 
a=0;// .field public static final FLAG_ONLY_ALERT_ONCE:I = 0x8
a=0;// 
a=0;// .field public static final FLAG_SHOW_LIGHTS:I = 0x1
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;// .field public static final PRIORITY_DEFAULT:I = 0x0
a=0;// 
a=0;// .field public static final PRIORITY_HIGH:I = 0x1
a=0;// 
a=0;// .field public static final PRIORITY_LOW:I = -0x1
a=0;// 
a=0;// .field public static final PRIORITY_MAX:I = 0x2
a=0;// 
a=0;// .field public static final PRIORITY_MIN:I = -0x2
a=0;// 
a=0;// .field public static final STREAM_DEFAULT:I = -0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 601
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 602
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplApi20;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplApi20;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplApi20;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplApi20;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     .line 616
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 603
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 604
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 605
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 606
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 607
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 608
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 609
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_4
a=0;// 
a=0;//     .line 610
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 611
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     if-lt v0, v1, :cond_5
a=0;// 
a=0;//     .line 612
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 614
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1769
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/app/NotificationBuilderWithActions;
a=0;//     .param p1, "x1"    # Ljava/util/ArrayList;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/app/NotificationCompat;->addActionsToBuilder(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;//     .param p1, "x1"    # Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/app/NotificationCompat;->addStyleToBuilderJellybean(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/app/Notification;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/os/Bundle;
a=0;//     .param p1, "x1"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/app/NotificationCompat;->getNotificationArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/Notification;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static addActionsToBuilder(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V
a=0;//     .locals 3
a=0;//     .param p0, "builder"    # Landroid/support/v4/app/NotificationBuilderWithActions;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/app/NotificationBuilderWithActions;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 565
a=0;//     .local p1, "actions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/app/NotificationCompat$Action;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .line 566
a=0;//     .local v0, "action":Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     invoke-interface {p0, v0}, Landroid/support/v4/app/NotificationBuilderWithActions;->addAction(Landroid/support/v4/app/NotificationCompatBase$Action;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 568
a=0;//     .end local v0    # "action":Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addStyleToBuilderJellybean(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V
a=0;//     .locals 10
a=0;//     .param p0, "builder"    # Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;//     .param p1, "style"    # Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 573
a=0;//     instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v8, p1
a=0;// 
a=0;//     .line 574
a=0;//     #v8=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;// 
a=0;//     .line 575
a=0;//     .local v8, "bigTextStyle":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;//     iget-object v0, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-boolean v1, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, v8, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigTextStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 598
a=0;//     .end local v8    # "bigTextStyle":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 580
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v9, p1
a=0;// 
a=0;//     .line 581
a=0;//     #v9=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// 
a=0;//     .line 582
a=0;//     .local v9, "inboxStyle":Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     iget-object v0, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-boolean v1, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-object v2, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, v9, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompatJellybean;->addInboxStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 587
a=0;//     .end local v9    # "inboxStyle":Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v9=(Uninit);
a=0;//     instance-of v0, p1, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 588
a=0;//     #v7=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;// 
a=0;//     .line 589
a=0;//     .local v7, "bigPictureStyle":Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;//     iget-object v1, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-boolean v2, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-object v3, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v4, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mPicture:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v5, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIcon:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-boolean v6, v7, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIconSet:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigPictureStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;//     .param p1, "actionIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2415
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionCount(Landroid/app/Notification;)I
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2405
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getActionCount(Landroid/app/Notification;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2397
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2433
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2425
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getLocalOnly(Landroid/app/Notification;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static getNotificationArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/app/Notification;
a=0;//     .locals 4
a=0;//     .param p0, "bundle"    # Landroid/os/Bundle;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2379
a=0;//     invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2380
a=0;//     .local v0, "array":[Landroid/os/Parcelable;
a=0;//     #v0=(Reference,[Landroid/os/Parcelable;);
a=0;//     instance-of v3, v0, [Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 2381
a=0;//     :cond_0
a=0;//     check-cast v0, [Landroid/app/Notification;
a=0;// 
a=0;//     .end local v0    # "array":[Landroid/os/Parcelable;
a=0;//     check-cast v0, [Landroid/app/Notification;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 2388
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,[Landroid/app/Notification;);v3=(Integer);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 2383
a=0;//     .restart local v0    # "array":[Landroid/os/Parcelable;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v2, v3, [Landroid/app/Notification;
a=0;// 
a=0;//     .line 2384
a=0;//     .local v2, "typedArray":[Landroid/app/Notification;
a=0;//     #v2=(Reference,[Landroid/app/Notification;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     .line 2385
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     check-cast v3, Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     .line 2384
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2387
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, p1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2459
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2443
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->isGroupSummary(Landroid/app/Notification;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
