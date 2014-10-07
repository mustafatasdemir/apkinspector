package android.support.v7.internal.widget; class ActionBarContextView$1 {/*

.class Landroid/support/v7/internal/widget/ActionBarContextView$1;
.super Ljava/lang/Object;
.source "ActionBarContextView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/ActionBarContextView;->initForMode(Landroid/support/v7/view/ActionMode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ActionBarContextView;

.field final synthetic val$mode:Landroid/support/v7/view/ActionMode;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ActionBarContextView;Landroid/support/v7/view/ActionMode;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 203
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView$1;->this$0:Landroid/support/v7/internal/widget/ActionBarContextView;

    iput-object p2, p0, Landroid/support/v7/internal/widget/ActionBarContextView$1;->val$mode:Landroid/support/v7/view/ActionMode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter "v"

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView$1;->val$mode:Landroid/support/v7/view/ActionMode;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/view/ActionMode;->finish()V

    .line 206
    return-void
.end method

*/}
