package android.support.v4.app; class NoSaveStateFrameLayout { void a() { int a;
a=0;// .class Landroid/support/v4/app/NoSaveStateFrameLayout;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "NoSaveStateFrameLayout.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Landroid/support/v4/app/NoSaveStateFrameLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static wrap(Landroid/view/View;)Landroid/view/ViewGroup;
a=0;//     .locals 5
a=0;//     .param p0, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 32
a=0;//     #v4=(Byte);
a=0;//     new-instance v2, Landroid/support/v4/app/NoSaveStateFrameLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/app/NoSaveStateFrameLayout;);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Landroid/support/v4/app/NoSaveStateFrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 33
a=0;//     .local v2, "wrapper":Landroid/support/v4/app/NoSaveStateFrameLayout;
a=0;//     #v2=(Reference,Landroid/support/v4/app/NoSaveStateFrameLayout;);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 34
a=0;//     .local v0, "childParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 39
a=0;//     .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 41
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
}}
