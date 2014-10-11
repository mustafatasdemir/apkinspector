package edu.cmu.wnss.funktastic.superawesomecontacts; class MainActivity { void a() { int a;
a=0;// .class public Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "MainActivity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final CONTACT_LIST_STATE_KEY:Ljava/lang/String;
a=0;// 
a=0;// .field private final FIND_CONTACT_REQ_ID:I
a=0;// 
a=0;// .field private mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;);
a=0;//     const-string v0, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->CONTACT_LIST_STATE_KEY:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->FIND_CONTACT_REQ_ID:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;
a=0;//     .param p1, "x1"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0, p1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->findContact(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private findContact(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "queryString"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "findIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.intent.type"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 68
a=0;//     const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.findQueryString"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 2
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v1, "edu.cmu.wnss.funktastic.superawesomecontacts.findcontact.queryResults"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 23
a=0;//     const v1, 0x7f03001a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 25
a=0;//     const v1, 0x7f07003c
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 27
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;
a=0;// 
a=0;//     #v1=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ContentResolver;);
a=0;//     new-instance v3, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;
a=0;// 
a=0;//     #v3=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;);
a=0;//     iget-object v4, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {v3, v4}, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;-><init>(Landroid/widget/TextView;)V
a=0;// 
a=0;//     #v3=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;);
a=0;//     invoke-direct {v1, v2, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "getContacts":Ljava/lang/Thread;
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateOptionsMenu(Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuInflater;);
a=0;//     const/high16 v1, 0x7f0c0000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;//     .locals 12
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 78
a=0;//     #v8=(One);
a=0;//     invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 79
a=0;//     .local v7, "id":I
a=0;//     #v7=(Integer);
a=0;//     const v9, 0x7f07003d
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v7, v9, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v6, Ljava/lang/Thread;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v8, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;
a=0;// 
a=0;//     #v8=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-virtual {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/ContentResolver;);
a=0;//     new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;
a=0;// 
a=0;//     #v10=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;);
a=0;//     iget-object v11, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {v10, v11}, Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;-><init>(Landroid/widget/TextView;)V
a=0;// 
a=0;//     #v10=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/ContactListHandler;);
a=0;//     invoke-direct {v8, v9, v10}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;-><init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v8=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     invoke-direct {v6, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 84
a=0;//     .local v6, "getContacts":Ljava/lang/Thread;
a=0;//     #v6=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 152
a=0;//     .end local v6    # "getContacts":Ljava/lang/Thread;
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Boolean);
a=0;//     return v8
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(One);v9=(Integer);v10=(Uninit);v11=(Uninit);
a=0;//     const v9, 0x7f07003e
a=0;// 
a=0;//     if-ne v7, v9, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v2, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 92
a=0;//     .local v2, "alertDialogBuilder":Landroid/app/AlertDialog$Builder;
a=0;//     #v2=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v9, "Settings"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v9, "This app is too awesome to have any settings."
a=0;// 
a=0;//     invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 94
a=0;//     const-string v9, "OK"
a=0;// 
a=0;//     new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;
a=0;// 
a=0;//     #v10=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;);
a=0;//     invoke-direct {v10, p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;)V
a=0;// 
a=0;//     #v10=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$1;);
a=0;//     invoke-virtual {v2, v9, v10}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "alertDialog":Landroid/app/AlertDialog;
a=0;//     #v1=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v1    # "alertDialog":Landroid/app/AlertDialog;
a=0;//     .end local v2    # "alertDialogBuilder":Landroid/app/AlertDialog$Builder;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v9=(Integer);v10=(Uninit);
a=0;//     const v9, 0x7f07003f
a=0;// 
a=0;//     if-ne v7, v9, :cond_3
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v4, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 112
a=0;//     .local v4, "findDialogBuilder":Landroid/app/AlertDialog$Builder;
a=0;//     #v4=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     new-instance v5, Landroid/widget/EditText;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/EditText;);
a=0;//     invoke-direct {v5, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 113
a=0;//     .local v5, "findString":Landroid/widget/EditText;
a=0;//     #v5=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 115
a=0;//     const-string v9, "Find Contacts"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 116
a=0;//     const-string v9, "Enter contact to search:"
a=0;// 
a=0;//     invoke-virtual {v4, v9}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 117
a=0;//     const-string v9, "Find"
a=0;// 
a=0;//     new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;
a=0;// 
a=0;//     #v10=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;);
a=0;//     invoke-direct {v10, p0, v5}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;Landroid/widget/EditText;)V
a=0;// 
a=0;//     #v10=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$2;);
a=0;//     invoke-virtual {v4, v9, v10}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 124
a=0;//     const-string v9, "Cancel"
a=0;// 
a=0;//     new-instance v10, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;
a=0;// 
a=0;//     #v10=(UninitRef,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;);
a=0;//     invoke-direct {v10, p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;-><init>(Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;)V
a=0;// 
a=0;//     #v10=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity$3;);
a=0;//     invoke-virtual {v4, v9, v10}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 132
a=0;//     .local v3, "findDialog":Landroid/app/AlertDialog;
a=0;//     #v3=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     .end local v3    # "findDialog":Landroid/app/AlertDialog;
a=0;//     .end local v4    # "findDialogBuilder":Landroid/app/AlertDialog$Builder;
a=0;//     .end local v5    # "findString":Landroid/widget/EditText;
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v9=(Integer);v10=(Uninit);
a=0;//     const v9, 0x7f070040
a=0;// 
a=0;//     if-ne v7, v9, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v9, Ledu/cmu/wnss/funktastic/superawesomecontacts/AboutActivity;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "aboutIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 54
a=0;//     const-string v0, "edu.cmu.wnss.funktastic.superawesomecontacts.main.contacts"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/MainActivity;->mContactListTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
}}
