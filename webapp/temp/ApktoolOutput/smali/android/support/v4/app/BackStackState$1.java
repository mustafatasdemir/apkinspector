package android.support.v4.app; class BackStackState$1 {/*

.class final Landroid/support/v4/app/BackStackState$1;
.super Ljava/lang/Object;
.source "BackStackRecord.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/BackStackState;
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
        "Landroid/support/v4/app/BackStackState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Landroid/support/v4/app/BackStackState;
    .locals 1
    .parameter "in"

    .prologue
    .line 160
    new-instance v0, Landroid/support/v4/app/BackStackState;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/support/v4/app/BackStackState;-><init>(Landroid/os/Parcel;)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 158
    invoke-virtual {p0, p1}, Landroid/support/v4/app/BackStackState$1;->createFromParcel(Landroid/os/Parcel;)Landroid/support/v4/app/BackStackState;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public newArray(I)[Landroid/support/v4/app/BackStackState;
    .locals 1
    .parameter "size"

    .prologue
    .line 164
    new-array v0, p1, [Landroid/support/v4/app/BackStackState;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 158
    invoke-virtual {p0, p1}, Landroid/support/v4/app/BackStackState$1;->newArray(I)[Landroid/support/v4/app/BackStackState;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
