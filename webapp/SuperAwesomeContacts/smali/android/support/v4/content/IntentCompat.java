package android.support.v4.content; class IntentCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/content/IntentCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IntentCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;,
a=0;//         Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;,
a=0;//         Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;,
a=0;//         Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ACTION_EXTERNAL_APPLICATIONS_AVAILABLE:Ljava/lang/String; = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"
a=0;// 
a=0;// .field public static final ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE:Ljava/lang/String; = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE"
a=0;// 
a=0;// .field public static final EXTRA_CHANGED_PACKAGE_LIST:Ljava/lang/String; = "android.intent.extra.changed_package_list"
a=0;// 
a=0;// .field public static final EXTRA_CHANGED_UID_LIST:Ljava/lang/String; = "android.intent.extra.changed_uid_list"
a=0;// 
a=0;// .field public static final EXTRA_HTML_TEXT:Ljava/lang/String; = "android.intent.extra.HTML_TEXT"
a=0;// 
a=0;// .field public static final FLAG_ACTIVITY_CLEAR_TASK:I = 0x8000
a=0;// 
a=0;// .field public static final FLAG_ACTIVITY_TASK_ON_HOME:I = 0x4000
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;);
a=0;//     sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     .line 93
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;);
a=0;//     sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;);
a=0;//     sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     #p0=(Reference,Landroid/support/v4/content/IntentCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p0, "mainActivity"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p0, "selectorAction"    # Ljava/lang/String;
a=0;//     .param p1, "selectorCategory"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p0, "mainActivity"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
