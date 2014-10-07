package android.support.v4.app; class ActivityCompat {/*

.class public Landroid/support/v4/app/ActivityCompat;
.super Landroid/support/v4/content/ContextCompat;
.source "ActivityCompat.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/support/v4/content/ContextCompat;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static finishAffinity(Landroid/app/Activity;)V
    .locals 2
    .parameter "activity"

    .prologue
    .line 133
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 134
    invoke-static {p0}, Landroid/support/v4/app/ActivityCompatJB;->finishAffinity(Landroid/app/Activity;)V

    .line 138
    :goto_0
    return-void

    .line 136
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public static invalidateOptionsMenu(Landroid/app/Activity;)Z
    .locals 2
    .parameter "activity"

    .prologue
    .line 64
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 65
    invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V

    .line 66
    const/4 v0, 0x1

    .line 68
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static startActivity(Landroid/app/Activity;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2
    .parameter "activity"
    .end parameter
    .parameter "intent"
    .end parameter
    .parameter "options"
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end parameter

    .prologue
    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 90
    invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityCompatJB;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 94
    :goto_0
    return-void

    .line 92
    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public static startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 2
    .parameter "activity"
    .end parameter
    .parameter "intent"
    .end parameter
    .parameter "requestCode"
    .end parameter
    .parameter "options"
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end parameter

    .prologue
    .line 118
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 119
    invoke-static {p0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompatJB;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 123
    :goto_0
    return-void

    .line 121
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

*/}
