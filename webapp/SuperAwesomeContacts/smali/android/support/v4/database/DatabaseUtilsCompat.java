package android.support.v4.database; class DatabaseUtilsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/database/DatabaseUtilsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseUtilsCompat.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Landroid/support/v4/database/DatabaseUtilsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static appendSelectionArgs([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "originalValues"    # [Ljava/lang/String;
a=0;//     .param p1, "newValues"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v3=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     new-array v0, v1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "result":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     invoke-static {p0, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 55
a=0;//     array-length v1, p0
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     invoke-static {p1, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static concatenateWhere(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "a"    # Ljava/lang/String;
a=0;//     .param p1, "b"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     .end local p1    # "b":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 38
a=0;//     .restart local p1    # "b":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object p1, p0
a=0;// 
a=0;//     .line 39
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ") AND ("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
