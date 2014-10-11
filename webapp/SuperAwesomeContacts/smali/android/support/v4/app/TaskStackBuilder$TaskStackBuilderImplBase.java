package android.support.v4.app; class TaskStackBuilder$TaskStackBuilderImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;
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
a=0;//     name = "TaskStackBuilderImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "intents"    # [Landroid/content/Intent;
a=0;//     .param p3, "requestCode"    # I
a=0;//     .param p4, "flags"    # I
a=0;//     .param p5, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     array-length v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget-object v1, p2, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "topIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 86
a=0;//     invoke-static {p1, p3, v0, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     return-object v1
a=0;// .end method
}}
