package android.support.v7.widget; class SearchView$AutoCompleteTextViewReflector { void a() { int a;
a=0;// .class Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/widget/SearchView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "AutoCompleteTextViewReflector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private doAfterTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private doBeforeTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private ensureImeVisible:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private showSoftInputUnchecked:Ljava/lang/reflect/Method;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1711
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1713
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;);
a=0;//     const-class v0, Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "doBeforeTextChanged"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 1715
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     .line 1720
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-class v0, Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     const-string v1, "doAfterTextChanged"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 1722
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     .line 1727
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-class v0, Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     const-string v1, "ensureImeVisible"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 1729
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 1734
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-class v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     const-string v1, "showSoftInputUnchecked"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-class v4, Landroid/os/ResultReceiver;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 1736
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 1740
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1737
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1730
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1723
a=0;//     :catch_2
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1716
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method doAfterTextChanged(Landroid/widget/AutoCompleteTextView;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1752
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1754
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1758
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1755
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method doBeforeTextChanged(Landroid/widget/AutoCompleteTextView;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/widget/AutoCompleteTextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1743
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1745
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1749
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1746
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V
a=0;//     .locals 4
a=0;//     .param p1, "view"    # Landroid/widget/AutoCompleteTextView;
a=0;//     .param p2, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1761
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1763
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1767
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1764
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method showSoftInputUnchecked(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;I)V
a=0;//     .locals 4
a=0;//     .param p1, "imm"    # Landroid/view/inputmethod/InputMethodManager;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1770
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1772
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1780
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1774
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1779
a=0;//     :cond_0
a=0;//     invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
