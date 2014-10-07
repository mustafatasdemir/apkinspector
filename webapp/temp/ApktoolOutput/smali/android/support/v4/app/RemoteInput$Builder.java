package android.support.v4.app; class RemoteInput$Builder {/*

.class public final Landroid/support/v4/app/RemoteInput$Builder;
.super Ljava/lang/Object;
.source "RemoteInput.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/RemoteInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mAllowFreeFormInput:Z

.field private mChoices:[Ljava/lang/CharSequence;

.field private mExtras:Landroid/os/Bundle;

.field private mLabel:Ljava/lang/CharSequence;

.field private final mResultKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .parameter "resultKey"

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z

    .line 99
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    .line 106
    if-nez p1, :cond_0

    .line 107
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "Result key can\'t be null"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 109
    :cond_0
    #v1=(Uninit);
    iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;

    .line 110
    return-void
.end method


# virtual methods
.method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/RemoteInput$Builder;
    .locals 1
    .parameter "extras"

    .prologue
    .line 156
    if-eqz p1, :cond_0

    .line 157
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 159
    :cond_0
    #v0=(Conflicted);
    return-object p0
.end method

.method public build()Landroid/support/v4/app/RemoteInput;
    .locals 6

    .prologue
    .line 176
    new-instance v0, Landroid/support/v4/app/RemoteInput;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;

    #v3=(Reference);
    iget-boolean v4, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z

    #v4=(Boolean);
    iget-object v5, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/RemoteInput;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V

    #v0=(Reference);
    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method public setAllowFreeFormInput(Z)Landroid/support/v4/app/RemoteInput$Builder;
    .locals 0
    .parameter "allowFreeFormInput"

    .prologue
    .line 144
    iput-boolean p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z

    .line 145
    return-object p0
.end method

.method public setChoices([Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;
    .locals 0
    .parameter "choices"

    .prologue
    .line 130
    iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;

    .line 131
    return-object p0
.end method

.method public setLabel(Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;
    .locals 0
    .parameter "label"

    .prologue
    .line 118
    iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;

    .line 119
    return-object p0
.end method

*/}
