package android.support.v4.util; class TimeUtils { void a() { int a;
a=0;// .class public Landroid/support/v4/util/TimeUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TimeUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final HUNDRED_DAY_FIELD_LEN:I = 0x13
a=0;// 
a=0;// .field private static final SECONDS_PER_DAY:I = 0x15180
a=0;// 
a=0;// .field private static final SECONDS_PER_HOUR:I = 0xe10
a=0;// 
a=0;// .field private static final SECONDS_PER_MINUTE:I = 0x3c
a=0;// 
a=0;// .field private static sFormatStr:[C
a=0;// 
a=0;// .field private static final sFormatSync:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;
a=0;// 
a=0;//     .line 36
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     sput-object v0, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/TimeUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static accumField(IIZI)I
a=0;//     .locals 1
a=0;//     .param p0, "amt"    # I
a=0;//     .param p1, "suffix"    # I
a=0;//     .param p2, "always"    # Z
a=0;//     .param p3, "zeropad"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     const/16 v0, 0x63
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-gt p0, v0, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     if-lt p3, v0, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, p1, 0x3
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     if-gt p0, v0, :cond_2
a=0;// 
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     if-lt p3, v0, :cond_3
a=0;// 
a=0;//     .line 43
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, p1, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_3
a=0;//     #v0=(PosByte);
a=0;//     if-nez p2, :cond_4
a=0;// 
a=0;//     if-lez p0, :cond_5
a=0;// 
a=0;//     .line 46
a=0;//     :cond_4
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_5
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static formatDuration(JJLjava/io/PrintWriter;)V
a=0;//     .locals 3
a=0;//     .param p0, "time"    # J
a=0;//     .param p2, "now"    # J
a=0;//     .param p4, "pw"    # Ljava/io/PrintWriter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     const-string v0, "--"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     #v0=(Byte);v2=(Uninit);
a=0;//     sub-long v0, p0, p2
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, p4, v2}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static formatDuration(JLjava/io/PrintWriter;)V
a=0;//     .locals 1
a=0;//     .param p0, "duration"    # J
a=0;//     .param p2, "pw"    # Ljava/io/PrintWriter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, p2, v0}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;I)V
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static formatDuration(JLjava/io/PrintWriter;I)V
a=0;//     .locals 5
a=0;//     .param p0, "duration"    # J
a=0;//     .param p2, "pw"    # Ljava/io/PrintWriter;
a=0;//     .param p3, "fieldLen"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 157
a=0;//     :try_start_0
a=0;//     invoke-static {p0, p1, p3}, Landroid/support/v4/util/TimeUtils;->formatDurationLocked(JI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "len":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     sget-object v3, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v3, v4, v0}, Ljava/lang/String;-><init>([CII)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 160
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     .end local v0    # "len":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static formatDuration(JLjava/lang/StringBuilder;)V
a=0;//     .locals 4
a=0;//     .param p0, "duration"    # J
a=0;//     .param p2, "builder"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatSync:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 149
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, p1, v1}, Landroid/support/v4/util/TimeUtils;->formatDurationLocked(JI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 150
a=0;//     .local v0, "len":I
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     #v1=(Reference,[C);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p2, v1, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 151
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     .end local v0    # "len":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static formatDurationLocked(JI)I
a=0;//     .locals 20
a=0;//     .param p0, "duration"    # J
a=0;//     .param p2, "fieldLen"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget-object v4, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v4, v0, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     new-array v4, v0, [C
a=0;// 
a=0;//     #v4=(Reference,[C);
a=0;//     sput-object v4, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v2, Landroid/support/v4/util/TimeUtils;->sFormatStr:[C
a=0;// 
a=0;//     .line 82
a=0;//     .local v2, "formatStr":[C
a=0;//     #v2=(Reference,[C);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, p0, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     .local v5, "pos":I
a=0;//     #v5=(Null);
a=0;//     add-int/lit8 p2, p2, -0x1
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     if-ge v5, v0, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aput-char v4, v2, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v4=(Byte);
a=0;//     const/16 v4, 0x30
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aput-char v4, v2, v5
a=0;// 
a=0;//     .line 89
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 143
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 93
a=0;//     .end local v5    # "pos":I
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);v6=(LongLo);v7=(LongHi);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     cmp-long v4, p0, v6
a=0;// 
a=0;//     if-lez v4, :cond_6
a=0;// 
a=0;//     .line 94
a=0;//     const/16 v16, 0x2b
a=0;// 
a=0;//     .line 100
a=0;//     .local v16, "prefix":C
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v16=(PosByte);
a=0;//     const-wide/16 v6, 0x3e8
a=0;// 
a=0;//     rem-long v6, p0, v6
a=0;// 
a=0;//     long-to-int v13, v6
a=0;// 
a=0;//     .line 101
a=0;//     .local v13, "millis":I
a=0;//     #v13=(Integer);
a=0;//     const-wide/16 v6, 0x3e8
a=0;// 
a=0;//     div-long v6, p0, v6
a=0;// 
a=0;//     long-to-double v6, v6
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     double-to-int v0, v6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v17, "seconds":I
a=0;//     #v17=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "days":I
a=0;//     #v3=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "hours":I
a=0;//     #v12=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     .local v14, "minutes":I
a=0;//     #v14=(Null);
a=0;//     const v4, 0x15180
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-le v0, v4, :cond_3
a=0;// 
a=0;//     .line 105
a=0;//     const v4, 0x15180
a=0;// 
a=0;//     div-int v3, v17, v4
a=0;// 
a=0;//     .line 106
a=0;//     #v3=(Integer);
a=0;//     const v4, 0x15180
a=0;// 
a=0;//     mul-int/2addr v4, v3
a=0;// 
a=0;//     sub-int v17, v17, v4
a=0;// 
a=0;//     .line 108
a=0;//     :cond_3
a=0;//     const/16 v4, 0xe10
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-le v0, v4, :cond_4
a=0;// 
a=0;//     .line 109
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     div-int/lit16 v12, v0, 0xe10
a=0;// 
a=0;//     .line 110
a=0;//     #v12=(Integer);
a=0;//     mul-int/lit16 v4, v12, 0xe10
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v17, v17, v4
a=0;// 
a=0;//     .line 112
a=0;//     :cond_4
a=0;//     const/16 v4, 0x3c
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-le v0, v4, :cond_5
a=0;// 
a=0;//     .line 113
a=0;//     div-int/lit8 v14, v17, 0x3c
a=0;// 
a=0;//     .line 114
a=0;//     #v14=(Integer);
a=0;//     mul-int/lit8 v4, v14, 0x3c
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v17, v17, v4
a=0;// 
a=0;//     .line 117
a=0;//     :cond_5
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     .restart local v5    # "pos":I
a=0;//     #v5=(Null);
a=0;//     if-eqz p2, :cond_b
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v3, v4, v6, v7}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 121
a=0;//     .local v15, "myLen":I
a=0;//     #v15=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-lez v15, :cond_7
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Boolean);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-static {v12, v6, v4, v7}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v15, v4
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     if-lez v15, :cond_8
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     #v4=(Boolean);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     invoke-static {v14, v6, v4, v7}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v15, v4
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     if-lez v15, :cond_9
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Boolean);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     invoke-static {v0, v6, v4, v7}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v15, v4
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-lez v15, :cond_a
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     :goto_6
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v13, v6, v7, v4}, Landroid/support/v4/util/TimeUtils;->accumField(IIZI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     add-int/2addr v15, v4
a=0;// 
a=0;//     .line 125
a=0;//     :goto_7
a=0;//     #v5=(Integer);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     if-ge v15, v0, :cond_b
a=0;// 
a=0;//     .line 126
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aput-char v4, v2, v5
a=0;// 
a=0;//     .line 127
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 128
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 96
a=0;//     .end local v3    # "days":I
a=0;//     .end local v5    # "pos":I
a=0;//     .end local v12    # "hours":I
a=0;//     .end local v13    # "millis":I
a=0;//     .end local v14    # "minutes":I
a=0;//     .end local v15    # "myLen":I
a=0;//     .end local v16    # "prefix":C
a=0;//     .end local v17    # "seconds":I
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);v6=(LongLo);v7=(LongHi);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     const/16 v16, 0x2d
a=0;// 
a=0;//     .line 97
a=0;//     .restart local v16    # "prefix":C
a=0;//     #v16=(PosByte);
a=0;//     move-wide/from16 v0, p0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     neg-long v0, v0
a=0;// 
a=0;//     move-wide/from16 p0, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 121
a=0;//     .restart local v3    # "days":I
a=0;//     .restart local v5    # "pos":I
a=0;//     .restart local v12    # "hours":I
a=0;//     .restart local v13    # "millis":I
a=0;//     .restart local v14    # "minutes":I
a=0;//     .restart local v15    # "myLen":I
a=0;//     .restart local v17    # "seconds":I
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Integer);v4=(One);v5=(Null);v6=(One);v7=(Null);v12=(Integer);v13=(Integer);v14=(Integer);v15=(Integer);v17=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 122
a=0;//     :cond_8
a=0;//     #v4=(Integer);v7=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 123
a=0;//     :cond_9
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 124
a=0;//     :cond_a
a=0;//     #v4=(Integer);v6=(PosByte);v7=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 132
a=0;//     .end local v15    # "myLen":I
a=0;//     :cond_b
a=0;//     #v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v15=(Conflicted);
a=0;//     aput-char v16, v2, v5
a=0;// 
a=0;//     .line 133
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 135
a=0;//     move/from16 v18, v5
a=0;// 
a=0;//     .line 136
a=0;//     .local v18, "start":I
a=0;//     #v18=(Integer);
a=0;//     if-eqz p2, :cond_c
a=0;// 
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     .line 137
a=0;//     .local v19, "zeropad":Z
a=0;//     :goto_8
a=0;//     #v19=(Boolean);
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v2 .. v7}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 138
a=0;//     const/16 v8, 0x68
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-eq v5, v0, :cond_d
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     :goto_9
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v19, :cond_e
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     :goto_a
a=0;//     #v11=(PosByte);
a=0;//     move-object v6, v2
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     move v7, v12
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v9, v5
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 139
a=0;//     const/16 v8, 0x6d
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-eq v5, v0, :cond_f
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     :goto_b
a=0;//     if-eqz v19, :cond_10
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     :goto_c
a=0;//     move-object v6, v2
a=0;// 
a=0;//     move v7, v14
a=0;// 
a=0;//     move v9, v5
a=0;// 
a=0;//     invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 140
a=0;//     const/16 v8, 0x73
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-eq v5, v0, :cond_11
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     :goto_d
a=0;//     if-eqz v19, :cond_12
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     :goto_e
a=0;//     move-object v6, v2
a=0;// 
a=0;//     move/from16 v7, v17
a=0;// 
a=0;//     move v9, v5
a=0;// 
a=0;//     invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 141
a=0;//     const/16 v8, 0x6d
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     if-eqz v19, :cond_13
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-eq v5, v0, :cond_13
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     :goto_f
a=0;//     move-object v6, v2
a=0;// 
a=0;//     move v7, v13
a=0;// 
a=0;//     move v9, v5
a=0;// 
a=0;//     invoke-static/range {v6 .. v11}, Landroid/support/v4/util/TimeUtils;->printField([CICIZI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 142
a=0;//     const/16 v4, 0x73
a=0;// 
a=0;//     aput-char v4, v2, v5
a=0;// 
a=0;//     .line 143
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 136
a=0;//     .end local v19    # "zeropad":Z
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v19=(Uninit);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 138
a=0;//     .restart local v19    # "zeropad":Z
a=0;//     :cond_d
a=0;//     #v4=(PosByte);v6=(Null);v7=(Null);v8=(PosByte);v19=(Boolean);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :cond_e
a=0;//     #v10=(Boolean);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 139
a=0;//     :cond_f
a=0;//     #v6=(Reference,[C);v7=(Integer);v9=(Integer);v11=(PosByte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :cond_10
a=0;//     #v10=(Boolean);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 140
a=0;//     :cond_11
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :cond_12
a=0;//     #v10=(Boolean);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 141
a=0;//     :cond_13
a=0;//     #v10=(One);v11=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_f
a=0;// .end method
a=0;// 
a=0;// .method private static printField([CICIZI)I
a=0;//     .locals 3
a=0;//     .param p0, "formatStr"    # [C
a=0;//     .param p1, "amt"    # I
a=0;//     .param p2, "suffix"    # C
a=0;//     .param p3, "pos"    # I
a=0;//     .param p4, "always"    # Z
a=0;//     .param p5, "zeropad"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     if-nez p4, :cond_0
a=0;// 
a=0;//     if-lez p1, :cond_7
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     move v1, p3
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "startPos":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge p5, v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v2, 0x63
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le p1, v2, :cond_3
a=0;// 
a=0;//     .line 56
a=0;//     :cond_2
a=0;//     div-int/lit8 v0, p1, 0x64
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "dig":I
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v2, v0, 0x30
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, p0, p3
a=0;// 
a=0;//     .line 58
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     .line 59
a=0;//     mul-int/lit8 v2, v0, 0x64
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr p1, v2
a=0;// 
a=0;//     .line 61
a=0;//     .end local v0    # "dig":I
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge p5, v2, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt p1, v2, :cond_5
a=0;// 
a=0;//     if-eq v1, p3, :cond_6
a=0;// 
a=0;//     .line 62
a=0;//     :cond_5
a=0;//     div-int/lit8 v0, p1, 0xa
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v0    # "dig":I
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v2, v0, 0x30
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, p0, p3
a=0;// 
a=0;//     .line 64
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     .line 65
a=0;//     mul-int/lit8 v2, v0, 0xa
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr p1, v2
a=0;// 
a=0;//     .line 67
a=0;//     .end local v0    # "dig":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v2, p1, 0x30
a=0;// 
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     aput-char v2, p0, p3
a=0;// 
a=0;//     .line 68
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     .line 69
a=0;//     aput-char p2, p0, p3
a=0;// 
a=0;//     .line 70
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     .line 72
a=0;//     .end local v1    # "startPos":I
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return p3
a=0;// .end method
}}
