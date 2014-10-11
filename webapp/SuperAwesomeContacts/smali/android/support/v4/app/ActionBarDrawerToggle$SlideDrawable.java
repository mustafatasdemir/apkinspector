package android.support.v4.app; class ActionBarDrawerToggle$SlideDrawable { void a() { int a;
a=0;// .class Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
a=0;// .super Landroid/graphics/drawable/InsetDrawable;
a=0;// .source "ActionBarDrawerToggle.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/graphics/drawable/Drawable$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "SlideDrawable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mHasMirroring:Z
a=0;// 
a=0;// .field private mOffset:F
a=0;// 
a=0;// .field private mPosition:F
a=0;// 
a=0;// .field private final mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 3
a=0;//     .param p2, "wrapped"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 420
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->this$0:Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;// 
a=0;//     .line 421
a=0;//     invoke-direct {p0, p2, v0}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 414
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x12
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mHasMirroring:Z
a=0;// 
a=0;//     .line 415
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 422
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;Landroid/support/v4/app/ActionBarDrawerToggle$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;//     .param p2, "x1"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p3, "x2"    # Landroid/support/v4/app/ActionBarDrawerToggle$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 6
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 452
a=0;//     #v0=(One);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->copyBounds(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 453
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->this$0:Landroid/support/v4/app/ActionBarDrawerToggle;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/app/ActionBarDrawerToggle;->access$400(Landroid/support/v4/app/ActionBarDrawerToggle;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v0, :cond_2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 458
a=0;//     .local v1, "isLayoutRTL":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 459
a=0;//     .local v0, "flipRtl":I
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 460
a=0;//     .local v2, "width":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     neg-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 463
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mHasMirroring:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 464
a=0;//     int-to-float v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 465
a=0;//     const/high16 v3, -0x40800000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     .line 468
a=0;//     :cond_1
a=0;//     invoke-super {p0, p1}, Landroid/graphics/drawable/InsetDrawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 470
a=0;//     return-void
a=0;// 
a=0;//     .line 456
a=0;//     .end local v0    # "flipRtl":I
a=0;//     .end local v1    # "isLayoutRTL":Z
a=0;//     .end local v2    # "width":I
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPosition()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setOffset(F)V
a=0;//     .locals 0
a=0;//     .param p1, "offset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPosition(F)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
a=0;// 
a=0;//     .line 431
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V
a=0;// 
a=0;//     .line 432
a=0;//     return-void
a=0;// .end method
}}
