package android.support.v4.app; class NotificationCompat$WearableExtender { void a() { int a;
a=0;// .class public final Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationCompat$Extender;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "WearableExtender"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CONTENT_ICON_GRAVITY:I = 0x800005
a=0;// 
a=0;// .field private static final DEFAULT_FLAGS:I = 0x1
a=0;// 
a=0;// .field private static final DEFAULT_GRAVITY:I = 0x50
a=0;// 
a=0;// .field private static final EXTRA_WEARABLE_EXTENSIONS:Ljava/lang/String; = "android.wearable.EXTENSIONS"
a=0;// 
a=0;// .field private static final FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE:I = 0x1
a=0;// 
a=0;// .field private static final FLAG_HINT_HIDE_ICON:I = 0x2
a=0;// 
a=0;// .field private static final FLAG_HINT_SHOW_BACKGROUND_ONLY:I = 0x4
a=0;// 
a=0;// .field private static final FLAG_START_SCROLL_BOTTOM:I = 0x8
a=0;// 
a=0;// .field private static final KEY_ACTIONS:Ljava/lang/String; = "actions"
a=0;// 
a=0;// .field private static final KEY_BACKGROUND:Ljava/lang/String; = "background"
a=0;// 
a=0;// .field private static final KEY_CONTENT_ACTION_INDEX:Ljava/lang/String; = "contentActionIndex"
a=0;// 
a=0;// .field private static final KEY_CONTENT_ICON:Ljava/lang/String; = "contentIcon"
a=0;// 
a=0;// .field private static final KEY_CONTENT_ICON_GRAVITY:Ljava/lang/String; = "contentIconGravity"
a=0;// 
a=0;// .field private static final KEY_CUSTOM_CONTENT_HEIGHT:Ljava/lang/String; = "customContentHeight"
a=0;// 
a=0;// .field private static final KEY_CUSTOM_SIZE_PRESET:Ljava/lang/String; = "customSizePreset"
a=0;// 
a=0;// .field private static final KEY_DISPLAY_INTENT:Ljava/lang/String; = "displayIntent"
a=0;// 
a=0;// .field private static final KEY_FLAGS:Ljava/lang/String; = "flags"
a=0;// 
a=0;// .field private static final KEY_GRAVITY:Ljava/lang/String; = "gravity"
a=0;// 
a=0;// .field private static final KEY_PAGES:Ljava/lang/String; = "pages"
a=0;// 
a=0;// .field public static final SIZE_DEFAULT:I = 0x0
a=0;// 
a=0;// .field public static final SIZE_FULL_SCREEN:I = 0x5
a=0;// 
a=0;// .field public static final SIZE_LARGE:I = 0x4
a=0;// 
a=0;// .field public static final SIZE_MEDIUM:I = 0x3
a=0;// 
a=0;// .field public static final SIZE_SMALL:I = 0x2
a=0;// 
a=0;// .field public static final SIZE_XSMALL:I = 0x1
a=0;// 
a=0;// .field public static final UNSET_ACTION_INDEX:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActions:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mContentActionIndex:I
a=0;// 
a=0;// .field private mContentIcon:I
a=0;// 
a=0;// .field private mContentIconGravity:I
a=0;// 
a=0;// .field private mCustomContentHeight:I
a=0;// 
a=0;// .field private mCustomSizePreset:I
a=0;// 
a=0;// .field private mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private mFlags:I
a=0;// 
a=0;// .field private mGravity:I
a=0;// 
a=0;// .field private mPages:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/app/Notification;",
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
a=0;//     .line 1868
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1852
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$WearableExtender;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1853
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1855
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1858
a=0;//     const v0, 0x800005
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     .line 1859
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     .line 1860
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     .line 1862
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     .line 1869
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Notification;)V
a=0;//     .locals 11
a=0;//     .param p1, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     const v10, 0x800005
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/16 v9, 0x50
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 1871
a=0;//     #v6=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1852
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$WearableExtender;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1853
a=0;//     iput v8, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1855
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1858
a=0;//     iput v10, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     .line 1859
a=0;//     iput v6, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     .line 1860
a=0;//     iput v7, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     .line 1862
a=0;//     iput v9, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     .line 1872
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1873
a=0;//     .local v1, "extras":Landroid/os/Bundle;
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const-string v4, "android.wearable.EXTENSIONS"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1875
a=0;//     .local v3, "wearableBundle":Landroid/os/Bundle;
a=0;//     :goto_0
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1876
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "actions"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getActionsFromParcelableArrayList(Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1878
a=0;//     .local v0, "actions":[Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     #v0=(Reference,[Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1879
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1882
a=0;//     :cond_0
a=0;//     const-string v4, "flags"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1883
a=0;//     const-string v4, "displayIntent"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/app/PendingIntent;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 1885
a=0;//     const-string v4, "pages"
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/app/NotificationCompat;->access$500(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1887
a=0;//     .local v2, "pages":[Landroid/app/Notification;
a=0;//     #v2=(Reference,[Landroid/app/Notification;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1888
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v4, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1891
a=0;//     :cond_1
a=0;//     const-string v4, "background"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 1892
a=0;//     const-string v4, "contentIcon"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     .line 1893
a=0;//     const-string v4, "contentIconGravity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     .line 1895
a=0;//     const-string v4, "contentActionIndex"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     .line 1897
a=0;//     const-string v4, "customSizePreset"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     .line 1899
a=0;//     const-string v4, "customContentHeight"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     .line 1900
a=0;//     const-string v4, "gravity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     .line 1902
a=0;//     .end local v0    # "actions":[Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .end local v2    # "pages":[Landroid/app/Notification;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1873
a=0;//     .end local v3    # "wearableBundle":Landroid/os/Bundle;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Ljava/util/ArrayList;);v5=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setFlag(IZ)V
a=0;//     .locals 2
a=0;//     .param p1, "mask"    # I
a=0;//     .param p2, "value"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2365
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 2366
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 2370
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2368
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     xor-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAction(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1985
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1986
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addActions(Ljava/util/List;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ">;)",
a=0;//             "Landroid/support/v4/app/NotificationCompat$WearableExtender;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2002
a=0;//     .local p1, "actions":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/app/NotificationCompat$Action;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 2003
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addPage(Landroid/app/Notification;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "page"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2077
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 2078
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addPages(Ljava/util/List;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/app/Notification;",
a=0;//             ">;)",
a=0;//             "Landroid/support/v4/app/NotificationCompat$WearableExtender;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2092
a=0;//     .local p1, "pages":Ljava/util/List;, "Ljava/util/List<Landroid/app/Notification;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 2093
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public clearActions()Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2012
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 2013
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public clearPages()Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2102
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 2103
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1957
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$WearableExtender;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;-><init>()V
a=0;// 
a=0;//     .line 1958
a=0;//     .local v0, "that":Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$WearableExtender;);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1959
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1960
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 1961
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1962
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 1963
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     .line 1964
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     .line 1965
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     .line 1966
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     .line 1967
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     .line 1968
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     .line 1969
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1769
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->clone()Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$WearableExtender;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public extend(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;//     .locals 5
a=0;//     .param p1, "builder"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1911
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 1913
a=0;//     .local v0, "wearableBundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1914
a=0;//     const-string v2, "actions"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-array v4, v4, [Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     #v4=(Reference,[Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     invoke-interface {v3, v1}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 1918
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 1919
a=0;//     const-string v1, "flags"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1921
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1922
a=0;//     const-string v1, "displayIntent"
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1924
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 1925
a=0;//     const-string v2, "pages"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v3, v3, [Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Reference,[Landroid/app/Notification;);
a=0;//     invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Landroid/os/Parcelable;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1928
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1929
a=0;//     const-string v1, "background"
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1931
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1932
a=0;//     const-string v1, "contentIcon"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1934
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x800005
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_6
a=0;// 
a=0;//     .line 1935
a=0;//     const-string v1, "contentIconGravity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1937
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq v1, v2, :cond_7
a=0;// 
a=0;//     .line 1938
a=0;//     const-string v1, "contentActionIndex"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1941
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 1942
a=0;//     const-string v1, "customSizePreset"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1944
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 1945
a=0;//     const-string v1, "customContentHeight"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1947
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x50
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-eq v1, v2, :cond_a
a=0;// 
a=0;//     .line 1948
a=0;//     const-string v1, "gravity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1951
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "android.wearable.EXTENSIONS"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1952
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public getActions()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2020
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBackground()Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2140
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentAction()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2213
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentIcon()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2155
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentIconGravity()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2176
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentIntentAvailableOffline()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2323
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomContentHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2282
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomSizePreset()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2260
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplayIntent()Landroid/app/PendingIntent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2063
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGravity()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2234
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHintHideIcon()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2342
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getHintShowBackgroundOnly()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2361
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPages()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/app/Notification;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2114
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mPages:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStartScrollBottom()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2301
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBackground(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "background"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2127
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mBackground:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 2128
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentAction(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "actionIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2194
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentActionIndex:I
a=0;// 
a=0;//     .line 2195
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentIcon(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "icon"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2147
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIcon:I
a=0;// 
a=0;//     .line 2148
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentIconGravity(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "contentIconGravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2165
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mContentIconGravity:I
a=0;// 
a=0;//     .line 2166
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentIntentAvailableOffline(Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "contentIntentAvailableOffline"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2312
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
a=0;// 
a=0;//     .line 2313
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomContentHeight(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2271
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomContentHeight:I
a=0;// 
a=0;//     .line 2272
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomSizePreset(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "sizePreset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2247
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mCustomSizePreset:I
a=0;// 
a=0;//     .line 2248
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2054
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mDisplayIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     .line 2055
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setGravity(I)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 0
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2223
a=0;//     iput p1, p0, Landroid/support/v4/app/NotificationCompat$WearableExtender;->mGravity:I
a=0;// 
a=0;//     .line 2224
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHintHideIcon(Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "hintHideIcon"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2332
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
a=0;// 
a=0;//     .line 2333
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHintShowBackgroundOnly(Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "hintShowBackgroundOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2351
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
a=0;// 
a=0;//     .line 2352
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setStartScrollBottom(Z)Landroid/support/v4/app/NotificationCompat$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "startScrollBottom"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2291
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$WearableExtender;->setFlag(IZ)V
a=0;// 
a=0;//     .line 2292
a=0;//     return-object p0
a=0;// .end method
}}
