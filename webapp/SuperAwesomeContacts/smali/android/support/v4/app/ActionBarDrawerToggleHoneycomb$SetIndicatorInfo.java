package android.support.v4.app; class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarDrawerToggleHoneycomb.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "SetIndicatorInfo"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public setHomeActionContentDescription:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field public setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field public upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 14
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const v13, 0x102002c
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v11=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;);
a=0;//     const-class v6, Landroid/app/ActionBar;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     const-string v7, "setHomeAsUpIndicator"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const-class v10, Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 107
a=0;//     const-class v6, Landroid/app/ActionBar;
a=0;// 
a=0;//     const-string v7, "setHomeActionContentDescription"
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 116
a=0;//     #v6=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {p1, v13}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "home":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 123
a=0;//     .local v3, "parent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "first":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 131
a=0;//     .local v4, "second":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v6, v13, :cond_1
a=0;// 
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 133
a=0;//     .local v5, "up":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     instance-of v6, v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     .end local v5    # "up":Landroid/view/View;
a=0;//     iput-object v5, p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Uninit);v6=(Integer);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     .line 131
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     goto :goto_1
a=0;// .end method
}}
