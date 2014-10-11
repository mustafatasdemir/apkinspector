package android.support.v4.text; class TextDirectionHeuristicsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/text/TextDirectionHeuristicsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TextDirectionHeuristicsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$1;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;,
a=0;//         Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ANYRTL_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field public static final FIRSTSTRONG_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field public static final FIRSTSTRONG_RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field public static final LOCALE:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field public static final LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field public static final RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// .field private static final STATE_FALSE:I = 0x1
a=0;// 
a=0;// .field private static final STATE_TRUE:I = 0x0
a=0;// 
a=0;// .field private static final STATE_UNKNOWN:I = 0x2
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     invoke-direct {v0, v2, v3, v2}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;ZLandroid/support/v4/text/TextDirectionHeuristicsCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     invoke-direct {v0, v2, v4, v2}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;ZLandroid/support/v4/text/TextDirectionHeuristicsCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sget-object v1, Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;->INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;);
a=0;//     invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;ZLandroid/support/v4/text/TextDirectionHeuristicsCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sget-object v1, Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;->INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$FirstStrong;
a=0;// 
a=0;//     invoke-direct {v0, v1, v4, v2}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;ZLandroid/support/v4/text/TextDirectionHeuristicsCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_RTL:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sget-object v1, Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;->INSTANCE_RTL:Landroid/support/v4/text/TextDirectionHeuristicsCompat$AnyStrong;
a=0;// 
a=0;//     invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;-><init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;ZLandroid/support/v4/text/TextDirectionHeuristicsCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->ANYRTL_LTR:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;->INSTANCE:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale;
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->LOCALE:Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 242
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(I)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-static {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->isRtlTextOrFormat(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(I)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-static {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat;->isRtlText(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static isRtlText(I)I
a=0;//     .locals 1
a=0;//     .param p0, "directionality"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 81
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static isRtlTextOrFormat(I)I
a=0;//     .locals 1
a=0;//     .param p0, "directionality"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     sparse-switch p0, :sswitch_data_0
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 95
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_0
a=0;//         0x1 -> :sswitch_1
a=0;//         0x2 -> :sswitch_1
a=0;//         0xe -> :sswitch_0
a=0;//         0xf -> :sswitch_0
a=0;//         0x10 -> :sswitch_1
a=0;//         0x11 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
