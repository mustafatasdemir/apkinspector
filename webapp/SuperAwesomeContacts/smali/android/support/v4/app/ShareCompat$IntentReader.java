package android.support.v4.app; class ShareCompat$IntentReader { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ShareCompat$IntentReader;
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
a=0;//     name = "IntentReader"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "IntentReader"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field private mCallingActivity:Landroid/content/ComponentName;
a=0;// 
a=0;// .field private mCallingPackage:Ljava/lang/String;
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
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 676
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 677
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompat$IntentReader;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 678
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 679
a=0;//     invoke-static {p1}, Landroid/support/v4/app/ShareCompat;->getCallingPackage(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     .line 680
a=0;//     invoke-static {p1}, Landroid/support/v4/app/ShareCompat;->getCallingActivity(Landroid/app/Activity;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 681
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static from(Landroid/app/Activity;)Landroid/support/v4/app/ShareCompat$IntentReader;
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     new-instance v0, Landroid/support/v4/app/ShareCompat$IntentReader;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ShareCompat$IntentReader;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/ShareCompat$IntentReader;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$IntentReader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCallingActivity()Landroid/content/ComponentName;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 888
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCallingActivityIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 902
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 910
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/drawable/Drawable;);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 904
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 906
a=0;//     .local v1, "pm":Landroid/content/pm/PackageManager;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 907
a=0;//     :catch_0
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 908
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v3, "IntentReader"
a=0;// 
a=0;//     const-string v4, "Could not retrieve icon for calling activity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCallingApplicationIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 924
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 932
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/drawable/Drawable;);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 926
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 928
a=0;//     .local v1, "pm":Landroid/content/pm/PackageManager;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 929
a=0;//     :catch_0
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 930
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v3, "IntentReader"
a=0;// 
a=0;//     const-string v4, "Could not retrieve icon for calling application"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCallingApplicationLabel()Ljava/lang/CharSequence;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 946
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 954
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/CharSequence;);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 948
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 950
a=0;//     .local v1, "pm":Landroid/content/pm/PackageManager;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 951
a=0;//     :catch_0
a=0;//     #v2=(Null);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 952
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v3, "IntentReader"
a=0;// 
a=0;//     const-string v4, "Could not retrieve label for calling application"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCallingPackage()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 871
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mCallingPackage:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmailBcc()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.BCC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmailCc()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 834
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.CC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEmailTo()[Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 824
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.EMAIL"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHtmlText()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 750
a=0;//     iget-object v2, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.extra.HTML_TEXT"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 751
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 752
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 753
a=0;//     .local v1, "text":Ljava/lang/CharSequence;
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     instance-of v2, v1, Landroid/text/Spanned;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 754
a=0;//     check-cast v1, Landroid/text/Spanned;
a=0;// 
a=0;//     .end local v1    # "text":Ljava/lang/CharSequence;
a=0;//     invoke-static {v1}, Landroid/text/Html;->toHtml(Landroid/text/Spanned;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 759
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 755
a=0;//     .restart local v1    # "text":Ljava/lang/CharSequence;
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);v2=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 756
a=0;//     invoke-static {}, Landroid/support/v4/app/ShareCompat;->access$000()Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImpl;);
a=0;//     invoke-interface {v2, v1}, Landroid/support/v4/app/ShareCompat$ShareCompatImpl;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getStream()Landroid/net/Uri;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/Uri;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStream(I)Landroid/net/Uri;
a=0;//     .locals 3
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 787
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->isMultipleShare()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 788
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 790
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/Uri;
a=0;// 
a=0;//     .line 794
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 793
a=0;//     :cond_1
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/Uri;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 796
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Stream items available: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->getStreamCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " index requested: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getStreamCount()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 808
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ShareCompat$IntentReader;->isMultipleShare()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 809
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 811
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 812
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mStreams:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 814
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSubject()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 854
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.SUBJECT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.TEXT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isMultipleShare()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     const-string v0, "android.intent.action.SEND_MULTIPLE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShareIntent()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 693
a=0;//     .local v0, "action":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "android.intent.action.SEND_MULTIPLE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSingleShare()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 705
a=0;//     const-string v0, "android.intent.action.SEND"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ShareCompat$IntentReader;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
