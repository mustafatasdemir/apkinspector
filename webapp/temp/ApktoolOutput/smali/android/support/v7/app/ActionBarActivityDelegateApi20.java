package android.support.v7.app; class ActionBarActivityDelegateApi20 {/*

.class Landroid/support/v7/app/ActionBarActivityDelegateApi20;
.super Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;
.source "ActionBarActivityDelegateApi20.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .parameter "activity"

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 25
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
    .locals 1
    .parameter "cb"

    .prologue
    .line 29
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateApi20$WindowCallbackWrapperApi20;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateApi20;Landroid/view/Window$Callback;)V

    #v0=(Reference);
    return-object v0
.end method

*/}
