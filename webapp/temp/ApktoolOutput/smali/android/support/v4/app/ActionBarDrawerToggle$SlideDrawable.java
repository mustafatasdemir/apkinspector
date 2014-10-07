package android.support.v4.app; class ActionBarDrawerToggle$SlideDrawable {/*

.class Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;
.super Landroid/graphics/drawable/InsetDrawable;
.source "ActionBarDrawerToggle.java"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ActionBarDrawerToggle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SlideDrawable"
.end annotation


# instance fields
.field private final mHasMirroring:Z

.field private mOffset:F

.field private mPosition:F

.field private final mTmpRect:Landroid/graphics/Rect;

.field final synthetic this$0:Landroid/support/v4/app/ActionBarDrawerToggle;


# direct methods
.method private constructor <init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .parameter
    .parameter "wrapped"

    .prologue
    const/4 v0, 0x0

    .line 420
    #v0=(Null);
    iput-object p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->this$0:Landroid/support/v4/app/ActionBarDrawerToggle;

    .line 421
    invoke-direct {p0, p2, v0}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 414
    #p0=(Reference);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0x12

    #v2=(PosByte);
    if-le v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mHasMirroring:Z

    .line 415
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;

    .line 422
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;Landroid/support/v4/app/ActionBarDrawerToggle$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 413
    invoke-direct {p0, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6
    .parameter "canvas"

    .prologue
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v0, 0x1

    .line 452
    #v0=(One);
    iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;

    #v3=(Reference);
    invoke-virtual {p0, v3}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->copyBounds(Landroid/graphics/Rect;)V

    .line 453
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 456
    iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->this$0:Landroid/support/v4/app/ActionBarDrawerToggle;

    invoke-static {v3}, Landroid/support/v4/app/ActionBarDrawerToggle;->access$400(Landroid/support/v4/app/ActionBarDrawerToggle;)Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v3

    #v3=(Integer);
    if-ne v3, v0, :cond_2

    move v1, v0

    .line 458
    .local v1, isLayoutRTL:Z
    :goto_0
    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v0, -0x1

    .line 459
    .local v0, flipRtl:I
    :cond_0
    #v0=(Byte);
    iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 460
    .local v2, width:I
    #v2=(Integer);
    iget v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F

    #v3=(Integer);
    neg-float v3, v3

    #v3=(Float);
    int-to-float v4, v2

    #v4=(Float);
    mul-float/2addr v3, v4

    iget v4, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F

    #v4=(Integer);
    mul-float/2addr v3, v4

    int-to-float v4, v0

    #v4=(Float);
    mul-float/2addr v3, v4

    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 463
    if-eqz v1, :cond_1

    iget-boolean v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mHasMirroring:Z

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 464
    int-to-float v3, v2

    #v3=(Float);
    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 465
    const/high16 v3, -0x4080

    #v3=(Integer);
    const/high16 v4, 0x3f80

    #v4=(Integer);
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 468
    :cond_1
    invoke-super {p0, p1}, Landroid/graphics/drawable/InsetDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 469
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 470
    return-void

    .line 456
    .end local v0           #flipRtl:I
    .end local v1           #isLayoutRTL:Z
    .end local v2           #width:I
    :cond_2
    #v0=(One);v1=(Uninit);v2=(Uninit);v4=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public getPosition()F
    .locals 1

    .prologue
    .line 435
    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F

    #v0=(Integer);
    return v0
.end method

.method public setOffset(F)V
    .locals 0
    .parameter "offset"

    .prologue
    .line 446
    iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F

    .line 447
    invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V

    .line 448
    return-void
.end method

.method public setPosition(F)V
    .locals 0
    .parameter "position"

    .prologue
    .line 430
    iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F

    .line 431
    invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V

    .line 432
    return-void
.end method

*/}
