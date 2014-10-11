package android.support.v4.util; class LogWriter { void a() { int a;
a=0;// .class public Landroid/support/v4/util/LogWriter;
a=0;// .super Ljava/io/Writer;
a=0;// .source "LogWriter.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private final mTag:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/io/Writer;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Landroid/support/v4/util/LogWriter;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x80
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p1, p0, Landroid/support/v4/util/LogWriter;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private flushBuilder()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mTag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public flush()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write([CII)V
a=0;//     .locals 3
a=0;//     .param p1, "buf"    # [C
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, p3, :cond_1
a=0;// 
a=0;//     .line 53
a=0;//     add-int v2, p2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-char v0, p1, v2
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
a=0;// 
a=0;//     .line 52
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 61
a=0;//     .end local v0    # "c":C
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
