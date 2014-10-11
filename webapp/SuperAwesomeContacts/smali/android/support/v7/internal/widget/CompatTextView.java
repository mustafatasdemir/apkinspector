package android.support.v7.internal.widget; class CompatTextView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/CompatTextView;
a=0;// .super Landroid/widget/TextView;
a=0;// .source "CompatTextView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/CompatTextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/CompatTextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/CompatTextView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "allCaps":Z
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->CompatTextView:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 50
a=0;//     .local v1, "style":Landroid/content/res/TypedArray;
a=0;//     #v1=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 56
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;);
a=0;//     invoke-direct {v2, p1}, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/CompatTextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
