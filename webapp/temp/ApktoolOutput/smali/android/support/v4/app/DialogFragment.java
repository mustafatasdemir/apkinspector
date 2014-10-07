package android.support.v4.app; class DialogFragment {/*

.class public Landroid/support/v4/app/DialogFragment;
.super Landroid/support/v4/app/Fragment;
.source "DialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/DialogFragment$DialogStyle;
    }
.end annotation


# static fields
.field private static final SAVED_BACK_STACK_ID:Ljava/lang/String; = "android:backStackId"

.field private static final SAVED_CANCELABLE:Ljava/lang/String; = "android:cancelable"

.field private static final SAVED_DIALOG_STATE_TAG:Ljava/lang/String; = "android:savedDialogState"

.field private static final SAVED_SHOWS_DIALOG:Ljava/lang/String; = "android:showsDialog"

.field private static final SAVED_STYLE:Ljava/lang/String; = "android:style"

.field private static final SAVED_THEME:Ljava/lang/String; = "android:theme"

.field public static final STYLE_NORMAL:I = 0x0

.field public static final STYLE_NO_FRAME:I = 0x2

.field public static final STYLE_NO_INPUT:I = 0x3

.field public static final STYLE_NO_TITLE:I = 0x1


# instance fields
.field mBackStackId:I

.field mCancelable:Z

.field mDialog:Landroid/app/Dialog;

.field mDismissed:Z

.field mShownByMe:Z

.field mShowsDialog:Z

.field mStyle:I

.field mTheme:I

.field mViewDestroyed:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 95
    #v0=(Null);
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 84
    #p0=(Reference);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    .line 85
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    .line 86
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    .line 87
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    .line 88
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    .line 96
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .prologue
    .line 166
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V

    .line 167
    return-void
.end method

.method public dismissAllowingStateLoss()V
    .locals 1

    .prologue
    .line 176
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V

    .line 177
    return-void
.end method

.method dismissInternal(Z)V
    .locals 4
    .parameter "allowStateLoss"

    .prologue
    const/4 v3, 0x1

    .line 180
    #v3=(One);
    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 203
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 183
    :cond_0
    #v0=(Uninit);v1=(Boolean);v2=(Uninit);
    iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    .line 184
    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z

    .line 185
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 186
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 187
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    .line 189
    :cond_1
    #v1=(Reference);
    iput-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z

    .line 190
    iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    #v1=(Integer);
    if-ltz v1, :cond_2

    .line 191
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    #v2=(Integer);
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentManager;->popBackStack(II)V

    .line 193
    const/4 v1, -0x1

    #v1=(Byte);
    iput v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    goto :goto_0

    .line 195
    :cond_2
    #v1=(Integer);v2=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 196
    .local v0, ft:Landroid/support/v4/app/FragmentTransaction;
    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 197
    if-eqz p1, :cond_3

    .line 198
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    .line 200
    :cond_3
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0
.end method

.method public getDialog()Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    return-object v0
.end method

.method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2
    .parameter "savedInstanceState"

    .prologue
    .line 303
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 304
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 322
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    .line 307
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    invoke-virtual {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    .line 308
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 318
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 319
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 310
    :pswitch_0
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x18

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 316
    :pswitch_1
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    goto :goto_1

    .line 322
    :cond_1
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-string v1, "layout_inflater"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 308
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getShowsDialog()Z
    .locals 1

    .prologue
    .line 260
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v0=(Boolean);
    return v0
.end method

.method public getTheme()I
    .locals 1

    .prologue
    .line 211
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    #v0=(Integer);
    return v0
.end method

.method public isCancelable()Z
    .locals 1

    .prologue
    .line 232
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    #v0=(Boolean);
    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4
    .parameter "savedInstanceState"

    .prologue
    .line 368
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 370
    iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 391
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 374
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getView()Landroid/view/View;

    move-result-object v1

    .line 375
    .local v1, view:Landroid/view/View;
    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 376
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_2

    .line 377
    new-instance v2, Ljava/lang/IllegalStateException;

    #v2=(UninitRef);
    const-string v3, "DialogFragment can not be attached to a container view"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 379
    :cond_2
    #v3=(Uninit);
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 381
    :cond_3
    #v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v2=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 382
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    iget-boolean v3, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    #v3=(Boolean);
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 383
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 384
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v2, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 385
    if-eqz p1, :cond_0

    .line 386
    const-string v2, "android:savedDialogState"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 387
    .local v0, dialogState:Landroid/os/Bundle;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 388
    iget-object v2, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1
    .parameter "activity"

    .prologue
    .line 265
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 266
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 269
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    .line 271
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0
    .parameter "dialog"

    .prologue
    .line 354
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .parameter "savedInstanceState"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 286
    #v2=(Null);
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 288
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mContainerId:I

    #v0=(Integer);
    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    .line 290
    if-eqz p1, :cond_0

    .line 291
    const-string v0, "android:style"

    #v0=(Reference);
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    .line 292
    const-string v0, "android:theme"

    #v0=(Reference);
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    .line 293
    const-string v0, "android:cancelable"

    #v0=(Reference);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    .line 294
    const-string v0, "android:showsDialog"

    #v0=(Reference);
    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v1=(Boolean);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    .line 295
    const-string v0, "android:backStackId"

    #v0=(Reference);
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    .line 298
    :cond_0
    return-void

    :cond_1
    #v1=(One);
    move v0, v2

    .line 288
    #v0=(Null);
    goto :goto_0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3
    .parameter "savedInstanceState"
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 350
    new-instance v0, Landroid/app/Dialog;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->getTheme()I

    move-result v2

    #v2=(Integer);
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    #v0=(Reference);
    return-object v0
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 441
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 442
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 446
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z

    .line 447
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 448
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    .line 450
    :cond_0
    #v0=(Reference);
    return-void
.end method

.method public onDetach()V
    .locals 1

    .prologue
    .line 275
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 276
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    if-nez v0, :cond_0

    .line 280
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    .line 282
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1
    .parameter "dialog"

    .prologue
    .line 357
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 362
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->dismissInternal(Z)V

    .line 364
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3
    .parameter "outState"

    .prologue
    .line 404
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 405
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 406
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    .line 407
    .local v0, dialogState:Landroid/os/Bundle;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 408
    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 411
    .end local v0           #dialogState:Landroid/os/Bundle;
    :cond_0
    #v0=(Conflicted);
    iget v1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    #v1=(Integer);
    if-eqz v1, :cond_1

    .line 412
    const-string v1, "android:style"

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    #v2=(Integer);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 414
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    iget v1, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    #v1=(Integer);
    if-eqz v1, :cond_2

    .line 415
    const-string v1, "android:theme"

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    #v2=(Integer);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 417
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    #v1=(Boolean);
    if-nez v1, :cond_3

    .line 418
    const-string v1, "android:cancelable"

    #v1=(Reference);
    iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    #v2=(Boolean);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 420
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);
    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v1=(Boolean);
    if-nez v1, :cond_4

    .line 421
    const-string v1, "android:showsDialog"

    #v1=(Reference);
    iget-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    #v2=(Boolean);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 423
    :cond_4
    #v1=(Conflicted);v2=(Conflicted);
    iget v1, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    #v1=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-eq v1, v2, :cond_5

    .line 424
    const-string v1, "android:backStackId"

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    #v2=(Integer);
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 426
    :cond_5
    #v1=(Conflicted);
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 395
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 396
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 397
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z

    .line 398
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 400
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 430
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 431
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 434
    :cond_0
    return-void
.end method

.method public setCancelable(Z)V
    .locals 1
    .parameter "cancelable"

    .prologue
    .line 224
    iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mCancelable:Z

    .line 225
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 226
    :cond_0
    return-void
.end method

.method public setShowsDialog(Z)V
    .locals 0
    .parameter "showsDialog"

    .prologue
    .line 253
    iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->mShowsDialog:Z

    .line 254
    return-void
.end method

.method public setStyle(II)V
    .locals 2
    .parameter "style"
    .parameter "theme"

    .prologue
    .line 113
    iput p1, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    .line 114
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-eq v0, v1, :cond_0

    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mStyle:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 115
    :cond_0
    const v0, 0x1030059

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    .line 117
    :cond_1
    if-eqz p2, :cond_2

    .line 118
    iput p2, p0, Landroid/support/v4/app/DialogFragment;->mTheme:I

    .line 120
    :cond_2
    return-void
.end method

.method public show(Landroid/support/v4/app/FragmentTransaction;Ljava/lang/String;)I
    .locals 2
    .parameter "transaction"
    .parameter "tag"

    .prologue
    const/4 v1, 0x0

    .line 151
    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    .line 152
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z

    .line 153
    invoke-virtual {p1, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 154
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mViewDestroyed:Z

    .line 155
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    .line 156
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->mBackStackId:I

    return v0
.end method

.method public show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
    .locals 2
    .parameter "manager"
    .parameter "tag"

    .prologue
    .line 134
    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mDismissed:Z

    .line 135
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->mShownByMe:Z

    .line 136
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 137
    .local v0, ft:Landroid/support/v4/app/FragmentTransaction;
    #v0=(Reference);
    invoke-virtual {v0, p0, p2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 138
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 139
    return-void
.end method

*/}
