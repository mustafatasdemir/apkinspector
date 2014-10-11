package edu.cmu.wnss.funktastic.superawesomecontacts; class PopulateContactList { void a() { int a;
a=0;// .class public Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PopulateContactList.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final HANDLER_BUNDLE_KEY:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContentResolver:Landroid/content/ContentResolver;
a=0;// 
a=0;// .field private mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mQueryString:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "contentResolver"    # Landroid/content/ContentResolver;
a=0;//     .param p2, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 26
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;//     .line 27
a=0;//     iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/ContentResolver;Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "contentResolver"    # Landroid/content/ContentResolver;
a=0;//     .param p2, "findActivity"    # Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;//     .param p3, "queryString"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;);
a=0;//     iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     .line 23
a=0;//     iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;//     .line 32
a=0;//     iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;
a=0;// 
a=0;//     .line 33
a=0;//     iput-object p2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p3, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private populateContacts()Ljava/lang/String;
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 58
a=0;//     .local v10, "cursor":Landroid/database/Cursor;
a=0;//     #v10=(Reference,Landroid/database/Cursor;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 60
a=0;//     .local v6, "concatList":Ljava/lang/StringBuilder;
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "[\\*\\s]+"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 64
a=0;//     .local v12, "queryTokens":[Ljava/lang/String;
a=0;//     #v12=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     .local v13, "sanitizedQueryTokens":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     array-length v1, v12
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Boolean);v9=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     aget-object v9, v12, v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v9, "currentString":Ljava/lang/String;
a=0;//     #v9=(Null);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     .end local v9    # "currentString":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v9=(Conflicted);
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 72
a=0;//     iput-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     .line 96
a=0;//     .end local v12    # "queryTokens":[Ljava/lang/String;
a=0;//     .end local v13    # "sanitizedQueryTokens":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 98
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, " Contacts Found\n\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 99
a=0;//     :goto_2
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, "display_name"
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 75
a=0;//     .restart local v12    # "queryTokens":[Ljava/lang/String;
a=0;//     .restart local v13    # "sanitizedQueryTokens":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v2=(Null);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Reference,[Ljava/lang/String;);v13=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     .local v7, "concatListMatches":Ljava/lang/StringBuilder;
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     .local v11, "numMatches":I
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v8=(Conflicted);v11=(Integer);
a=0;//     invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Ljava/lang/String;
a=0;// 
a=0;//     .line 79
a=0;//     .restart local v9    # "currentString":Ljava/lang/String;
a=0;//     const-string v1, "display_name"
a=0;// 
a=0;//     .line 80
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 79
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 81
a=0;//     .local v8, "currentName":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 82
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 84
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 89
a=0;//     .end local v8    # "currentName":Ljava/lang/String;
a=0;//     .end local v9    # "currentString":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, " Contacts Found\n\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     .end local v7    # "concatListMatches":Ljava/lang/StringBuilder;
a=0;//     .end local v11    # "numMatches":I
a=0;//     .end local v12    # "queryTokens":[Ljava/lang/String;
a=0;//     .end local v13    # "sanitizedQueryTokens":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;//     #v2=(Reference,Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;
a=0;// 
a=0;//     invoke-direct {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->populateContacts()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;->setSearchResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Landroid/os/Message;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v1}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"
a=0;// 
a=0;//     invoke-direct {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->populateContacts()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
