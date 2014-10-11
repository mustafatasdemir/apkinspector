package android.support.v4.util; class SparseArrayCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/util/SparseArrayCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SparseArrayCompat.java"
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
a=0;// .field private mKeys:[I
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
a=0;//     .line 24
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>(I)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "initialCapacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 46
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 47
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 48
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 54
a=0;//     :goto_0
a=0;//     iput v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 51
a=0;//     new-array v0, p1, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 52
a=0;//     new-array v0, p1, [Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private gc()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 142
a=0;//     .local v2, "n":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     .local v3, "o":I
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 144
a=0;//     .local v1, "keys":[I
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 146
a=0;//     .local v5, "values":[Ljava/lang/Object;
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     aget-object v4, v5, v0
a=0;// 
a=0;//     .line 149
a=0;//     .local v4, "val":Ljava/lang/Object;
a=0;//     #v4=(Null);
a=0;//     sget-object v6, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     aget v6, v1, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v1, v3
a=0;// 
a=0;//     .line 152
a=0;//     aput-object v4, v5, v3
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aput-object v6, v5, v0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     .end local v4    # "val":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput-boolean v6, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 161
a=0;//     iput v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 164
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public append(ILjava/lang/Object;)V
a=0;//     .locals 7
a=0;//     .param p1, "key"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TE;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 325
a=0;//     #v6=(Null);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     aget v4, v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt p1, v4, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 330
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_1
a=0;// 
a=0;//     .line 331
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     iget v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 335
a=0;//     .local v3, "pos":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     .line 336
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 338
a=0;//     .local v0, "n":I
a=0;//     #v0=(Integer);
a=0;//     new-array v1, v0, [I
a=0;// 
a=0;//     .line 339
a=0;//     .local v1, "nkeys":[I
a=0;//     #v1=(Reference,[I);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 342
a=0;//     .local v2, "nvalues":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 345
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 346
a=0;//     iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 349
a=0;//     .end local v0    # "n":I
a=0;//     .end local v1    # "nkeys":[I
a=0;//     .end local v2    # "nvalues":[Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aput p1, v4, v3
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v4, v3
a=0;// 
a=0;//     .line 351
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 309
a=0;//     #v4=(Null);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 310
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 312
a=0;//     .local v2, "values":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 312
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     .line 317
a=0;//     iput-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 318
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Landroid/support/v4/util/SparseArrayCompat;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Landroid/support/v4/util/SparseArrayCompat",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     .local v1, "clone":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
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
a=0;//     check-cast v0, Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     invoke-virtual {v2}, [I->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [I
a=0;// 
a=0;//     iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, [Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 65
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
a=0;//     .line 23
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->clone()Landroid/support/v4/util/SparseArrayCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/SparseArrayCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public delete(I)V
a=0;//     .locals 3
a=0;//     .param p1, "key"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 103
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(ILjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITE;)TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     .local p2, "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     .end local p2    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     .restart local p2    # "valueIfKeyNotFound":Ljava/lang/Object;, "TE;"
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object p2, v1, v0
a=0;// 
a=0;//     #p2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public indexOfKey(I)I
a=0;//     .locals 2
a=0;//     .param p1, "key"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
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
a=0;//     .line 294
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     .local p1, "value":Ljava/lang/Object;, "TE;"
a=0;//     iget-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 295
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     .end local v0    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 298
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 302
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public keyAt(I)I
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v0, v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(ILjava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "key"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TE;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v4, v0
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,[I);v5=(Integer);v6=(Null);v7=(Uninit);
a=0;//     xor-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 179
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v4, v4, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aput p1, v4, v0
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v4, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     xor-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_3
a=0;// 
a=0;//     .line 193
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [I
a=0;// 
a=0;//     .line 196
a=0;//     .local v2, "nkeys":[I
a=0;//     #v2=(Reference,[I);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 199
a=0;//     .local v3, "nvalues":[Ljava/lang/Object;
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 202
a=0;//     iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     .line 203
a=0;//     iput-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 206
a=0;//     .end local v1    # "n":I
a=0;//     .end local v2    # "nkeys":[I
a=0;//     .end local v3    # "nvalues":[Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v0
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     add-int/lit8 v6, v0, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, v0
a=0;// 
a=0;//     invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v6, v0, 0x1
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     sub-int/2addr v7, v0
a=0;// 
a=0;//     invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 212
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aput p1, v4, v0
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v4, v0
a=0;// 
a=0;//     .line 214
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove(I)V
a=0;//     .locals 0
a=0;//     .param p1, "key"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/SparseArrayCompat;->delete(I)V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAt(I)V
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v1, v0, p1
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAtRange(II)V
a=0;//     .locals 4
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v3, p1, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "end":I
a=0;//     #v0=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V
a=0;// 
a=0;//     .line 133
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
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
a=0;//     .line 263
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TE;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 264
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 267
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v0, p1
a=0;// 
a=0;//     .line 268
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_0
a=0;//     iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 363
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     .line 364
a=0;//     const-string v4, "{}"
a=0;// 
a=0;//     .line 384
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     mul-int/lit8 v4, v4, 0x1c
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 368
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v4, 0x7b
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 369
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_3
a=0;// 
a=0;//     .line 370
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 371
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 373
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 374
a=0;//     .local v2, "key":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 375
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 376
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 377
a=0;//     .local v3, "value":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v3, p0, :cond_2
a=0;// 
a=0;//     .line 378
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 369
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 380
a=0;//     :cond_2
a=0;//     #v4=(PosByte);
a=0;//     const-string v4, "(this Map)"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 383
a=0;//     .end local v2    # "key":I
a=0;//     .end local v3    # "value":Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     const/16 v4, 0x7d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 384
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
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
a=0;//     .line 250
a=0;//     .local p0, "this":Landroid/support/v4/util/SparseArrayCompat;, "Landroid/support/v4/util/SparseArrayCompat<TE;>;"
a=0;//     iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V
a=0;// 
a=0;//     .line 254
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
