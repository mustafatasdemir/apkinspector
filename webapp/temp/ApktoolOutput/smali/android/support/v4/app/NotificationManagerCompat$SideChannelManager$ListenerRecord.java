package android.support.v4.app; class NotificationManagerCompat$SideChannelManager$ListenerRecord {/*

.class Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
.super Ljava/lang/Object;
.source "NotificationManagerCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ListenerRecord"
.end annotation


# instance fields
.field public bound:Z

.field public final componentName:Landroid/content/ComponentName;

.field public retryCount:I

.field public service:Landroid/support/v4/app/INotificationSideChannel;

.field public taskQueue:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Landroid/support/v4/app/NotificationManagerCompat$Task;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;)V
    .locals 2
    .parameter "componentName"

    .prologue
    const/4 v1, 0x0

    .line 527
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 519
    #p0=(Reference);
    iput-boolean v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    .line 523
    new-instance v0, Ljava/util/LinkedList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    .line 525
    iput v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    .line 528
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    .line 529
    return-void
.end method

*/}
