package android.support.v7.internal.widget; class AbsSpinnerICS$SavedState$1 {/*

.class final Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState$1;
.super Ljava/lang/Object;
.source "AbsSpinnerICS.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
    .locals 2
    .parameter "in"

    .prologue
    .line 384
    new-instance v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p1, v1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;-><init>(Landroid/os/Parcel;Landroid/support/v7/internal/widget/AbsSpinnerICS$1;)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 382
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState$1;->createFromParcel(Landroid/os/Parcel;)Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public newArray(I)[Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
    .locals 1
    .parameter "size"

    .prologue
    .line 388
    new-array v0, p1, [Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 382
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState$1;->newArray(I)[Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
