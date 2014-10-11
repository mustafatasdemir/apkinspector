package android.support.v7.internal.view.menu; class BaseWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/BaseWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseWrapper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mWrappedObject:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseWrapper;, "Landroid/support/v7/internal/view/menu/BaseWrapper<TT;>;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/BaseWrapper;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Wrapped Object can not be null."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/BaseWrapper;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getWrappedObject()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseWrapper;, "Landroid/support/v7/internal/view/menu/BaseWrapper<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseWrapper;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
}}
