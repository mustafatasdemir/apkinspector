package android.support.v7.app; class ActionBarImplHC {/*

.class Landroid/support/v7/app/ActionBarImplHC;
.super Landroid/support/v7/app/ActionBarImplBase;
.source "ActionBarImplHC.java"

# interfaces
.implements Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;
    }
.end annotation


# instance fields
.field private mCurActionMode:Landroid/view/ActionMode;

.field final mNativeActionModeAwareLayout:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V
    .locals 1
    .parameter "activity"
    .parameter "callback"

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplBase;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V

    .line 35
    #p0=(Reference);
    sget v0, Landroid/support/v7/appcompat/R$id;->action_bar_root:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mNativeActionModeAwareLayout:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;

    .line 39
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mNativeActionModeAwareLayout:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mNativeActionModeAwareLayout:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->setActionModeForChildListener(Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$OnActionModeForChildListener;)V

    .line 42
    :cond_0
    return-void
.end method

.method static synthetic access$002(Landroid/support/v7/app/ActionBarImplHC;Landroid/view/ActionMode;)Landroid/view/ActionMode;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 25
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    return-object p1
.end method


# virtual methods
.method public hide()V
    .locals 1

    .prologue
    .line 60
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplBase;->hide()V

    .line 61
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 64
    :cond_0
    return-void
.end method

.method isShowHideAnimationEnabled()Z
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    #v0=(Reference);
    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplBase;->isShowHideAnimationEnabled()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onActionModeForChild(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 1
    .parameter "callback"

    .prologue
    .line 47
    new-instance v0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarImplHC;Landroid/view/ActionMode$Callback;)V

    #v0=(Reference);
    return-object v0
.end method

.method public show()V
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplBase;->show()V

    .line 53
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC;->mCurActionMode:Landroid/view/ActionMode;

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 56
    :cond_0
    return-void
.end method

*/}
