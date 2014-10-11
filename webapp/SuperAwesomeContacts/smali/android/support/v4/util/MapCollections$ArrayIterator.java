package android.support.v4.util; class MapCollections$ArrayIterator { void a() { int a;
a=0;// .class final Landroid/support/v4/util/MapCollections$ArrayIterator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapCollections.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/MapCollections;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "ArrayIterator"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Iterator",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mCanRemove:Z
a=0;// 
a=0;// .field mIndex:I
a=0;// 
a=0;// .field final mOffset:I
a=0;// 
a=0;// .field mSize:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/util/MapCollections;I)V
a=0;//     .locals 1
a=0;//     .param p2, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections$ArrayIterator;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
a=0;// 
a=0;//     .line 42
a=0;//     iput p2, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mOffset:I
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {p1}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
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
a=0;// .method public next()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v2, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mOffset:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "res":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
a=0;// 
a=0;//     .line 56
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ArrayIterator;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ArrayIterator<TT;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     .line 65
a=0;//     iget v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mSize:I
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mCanRemove:Z
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     iget v1, p0, Landroid/support/v4/util/MapCollections$ArrayIterator;->mIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
}}
