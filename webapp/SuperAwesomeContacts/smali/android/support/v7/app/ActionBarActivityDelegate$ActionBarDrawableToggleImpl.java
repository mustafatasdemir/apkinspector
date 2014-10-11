package android.support.v7.app; class ActionBarActivityDelegate$ActionBarDrawableToggleImpl { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarActivityDelegate.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActionBarDrawableToggleImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/app/ActionBarActivityDelegate;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;->this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/app/ActionBarActivityDelegate;Landroid/support/v7/app/ActionBarActivityDelegate$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;//     .param p2, "x1"    # Landroid/support/v7/app/ActionBarActivityDelegate$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;-><init>(Landroid/support/v7/app/ActionBarActivityDelegate;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 218
a=0;//     #v5=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;->this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate;);
a=0;//     iget-object v2, v2, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;->this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/app/ActionBarActivityDelegate;->getHomeAsUpIndicatorAttrId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aput v4, v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 221
a=0;//     .local v1, "result":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 222
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public setActionBarDescription(I)V
a=0;//     .locals 2
a=0;//     .param p1, "contentDescRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;->this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivityDelegate;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 237
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBar;
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setHomeActionContentDescription(I)V
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
a=0;//     .locals 2
a=0;//     .param p1, "upDrawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p2, "contentDescRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;->this$0:Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivityDelegate;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 228
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBar;
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v7/app/ActionBar;->setHomeActionContentDescription(I)V
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
