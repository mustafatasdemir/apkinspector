package android.support.v4.app; class RemoteInput {/*

.class public Landroid/support/v4/app/RemoteInput;
.super Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
.source "RemoteInput.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/RemoteInput$ImplApi20;,
        Landroid/support/v4/app/RemoteInput$ImplJellybean;,
        Landroid/support/v4/app/RemoteInput$ImplBase;,
        Landroid/support/v4/app/RemoteInput$Impl;,
        Landroid/support/v4/app/RemoteInput$Builder;
    }
.end annotation


# static fields
.field public static final EXTRA_RESULTS_DATA:Ljava/lang/String; = "android.remoteinput.resultsData"

.field public static final FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory; = null

.field private static final IMPL:Landroid/support/v4/app/RemoteInput$Impl; = null

.field public static final RESULTS_CLIP_LABEL:Ljava/lang/String; = "android.remoteinput.results"

.field private static final TAG:Ljava/lang/String; = "RemoteInput"


# instance fields
.field private final mAllowFreeFormInput:Z

.field private final mChoices:[Ljava/lang/CharSequence;

.field private final mExtras:Landroid/os/Bundle;

.field private final mLabel:Ljava/lang/CharSequence;

.field private final mResultKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 253
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x14

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 254
    new-instance v0, Landroid/support/v4/app/RemoteInput$ImplApi20;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplApi20;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;

    .line 263
    :goto_0
    new-instance v0, Landroid/support/v4/app/RemoteInput$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;

    return-void

    .line 255
    :cond_0
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 256
    new-instance v0, Landroid/support/v4/app/RemoteInput$ImplJellybean;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplJellybean;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;

    goto :goto_0

    .line 258
    :cond_1
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/app/RemoteInput$ImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplBase;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;

    goto :goto_0
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V
    .locals 0
    .parameter "resultKey"
    .parameter "label"
    .parameter "choices"
    .parameter "allowFreeFormInput"
    .parameter "extras"

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;-><init>()V

    .line 45
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/RemoteInput;->mResultKey:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Landroid/support/v4/app/RemoteInput;->mLabel:Ljava/lang/CharSequence;

    .line 47
    iput-object p3, p0, Landroid/support/v4/app/RemoteInput;->mChoices:[Ljava/lang/CharSequence;

    .line 48
    iput-boolean p4, p0, Landroid/support/v4/app/RemoteInput;->mAllowFreeFormInput:Z

    .line 49
    iput-object p5, p0, Landroid/support/v4/app/RemoteInput;->mExtras:Landroid/os/Bundle;

    .line 50
    return-void
.end method

.method public static addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1
    .parameter "remoteInputs"
    .parameter "intent"
    .parameter "results"

    .prologue
    .line 204
    sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/app/RemoteInput$Impl;->addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 205
    return-void
.end method

.method public static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1
    .parameter "intent"

    .prologue
    .line 188
    sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/app/RemoteInput$Impl;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getAllowFreeFormInput()Z
    .locals 1

    .prologue
    .line 81
    iget-boolean v0, p0, Landroid/support/v4/app/RemoteInput;->mAllowFreeFormInput:Z

    #v0=(Boolean);
    return v0
.end method

.method public getChoices()[Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mChoices:[Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method public getLabel()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mLabel:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getResultKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mResultKey:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

*/}
