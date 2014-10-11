package android.support.v7.internal.view; class SupportMenuInflater$InflatedOnMenuItemClickListener { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SupportMenuInflater.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "InflatedOnMenuItemClickListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PARAM_TYPES:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v2, Landroid/view/MenuItem;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->PARAM_TYPES:[Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "realOwner"    # Ljava/lang/Object;
a=0;//     .param p2, "methodName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 220
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 223
a=0;//     .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v3, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->PARAM_TYPES:[Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 231
a=0;//     return-void
a=0;// 
a=0;//     .line 224
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 225
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v2, Landroid/view/InflateException;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/InflateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Couldn\'t resolve menu item onClick handler "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " in class "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     .local v2, "ex":Landroid/view/InflateException;
a=0;//     #v2=(Reference,Landroid/view/InflateException;);
a=0;//     invoke-virtual {v2, v1}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 229
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;//     .locals 6
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_0
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 239
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v4=(Reference,[Ljava/lang/Object;);v5=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 238
a=0;//     :cond_0
a=0;//     #v1=(One);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 241
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 242
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
}}
