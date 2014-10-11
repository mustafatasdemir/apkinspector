package android.support.v4.util; class CircularArray { void a() { int a;
a=0;// .class public Landroid/support/v4/util/CircularArray;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CircularArray.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<E:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCapacityBitmask:I
a=0;// 
a=0;// .field private mElements:[Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mHead:I
a=0;// 
a=0;// .field private mTail:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/util/CircularArray;-><init>(I)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Landroid/support/v4/util/CircularArray;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 3
a=0;//     .param p1, "minCapacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Landroid/support/v4/util/CircularArray;);
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "capacity must be positive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(One);
a=0;//     move v0, p1
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "arrayCapacity":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 63
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     shl-int v0, v2, v1
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     add-int/lit8 v1, v0, -0x1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     .line 66
a=0;//     new-array v1, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doubleCapacity()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 28
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v4
a=0;// 
a=0;//     .line 29
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v3, v1, v4
a=0;// 
a=0;//     .line 30
a=0;//     .local v3, "r":I
a=0;//     #v3=(Integer);
a=0;//     shl-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 31
a=0;//     .local v2, "newCapacity":I
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v4, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v5, "Too big"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v4=(Integer);v5=(Uninit);
a=0;//     new-array v0, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "a":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5, v0, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     invoke-static {v4, v6, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 37
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .end local v0    # "a":[Ljava/lang/Object;
a=0;//     iput-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 38
a=0;//     iput v6, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     .line 39
a=0;//     iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     .line 40
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final addFirst(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     .line 72
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final addLast(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     .line 79
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     .line 80
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final get(I)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "i"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/CircularArray;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p1, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int v0, v1, v2
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final getFirst()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getLast()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final isEmpty()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public final popFirst()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 89
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     .line 90
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final popLast()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     and-int v1, v2, v3
a=0;// 
a=0;//     .line 96
a=0;//     .local v1, "t":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 97
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     .line 98
a=0;//     iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     .line 99
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final size()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     .local p0, "this":Landroid/support/v4/util/CircularArray;, "Landroid/support/v4/util/CircularArray<TE;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
