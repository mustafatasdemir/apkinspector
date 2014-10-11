package android.support.v4.text; class ICUCompatIcs { void a() { int a;
a=0;// .class Landroid/support/v4/text/ICUCompatIcs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ICUCompatIcs.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ICUCompatIcs"
a=0;// 
a=0;// .field private static sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private static sGetScriptMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     :try_start_0
a=0;//     const-string v2, "libcore.icu.ICU"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 34
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     const-string v2, "getScript"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-class v5, Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 37
a=0;//     const-string v2, "addLikelySubtags"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     const-class v5, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "ICUCompatIcs"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/text/ICUCompatIcs;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addLikelySubtags(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "locale"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     :try_start_0
a=0;//     sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v0, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v0, v2
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "args":[Ljava/lang/Object;
a=0;//     sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 77
a=0;//     .end local v0    # "args":[Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 69
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 71
a=0;//     .local v1, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v2, "ICUCompatIcs"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .end local v1    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 77
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 75
a=0;//     .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v1=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v2, "ICUCompatIcs"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getScript(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "locale"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v0, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object p0, v0, v2
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "args":[Ljava/lang/Object;
a=0;//     sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 60
a=0;//     .end local v0    # "args":[Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 52
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v2, "ICUCompatIcs"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .end local v1    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 60
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v1=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v2, "ICUCompatIcs"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
