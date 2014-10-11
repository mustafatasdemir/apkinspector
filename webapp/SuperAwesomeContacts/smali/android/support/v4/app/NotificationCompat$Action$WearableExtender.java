package android.support.v4.app; class NotificationCompat$Action$WearableExtender { void a() { int a;
a=0;// .class public final Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationCompat$Action$Extender;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat$Action;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "WearableExtender"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_FLAGS:I = 0x1
a=0;// 
a=0;// .field private static final EXTRA_WEARABLE_EXTENSIONS:Ljava/lang/String; = "android.wearable.EXTENSIONS"
a=0;// 
a=0;// .field private static final FLAG_AVAILABLE_OFFLINE:I = 0x1
a=0;// 
a=0;// .field private static final KEY_FLAGS:Ljava/lang/String; = "flags"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFlags:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1630
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1624
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1631
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Action;)V
a=0;//     .locals 4
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1638
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1624
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;);
a=0;//     iput v3, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1639
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "android.wearable.EXTENSIONS"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1640
a=0;//     .local v0, "wearableBundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1641
a=0;//     const-string v1, "flags"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1643
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setFlag(IZ)V
a=0;//     .locals 2
a=0;//     .param p1, "mask"    # I
a=0;//     .param p2, "value"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1691
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 1692
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1696
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1694
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     xor-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1664
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;-><init>()V
a=0;// 
a=0;//     .line 1665
a=0;//     .local v0, "that":Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     .line 1666
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
a=0;//     .line 1612
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->clone()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public extend(Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;//     .locals 3
a=0;//     .param p1, "builder"    # Landroid/support/v4/app/NotificationCompat$Action$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1652
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 1654
a=0;//     .local v0, "wearableBundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 1655
a=0;//     const-string v1, "flags"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1658
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action$Builder;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "android.wearable.EXTENSIONS"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 1659
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public isAvailableOffline()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1687
a=0;//     iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I
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
a=0;// .method public setAvailableOffline(Z)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
a=0;//     .locals 1
a=0;//     .param p1, "availableOffline"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1676
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->setFlag(IZ)V
a=0;// 
a=0;//     .line 1677
a=0;//     return-object p0
a=0;// .end method
}}
