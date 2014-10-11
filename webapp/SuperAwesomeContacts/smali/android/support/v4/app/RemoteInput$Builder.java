package android.support.v4.app; class RemoteInput$Builder { void a() { int a;
a=0;// .class public final Landroid/support/v4/app/RemoteInput$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RemoteInput.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/RemoteInput;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllowFreeFormInput:Z
a=0;// 
a=0;// .field private mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private final mResultKey:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "resultKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     #p0=(Reference,Landroid/support/v4/app/RemoteInput$Builder;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 106
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Result key can\'t be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/RemoteInput$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public build()Landroid/support/v4/app/RemoteInput;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     new-instance v0, Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/RemoteInput;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mResultKey:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/CharSequence;);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iget-object v5, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/RemoteInput;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/RemoteInput;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget-object v0, p0, Landroid/support/v4/app/RemoteInput$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAllowFreeFormInput(Z)Landroid/support/v4/app/RemoteInput$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "allowFreeFormInput"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iput-boolean p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mAllowFreeFormInput:Z
a=0;// 
a=0;//     .line 145
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setChoices([Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "choices"    # [Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mChoices:[Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 131
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setLabel(Ljava/lang/CharSequence;)Landroid/support/v4/app/RemoteInput$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iput-object p1, p0, Landroid/support/v4/app/RemoteInput$Builder;->mLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 119
a=0;//     return-object p0
a=0;// .end method
}}
