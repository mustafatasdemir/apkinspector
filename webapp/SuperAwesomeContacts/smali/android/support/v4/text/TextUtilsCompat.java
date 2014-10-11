package android.support.v4.text; class TextUtilsCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/text/TextUtilsCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TextUtilsCompat.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static ARAB_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static HEBR_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static final ROOT:Ljava/util/Locale;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Ljava/util/Locale;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Locale;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->ROOT:Ljava/util/Locale;
a=0;// 
a=0;//     .line 116
a=0;//     const-string v0, "Arab"
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->ARAB_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 117
a=0;//     const-string v0, "Hebr"
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/text/TextUtilsCompat;->HEBR_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/text/TextUtilsCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getLayoutDirectionFromFirstChar(Ljava/util/Locale;)I
a=0;//     .locals 2
a=0;//     .param p0, "locale"    # Ljava/util/Locale;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p0}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-static {v1}, Ljava/lang/Character;->getDirectionality(C)B
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 106
a=0;//     :pswitch_0
a=0;//     #v0=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static getLayoutDirectionFromLocale(Ljava/util/Locale;)I
a=0;//     .locals 2
a=0;//     .param p0, "locale"    # Ljava/util/Locale;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ROOT:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {p0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->addLikelySubtags(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/text/ICUCompat;->getScript(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "scriptSubtag":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/text/TextUtilsCompat;->getLayoutDirectionFromFirstChar(Ljava/util/Locale;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 87
a=0;//     .end local v0    # "scriptSubtag":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 81
a=0;//     .restart local v0    # "scriptSubtag":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->ARAB_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     sget-object v1, Landroid/support/v4/text/TextUtilsCompat;->HEBR_SCRIPT_SUBTAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     .end local v0    # "scriptSubtag":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static htmlEncode(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;//         .annotation build Landroid/support/annotation/NonNull;
a=0;//         .end annotation
a=0;//     .end param
a=0;//     .annotation build Landroid/support/annotation/NonNull;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 36
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :sswitch_0
a=0;//     #v3=(Integer);
a=0;//     const-string v3, "&lt;"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 43
a=0;//     :sswitch_1
a=0;//     #v3=(Integer);
a=0;//     const-string v3, "&gt;"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 46
a=0;//     :sswitch_2
a=0;//     #v3=(Integer);
a=0;//     const-string v3, "&amp;"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 53
a=0;//     :sswitch_3
a=0;//     #v3=(Integer);
a=0;//     const-string v3, "&#39;"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 56
a=0;//     :sswitch_4
a=0;//     #v3=(Integer);
a=0;//     const-string v3, "&quot;"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 62
a=0;//     .end local v0    # "c":C
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 38
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x22 -> :sswitch_4
a=0;//         0x26 -> :sswitch_2
a=0;//         0x27 -> :sswitch_3
a=0;//         0x3c -> :sswitch_0
a=0;//         0x3e -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
