package android.support.v4.widget; class SlidingPaneLayout$SlidingPanelLayoutImplJB {/*

.class Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;
.super Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
.source "SlidingPaneLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SlidingPaneLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SlidingPanelLayoutImplJB"
.end annotation


# instance fields
.field private mGetDisplayList:Ljava/lang/reflect/Method;

.field private mRecreateDisplayList:Ljava/lang/reflect/Field;


# direct methods
.method constructor <init>()V
    .locals 4

    .prologue
    .line 1499
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V

    .line 1501
    :try_start_0
    #p0=(Reference);
    const-class v2, Landroid/view/View;

    #v2=(Reference);
    const-string v3, "getDisplayList"

    #v3=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    check-cast v1, [Ljava/lang/Class;

    #v1=(Reference);
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1506
    :goto_0
    :try_start_1
    #v0=(Conflicted);v3=(Conflicted);
    const-class v1, Landroid/view/View;

    const-string v2, "mRecreateDisplayList"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;

    .line 1507
    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1511
    :goto_1
    #v2=(Conflicted);
    return-void

    .line 1502
    :catch_0
    #v0=(Uninit);v1=(Conflicted);
    move-exception v0

    .line 1503
    .local v0, e:Ljava/lang/NoSuchMethodException;
    #v0=(Reference);
    const-string v1, "SlidingPaneLayout"

    #v1=(Reference);
    const-string v2, "Couldn\'t fetch getDisplayList method; dimming won\'t work right."

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 1508
    .end local v0           #e:Ljava/lang/NoSuchMethodException;
    :catch_1
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    .line 1509
    .local v0, e:Ljava/lang/NoSuchFieldException;
    #v0=(Reference);
    const-string v1, "SlidingPaneLayout"

    const-string v2, "Couldn\'t fetch mRecreateDisplayList field; dimming will be slow."

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method


# virtual methods
.method public invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
    .locals 3
    .parameter "parent"
    .parameter "child"

    .prologue
    .line 1515
    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_0

    .line 1517
    :try_start_0
    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 1518
    iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;

    #v2=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    check-cast v1, [Ljava/lang/Object;

    #v1=(Reference);
    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1527
    :goto_0
    #v0=(Conflicted);
    invoke-super {p0, p1, p2}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V

    .line 1528
    :goto_1
    #v2=(Conflicted);
    return-void

    .line 1519
    :catch_0
    #v0=(Uninit);
    move-exception v0

    .line 1520
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "SlidingPaneLayout"

    const-string v2, "Error refreshing display list state"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 1524
    .end local v0           #e:Ljava/lang/Exception;
    :cond_0
    #v0=(Uninit);v2=(Uninit);
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    goto :goto_1
.end method

*/}
