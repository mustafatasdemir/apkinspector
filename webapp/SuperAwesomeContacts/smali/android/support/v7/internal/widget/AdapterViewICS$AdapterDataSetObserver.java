package android.support.v7.internal.widget; class AdapterViewICS$AdapterDataSetObserver { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;
a=0;// .super Landroid/database/DataSetObserver;
a=0;// .source "AdapterViewICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "AdapterDataSetObserver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 796
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V
a=0;// 
a=0;//     .line 798
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearSavedState()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 843
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 844
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z
a=0;// 
a=0;//     .line 803
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget v1, v1, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I
a=0;// 
a=0;//     .line 804
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     .line 808
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 810
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$000(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 811
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 815
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkFocus()V
a=0;// 
a=0;//     .line 816
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->requestLayout()V
a=0;// 
a=0;//     .line 817
a=0;//     return-void
a=0;// 
a=0;//     .line 813
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->rememberSyncState()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInvalidated()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
a=0;//     const-wide/high16 v4, -0x8000000000000000L
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 821
a=0;//     #v2=(Byte);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 826
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$100(Landroid/support/v7/internal/widget/AdapterViewICS;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 830
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget v1, v1, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I
a=0;// 
a=0;//     .line 831
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput v3, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I
a=0;// 
a=0;//     .line 832
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I
a=0;// 
a=0;//     .line 833
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput-wide v4, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J
a=0;// 
a=0;//     .line 834
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     .line 835
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput-wide v4, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J
a=0;// 
a=0;//     .line 836
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     iput-boolean v3, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 838
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkFocus()V
a=0;// 
a=0;//     .line 839
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->requestLayout()V
a=0;// 
a=0;//     .line 840
a=0;//     return-void
a=0;// .end method
}}
