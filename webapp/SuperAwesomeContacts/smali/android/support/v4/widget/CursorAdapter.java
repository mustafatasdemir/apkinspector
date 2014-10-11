package android.support.v4.widget; class CursorAdapter { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/widget/CursorAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "CursorAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/widget/CursorFilter$CursorFilterClient;
a=0;// .implements Landroid/widget/Filterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/CursorAdapter$1;,
a=0;//         Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;,
a=0;//         Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FLAG_AUTO_REQUERY:I = 0x1
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public static final FLAG_REGISTER_CONTENT_OBSERVER:I = 0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mAutoRequery:Z
a=0;// 
a=0;// .field protected mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;// .field protected mContext:Landroid/content/Context;
a=0;// 
a=0;// .field protected mCursor:Landroid/database/Cursor;
a=0;// 
a=0;// .field protected mCursorFilter:Landroid/support/v4/widget/CursorFilter;
a=0;// 
a=0;// .field protected mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field protected mDataValid:Z
a=0;// 
a=0;// .field protected mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;// .field protected mRowIDColumn:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "c"    # Landroid/database/Cursor;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/widget/CursorAdapter;->init(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "c"    # Landroid/database/Cursor;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/CursorAdapter;->init(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "c"    # Landroid/database/Cursor;
a=0;//     .param p3, "autoRequery"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 138
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/widget/CursorAdapter;->init(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
a=0;// .end method
a=0;// 
a=0;// .method public changeCursor(Landroid/database/Cursor;)V
a=0;//     .locals 1
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 315
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/CursorAdapter;->swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 316
a=0;//     .local v0, "old":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 319
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCursor()Landroid/database/Cursor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 265
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-virtual {p0, v1, v2, p3}, Landroid/support/v4/widget/CursorAdapter;->newDropDownView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 270
a=0;//     .local v0, "v":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/CursorAdapter;->bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 273
a=0;//     .end local v0    # "v":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/database/Cursor;);v2=(Uninit);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .restart local v0    # "v":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     .end local v0    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getFilter()Landroid/widget/Filter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorFilter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     new-instance v0, Landroid/support/v4/widget/CursorFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/CursorFilter;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/CursorFilter;-><init>(Landroid/support/v4/widget/CursorFilter$CursorFilterClient;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorFilter;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
a=0;// 
a=0;//     .line 407
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursorFilter:Landroid/support/v4/widget/CursorFilter;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFilterQueryProvider()Landroid/widget/FilterQueryProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FilterQueryProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 224
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "this should only be called when the cursor is valid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "couldn\'t move cursor to position "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 251
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-virtual {p0, v1, v2, p3}, Landroid/support/v4/widget/CursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 256
a=0;//     .local v0, "v":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/CursorAdapter;->bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 257
a=0;//     return-object v0
a=0;// 
a=0;//     .line 254
a=0;//     .end local v0    # "v":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .restart local v0    # "v":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasStableIds()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method init(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "c"    # Landroid/database/Cursor;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 164
a=0;//     #v0=(One);
a=0;//     and-int/lit8 v2, p3, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     or-int/lit8 p3, p3, 0x2
a=0;// 
a=0;//     .line 166
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
a=0;// 
a=0;//     .line 170
a=0;//     :goto_0
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "cursorPresent":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iput-object p2, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 172
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 173
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 174
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v1, "_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
a=0;// 
a=0;//     .line 175
a=0;//     and-int/lit8 v1, p3, 0x2
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_5
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v1, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/CursorAdapter$ChangeObserver;);
a=0;//     invoke-direct {v1, p0}, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;-><init>(Landroid/support/v4/widget/CursorAdapter;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/CursorAdapter$ChangeObserver;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v1, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;);
a=0;//     invoke-direct {v1, p0, v3}, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;-><init>(Landroid/support/v4/widget/CursorAdapter;Landroid/support/v4/widget/CursorAdapter$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 183
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/CursorAdapter$ChangeObserver;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     invoke-interface {p2, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-interface {p2, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 168
a=0;//     .end local v0    # "cursorPresent":Z
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);v2=(Integer);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 170
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 174
a=0;//     .restart local v0    # "cursorPresent":Z
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 179
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     .line 180
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method protected init(Landroid/content/Context;Landroid/database/Cursor;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "c"    # Landroid/database/Cursor;
a=0;//     .param p3, "autoRequery"    # Z
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/widget/CursorAdapter;->init(Landroid/content/Context;Landroid/database/Cursor;I)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public newDropDownView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/widget/CursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method protected onContentChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mAutoRequery:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->requery()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 451
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public runQueryOnBackgroundThread(Ljava/lang/CharSequence;)Landroid/database/Cursor;
a=0;//     .locals 1
a=0;//     .param p1, "constraint"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FilterQueryProvider;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/FilterQueryProvider;->runQuery(Ljava/lang/CharSequence;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 400
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setFilterQueryProvider(Landroid/widget/FilterQueryProvider;)V
a=0;//     .locals 0
a=0;//     .param p1, "filterQueryProvider"    # Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mFilterQueryProvider:Landroid/widget/FilterQueryProvider;
a=0;// 
a=0;//     .line 437
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public swapCursor(Landroid/database/Cursor;)Landroid/database/Cursor;
a=0;//     .locals 2
a=0;//     .param p1, "newCursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 333
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 354
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/database/Cursor;);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 336
a=0;//     .local v0, "oldCursor":Landroid/database/Cursor;
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V
a=0;// 
a=0;//     .line 338
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 340
a=0;//     :cond_2
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 341
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
a=0;// 
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V
a=0;// 
a=0;//     .line 343
a=0;//     :cond_3
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataSetObserver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 344
a=0;//     :cond_4
a=0;//     const-string v1, "_id"
a=0;// 
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 347
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_5
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, p0, Landroid/support/v4/widget/CursorAdapter;->mRowIDColumn:I
a=0;// 
a=0;//     .line 350
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetInvalidated()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
