package android.support.v4.app; class NotificationCompat$BigPictureStyle {/*

.class public Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
.super Landroid/support/v4/app/NotificationCompat$Style;
.source "NotificationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BigPictureStyle"
.end annotation


# instance fields
.field mBigLargeIcon:Landroid/graphics/Bitmap;

.field mBigLargeIconSet:Z

.field mPicture:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1256
    invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V

    .line 1257
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Builder;)V
    .locals 0
    .parameter "builder"

    .prologue
    .line 1259
    invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$Style;-><init>()V

    .line 1260
    #p0=(Reference);
    invoke-virtual {p0, p1}, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V

    .line 1261
    return-void
.end method


# virtual methods
.method public bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    .locals 1
    .parameter "b"

    .prologue
    .line 1293
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIcon:Landroid/graphics/Bitmap;

    .line 1294
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigLargeIconSet:Z

    .line 1295
    return-object p0
.end method

.method public bigPicture(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    .locals 0
    .parameter "b"

    .prologue
    .line 1285
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mPicture:Landroid/graphics/Bitmap;

    .line 1286
    return-object p0
.end method

.method public setBigContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    .locals 0
    .parameter "title"

    .prologue
    .line 1268
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigContentTitle:Ljava/lang/CharSequence;

    .line 1269
    return-object p0
.end method

.method public setSummaryText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
    .locals 1
    .parameter "cs"

    .prologue
    .line 1276
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryText:Ljava/lang/CharSequence;

    .line 1277
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryTextSet:Z

    .line 1278
    return-object p0
.end method

*/}
