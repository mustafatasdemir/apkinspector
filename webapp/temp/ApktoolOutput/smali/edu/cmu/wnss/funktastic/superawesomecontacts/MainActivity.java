package edu.cmu.wnss.funktastic.superawesomecontacts; class MainActivity {/*

.class public Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# instance fields
.field private final CONTACT_LIST_STATE_KEY:Ljava/lang/String;

.field private final FIND_CONTACT_REQ_ID:I

.field private mContactListTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 15
    #p0=(Reference);
    const-string v0, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"

    #v0=(Reference);
    iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->CONTACT_LIST_STATE_KEY:Ljava/lang/String;

    .line 17
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->FIND_CONTACT_REQ_ID:I

    return-void
.end method

.method static synthetic access$000(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Ljava/lang/String;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 14
    invoke-direct {p0, p1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->findContact(Ljava/lang/String;)V

    return-void
.end method

.method private findContact(Ljava/lang/String;)V
    .locals 2
    .parameter "queryString"

    .prologue
    .line 66
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-class v1, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;

    #v1=(Reference);
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 67
    .local v0, findIntent:Landroid/content/Intent;
    #v0=(Reference);
    const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, v0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 70
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .parameter "requestCode"
    .parameter "resultCode"
    .parameter "data"

    .prologue
    .line 44
    const/4 v0, 0x1

    #v0=(One);
    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    #v0=(Byte);
    if-ne p2, v0, :cond_0

    .line 45
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    #v0=(Reference);
    const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"

    #v1=(Reference);
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter "savedInstanceState"

    .prologue
    .line 22
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    const v1, 0x7f03001a

    #v1=(Integer);
    invoke-virtual {p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->setContentView(I)V

    .line 25
    const v1, 0x7f07003c

    invoke-virtual {p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    .line 27
    if-eqz p1, :cond_0

    .line 29
    iget-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"

    #v2=(Reference);
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 36
    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    new-instance v0, Ljava/lang/Thread;

    #v0=(UninitRef);
    new-instance v1, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;

    #v1=(UninitRef);
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    #v2=(Reference);
    new-instance v3, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;

    #v3=(UninitRef);
    iget-object v4, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    #v4=(Reference);
    invoke-direct {v3, v4}, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;-><init>(Landroid/widget/TextView;)V

    #v3=(Reference);
    invoke-direct {v1, v2, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .local v0, getContacts:Ljava/lang/Thread;
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .parameter "menu"

    .prologue
    .line 60
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    #v0=(Reference);
    const/high16 v1, 0x7f0c

    #v1=(Integer);
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 61
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 12
    .parameter "item"

    .prologue
    const/4 v8, 0x1

    .line 78
    #v8=(One);
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v7

    .line 79
    .local v7, id:I
    #v7=(Integer);
    const v9, 0x7f07003d

    #v9=(Integer);
    if-ne v7, v9, :cond_1

    .line 82
    new-instance v6, Ljava/lang/Thread;

    #v6=(UninitRef);
    new-instance v8, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;

    #v8=(UninitRef);
    invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    #v9=(Reference);
    new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;

    #v10=(UninitRef);
    iget-object v11, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    #v11=(Reference);
    invoke-direct {v10, v11}, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;-><init>(Landroid/widget/TextView;)V

    #v10=(Reference);
    invoke-direct {v8, v9, v10}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V

    #v8=(Reference);
    invoke-direct {v6, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 84
    .local v6, getContacts:Ljava/lang/Thread;
    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 152
    .end local v6           #getContacts:Ljava/lang/Thread;
    :cond_0
    #v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v8

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Boolean);
    return v8

    .line 86
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(One);v9=(Integer);v10=(Uninit);v11=(Uninit);
    const v9, 0x7f07003e

    if-ne v7, v9, :cond_2

    .line 90
    new-instance v2, Landroid/app/AlertDialog$Builder;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 92
    .local v2, alertDialogBuilder:Landroid/app/AlertDialog$Builder;
    #v2=(Reference);
    const-string v9, "Settings"

    #v9=(Reference);
    invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 93
    const-string v9, "This app is too awesome to have any settings."

    invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 94
    const-string v9, "OK"

    new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;

    #v10=(UninitRef);
    invoke-direct {v10, p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;)V

    #v10=(Reference);
    invoke-virtual {v2, v9, v10}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 101
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 102
    .local v1, alertDialog:Landroid/app/AlertDialog;
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 106
    .end local v1           #alertDialog:Landroid/app/AlertDialog;
    .end local v2           #alertDialogBuilder:Landroid/app/AlertDialog$Builder;
    :cond_2
    #v1=(Uninit);v2=(Uninit);v9=(Integer);v10=(Uninit);
    const v9, 0x7f07003f

    if-ne v7, v9, :cond_3

    .line 110
    new-instance v4, Landroid/app/AlertDialog$Builder;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 112
    .local v4, findDialogBuilder:Landroid/app/AlertDialog$Builder;
    #v4=(Reference);
    new-instance v5, Landroid/widget/EditText;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 113
    .local v5, findString:Landroid/widget/EditText;
    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 115
    const-string v9, "Find Contacts"

    #v9=(Reference);
    invoke-virtual {v4, v9}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 116
    const-string v9, "Enter contact to search:"

    invoke-virtual {v4, v9}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 117
    const-string v9, "Find"

    new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;

    #v10=(UninitRef);
    invoke-direct {v10, p0, v5}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Landroid/widget/EditText;)V

    #v10=(Reference);
    invoke-virtual {v4, v9, v10}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 124
    const-string v9, "Cancel"

    new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;

    #v10=(UninitRef);
    invoke-direct {v10, p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;)V

    #v10=(Reference);
    invoke-virtual {v4, v9, v10}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 131
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    .line 132
    .local v3, findDialog:Landroid/app/AlertDialog;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 136
    .end local v3           #findDialog:Landroid/app/AlertDialog;
    .end local v4           #findDialogBuilder:Landroid/app/AlertDialog$Builder;
    .end local v5           #findString:Landroid/widget/EditText;
    :cond_3
    #v3=(Uninit);v4=(Uninit);v5=(Uninit);v9=(Integer);v10=(Uninit);
    const v9, 0x7f070040

    if-ne v7, v9, :cond_0

    .line 139
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    const-class v9, Ledu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity;

    #v9=(Reference);
    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    .local v0, aboutIntent:Landroid/content/Intent;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .parameter "state"

    .prologue
    .line 51
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 54
    const-string v0, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"

    #v0=(Reference);
    iget-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    return-void
.end method

*/}
