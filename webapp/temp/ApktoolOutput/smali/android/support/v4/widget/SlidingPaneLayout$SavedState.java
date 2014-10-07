package android.support.v4.widget; class SlidingPaneLayout$SavedState {/*

.class Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SlidingPaneLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SlidingPaneLayout;
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
            "Landroid/support/v4/widget/SlidingPaneLayout$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field isOpen:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1464
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .parameter "in"

    .prologue
    .line 1454
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1455
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z

    .line 1456
    return-void

    .line 1455
    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1446
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcel;)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .parameter "superState"

    .prologue
    .line 1450
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1451
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .parameter "out"
    .parameter "flags"

    .prologue
    .line 1460
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1461
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1462
    return-void

    .line 1461
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
