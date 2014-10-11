package android.support.v4.app; class ShareCompat$IntentBuilder { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ShareCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "IntentBuilder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field private mBccAddresses:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mCcAddresses:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mChooserTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private mStreams:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/net/Uri;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mToAddresses:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 3
a=0;//     .param p1, "launchingActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 280
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompat$IntentBuilder;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 281
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.support.v4.app.EXTRA_CALLING_PACKAGE"
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v1, 0x80000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 285
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private combineArrayExtra(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .param p1, "extra"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "add":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 345
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v4, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 346
a=0;//     .local v0, "currentAddresses":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     .line 347
a=0;//     .local v1, "currentLength":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v1
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/String;
a=0;// 
a=0;//     .line 348
a=0;//     .local v2, "finalAddresses":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 349
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v0, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// 
a=0;//     .end local v1    # "currentLength":I
a=0;//     .end local v2    # "finalAddresses":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Reference,Landroid/content/Intent;);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 346
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private combineArrayExtra(Ljava/lang/String;[Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "extra"    # Ljava/lang/String;
a=0;//     .param p2, "add"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 357
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 358
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 359
a=0;//     .local v1, "old":[Ljava/lang/String;
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     .line 360
a=0;//     .local v2, "oldLength":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     array-length v5, p2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v2
a=0;// 
a=0;//     new-array v3, v5, [Ljava/lang/String;
a=0;// 
a=0;//     .line 361
a=0;//     .local v3, "result":[Ljava/lang/String;
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 362
a=0;//     :cond_0
a=0;//     array-length v5, p2
a=0;// 
a=0;//     invoke-static {p2, v4, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual {v0, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 364
a=0;//     return-void
a=0;// 
a=0;//     .end local v2    # "oldLength":I
a=0;//     .end local v3    # "result":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 359
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static from(Landroid/app/Activity;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "launchingActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     new-instance v0, Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ShareCompat$IntentBuilder;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$IntentBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addEmailBcc(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "address"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 607
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 609
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 610
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addEmailBcc([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 621
a=0;//     const-string v0, "android.intent.extra.BCC"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 622
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addEmailCc(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "address"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 566
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 567
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 569
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 570
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addEmailCc([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     const-string v0, "android.intent.extra.CC"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 582
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addEmailTo(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "address"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 527
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 529
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 530
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addEmailTo([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 541
a=0;//     const-string v0, "android.intent.extra.EMAIL"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 542
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addStream(Landroid/net/Uri;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 3
a=0;//     .param p1, "streamUri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/net/Uri;
a=0;// 
a=0;//     .line 488
a=0;//     .local v0, "currentStream":Landroid/net/Uri;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->setStream(Landroid/net/Uri;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 499
a=0;//     .end local p0    # "this":Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     .line 491
a=0;//     .restart local p0    # "this":Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 492
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 494
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v2, "android.intent.extra.STREAM"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 498
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public createChooserIntent()Landroid/content/Intent;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mChooserTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getActivity()Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 297
a=0;//     #v6=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     const-string v3, "android.intent.extra.EMAIL"
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v3, v4}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 299
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     const-string v3, "android.intent.extra.CC"
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v3, v4}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 303
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mCcAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 305
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 306
a=0;//     const-string v3, "android.intent.extra.BCC"
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v3, v4}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->combineArrayExtra(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 307
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mBccAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 311
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v1, :cond_5
a=0;// 
a=0;//     .line 312
a=0;//     .local v1, "needsSendMultiple":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "android.intent.action.SEND_MULTIPLE"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 314
a=0;//     .local v0, "isSendMultiple":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "android.intent.action.SEND"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.extra.STREAM"
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/os/Parcelable;
a=0;// 
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 323
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 326
a=0;//     :cond_3
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v3, "android.intent.action.SEND_MULTIPLE"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.extra.STREAM"
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 337
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .end local v0    # "isSendMultiple":Z
a=0;//     .end local v1    # "needsSendMultiple":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 311
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     .restart local v0    # "isSendMultiple":Z
a=0;//     .restart local v1    # "needsSendMultiple":Z
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 333
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.extra.STREAM"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setChooserTitle(I)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Activity;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->setChooserTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setChooserTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mChooserTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 398
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEmailBcc([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.BCC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 595
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEmailCc([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.CC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 555
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEmailTo([Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "addresses"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mToAddresses:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 514
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.extra.EMAIL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 515
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHtmlText(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "htmlText"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.HTML_TEXT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.extra.TEXT"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 451
a=0;//     invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/Spanned;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->setText(Ljava/lang/CharSequence;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setStream(Landroid/net/Uri;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "streamUri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 470
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 472
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSubject(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "subject"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.SUBJECT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 634
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setText(Ljava/lang/CharSequence;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.TEXT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 433
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setType(Ljava/lang/String;)Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 420
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public startChooser()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentBuilder;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 388
a=0;//     return-void
a=0;// .end method
}}
