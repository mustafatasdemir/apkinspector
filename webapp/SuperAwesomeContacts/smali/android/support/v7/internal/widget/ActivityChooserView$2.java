package android.support.v7.internal.widget; class ActivityChooserView$2 { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ActivityChooserView$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onGlobalLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShown()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$2;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->subUiVisibilityChanged(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
