package android.support.v7.internal.view; class SupportMenuInflater {/*

.class public Landroid/support/v7/internal/view/SupportMenuInflater;
.super Landroid/view/MenuInflater;
.source "SupportMenuInflater.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;,
        Landroid/support/v7/internal/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
    }
.end annotation


# static fields
.field private static final ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final LOG_TAG:Ljava/lang/String; = "SupportMenuInflater"

.field private static final NO_ID:I = 0x0

.field private static final XML_GROUP:Ljava/lang/String; = "group"

.field private static final XML_ITEM:Ljava/lang/String; = "item"

.field private static final XML_MENU:Ljava/lang/String; = "menu"


# instance fields
.field private final mActionProviderConstructorArguments:[Ljava/lang/Object;

.field private final mActionViewConstructorArguments:[Ljava/lang/Object;

.field private mContext:Landroid/content/Context;

.field private mRealOwner:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 71
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [Ljava/lang/Class;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const-class v2, Landroid/content/Context;

    #v2=(Reference);
    aput-object v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;

    .line 73
    sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;

    sput-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 89
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 90
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;

    .line 91
    iput-object p1, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mRealOwner:Ljava/lang/Object;

    .line 92
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [Ljava/lang/Object;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aput-object p1, v0, v1

    iput-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;

    .line 94
    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/view/SupportMenuInflater;)Landroid/content/Context;
    .locals 1
    .parameter "x0"

    .prologue
    .line 57
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200()[Ljava/lang/Class;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 57
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v7/internal/view/SupportMenuInflater;)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 57
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mRealOwner:Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$500()[Ljava/lang/Class;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Landroid/support/v7/internal/view/SupportMenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$600(Landroid/support/v7/internal/view/SupportMenuInflater;)[Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 57
    iget-object v0, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;

    #v0=(Reference);
    return-object v0
.end method

.method private parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 10
    .parameter "parser"
    .parameter "attrs"
    .parameter "menu"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 134
    new-instance v2, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;

    #v2=(UninitRef);
    invoke-direct {v2, p0, p3}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;-><init>(Landroid/support/v7/internal/view/SupportMenuInflater;Landroid/view/Menu;)V

    .line 136
    .local v2, menuState:Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
    #v2=(Reference);
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    .line 138
    .local v0, eventType:I
    #v0=(Integer);
    const/4 v1, 0x0

    .line 139
    .local v1, lookingForEndOfUnknownTag:Z
    #v1=(Null);
    const/4 v6, 0x0

    .line 143
    .local v6, unknownTagName:Ljava/lang/String;
    :cond_0
    #v6=(Null);v7=(Conflicted);
    const/4 v7, 0x2

    #v7=(PosByte);
    if-ne v0, v7, :cond_3

    .line 144
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 145
    .local v5, tagName:Ljava/lang/String;
    #v5=(Reference);
    const-string v7, "menu"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_2

    .line 147
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    .line 156
    .end local v5           #tagName:Ljava/lang/String;
    :goto_0
    #v5=(Conflicted);
    const/4 v3, 0x0

    .line 157
    .local v3, reachedEndOfMenu:Z
    :goto_1
    #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v6=(Reference);v7=(Conflicted);
    if-nez v3, :cond_b

    .line 158
    packed-switch v0, :pswitch_data_0

    .line 208
    :cond_1
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto :goto_1

    .line 151
    .end local v3           #reachedEndOfMenu:Z
    .restart local v5       #tagName:Ljava/lang/String;
    :cond_2
    #v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Reference);v6=(Null);v7=(Boolean);
    new-instance v7, Ljava/lang/RuntimeException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "Expecting menu, got "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 153
    .end local v5           #tagName:Ljava/lang/String;
    :cond_3
    #v5=(Uninit);v7=(PosByte);v8=(Uninit);v9=(Uninit);
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    .line 154
    const/4 v7, 0x1

    #v7=(One);
    if-ne v0, v7, :cond_0

    goto :goto_0

    .line 160
    .restart local v3       #reachedEndOfMenu:Z
    :pswitch_0
    #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Reference);v7=(Conflicted);
    if-nez v1, :cond_1

    .line 164
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 165
    .restart local v5       #tagName:Ljava/lang/String;
    #v5=(Reference);
    const-string v7, "group"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_4

    .line 166
    invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->readGroup(Landroid/util/AttributeSet;)V

    goto :goto_2

    .line 167
    :cond_4
    const-string v7, "item"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_5

    .line 168
    invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->readItem(Landroid/util/AttributeSet;)V

    goto :goto_2

    .line 169
    :cond_5
    const-string v7, "menu"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_6

    .line 171
    invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addSubMenuItem()Landroid/view/SubMenu;

    move-result-object v4

    .line 174
    .local v4, subMenu:Landroid/view/SubMenu;
    #v4=(Reference);
    invoke-direct {p0, p1, p2, v4}, Landroid/support/v7/internal/view/SupportMenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    goto :goto_2

    .line 176
    .end local v4           #subMenu:Landroid/view/SubMenu;
    :cond_6
    #v4=(Conflicted);
    const/4 v1, 0x1

    .line 177
    #v1=(One);
    move-object v6, v5

    .line 179
    goto :goto_2

    .line 182
    .end local v5           #tagName:Ljava/lang/String;
    :pswitch_1
    #v1=(Boolean);v5=(Conflicted);v7=(Conflicted);
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 183
    .restart local v5       #tagName:Ljava/lang/String;
    #v5=(Reference);
    if-eqz v1, :cond_7

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_7

    .line 184
    const/4 v1, 0x0

    .line 185
    #v1=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_2

    .line 186
    :cond_7
    #v1=(Boolean);v6=(Reference);v7=(Conflicted);
    const-string v7, "group"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_8

    .line 187
    invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->resetGroup()V

    goto :goto_2

    .line 188
    :cond_8
    const-string v7, "item"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_a

    .line 191
    invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->hasAddedItem()Z

    move-result v7

    if-nez v7, :cond_1

    .line 192
    invoke-static {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;

    move-result-object v7

    #v7=(Reference);
    if-eqz v7, :cond_9

    invoke-static {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->access$000(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;

    move-result-object v7

    invoke-virtual {v7}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_9

    .line 194
    invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addSubMenuItem()Landroid/view/SubMenu;

    goto/16 :goto_2

    .line 196
    :cond_9
    #v7=(Conflicted);
    invoke-virtual {v2}, Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;->addItem()V

    goto/16 :goto_2

    .line 199
    :cond_a
    #v7=(Boolean);
    const-string v7, "menu"

    #v7=(Reference);
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_1

    .line 200
    const/4 v3, 0x1

    #v3=(One);
    goto/16 :goto_2

    .line 205
    .end local v5           #tagName:Ljava/lang/String;
    :pswitch_2
    #v3=(Boolean);v5=(Conflicted);v7=(Conflicted);
    new-instance v7, Ljava/lang/RuntimeException;

    #v7=(UninitRef);
    const-string v8, "Unexpected end of document"

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 210
    :cond_b
    #v7=(Conflicted);v8=(Uninit);
    return-void

    .line 158
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public inflate(ILandroid/view/Menu;)V
    .locals 5
    .parameter "menuRes"
    .parameter "menu"

    .prologue
    .line 108
    instance-of v3, p2, Landroid/support/v4/internal/view/SupportMenu;

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 109
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 126
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 113
    :cond_1
    #v0=(Uninit);v2=(Uninit);v3=(Boolean);
    const/4 v2, 0x0

    .line 115
    .local v2, parser:Landroid/content/res/XmlResourceParser;
    :try_start_0
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/view/SupportMenuInflater;->mContext:Landroid/content/Context;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 116
    #v2=(Reference);
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 118
    .local v0, attrs:Landroid/util/AttributeSet;
    #v0=(Reference);
    invoke-direct {p0, v2, v0, p2}, Landroid/support/v7/internal/view/SupportMenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 124
    if-eqz v2, :cond_0

    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    goto :goto_0

    .line 119
    .end local v0           #attrs:Landroid/util/AttributeSet;
    :catch_0
    #v0=(Conflicted);v3=(Conflicted);
    move-exception v1

    .line 120
    .local v1, e:Lorg/xmlpull/v1/XmlPullParserException;
    :try_start_1
    #v1=(Reference);
    new-instance v3, Landroid/view/InflateException;

    #v3=(UninitRef);
    const-string v4, "Error inflating menu XML"

    #v4=(Reference);
    invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .end local v1           #e:Lorg/xmlpull/v1/XmlPullParserException;
    :catchall_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v3

    #v3=(Reference);
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_2
    throw v3

    .line 121
    :catch_1
    #v1=(Uninit);v3=(Conflicted);v4=(Uninit);
    move-exception v1

    .line 122
    .local v1, e:Ljava/io/IOException;
    :try_start_2
    #v1=(Reference);
    new-instance v3, Landroid/view/InflateException;

    #v3=(UninitRef);
    const-string v4, "Error inflating menu XML"

    #v4=(Reference);
    invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    #v3=(Reference);
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

*/}
