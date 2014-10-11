package android.support.v4.widget; class CursorAdapter$MyDataSetObserver { void a() { int a;
a=0;// .class Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;
a=0;// .super Landroid/database/DataSetObserver;
a=0;// .source "CursorAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/CursorAdapter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "MyDataSetObserver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/widget/CursorAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/widget/CursorAdapter;Landroid/support/v4/widget/CursorAdapter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/widget/CursorAdapter;
a=0;//     .param p2, "x1"    # Landroid/support/v4/widget/CursorAdapter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;-><init>(Landroid/support/v4/widget/CursorAdapter;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 473
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 474
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInvalidated()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 478
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/CursorAdapter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/CursorAdapter;->mDataValid:Z
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$MyDataSetObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->notifyDataSetInvalidated()V
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
}}
