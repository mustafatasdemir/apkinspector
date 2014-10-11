package android.support.v4.app; class NavUtils { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NavUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NavUtils.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NavUtils$NavUtilsImplJB;,
a=0;//         Landroid/support/v4/app/NavUtils$NavUtilsImplBase;,
a=0;//         Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;// .field public static final PARENT_ACTIVITY:Ljava/lang/String; = "android.support.PARENT_ACTIVITY"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "NavUtils"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v1, Landroid/support/v4/app/NavUtils$NavUtilsImplJB;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NavUtils$NavUtilsImplJB;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/app/NavUtils$NavUtilsImplJB;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImplJB;);
a=0;//     sput-object v1, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     .line 142
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/app/NavUtils$NavUtilsImplBase;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NavUtils$NavUtilsImplBase;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/app/NavUtils$NavUtilsImplBase;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImplBase;);
a=0;//     sput-object v1, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 308
a=0;//     #p0=(Reference,Landroid/support/v4/app/NavUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
a=0;//     .locals 1
a=0;//     .param p0, "sourceActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getParentActivityIntent(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 257
a=0;//     .local v1, "parentActivity":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 266
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Landroid/content/Intent;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 260
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v3, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 262
a=0;//     .local v3, "target":Landroid/content/ComponentName;
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "grandparent":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 266
a=0;//     .local v2, "parentIntent":Landroid/content/Intent;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     .end local v2    # "parentIntent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getParentActivityIntent(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Landroid/content/Intent;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     .local p1, "sourceActivityClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     new-instance v4, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-direct {v4, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {p0, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "parentActivity":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Landroid/content/Intent;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v3, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-direct {v3, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     .local v3, "target":Landroid/content/ComponentName;
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 238
a=0;//     .local v0, "grandparent":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 241
a=0;//     .local v2, "parentIntent":Landroid/content/Intent;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     .end local v2    # "parentIntent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "sourceActivity"    # Landroid/app/Activity;
a=0;//     .annotation build Landroid/support/annotation/Nullable;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-static {p0, v1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 282
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 284
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;//     .annotation build Landroid/support/annotation/Nullable;
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 301
a=0;//     .local v2, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 302
a=0;//     .local v0, "info":Landroid/content/pm/ActivityInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     sget-object v3, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImpl;);
a=0;//     invoke-interface {v3, p0, v0}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->getParentActivityName(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 303
a=0;//     .local v1, "parentActivity":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static navigateUpFromSameTask(Landroid/app/Activity;)V
a=0;//     .locals 4
a=0;//     .param p0, "sourceActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "upIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Activity "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " does not have a parent activity name specified."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " element in your manifest?)"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/app/NavUtils;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p0, "sourceActivity"    # Landroid/app/Activity;
a=0;//     .param p1, "upIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 203
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
a=0;//     .locals 1
a=0;//     .param p0, "sourceActivity"    # Landroid/app/Activity;
a=0;//     .param p1, "targetIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NavUtils$NavUtilsImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
