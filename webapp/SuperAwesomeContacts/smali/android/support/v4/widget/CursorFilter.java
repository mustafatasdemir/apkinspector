package android.support.v4.widget; class CursorFilter { void a() { int a;
a=0;// .class Landroid/support/v4/widget/CursorFilter;
a=0;// .super Landroid/widget/Filter;
a=0;// .source "CursorFilter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/widget/CursorFilter$CursorFilterClient;)V
a=0;//     .locals 0
a=0;//     .param p1, "client"    # Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Landroid/widget/Filter;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorFilter;);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;//     .param p1, "resultValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorFilter$CursorFilterClient;);
a=0;//     check-cast p1, Landroid/database/Cursor;
a=0;// 
a=0;//     .end local p1    # "resultValue":Ljava/lang/Object;
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
a=0;//     .locals 3
a=0;//     .param p1, "constraint"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/CursorFilter$CursorFilterClient;);
a=0;//     invoke-interface {v2, p1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->runQueryOnBackgroundThread(Ljava/lang/CharSequence;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     new-instance v1, Landroid/widget/Filter$FilterResults;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/Filter$FilterResults;);
a=0;//     invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     .local v1, "results":Landroid/widget/Filter$FilterResults;
a=0;//     #v1=(Reference,Landroid/widget/Filter$FilterResults;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I
a=0;// 
a=0;//     .line 55
a=0;//     iput-object v0, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/support/v4/widget/CursorFilter$CursorFilterClient;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     iput-object v2, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
a=0;//     .locals 3
a=0;//     .param p1, "constraint"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "results"    # Landroid/widget/Filter$FilterResults;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/CursorFilter$CursorFilterClient;);
a=0;//     invoke-interface {v1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "oldCursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
a=0;// 
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorFilter;->mClient:Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/CursorFilter$CursorFilterClient;);
a=0;//     iget-object v1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v2, v1}, Landroid/support/v4/widget/CursorFilter$CursorFilterClient;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
