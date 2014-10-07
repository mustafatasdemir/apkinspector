package android.support.v4.widget; class ContentLoadingProgressBar {/*

.class public Landroid/support/v4/widget/ContentLoadingProgressBar;
.super Landroid/widget/ProgressBar;
.source "ContentLoadingProgressBar.java"


# static fields
.field private static final MIN_DELAY:I = 0x1f4

.field private static final MIN_SHOW_TIME:I = 0x1f4


# instance fields
.field private final mDelayedHide:Ljava/lang/Runnable;

.field private final mDelayedShow:Ljava/lang/Runnable;

.field private mDismissed:Z

.field private mPostedHide:Z

.field private mPostedShow:Z

.field private mStartTime:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 65
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v2, 0x0

    .line 69
    #v2=(Null);
    invoke-direct {p0, p1, p2, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    #p0=(Reference);
    const-wide/16 v0, -0x1

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J

    .line 36
    iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z

    .line 38
    iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z

    .line 40
    iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z

    .line 42
    new-instance v0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$1;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;

    .line 52
    new-instance v0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$2;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;

    .line 70
    return-void
.end method

.method static synthetic access$002(Landroid/support/v4/widget/ContentLoadingProgressBar;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 30
    iput-boolean p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z

    return p1
.end method

.method static synthetic access$102(Landroid/support/v4/widget/ContentLoadingProgressBar;J)J
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 30
    iput-wide p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J

    return-wide p1
.end method

.method static synthetic access$202(Landroid/support/v4/widget/ContentLoadingProgressBar;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 30
    iput-boolean p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z

    return p1
.end method

.method static synthetic access$300(Landroid/support/v4/widget/ContentLoadingProgressBar;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 30
    iget-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z

    #v0=(Boolean);
    return v0
.end method

.method private removeCallbacks()V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 86
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 87
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 9

    .prologue
    const-wide/16 v7, 0x1f4

    #v7=(LongLo);v8=(LongHi);
    const/4 v6, 0x1

    .line 95
    #v6=(One);
    iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z

    .line 96
    iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iget-wide v4, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J

    #v4=(LongLo);v5=(LongHi);
    sub-long v0, v2, v4

    .line 98
    .local v0, diff:J
    #v0=(LongLo);v1=(LongHi);
    cmp-long v2, v0, v7

    #v2=(Byte);
    if-gez v2, :cond_0

    iget-wide v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J

    #v2=(LongLo);
    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    #v2=(Byte);
    if-nez v2, :cond_2

    .line 102
    :cond_0
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->setVisibility(I)V

    .line 112
    :cond_1
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 107
    :cond_2
    #v2=(Byte);v3=(LongHi);v4=(LongLo);
    iget-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 108
    iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;

    #v2=(Reference);
    sub-long v3, v7, v0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {p0, v2, v3, v4}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 109
    iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z

    goto :goto_0
.end method

.method public onAttachedToWindow()V
    .locals 0

    .prologue
    .line 74
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 75
    invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V

    .line 76
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 80
    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    .line 81
    invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V

    .line 82
    return-void
.end method

.method public show()V
    .locals 3

    .prologue
    .line 120
    const-wide/16 v0, -0x1

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J

    .line 121
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z

    .line 122
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 123
    iget-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;

    #v0=(Reference);
    const-wide/16 v1, 0x1f4

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 125
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z

    .line 127
    :cond_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

*/}
