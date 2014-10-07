package android.support.v4.app; class ShareCompat {/*

.class public Landroid/support/v4/app/ShareCompat;
.super Ljava/lang/Object;
.source "ShareCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/ShareCompat$IntentReader;,
        Landroid/support/v4/app/ShareCompat$IntentBuilder;,
        Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;,
        Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;,
        Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;,
        Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
    }
.end annotation


# static fields
.field public static final EXTRA_CALLING_ACTIVITY:Ljava/lang/String; = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"

.field public static final EXTRA_CALLING_PACKAGE:Ljava/lang/String; = "android.support.v4.app.EXTRA_CALLING_PACKAGE"

.field private static IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 152
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 153
    new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    .line 159
    :goto_0
    return-void

    .line 154
    :cond_0
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 155
    new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    goto :goto_0

    .line 157
    :cond_1
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 655
    #p0=(Reference);
    return-void
.end method

.method static synthetic access$000()Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    #v0=(Reference);
    return-object v0
.end method

.method public static configureMenuItem(Landroid/view/Menu;ILandroid/support/v4/app/ShareCompat$IntentBuilder;)V
    .locals 4
    .parameter "menu"
    .parameter "menuItemId"
    .parameter "shareIntent"

    .prologue
    .line 245
    invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 246
    .local v0, item:Landroid/view/MenuItem;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 247
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Could not find menu item with id "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " in the supplied menu"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 250
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-static {v0, p2}, Landroid/support/v4/app/ShareCompat;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V

    .line 251
    return-void
.end method

.method public static configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
    .locals 1
    .parameter "item"
    .parameter "shareIntent"

    .prologue
    .line 233
    sget-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/app/ShareCompat$ShareCompatImpl;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V

    .line 234
    return-void
.end method

.method public static getCallingActivity(Landroid/app/Activity;)Landroid/content/ComponentName;
    .locals 3
    .parameter "calledActivity"

    .prologue
    .line 194
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 195
    .local v0, result:Landroid/content/ComponentName;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 196
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android.support.v4.app.EXTRA_CALLING_ACTIVITY"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .end local v0           #result:Landroid/content/ComponentName;
    check-cast v0, Landroid/content/ComponentName;

    .line 198
    .restart local v0       #result:Landroid/content/ComponentName;
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0
.end method

.method public static getCallingPackage(Landroid/app/Activity;)Ljava/lang/String;
    .locals 3
    .parameter "calledActivity"

    .prologue
    .line 174
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    .line 175
    .local v0, result:Ljava/lang/String;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 176
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android.support.v4.app.EXTRA_CALLING_PACKAGE"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 178
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0
.end method

*/}
