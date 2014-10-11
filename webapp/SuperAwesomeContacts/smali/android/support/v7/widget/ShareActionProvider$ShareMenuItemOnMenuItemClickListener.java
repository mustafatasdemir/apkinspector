package android.support.v7.widget; class ShareActionProvider$ShareMenuItemOnMenuItemClickListener { void a() { int a;
a=0;// .class Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/widget/ShareActionProvider;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ShareMenuItemOnMenuItemClickListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/widget/ShareActionProvider;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/widget/ShareActionProvider;
a=0;//     .param p2, "x1"    # Landroid/support/v7/widget/ShareActionProvider$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;-><init>(Landroid/support/v7/widget/ShareActionProvider;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;//     .locals 5
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iget-object v3, p0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     invoke-static {v3}, Landroid/support/v7/widget/ShareActionProvider;->access$100(Landroid/support/v7/widget/ShareActionProvider;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     invoke-static {v4}, Landroid/support/v7/widget/ShareActionProvider;->access$200(Landroid/support/v7/widget/ShareActionProvider;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 314
a=0;//     .local v1, "itemId":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 315
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     const/high16 v3, 0x80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v3, p0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     invoke-static {v3}, Landroid/support/v7/widget/ShareActionProvider;->access$100(Landroid/support/v7/widget/ShareActionProvider;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 319
a=0;//     :cond_0
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     return v3
a=0;// .end method
}}
