package android.support.v7.internal.view; class SupportMenuInflater$MenuState { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SupportMenuInflater.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "MenuState"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final defaultGroupId:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemCategory:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemCheckable:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemChecked:Z = false
a=0;// 
a=0;// .field private static final defaultItemEnabled:Z = true
a=0;// 
a=0;// .field private static final defaultItemId:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemOrder:I = 0x0
a=0;// 
a=0;// .field private static final defaultItemVisible:Z = true
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private groupCategory:I
a=0;// 
a=0;// .field private groupCheckable:I
a=0;// 
a=0;// .field private groupEnabled:Z
a=0;// 
a=0;// .field private groupId:I
a=0;// 
a=0;// .field private groupOrder:I
a=0;// 
a=0;// .field private groupVisible:Z
a=0;// 
a=0;// .field private itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;// .field private itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemActionViewLayout:I
a=0;// 
a=0;// .field private itemAdded:Z
a=0;// 
a=0;// .field private itemAlphabeticShortcut:C
a=0;// 
a=0;// .field private itemCategoryOrder:I
a=0;// 
a=0;// .field private itemCheckable:I
a=0;// 
a=0;// .field private itemChecked:Z
a=0;// 
a=0;// .field private itemEnabled:Z
a=0;// 
a=0;// .field private itemIconResId:I
a=0;// 
a=0;// .field private itemId:I
a=0;// 
a=0;// .field private itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;// .field private itemNumericShortcut:C
a=0;// 
a=0;// .field private itemShowAsAction:I
a=0;// 
a=0;// .field private itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private itemVisible:Z
a=0;// 
a=0;// .field private menu:Landroid/view/Menu;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/SupportMenuInflater;Landroid/view/Menu;)V
a=0;//     .locals 0
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 313
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->resetGroup()V
a=0;// 
a=0;//     .line 316
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getShortcut(Ljava/lang/String;)C
a=0;//     .locals 1
a=0;//     .param p1, "shortcutString"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 400
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     :goto_0
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "className"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 480
a=0;//     .local p2, "constructorSignature":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 481
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 482
a=0;//     .local v1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     #v1=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 486
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v1    # "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 483
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 484
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "SupportMenuInflater"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Cannot instantiate class: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 486
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setItem(Landroid/view/MenuItem;)V
a=0;//     .locals 7
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 408
a=0;//     #v4=(One);
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemChecked:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/MenuItem;);
a=0;//     iget-boolean v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemVisible:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-boolean v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemEnabled:Z
a=0;// 
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/MenuItem;);
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v3, v4, :cond_1
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v5, v3}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/MenuItem;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemIconResId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-char v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAlphabeticShortcut:C
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setAlphabeticShortcut(C)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-char v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemNumericShortcut:C
a=0;// 
a=0;//     invoke-interface {v3, v5}, Landroid/view/MenuItem;->setNumericShortcut(C)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 417
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setShowAsAction(Landroid/view/MenuItem;I)V
a=0;// 
a=0;//     .line 421
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 423
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v4, "The android:onClick attribute cannot be used within a restricted context"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 408
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(One);v5=(Reference,Landroid/view/MenuItem;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 426
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v5=(Char);
a=0;//     new-instance v3, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$400(Landroid/support/v7/internal/view/SupportMenuInflater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5, v6}, Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;);
a=0;//     invoke-interface {p1, v3}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 430
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 431
a=0;//     .local v2, "impl":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v3=(Conflicted);
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v3, v5, :cond_4
a=0;// 
a=0;//     .line 432
a=0;//     instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 433
a=0;//     #v3=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V
a=0;// 
a=0;//     .line 439
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 440
a=0;//     .local v1, "actionViewSpecified":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$500()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$600(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {p0, v3, v4, v5}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 443
a=0;//     .local v0, "actionView":Landroid/view/View;
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompat;->setActionView(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 444
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 446
a=0;//     .end local v0    # "actionView":Landroid/view/View;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_6
a=0;// 
a=0;//     .line 447
a=0;//     if-nez v1, :cond_a
a=0;// 
a=0;//     .line 448
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setActionView(Landroid/view/MenuItem;I)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 449
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 455
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MenuItemCompat;->setActionProvider(Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 458
a=0;//     :cond_7
a=0;//     return-void
a=0;// 
a=0;//     .line 430
a=0;//     .end local v1    # "actionViewSpecified":Z
a=0;//     .end local v2    # "impl":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_8
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 434
a=0;//     .restart local v2    # "impl":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_9
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v5=(PosByte);
a=0;//     instance-of v3, p1, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     move-object v3, p1
a=0;// 
a=0;//     .line 435
a=0;//     #v3=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->setExclusiveCheckable(Z)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 451
a=0;//     .restart local v1    # "actionViewSpecified":Z
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v3, "SupportMenuInflater"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addItem()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->setItem(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     .line 463
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenuItem()Landroid/view/SubMenu;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->menu:Landroid/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Menu;);
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v1, v2, v3, v4, v5}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 468
a=0;//     .local v0, "subMenu":Landroid/view/SubMenu;
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->setItem(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     .line 469
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasAddedItem()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public readGroup(Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 331
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->MenuGroup:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 333
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     .line 336
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     .line 337
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     .line 339
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 343
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public readItem(Landroid/util/AttributeSet;)V
a=0;//     .locals 9
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0xb
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 349
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v4}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v7, Landroid/support/v7/appcompat/R$styleable;->MenuItem:[I
a=0;// 
a=0;//     #v7=(Reference,[I);
a=0;//     invoke-virtual {v4, p1, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemId:I
a=0;// 
a=0;//     .line 353
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 354
a=0;//     .local v1, "category":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, 0x6
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 355
a=0;//     .local v3, "order":I
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, -0x10000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/2addr v4, v1
a=0;// 
a=0;//     const v7, 0xffff
a=0;// 
a=0;//     #v7=(Char);
a=0;//     and-int/2addr v7, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     or-int/2addr v4, v7
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCategoryOrder:I
a=0;// 
a=0;//     .line 357
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 358
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 359
a=0;//     invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemIconResId:I
a=0;// 
a=0;//     .line 360
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     iput-char v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAlphabeticShortcut:C
a=0;// 
a=0;//     .line 362
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->getShortcut(Ljava/lang/String;)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     iput-char v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemNumericShortcut:C
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v0, v8, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_0
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     .line 372
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemChecked:Z
a=0;// 
a=0;//     .line 373
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget-boolean v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemVisible:Z
a=0;// 
a=0;//     .line 374
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemEnabled:Z
a=0;// 
a=0;//     .line 375
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v0, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemShowAsAction:I
a=0;// 
a=0;//     .line 376
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemListenerMethodName:Ljava/lang/String;
a=0;// 
a=0;//     .line 377
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     .line 378
a=0;//     const/16 v4, 0xf
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 379
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 382
a=0;//     .local v2, "hasActionProvider":Z
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewLayout:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionViewClassName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProviderClassName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$200()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->this$0:Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-static {v7}, Landroid/support/v7/internal/view/SupportMenuInflater;->access$300(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {p0, v4, v5, v7}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->newInstance(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .line 394
a=0;//     :goto_3
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 396
a=0;//     iput-boolean v6, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemAdded:Z
a=0;// 
a=0;//     .line 397
a=0;//     return-void
a=0;// 
a=0;//     .end local v2    # "hasActionProvider":Z
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v4=(Boolean);v5=(One);v7=(Integer);
a=0;//     move v4, v6
a=0;// 
a=0;//     .line 366
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 370
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     iget v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemCheckable:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Reference,Ljava/lang/String;);v7=(Byte);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 381
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 387
a=0;//     .restart local v2    # "hasActionProvider":Z
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 388
a=0;//     const-string v4, "SupportMenuInflater"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Ignoring attribute \'actionProviderClass\'. Action view already specified."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 391
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->itemActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public resetGroup()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 319
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupId:I
a=0;// 
a=0;//     .line 320
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCategory:I
a=0;// 
a=0;//     .line 321
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupOrder:I
a=0;// 
a=0;//     .line 322
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupCheckable:I
a=0;// 
a=0;//     .line 323
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupVisible:Z
a=0;// 
a=0;//     .line 324
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->groupEnabled:Z
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
}}
