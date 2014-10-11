package android.support.v4.app; class RemoteInputCompatApi20 { void a() { int a;
a=0;// .class Landroid/support/v4/app/RemoteInputCompatApi20;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RemoteInputCompatApi20.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/RemoteInputCompatApi20;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static addResultsToIntent([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p0, "remoteInputs"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "results"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-static {p0}, Landroid/support/v4/app/RemoteInputCompatApi20;->fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/RemoteInput;);
a=0;//     invoke-static {v0, p1, p2}, Landroid/app/RemoteInput;->addResultsToIntent([Landroid/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;
a=0;//     .locals 5
a=0;//     .param p0, "srcArray"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,[Landroid/app/RemoteInput;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v1, v3, [Landroid/app/RemoteInput;
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "result":[Landroid/app/RemoteInput;
a=0;//     #v1=(Reference,[Landroid/app/RemoteInput;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     aget-object v2, p0, v0
a=0;// 
a=0;//     .line 45
a=0;//     .local v2, "src":Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Landroid/app/RemoteInput$Builder;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/RemoteInput$Builder;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getResultKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/RemoteInput$Builder;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getLabel()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getChoices()[Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getAllowFreeFormInput()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 43
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p0, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-static {p0}, Landroid/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static toCompat([Landroid/app/RemoteInput;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .locals 9
a=0;//     .param p0, "srcArray"    # [Landroid/app/RemoteInput;
a=0;//     .param p1, "factory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 27
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);v8=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 29
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1, v0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 30
a=0;//     .local v7, "result":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v7=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v8=(Conflicted);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     aget-object v8, p0, v6
a=0;// 
a=0;//     .line 32
a=0;//     .local v8, "src":Landroid/app/RemoteInput;
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v8}, Landroid/app/RemoteInput;->getResultKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Landroid/app/RemoteInput;->getLabel()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v8}, Landroid/app/RemoteInput;->getChoices()[Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v8}, Landroid/app/RemoteInput;->getAllowFreeFormInput()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v8}, Landroid/app/RemoteInput;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v7, v6
a=0;// 
a=0;//     .line 30
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
