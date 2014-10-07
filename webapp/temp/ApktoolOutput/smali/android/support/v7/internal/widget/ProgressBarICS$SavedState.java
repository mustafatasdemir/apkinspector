package android.support.v7.internal.widget; class ProgressBarICS$SavedState {/*

.class Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "ProgressBarICS.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ProgressBarICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field progress:I

.field secondaryProgress:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 865
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .parameter "in"

    .prologue
    .line 853
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 854
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I

    .line 855
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I

    .line 856
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v7/internal/widget/ProgressBarICS$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 838
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;-><init>(Landroid/os/Parcel;)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .parameter "superState"

    .prologue
    .line 846
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 847
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .parameter "out"
    .parameter "flags"

    .prologue
    .line 860
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 861
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 862
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 863
    return-void
.end method

*/}
