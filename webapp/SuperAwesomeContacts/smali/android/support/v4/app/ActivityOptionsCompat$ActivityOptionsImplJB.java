package android.support.v4.app; class ActivityOptionsCompat$ActivityOptionsImplJB { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// .super Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// .source "ActivityOptionsCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "ActivityOptionsImplJB"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;//     .locals 0
a=0;//     .param p1, "impl"    # Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ActivityOptionsCompat;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toBundle()Landroid/os/Bundle;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/ActivityOptionsCompatJB;->toBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public update(Landroid/support/v4/app/ActivityOptionsCompat;)V
a=0;//     .locals 3
a=0;//     .param p1, "otherOptions"    # Landroid/support/v4/app/ActivityOptionsCompat;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     instance-of v1, p1, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Reference,Landroid/support/v4/app/ActivityOptionsCompat;);
a=0;//     check-cast v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;//     iget-object v1, p0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     iget-object v2, v0, Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;->mImpl:Landroid/support/v4/app/ActivityOptionsCompatJB;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/ActivityOptionsCompatJB;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/app/ActivityOptionsCompatJB;->update(Landroid/support/v4/app/ActivityOptionsCompatJB;)V
a=0;// 
a=0;//     .line 130
a=0;//     .end local v0    # "otherImpl":Landroid/support/v4/app/ActivityOptionsCompat$ActivityOptionsImplJB;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
