package android.support.v4.app; class RemoteInputCompatJellybean { void a() { int a;
a=0;// .class Landroid/support/v4/app/RemoteInputCompatJellybean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RemoteInputCompatJellybean.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final EXTRA_RESULTS_DATA:Ljava/lang/String; = "android.remoteinput.resultsData"
a=0;// 
a=0;// .field private static final KEY_ALLOW_FREE_FORM_INPUT:Ljava/lang/String; = "allowFreeFormInput"
a=0;// 
a=0;// .field private static final KEY_CHOICES:Ljava/lang/String; = "choices"
a=0;// 
a=0;// .field private static final KEY_EXTRAS:Ljava/lang/String; = "extras"
a=0;// 
a=0;// .field private static final KEY_LABEL:Ljava/lang/String; = "label"
a=0;// 
a=0;// .field private static final KEY_RESULT_KEY:Ljava/lang/String; = "resultKey"
a=0;// 
a=0;// .field public static final RESULTS_CLIP_LABEL:Ljava/lang/String; = "android.remoteinput.results"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/RemoteInputCompatJellybean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static addResultsToIntent([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;//     .locals 8
a=0;//     .param p0, "remoteInputs"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "results"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     new-instance v6, Landroid/os/Bundle;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 97
a=0;//     .local v6, "resultsBundle":Landroid/os/Bundle;
a=0;//     #v6=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .local v0, "arr$":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v0=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v4, v0, v2
a=0;// 
a=0;//     .line 98
a=0;//     .local v4, "remoteInput":Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v7}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 99
a=0;//     .local v5, "result":Ljava/lang/Object;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v7, v5, Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v4}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     check-cast v5, Ljava/lang/CharSequence;
a=0;// 
a=0;//     .end local v5    # "result":Ljava/lang/Object;
a=0;//     invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     .end local v4    # "remoteInput":Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "clipIntent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "android.remoteinput.resultsData"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 105
a=0;//     const-string v7, "android.remoteinput.results"
a=0;// 
a=0;//     invoke-static {v7, v1}, Landroid/content/ClipData;->newIntent(Ljava/lang/CharSequence;Landroid/content/Intent;)Landroid/content/ClipData;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {p1, v7}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static fromBundle(Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .locals 6
a=0;//     .param p0, "data"    # Landroid/os/Bundle;
a=0;//     .param p1, "factory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const-string v0, "resultKey"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "label"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     const-string v0, "choices"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/CharSequence;);
a=0;//     const-string v0, "allowFreeFormInput"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     const-string v0, "extras"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .locals 3
a=0;//     .param p0, "bundles"    # [Landroid/os/Bundle;
a=0;//     .param p1, "factory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 61
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p1, v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 62
a=0;//     .local v1, "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v1=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     aget-object v2, p0, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundle(Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 62
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
a=0;//     .locals 5
a=0;//     .param p0, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "clipData":Landroid/content/ClipData;
a=0;//     #v0=(Reference,Landroid/content/ClipData;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Landroid/os/Bundle;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {v0}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 85
a=0;//     .local v1, "clipDescription":Landroid/content/ClipDescription;
a=0;//     #v1=(Reference,Landroid/content/ClipDescription;);
a=0;//     const-string v3, "text/vnd.android.intent"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {v1}, Landroid/content/ClipDescription;->getLabel()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     const-string v4, "android.remoteinput.results"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ClipData$Item;);
a=0;//     invoke-virtual {v2}, Landroid/content/ClipData$Item;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "android.remoteinput.resultsData"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/os/Bundle;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static toBundle(Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;
a=0;//     .locals 3
a=0;//     .param p0, "remoteInput"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "data":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "resultKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 49
a=0;//     const-string v1, "label"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getLabel()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 50
a=0;//     const-string v1, "choices"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getChoices()[Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v1, "allowFreeFormInput"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getAllowFreeFormInput()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v1, "extras"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 53
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
a=0;//     .locals 3
a=0;//     .param p0, "remoteInputs"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Landroid/os/Bundle;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v0, v2, [Landroid/os/Bundle;
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "bundles":[Landroid/os/Bundle;
a=0;//     #v0=(Reference,[Landroid/os/Bundle;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     aget-object v2, p0, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundle(Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
