package android.support.v4.widget; class SlidingPaneLayout$SlidingPanelLayoutImplJB { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;
a=0;// .super Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "SlidingPanelLayoutImplJB"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mGetDisplayList:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private mRecreateDisplayList:Ljava/lang/reflect/Field;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1499
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V
a=0;// 
a=0;//     .line 1501
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;);
a=0;//     const-class v2, Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     const-string v3, "getDisplayList"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1506
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const-class v1, Landroid/view/View;
a=0;// 
a=0;//     const-string v2, "mRecreateDisplayList"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 1507
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 1511
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1502
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1503
a=0;//     .local v0, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v1, "SlidingPaneLayout"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Couldn\'t fetch getDisplayList method; dimming won\'t work right."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1508
a=0;//     .end local v0    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1509
a=0;//     .local v0, "e":Ljava/lang/NoSuchFieldException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     const-string v1, "SlidingPaneLayout"
a=0;// 
a=0;//     const-string v2, "Couldn\'t fetch mRecreateDisplayList field; dimming will be slow."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "parent"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1515
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1517
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mRecreateDisplayList:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 1518
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;->mGetDisplayList:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1527
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1528
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1519
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1520
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SlidingPaneLayout"
a=0;// 
a=0;//     const-string v2, "Error refreshing display list state"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1524
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->invalidate()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
