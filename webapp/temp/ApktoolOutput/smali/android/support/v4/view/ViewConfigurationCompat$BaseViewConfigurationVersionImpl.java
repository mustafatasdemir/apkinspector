package android.support.v4.view; class ViewConfigurationCompat$BaseViewConfigurationVersionImpl {/*

.class Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;
.super Ljava/lang/Object;
.source "ViewConfigurationCompat.java"

# interfaces
.implements Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewConfigurationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BaseViewConfigurationVersionImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
    .locals 1
    .parameter "config"

    .prologue
    .line 39
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
