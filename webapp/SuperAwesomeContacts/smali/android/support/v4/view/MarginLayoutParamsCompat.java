package android.support.v4.view; class MarginLayoutParamsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/MarginLayoutParamsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MarginLayoutParamsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;,
a=0;//         Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;,
a=0;//         Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v1, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;);
a=0;//     sput-object v1, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;);
a=0;//     sput-object v1, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     #p0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isMarginRelative(Landroid/view/ViewGroup$MarginLayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->isMarginRelative(Landroid/view/ViewGroup$MarginLayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static resolveLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     .param p1, "layoutDirection"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->resolveLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;// 
a=0;//     .line 232
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     .param p1, "layoutDirection"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     .param p1, "marginEnd"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;// 
a=0;//     .line 193
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;//     .locals 1
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     .param p1, "marginStart"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
}}
