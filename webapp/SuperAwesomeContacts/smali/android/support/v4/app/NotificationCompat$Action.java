package android.support.v4.app; class NotificationCompat$Action { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat$Action;
a=0;// .super Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Action"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Action$Extender;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field public icon:I
a=0;// 
a=0;// .field private final mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// .field private final mRemoteInputs:[Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;// .field public title:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1700
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$Action$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$Action$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$Action$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$1;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;//     .locals 6
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1447
a=0;//     new-instance v4, Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V
a=0;// 
a=0;//     .line 1448
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V
a=0;//     .locals 0
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;//     .param p4, "extras"    # Landroid/os/Bundle;
a=0;//     .param p5, "remoteInputs"    # [Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1451
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;-><init>()V
a=0;// 
a=0;//     .line 1452
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I
a=0;// 
a=0;//     .line 1453
a=0;//     iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1454
a=0;//     iput-object p3, p0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 1455
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .end local p4    # "extras":Landroid/os/Bundle;
a=0;//     :goto_0
a=0;//     iput-object p4, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 1456
a=0;//     iput-object p5, p0, Landroid/support/v4/app/NotificationCompat$Action;->mRemoteInputs:[Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     .line 1457
a=0;//     return-void
a=0;// 
a=0;//     .line 1455
a=0;//     .restart local p4    # "extras":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     new-instance p4, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local p4    # "extras":Landroid/os/Bundle;
a=0;//     #p4=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {p4}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #p4=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;//     .param p2, "x1"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "x2"    # Landroid/app/PendingIntent;
a=0;//     .param p4, "x3"    # Landroid/os/Bundle;
a=0;//     .param p5, "x4"    # [Landroid/support/v4/app/RemoteInput;
a=0;//     .param p6, "x5"    # Landroid/support/v4/app/NotificationCompat$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1428
a=0;//     invoke-direct/range {p0 .. p5}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1428
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getActionIntent()Landroid/app/PendingIntent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1471
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1478
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getIcon()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1461
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRemoteInputs()[Landroid/support/v4/app/RemoteInput;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1486
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mRemoteInputs:[Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/RemoteInput;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1428
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/RemoteInput;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1466
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
}}
