package android.support.v4.util; class ArrayMap$1 { void a() { int a;
a=0;// .class Landroid/support/v4/util/ArrayMap$1;
a=0;// .super Landroid/support/v4/util/MapCollections;
a=0;// .source "ArrayMap.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/support/v4/util/MapCollections",
a=0;//         "<TK;TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/util/ArrayMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/MapCollections;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/ArrayMap$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected colClear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->clear()V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected colGetEntry(II)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     iget-object v0, v0, Landroid/support/v4/util/ArrayMap;->mArray:[Ljava/lang/Object;
a=0;// 
a=0;//     shl-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p2
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected colGetMap()Ljava/util/Map;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected colGetSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     iget v0, v0, Landroid/support/v4/util/ArrayMap;->mSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected colIndexOfKey(Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/ArrayMap;->indexOfNull()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/ArrayMap;->indexOf(Ljava/lang/Object;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected colIndexOfValue(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->indexOfValue(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected colPut(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected colRemoveAt(I)V
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/util/ArrayMap;->removeAt(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected colSetValue(ILjava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap$1;, "Landroid/support/v4/util/ArrayMap.1;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap$1;->this$0:Landroid/support/v4/util/ArrayMap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/ArrayMap;->setValueAt(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
