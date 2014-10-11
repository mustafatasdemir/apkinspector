package android.support.v4.util; class ContainerHelpers { void a() { int a;
a=0;// .class Landroid/support/v4/util/ContainerHelpers;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ContainerHelpers.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final EMPTY_INTS:[I
a=0;// 
a=0;// .field static final EMPTY_LONGS:[J
a=0;// 
a=0;// .field static final EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 20
a=0;//     #v1=(Null);
a=0;//     new-array v0, v1, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     sput-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I
a=0;// 
a=0;//     .line 21
a=0;//     new-array v0, v1, [J
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_LONGS:[J
a=0;// 
a=0;//     .line 22
a=0;//     new-array v0, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/ContainerHelpers;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static binarySearch([III)I
a=0;//     .locals 5
a=0;//     .param p0, "array"    # [I
a=0;//     .param p1, "size"    # I
a=0;//     .param p2, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     .local v1, "lo":I
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "hi":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-gt v1, v0, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     ushr-int/lit8 v2, v4, 0x1
a=0;// 
a=0;//     .line 51
a=0;//     .local v2, "mid":I
a=0;//     #v2=(Integer);
a=0;//     aget v3, p0, v2
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "midVal":I
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, p2, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     if-le v3, p2, :cond_2
a=0;// 
a=0;//     .line 56
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     .end local v2    # "mid":I
a=0;//     .end local v3    # "midVal":I
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     xor-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method static binarySearch([JIJ)I
a=0;//     .locals 6
a=0;//     .param p0, "array"    # [J
a=0;//     .param p1, "size"    # I
a=0;//     .param p2, "value"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "lo":I
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, p1, -0x1
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "hi":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-gt v1, v0, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     add-int v5, v1, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     ushr-int/lit8 v2, v5, 0x1
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "mid":I
a=0;//     #v2=(Integer);
a=0;//     aget-wide v3, p0, v2
a=0;// 
a=0;//     .line 72
a=0;//     .local v3, "midVal":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v5, v3, p2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gez v5, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     cmp-long v5, v3, p2
a=0;// 
a=0;//     if-lez v5, :cond_2
a=0;// 
a=0;//     .line 75
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     .end local v2    # "mid":I
a=0;//     .end local v3    # "midVal":J
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     xor-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "a"    # Ljava/lang/Object;
a=0;//     .param p1, "b"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     if-eq p0, p1, :cond_0
a=0;// 
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static idealByteArraySize(I)I
a=0;//     .locals 3
a=0;//     .param p0, "need"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 33
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     shl-int v1, v2, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0xc
a=0;// 
a=0;//     if-gt p0, v1, :cond_1
a=0;// 
a=0;//     .line 35
a=0;//     shl-int v1, v2, v0
a=0;// 
a=0;//     add-int/lit8 p0, v1, -0xc
a=0;// 
a=0;//     .line 37
a=0;//     .end local p0    # "need":I
a=0;//     :cond_0
a=0;//     return p0
a=0;// 
a=0;//     .line 33
a=0;//     .restart local p0    # "need":I
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static idealIntArraySize(I)I
a=0;//     .locals 1
a=0;//     .param p0, "need"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     mul-int/lit8 v0, p0, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/support/v4/util/ContainerHelpers;->idealByteArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static idealLongArraySize(I)I
a=0;//     .locals 1
a=0;//     .param p0, "need"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     mul-int/lit8 v0, p0, 0x8
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Landroid/support/v4/util/ContainerHelpers;->idealByteArraySize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
