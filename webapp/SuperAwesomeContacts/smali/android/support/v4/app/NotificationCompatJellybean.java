package android.support.v4.app; class NotificationCompatJellybean { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatJellybean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatJellybean.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompatJellybean$Builder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final EXTRA_ACTION_EXTRAS:Ljava/lang/String; = "android.support.actionExtras"
a=0;// 
a=0;// .field static final EXTRA_GROUP_KEY:Ljava/lang/String; = "android.support.groupKey"
a=0;// 
a=0;// .field static final EXTRA_GROUP_SUMMARY:Ljava/lang/String; = "android.support.isGroupSummary"
a=0;// 
a=0;// .field static final EXTRA_LOCAL_ONLY:Ljava/lang/String; = "android.support.localOnly"
a=0;// 
a=0;// .field static final EXTRA_REMOTE_INPUTS:Ljava/lang/String; = "android.support.remoteInputs"
a=0;// 
a=0;// .field static final EXTRA_SORT_KEY:Ljava/lang/String; = "android.support.sortKey"
a=0;// 
a=0;// .field static final EXTRA_USE_SIDE_CHANNEL:Ljava/lang/String; = "android.support.useSideChannel"
a=0;// 
a=0;// .field private static final KEY_ACTION_INTENT:Ljava/lang/String; = "actionIntent"
a=0;// 
a=0;// .field private static final KEY_EXTRAS:Ljava/lang/String; = "extras"
a=0;// 
a=0;// .field private static final KEY_ICON:Ljava/lang/String; = "icon"
a=0;// 
a=0;// .field private static final KEY_REMOTE_INPUTS:Ljava/lang/String; = "remoteInputs"
a=0;// 
a=0;// .field private static final KEY_TITLE:Ljava/lang/String; = "title"
a=0;// 
a=0;// .field public static final TAG:Ljava/lang/String; = "NotificationCompat"
a=0;// 
a=0;// .field private static sActionClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static sActionIconField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static sActionIntentField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static sActionTitleField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static sActionsAccessFailed:Z
a=0;// 
a=0;// .field private static sActionsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static final sActionsLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private static sExtrasField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static sExtrasFieldAccessFailed:Z
a=0;// 
a=0;// .field private static final sExtrasLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatJellybean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addBigPictureStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V
a=0;//     .locals 3
a=0;//     .param p0, "b"    # Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "bigPicture"    # Landroid/graphics/Bitmap;
a=0;//     .param p5, "bigLargeIcon"    # Landroid/graphics/Bitmap;
a=0;//     .param p6, "bigLargeIconSet"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     new-instance v1, Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification$BigPictureStyle;);
a=0;//     invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v1, v2}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$BigPictureStyle;);
a=0;//     invoke-virtual {v1, p1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "style":Landroid/app/Notification$BigPictureStyle;
a=0;//     #v0=(Reference,Landroid/app/Notification$BigPictureStyle;);
a=0;//     if-eqz p6, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v0, p5}, Landroid/app/Notification$BigPictureStyle;->bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v0, p3}, Landroid/app/Notification$BigPictureStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     .line 177
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addBigTextStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p0, "b"    # Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "bigText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     new-instance v1, Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification$BigTextStyle;);
a=0;//     invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v1, v2}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$BigTextStyle;);
a=0;//     invoke-virtual {v1, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "style":Landroid/app/Notification$BigTextStyle;
a=0;//     #v0=(Reference,Landroid/app/Notification$BigTextStyle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v0, p3}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addInboxStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .param p0, "b"    # Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             "Z",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     .local p4, "texts":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
a=0;//     new-instance v3, Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification$InboxStyle;);
a=0;//     invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v3, v4}, Landroid/app/Notification$InboxStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$InboxStyle;);
a=0;//     invoke-virtual {v3, p1}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "style":Landroid/app/Notification$InboxStyle;
a=0;//     #v1=(Reference,Landroid/app/Notification$InboxStyle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v1, p3}, Landroid/app/Notification$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "text":Ljava/lang/CharSequence;
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     .end local v2    # "text":Ljava/lang/CharSequence;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/os/Bundle;",
a=0;//             ">;)",
a=0;//             "Landroid/util/SparseArray",
a=0;//             "<",
a=0;//             "Landroid/os/Bundle;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     .local p0, "actionExtrasList":Ljava/util/List;, "Ljava/util/List<Landroid/os/Bundle;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .local v2, "count":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/util/SparseArray;);v2=(Integer);v3=(Integer);
a=0;//     if-ge v3, v2, :cond_2
a=0;// 
a=0;//     .line 196
a=0;//     invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "actionExtras":Landroid/os/Bundle;
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v1, Landroid/util/SparseArray;
a=0;// 
a=0;//     .end local v1    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     #v1=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     .line 201
a=0;//     .restart local v1    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_1
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     .end local v0    # "actionExtras":Landroid/os/Bundle;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static ensureActionReflectionReadyLocked()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 318
a=0;//     #v1=(One);
a=0;//     sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 337
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v4=(Uninit);
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Field;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 323
a=0;//     const-string v3, "android.app.Notification$Action"
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 324
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v4, "icon"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 325
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 326
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v4, "actionIntent"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 327
a=0;//     const-class v3, Landroid/app/Notification;
a=0;// 
a=0;//     const-string v4, "actions"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 328
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 337
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 330
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 331
a=0;//     .local v0, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v0=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     const-string v3, "NotificationCompat"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Unable to access notification actions"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 332
a=0;//     sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 333
a=0;//     .end local v0    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 334
a=0;//     .local v0, "e":Ljava/lang/NoSuchFieldException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     const-string v3, "NotificationCompat"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Unable to access notification actions"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 335
a=0;//     sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "e":Ljava/lang/NoSuchFieldException;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 337
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 11
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;//     .param p1, "actionIndex"    # I
a=0;//     .param p2, "factory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p3, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     sget-object v10, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v10
a=0;// 
a=0;//     .line 279
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v7, v0, p1
a=0;// 
a=0;//     .line 280
a=0;//     .local v7, "actionObject":Ljava/lang/Object;
a=0;//     #v7=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 281
a=0;//     .local v5, "actionExtras":Landroid/os/Bundle;
a=0;//     #v5=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 282
a=0;//     .local v9, "extras":Landroid/os/Bundle;
a=0;//     #v9=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     const-string v0, "android.support.actionExtras"
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 285
a=0;//     .local v6, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     #v6=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v6, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .end local v5    # "actionExtras":Landroid/os/Bundle;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 289
a=0;//     .end local v6    # "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     .restart local v5    # "actionExtras":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/CharSequence;
a=0;// 
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-object v0, p2
a=0;// 
a=0;//     move-object v1, p3
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;);
a=0;//     invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v10
a=0;// 
a=0;//     .line 299
a=0;//     .end local v5    # "actionExtras":Landroid/os/Bundle;
a=0;//     .end local v7    # "actionObject":Ljava/lang/Object;
a=0;//     .end local v9    # "extras":Landroid/os/Bundle;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 294
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Uninit);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 295
a=0;//     .local v8, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v8=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v0, "NotificationCompat"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Unable to access notification actions"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 296
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     .line 298
a=0;//     monitor-exit v10
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     .end local v8    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v10
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionCount(Landroid/app/Notification;)I
a=0;//     .locals 3
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     sget-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 269
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 270
a=0;//     .local v0, "actionObjects":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 271
a=0;//     .end local v0    # "actionObjects":[Ljava/lang/Object;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static getActionFromBundle(Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 6
a=0;//     .param p0, "bundle"    # Landroid/os/Bundle;
a=0;//     .param p1, "actionFactory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p2, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     const-string v0, "icon"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "title"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     const-string v0, "actionIntent"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v3, Landroid/app/PendingIntent;
a=0;// 
a=0;//     const-string v0, "extras"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, "remoteInputs"
a=0;// 
a=0;//     invoke-static {p0, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 303
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 304
a=0;//     :try_start_0
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationCompatJellybean;->ensureActionReflectionReadyLocked()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 305
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,[Ljava/lang/Object;);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Boolean);v4=(Uninit);
a=0;//     sget-object v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 314
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 309
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 310
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v1, "NotificationCompat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Unable to access notification actions"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 311
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z
a=0;// 
a=0;//     .line 312
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 3
a=0;//     .param p1, "actionFactory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p2, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action$Factory;",
a=0;//             "Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;",
a=0;//             ")[",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     .local p0, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p1, v2}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 348
a=0;//     .local v0, "actions":[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v0=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-static {v2, p1, p2}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionFromBundle(Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 348
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getBundleForAction(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
a=0;//     .locals 3
a=0;//     .param p0, "action"    # Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 382
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "icon"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 383
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 384
a=0;//     const-string v1, "actionIntent"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 385
a=0;//     const-string v1, "extras"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 386
a=0;//     const-string v1, "remoteInputs"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 388
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;//     .locals 7
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 213
a=0;//     :try_start_0
a=0;//     sget-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     monitor-exit v4
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/os/Bundle;);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/reflect/Field;);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 218
a=0;//     const-class v5, Landroid/app/Notification;
a=0;// 
a=0;//     const-string v6, "extras"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 219
a=0;//     .local v2, "extrasField":Ljava/lang/reflect/Field;
a=0;//     #v2=(Reference,Ljava/lang/reflect/Field;);
a=0;//     const-class v5, Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     const-string v5, "NotificationCompat"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Notification.extras field is not of type Bundle"
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 221
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 222
a=0;//     :try_start_2
a=0;//     monitor-exit v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v5=(Boolean);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     sput-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 227
a=0;//     .end local v2    # "extrasField":Ljava/lang/reflect/Field;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "extras":Landroid/os/Bundle;
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 229
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     .end local v1    # "extras":Landroid/os/Bundle;
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 230
a=0;//     .restart local v1    # "extras":Landroid/os/Bundle;
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 232
a=0;//     :cond_3
a=0;//     :try_start_4
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     .end local v1    # "extras":Landroid/os/Bundle;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/lang/Throwable;);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     monitor-exit v4
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 233
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v5, "NotificationCompat"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Unable to access notification extras"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 238
a=0;//     .end local v0    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :goto_1
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
a=0;// 
a=0;//     .line 239
a=0;//     monitor-exit v4
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 236
a=0;//     .local v0, "e":Ljava/lang/NoSuchFieldException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     const-string v5, "NotificationCompat"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Unable to access notification extras"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.groupKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 2
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 392
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.localOnly"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .param p0, "actions"    # [Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 371
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/ArrayList;);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 373
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 374
a=0;//     .local v4, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .local v1, "arr$":[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v1=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 375
a=0;//     .local v0, "action":Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Landroid/support/v4/app/NotificationCompatJellybean;->getBundleForAction(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 374
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.sortKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 2
a=0;//     .param p0, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.isGroupSummary"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 6
a=0;//     .param p0, "factory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p1, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;//     .param p2, "icon"    # I
a=0;//     .param p3, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "actionIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p5, "extras"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     .local v5, "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v5=(Null);
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     const-string v0, "android.support.remoteInputs"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p5, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatBase$Action$Factory;);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object v4, p5
a=0;// 
a=0;//     .line 253
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
a=0;//     .locals 4
a=0;//     .param p0, "builder"    # Landroid/app/Notification$Builder;
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     .line 259
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 260
a=0;//     .local v0, "actionExtras":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     const-string v1, "android.support.remoteInputs"
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
}}
