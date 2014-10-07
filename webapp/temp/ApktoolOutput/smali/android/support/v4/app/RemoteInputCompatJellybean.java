package android.support.v4.app; class RemoteInputCompatJellybean {/*

.class Landroid/support/v4/app/RemoteInputCompatJellybean;
.super Ljava/lang/Object;
.source "RemoteInputCompatJellybean.java"


# static fields
.field public static final EXTRA_RESULTS_DATA:Ljava/lang/String; = "android.remoteinput.resultsData"

.field private static final KEY_ALLOW_FREE_FORM_INPUT:Ljava/lang/String; = "allowFreeFormInput"

.field private static final KEY_CHOICES:Ljava/lang/String; = "choices"

.field private static final KEY_EXTRAS:Ljava/lang/String; = "extras"

.field private static final KEY_LABEL:Ljava/lang/String; = "label"

.field private static final KEY_RESULT_KEY:Ljava/lang/String; = "resultKey"

.field public static final RESULTS_CLIP_LABEL:Ljava/lang/String; = "android.remoteinput.results"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static addResultsToIntent([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 8
    .parameter "remoteInputs"
    .parameter "intent"
    .parameter "results"

    .prologue
    .line 96
    new-instance v6, Landroid/os/Bundle;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 97
    .local v6, resultsBundle:Landroid/os/Bundle;
    #v6=(Reference);
    move-object v0, p0

    .local v0, arr$:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v0=(Reference);
    array-length v3, v0

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 98
    .local v4, remoteInput:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v4=(Null);
    invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {p2, v7}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 99
    .local v5, result:Ljava/lang/Object;
    #v5=(Reference);
    instance-of v7, v5, Ljava/lang/CharSequence;

    #v7=(Boolean);
    if-eqz v7, :cond_0

    .line 100
    invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    check-cast v5, Ljava/lang/CharSequence;

    .end local v5           #result:Ljava/lang/Object;
    invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 97
    :cond_0
    #v7=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    .end local v4           #remoteInput:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    :cond_1
    #v4=(Conflicted);v5=(Conflicted);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 104
    .local v1, clipIntent:Landroid/content/Intent;
    #v1=(Reference);
    const-string v7, "android.remoteinput.resultsData"

    #v7=(Reference);
    invoke-virtual {v1, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 105
    const-string v7, "android.remoteinput.results"

    invoke-static {v7, v1}, Landroid/content/ClipData;->newIntent(Ljava/lang/CharSequence;Landroid/content/Intent;)Landroid/content/ClipData;

    move-result-object v7

    invoke-virtual {p1, v7}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 106
    return-void
.end method

.method static fromBundle(Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 6
    .parameter "data"
    .parameter "factory"

    .prologue
    .line 39
    const-string v0, "resultKey"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const-string v0, "label"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    const-string v0, "choices"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    move-result-object v3

    #v3=(Reference);
    const-string v0, "allowFreeFormInput"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    #v4=(Boolean);
    const-string v0, "extras"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    #v5=(Reference);
    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v0

    return-object v0
.end method

.method static fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 3
    .parameter "bundles"
    .parameter "factory"

    .prologue
    .line 58
    if-nez p0, :cond_1

    .line 59
    const/4 v1, 0x0

    .line 65
    :cond_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);
    return-object v1

    .line 61
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    array-length v2, p0

    #v2=(Integer);
    invoke-interface {p1, v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v1

    .line 62
    .local v1, remoteInputs:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v1=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v2=(Conflicted);
    array-length v2, p0

    #v2=(Integer);
    if-ge v0, v2, :cond_0

    .line 63
    aget-object v2, p0, v0

    #v2=(Null);
    invoke-static {v2, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundle(Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v1, v0

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 5
    .parameter "intent"

    .prologue
    const/4 v2, 0x0

    .line 80
    #v2=(Null);
    invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v0

    .line 81
    .local v0, clipData:Landroid/content/ClipData;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 91
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    return-object v2

    .line 84
    :cond_1
    #v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);
    invoke-virtual {v0}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v1

    .line 85
    .local v1, clipDescription:Landroid/content/ClipDescription;
    #v1=(Reference);
    const-string v3, "text/vnd.android.intent"

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 88
    invoke-virtual {v1}, Landroid/content/ClipDescription;->getLabel()Ljava/lang/CharSequence;

    move-result-object v3

    #v3=(Reference);
    const-string v4, "android.remoteinput.results"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 89
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "android.remoteinput.resultsData"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    goto :goto_0
.end method

.method static toBundle(Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;
    .locals 3
    .parameter "remoteInput"

    .prologue
    .line 47
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 48
    .local v0, data:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v1, "resultKey"

    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v1, "label"

    invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getLabel()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 50
    const-string v1, "choices"

    invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getChoices()[Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 51
    const-string v1, "allowFreeFormInput"

    invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getAllowFreeFormInput()Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 52
    const-string v1, "extras"

    invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 53
    return-object v0
.end method

.method static toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
    .locals 3
    .parameter "remoteInputs"

    .prologue
    .line 69
    if-nez p0, :cond_1

    .line 70
    const/4 v0, 0x0

    .line 76
    :cond_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 72
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    array-length v2, p0

    #v2=(Integer);
    new-array v0, v2, [Landroid/os/Bundle;

    .line 73
    .local v0, bundles:[Landroid/os/Bundle;
    #v0=(Reference);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    array-length v2, p0

    #v2=(Integer);
    if-ge v1, v2, :cond_0

    .line 74
    aget-object v2, p0, v1

    #v2=(Null);
    invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundle(Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v0, v1

    .line 73
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

*/}
