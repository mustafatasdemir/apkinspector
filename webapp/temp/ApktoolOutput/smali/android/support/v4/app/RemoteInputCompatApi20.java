package android.support.v4.app; class RemoteInputCompatApi20 {/*

.class Landroid/support/v4/app/RemoteInputCompatApi20;
.super Ljava/lang/Object;
.source "RemoteInputCompatApi20.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static addResultsToIntent([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1
    .parameter "remoteInputs"
    .parameter "intent"
    .parameter "results"

    .prologue
    .line 61
    invoke-static {p0}, Landroid/support/v4/app/RemoteInputCompatApi20;->fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0, p1, p2}, Landroid/app/RemoteInput;->addResultsToIntent([Landroid/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 62
    return-void
.end method

.method static fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;
    .locals 5
    .parameter "srcArray"

    .prologue
    .line 39
    if-nez p0, :cond_1

    .line 40
    const/4 v1, 0x0

    .line 52
    :cond_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v1

    .line 42
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    array-length v3, p0

    #v3=(Integer);
    new-array v1, v3, [Landroid/app/RemoteInput;

    .line 43
    .local v1, result:[Landroid/app/RemoteInput;
    #v1=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    array-length v3, p0

    #v3=(Integer);
    if-ge v0, v3, :cond_0

    .line 44
    aget-object v2, p0, v0

    .line 45
    .local v2, src:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v2=(Null);
    new-instance v3, Landroid/app/RemoteInput$Builder;

    #v3=(UninitRef);
    invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getLabel()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v3

    invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getChoices()[Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object v3

    invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getAllowFreeFormInput()Z

    move-result v4

    #v4=(Boolean);
    invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    move-result-object v3

    invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    move-result-object v3

    aput-object v3, v1, v0

    .line 43
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1
    .parameter "intent"

    .prologue
    .line 56
    invoke-static {p0}, Landroid/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static toCompat([Landroid/app/RemoteInput;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 9
    .parameter "srcArray"
    .parameter "factory"

    .prologue
    .line 26
    if-nez p0, :cond_1

    .line 27
    const/4 v7, 0x0

    .line 35
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference);v8=(Conflicted);
    return-object v7

    .line 29
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    array-length v0, p0

    #v0=(Integer);
    invoke-interface {p1, v0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v7

    .line 30
    .local v7, result:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v7=(Reference);
    const/4 v6, 0x0

    .local v6, i:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);
    array-length v0, p0

    #v0=(Integer);
    if-ge v6, v0, :cond_0

    .line 31
    aget-object v8, p0, v6

    .line 32
    .local v8, src:Landroid/app/RemoteInput;
    #v8=(Null);
    invoke-virtual {v8}, Landroid/app/RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v8}, Landroid/app/RemoteInput;->getLabel()Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v8}, Landroid/app/RemoteInput;->getChoices()[Ljava/lang/CharSequence;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v8}, Landroid/app/RemoteInput;->getAllowFreeFormInput()Z

    move-result v4

    #v4=(Boolean);
    invoke-virtual {v8}, Landroid/app/RemoteInput;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    #v5=(Reference);
    move-object v0, p1

    #v0=(Reference);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v0

    aput-object v0, v7, v6

    .line 30
    add-int/lit8 v6, v6, 0x1

    goto :goto_0
.end method

*/}
