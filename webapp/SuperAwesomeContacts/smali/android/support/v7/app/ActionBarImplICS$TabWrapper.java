package android.support.v7.app; class ActionBarImplICS$TabWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarImplICS$TabWrapper;
a=0;// .super Landroid/support/v7/app/ActionBar$Tab;
a=0;// .source "ActionBarImplICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/app/ActionBar$TabListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBarImplICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "TabWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContentDescription:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTabListener:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;// .field private mTag:Ljava/lang/Object;
a=0;// 
a=0;// .field final mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/app/ActionBarImplICS;Landroid/app/ActionBar$Tab;)V
a=0;//     .locals 0
a=0;//     .param p2, "tab"    # Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBar$Tab;-><init>()V
a=0;// 
a=0;//     .line 456
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarImplICS$TabWrapper;);
a=0;//     iput-object p2, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 457
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getContentDescription()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getCustomView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTag()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onTabReselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
a=0;//     .locals 2
a=0;//     .param p1, "tab"    # Landroid/app/ActionBar$Tab;
a=0;//     .param p2, "ft"    # Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBar$TabListener;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabReselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->commitActiveTransaction()V
a=0;// 
a=0;//     .line 573
a=0;//     return-void
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTabSelected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
a=0;//     .locals 2
a=0;//     .param p1, "tab"    # Landroid/app/ActionBar$Tab;
a=0;//     .param p2, "ft"    # Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBar$TabListener;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabSelected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 559
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->commitActiveTransaction()V
a=0;// 
a=0;//     .line 560
a=0;//     return-void
a=0;// 
a=0;//     .line 558
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onTabUnselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
a=0;//     .locals 2
a=0;//     .param p1, "tab"    # Landroid/app/ActionBar$Tab;
a=0;//     .param p2, "ft"    # Landroid/app/FragmentTransaction;
a=0;// 
a=0;//     .prologue
a=0;//     .line 565
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBar$TabListener;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplICS;->getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-interface {v1, p0, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabUnselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 566
a=0;//     return-void
a=0;// 
a=0;//     .line 565
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public select()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->select()V
a=0;// 
a=0;//     .line 536
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentDescription(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->this$0:Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     iget-object v0, v0, Landroid/support/v7/app/ActionBarImplICS;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Activity;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 541
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 0
a=0;//     .param p1, "contentDesc"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mContentDescription:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 547
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "layoutResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setCustomView(I)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 507
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setCustomView(Landroid/view/View;)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 501
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setIcon(I)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 483
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 477
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTabListener(Landroid/support/v7/app/ActionBar$TabListener;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "listener"    # Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTabListener:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS$TabWrapper;);
a=0;//     invoke-virtual {v1, v0}, Landroid/app/ActionBar$Tab;->setTabListener(Landroid/app/ActionBar$TabListener;)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 530
a=0;//     return-object p0
a=0;// 
a=0;//     .line 529
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTag(Ljava/lang/Object;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 0
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     .line 518
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setText(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 494
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setText(I)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 495
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/ActionBar$Tab;->setText(Ljava/lang/CharSequence;)Landroid/app/ActionBar$Tab;
a=0;// 
a=0;//     .line 489
a=0;//     return-object p0
a=0;// .end method
}}
