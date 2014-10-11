package android.support.v4.view; class ViewConfigurationCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewConfigurationCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewConfigurationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;,
a=0;//         Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;,
a=0;//         Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;
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
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewConfigurationCompat$FroyoViewConfigurationVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewConfigurationCompat;->IMPL:Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;
a=0;// 
a=0;//     .line 63
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewConfigurationCompat$BaseViewConfigurationVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewConfigurationCompat;->IMPL:Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewConfigurationCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;//     .locals 1
a=0;//     .param p0, "config"    # Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget-object v0, Landroid/support/v4/view/ViewConfigurationCompat;->IMPL:Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/ViewConfigurationCompat$ViewConfigurationVersionImpl;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
