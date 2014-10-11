package android.support.v7.internal.view.menu; class ActionMenuPresenter$SavedState { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
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
a=0;//             "Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public openSubMenuId:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState$1;);
a=0;//     sput-object v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 544
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/os/Parcel;)V
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Landroid/os/Parcel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 547
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;);
a=0;//     invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I
a=0;// 
a=0;//     .line 548
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;//     .param p1, "dest"    # Landroid/os/Parcel;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     .line 558
a=0;//     return-void
a=0;// .end method
}}
