package android.support.v7.internal.view; class SupportMenuInflater$InflatedOnMenuItemClickListener {/*

.class Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
.super Ljava/lang/Object;
.source "SupportMenuInflater.java"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/SupportMenuInflater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InflatedOnMenuItemClickListener"
.end annotation


# static fields
.field private static final PARAM_TYPES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private mMethod:Ljava/lang/reflect/Method;

.field private mRealOwner:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 214
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [Ljava/lang/Class;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const-class v2, Landroid/view/MenuItem;

    #v2=(Reference);
    aput-object v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->PARAM_TYPES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 5
    .parameter "realOwner"
    .parameter "methodName"

    .prologue
    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 223
    .local v0, c:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    :try_start_0
    #v0=(Reference);
    sget-object v3, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->PARAM_TYPES:[Ljava/lang/Class;

    #v3=(Reference);
    invoke-virtual {v0, p2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    return-void

    .line 224
    :catch_0
    #v3=(Conflicted);
    move-exception v1

    .line 225
    .local v1, e:Ljava/lang/Exception;
    #v1=(Reference);
    new-instance v2, Landroid/view/InflateException;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Couldn\'t resolve menu item onClick handler "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " in class "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 228
    .local v2, ex:Landroid/view/InflateException;
    #v2=(Reference);
    invoke-virtual {v2, v1}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 229
    throw v2
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6
    .parameter "item"

    .prologue
    const/4 v1, 0x1

    .line 235
    :try_start_0
    #v1=(One);
    iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    #v3=(Reference);
    if-ne v2, v3, :cond_0

    .line 236
    iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;

    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Object;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 239
    :goto_0
    #v1=(Boolean);v4=(Reference);v5=(Conflicted);
    return v1

    .line 238
    :cond_0
    #v1=(One);v4=(Uninit);v5=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mMethod:Ljava/lang/reflect/Method;

    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;->mRealOwner:Ljava/lang/Object;

    const/4 v4, 0x1

    #v4=(One);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    aput-object p1, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 241
    :catch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v0

    .line 242
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    new-instance v1, Ljava/lang/RuntimeException;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    #v1=(Reference);
    throw v1
.end method

*/}
