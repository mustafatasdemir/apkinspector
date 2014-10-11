package android.support.v4.text; class BidiFormatter$Builder { void a() { int a;
a=0;// .class public final Landroid/support/v4/text/BidiFormatter$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BidiFormatter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/text/BidiFormatter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFlags:I
a=0;// 
a=0;// .field private mIsRtlContext:Z
a=0;// 
a=0;// .field private mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 138
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-static {v0}, Landroid/support/v4/text/BidiFormatter;->access$000(Ljava/util/Locale;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/Locale;)V
a=0;//     .locals 1
a=0;//     .param p1, "locale"    # Ljava/util/Locale;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 156
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->access$000(Ljava/util/Locale;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "rtlContext"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/text/BidiFormatter$Builder;->initialize(Z)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getDefaultInstanceFromContext(Z)Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;//     .param p0, "isRtlContext"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$200()Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$300()Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initialize(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isRtlContext"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iput-boolean p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
a=0;// 
a=0;//     .line 166
a=0;//     invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     iput-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build()Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     invoke-static {}, Landroid/support/v4/text/BidiFormatter;->access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 205
a=0;//     iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->getDefaultInstanceFromContext(Z)Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter;);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mIsRtlContext:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget v2, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;Landroid/support/v4/text/BidiFormatter$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTextDirectionHeuristic(Landroid/support/v4/text/TextDirectionHeuristicCompat;)Landroid/support/v4/text/BidiFormatter$Builder;
a=0;//     .locals 0
a=0;//     .param p1, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iput-object p1, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 192
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public stereoReset(Z)Landroid/support/v4/text/BidiFormatter$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "stereoReset"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     .line 180
a=0;//     :goto_0
a=0;//     return-object p0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, -0x3
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/text/BidiFormatter$Builder;->mFlags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
