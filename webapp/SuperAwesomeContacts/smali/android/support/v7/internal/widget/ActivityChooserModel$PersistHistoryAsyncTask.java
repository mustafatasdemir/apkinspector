package android.support.v7.internal.widget; class ActivityChooserModel$PersistHistoryAsyncTask { void a() { int a;
a=0;// .class final Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "ActivityChooserModel.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x12
a=0;//     name = "PersistHistoryAsyncTask"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1049
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserModel;Landroid/support/v7/internal/widget/ActivityChooserModel$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ActivityChooserModel$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1049
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;-><init>(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1049
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
a=0;//     .locals 15
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1054
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aget-object v2, p1, v11
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, Ljava/util/List;
a=0;// 
a=0;//     .line 1055
a=0;//     .local v2, "historicalRecords":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;>;"
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aget-object v3, p1, v11
a=0;// 
a=0;//     #v3=(Null);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 1057
a=0;//     .local v3, "hostoryFileName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1060
a=0;//     .local v1, "fos":Ljava/io/FileOutputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     invoke-static {v11}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$200(Landroid/support/v7/internal/widget/ActivityChooserModel;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v11, v3, v12}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1066
a=0;//     #v1=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1069
a=0;//     .local v10, "serializer":Lorg/xmlpull/v1/XmlSerializer;
a=0;//     #v10=(Reference,Lorg/xmlpull/v1/XmlSerializer;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v11=(Null);
a=0;//     invoke-interface {v10, v1, v11}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1070
a=0;//     const-string v11, "UTF-8"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V
a=0;// 
a=0;//     .line 1071
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const-string v12, "historical-records"
a=0;// 
a=0;//     invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1073
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1074
a=0;//     .local v9, "recordCount":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v4=(Integer);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     if-ge v4, v9, :cond_0
a=0;// 
a=0;//     .line 1075
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     invoke-interface {v2, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;// 
a=0;//     .line 1076
a=0;//     .local v8, "record":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const-string v12, "historical-record"
a=0;// 
a=0;//     invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1077
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const-string v12, "activity"
a=0;// 
a=0;//     iget-object v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->activity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v13=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v13}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1079
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const-string v12, "time"
a=0;// 
a=0;//     iget-wide v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->time:J
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1080
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const-string v12, "weight"
a=0;// 
a=0;//     iget v13, v8, Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;->weight:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v13}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v10, v11, v12, v13}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1081
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     const-string v12, "historical-record"
a=0;// 
a=0;//     invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1074
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1061
a=0;//     .end local v4    # "i":I
a=0;//     .end local v8    # "record":Landroid/support/v7/internal/widget/ActivityChooserModel$HistoricalRecord;
a=0;//     .end local v9    # "recordCount":I
a=0;//     .end local v10    # "serializer":Lorg/xmlpull/v1/XmlSerializer;
a=0;//     :catch_0
a=0;//     #v1=(Null);v4=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Conflicted);v13=(Uninit);v14=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1062
a=0;//     .local v0, "fnfe":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Error writing historical recrod file: "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 1063
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1109
a=0;//     .end local v0    # "fnfe":Ljava/io/FileNotFoundException;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/FileOutputStream;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Null);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v11
a=0;// 
a=0;//     .line 1087
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v9    # "recordCount":I
a=0;//     .restart local v10    # "serializer":Lorg/xmlpull/v1/XmlSerializer;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Integer);v10=(Reference,Lorg/xmlpull/v1/XmlSerializer;);v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     const-string v12, "historical-records"
a=0;// 
a=0;//     invoke-interface {v10, v11, v12}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
a=0;// 
a=0;//     .line 1088
a=0;//     invoke-interface {v10}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1100
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;// 
a=0;//     .line 1101
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1103
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     .line 1109
a=0;//     .end local v4    # "i":I
a=0;//     .end local v9    # "recordCount":I
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1093
a=0;//     :catch_1
a=0;//     #v5=(Uninit);v6=(Uninit);v7=(Uninit);v11=(Reference,Ljava/lang/String;);v12=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 1094
a=0;//     .local v5, "iae":Ljava/lang/IllegalArgumentException;
a=0;//     :try_start_4
a=0;//     #v5=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Error writing historical recrod file: "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 1100
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;// 
a=0;//     .line 1101
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1103
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1104
a=0;//     :catch_2
a=0;//     move-exception v11
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1095
a=0;//     .end local v5    # "iae":Ljava/lang/IllegalArgumentException;
a=0;//     :catch_3
a=0;//     #v5=(Uninit);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 1096
a=0;//     .local v7, "ise":Ljava/lang/IllegalStateException;
a=0;//     :try_start_6
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Error writing historical recrod file: "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 1100
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;// 
a=0;//     .line 1101
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1103
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1104
a=0;//     :catch_4
a=0;//     move-exception v11
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1097
a=0;//     .end local v7    # "ise":Ljava/lang/IllegalStateException;
a=0;//     :catch_5
a=0;//     #v7=(Uninit);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 1098
a=0;//     .local v6, "ioe":Ljava/io/IOException;
a=0;//     :try_start_8
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$300()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Error writing historical recrod file: "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     invoke-static {v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$400(Landroid/support/v7/internal/widget/ActivityChooserModel;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     .line 1100
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-static {v11, v12}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;// 
a=0;//     .line 1101
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1103
a=0;//     :try_start_9
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1104
a=0;//     :catch_6
a=0;//     move-exception v11
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1100
a=0;//     .end local v6    # "ioe":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v7/internal/widget/ActivityChooserModel$PersistHistoryAsyncTask;->this$0:Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-static {v12, v13}, Landroid/support/v7/internal/widget/ActivityChooserModel;->access$502(Landroid/support/v7/internal/widget/ActivityChooserModel;Z)Z
a=0;// 
a=0;//     .line 1101
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1103
a=0;//     :try_start_a
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8
a=0;// 
a=0;//     .line 1106
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     throw v11
a=0;// 
a=0;//     .line 1104
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v9    # "recordCount":I
a=0;//     :catch_7
a=0;//     #v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Integer);v12=(One);v13=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .end local v4    # "i":I
a=0;//     .end local v9    # "recordCount":I
a=0;//     :catch_8
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v12=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);v13=(One);
a=0;//     move-exception v12
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
