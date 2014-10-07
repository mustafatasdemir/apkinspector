package android.support.v7.widget; class SearchView$3 {/*

.class Landroid/support/v7/widget/SearchView$3;
.super Ljava/lang/Object;
.source "SearchView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/widget/SearchView;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter

    .prologue
    .line 169
    iput-object p1, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;

    invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/SuggestionsAdapter;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$3;->this$0:Landroid/support/v7/widget/SearchView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/widget/SearchView;->access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/CursorAdapter;->changeCursor(Landroid/database/Cursor;)V

    .line 174
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

*/}
