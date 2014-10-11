package android.support.v4.app; class ShareCompat$ShareCompatImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ShareCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ShareCompatImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static withinStyle(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V
a=0;//     .locals 5
a=0;//     .param p0, "out"    # Ljava/lang/StringBuilder;
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "end"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     .line 99
a=0;//     #v4=(PosByte);
a=0;//     move v1, p2
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v1, p3, :cond_7
a=0;// 
a=0;//     .line 100
a=0;//     invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     const/16 v2, 0x3c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     const-string v2, "&lt;"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 99
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     const/16 v2, 0x3e
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     const-string v2, "&gt;"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_1
a=0;//     #v2=(PosByte);
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 107
a=0;//     const-string v2, "&amp;"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v2=(PosByte);
a=0;//     const/16 v2, 0x7e
a=0;// 
a=0;//     if-gt v0, v2, :cond_3
a=0;// 
a=0;//     if-ge v0, v4, :cond_4
a=0;// 
a=0;//     .line 109
a=0;//     :cond_3
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "&#"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ";"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 110
a=0;//     :cond_4
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     if-ne v0, v4, :cond_6
a=0;// 
a=0;//     .line 111
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, p3, :cond_5
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-ne v2, v4, :cond_5
a=0;// 
a=0;//     .line 112
a=0;//     const-string v2, "&nbsp;"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 113
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 116
a=0;//     :cond_5
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 118
a=0;//     :cond_6
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 121
a=0;//     .end local v0    # "c":C
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;//     .param p2, "shareIntent"    # Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "out":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, p1, v1, v2}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;->withinStyle(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
}}
