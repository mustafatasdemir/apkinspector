package android.support.v4.util; class LongSparseArray { void a() { int a;
a=0;// .class public Landroid/support/v4/util/LongSparseArray;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LongSparseArray.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<E:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Cloneable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DELETED:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mGarbage:Z
a=0;// 
a=0;// .field private mKeys:[J
a=0;// 
a=0;// .field private mSize:I
a=0;// 
a=0;// .field private mValues:[Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/util/LongSparseArray;-><init>(I)V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Landroid/support/v4/util/LongSparseArray;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "initialCapacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Landroid/support/v4/util/LongSparseArray;);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     .line 66
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_LONGS:[J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 74
a=0;//     :goto_0
a=0;//     iput v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 71
a=0;//     new-array v0, p1, [J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 72
a=0;//     new-array v0, p1, [Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private gc()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "n":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     .local v3, "o":I
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 151
a=0;//     .local v1, "keys":[J
a=0;//     #v1=(Reference,[J);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 153
a=0;//     .local v5, "values":[Ljava/lang/Object;
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 154
a=0;//     aget-object v4, v5, v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v4, "val":Ljava/lang/Object;
a=0;//     #v4=(Null);
a=0;//     sget-object v6, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     .line 157
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     aget-wide v6, v1, v0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     aput-wide v6, v1, v3
a=0;// 
a=0;//     .line 159
a=0;//     aput-object v4, v5, v3
a=0;// 
a=0;//     .line 160
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v6, v5, v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v6=(Reference,Ljava/lang/Object;);v7=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     .end local v4    # "val":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput-boolean v6, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     .line 168
a=0;//     iput v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public append(JLjava/lang/Object;)V
a=0;//     .locals 7
a=0;//     .param p1, "key"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(JTE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     .local p3, "value":Ljava/lang/Object;, "TE;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 330
a=0;//     #v6=(Null);
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     aget-wide v4, v4, v5
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, p1, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     .line 331
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
a=0;// 
a=0;//     .line 357
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_1
a=0;// 
a=0;//     .line 336
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 340
a=0;//     .local v3, "pos":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     .line 341
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 343
a=0;//     .local v0, "n":I
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [J
a=0;// 
a=0;//     .line 344
a=0;//     .local v1, "nkeys":[J
a=0;//     #v1=(Reference,[J);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 347
a=0;//     .local v2, "nvalues":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 350
a=0;//     iput-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 351
a=0;//     iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 354
a=0;//     .end local v0    # "n":I
a=0;//     .end local v1    # "nkeys":[J
a=0;//     .end local v2    # "nvalues":[Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     aput-wide p1, v4, v3
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p3, v4, v3
a=0;// 
a=0;//     .line 356
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 314
a=0;//     #v4=(Null);
a=0;//     iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 315
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 317
a=0;//     .local v2, "values":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 317
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     .line 322
a=0;//     iput-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     .line 323
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Landroid/support/v4/util/LongSparseArray;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Landroid/support/v4/util/LongSparseArray",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "clone":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/util/LongSparseArray;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 83
a=0;//     #v1=(Reference,Landroid/support/v4/util/LongSparseArray;);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     invoke-virtual {v2}, [J->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [J
a=0;// 
a=0;//     iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->clone()Landroid/support/v4/util/LongSparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/LongSparseArray;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public delete(J)V
a=0;//     .locals 3
a=0;//     .param p1, "key"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 120
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(J)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(JLjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(JTE;)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     .local p3, "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     .end local p3    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object p3
a=0;// 
a=0;//     .restart local p3    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object p3, v1, v0
a=0;// 
a=0;//     #p3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public indexOfKey(J)I
a=0;//     .locals 2
a=0;//     .param p1, "key"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public indexOfValue(Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     .local p1, "value":Ljava/lang/Object;, "TE;"
a=0;//     iget-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 300
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 307
a=0;//     .end local v0    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 303
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public keyAt(I)J
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     aget-wide v0, v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public put(JLjava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "key"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(JTE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     .local p3, "value":Ljava/lang/Object;, "TE;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p3, v4, v0
a=0;// 
a=0;//     .line 223
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,[J);v5=(Integer);v6=(Null);v7=(Uninit);
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 186
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v4, v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     aput-wide p1, v4, v0
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p3, v4, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_2
a=0;// 
a=0;//     .line 193
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     xor-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     .line 199
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_3
a=0;// 
a=0;//     .line 200
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 202
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [J
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "nkeys":[J
a=0;//     #v2=(Reference,[J);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 206
a=0;//     .local v3, "nvalues":[Ljava/lang/Object;
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 209
a=0;//     iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     .line 210
a=0;//     iput-object v3, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 213
a=0;//     .end local v1    # "n":I
a=0;//     .end local v2    # "nkeys":[J
a=0;//     .end local v3    # "nvalues":[Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     add-int/lit8 v6, v0, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, v0
a=0;// 
a=0;//     invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v6, v0, 0x1
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     sub-int/2addr v7, v0
a=0;// 
a=0;//     invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 219
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     aput-wide p1, v4, v0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p3, v4, v0
a=0;// 
a=0;//     .line 221
a=0;//     iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove(J)V
a=0;//     .locals 0
a=0;//     .param p1, "key"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->delete(J)V
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v1, v0, p1
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setValueAt(ILjava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TE;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 271
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v0, p1
a=0;// 
a=0;//     .line 275
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gtz v5, :cond_0
a=0;// 
a=0;//     .line 369
a=0;//     const-string v5, "{}"
a=0;// 
a=0;//     .line 389
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 372
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     mul-int/lit8 v5, v5, 0x1c
a=0;// 
a=0;//     invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 373
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0x7b
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 374
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v1, v5, :cond_3
a=0;// 
a=0;//     .line 375
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 376
a=0;//     const-string v5, ", "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 378
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 379
a=0;//     .local v2, "key":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 380
a=0;//     const/16 v5, 0x3d
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 381
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 382
a=0;//     .local v4, "value":Ljava/lang/Object;
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v4, p0, :cond_2
a=0;// 
a=0;//     .line 383
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 374
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 385
a=0;//     :cond_2
a=0;//     #v5=(PosByte);
a=0;//     const-string v5, "(this Map)"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 388
a=0;//     .end local v2    # "key":J
a=0;//     .end local v4    # "value":Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     const/16 v5, 0x7d
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 389
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public valueAt(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     .local p0, "this":Landroid/support/v4/util/LongSparseArray;, "Landroid/support/v4/util/LongSparseArray<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 258
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V
a=0;// 
a=0;//     .line 261
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
