package edu.cmu.wnss.funktastic.superawesomecontacts; class PopulateContactList {/*

.class public Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;
.super Ljava/lang/Object;
.source "PopulateContactList.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final HANDLER_BUNDLE_KEY:Ljava/lang/String; = "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"


# instance fields
.field private mContentResolver:Landroid/content/ContentResolver;

.field private mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

.field private mHandler:Landroid/os/Handler;

.field private mQueryString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/os/Handler;)V
    .locals 1
    .parameter "contentResolver"
    .parameter "handler"

    .prologue
    const/4 v0, 0x0

    .line 26
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    #p0=(Reference);
    iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    .line 23
    iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

    .line 27
    iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;

    .line 28
    iput-object p2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mHandler:Landroid/os/Handler;

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;Ljava/lang/String;)V
    .locals 1
    .parameter "contentResolver"
    .parameter "findActivity"
    .parameter "queryString"

    .prologue
    const/4 v0, 0x0

    .line 31
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    #p0=(Reference);
    iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    .line 23
    iput-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

    .line 32
    iput-object p1, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;

    .line 33
    iput-object p2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

    .line 34
    iput-object p3, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    .line 35
    return-void
.end method

.method private populateContacts()Ljava/lang/String;
    .locals 14

    .prologue
    const/4 v2, 0x0

    .line 55
    #v2=(Null);
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mContentResolver:Landroid/content/ContentResolver;

    #v0=(Reference);
    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    #v1=(Reference);
    move-object v3, v2

    #v3=(Null);
    move-object v4, v2

    #v4=(Null);
    move-object v5, v2

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 58
    .local v10, cursor:Landroid/database/Cursor;
    #v10=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .local v6, concatList:Ljava/lang/StringBuilder;
    #v6=(Reference);
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 62
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[\\*\\s]+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 64
    .local v12, queryTokens:[Ljava/lang/String;
    #v12=(Reference);
    new-instance v13, Ljava/util/ArrayList;

    #v13=(UninitRef);
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .local v13, sanitizedQueryTokens:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    #v13=(Reference);
    array-length v1, v12

    #v1=(Integer);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v3=(Boolean);v9=(Conflicted);
    if-ge v0, v1, :cond_1

    aget-object v9, v12, v0

    .line 66
    .local v9, currentString:Ljava/lang/String;
    #v9=(Null);
    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 67
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    .end local v9           #currentString:Ljava/lang/String;
    :cond_1
    #v9=(Conflicted);
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 72
    iput-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    .line 96
    .end local v12           #queryTokens:[Ljava/lang/String;
    .end local v13           #sanitizedQueryTokens:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_2
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    iget-object v0, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mQueryString:Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_7

    .line 98
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v1, " Contacts Found\n\n"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    .line 103
    const-string v0, "display_name"

    .line 104
    #v0=(Reference);
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 103
    #v0=(Integer);
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 75
    .restart local v12       #queryTokens:[Ljava/lang/String;
    .restart local v13       #sanitizedQueryTokens:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_3
    #v0=(Integer);v1=(Integer);v2=(Null);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Reference);v13=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .local v7, concatListMatches:Ljava/lang/StringBuilder;
    #v7=(Reference);
    const/4 v11, 0x0

    .line 77
    .local v11, numMatches:I
    :cond_4
    :goto_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v8=(Conflicted);v11=(Integer);
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_6

    .line 78
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Ljava/lang/String;

    .line 79
    .restart local v9       #currentString:Ljava/lang/String;
    const-string v1, "display_name"

    .line 80
    #v1=(Reference);
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 79
    #v1=(Integer);
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 81
    .local v8, currentName:Ljava/lang/String;
    #v8=(Reference);
    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 82
    #v1=(Reference);
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_5

    .line 83
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    add-int/lit8 v11, v11, 0x1

    .line 85
    goto :goto_3

    .line 89
    .end local v8           #currentName:Ljava/lang/String;
    .end local v9           #currentString:Ljava/lang/String;
    :cond_6
    #v0=(Boolean);v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    #v0=(Reference);
    const-string v1, " Contacts Found\n\n"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 108
    .end local v7           #concatListMatches:Ljava/lang/StringBuilder;
    .end local v11           #numMatches:I
    .end local v12           #queryTokens:[Ljava/lang/String;
    .end local v13           #sanitizedQueryTokens:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_7
    #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 39
    iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 40
    iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mFindActivity:Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;

    invoke-direct {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->populateContacts()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v2, v3}, Ledu/cmu/wnss/funktastic/superawesomecontacts/FindReturnable;->setSearchResult(Ljava/lang/String;)V

    .line 51
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 43
    :cond_0
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);
    new-instance v1, Landroid/os/Message;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 44
    .local v1, msg:Landroid/os/Message;
    #v1=(Reference);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 46
    .local v0, bundle:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v2, "edu.cmu.wnss.funktastic.superawesomecontacts.populatecontactlist.contactKey"

    invoke-direct {p0}, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->populateContacts()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 49
    iget-object v2, p0, Ledu/cmu/wnss/funktastic/superawesomecontacts/PopulateContactList;->mHandler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

*/}
