package edu.cmu.wnss.funktastic.superawesomecontacts; class FindActivity {/*

.class public Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;
.super Landroid/app/Activity;
.source "FindActivity.java"

# interfaces
.implements Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;


# static fields
.field public static final FIND_CONTACT_EXTRA_KEY:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"

.field public static final FIND_CONTACT_EXTRA_RESULTS:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"

.field public static final FIND_CONTACT_INTENT_TYPE:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter "savedInstanceState"

    .prologue
    .line 18
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    const v3, 0x7f030019

    #v3=(Integer);
    invoke-virtual {p0, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setContentView(I)V

    .line 20
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p0, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setFinishOnTouchOutside(Z)V

    .line 24
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 25
    .local v2, sourceIntent:Landroid/content/Intent;
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 26
    const-string v3, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 27
    .local v1, queryString:Ljava/lang/String;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 28
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v3, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;

    #v3=(UninitRef);
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-direct {v3, v4, p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;Ljava/lang/String;)V

    #v3=(Reference);
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 29
    .local v0, getContacts:Ljava/lang/Thread;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 32
    .end local v0           #getContacts:Ljava/lang/Thread;
    .end local v1           #queryString:Ljava/lang/String;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public setSearchResult(Ljava/lang/String;)V
    .locals 4
    .parameter "results"

    .prologue
    .line 36
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 37
    .local v0, resultIntent:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "SEARCH RESULTS\n"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-virtual {p0, v1, v0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->setResult(ILandroid/content/Intent;)V

    .line 39
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;->finish()V

    .line 40
    return-void
.end method

*/}
