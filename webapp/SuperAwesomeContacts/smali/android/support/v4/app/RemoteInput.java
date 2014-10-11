package android.support.v4.app; class RemoteInput { void a() { int a;
a=0;// .class public Landroid/support/v4/app/RemoteInput;
a=0;// .super Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// .source "RemoteInput.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/RemoteInput$ImplApi20;,
a=0;//         Landroid/support/v4/app/RemoteInput$ImplJellybean;,
a=0;//         Landroid/support/v4/app/RemoteInput$ImplBase;,
a=0;//         Landroid/support/v4/app/RemoteInput$Impl;,
a=0;//         Landroid/support/v4/app/RemoteInput$Builder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final EXTRA_RESULTS_DATA:Ljava/lang/String; = "android.remoteinput.resultsData"
a=0;// 
a=0;// .field public static final FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;// .field public static final RESULTS_CLIP_LABEL:Ljava/lang/String; = "android.remoteinput.results"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "RemoteInput"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAllowFreeFormInput:Z
a=0;// 
a=0;// .field private final mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// .field private final mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final mResultKey:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     new-instance v0, Landroid/support/v4/app/RemoteInput$ImplApi20;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/RemoteInput$ImplApi20;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplApi20;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$ImplApi20;);
a=0;//     sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;//     .line 263
a=0;//     :goto_0
a=0;//     new-instance v0, Landroid/support/v4/app/RemoteInput$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/RemoteInput$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 256
a=0;//     new-instance v0, Landroid/support/v4/app/RemoteInput$ImplJellybean;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/RemoteInput$ImplJellybean;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplJellybean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$ImplJellybean;);
a=0;//     sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/RemoteInput$ImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/RemoteInput$ImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/RemoteInput$ImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$ImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "resultKey"    # Ljava/lang/String;
a=0;//     .param p2, "label"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "choices"    # [Ljava/lang/CharSequence;
a=0;//     .param p4, "allowFreeFormInput"    # Z
a=0;//     .param p5, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Landroid/support/v4/app/RemoteInput;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/RemoteInput;->mResultKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p2, p0, Landroid/support/v4/app/RemoteInput;->mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p3, p0, Landroid/support/v4/app/RemoteInput;->mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 48
a=0;//     iput-boolean p4, p0, Landroid/support/v4/app/RemoteInput;->mAllowFreeFormInput:Z
a=0;// 
a=0;//     .line 49
a=0;//     iput-object p5, p0, Landroid/support/v4/app/RemoteInput;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p0, "remoteInputs"    # [Landroid/support/v4/app/RemoteInput;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "results"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$Impl;);
a=0;//     invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/app/RemoteInput$Impl;->addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p0, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     sget-object v0, Landroid/support/v4/app/RemoteInput;->IMPL:Landroid/support/v4/app/RemoteInput$Impl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput$Impl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/app/RemoteInput$Impl;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAllowFreeFormInput()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/RemoteInput;->mAllowFreeFormInput:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getChoices()[Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLabel()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getResultKey()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput;->mResultKey:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
