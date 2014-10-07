package edu.cmu.wnss.funktastic.superawesomecontacts; class ContactListHandler {/*

.class public Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;
.super Landroid/os/Handler;
.source "ContactListHandler.java"


# instance fields
.field private mContext:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 16
    #p0=(Reference);
    iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;->mContext:Landroid/widget/TextView;

    .line 17
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter "msg"

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 22
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;->mContext:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    return-void
.end method

*/}
