package android.support.v7.widget; class ShareActionProvider$ShareActivityChooserModelPolicy { void a() { int a;
a=0;// .class Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/widget/ShareActionProvider;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ShareActivityChooserModelPolicy"
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
a=0;//     .line 341
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/widget/ShareActionProvider;
a=0;//     .param p2, "x1"    # Landroid/support/v7/widget/ShareActionProvider$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;-><init>(Landroid/support/v7/widget/ShareActionProvider;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onChooseActivity(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/Intent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "host"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     .param p2, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 344
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     invoke-static {v0}, Landroid/support/v7/widget/ShareActionProvider;->access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/widget/ShareActionProvider;->access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;->this$0:Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     invoke-interface {v0, v1, p2}, Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;->onShareTargetSelected(Landroid/support/v7/widget/ShareActionProvider;Landroid/content/Intent;)Z
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
}}
