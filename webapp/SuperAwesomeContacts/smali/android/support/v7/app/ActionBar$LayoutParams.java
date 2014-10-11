package android.support.v7.app; class ActionBar$LayoutParams { void a() { int a;
a=0;// .class public Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// .source "ActionBar.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBar;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "LayoutParams"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public gravity:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1070
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(III)V
a=0;// 
a=0;//     .line 1071
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1060
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1048
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1061
a=0;//     const/16 v0, 0x13
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1062
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(III)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;//     .param p3, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1065
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1048
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1066
a=0;//     iput p3, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1067
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "c"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 1051
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1048
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     iput v2, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1053
a=0;//     sget-object v1, Landroid/support/v7/appcompat/R$styleable;->ActionBarLayout:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1055
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1056
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1057
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v7/app/ActionBar$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1074
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1048
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1076
a=0;//     iget v0, p1, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1077
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1080
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1048
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1081
a=0;//     return-void
a=0;// .end method
}}
