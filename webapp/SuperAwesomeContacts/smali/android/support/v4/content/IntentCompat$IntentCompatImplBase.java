package android.support.v4.content; class IntentCompat$IntentCompatImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IntentCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/content/IntentCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "IntentCompatImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     .locals 2
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 41
a=0;//     const-string v1, "android.intent.category.LAUNCHER"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 42
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p1, "selectorAction"    # Ljava/lang/String;
a=0;//     .param p2, "selectorCategory"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, p2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 53
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     .locals 2
a=0;//     .param p1, "mainActivity"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const v1, 0x10008000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 61
a=0;//     return-object v0
a=0;// .end method
}}
