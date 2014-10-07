package android.support.v7.internal.view; class SupportMenuInflater$MenuState {/*

.class Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
.super Ljava/lang/Object;
.source "SupportMenuInflater.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/SupportMenuInflater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MenuState"
.end annotation


# static fields
.field private static final defaultGroupId:I = 0x0

.field private static final defaultItemCategory:I = 0x0

.field private static final defaultItemCheckable:I = 0x0

.field private static final defaultItemChecked:Z = false

.field private static final defaultItemEnabled:Z = true

.field private static final defaultItemId:I = 0x0

.field private static final defaultItemOrder:I = 0x0

.field private static final defaultItemVisible:Z = true


# instance fields
.field private groupCategory:I

.field private groupCheckable:I

.field private groupEnabled:Z

.field private groupId:I

.field private groupOrder:I

.field private groupVisible:Z

.field private itemActionProvider:Landroid/support/v4/view/ActionProvider;

.field private itemActionProviderClassName:Ljava/lang/String;

.field private itemActionViewClassName:Ljava/lang/String;

.field private itemActionViewLayout:I

.field private itemAdded:Z

.field private itemAlphabeticShortcut:C

.field private itemCategoryOrder:I

.field private itemCheckable:I

.field private itemChecked:Z

.field private itemEnabled:Z

.field private itemIconResId:I

.field private itemId:I

.field private itemListenerMethodName:Ljava/lang/String;

.field private itemNumericShortcut:C

.field private itemShowAsAction:I

.field private itemTitle:Ljava/lang/CharSequence;

.field private itemTitleCondensed:Ljava/lang/CharSequence;

.field private itemVisible:Z

.field private menu:Landroid/view/Menu;

.field final synthetic this$0:Landroid/support/v7/internal/view/SupportMenuInflater;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/SupportMenuInflater;Landroid/view/Menu;)V
    .locals 0
    .parameter
    .parameter "menu"

    .prologue
    .line 312
    iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    #p0=(Reference);
    iput-object p2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;

    .line 315
    invoke-virtual {p0}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->resetGroup()V

    .line 316
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
    .locals 1
    .parameter "x0"

    .prologue
    .line 253
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    return-object v0
.end method

.method private getShortcut(Ljava/lang/String;)C
    .locals 1
    .parameter "shortcutString"

    .prologue
    const/4 v0, 0x0

    .line 400
    #v0=(Null);
    if-nez p1, :cond_0

    .line 403
    :goto_0
    #v0=(Char);
    return v0

    :cond_0
    #v0=(Null);
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    #v0=(Char);
    goto :goto_0
.end method

.method private newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .parameter "className"
    .parameter
    .parameter "arguments"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class",
            "<*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 480
    .local p2, constructorSignature:[Ljava/lang/Class;,"[Ljava/lang/Class<*>;"
    :try_start_0
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 481
    .local v0, clazz:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    #v0=(Reference);
    invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 482
    .local v1, constructor:Ljava/lang/reflect/Constructor;,"Ljava/lang/reflect/Constructor<*>;"
    #v1=(Reference);
    invoke-virtual {v1, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 486
    .end local v0           #clazz:Ljava/lang/Class;,"Ljava/lang/Class<*>;"
    .end local v1           #constructor:Ljava/lang/reflect/Constructor;,"Ljava/lang/reflect/Constructor<*>;"
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v3

    .line 483
    :catch_0
    move-exception v2

    .line 484
    .local v2, e:Ljava/lang/Exception;
    #v2=(Reference);
    const-string v3, "SupportMenuInflater"

    #v3=(Reference);
    new-instance v4, Ljava/lang/StringBuilder;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    #v4=(Reference);
    const-string v5, "Cannot instantiate class: "

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 486
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0
.end method

.method private setItem(Landroid/view/MenuItem;)V
    .locals 7
    .parameter "item"

    .prologue
    const/4 v4, 0x1

    .line 408
    #v4=(One);
    iget-boolean v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemChecked:Z

    #v3=(Boolean);
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v3

    #v3=(Reference);
    iget-boolean v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemVisible:Z

    #v5=(Boolean);
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemEnabled:Z

    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    #v5=(Reference);
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I

    #v3=(Integer);
    if-lt v3, v4, :cond_1

    move v3, v4

    :goto_0
    #v3=(Boolean);
    invoke-interface {v5, v3}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v3

    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;

    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v3

    iget v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemIconResId:I

    #v5=(Integer);
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v3

    iget-char v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAlphabeticShortcut:C

    #v5=(Char);
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    move-result-object v3

    iget-char v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemNumericShortcut:C

    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setNumericShortcut(C)Landroid/view/MenuItem;

    .line 417
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I

    #v3=(Integer);
    if-ltz v3, :cond_0

    .line 418
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I

    invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setShowAsAction(Landroid/view/MenuItem;I)V

    .line 421
    :cond_0
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;

    #v3=(Reference);
    if-eqz v3, :cond_3

    .line 422
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    invoke-static {v3}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 423
    new-instance v3, Ljava/lang/IllegalStateException;

    #v3=(UninitRef);
    const-string v4, "The android:onClick attribute cannot be used within a restricted context"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 408
    :cond_1
    #v3=(Integer);v4=(One);v5=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0

    .line 426
    :cond_2
    #v3=(Boolean);v5=(Char);
    new-instance v3, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;

    #v3=(UninitRef);
    iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v5=(Reference);
    invoke-static {v5}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$400(Landroid/support/v7/internal/view/SupportMenuInflater;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;

    #v6=(Reference);
    invoke-direct {v3, v5, v6}, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    #v3=(Reference);
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 430
    :cond_3
    #v5=(Conflicted);v6=(Conflicted);
    instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v3=(Boolean);
    if-eqz v3, :cond_8

    move-object v3, p1

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-object v2, v3

    .line 431
    .local v2, impl:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v2=(Reference);v3=(Conflicted);
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I

    #v3=(Integer);
    const/4 v5, 0x2

    #v5=(PosByte);
    if-lt v3, v5, :cond_4

    .line 432
    instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v3=(Boolean);
    if-eqz v3, :cond_9

    move-object v3, p1

    .line 433
    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V

    .line 439
    :cond_4
    :goto_2
    #v3=(Conflicted);
    const/4 v1, 0x0

    .line 440
    .local v1, actionViewSpecified:Z
    #v1=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;

    #v3=(Reference);
    if-eqz v3, :cond_5

    .line 441
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;

    invoke-static {}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$500()[Ljava/lang/Class;

    move-result-object v4

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v5=(Reference);
    invoke-static {v5}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$600(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;

    move-result-object v5

    invoke-direct {p0, v3, v4, v5}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    .line 443
    .local v0, actionView:Landroid/view/View;
    invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompat;->setActionView(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;

    .line 444
    const/4 v1, 0x1

    .line 446
    .end local v0           #actionView:Landroid/view/View;
    :cond_5
    #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I

    #v3=(Integer);
    if-lez v3, :cond_6

    .line 447
    if-nez v1, :cond_a

    .line 448
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I

    invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setActionView(Landroid/view/MenuItem;I)Landroid/view/MenuItem;

    .line 449
    const/4 v1, 0x1

    .line 455
    :cond_6
    :goto_3
    #v3=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;

    #v3=(Reference);
    if-eqz v3, :cond_7

    .line 456
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;

    invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setActionProvider(Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;

    .line 458
    :cond_7
    return-void

    .line 430
    .end local v1           #actionViewSpecified:Z
    .end local v2           #impl:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_8
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(One);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1

    .line 434
    .restart local v2       #impl:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_9
    #v2=(Reference);v5=(PosByte);
    instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    if-eqz v3, :cond_4

    move-object v3, p1

    .line 435
    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->setExclusiveCheckable(Z)V

    goto :goto_2

    .line 451
    .restart local v1       #actionViewSpecified:Z
    :cond_a
    #v0=(Conflicted);v1=(Boolean);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    const-string v3, "SupportMenuInflater"

    #v3=(Reference);
    const-string v4, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    #v4=(Reference);
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3
.end method


# virtual methods
.method public addItem()V
    .locals 5

    .prologue
    .line 461
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z

    .line 462
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I

    #v1=(Integer);
    iget v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;

    #v4=(Reference);
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->setItem(Landroid/view/MenuItem;)V

    .line 463
    return-void
.end method

.method public addSubMenuItem()Landroid/view/SubMenu;
    .locals 6

    .prologue
    .line 466
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z

    .line 467
    iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I

    #v3=(Integer);
    iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;

    #v5=(Reference);
    invoke-interface {v1, v2, v3, v4, v5}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    .line 468
    .local v0, subMenu:Landroid/view/SubMenu;
    #v0=(Reference);
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-direct {p0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->setItem(Landroid/view/MenuItem;)V

    .line 469
    return-object v0
.end method

.method public hasAddedItem()Z
    .locals 1

    .prologue
    .line 473
    iget-boolean v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z

    #v0=(Boolean);
    return v0
.end method

.method public readGroup(Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "attrs"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 331
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->MenuGroup:[I

    #v2=(Reference);
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 333
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I

    .line 334
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I

    .line 336
    const/4 v1, 0x4

    #v1=(PosByte);
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I

    .line 337
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I

    .line 339
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z

    .line 340
    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z

    .line 342
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 343
    return-void
.end method

.method public readItem(Landroid/util/AttributeSet;)V
    .locals 9
    .parameter "attrs"

    .prologue
    const/16 v8, 0xb

    #v8=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v6, 0x0

    .line 349
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;

    move-result-object v4

    sget-object v7, Landroid/support/v7/appcompat/R$styleable;->MenuItem:[I

    #v7=(Reference);
    invoke-virtual {v4, p1, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 352
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I

    .line 353
    const/4 v4, 0x5

    #v4=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I

    #v7=(Integer);
    invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 354
    .local v1, category:I
    #v1=(Integer);
    const/4 v4, 0x6

    iget v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I

    invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    .line 355
    .local v3, order:I
    #v3=(Integer);
    const/high16 v4, -0x1

    #v4=(Integer);
    and-int/2addr v4, v1

    const v7, 0xffff

    #v7=(Char);
    and-int/2addr v7, v3

    #v7=(Integer);
    or-int/2addr v4, v7

    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I

    .line 357
    const/4 v4, 0x7

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;

    .line 358
    const/16 v4, 0x8

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;

    .line 359
    invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemIconResId:I

    .line 360
    const/16 v4, 0x9

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {p0, v4}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C

    move-result v4

    #v4=(Char);
    iput-char v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAlphabeticShortcut:C

    .line 362
    const/16 v4, 0xa

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {p0, v4}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C

    move-result v4

    #v4=(Char);
    iput-char v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemNumericShortcut:C

    .line 364
    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 366
    invoke-virtual {v0, v8, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    :goto_0
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I

    .line 372
    :goto_1
    #v4=(Integer);
    const/4 v4, 0x3

    #v4=(PosByte);
    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    #v4=(Boolean);
    iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemChecked:Z

    .line 373
    const/4 v4, 0x4

    #v4=(PosByte);
    iget-boolean v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z

    #v7=(Boolean);
    invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    #v4=(Boolean);
    iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemVisible:Z

    .line 374
    iget-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z

    invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemEnabled:Z

    .line 375
    const/16 v4, 0xd

    #v4=(PosByte);
    const/4 v7, -0x1

    #v7=(Byte);
    invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I

    .line 376
    const/16 v4, 0xc

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;

    .line 377
    const/16 v4, 0xe

    #v4=(PosByte);
    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I

    .line 378
    const/16 v4, 0xf

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;

    .line 379
    const/16 v4, 0x10

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;

    .line 381
    iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;

    if-eqz v4, :cond_2

    move v2, v5

    .line 382
    .local v2, hasActionProvider:Z
    :goto_2
    #v2=(Boolean);
    if-eqz v2, :cond_3

    iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I

    #v4=(Integer);
    if-nez v4, :cond_3

    iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;

    #v4=(Reference);
    if-nez v4, :cond_3

    .line 383
    iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;

    invoke-static {}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$200()[Ljava/lang/Class;

    move-result-object v5

    #v5=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;

    #v7=(Reference);
    invoke-static {v7}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$300(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;

    move-result-object v7

    invoke-direct {p0, v4, v5, v7}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/view/ActionProvider;

    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;

    .line 394
    :goto_3
    #v5=(Conflicted);v7=(Conflicted);
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 396
    iput-boolean v6, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z

    .line 397
    return-void

    .end local v2           #hasActionProvider:Z
    :cond_0
    #v2=(Uninit);v4=(Boolean);v5=(One);v7=(Integer);
    move v4, v6

    .line 366
    #v4=(Null);
    goto :goto_0

    .line 370
    :cond_1
    #v4=(Boolean);
    iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I

    goto :goto_1

    :cond_2
    #v4=(Reference);v7=(Byte);
    move v2, v6

    .line 381
    #v2=(Null);
    goto :goto_2

    .line 387
    .restart local v2       #hasActionProvider:Z
    :cond_3
    #v2=(Boolean);v4=(Conflicted);
    if-eqz v2, :cond_4

    .line 388
    const-string v4, "SupportMenuInflater"

    #v4=(Reference);
    const-string v5, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    #v5=(Reference);
    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 391
    :cond_4
    #v4=(Conflicted);v5=(Conflicted);
    const/4 v4, 0x0

    #v4=(Null);
    iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;

    goto :goto_3
.end method

.method public resetGroup()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 319
    #v0=(Null);
    iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I

    .line 320
    iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I

    .line 321
    iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I

    .line 322
    iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I

    .line 323
    iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z

    .line 324
    iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z

    .line 325
    return-void
.end method

*/}
