package android.support.v4.util; class SimpleArrayMap { void a() { int a;
a=0;// .class public Landroid/support/v4/util/SimpleArrayMap;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SimpleArrayMap.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BASE_SIZE:I = 0x4
a=0;// 
a=0;// .field private static final CACHE_SIZE:I = 0xa
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ArrayMap"
a=0;// 
a=0;// .field static mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;// .field static mBaseCacheSize:I
a=0;// 
a=0;// .field static mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;// .field static mTwiceBaseCacheSize:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mArray:[Ljava/lang/Object;
a=0;// 
a=0;// .field mHashes:[I
a=0;// 
a=0;// .field mSize:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 209
a=0;//     #p0=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 210
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;//     .param p1, "capacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 218
a=0;//     #p0=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 220
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 224
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 225
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/util/SimpleArrayMap;)V
a=0;//     .locals 0
a=0;//     .param p1, "map"    # Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     #p0=(Reference,Landroid/support/v4/util/SimpleArrayMap;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->putAll(Landroid/support/v4/util/SimpleArrayMap;)V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private allocArrays(I)V
a=0;//     .locals 5
a=0;//     .param p1, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 139
a=0;//     const-class v2, Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_0
a=0;//     sget-object v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     sget-object v0, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "array":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 143
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     sput-object v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 144
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     check-cast v1, [I
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 145
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v4, v0, v3
a=0;// 
a=0;//     aput-object v4, v0, v1
a=0;// 
a=0;//     .line 146
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     sput v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I
a=0;// 
a=0;//     .line 149
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 170
a=0;//     .end local v0    # "array":[Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,[Ljava/lang/Object;);v2=(Reference,Ljava/lang/Class;);v3=(Uninit);v4=(Uninit);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-array v1, p1, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 169
a=0;//     shl-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/Class;);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 152
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     const-class v2, Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 154
a=0;//     :try_start_2
a=0;//     sget-object v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 155
a=0;//     sget-object v0, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 156
a=0;//     .restart local v0    # "array":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 157
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     sput-object v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v1, v0, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     check-cast v1, [I
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v4, v0, v3
a=0;// 
a=0;//     aput-object v4, v0, v1
a=0;// 
a=0;//     .line 160
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     sput v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I
a=0;// 
a=0;//     .line 163
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     .end local v0    # "array":[Ljava/lang/Object;
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static freeArrays([I[Ljava/lang/Object;I)V
a=0;//     .locals 5
a=0;//     .param p0, "hashes"    # [I
a=0;//     .param p1, "array"    # [Ljava/lang/Object;
a=0;//     .param p2, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 173
a=0;//     #v4=(PosByte);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 174
a=0;//     const-class v2, Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 175
a=0;//     :try_start_0
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I
a=0;// 
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v3, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, p1, v1
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput-object p0, p1, v1
a=0;// 
a=0;//     .line 178
a=0;//     shl-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object v1, p1, v0
a=0;// 
a=0;//     .line 178
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     sput-object p1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 182
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     sput v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I
a=0;// 
a=0;//     .line 186
a=0;//     .end local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 202
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 186
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);v3=(PosByte);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 188
a=0;//     const-class v2, Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 189
a=0;//     :try_start_1
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I
a=0;// 
a=0;//     if-ge v1, v3, :cond_5
a=0;// 
a=0;//     .line 190
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v3, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, p1, v1
a=0;// 
a=0;//     .line 191
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput-object p0, p1, v1
a=0;// 
a=0;//     .line 192
a=0;//     shl-int/lit8 v1, p2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .restart local v0    # "i":I
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_4
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object v1, p1, v0
a=0;// 
a=0;//     .line 192
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 195
a=0;//     :cond_4
a=0;//     #v1=(Integer);
a=0;//     sput-object p1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 196
a=0;//     sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     sput v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I
a=0;// 
a=0;//     .line 200
a=0;//     .end local v0    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 243
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 244
a=0;//     sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 245
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public containsKey(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 273
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, p1, v2}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public containsValue(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->indexOfValue(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
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
a=0;// .method public ensureCapacity(I)V
a=0;//     .locals 5
a=0;//     .param p1, "minimumCapacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, p1, :cond_1
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 256
a=0;//     .local v1, "ohashes":[I
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 257
a=0;//     .local v0, "oarray":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V
a=0;// 
a=0;//     .line 258
a=0;//     iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     shl-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 262
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v0, v2}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 264
a=0;//     .end local v0    # "oarray":[Ljava/lang/Object;
a=0;//     .end local v1    # "ohashes":[I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 10
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 522
a=0;//     #v7=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     .line 551
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 525
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v8=(Uninit);v9=(Uninit);
a=0;//     instance-of v8, p1, Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 526
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/Map;
a=0;// 
a=0;//     .line 527
a=0;//     .local v3, "map":Ljava/util/Map;, "Ljava/util/Map<**>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v8, v9, :cond_2
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 528
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_2
a=0;//     #v6=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-ge v0, v8, :cond_0
a=0;// 
a=0;//     .line 533
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 534
a=0;//     .local v2, "key":Ljava/lang/Object;, "TK;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 535
a=0;//     .local v4, "mine":Ljava/lang/Object;, "TV;"
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 536
a=0;//     .local v5, "theirs":Ljava/lang/Object;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 537
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(Integer);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 538
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 540
a=0;//     :cond_4
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 541
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_5
a=0;//     #v6=(One);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 544
a=0;//     .end local v2    # "key":Ljava/lang/Object;, "TK;"
a=0;//     .end local v4    # "mine":Ljava/lang/Object;, "TV;"
a=0;//     .end local v5    # "theirs":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     .local v1, "ignored":Ljava/lang/NullPointerException;
a=0;//     #v1=(Reference,Ljava/lang/NullPointerException;);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 545
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 546
a=0;//     .end local v1    # "ignored":Ljava/lang/NullPointerException;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v6=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .local v1, "ignored":Ljava/lang/ClassCastException;
a=0;//     #v1=(Reference,Ljava/lang/ClassCastException;);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 547
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "ignored":Ljava/lang/ClassCastException;
a=0;//     .end local v3    # "map":Ljava/util/Map;, "Ljava/util/Map<**>;"
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v8=(Boolean);v9=(Uninit);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 551
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 314
a=0;//     .local v0, "index":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     aget-object v1, v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Null);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 313
a=0;//     .end local v0    # "index":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 314
a=0;//     .restart local v0    # "index":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 560
a=0;//     .local v1, "hashes":[I
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 561
a=0;//     .local v0, "array":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 562
a=0;//     .local v3, "result":I
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .local v5, "v":I
a=0;//     #v5=(One);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .local v4, "s":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     .line 563
a=0;//     aget-object v6, v0, v5
a=0;// 
a=0;//     .line 564
a=0;//     .local v6, "value":Ljava/lang/Object;
a=0;//     #v6=(Null);
a=0;//     aget v8, v1, v2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     xor-int/2addr v7, v8
a=0;// 
a=0;//     add-int/2addr v3, v7
a=0;// 
a=0;//     .line 562
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     add-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 564
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 566
a=0;//     .end local v6    # "value":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method indexOf(Ljava/lang/Object;I)I
a=0;//     .locals 6
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .param p2, "hash"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     invoke-static {v4, v0, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 72
a=0;//     .local v3, "index":I
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v5, v3, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     .local v1, "end":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aget v4, v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p2, :cond_3
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v5, v1, 0x1
a=0;// 
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 88
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v2, v3, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_5
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aget v4, v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p2, :cond_5
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v5, v2, 0x1
a=0;// 
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_4
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 96
a=0;//     :cond_5
a=0;//     #v4=(Integer);
a=0;//     xor-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method indexOfNull()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v0, v5}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 110
a=0;//     .local v3, "index":I
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v5, v3, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     add-int/lit8 v1, v3, 0x1
a=0;// 
a=0;//     .local v1, "end":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aget v4, v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v5, v1, 0x1
a=0;// 
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     move v3, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 126
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v2, v3, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_5
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     aget v4, v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v5, v2, 0x1
a=0;// 
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_4
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 134
a=0;//     :cond_5
a=0;//     #v4=(Integer);
a=0;//     xor-int/lit8 v3, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method indexOfValue(Ljava/lang/Object;)I
a=0;//     .locals 4
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v0, v3, 0x2
a=0;// 
a=0;//     .line 278
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "array":[Ljava/lang/Object;
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 280
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_3
a=0;// 
a=0;//     .line 281
a=0;//     aget-object v3, v1, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     shr-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     .line 292
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     return v3
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v3=(Null);
a=0;//     add-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     .end local v2    # "i":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .restart local v2    # "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_3
a=0;// 
a=0;//     .line 287
a=0;//     aget-object v3, v1, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 288
a=0;//     shr-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 286
a=0;//     :cond_2
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 292
a=0;//     :cond_3
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_0
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
a=0;// .method public keyAt(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TK;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 366
a=0;//     #v9=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 367
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 368
a=0;//     .local v0, "hash":I
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 373
a=0;//     .local v1, "index":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 374
a=0;//     shl-int/lit8 v6, v1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v1, v6, 0x1
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v5, v6, v1
a=0;// 
a=0;//     .line 376
a=0;//     .local v5, "old":Ljava/lang/Object;, "TV;"
a=0;//     #v5=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v6, v1
a=0;// 
a=0;//     .line 411
a=0;//     .end local v5    # "old":Ljava/lang/Object;, "TV;"
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 370
a=0;//     .end local v0    # "hash":I
a=0;//     .end local v1    # "index":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Null);v10=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 371
a=0;//     .restart local v0    # "hash":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .restart local v1    # "index":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 380
a=0;//     :cond_1
a=0;//     xor-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 381
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v7, v8, :cond_4
a=0;// 
a=0;//     .line 382
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-lt v7, v2, :cond_6
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     shr-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     add-int v2, v6, v7
a=0;// 
a=0;//     .line 387
a=0;//     .local v2, "n":I
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 388
a=0;//     .local v4, "ohashes":[I
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 389
a=0;//     .local v3, "oarray":[Ljava/lang/Object;
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     array-length v7, v4
a=0;// 
a=0;//     invoke-static {v4, v9, v6, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     array-length v7, v3
a=0;// 
a=0;//     invoke-static {v3, v9, v6, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v4, v3, v6}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 400
a=0;//     .end local v2    # "n":I
a=0;//     .end local v3    # "oarray":[Ljava/lang/Object;
a=0;//     .end local v4    # "ohashes":[I
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-ge v1, v6, :cond_5
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iget-object v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     add-int/lit8 v8, v1, 0x1
a=0;// 
a=0;//     iget v9, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-int/2addr v9, v1
a=0;// 
a=0;//     invoke-static {v6, v1, v7, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v7, v1, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     add-int/lit8 v9, v1, 0x1
a=0;// 
a=0;//     shl-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     iget v10, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v10, v1
a=0;// 
a=0;//     shl-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     invoke-static {v6, v7, v8, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 407
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     aput v0, v6, v1
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v7, v1, 0x1
a=0;// 
a=0;//     aput-object p1, v6, v7
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v7, v1, 0x1
a=0;// 
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     aput-object p2, v6, v7
a=0;// 
a=0;//     .line 410
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 411
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 382
a=0;//     :cond_6
a=0;//     #v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v8=(Integer);v9=(Null);v10=(Uninit);
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-ge v7, v6, :cond_2
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public putAll(Landroid/support/v4/util/SimpleArrayMap;)V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/util/SimpleArrayMap",
a=0;//             "<+TK;+TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     .local p1, "array":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<+TK;+TV;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 419
a=0;//     #v5=(Null);
a=0;//     iget v0, p1, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 420
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v0
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/util/SimpleArrayMap;->ensureCapacity(I)V
a=0;// 
a=0;//     .line 421
a=0;//     iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 422
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v2, p1, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-static {v2, v5, v3, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 424
a=0;//     iget-object v2, p1, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 425
a=0;//     iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 432
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 428
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 429
a=0;//     invoke-virtual {p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 428
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 441
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 442
a=0;//     .local v0, "index":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 443
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->removeAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 446
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 441
a=0;//     .end local v0    # "index":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 446
a=0;//     .restart local v0    # "index":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeAt(I)Ljava/lang/Object;
a=0;//     .locals 10
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 455
a=0;//     #v7=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     aget-object v3, v4, v5
a=0;// 
a=0;//     .line 456
a=0;//     .local v3, "old":Ljava/lang/Object;
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-gt v4, v5, :cond_1
a=0;// 
a=0;//     .line 459
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v4, v5, v6}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 460
a=0;//     sget-object v4, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 461
a=0;//     sget-object v4, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 462
a=0;//     iput v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 502
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 464
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v4=(Integer);v5=(One);v6=(Uninit);v7=(Null);v8=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v4, v0, :cond_4
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v5, v5, 0x3
a=0;// 
a=0;//     if-ge v4, v5, :cond_4
a=0;// 
a=0;//     .line 468
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-le v4, v0, :cond_2
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     shr-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     add-int v0, v4, v5
a=0;// 
a=0;//     .line 472
a=0;//     .local v0, "n":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     .line 473
a=0;//     .local v2, "ohashes":[I
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 474
a=0;//     .local v1, "oarray":[Ljava/lang/Object;
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V
a=0;// 
a=0;//     .line 476
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 477
a=0;//     if-lez p1, :cond_3
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     invoke-static {v2, v7, v4, v7, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     invoke-static {v1, v7, v4, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 482
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge p1, v4, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     add-int/lit8 v4, p1, 0x1
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, p1
a=0;// 
a=0;//     invoke-static {v2, v4, v5, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 486
a=0;//     add-int/lit8 v4, p1, 0x1
a=0;// 
a=0;//     shl-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v6, p1, 0x1
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, p1
a=0;// 
a=0;//     shl-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     invoke-static {v1, v4, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 490
a=0;//     .end local v0    # "n":I
a=0;//     .end local v1    # "oarray":[Ljava/lang/Object;
a=0;//     .end local v2    # "ohashes":[I
a=0;//     :cond_4
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v5=(Integer);v6=(Uninit);v7=(Null);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     .line 491
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     if-ge p1, v4, :cond_5
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     add-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, p1
a=0;// 
a=0;//     invoke-static {v4, v5, v6, p1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     shl-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v8, p1
a=0;// 
a=0;//     shl-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     invoke-static {v4, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 498
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     shl-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     aput-object v9, v4, v5
a=0;// 
a=0;//     .line 499
a=0;//     iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     shl-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     aput-object v9, v4, v5
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setValueAt(ILjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     shl-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 p1, v1, 0x1
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v1, p1
a=0;// 
a=0;//     .line 344
a=0;//     .local v0, "old":Ljava/lang/Object;, "TV;"
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object p2, v1, p1
a=0;// 
a=0;//     .line 345
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     const-string v4, "{}"
a=0;// 
a=0;//     .line 603
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 582
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/lit8 v4, v4, 0x1c
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 583
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v4, 0x7b
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 584
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_4
a=0;// 
a=0;//     .line 585
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 586
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 588
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 589
a=0;//     .local v2, "key":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v2, p0, :cond_2
a=0;// 
a=0;//     .line 590
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 594
a=0;//     :goto_2
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 595
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 596
a=0;//     .local v3, "value":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v3, p0, :cond_3
a=0;// 
a=0;//     .line 597
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 584
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 592
a=0;//     .end local v3    # "value":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v4, "(this Map)"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 599
a=0;//     .restart local v3    # "value":Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v3=(Reference,Ljava/lang/Object;);v4=(PosByte);
a=0;//     const-string v4, "(this Map)"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 602
a=0;//     .end local v2    # "key":Ljava/lang/Object;
a=0;//     .end local v3    # "value":Ljava/lang/Object;
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     const/16 v4, 0x7d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 603
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public valueAt(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     .local p0, "this":Landroid/support/v4/util/SimpleArrayMap;, "Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     shl-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
