package android.support.v7.app; class ActionBarImplBase$TabImpl { void a() { int a;
a=0;// .class public Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// .super Landroid/support/v7/app/ActionBar$Tab;
a=0;// .source "ActionBarImplBase.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBarImplBase;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "TabImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCallback:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;// .field private mContentDesc:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mCustomView:Landroid/view/View;
a=0;// 
a=0;// .field private mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mPosition:I
a=0;// 
a=0;// .field private mTag:Ljava/lang/Object;
a=0;// 
a=0;// .field private mText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/app/ActionBarImplBase;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 627
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBar$Tab;-><init>()V
a=0;// 
a=0;//     .line 634
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCallback()Landroid/support/v7/app/ActionBar$TabListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCallback:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar$TabListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentDescription()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 746
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mContentDesc:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 660
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 685
a=0;//     iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTag()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 639
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getText()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 694
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public select()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 728
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentDescription(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 732
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setContentDescription(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "contentDesc"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 737
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mContentDesc:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 738
a=0;//     iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V
a=0;// 
a=0;//     .line 741
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "layoutResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 674
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 665
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     .line 666
a=0;//     iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 667
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V
a=0;// 
a=0;//     .line 669
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 708
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 699
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 700
a=0;//     iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 701
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V
a=0;// 
a=0;//     .line 703
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setPosition(I)V
a=0;//     .locals 0
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     iput p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     .line 690
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabListener(Landroid/support/v7/app/ActionBar$TabListener;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 0
a=0;//     .param p1, "callback"    # Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mCallback:Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     .line 655
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTag(Ljava/lang/Object;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 0
a=0;//     .param p1, "tag"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 644
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     .line 645
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setText(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 722
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setText(Ljava/lang/CharSequence;)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 2
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 714
a=0;//     iget v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 715
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->this$0:Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     invoke-static {v0}, Landroid/support/v7/app/ActionBarImplBase;->access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->mPosition:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->updateTab(I)V
a=0;// 
a=0;//     .line 717
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
}}
