package android.support.v4.text; class ICUCompatIcs {/*

.class Landroid/support/v4/text/ICUCompatIcs;
.super Ljava/lang/Object;
.source "ICUCompatIcs.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ICUCompatIcs"

.field private static sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;

.field private static sGetScriptMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 33
    :try_start_0
    const-string v2, "libcore.icu.ICU"

    #v2=(Reference);
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 34
    .local v0, clazz:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 35
    const-string v2, "getScript"

    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const-class v5, Ljava/lang/String;

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;

    .line 37
    const-string v2, "addLikelySubtags"

    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 40
    :catch_0
    move-exception v1

    .line 42
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    const-string v2, "ICUCompatIcs"

    #v2=(Reference);
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static addLikelySubtags(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .parameter "locale"

    .prologue
    .line 65
    :try_start_0
    sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 66
    const/4 v2, 0x1

    #v2=(One);
    new-array v0, v2, [Ljava/lang/Object;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object p0, v0, v2

    .line 67
    .local v0, args:[Ljava/lang/Object;
    sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    .end local v0           #args:[Ljava/lang/Object;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-object v2

    .line 69
    :catch_0
    move-exception v1

    .line 71
    .local v1, e:Ljava/lang/IllegalAccessException;
    #v1=(Reference);
    const-string v2, "ICUCompatIcs"

    #v2=(Reference);
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v1           #e:Ljava/lang/IllegalAccessException;
    :cond_0
    :goto_1
    #v1=(Conflicted);
    move-object v2, p0

    .line 77
    goto :goto_0

    .line 73
    :catch_1
    move-exception v1

    .line 75
    .local v1, e:Ljava/lang/reflect/InvocationTargetException;
    #v1=(Reference);
    const-string v2, "ICUCompatIcs"

    #v2=(Reference);
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public static getScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .parameter "locale"

    .prologue
    const/4 v3, 0x0

    .line 48
    :try_start_0
    #v3=(Null);
    sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 49
    const/4 v2, 0x1

    #v2=(One);
    new-array v0, v2, [Ljava/lang/Object;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    aput-object p0, v0, v2

    .line 50
    .local v0, args:[Ljava/lang/Object;
    sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;

    #v2=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 60
    .end local v0           #args:[Ljava/lang/Object;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    return-object v2

    .line 52
    :catch_0
    #v1=(Uninit);v2=(Conflicted);
    move-exception v1

    .line 54
    .local v1, e:Ljava/lang/IllegalAccessException;
    #v1=(Reference);
    const-string v2, "ICUCompatIcs"

    #v2=(Reference);
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v1           #e:Ljava/lang/IllegalAccessException;
    :cond_0
    :goto_1
    #v1=(Conflicted);
    move-object v2, v3

    .line 60
    #v2=(Null);
    goto :goto_0

    .line 56
    :catch_1
    #v1=(Uninit);v2=(Conflicted);
    move-exception v1

    .line 58
    .local v1, e:Ljava/lang/reflect/InvocationTargetException;
    #v1=(Reference);
    const-string v2, "ICUCompatIcs"

    #v2=(Reference);
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

*/}
