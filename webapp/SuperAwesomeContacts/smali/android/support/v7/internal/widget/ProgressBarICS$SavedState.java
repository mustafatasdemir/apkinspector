package android.support.v7.internal.widget; class ProgressBarICS$SavedState { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "ProgressBarICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "SavedState"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/os/Parcelable$Creator",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field progress:I
a=0;// 
a=0;// .field secondaryProgress:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 865
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState$1;);
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 854
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I
a=0;// 
a=0;//     .line 855
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     .line 856
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v7/internal/widget/ProgressBarICS$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/os/Parcel;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ProgressBarICS$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 838
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 846
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 847
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 860
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 861
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 862
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 863
a=0;//     return-void
a=0;// .end method
}}
