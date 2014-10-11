package android.support.v7.internal.widget; class AdapterViewICS$SelectionNotifier { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AdapterViewICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "SelectionNotifier"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/AdapterViewICS$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 853
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 859
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 860
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 865
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 863
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$200(Landroid/support/v7/internal/widget/AdapterViewICS;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
