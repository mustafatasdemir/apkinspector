package android.support.v7.internal.widget; class ActivityChooserModel$ActivityResolveInfo { void a() { int a;
a=0;// .class public final Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Comparable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x11
a=0;//     name = "ActivityResolveInfo"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Comparable",
a=0;//         "<",
a=0;//         "Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public final resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;// .field public weight:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/content/pm/ResolveInfo;)V
a=0;//     .locals 0
a=0;//     .param p2, "resolveInfo"    # Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 886
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 887
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compareTo(Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;)I
a=0;//     .locals 2
a=0;//     .param p1, "another"    # Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 913
a=0;//     iget v0, p1, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compareTo(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 868
a=0;//     check-cast p1, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->compareTo(Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 896
a=0;//     #v2=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     .line 909
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 899
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Uninit);v4=(Uninit);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 900
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 902
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v3, v4, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 903
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 905
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;// 
a=0;//     .line 906
a=0;//     .local v0, "other":Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v4, v0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 907
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 891
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1f
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 919
a=0;//     .local v0, "builder":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 920
a=0;//     const-string v1, "resolveInfo:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->resolveInfo:Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {v2}, Landroid/content/pm/ResolveInfo;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 921
a=0;//     const-string v1, "; weight:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityResolveInfo;->weight:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/math/BigDecimal;-><init>(D)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/math/BigDecimal;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 922
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 923
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
