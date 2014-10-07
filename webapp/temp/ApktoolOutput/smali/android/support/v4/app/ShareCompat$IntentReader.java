package android.support.v4.app; class ShareCompat$IntentReader {/*

.class public Landroid/support/v4/app/ShareCompat$IntentReader;
.super Ljava/lang/Object;
.source "ShareCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ShareCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IntentReader"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "IntentReader"


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mCallingActivity:Landroid/content/ComponentName;

.field private mCallingPackage:Ljava/lang/String;

.field private mIntent:Landroid/content/Intent;

.field private mStreams:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 676
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 677
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;

    .line 678
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    .line 679
    invoke-static {p1}, Landroid/support/v4/app/ShareCompat;->getCallingPackage(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    .line 680
    invoke-static {p1}, Landroid/support/v4/app/ShareCompat;->getCallingActivity(Landroid/app/Activity;)Landroid/content/ComponentName;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;

    .line 681
    return-void
.end method

.method public static from(Landroid/app/Activity;)Landroid/support/v4/app/ShareCompat$IntentReader;
    .locals 1
    .parameter "activity"

    .prologue
    .line 673
    new-instance v0, Landroid/support/v4/app/ShareCompat$IntentReader;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/ShareCompat$IntentReader;-><init>(Landroid/app/Activity;)V

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public getCallingActivity()Landroid/content/ComponentName;
    .locals 1

    .prologue
    .line 888
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;

    #v0=(Reference);
    return-object v0
.end method

.method public getCallingActivityIcon()Landroid/graphics/drawable/Drawable;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 902
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 910
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v4=(Conflicted);
    return-object v2

    .line 904
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 906
    .local v1, pm:Landroid/content/pm/PackageManager;
    :try_start_0
    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 907
    :catch_0
    #v2=(Null);
    move-exception v0

    .line 908
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v3, "IntentReader"

    const-string v4, "Could not retrieve icon for calling activity"

    #v4=(Reference);
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getCallingApplicationIcon()Landroid/graphics/drawable/Drawable;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 924
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 932
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v4=(Conflicted);
    return-object v2

    .line 926
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 928
    .local v1, pm:Landroid/content/pm/PackageManager;
    :try_start_0
    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 929
    :catch_0
    #v2=(Null);
    move-exception v0

    .line 930
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v3, "IntentReader"

    const-string v4, "Could not retrieve icon for calling application"

    #v4=(Reference);
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getCallingApplicationLabel()Ljava/lang/CharSequence;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 946
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    #v3=(Reference);
    if-nez v3, :cond_0

    .line 954
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v4=(Conflicted);
    return-object v2

    .line 948
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 950
    .local v1, pm:Landroid/content/pm/PackageManager;
    :try_start_0
    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 951
    :catch_0
    #v2=(Null);v4=(Conflicted);
    move-exception v0

    .line 952
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v3, "IntentReader"

    const-string v4, "Could not retrieve label for calling application"

    #v4=(Reference);
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public getCallingPackage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 871
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getEmailBcc()[Ljava/lang/String;
    .locals 2

    .prologue
    .line 844
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.BCC"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmailCc()[Ljava/lang/String;
    .locals 2

    .prologue
    .line 834
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.CC"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmailTo()[Ljava/lang/String;
    .locals 2

    .prologue
    .line 824
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.EMAIL"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHtmlText()Ljava/lang/String;
    .locals 4

    .prologue
    .line 750
    iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v2=(Reference);
    const-string v3, "android.intent.extra.HTML_TEXT"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 751
    .local v0, result:Ljava/lang/String;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 752
    invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 753
    .local v1, text:Ljava/lang/CharSequence;
    #v1=(Reference);
    instance-of v2, v1, Landroid/text/Spanned;

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 754
    check-cast v1, Landroid/text/Spanned;

    .end local v1           #text:Ljava/lang/CharSequence;
    invoke-static {v1}, Landroid/text/Html;->toHtml(Landroid/text/Spanned;)Ljava/lang/String;

    move-result-object v0

    .line 759
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 755
    .restart local v1       #text:Ljava/lang/CharSequence;
    :cond_1
    #v1=(Reference);v2=(Boolean);
    if-eqz v1, :cond_0

    .line 756
    invoke-static {}, Landroid/support/v4/app/ShareCompat;->access$000()Landroid/support/v4/app/ShareCompat$ShareCompatImpl;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v2, v1}, Landroid/support/v4/app/ShareCompat$ShareCompatImpl;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getStream()Landroid/net/Uri;
    .locals 2

    .prologue
    .line 774
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.STREAM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method public getStream(I)Landroid/net/Uri;
    .locals 3
    .parameter "index"

    .prologue
    .line 787
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->isMultipleShare()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.STREAM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    .line 790
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 791
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 794
    :goto_0
    return-object v0

    .line 793
    :cond_1
    if-nez p1, :cond_2

    .line 794
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    goto :goto_0

    .line 796
    :cond_2
    #v1=(Conflicted);
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Stream items available: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->getStreamCount()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " index requested: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public getStreamCount()I
    .locals 2

    .prologue
    .line 808
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->isMultipleShare()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 809
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.STREAM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    .line 811
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 812
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 814
    :goto_0
    #v0=(Integer);
    return v0

    :cond_1
    #v0=(Reference);
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    const-string v1, "android.intent.extra.STREAM"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :cond_2
    #v0=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 2

    .prologue
    .line 854
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.SUBJECT"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 736
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    const-string v1, "android.intent.extra.TEXT"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 726
    iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isMultipleShare()Z
    .locals 2

    .prologue
    .line 716
    const-string v0, "android.intent.action.SEND_MULTIPLE"

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isShareIntent()Z
    .locals 2

    .prologue
    .line 692
    iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 693
    .local v0, action:Ljava/lang/String;
    #v0=(Reference);
    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "android.intent.action.SEND_MULTIPLE"

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public isSingleShare()Z
    .locals 2

    .prologue
    .line 705
    const-string v0, "android.intent.action.SEND"

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
