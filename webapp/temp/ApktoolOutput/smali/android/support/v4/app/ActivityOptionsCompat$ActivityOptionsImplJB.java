package android.support.v4.app; class ActivityOptionsCompat$ActivityOptionsImplJB {/*

.class Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
.super Landroid/support/v4/app/ActivityOptionsCompat;
.source "ActivityOptionsCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ActivityOptionsCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ActivityOptionsImplJB"
.end annotation


# instance fields
.field private final mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;


# direct methods
.method constructor <init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
    .locals 0
    .parameter "impl"

    .prologue
    .line 115
    invoke-direct {p0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V

    .line 116
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;

    .line 117
    return-void
.end method


# virtual methods
.method public toBundle()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/ActivityOptionsCompatJB;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroid/support/v4/app/ActivityOptionsCompat;)V
    .locals 3
    .parameter "otherOptions"

    .prologue
    .line 126
    instance-of v1, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;

    #v1=(Boolean);
    if-eqz v1, :cond_0

    move-object v0, p1

    .line 127
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;

    .line 128
    .local v0, otherImpl:Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    iget-object v1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;

    #v1=(Reference);
    iget-object v2, v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v4/app/ActivityOptionsCompatJB;->update(Landroid/support/v4/app/ActivityOptionsCompatJB;)V

    .line 130
    .end local v0           #otherImpl:Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

*/}
