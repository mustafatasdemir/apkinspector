package android.support.v7.internal.view; class SupportMenuInflater { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// .super Landroid/view/MenuInflater;
a=0;// .source "SupportMenuInflater.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;,
a=0;//         Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "SupportMenuInflater"
a=0;// 
a=0;// .field private static final NO_ID:I = 0x0
a=0;// 
a=0;// .field private static final XML_GROUP:Ljava/lang/String; = "group"
a=0;// 
a=0;// .field private static final XML_ITEM:Ljava/lang/String; = "item"
a=0;// 
a=0;// .field private static final XML_MENU:Ljava/lang/String; = "menu"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;// .field private final mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v2, Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 73
a=0;//     sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 90
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 91
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200()[Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v7/internal/view/SupportMenuInflater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500()[Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
a=0;//     .locals 10
a=0;//     .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "menu"    # Landroid/view/Menu;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xmlpull/v1/XmlPullParserException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     new-instance v2, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;);
a=0;//     invoke-direct {v2, p0, p3}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;-><init>(Landroid/support/v7/internal/view/SupportMenuInflater;Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 136
a=0;//     .local v2, "menuState":Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "eventType":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "lookingForEndOfUnknownTag":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     .local v6, "unknownTagName":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v6=(Null);v7=(Conflicted);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v0, v7, :cond_3
a=0;// 
a=0;//     .line 144
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 145
a=0;//     .local v5, "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 156
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     .local v3, "reachedEndOfMenu":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 158
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 208
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 151
a=0;//     .end local v3    # "reachedEndOfMenu":Z
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Boolean);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Expecting menu, got "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 153
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v5=(Uninit);v7=(PosByte);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v0, v7, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     .restart local v3    # "reachedEndOfMenu":Z
a=0;//     :pswitch_0
a=0;//     #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 165
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "group"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->readGroup(Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 167
a=0;//     :cond_4
a=0;//     const-string v7, "item"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->readItem(Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 169
a=0;//     :cond_5
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addSubMenuItem()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 174
a=0;//     .local v4, "subMenu":Landroid/view/SubMenu;
a=0;//     #v4=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-direct {p0, p1, p2, v4}, Landroid/support/v7/internal/view/SupportMenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 176
a=0;//     .end local v4    # "subMenu":Landroid/view/SubMenu;
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 177
a=0;//     #v1=(One);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 179
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 182
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :pswitch_1
a=0;//     #v1=(Boolean);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 183
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     #v1=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 186
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     const-string v7, "group"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->resetGroup()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 188
a=0;//     :cond_8
a=0;//     const-string v7, "item"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->hasAddedItem()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-static {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     invoke-static {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addSubMenuItem()Landroid/view/SubMenu;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 196
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addItem()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 199
a=0;//     :cond_a
a=0;//     #v7=(Boolean);
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 205
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v3=(Boolean);v5=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v8, "Unexpected end of document"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 210
a=0;//     :cond_b
a=0;//     #v7=(Conflicted);v8=(Uninit);
a=0;//     return-void
a=0;// 
a=0;//     .line 158
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public inflate(ILandroid/view/Menu;)V
a=0;//     .locals 5
a=0;//     .param p1, "menuRes"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     instance-of v3, p2, Landroid/support/v4/internal/view/SupportMenu;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     .local v2, "parser":Landroid/content/res/XmlResourceParser;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Reference,Landroid/content/res/XmlResourceParser;);
a=0;//     invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "attrs":Landroid/util/AttributeSet;
a=0;//     #v0=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-direct {p0, v2, v0, p2}, Landroid/support/v7/internal/view/SupportMenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 124
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v0    # "attrs":Landroid/util/AttributeSet;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 120
a=0;//     .local v1, "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     new-instance v3, Landroid/view/InflateException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/InflateException;);
a=0;//     const-string v4, "Error inflating menu XML"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/InflateException;);
a=0;//     throw v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 124
a=0;//     .end local v1    # "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v3
a=0;// 
a=0;//     .line 121
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 122
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Landroid/view/InflateException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/InflateException;);
a=0;//     const-string v4, "Error inflating menu XML"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/InflateException;);
a=0;//     throw v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
}}
