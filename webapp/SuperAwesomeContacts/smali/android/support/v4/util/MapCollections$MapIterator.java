package android.support.v4.util; class MapCollections$MapIterator { void a() { int a;
a=0;// .class final Landroid/support/v4/util/MapCollections$MapIterator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapCollections.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// .implements Ljava/util/Map$Entry;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/MapCollections;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "MapIterator"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Iterator",
a=0;//         "<",
a=0;//         "Ljava/util/Map$Entry",
a=0;//         "<TK;TV;>;>;",
a=0;//         "Ljava/util/Map$Entry",
a=0;//         "<TK;TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mEnd:I
a=0;// 
a=0;// .field mEntryValid:Z
a=0;// 
a=0;// .field mIndex:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/util/MapCollections;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 74
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections$MapIterator;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p1}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final equals(Ljava/lang/Object;)Z
a=0;//     .locals 6
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     #v2=(Null);
a=0;//     iget-boolean v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "This container does not support retaining Map.Entry objects"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     #v1=(One);v2=(Null);
a=0;//     instance-of v3, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 140
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 141
a=0;//     .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v5, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/util/ContainerHelpers;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     invoke-virtual {v4, v5, v1}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/util/ContainerHelpers;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v2=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getKey()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TK;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "This container does not support retaining Map.Entry objects"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "This container does not support retaining Map.Entry objects"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final hashCode()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 147
a=0;//     #v2=(Null);
a=0;//     iget-boolean v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "This container does not support retaining Map.Entry objects"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v2=(Null);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 152
a=0;//     .local v0, "key":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 153
a=0;//     .local v1, "value":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     xor-int/2addr v2, v3
a=0;// 
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Null);v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic next()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->next()Ljava/util/Map$Entry;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map$Entry;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public next()Ljava/util/Map$Entry;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     .line 90
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 99
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     .line 100
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEnd:I
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TV;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mEntryValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "This container does not support retaining Map.Entry objects"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$MapIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$MapIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/support/v4/util/MapCollections;->colSetValue(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$MapIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.MapIterator;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/MapCollections$MapIterator;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
