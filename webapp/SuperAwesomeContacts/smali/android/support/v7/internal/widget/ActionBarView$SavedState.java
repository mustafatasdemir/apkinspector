package android.support.v7.internal.widget; class ActionBarView$SavedState { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;// .super Landroid/view/View$BaseSavedState;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActionBarView;
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
a=0;//             "Landroid/support/v7/internal/widget/ActionBarView$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field expandedMenuItemId:I
a=0;// 
a=0;// .field isOverflowOpen:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1234
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$SavedState$1;);
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1222
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     .line 1223
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     .line 1224
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     .line 1225
a=0;//     return-void
a=0;// 
a=0;//     .line 1224
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v7/internal/widget/ActionBarView$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/os/Parcel;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ActionBarView$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1212
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcel;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "superState"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1218
a=0;//     invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1219
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$SavedState;);
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
a=0;//     .line 1229
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
a=0;// 
a=0;//     .line 1230
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1231
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 1232
a=0;//     return-void
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
