package android.support.v7.internal.widget; class ActionBarView$SavedState {/*

.class Landroid/support/v7/internal/widget/ActionBarView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "ActionBarView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
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
            "Landroid/support/v7/internal/widget/ActionBarView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field expandedMenuItemId:I

.field isOverflowOpen:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1234
    new-instance v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .parameter "in"

    .prologue
    .line 1222
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1223
    #p0=(Reference);
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    .line 1224
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    .line 1225
    return-void

    .line 1224
    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v7/internal/widget/ActionBarView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1212
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcel;)V

    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .parameter "superState"

    .prologue
    .line 1218
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1219
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .parameter "out"
    .parameter "flags"

    .prologue
    .line 1229
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1230
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1231
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1232
    return-void

    .line 1231
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
