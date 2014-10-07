package android.support.v7.internal.widget; class ActivityChooserModel$PersistHistoryAsyncTask {/*

.class final Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;
.super Landroid/os/AsyncTask;
.source "ActivityChooserModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActivityChooserModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "PersistHistoryAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
    .locals 0
    .parameter

    .prologue
    .line 1049
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1049
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 1049
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 15
    .parameter "args"

    .prologue
    .line 1054
    const/4 v11, 0x0

    #v11=(Null);
    aget-object v2, p1, v11

    #v2=(Null);
    check-cast v2, Ljava/util/List;

    .line 1055
    .local v2, historicalRecords:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
    #v2=(Reference);
    const/4 v11, 0x1

    #v11=(One);
    aget-object v3, p1, v11

    #v3=(Null);
    check-cast v3, Ljava/lang/String;

    .line 1057
    .local v3, hostoryFileName:Ljava/lang/String;
    #v3=(Reference);
    const/4 v1, 0x0

    .line 1060
    .local v1, fos:Ljava/io/FileOutputStream;
    :try_start_0
    #v1=(Null);
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v11=(Reference);
    invoke-static {v11}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$200(Landroid/support/v7/internal/widget/ActivityChooserModel;)Landroid/content/Context;

    move-result-object v11

    const/4 v12, 0x0

    #v12=(Null);
    invoke-virtual {v11, v3, v12}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1066
    #v1=(Reference);
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v10

    .line 1069
    .local v10, serializer:Lorg/xmlpull/v1/XmlSerializer;
    #v10=(Reference);
    const/4 v11, 0x0

    :try_start_1
    #v11=(Null);
    invoke-interface {v10, v1, v11}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 1070
    const-string v11, "UTF-8"

    #v11=(Reference);
    const/4 v12, 0x1

    #v12=(One);
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    #v12=(Reference);
    invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1071
    const/4 v11, 0x0

    #v11=(Null);
    const-string v12, "historical-records"

    invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1073
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    .line 1074
    .local v9, recordCount:I
    #v9=(Integer);
    const/4 v4, 0x0

    .local v4, i:I
    :goto_0
    #v4=(Integer);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    if-ge v4, v9, :cond_0

    .line 1075
    const/4 v11, 0x0

    invoke-interface {v2, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;

    .line 1076
    .local v8, record:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    const/4 v11, 0x0

    const-string v12, "historical-record"

    invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1077
    const/4 v11, 0x0

    const-string v12, "activity"

    iget-object v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;

    #v13=(Reference);
    invoke-virtual {v13}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1079
    const/4 v11, 0x0

    const-string v12, "time"

    iget-wide v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J

    #v13=(LongLo);v14=(LongHi);
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v13

    #v13=(Reference);
    invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1080
    const/4 v11, 0x0

    const-string v12, "weight"

    iget v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F

    #v13=(Integer);
    invoke-static {v13}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v13

    #v13=(Reference);
    invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1081
    const/4 v11, 0x0

    const-string v12, "historical-record"

    invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    .line 1074
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1061
    .end local v4           #i:I
    .end local v8           #record:Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
    .end local v9           #recordCount:I
    .end local v10           #serializer:Lorg/xmlpull/v1/XmlSerializer;
    :catch_0
    #v1=(Null);v4=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Conflicted);v13=(Uninit);v14=(Uninit);
    move-exception v0

    .line 1062
    .local v0, fnfe:Ljava/io/FileNotFoundException;
    #v0=(Reference);
    invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;

    move-result-object v11

    #v11=(Reference);
    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    #v12=(Reference);
    const-string v13, "Error writing historical recrod file: "

    #v13=(Reference);
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1063
    const/4 v11, 0x0

    .line 1109
    .end local v0           #fnfe:Ljava/io/FileNotFoundException;
    :goto_1
    #v0=(Conflicted);v1=(Reference);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Null);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    return-object v11

    .line 1087
    .restart local v4       #i:I
    .restart local v9       #recordCount:I
    .restart local v10       #serializer:Lorg/xmlpull/v1/XmlSerializer;
    :cond_0
    #v0=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Integer);v10=(Reference);v12=(Reference);
    const/4 v11, 0x0

    :try_start_2
    const-string v12, "historical-records"

    invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 1088
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    .line 1100
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v11=(Reference);
    const/4 v12, 0x1

    #v12=(One);
    invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z

    .line 1101
    if-eqz v1, :cond_1

    .line 1103
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7

    .line 1109
    .end local v4           #i:I
    .end local v9           #recordCount:I
    :cond_1
    :goto_2
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    const/4 v11, 0x0

    #v11=(Null);
    goto :goto_1

    .line 1093
    :catch_1
    #v5=(Uninit);v6=(Uninit);v7=(Uninit);v11=(Reference);v12=(Conflicted);
    move-exception v5

    .line 1094
    .local v5, iae:Ljava/lang/IllegalArgumentException;
    :try_start_4
    #v5=(Reference);
    invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    #v12=(Reference);
    const-string v13, "Error writing historical recrod file: "

    #v13=(Reference);
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1100
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    const/4 v12, 0x1

    #v12=(One);
    invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z

    .line 1101
    if-eqz v1, :cond_1

    .line 1103
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_2

    .line 1104
    :catch_2
    move-exception v11

    goto :goto_2

    .line 1095
    .end local v5           #iae:Ljava/lang/IllegalArgumentException;
    :catch_3
    #v5=(Uninit);v12=(Conflicted);v13=(Conflicted);
    move-exception v7

    .line 1096
    .local v7, ise:Ljava/lang/IllegalStateException;
    :try_start_6
    #v7=(Reference);
    invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    #v12=(Reference);
    const-string v13, "Error writing historical recrod file: "

    #v13=(Reference);
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1100
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    const/4 v12, 0x1

    #v12=(One);
    invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z

    .line 1101
    if-eqz v1, :cond_1

    .line 1103
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_2

    .line 1104
    :catch_4
    move-exception v11

    goto :goto_2

    .line 1097
    .end local v7           #ise:Ljava/lang/IllegalStateException;
    :catch_5
    #v7=(Uninit);v12=(Conflicted);v13=(Conflicted);
    move-exception v6

    .line 1098
    .local v6, ioe:Ljava/io/IOException;
    :try_start_8
    #v6=(Reference);
    invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    #v12=(UninitRef);
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    #v12=(Reference);
    const-string v13, "Error writing historical recrod file: "

    #v13=(Reference);
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1100
    iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    const/4 v12, 0x1

    #v12=(One);
    invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z

    .line 1101
    if-eqz v1, :cond_1

    .line 1103
    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto/16 :goto_2

    .line 1104
    :catch_6
    move-exception v11

    goto/16 :goto_2

    .line 1100
    .end local v6           #ioe:Ljava/io/IOException;
    :catchall_0
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    move-exception v11

    iget-object v12, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v12=(Reference);
    const/4 v13, 0x1

    #v13=(One);
    invoke-static {v12, v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z

    .line 1101
    if-eqz v1, :cond_2

    .line 1103
    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 1106
    :cond_2
    :goto_3
    throw v11

    .line 1104
    .restart local v4       #i:I
    .restart local v9       #recordCount:I
    :catch_7
    #v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Integer);v12=(One);v13=(Conflicted);
    move-exception v11

    goto/16 :goto_2

    .end local v4           #i:I
    .end local v9           #recordCount:I
    :catch_8
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v12=(Reference);v13=(One);
    move-exception v12

    goto :goto_3
.end method

*/}
