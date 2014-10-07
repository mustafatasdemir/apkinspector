package android.support.v7.widget; class SearchView$AutoCompleteTextViewReflector {/*

.class Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;
.super Ljava/lang/Object;
.source "SearchView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AutoCompleteTextViewReflector"
.end annotation


# instance fields
.field private doAfterTextChanged:Ljava/lang/reflect/Method;

.field private doBeforeTextChanged:Ljava/lang/reflect/Method;

.field private ensureImeVisible:Ljava/lang/reflect/Method;

.field private showSoftInputUnchecked:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>()V
    .locals 5

    .prologue
    .line 1711
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1713
    :try_start_0
    #p0=(Reference);
    const-class v0, Landroid/widget/AutoCompleteTextView;

    #v0=(Reference);
    const-string v1, "doBeforeTextChanged"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;

    .line 1715
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3

    .line 1720
    :goto_0
    :try_start_1
    #v1=(Conflicted);v2=(Conflicted);
    const-class v0, Landroid/widget/AutoCompleteTextView;

    const-string v1, "doAfterTextChanged"

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;

    .line 1722
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2

    .line 1727
    :goto_1
    :try_start_2
    #v1=(Conflicted);v2=(Conflicted);
    const-class v0, Landroid/widget/AutoCompleteTextView;

    const-string v1, "ensureImeVisible"

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    #v4=(Reference);
    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;

    .line 1729
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1734
    :goto_2
    :try_start_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    const-string v1, "showSoftInputUnchecked"

    #v1=(Reference);
    const/4 v2, 0x2

    #v2=(PosByte);
    new-array v2, v2, [Ljava/lang/Class;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    #v4=(Reference);
    aput-object v4, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    const-class v4, Landroid/os/ResultReceiver;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;

    .line 1736
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0

    .line 1740
    :goto_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 1737
    :catch_0
    move-exception v0

    goto :goto_3

    .line 1730
    :catch_1
    move-exception v0

    goto :goto_2

    .line 1723
    :catch_2
    #v3=(Uninit);v4=(Uninit);
    move-exception v0

    goto :goto_1

    .line 1716
    :catch_3
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method doAfterTextChanged(Landroid/widget/AutoCompleteTextView;)V
    .locals 2
    .parameter "view"

    .prologue
    .line 1752
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1754
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1758
    :cond_0
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 1755
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method doBeforeTextChanged(Landroid/widget/AutoCompleteTextView;)V
    .locals 2
    .parameter "view"

    .prologue
    .line 1743
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1745
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    #v1=(Null);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1749
    :cond_0
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 1746
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V
    .locals 4
    .parameter "view"
    .parameter "visible"

    .prologue
    .line 1761
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1763
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    #v1=(One);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1767
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 1764
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method showSoftInputUnchecked(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;I)V
    .locals 4
    .parameter "imm"
    .parameter "view"
    .parameter "flags"

    .prologue
    .line 1770
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1772
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->showSoftInputUnchecked:Ljava/lang/reflect/Method;

    const/4 v1, 0x2

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v1, v2

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1780
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 1774
    :catch_0
    move-exception v0

    .line 1779
    :cond_0
    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    goto :goto_0
.end method

*/}
