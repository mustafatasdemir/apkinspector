package android.support.v7.widget; class SearchView$3 { void a() { int a;
a=0;// .class Landroid/support/v7/widget/SearchView$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/widget/SearchView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/SearchView$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Landroid/support/v7/widget/SuggestionsAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/CursorAdapter;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
