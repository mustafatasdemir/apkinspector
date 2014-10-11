package android.support.v4.widget; class PopupMenuCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/PopupMenuCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PopupMenuCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/PopupMenuCompat$KitKatPopupMenuImpl;,
a=0;//         Landroid/support/v4/widget/PopupMenuCompat$BasePopupMenuImpl;,
a=0;//         Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v1, Landroid/support/v4/widget/PopupMenuCompat$KitKatPopupMenuImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/PopupMenuCompat$KitKatPopupMenuImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/widget/PopupMenuCompat$KitKatPopupMenuImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/PopupMenuCompat$KitKatPopupMenuImpl;);
a=0;//     sput-object v1, Landroid/support/v4/widget/PopupMenuCompat;->IMPL:Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;
a=0;// 
a=0;//     .line 64
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/widget/PopupMenuCompat$BasePopupMenuImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/PopupMenuCompat$BasePopupMenuImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/widget/PopupMenuCompat$BasePopupMenuImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/PopupMenuCompat$BasePopupMenuImpl;);
a=0;//     sput-object v1, Landroid/support/v4/widget/PopupMenuCompat;->IMPL:Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Landroid/support/v4/widget/PopupMenuCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getDragToOpenListener(Ljava/lang/Object;)Landroid/view/View$OnTouchListener;
a=0;//     .locals 1
a=0;//     .param p0, "popupMenu"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     sget-object v0, Landroid/support/v4/widget/PopupMenuCompat;->IMPL:Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/widget/PopupMenuCompat$PopupMenuImpl;->getDragToOpenListener(Ljava/lang/Object;)Landroid/view/View$OnTouchListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
