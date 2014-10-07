package android.support.v4.app; class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo {/*

.class Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
.super Ljava/lang/Object;
.source "ActionBarDrawerToggleHoneycomb.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SetIndicatorInfo"
.end annotation


# instance fields
.field public setHomeActionContentDescription:Ljava/lang/reflect/Method;

.field public setHomeAsUpIndicator:Ljava/lang/reflect/Method;

.field public upIndicatorView:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 14
    .parameter "activity"

    .prologue
    const v13, 0x102002c

    #v13=(Integer);
    const/4 v12, 0x1

    #v12=(One);
    const/4 v11, 0x0

    .line 103
    #v11=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    :try_start_0
    #p0=(Reference);
    const-class v6, Landroid/app/ActionBar;

    #v6=(Reference);
    const-string v7, "setHomeAsUpIndicator"

    #v7=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    new-array v8, v8, [Ljava/lang/Class;

    #v8=(Reference);
    const/4 v9, 0x0

    #v9=(Null);
    const-class v10, Landroid/graphics/drawable/Drawable;

    #v10=(Reference);
    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    iput-object v6, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;

    .line 107
    const-class v6, Landroid/app/ActionBar;

    const-string v7, "setHomeActionContentDescription"

    const/4 v8, 0x1

    #v8=(One);
    new-array v8, v8, [Ljava/lang/Class;

    #v8=(Reference);
    const/4 v9, 0x0

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    iput-object v6, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 112
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    move-exception v6

    .line 116
    #v6=(Reference);
    invoke-virtual {p1, v13}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 117
    .local v2, home:Landroid/view/View;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 122
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 123
    .local v3, parent:Landroid/view/ViewGroup;
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 124
    .local v0, childCount:I
    #v0=(Integer);
    const/4 v6, 0x2

    #v6=(PosByte);
    if-ne v0, v6, :cond_0

    .line 129
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 130
    .local v1, first:Landroid/view/View;
    #v1=(Reference);
    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 131
    .local v4, second:Landroid/view/View;
    #v4=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v6

    #v6=(Integer);
    if-ne v6, v13, :cond_1

    move-object v5, v4

    .line 133
    .local v5, up:Landroid/view/View;
    :goto_1
    #v5=(Reference);
    instance-of v6, v5, Landroid/widget/ImageView;

    #v6=(Boolean);
    if-eqz v6, :cond_0

    .line 135
    check-cast v5, Landroid/widget/ImageView;

    .end local v5           #up:Landroid/view/View;
    iput-object v5, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;

    goto :goto_0

    :cond_1
    #v5=(Uninit);v6=(Integer);
    move-object v5, v1

    .line 131
    #v5=(Reference);
    goto :goto_1
.end method

*/}
