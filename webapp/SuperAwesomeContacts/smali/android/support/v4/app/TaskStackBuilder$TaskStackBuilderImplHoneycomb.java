package android.support.v4.app; class TaskStackBuilder$TaskStackBuilderImplHoneycomb { void a() { int a;
a=0;// .class Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TaskStackBuilder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/TaskStackBuilder;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "TaskStackBuilderImplHoneycomb"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "intents"    # [Landroid/content/Intent;
a=0;//     .param p3, "requestCode"    # I
a=0;//     .param p4, "flags"    # I
a=0;//     .param p5, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 93
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     aget-object v1, p2, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const v1, 0x1000c000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, p2, v2
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {p1, p3, p2, p4}, Landroid/support/v4/app/TaskStackBuilderHoneycomb;->getActivitiesPendingIntent(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
