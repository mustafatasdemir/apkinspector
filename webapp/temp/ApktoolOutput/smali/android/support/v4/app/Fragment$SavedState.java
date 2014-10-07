package android.support.v4.app; class Fragment$SavedState {/*

.class public Landroid/support/v4/app/Fragment$SavedState;
.super Ljava/lang/Object;
.source "Fragment.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Landroid/support/v4/app/Fragment$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mState:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 332
    new-instance v0, Landroid/support/v4/app/Fragment$SavedState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/Fragment$SavedState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/Fragment$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;)V
    .locals 0
    .parameter "state"

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;

    .line 313
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .locals 1
    .parameter "in"
    .parameter "loader"

    .prologue
    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;

    .line 317
    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 320
    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 324
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .parameter "dest"
    .parameter "flags"

    .prologue
    .line 329
    iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 330
    return-void
.end method

*/}
