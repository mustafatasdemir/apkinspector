package android.support.v7.view; class ActionMode {/*

.class public abstract Landroid/support/v7/view/ActionMode;
.super Ljava/lang/Object;
.source "ActionMode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/view/ActionMode$Callback;
    }
.end annotation


# instance fields
.field private mTag:Ljava/lang/Object;

.field private mTitleOptionalHint:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public abstract finish()V
.end method

.method public abstract getCustomView()Landroid/view/View;
.end method

.method public abstract getMenu()Landroid/view/Menu;
.end method

.method public abstract getMenuInflater()Landroid/view/MenuInflater;
.end method

.method public abstract getSubtitle()Ljava/lang/CharSequence;
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Landroid/support/v7/view/ActionMode;->mTag:Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method public abstract getTitle()Ljava/lang/CharSequence;
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Landroid/support/v7/view/ActionMode;->mTitleOptionalHint:Z

    #v0=(Boolean);
    return v0
.end method

.method public abstract invalidate()V
.end method

.method public isTitleOptional()Z
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public isUiFocusable()Z
    .locals 1

    .prologue
    .line 216
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public abstract setCustomView(Landroid/view/View;)V
.end method

.method public abstract setSubtitle(I)V
.end method

.method public abstract setSubtitle(Ljava/lang/CharSequence;)V
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 0
    .parameter "tag"

    .prologue
    .line 59
    iput-object p1, p0, Landroid/support/v7/view/ActionMode;->mTag:Ljava/lang/Object;

    .line 60
    return-void
.end method

.method public abstract setTitle(I)V
.end method

.method public abstract setTitle(Ljava/lang/CharSequence;)V
.end method

.method public setTitleOptionalHint(Z)V
    .locals 0
    .parameter "titleOptional"

    .prologue
    .line 129
    iput-boolean p1, p0, Landroid/support/v7/view/ActionMode;->mTitleOptionalHint:Z

    .line 130
    return-void
.end method

*/}
