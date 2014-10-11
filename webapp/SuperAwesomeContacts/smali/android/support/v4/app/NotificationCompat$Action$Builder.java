package android.support.v4.app; class NotificationCompat$Action$Builder { void a() { int a;
a=0;// .class public final Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat$Action;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// .field private final mIcon:I
a=0;// 
a=0;// .field private final mIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private mRemoteInputs:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/RemoteInput;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1506
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1507
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$Builder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;//     .param p4, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1518
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1519
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$Builder;);
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIcon:I
a=0;// 
a=0;//     .line 1520
a=0;//     iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1521
a=0;//     iput-object p3, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 1522
a=0;//     iput-object p4, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1523
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Action;)V
a=0;//     .locals 5
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1515
a=0;//     iget v0, p1, Landroid/support/v4/app/NotificationCompat$Action;->icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Action;->access$300(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1516
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$Builder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1533
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1534
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1536
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addRemoteInput(Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "remoteInput"    # Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1556
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1557
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1559
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1560
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public build()Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1578
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/support/v4/app/RemoteInput;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     .line 1580
a=0;//     .local v5, "remoteInputs":[Landroid/support/v4/app/RemoteInput;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Reference,[Landroid/support/v4/app/RemoteInput;);
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIcon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-object v0
a=0;// 
a=0;//     .end local v5    # "remoteInputs":[Landroid/support/v4/app/RemoteInput;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 1578
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public extend(Landroid/support/v4/app/NotificationCompat$Action$Extender;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "extender"    # Landroid/support/v4/app/NotificationCompat$Action$Extender;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1568
a=0;//     invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Action$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;// 
a=0;//     .line 1569
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1545
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
}}
