package android.support.v4.app; class NavUtils$NavUtilsImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/app/NavUtils$NavUtilsImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NavUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NavUtils;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "NavUtilsImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
a=0;//     .locals 8
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 54
a=0;//     .local v3, "parentName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/content/Intent;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-direct {v4, p1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     .local v4, "target":Landroid/content/ComponentName;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {p1, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "grandparent":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 63
a=0;//     .local v2, "parentIntent":Landroid/content/Intent;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/content/Intent;);v5=(Conflicted);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 60
a=0;//     .end local v2    # "parentIntent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     #v2=(Null);v5=(Uninit);
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v5}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 64
a=0;//     .end local v1    # "grandparent":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Null);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v5, "NavUtils"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "getParentActivityIntent: bad parentActivityName \'"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' in manifest"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getParentActivityName(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "info"    # Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 87
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Landroid/os/Bundle;);v3=(Uninit);
a=0;//     iget-object v2, p2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v3, "android.support.PARENT_ACTIVITY"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "parentActivity":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     const/16 v2, 0x2e
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "upIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     const/high16 v0, 0x4000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "targetIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "action":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "android.intent.action.MAIN"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
