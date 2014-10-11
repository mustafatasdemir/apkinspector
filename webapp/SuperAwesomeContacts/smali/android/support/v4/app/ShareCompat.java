package android.support.v4.app; class ShareCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ShareCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/ShareCompat$IntentReader;,
a=0;//         Landroid/support/v4/app/ShareCompat$IntentBuilder;,
a=0;//         Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;,
a=0;//         Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;,
a=0;//         Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;,
a=0;//         Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final EXTRA_CALLING_ACTIVITY:Ljava/lang/String; = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
a=0;// 
a=0;// .field public static final EXTRA_CALLING_PACKAGE:Ljava/lang/String; = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
a=0;// 
a=0;// .field private static IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImplJB;);
a=0;//     sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     .line 159
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;);
a=0;//     sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 655
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static configureMenuItem(Landroid/view/Menu;ILandroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;//     .locals 4
a=0;//     .param p0, "menu"    # Landroid/view/Menu;
a=0;//     .param p1, "menuItemId"    # I
a=0;//     .param p2, "shareIntent"    # Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 245
a=0;//     invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 246
a=0;//     .local v0, "item":Landroid/view/MenuItem;
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not find menu item with id "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " in the supplied menu"
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
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/app/ShareCompat;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;//     .param p1, "shareIntent"    # Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     sget-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/app/ShareCompat$ShareCompatImpl;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getCallingActivity(Landroid/app/Activity;)Landroid/content/ComponentName;
a=0;//     .locals 3
a=0;//     .param p0, "calledActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "result":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "result":Landroid/content/ComponentName;
a=0;//     check-cast v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 198
a=0;//     .restart local v0    # "result":Landroid/content/ComponentName;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getCallingPackage(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "calledActivity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.support.v4.app.EXTRA_CALLING_PACKAGE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
}}
