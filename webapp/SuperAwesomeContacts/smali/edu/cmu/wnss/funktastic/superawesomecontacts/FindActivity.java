package edu.cmu.wnss.funktastic.superawesomecontacts; class FindActivity { void a() { int a;
a=0;// .class public Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "FindActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FIND_CONTACT_EXTRA_KEY:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"
a=0;// 
a=0;// .field public static final FIND_CONTACT_EXTRA_RESULTS:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"
a=0;// 
a=0;// .field public static final FIND_CONTACT_INTENT_TYPE:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 8
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 19
a=0;//     const v3, 0x7f030019
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setFinishOnTouchOutside(Z)V
a=0;// 
a=0;//     .line 24
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 25
a=0;//     .local v2, "sourceIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     const-string v3, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 27
a=0;//     .local v1, "queryString":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;
a=0;// 
a=0;//     #v3=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "getContacts":Ljava/lang/Thread;
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 32
a=0;//     .end local v0    # "getContacts":Ljava/lang/Thread;
a=0;//     .end local v1    # "queryString":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSearchResult(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "results"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "resultIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SEARCH RESULTS\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->finish()V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
}}
