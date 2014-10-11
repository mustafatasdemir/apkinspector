package android.support.v4.widget; class EdgeEffectCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EdgeEffectCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;,
a=0;//         Landroid/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;,
a=0;//         Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectIcsImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$BaseEdgeEffectImpl;);
a=0;//     sput-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 133
a=0;//     #p0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->newEdgeEffect(Landroid/content/Context;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public draw(Landroid/graphics/Canvas;)Z
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->draw(Ljava/lang/Object;Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public finish()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->finish(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isFinished()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->isFinished(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onAbsorb(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onAbsorb(Ljava/lang/Object;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPull(F)Z
a=0;//     .locals 2
a=0;//     .param p1, "deltaDistance"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onPull(Ljava/lang/Object;F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onRelease()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onRelease(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setSize(II)V
a=0;//     .locals 2
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->setSize(Ljava/lang/Object;II)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
}}
