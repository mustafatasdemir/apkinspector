package android.support.v4.app; class FragmentTabHost$DummyTabFactory { void a() { int a;
a=0;// .class Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentTabHost.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/TabHost$TabContentFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/FragmentTabHost;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "DummyTabFactory"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createTabContent(Ljava/lang/String;)Landroid/view/View;
a=0;//     .locals 3
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/View;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentTabHost$DummyTabFactory;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "v":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumWidth(I)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V
a=0;// 
a=0;//     .line 86
a=0;//     return-object v0
a=0;// .end method
}}
