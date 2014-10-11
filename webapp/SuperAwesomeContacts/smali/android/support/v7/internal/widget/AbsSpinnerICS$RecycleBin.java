package android.support.v7.internal.widget; class AbsSpinnerICS$RecycleBin { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AbsSpinnerICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/AbsSpinnerICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "RecycleBin"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mScrapHeap:Landroid/util/SparseArray;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/AbsSpinnerICS;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 423
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;);
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method clear()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;
a=0;// 
a=0;//     .line 443
a=0;//     .local v2, "scrapHeap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/view/View;>;"
a=0;//     #v2=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v2}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 444
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 445
a=0;//     invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/view/View;
a=0;// 
a=0;//     .line 446
a=0;//     .local v3, "view":Landroid/view/View;
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/AbsSpinnerICS;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v4, v3, v5}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->access$100(Landroid/support/v7/internal/widget/AbsSpinnerICS;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 450
a=0;//     .end local v3    # "view":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V
a=0;// 
a=0;//     .line 451
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method get(I)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 432
a=0;//     .local v0, "result":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/util/SparseArray;->delete(I)V
a=0;// 
a=0;//     .line 438
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public put(ILandroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 427
a=0;//     return-void
a=0;// .end method
}}
