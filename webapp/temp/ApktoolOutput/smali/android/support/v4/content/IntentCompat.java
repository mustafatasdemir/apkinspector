package android.support.v4.content; class IntentCompat {/*

.class public Landroid/support/v4/content/IntentCompat;
.super Ljava/lang/Object;
.source "IntentCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;,
        Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;,
        Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;,
        Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
    }
.end annotation


# static fields
.field public static final ACTION_EXTERNAL_APPLICATIONS_AVAILABLE:Ljava/lang/String; = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"

.field public static final ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE:Ljava/lang/String; = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE"

.field public static final EXTRA_CHANGED_PACKAGE_LIST:Ljava/lang/String; = "android.intent.extra.changed_package_list"

.field public static final EXTRA_CHANGED_UID_LIST:Ljava/lang/String; = "android.intent.extra.changed_uid_list"

.field public static final EXTRA_HTML_TEXT:Ljava/lang/String; = "android.intent.extra.HTML_TEXT"

.field public static final FLAG_ACTIVITY_CLEAR_TASK:I = 0x8000

.field public static final FLAG_ACTIVITY_TASK_ON_HOME:I = 0x4000

.field private static final IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 85
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 86
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0xf

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 87
    new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplIcsMr1;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    .line 93
    :goto_0
    return-void

    .line 88
    :cond_0
    #v1=(PosByte);
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 89
    new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplHC;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    goto :goto_0

    .line 91
    :cond_1
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    #p0=(Reference);
    return-void
.end method

.method public static makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 1
    .parameter "mainActivity"

    .prologue
    .line 221
    sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .parameter "selectorAction"
    .parameter "selectorCategory"

    .prologue
    .line 249
    sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
    .locals 1
    .parameter "mainActivity"

    .prologue
    .line 266
    sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

*/}
