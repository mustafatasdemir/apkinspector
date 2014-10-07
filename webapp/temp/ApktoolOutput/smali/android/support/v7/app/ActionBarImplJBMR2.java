package android.support.v7.app; class ActionBarImplJBMR2 {/*

.class public Landroid/support/v7/app/ActionBarImplJBMR2;
.super Landroid/support/v7/app/ActionBarImplJB;
.source "ActionBarImplJBMR2.java"


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V
    .locals 0
    .parameter "activity"
    .parameter "callback"

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplJB;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V

    .line 25
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public setHomeActionContentDescription(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplJBMR2;->mActionBar:Landroid/app/ActionBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setHomeActionContentDescription(I)V

    .line 45
    return-void
.end method

.method public setHomeActionContentDescription(Ljava/lang/CharSequence;)V
    .locals 1
    .parameter "description"

    .prologue
    .line 39
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplJBMR2;->mActionBar:Landroid/app/ActionBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setHomeActionContentDescription(Ljava/lang/CharSequence;)V

    .line 40
    return-void
.end method

.method public setHomeAsUpIndicator(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 34
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplJBMR2;->mActionBar:Landroid/app/ActionBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setHomeAsUpIndicator(I)V

    .line 35
    return-void
.end method

.method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "indicator"

    .prologue
    .line 29
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplJBMR2;->mActionBar:Landroid/app/ActionBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 30
    return-void
.end method

*/}
