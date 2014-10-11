package android.support.v7.internal.view.menu; class ActionMenuPresenter$OverflowMenuButton { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;
a=0;// .super Landroid/widget/ImageButton;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OverflowMenuButton"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 574
a=0;//     #v2=(One);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 575
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Landroid/support/v7/appcompat/R$attr;->actionOverflowButtonStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p2, v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 577
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setClickable(Z)V
a=0;// 
a=0;//     .line 578
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setFocusable(Z)V
a=0;// 
a=0;//     .line 579
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 580
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setEnabled(Z)V
a=0;// 
a=0;//     .line 581
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public needsDividerAfter()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerBefore()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performClick()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 585
a=0;//     #v1=(One);
a=0;//     invoke-super {p0}, Landroid/widget/ImageButton;->performClick()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 591
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 589
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
