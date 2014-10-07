package android.support.v4.app; class ActionBarDrawerToggle {/*

.class public Landroid/support/v4/app/ActionBarDrawerToggle;
.super Ljava/lang/Object;
.source "ActionBarDrawerToggle.java"

# interfaces
.implements Landroid/support/v4/widget/DrawerLayout$DrawerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/ActionBarDrawerToggle$1;,
        Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;,
        Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplJellybeanMR2;,
        Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;,
        Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;,
        Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;,
        Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;,
        Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;
    }
.end annotation


# static fields
.field private static final ID_HOME:I = 0x102002c

.field private static final IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl; = null

.field private static final TOGGLE_DRAWABLE_OFFSET:F = 0.33333334f


# instance fields
.field private final mActivity:Landroid/app/Activity;

.field private final mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

.field private final mCloseDrawerContentDescRes:I

.field private mDrawerImage:Landroid/graphics/drawable/Drawable;

.field private final mDrawerImageResource:I

.field private mDrawerIndicatorEnabled:Z

.field private final mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

.field private final mOpenDrawerContentDescRes:I

.field private mSetIndicatorInfo:Ljava/lang/Object;

.field private mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

.field private mThemeImage:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 169
    #v2=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x12

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 171
    new-instance v1, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplJellybeanMR2;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplJellybeanMR2;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle$1;)V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    .line 177
    :goto_0
    return-void

    .line 172
    :cond_0
    #v1=(PosByte);
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 173
    new-instance v1, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplHC;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle$1;)V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    goto :goto_0

    .line 175
    :cond_1
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImplBase;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle$1;)V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    goto :goto_0
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;III)V
    .locals 3
    .parameter "activity"
    .parameter "drawerLayout"
    .parameter "drawerImageRes"
    .parameter "openDrawerContentDescRes"
    .parameter "closeDrawerContentDescRes"

    .prologue
    const/4 v2, 0x0

    .line 220
    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    .line 221
    iput-object p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    .line 224
    instance-of v0, p1, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    move-object v0, p1

    .line 225
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;

    invoke-interface {v0}, Landroid/support/v4/app/ActionBarDrawerToggle$DelegateProvider;->getDrawerToggleDelegate()Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    .line 230
    :goto_0
    #v0=(Conflicted);
    iput-object p2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    .line 231
    iput p3, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImageResource:I

    .line 232
    iput p4, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I

    .line 233
    iput p5, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I

    .line 235
    invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;

    .line 236
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;

    .line 237
    new-instance v0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    invoke-direct {v0, p0, v1, v2}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;-><init>(Landroid/support/v4/app/ActionBarDrawerToggle;Landroid/graphics/drawable/Drawable;Landroid/support/v4/app/ActionBarDrawerToggle$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    .line 238
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    const v1, 0x3eaaaaab

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setOffset(F)V

    .line 239
    return-void

    .line 227
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iput-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    goto :goto_0
.end method

.method static synthetic access$400(Landroid/support/v4/app/ActionBarDrawerToggle;)Landroid/app/Activity;
    .locals 1
    .parameter "x0"

    .prologue
    .line 58
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method getThemeUpIndicator()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 389
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 390
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    invoke-interface {v0}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 392
    :goto_0
    #v1=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);
    sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->getThemeUpIndicator(Landroid/app/Activity;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method public isDrawerIndicatorEnabled()Z
    .locals 1

    .prologue
    .line 290
    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .parameter "newConfig"

    .prologue
    .line 302
    invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->getThemeUpIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;

    .line 303
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImageResource:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerImage:Landroid/graphics/drawable/Drawable;

    .line 304
    invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle;->syncState()V

    .line 305
    return-void
.end method

.method public onDrawerClosed(Landroid/view/View;)V
    .locals 2
    .parameter "drawerView"

    .prologue
    .line 371
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V

    .line 372
    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 373
    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V

    .line 375
    :cond_0
    return-void
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 2
    .parameter "drawerView"

    .prologue
    .line 356
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v0=(Reference);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V

    .line 357
    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 358
    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarDescription(I)V

    .line 360
    :cond_0
    return-void
.end method

.method public onDrawerSlide(Landroid/view/View;F)V
    .locals 4
    .parameter "drawerView"
    .parameter "slideOffset"

    .prologue
    const/high16 v3, 0x4000

    #v3=(Integer);
    const/high16 v2, 0x3f00

    .line 338
    #v2=(Integer);
    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->getPosition()F

    move-result v0

    .line 339
    .local v0, glyphOffset:F
    #v0=(Float);
    cmpl-float v1, p2, v2

    #v1=(Byte);
    if-lez v1, :cond_0

    .line 340
    const/4 v1, 0x0

    #v1=(Null);
    sub-float v2, p2, v2

    #v2=(Float);
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    #v1=(Float);
    mul-float/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 344
    :goto_0
    #v2=(Integer);
    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V

    .line 345
    return-void

    .line 342
    :cond_0
    #v1=(Byte);
    mul-float v1, p2, v3

    #v1=(Float);
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_0
.end method

.method public onDrawerStateChanged(I)V
    .locals 0
    .parameter "newState"

    .prologue
    .line 386
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3
    .parameter "item"

    .prologue
    const v2, 0x800003

    .line 317
    #v2=(Integer);
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    #v0=(Integer);
    const v1, 0x102002c

    #v1=(Integer);
    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 318
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(I)V

    .line 323
    :goto_0
    const/4 v0, 0x1

    .line 325
    :goto_1
    #v0=(Boolean);v1=(Conflicted);
    return v0

    .line 321
    :cond_0
    #v1=(Integer);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(I)V

    goto :goto_0

    .line 325
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method setActionBarDescription(I)V
    .locals 3
    .parameter "contentDescRes"

    .prologue
    .line 405
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    invoke-interface {v0, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarDescription(I)V

    .line 411
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 409
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    invoke-interface {v0, v1, v2, p1}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarDescription(Ljava/lang/Object;Landroid/app/Activity;I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;

    goto :goto_0
.end method

.method setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V
    .locals 3
    .parameter "upDrawable"
    .parameter "contentDescRes"

    .prologue
    .line 396
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivityImpl:Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;

    invoke-interface {v0, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V

    .line 402
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 400
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    sget-object v0, Landroid/support/v4/app/ActionBarDrawerToggle;->IMPL:Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;

    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mActivity:Landroid/app/Activity;

    #v2=(Reference);
    invoke-interface {v0, v1, v2, p1, p2}, Landroid/support/v4/app/ActionBarDrawerToggle$ActionBarDrawerToggleImpl;->setActionBarUpIndicator(Ljava/lang/Object;Landroid/app/Activity;Landroid/graphics/drawable/Drawable;I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSetIndicatorInfo:Ljava/lang/Object;

    goto :goto_0
.end method

.method public setDrawerIndicatorEnabled(Z)V
    .locals 3
    .parameter "enable"

    .prologue
    .line 274
    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    if-eq p1, v0, :cond_0

    .line 275
    if-eqz p1, :cond_2

    .line 276
    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    const v2, 0x800003

    #v2=(Integer);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I

    :goto_0
    #v0=(Integer);
    invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V

    .line 281
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);
    iput-boolean p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    .line 283
    :cond_0
    #v1=(Conflicted);
    return-void

    .line 276
    :cond_1
    #v0=(Boolean);v1=(Reference);v2=(Integer);
    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I

    #v0=(Integer);
    goto :goto_0

    .line 279
    :cond_2
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mThemeImage:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_1
.end method

.method public syncState()V
    .locals 3

    .prologue
    const v2, 0x800003

    .line 251
    #v2=(Integer);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v0=(Reference);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V

    .line 257
    :goto_0
    iget-boolean v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerIndicatorEnabled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 258
    iget-object v1, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mCloseDrawerContentDescRes:I

    :goto_1
    #v0=(Integer);
    invoke-virtual {p0, v1, v0}, Landroid/support/v4/app/ActionBarDrawerToggle;->setActionBarUpIndicator(Landroid/graphics/drawable/Drawable;I)V

    .line 261
    :cond_0
    #v1=(Conflicted);
    return-void

    .line 254
    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mSlider:Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->setPosition(F)V

    goto :goto_0

    .line 258
    :cond_2
    #v0=(Boolean);v1=(Reference);
    iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle;->mOpenDrawerContentDescRes:I

    #v0=(Integer);
    goto :goto_1
.end method

*/}
