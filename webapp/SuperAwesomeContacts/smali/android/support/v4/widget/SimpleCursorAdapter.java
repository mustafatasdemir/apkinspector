package android.support.v4.widget; class SimpleCursorAdapter { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SimpleCursorAdapter;
a=0;// .super Landroid/support/v4/widget/ResourceCursorAdapter;
a=0;// .source "SimpleCursorAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;,
a=0;//         Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;// .field protected mFrom:[I
a=0;// 
a=0;// .field mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;// .field private mStringConversionColumn:I
a=0;// 
a=0;// .field protected mTo:[I
a=0;// 
a=0;// .field private mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "layout"    # I
a=0;//     .param p3, "c"    # Landroid/database/Cursor;
a=0;//     .param p4, "from"    # [Ljava/lang/String;
a=0;//     .param p5, "to"    # [I
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/ResourceCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;)V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     .line 64
a=0;//     iput-object p5, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
a=0;// 
a=0;//     .line 65
a=0;//     iput-object p4, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-direct {p0, p4}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[II)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "layout"    # I
a=0;//     .param p3, "c"    # Landroid/database/Cursor;
a=0;//     .param p4, "from"    # [Ljava/lang/String;
a=0;//     .param p5, "to"    # [I
a=0;//     .param p6, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1, p2, p3, p6}, Landroid/support/v4/widget/ResourceCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     .line 90
a=0;//     iput-object p5, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
a=0;// 
a=0;//     .line 91
a=0;//     iput-object p4, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-direct {p0, p4}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private findColumns([Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "from"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 312
a=0;//     array-length v0, p1
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v0, :cond_1
a=0;// 
a=0;//     .line 314
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-array v2, v0, [I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     .line 316
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/Cursor;);
a=0;//     aget-object v4, p1, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aput v3, v2, v1
a=0;// 
a=0;//     .line 316
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 320
a=0;//     .end local v0    # "count":I
a=0;//     .end local v1    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     .line 322
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
a=0;//     .locals 11
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "binder":Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v2, v8
a=0;// 
a=0;//     .line 123
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mFrom:[I
a=0;// 
a=0;//     .line 124
a=0;//     .local v3, "from":[I
a=0;//     #v3=(Reference,[I);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
a=0;// 
a=0;//     .line 126
a=0;//     .local v6, "to":[I
a=0;//     #v6=(Reference,[I);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Integer);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v4, v2, :cond_5
a=0;// 
a=0;//     .line 127
a=0;//     aget v8, v6, v4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 128
a=0;//     .local v7, "v":Landroid/view/View;
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 129
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "bound":Z
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     aget v8, v3, v4
a=0;// 
a=0;//     invoke-interface {v0, v7, p3, v8}, Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;->setViewValue(Landroid/view/View;Landroid/database/Cursor;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 135
a=0;//     aget v8, v3, v4
a=0;// 
a=0;//     invoke-interface {p3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 136
a=0;//     .local v5, "text":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     const-string v5, ""
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     instance-of v8, v7, Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 141
a=0;//     check-cast v7, Landroid/widget/TextView;
a=0;// 
a=0;//     .end local v7    # "v":Landroid/view/View;
a=0;//     invoke-virtual {p0, v7, v5}, Landroid/support/v4/widget/SimpleCursorAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     .end local v1    # "bound":Z
a=0;//     .end local v5    # "text":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     .restart local v1    # "bound":Z
a=0;//     .restart local v5    # "text":Ljava/lang/String;
a=0;//     .restart local v7    # "v":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v5=(Reference,Ljava/lang/String;);v8=(Boolean);
a=0;//     instance-of v8, v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 143
a=0;//     check-cast v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     .end local v7    # "v":Landroid/view/View;
a=0;//     invoke-virtual {p0, v7, v5}, Landroid/support/v4/widget/SimpleCursorAdapter;->setViewImage(Landroid/widget/ImageView;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     .restart local v7    # "v":Landroid/view/View;
a=0;//     :cond_4
a=0;//     new-instance v8, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, " is not a "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, " view that can be bounds by this SimpleCursorAdapter"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 151
a=0;//     .end local v1    # "bound":Z
a=0;//     .end local v5    # "text":Ljava/lang/String;
a=0;//     .end local v7    # "v":Landroid/view/View;
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Uninit);v10=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public changeCursorAndColumns(Landroid/database/Cursor;[Ljava/lang/String;[I)V
a=0;//     .locals 1
a=0;//     .param p1, "c"    # Landroid/database/Cursor;
a=0;//     .param p2, "from"    # [Ljava/lang/String;
a=0;//     .param p3, "to"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     iput-object p2, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;//     .line 345
a=0;//     iput-object p3, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mTo:[I
a=0;// 
a=0;//     .line 346
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 300
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 297
a=0;//     iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 300
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCursorToStringConverter()Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStringConversionColumn()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     iget v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewBinder()Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setCursorToStringConverter(Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;)V
a=0;//     .locals 0
a=0;//     .param p1, "cursorToStringConverter"    # Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mCursorToStringConverter:Landroid/support/v4/widget/SimpleCursorAdapter$CursorToStringConverter;
a=0;// 
a=0;//     .line 279
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStringConversionColumn(I)V
a=0;//     .locals 0
a=0;//     .param p1, "stringConversionColumn"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     iput p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mStringConversionColumn:I
a=0;// 
a=0;//     .line 247
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setViewBinder(Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;)V
a=0;//     .locals 0
a=0;//     .param p1, "viewBinder"    # Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mViewBinder:Landroid/support/v4/widget/SimpleCursorAdapter$ViewBinder;
a=0;// 
a=0;//     .line 176
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setViewImage(Landroid/widget/ImageView;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/widget/ImageView;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 199
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 196
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "nfe":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setViewText(Landroid/widget/TextView;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "v"    # Landroid/widget/TextView;
a=0;//     .param p2, "text"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
a=0;//     .locals 2
a=0;//     .param p1, "c"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 328
a=0;//     .local v0, "res":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SimpleCursorAdapter;->mOriginalFrom:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/SimpleCursorAdapter;->findColumns([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 329
a=0;//     return-object v0
a=0;// .end method
}}
