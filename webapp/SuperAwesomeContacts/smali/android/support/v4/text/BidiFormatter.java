package android.support.v4.text; class BidiFormatter { void a() { int a;
a=0;// .class public final Landroid/support/v4/text/BidiFormatter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BidiFormatter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/text/BidiFormatter$1;,
a=0;//         Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;,
a=0;//         Landroid/support/v4/text/BidiFormatter$Builder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_FLAGS:I = 0x2
a=0;// 
a=0;// .field private static final DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;// .field private static final DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;// .field private static DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat; = null
a=0;// 
a=0;// .field private static final DIR_LTR:I = -0x1
a=0;// 
a=0;// .field private static final DIR_RTL:I = 0x1
a=0;// 
a=0;// .field private static final DIR_UNKNOWN:I = 0x0
a=0;// 
a=0;// .field private static final EMPTY_STRING:Ljava/lang/String; = ""
a=0;// 
a=0;// .field private static final FLAG_STEREO_RESET:I = 0x2
a=0;// 
a=0;// .field private static final LRE:C = '\u202a'
a=0;// 
a=0;// .field private static final LRM:C = '\u200e'
a=0;// 
a=0;// .field private static final LRM_STRING:Ljava/lang/String;
a=0;// 
a=0;// .field private static final PDF:C = '\u202c'
a=0;// 
a=0;// .field private static final RLE:C = '\u202b'
a=0;// 
a=0;// .field private static final RLM:C = '\u200f'
a=0;// 
a=0;// .field private static final RLM_STRING:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field private final mFlags:I
a=0;// 
a=0;// .field private final mIsRtlContext:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 83
a=0;//     #v3=(PosByte);
a=0;//     sget-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 113
a=0;//     const/16 v0, 0x200e
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     .line 118
a=0;//     const/16 v0, 0x200f
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget-object v2, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     sput-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V
a=0;//     .locals 0
a=0;//     .param p1, "isRtlContext"    # Z
a=0;//     .param p2, "flags"    # I
a=0;//     .param p3, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 261
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     iput-boolean p1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     .line 262
a=0;//     iput p2, p0, Landroid/support/v4/text/BidiFormatter;->mFlags:I
a=0;// 
a=0;//     .line 263
a=0;//     iput-object p3, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;Landroid/support/v4/text/BidiFormatter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Z
a=0;//     .param p2, "x1"    # I
a=0;//     .param p3, "x2"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;//     .param p4, "x3"    # Landroid/support/v4/text/BidiFormatter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/text/BidiFormatter;-><init>(ZILandroid/support/v4/text/TextDirectionHeuristicCompat;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Ljava/util/Locale;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Ljava/util/Locale;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-static {p0}, Landroid/support/v4/text/BidiFormatter;->isRtlLocale(Ljava/util/Locale;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100()Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_TEXT_DIRECTION_HEURISTIC:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200()Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_RTL_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300()Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     sget-object v0, Landroid/support/v4/text/BidiFormatter;->DEFAULT_LTR_INSTANCE:Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getEntryDir(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getEntryDir()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static getExitDir(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$DirectionalityEstimator;->getExitDir()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Ljava/util/Locale;)Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;//     .param p0, "locale"    # Ljava/util/Locale;
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Ljava/util/Locale;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Z)Landroid/support/v4/text/BidiFormatter;
a=0;//     .locals 1
a=0;//     .param p0, "rtlContext"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     new-instance v0, Landroid/support/v4/text/BidiFormatter$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/text/BidiFormatter$Builder;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/BidiFormatter$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/text/BidiFormatter$Builder;->build()Landroid/support/v4/text/BidiFormatter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static isRtlLocale(Ljava/util/Locale;)Z
a=0;//     .locals 2
a=0;//     .param p0, "locale"    # Ljava/util/Locale;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 437
a=0;//     #v0=(One);
a=0;//     invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private markAfter(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;//     .param p2, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 299
a=0;//     .local v0, "isRtl":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 300
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     .line 305
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 302
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getExitDir(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 303
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 305
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private markBefore(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;//     .param p2, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p2, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 326
a=0;//     .local v0, "isRtl":Z
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/text/BidiFormatter;->LRM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     .line 332
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 329
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/text/BidiFormatter;->getEntryDir(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 330
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/text/BidiFormatter;->RLM_STRING:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 332
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getStereoReset()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     iget v0, p0, Landroid/support/v4/text/BidiFormatter;->mFlags:I
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
a=0;// .method public isRtl(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, p1, v1, v2}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isRtlContext()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     iget-boolean v0, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public unicodeWrap(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;//     .param p2, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;//     .param p2, "heuristic"    # Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;//     .param p3, "isolate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p2, p1, v2, v3}, Landroid/support/v4/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 375
a=0;//     .local v0, "isRtl":Z
a=0;//     #v0=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 376
a=0;//     .local v1, "result":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/BidiFormatter;->getStereoReset()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 377
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markBefore(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 380
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/text/BidiFormatter;->mIsRtlContext:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eq v0, v2, :cond_4
a=0;// 
a=0;//     .line 381
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/16 v2, 0x202b
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 382
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 383
a=0;//     const/16 v2, 0x202c
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 387
a=0;//     :goto_2
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 388
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     invoke-direct {p0, p1, v2}, Landroid/support/v4/text/BidiFormatter;->markAfter(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 391
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 377
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 381
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     const/16 v2, 0x202a
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 385
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 388
a=0;//     :cond_5
a=0;//     #v2=(PosShort);
a=0;//     sget-object v2, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public unicodeWrap(Ljava/lang/String;Z)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "str"    # Ljava/lang/String;
a=0;//     .param p2, "isolate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 416
a=0;//     iget-object v0, p0, Landroid/support/v4/text/BidiFormatter;->mDefaultTextDirectionHeuristicCompat:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicCompat;);
a=0;//     invoke-virtual {p0, p1, v0, p2}, Landroid/support/v4/text/BidiFormatter;->unicodeWrap(Ljava/lang/String;Landroid/support/v4/text/TextDirectionHeuristicCompat;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
