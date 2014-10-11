package android.support.v4.app; class NotificationManagerCompat$SideChannelManager$ListenerRecord { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "ListenerRecord"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public bound:Z
a=0;// 
a=0;// .field public final componentName:Landroid/content/ComponentName;
a=0;// 
a=0;// .field public retryCount:I
a=0;// 
a=0;// .field public service:Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;// .field public taskQueue:Ljava/util/LinkedList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/LinkedList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationManagerCompat$Task;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/ComponentName;)V
a=0;//     .locals 2
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 527
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 519
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     .line 523
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     .line 525
a=0;//     iput v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     .line 528
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 529
a=0;//     return-void
a=0;// .end method
}}
