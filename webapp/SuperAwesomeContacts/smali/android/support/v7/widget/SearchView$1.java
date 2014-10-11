package android.support.v7.widget; class SearchView$1 { void a() { int a;
a=0;// .class Landroid/support/v7/widget/SearchView$1;
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
a=0;//     .line 152
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/SearchView$1;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/SearchView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/SearchView$1;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "input_method"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 157
a=0;//     .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     sget-object v1, Landroid/support/v7/widget/SearchView;->HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/widget/SearchView$1;->this$0:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;I)V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
