package android.support.v4.app; class TaskStackBuilder {/*

.class public Landroid/support/v4/app/TaskStackBuilder;
.super Ljava/lang/Object;
.source "TaskStackBuilder.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplJellybean;,
        Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;,
        Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;,
        Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;,
        Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Landroid/content/Intent;",
        ">;"
    }
.end annotation


# static fields
.field private static final IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl; = null

.field private static final TAG:Ljava/lang/String; = "TaskStackBuilder"


# instance fields
.field private final mIntents:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final mSourceContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 116
    new-instance v0, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;

    .line 120
    :goto_0
    return-void

    .line 118
    :cond_0
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "a"

    .prologue
    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    .line 126
    iput-object p1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    .line 127
    return-void
.end method

.method public static create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 1
    .parameter "context"

    .prologue
    .line 137
    new-instance v0, Landroid/support/v4/app/TaskStackBuilder;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/TaskStackBuilder;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method

.method public static from(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 1
    .parameter "context"

    .prologue
    .line 150
    invoke-static {p0}, Landroid/support/v4/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 1
    .parameter "nextIntent"

    .prologue
    .line 161
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    return-object p0
.end method

.method public addNextIntentWithParentStack(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 2
    .parameter "nextIntent"

    .prologue
    .line 178
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    .line 179
    .local v0, target:Landroid/content/ComponentName;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 180
    iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    .line 182
    :cond_0
    #v1=(Conflicted);
    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;

    .line 185
    :cond_1
    invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;

    .line 186
    return-object p0
.end method

.method public addParentStack(Landroid/app/Activity;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 3
    .parameter "sourceActivity"

    .prologue
    .line 197
    const/4 v0, 0x0

    .line 198
    .local v0, parent:Landroid/content/Intent;
    #v0=(Null);
    instance-of v2, p1, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;

    #v2=(Boolean);
    if-eqz v2, :cond_0

    move-object v2, p1

    .line 199
    #v2=(Reference);
    check-cast v2, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;

    invoke-interface {v2}, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;->getSupportParentActivityIntent()Landroid/content/Intent;

    move-result-object v0

    .line 201
    :cond_0
    #v0=(Reference);v2=(Conflicted);
    if-nez v0, :cond_1

    .line 202
    invoke-static {p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    .line 205
    :cond_1
    if-eqz v0, :cond_3

    .line 208
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    .line 209
    .local v1, target:Landroid/content/ComponentName;
    #v1=(Reference);
    if-nez v1, :cond_2

    .line 210
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    .line 212
    :cond_2
    #v2=(Conflicted);
    invoke-virtual {p0, v1}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;

    .line 213
    invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;

    .line 215
    .end local v1           #target:Landroid/content/ComponentName;
    :cond_3
    #v1=(Conflicted);
    return-object p0
.end method

.method public addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 5
    .parameter "sourceActivityName"

    .prologue
    .line 238
    iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 240
    .local v1, insertAt:I
    :try_start_0
    #v1=(Integer);
    iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    invoke-static {v3, p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v2

    .line 241
    .local v2, parent:Landroid/content/Intent;
    :goto_0
    #v2=(Reference);v4=(Conflicted);
    if-eqz v2, :cond_0

    .line 242
    iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 243
    iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 245
    .end local v2           #parent:Landroid/content/Intent;
    :catch_0
    #v2=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 246
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v3, "TaskStackBuilder"

    const-string v4, "Bad ComponentName while traversing activity parent metadata"

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 247
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3

    .line 249
    .end local v0           #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v2       #parent:Landroid/content/Intent;
    :cond_0
    #v0=(Uninit);v2=(Reference);v4=(Conflicted);
    return-object p0
.end method

.method public addParentStack(Ljava/lang/Class;)Landroid/support/v4/app/TaskStackBuilder;
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Landroid/support/v4/app/TaskStackBuilder;"
        }
    .end annotation

    .prologue
    .line 226
    .local p1, sourceActivityClass:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    new-instance v0, Landroid/content/ComponentName;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;

    move-result-object v0

    return-object v0
.end method

.method public editIntentAt(I)Landroid/content/Intent;
    .locals 1
    .parameter "index"

    .prologue
    .line 282
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    return-object v0
.end method

.method public getIntent(I)Landroid/content/Intent;
    .locals 1
    .parameter "index"

    .prologue
    .line 270
    invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->editIntentAt(I)Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getIntentCount()I
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getIntents()[Landroid/content/Intent;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 382
    #v4=(Null);
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    new-array v1, v2, [Landroid/content/Intent;

    .line 383
    .local v1, intents:[Landroid/content/Intent;
    #v1=(Reference);
    array-length v2, v1

    if-nez v2, :cond_1

    .line 391
    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    return-object v1

    .line 385
    :cond_1
    #v0=(Uninit);v3=(Uninit);
    new-instance v3, Landroid/content/Intent;

    #v3=(UninitRef);
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    #v3=(Reference);
    const v2, 0x1000c000

    #v2=(Integer);
    invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v1, v4

    .line 388
    const/4 v0, 0x1

    .local v0, i:I
    :goto_0
    #v0=(Integer);
    array-length v2, v1

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    .line 389
    new-instance v3, Landroid/content/Intent;

    #v3=(UninitRef);
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    #v3=(Reference);
    aput-object v3, v1, v0

    .line 388
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getPendingIntent(II)Landroid/app/PendingIntent;
    .locals 1
    .parameter "requestCode"
    .parameter "flags"

    .prologue
    .line 344
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/TaskStackBuilder;->getPendingIntent(IILandroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getPendingIntent(IILandroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 6
    .parameter "requestCode"
    .parameter "flags"
    .parameter "options"

    .prologue
    const/4 v3, 0x0

    .line 361
    #v3=(Null);
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 362
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "No intents added to TaskStackBuilder; cannot getPendingIntent"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 366
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    new-array v1, v1, [Landroid/content/Intent;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, [Landroid/content/Intent;

    .line 367
    .local v2, intents:[Landroid/content/Intent;
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    aget-object v1, v2, v3

    #v1=(Null);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    #v0=(Reference);
    const v1, 0x1000c000

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    aput-object v0, v2, v3

    .line 371
    sget-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;

    iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    #v1=(Reference);
    move v3, p1

    #v3=(Integer);
    move v4, p2

    #v4=(Integer);
    move-object v5, p3

    #v5=(Reference);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;->getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    .prologue
    .line 289
    iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public startActivities()V
    .locals 1

    .prologue
    .line 301
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->startActivities(Landroid/os/Bundle;)V

    .line 302
    return-void
.end method

.method public startActivities(Landroid/os/Bundle;)V
    .locals 5
    .parameter "options"

    .prologue
    const/4 v4, 0x0

    .line 316
    #v4=(Null);
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 317
    new-instance v2, Ljava/lang/IllegalStateException;

    #v2=(UninitRef);
    const-string v3, "No intents added to TaskStackBuilder; cannot startActivities"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 321
    :cond_0
    #v2=(Boolean);v3=(Uninit);
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    new-array v3, v3, [Landroid/content/Intent;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, [Landroid/content/Intent;

    .line 322
    .local v0, intents:[Landroid/content/Intent;
    new-instance v2, Landroid/content/Intent;

    #v2=(UninitRef);
    aget-object v3, v0, v4

    #v3=(Null);
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    #v2=(Reference);
    const v3, 0x1000c000

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    aput-object v2, v0, v4

    .line 325
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    invoke-static {v2, v0, p1}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 326
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    array-length v2, v0

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    aget-object v2, v0, v2

    #v2=(Null);
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 327
    .local v1, topIntent:Landroid/content/Intent;
    #v1=(Reference);
    const/high16 v2, 0x1000

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 328
    iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;

    #v2=(Reference);
    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 330
    .end local v1           #topIntent:Landroid/content/Intent;
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

*/}
