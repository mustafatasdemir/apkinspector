package android.support.v4.app; class NotificationCompat$InboxStyle { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// .super Landroid/support/v4/app/NotificationCompat$Style;
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
a=0;//     name = "InboxStyle"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mTexts:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1385
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V
a=0;// 
a=0;//     .line 1383
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$InboxStyle;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1386
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;//     .locals 1
a=0;//     .param p1, "builder"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1388
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V
a=0;// 
a=0;//     .line 1383
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$InboxStyle;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1389
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/NotificationCompat$InboxStyle;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;// 
a=0;//     .line 1390
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addLine(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 1
a=0;//     .param p1, "cs"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1414
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1415
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setBigContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1397
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1398
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setSummaryText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     .locals 1
a=0;//     .param p1, "cs"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1405
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1406
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     .line 1407
a=0;//     return-object p0
a=0;// .end method
}}
