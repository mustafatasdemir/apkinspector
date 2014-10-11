package android.support.v4.widget; class ContentLoadingProgressBar { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/ContentLoadingProgressBar;
a=0;// .super Landroid/widget/ProgressBar;
a=0;// .source "ContentLoadingProgressBar.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MIN_DELAY:I = 0x1f4
a=0;// 
a=0;// .field private static final MIN_SHOW_TIME:I = 0x1f4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDelayedHide:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private final mDelayedShow:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mDismissed:Z
a=0;// 
a=0;// .field private mPostedHide:Z
a=0;// 
a=0;// .field private mPostedShow:Z
a=0;// 
a=0;// .field private mStartTime:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ContentLoadingProgressBar;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, v2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ContentLoadingProgressBar;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
a=0;// 
a=0;//     .line 36
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
a=0;// 
a=0;//     .line 40
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ContentLoadingProgressBar$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$1;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ContentLoadingProgressBar$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/support/v4/widget/ContentLoadingProgressBar$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ContentLoadingProgressBar$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/ContentLoadingProgressBar$2;-><init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ContentLoadingProgressBar$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$002(Landroid/support/v4/widget/ContentLoadingProgressBar;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ContentLoadingProgressBar;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$102(Landroid/support/v4/widget/ContentLoadingProgressBar;J)J
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ContentLoadingProgressBar;
a=0;//     .param p1, "x1"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iput-wide p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
a=0;// 
a=0;//     return-wide p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$202(Landroid/support/v4/widget/ContentLoadingProgressBar;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ContentLoadingProgressBar;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/widget/ContentLoadingProgressBar;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/ContentLoadingProgressBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private removeCallbacks()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hide()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v7, 0x1f4
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 95
a=0;//     #v6=(One);
a=0;//     iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 97
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v4, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v0, v2, v4
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "diff":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v2, v0, v7
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     iget-wide v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 107
a=0;//     :cond_2
a=0;//     #v2=(Byte);v3=(LongHi);v4=(LongLo);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     sub-long v3, v7, v0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0, v2, v3, v4}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 109
a=0;//     iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAttachedToWindow()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
a=0;// 
a=0;//     .line 121
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 123
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     const-wide/16 v1, 0x1f4
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 125
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
