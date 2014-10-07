package edu.cmu.wnss.funktastic.superawesomecontacts; class MainActivity$2 {/*

.class Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;

.field final synthetic val$findString:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Landroid/widget/EditText;)V
    .locals 0
    .parameter "this$0"
    .parameter

    .prologue
    .line 117
    iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;->this$0:Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;

    iput-object p2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;->val$findString:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .parameter "dialog"
    .parameter "id"

    .prologue
    .line 120
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;->this$0:Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;

    #v0=(Reference);
    iget-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;->val$findString:Landroid/widget/EditText;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->access$000(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Ljava/lang/String;)V

    .line 121
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 122
    return-void
.end method

*/}
