package android.support.v7.internal.widget; class AdapterViewICS$OnItemClickListenerWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AdapterViewICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "OnItemClickListenerWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p2, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.OnItemClickListenerWrapper;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 266
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 6
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.OnItemClickListenerWrapper;"
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;->onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
}}
