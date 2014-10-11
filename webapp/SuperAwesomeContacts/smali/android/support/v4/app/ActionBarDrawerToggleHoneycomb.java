package android.support.v4.app; class ActionBarDrawerToggleHoneycomb { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarDrawerToggleHoneycomb.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;// .field private static final THEME_ATTRS:[I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x101030b
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;->THEME_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 98
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getThemeUpIndicator(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     sget-object v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb;->THEME_ATTRS:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {p0, v2}, Landroid/app/Activity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "result":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 95
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static setActionBarDescription(Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;
a=0;//     .locals 7
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "contentDescRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     new-instance p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     #p0=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #p0=(Reference,Ljava/lang/Object;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 74
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "sii":Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "actionBar":Landroid/app/ActionBar;
a=0;//     #v0=(Reference,Landroid/app/ActionBar;);
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
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
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 79
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x13
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-gt v3, v4, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar;->getSubtitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v3}, Landroid/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     .end local v0    # "actionBar":Landroid/app/ActionBar;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 84
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 85
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Couldn\'t set content description via JB-MR2 API"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setActionBarUpIndicator(Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;
a=0;//     .locals 7
a=0;//     .param p0, "info"    # Ljava/lang/Object;
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;//     .param p2, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p3, "contentDescRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance p0, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .end local p0    # "info":Ljava/lang/Object;
a=0;//     #p0=(UninitRef,Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #p0=(Reference,Ljava/lang/Object;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 52
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;// 
a=0;//     .line 53
a=0;//     .local v2, "sii":Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "actionBar":Landroid/app/ActionBar;
a=0;//     #v0=(Reference,Landroid/app/ActionBar;);
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeAsUpIndicator:Ljava/lang/reflect/Method;
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
a=0;//     aput-object p2, v4, v5
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->setHomeActionContentDescription:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 66
a=0;//     .end local v0    # "actionBar":Landroid/app/ActionBar;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 58
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 59
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     const-string v4, "Couldn\'t set home-as-up indicator via JB-MR2 API"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v3, v2, Landroid/support/v4/app/ActionBarDrawerToggleHoneycomb$SetIndicatorInfo;->upIndicatorView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_2
a=0;//     const-string v3, "ActionBarDrawerToggleHoneycomb"
a=0;// 
a=0;//     const-string v4, "Couldn\'t set home-as-up indicator"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
