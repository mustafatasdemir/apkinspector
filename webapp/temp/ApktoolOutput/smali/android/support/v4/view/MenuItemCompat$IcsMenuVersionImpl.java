package android.support.v4.view; class MenuItemCompat$IcsMenuVersionImpl {/*

.class Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;
.super Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;
.source "MenuItemCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/MenuItemCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IcsMenuVersionImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 200
    invoke-direct {p0}, Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public collapseActionView(Landroid/view/MenuItem;)Z
    .locals 1
    .parameter "item"

    .prologue
    .line 208
    invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->collapseActionView(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public expandActionView(Landroid/view/MenuItem;)Z
    .locals 1
    .parameter "item"

    .prologue
    .line 203
    invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->expandActionView(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isActionViewExpanded(Landroid/view/MenuItem;)Z
    .locals 1
    .parameter "item"

    .prologue
    .line 213
    invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->isActionViewExpanded(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 1
    .parameter "item"
    .parameter "listener"

    .prologue
    .line 219
    if-nez p2, :cond_0

    .line 220
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;

    move-result-object v0

    .line 227
    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Uninit);
    new-instance v0, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p2}, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;-><init>(Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)V

    #v0=(Reference);
    invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;

    move-result-object v0

    goto :goto_0
.end method

*/}
