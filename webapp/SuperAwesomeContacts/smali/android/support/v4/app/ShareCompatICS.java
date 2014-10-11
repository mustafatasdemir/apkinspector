package android.support.v4.app; class ShareCompatICS { void a() { int a;
a=0;// .class Landroid/support/v4/app/ShareCompatICS;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareCompatICS.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HISTORY_FILENAME_PREFIX:Ljava/lang/String; = ".sharecompat_"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompatICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static configureMenuItem(Landroid/view/MenuItem;Landroid/app/Activity;Landroid/content/Intent;)V
a=0;//     .locals 4
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;//     .param p1, "callingActivity"    # Landroid/app/Activity;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-interface {p0}, Landroid/view/MenuItem;->getActionProvider()Landroid/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "itemProvider":Landroid/view/ActionProvider;
a=0;//     #v0=(Reference,Landroid/view/ActionProvider;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     .local v1, "provider":Landroid/widget/ShareActionProvider;
a=0;//     #v1=(Null);
a=0;//     instance-of v2, v0, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v1, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     .end local v1    # "provider":Landroid/widget/ShareActionProvider;
a=0;//     #v1=(UninitRef,Landroid/widget/ShareActionProvider;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/ShareActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 36
a=0;//     .restart local v1    # "provider":Landroid/widget/ShareActionProvider;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/widget/ShareActionProvider;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ".sharecompat_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ShareActionProvider;->setShareHistoryFileName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 38
a=0;//     invoke-virtual {v1, p2}, Landroid/widget/ShareActionProvider;->setShareIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {p0, v1}, Landroid/view/MenuItem;->setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Reference,Landroid/view/ActionProvider;);
a=0;//     check-cast v1, Landroid/widget/ShareActionProvider;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
