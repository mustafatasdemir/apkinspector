package android.support.v7.internal.view.menu; class MenuWrapperICS {/*

.class Landroid/support/v7/internal/view/menu/MenuWrapperICS;
.super Landroid/support/v7/internal/view/menu/BaseMenuWrapper;
.source "MenuWrapperICS.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportMenu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/view/menu/BaseMenuWrapper",
        "<",
        "Landroid/view/Menu;",
        ">;",
        "Landroid/support/v4/internal/view/SupportMenu;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Menu;)V
    .locals 0
    .parameter "object"

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;-><init>(Ljava/lang/Object;)V

    .line 31
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public add(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "titleRes"

    .prologue
    .line 40
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIII)Landroid/view/MenuItem;
    .locals 1
    .parameter "groupId"
    .parameter "itemId"
    .parameter "order"
    .parameter "titleRes"

    .prologue
    .line 50
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .parameter "groupId"
    .parameter "itemId"
    .parameter "order"
    .parameter "title"

    .prologue
    .line 45
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .parameter "title"

    .prologue
    .line 35
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 13
    .parameter "groupId"
    .parameter "itemId"
    .parameter "order"
    .parameter "caller"
    .parameter "specifics"
    .parameter "intent"
    .parameter "flags"
    .parameter "outSpecificItems"

    .prologue
    .line 77
    const/4 v9, 0x0

    .line 78
    .local v9, items:[Landroid/view/MenuItem;
    #v9=(Null);
    if-eqz p8, :cond_0

    .line 79
    move-object/from16 v0, p8

    #v0=(Reference);
    array-length v1, v0

    #v1=(Integer);
    new-array v9, v1, [Landroid/view/MenuItem;

    .line 82
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v9=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, Landroid/view/Menu;

    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move/from16 v4, p3

    #v4=(Integer);
    move-object/from16 v5, p4

    #v5=(Reference);
    move-object/from16 v6, p5

    #v6=(Reference);
    move-object/from16 v7, p6

    #v7=(Reference);
    move/from16 v8, p7

    #v8=(Integer);
    invoke-interface/range {v1 .. v9}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I

    move-result v11

    .line 85
    .local v11, result:I
    #v11=(Integer);
    if-eqz v9, :cond_1

    .line 86
    const/4 v10, 0x0

    .local v10, i:I
    #v10=(Null);
    array-length v12, v9

    .local v12, z:I
    :goto_0
    #v10=(Integer);v12=(Integer);
    if-ge v10, v12, :cond_1

    .line 87
    aget-object v1, v9, v10

    #v1=(Null);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v1

    #v1=(Reference);
    aput-object v1, p8, v10

    .line 86
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 91
    .end local v10           #i:I
    .end local v12           #z:I
    :cond_1
    #v10=(Conflicted);v12=(Conflicted);
    return v11
.end method

.method public addSubMenu(I)Landroid/view/SubMenu;
    .locals 1
    .parameter "titleRes"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(I)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1
    .parameter "groupId"
    .parameter "itemId"
    .parameter "order"
    .parameter "titleRes"

    .prologue
    .line 70
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .parameter "groupId"
    .parameter "itemId"
    .parameter "order"
    .parameter "title"

    .prologue
    .line 65
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .parameter "title"

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalClear()V

    .line 109
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 110
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->close()V

    .line 150
    return-void
.end method

.method public findItem(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "id"

    .prologue
    .line 134
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public getItem(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "index"

    .prologue
    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    return-object v0
.end method

.method public hasVisibleItems()Z
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->isShortcutKey(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public performIdentifierAction(II)Z
    .locals 1
    .parameter "id"
    .parameter "flags"

    .prologue
    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->performIdentifierAction(II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 1
    .parameter "keyCode"
    .parameter "event"
    .parameter "flags"

    .prologue
    .line 154
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public removeGroup(I)V
    .locals 1
    .parameter "groupId"

    .prologue
    .line 102
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalRemoveGroup(I)V

    .line 103
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeGroup(I)V

    .line 104
    return-void
.end method

.method public removeItem(I)V
    .locals 1
    .parameter "id"

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->internalRemoveItem(I)V

    .line 97
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeItem(I)V

    .line 98
    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 1
    .parameter "group"
    .parameter "checkable"
    .parameter "exclusive"

    .prologue
    .line 114
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 115
    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 1
    .parameter "group"
    .parameter "enabled"

    .prologue
    .line 124
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V

    .line 125
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 1
    .parameter "group"
    .parameter "visible"

    .prologue
    .line 119
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    .line 120
    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 1
    .parameter "isQwerty"

    .prologue
    .line 169
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0, p1}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 170
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/Menu;

    invoke-interface {v0}, Landroid/view/Menu;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
