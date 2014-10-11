package android.support.v4.app; class TaskStackBuilder { void a() { int a;
a=0;// .class public Landroid/support/v4/app/TaskStackBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TaskStackBuilder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Iterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplJellybean;,
a=0;//         Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;,
a=0;//         Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;,
a=0;//         Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;,
a=0;//         Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Iterable",
a=0;//         "<",
a=0;//         "Landroid/content/Intent;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "TaskStackBuilder"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mIntents:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/content/Intent;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mSourceContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplHoneycomb;);
a=0;//     sput-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "a"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v4/app/TaskStackBuilder;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 126
a=0;//     iput-object p1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     new-instance v0, Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/TaskStackBuilder;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/TaskStackBuilder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/TaskStackBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static from(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-static {p0}, Landroid/support/v4/app/TaskStackBuilder;->create(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/TaskStackBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "nextIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 162
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addNextIntentWithParentStack(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "nextIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "target":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     .line 185
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     .line 186
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addParentStack(Landroid/app/Activity;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 3
a=0;//     .param p1, "sourceActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 198
a=0;//     .local v0, "parent":Landroid/content/Intent;
a=0;//     #v0=(Null);
a=0;//     instance-of v2, p1, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     check-cast v2, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/support/v4/app/TaskStackBuilder$SupportParentable;->getSupportParentActivityIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);v2=(Conflicted);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 202
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 209
a=0;//     .local v1, "target":Landroid/content/ComponentName;
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 212
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addNextIntent(Landroid/content/Intent;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     .line 215
a=0;//     .end local v1    # "target":Landroid/content/ComponentName;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 5
a=0;//     .param p1, "sourceActivityName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "insertAt":I
a=0;//     :try_start_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, p1}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 241
a=0;//     .local v2, "parent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/content/Intent;);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 245
a=0;//     .end local v2    # "parent":Landroid/content/Intent;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 246
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v3, "TaskStackBuilder"
a=0;// 
a=0;//     const-string v4, "Bad ComponentName while traversing activity parent metadata"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 249
a=0;//     .end local v0    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     .restart local v2    # "parent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Reference,Landroid/content/Intent;);v4=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addParentStack(Ljava/lang/Class;)Landroid/support/v4/app/TaskStackBuilder;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Landroid/support/v4/app/TaskStackBuilder;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     .local p1, "sourceActivityClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     new-instance v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->addParentStack(Landroid/content/ComponentName;)Landroid/support/v4/app/TaskStackBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public editIntentAt(I)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Intent;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent(I)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/TaskStackBuilder;->editIntentAt(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntentCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntents()[Landroid/content/Intent;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v1, v2, [Landroid/content/Intent;
a=0;// 
a=0;//     .line 383
a=0;//     .local v1, "intents":[Landroid/content/Intent;
a=0;//     #v1=(Reference,[Landroid/content/Intent;);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 385
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const v2, 0x1000c000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     aput-object v2, v1, v4
a=0;// 
a=0;//     .line 388
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/content/Intent;
a=0;// 
a=0;//     invoke-direct {v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 388
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPendingIntent(II)Landroid/app/PendingIntent;
a=0;//     .locals 1
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/TaskStackBuilder;->getPendingIntent(IILandroid/os/Bundle;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPendingIntent(IILandroid/os/Bundle;)Landroid/app/PendingIntent;
a=0;//     .locals 6
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "flags"    # I
a=0;//     .param p3, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 361
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 362
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No intents added to TaskStackBuilder; cannot getPendingIntent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 366
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v2, [Landroid/content/Intent;
a=0;// 
a=0;//     .line 367
a=0;//     .local v2, "intents":[Landroid/content/Intent;
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     aget-object v1, v2, v3
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
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     .line 371
a=0;//     sget-object v0, Landroid/support/v4/app/TaskStackBuilder;->IMPL:Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;->getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<",
a=0;//             "Landroid/content/Intent;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     iget-object v0, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public startActivities()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/app/TaskStackBuilder;->startActivities(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 302
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActivities(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "options"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 316
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "No intents added to TaskStackBuilder; cannot startActivities"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/TaskStackBuilder;->mIntents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v3, v3, [Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/content/Intent;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v0, [Landroid/content/Intent;
a=0;// 
a=0;//     .line 322
a=0;//     .local v0, "intents":[Landroid/content/Intent;
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     aget-object v3, v0, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const v3, 0x1000c000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v4
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v0, p1}, Landroid/support/v4/content/ContextCompat;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 327
a=0;//     .local v1, "topIntent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v2, p0, Landroid/support/v4/app/TaskStackBuilder;->mSourceContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 330
a=0;//     .end local v1    # "topIntent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
