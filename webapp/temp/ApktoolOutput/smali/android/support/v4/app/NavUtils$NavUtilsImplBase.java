package android.support.v4.app; class NavUtils$NavUtilsImplBase {/*

.class Landroid/support/v4/app/NavUtils$NavUtilsImplBase;
.super Ljava/lang/Object;
.source "NavUtils.java"

# interfaces
.implements Landroid/support/v4/app/NavUtils$NavUtilsImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NavUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "NavUtilsImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 8
    .parameter "activity"

    .prologue
    const/4 v2, 0x0

    .line 53
    #v2=(Null);
    invoke-static {p1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v3

    .line 54
    .local v3, parentName:Ljava/lang/String;
    #v3=(Reference);
    if-nez v3, :cond_0

    .line 67
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-object v2

    .line 57
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    new-instance v4, Landroid/content/ComponentName;

    #v4=(UninitRef);
    invoke-direct {v4, p1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 59
    .local v4, target:Landroid/content/ComponentName;
    :try_start_0
    #v4=(Reference);
    invoke-static {p1, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    move-result-object v1

    .line 60
    .local v1, grandparent:Ljava/lang/String;
    #v1=(Reference);
    if-nez v1, :cond_1

    invoke-static {v4}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v2

    .line 63
    .local v2, parentIntent:Landroid/content/Intent;
    :goto_1
    #v2=(Reference);v5=(Conflicted);
    goto :goto_0

    .line 60
    .end local v2           #parentIntent:Landroid/content/Intent;
    :cond_1
    #v2=(Null);v5=(Uninit);
    new-instance v5, Landroid/content/Intent;

    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    #v2=(Reference);
    goto :goto_1

    .line 64
    .end local v1           #grandparent:Ljava/lang/String;
    :catch_0
    #v1=(Conflicted);v2=(Null);v5=(Conflicted);
    move-exception v0

    .line 65
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v5, "NavUtils"

    #v5=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "getParentActivityIntent: bad parentActivityName \'"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' in manifest"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getParentActivityName(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    .locals 4
    .parameter "context"
    .parameter "info"

    .prologue
    const/4 v1, 0x0

    .line 86
    #v1=(Null);
    iget-object v2, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    #v2=(Reference);
    if-nez v2, :cond_1

    move-object v0, v1

    .line 92
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-object v0

    .line 87
    :cond_1
    #v0=(Uninit);v1=(Null);v2=(Reference);v3=(Uninit);
    iget-object v2, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "android.support.PARENT_ACTIVITY"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    .local v0, parentActivity:Ljava/lang/String;
    #v0=(Reference);
    if-nez v0, :cond_2

    move-object v0, v1

    #v0=(Null);
    goto :goto_0

    .line 89
    :cond_2
    #v0=(Reference);
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    #v1=(Char);
    const/16 v2, 0x2e

    #v2=(PosByte);
    if-ne v1, v2, :cond_0

    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 1
    .parameter "activity"
    .parameter "upIntent"

    .prologue
    .line 79
    const/high16 v0, 0x400

    #v0=(Integer);
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 80
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 81
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 82
    return-void
.end method

.method public shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
    .locals 2
    .parameter "activity"
    .parameter "targetIntent"

    .prologue
    .line 73
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 74
    .local v0, action:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_0

    const-string v1, "android.intent.action.MAIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

*/}
