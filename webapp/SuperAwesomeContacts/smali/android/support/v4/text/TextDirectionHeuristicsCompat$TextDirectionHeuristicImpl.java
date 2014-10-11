package android.support.v4.text; class TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl { void a() { int a;
a=0;// .class abstract Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TextDirectionHeuristicsCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/text/TextDirectionHeuristicCompat;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/text/TextDirectionHeuristicsCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x40a
a=0;//     name = "TextDirectionHeuristicImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;)V
a=0;//     .locals 0
a=0;//     .param p1, "algorithm"    # Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;);
a=0;//     iput-object p1, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doCheck(Ljava/lang/CharSequence;II)Z
a=0;//     .locals 1
a=0;//     .param p1, "cs"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;);
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;->checkRtl(Ljava/lang/CharSequence;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 142
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 144
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract defaultIsRtl()Z
a=0;// .end method
a=0;// 
a=0;// .method public isRtl(Ljava/lang/CharSequence;II)Z
a=0;//     .locals 1
a=0;//     .param p1, "cs"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     if-ltz p3, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, p3
a=0;// 
a=0;//     if-ge v0, p2, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->mAlgorithm:Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p0}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->defaultIsRtl()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 136
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->doCheck(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isRtl([CII)Z
a=0;//     .locals 1
a=0;//     .param p1, "array"    # [C
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-static {p1}, Ljava/nio/CharBuffer;->wrap([C)Ljava/nio/CharBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/CharBuffer;);
a=0;//     invoke-virtual {p0, v0, p2, p3}, Landroid/support/v4/text/TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl;->isRtl(Ljava/lang/CharSequence;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
