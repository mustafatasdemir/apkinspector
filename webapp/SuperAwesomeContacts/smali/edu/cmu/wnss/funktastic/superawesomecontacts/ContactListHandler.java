package edu.cmu.wnss.funktastic.superawesomecontacts; class ContactListHandler { void a() { int a;
a=0;// .class public Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ContactListHandler.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/widget/TextView;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;);
a=0;//     iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;->mContext:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 22
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;->mContext:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
}}
