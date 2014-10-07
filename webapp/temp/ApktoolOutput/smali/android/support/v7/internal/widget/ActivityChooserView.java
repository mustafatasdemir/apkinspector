package android.support.v7.internal.widget; class ActivityChooserView {/*

.class public Landroid/support/v7/internal/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;
.source "ActivityChooserView.java"

# interfaces
.implements Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityChooserModelClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;,
        Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
    }
.end annotation


# instance fields
.field private final mActivityChooserContent:Landroid/widget/LinearLayout;

.field private final mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;

.field private final mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

.field private final mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

.field private mDefaultActionButtonContentDescription:I

.field private final mDefaultActivityButton:Landroid/widget/FrameLayout;

.field private final mDefaultActivityButtonImage:Landroid/widget/ImageView;

.field private final mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

.field private final mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;

.field private mInitialActivityCount:I

.field private mIsAttachedToWindow:Z

.field private mIsSelectingDefaultActivity:Z

.field private final mListPopupMaxWidth:I

.field private mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

.field private final mModelDataSetOberver:Landroid/database/DataSetObserver;

.field private mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

.field private final mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field mProvider:Landroid/support/v4/view/ActionProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 188
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 189
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 198
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 199
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v7, 0x4

    #v7=(PosByte);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    .line 209
    #v5=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 122
    #p0=(Reference);
    new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$1;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$1;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;

    .line 136
    new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$2;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$2;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 170
    iput v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I

    .line 211
    sget-object v4, Landroid/support/v7/appcompat/R$styleable;->ActivityChooserView:[I

    invoke-virtual {p1, p2, v4, p3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 214
    .local v0, attributesArray:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I

    .line 218
    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 221
    .local v1, expandActivityOverflowButtonDrawable:Landroid/graphics/drawable/Drawable;
    #v1=(Reference);
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 223
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v4

    #v4=(Reference);
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 224
    .local v2, inflater:Landroid/view/LayoutInflater;
    #v2=(Reference);
    sget v4, Landroid/support/v7/appcompat/R$layout;->abc_activity_chooser_view:I

    #v4=(Integer);
    invoke-virtual {v2, v4, p0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 226
    new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    #v4=(UninitRef);
    invoke-direct {v4, p0, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    .line 228
    sget v4, Landroid/support/v7/appcompat/R$id;->activity_chooser_view_content:I

    #v4=(Integer);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/widget/LinearLayout;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    .line 229
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;

    .line 231
    sget v4, Landroid/support/v7/appcompat/R$id;->default_activity_button:I

    #v4=(Integer);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/widget/FrameLayout;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    .line 232
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 234
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    sget v5, Landroid/support/v7/appcompat/R$id;->image:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButtonImage:Landroid/widget/ImageView;

    .line 236
    sget v4, Landroid/support/v7/appcompat/R$id;->expand_activities_button:I

    #v4=(Integer);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/widget/FrameLayout;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    .line 237
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    sget v5, Landroid/support/v7/appcompat/R$id;->image:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;

    .line 240
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 242
    new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v4=(UninitRef);
    invoke-direct {v4, p0, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    .line 243
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserView$3;

    #v5=(UninitRef);
    invoke-direct {v5, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$3;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 251
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 252
    .local v3, resources:Landroid/content/res/Resources;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    #v4=(Integer);
    div-int/lit8 v4, v4, 0x2

    sget v5, Landroid/support/v7/appcompat/R$dimen;->abc_config_prefDialogWidth:I

    #v5=(Integer);
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupMaxWidth:I

    .line 254
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ListPopupWindow;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v7/internal/widget/ActivityChooserView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 66
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->updateAppearance()V

    return-void
.end method

.method static synthetic access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 66
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopupUnchecked(I)V

    return-void
.end method

.method static synthetic access$600(Landroid/support/v7/internal/widget/ActivityChooserView;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 66
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z

    return p1
.end method

.method static synthetic access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$800(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 66
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I

    #v0=(Integer);
    return v0
.end method

.method private getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
    .locals 2

    .prologue
    .line 482
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 483
    new-instance v0, Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    .line 484
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 485
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 486
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setModal(Z)V

    .line 487
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 488
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 490
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;

    return-object v0
.end method

.method private showPopupUnchecked(I)V
    .locals 9
    .parameter "maxActivityCount"

    .prologue
    const/4 v5, 0x1

    #v5=(One);
    const/4 v6, 0x0

    .line 325
    #v6=(Null);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v7

    if-nez v7, :cond_0

    .line 326
    new-instance v5, Ljava/lang/IllegalStateException;

    #v5=(UninitRef);
    const-string v6, "No data model. Did you call #setDataModel?"

    #v6=(Reference);
    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    throw v5

    .line 329
    :cond_0
    #v5=(One);v6=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v7

    iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    #v8=(Reference);
    invoke-virtual {v7, v8}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 331
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    invoke-virtual {v7}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v7

    #v7=(Integer);
    if-nez v7, :cond_4

    move v2, v5

    .line 334
    .local v2, defaultActivityButtonShown:Z
    :goto_0
    #v2=(Boolean);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getActivityCount()I

    move-result v0

    .line 335
    .local v0, activityCount:I
    #v0=(Integer);
    if-eqz v2, :cond_5

    move v3, v5

    .line 336
    .local v3, maxActivityCountOffset:I
    :goto_1
    #v3=(Boolean);
    const v7, 0x7fffffff

    #v7=(Integer);
    if-eq p1, v7, :cond_6

    add-int v7, p1, v3

    if-le v0, v7, :cond_6

    .line 338
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v7=(Reference);
    invoke-virtual {v7, v5}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowFooterView(Z)V

    .line 339
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    add-int/lit8 v8, p1, -0x1

    #v8=(Integer);
    invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setMaxActivityCount(I)V

    .line 345
    :goto_2
    #v8=(Conflicted);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;

    move-result-object v4

    .line 346
    .local v4, popupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_3

    .line 347
    iget-boolean v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z

    if-nez v7, :cond_1

    if-nez v2, :cond_7

    .line 348
    :cond_1
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v6=(Reference);
    invoke-virtual {v6, v5, v2}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowDefaultActivity(ZZ)V

    .line 352
    :goto_3
    #v7=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->measureContentWidth()I

    move-result v6

    #v6=(Integer);
    iget v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupMaxWidth:I

    #v7=(Integer);
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 353
    .local v1, contentWidth:I
    #v1=(Integer);
    invoke-virtual {v4, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setContentWidth(I)V

    .line 354
    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 355
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;

    #v6=(Reference);
    if-eqz v6, :cond_2

    .line 356
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v6, v5}, Landroid/support/v4/view/ActionProvider;->subUiVisibilityChanged(Z)V

    .line 358
    :cond_2
    invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Landroid/support/v7/appcompat/R$string;->abc_activitychooserview_choose_application:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 361
    .end local v1           #contentWidth:I
    :cond_3
    #v1=(Conflicted);v5=(Conflicted);
    return-void

    .end local v0           #activityCount:I
    .end local v2           #defaultActivityButtonShown:Z
    .end local v3           #maxActivityCountOffset:I
    .end local v4           #popupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
    :cond_4
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Null);v8=(Reference);
    move v2, v6

    .line 331
    #v2=(Null);
    goto :goto_0

    .restart local v0       #activityCount:I
    .restart local v2       #defaultActivityButtonShown:Z
    :cond_5
    #v0=(Integer);v2=(Boolean);v7=(Reference);
    move v3, v6

    .line 335
    #v3=(Null);
    goto :goto_1

    .line 341
    .restart local v3       #maxActivityCountOffset:I
    :cond_6
    #v3=(Boolean);v7=(Integer);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v7=(Reference);
    invoke-virtual {v7, v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowFooterView(Z)V

    .line 342
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v7, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setMaxActivityCount(I)V

    goto :goto_2

    .line 350
    .restart local v4       #popupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
    :cond_7
    #v4=(Reference);v7=(Boolean);v8=(Conflicted);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v7=(Reference);
    invoke-virtual {v7, v6, v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowDefaultActivity(ZZ)V

    goto :goto_3
.end method

.method private updateAppearance()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    #v9=(Null);
    const/4 v8, 0x1

    .line 498
    #v8=(One);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I

    move-result v6

    #v6=(Integer);
    if-lez v6, :cond_2

    .line 499
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    #v6=(Reference);
    invoke-virtual {v6, v8}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 504
    :goto_0
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getActivityCount()I

    move-result v1

    .line 505
    .local v1, activityCount:I
    #v1=(Integer);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getHistorySize()I

    move-result v3

    .line 506
    .local v3, historySize:I
    #v3=(Integer);
    if-eq v1, v8, :cond_0

    if-le v1, v8, :cond_3

    if-lez v3, :cond_3

    .line 507
    :cond_0
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    invoke-virtual {v6, v9}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 508
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDefaultActivity()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 509
    .local v0, activity:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 510
    .local v5, packageManager:Landroid/content/pm/PackageManager;
    #v5=(Reference);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButtonImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 511
    iget v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I

    #v6=(Integer);
    if-eqz v6, :cond_1

    .line 512
    invoke-virtual {v0, v5}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 513
    .local v4, label:Ljava/lang/CharSequence;
    #v4=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    #v6=(Reference);
    iget v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I

    #v7=(Integer);
    new-array v8, v8, [Ljava/lang/Object;

    #v8=(Reference);
    aput-object v4, v8, v9

    invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 515
    .local v2, contentDescription:Ljava/lang/String;
    #v2=(Reference);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    invoke-virtual {v6, v2}, Landroid/widget/FrameLayout;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 521
    .end local v0           #activity:Landroid/content/pm/ResolveInfo;
    .end local v2           #contentDescription:Ljava/lang/String;
    .end local v4           #label:Ljava/lang/CharSequence;
    .end local v5           #packageManager:Landroid/content/pm/PackageManager;
    :cond_1
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v6

    #v6=(Integer);
    if-nez v6, :cond_4

    .line 522
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;

    #v7=(Reference);
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 526
    :goto_2
    return-void

    .line 501
    .end local v1           #activityCount:I
    .end local v3           #historySize:I
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);v7=(Uninit);v8=(One);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;

    #v6=(Reference);
    invoke-virtual {v6, v9}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    goto :goto_0

    .line 518
    .restart local v1       #activityCount:I
    .restart local v3       #historySize:I
    :cond_3
    #v1=(Integer);v3=(Integer);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    const/16 v7, 0x8

    #v7=(PosByte);
    invoke-virtual {v6, v7}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_1

    .line 524
    :cond_4
    #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2
.end method


# virtual methods
.method public dismissPopup()Z
    .locals 2

    .prologue
    .line 369
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 370
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V

    .line 371
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 372
    .local v0, viewTreeObserver:Landroid/view/ViewTreeObserver;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 373
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 376
    .end local v0           #viewTreeObserver:Landroid/view/ViewTreeObserver;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    return v1
.end method

.method public getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
    .locals 1

    .prologue
    .line 438
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    return-object v0
.end method

.method public isShowingPopup()Z
    .locals 1

    .prologue
    .line 385
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 390
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 391
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    .line 392
    .local v0, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 393
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->registerObserver(Ljava/lang/Object;)V

    .line 395
    :cond_0
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z

    .line 396
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    .line 400
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 401
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    .line 402
    .local v0, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 403
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->unregisterObserver(Ljava/lang/Object;)V

    .line 405
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 406
    .local v1, viewTreeObserver:Landroid/view/ViewTreeObserver;
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 407
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 409
    :cond_1
    #v2=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 410
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z

    .line 412
    :cond_2
    const/4 v2, 0x0

    #v2=(Null);
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z

    .line 413
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4
    .parameter "changed"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    const/4 v3, 0x0

    .line 431
    #v3=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    #v0=(Reference);
    sub-int v1, p4, p2

    #v1=(Integer);
    sub-int v2, p5, p3

    #v2=(Integer);
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/widget/LinearLayout;->layout(IIII)V

    .line 432
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 433
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z

    .line 435
    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 417
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;

    .line 421
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_0

    .line 422
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    const/high16 v2, 0x4000

    #v2=(Integer);
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 425
    :cond_0
    #v2=(Conflicted);
    invoke-virtual {p0, v0, p1, p2}, Landroid/support/v7/internal/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V

    .line 426
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->setMeasuredDimension(II)V

    .line 427
    return-void
.end method

.method public setActivityChooserModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
    .locals 1
    .parameter "dataModel"

    .prologue
    .line 260
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setDataModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V

    .line 261
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 262
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z

    .line 263
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopup()Z

    .line 265
    :cond_0
    return-void
.end method

.method public setDefaultActionButtonContentDescription(I)V
    .locals 0
    .parameter "resourceId"

    .prologue
    .line 473
    iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I

    .line 474
    return-void
.end method

.method public setExpandActivityOverflowButtonContentDescription(I)V
    .locals 2
    .parameter "resourceId"

    .prologue
    .line 293
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 294
    .local v0, contentDescription:Ljava/lang/CharSequence;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 295
    return-void
.end method

.method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "drawable"

    .prologue
    .line 279
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 280
    return-void
.end method

.method public setInitialActivityCount(I)V
    .locals 0
    .parameter "itemCount"

    .prologue
    .line 459
    iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I

    .line 460
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 447
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;

    .line 448
    return-void
.end method

.method public setProvider(Landroid/support/v4/view/ActionProvider;)V
    .locals 0
    .parameter "provider"

    .prologue
    .line 302
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;

    .line 303
    return-void
.end method

.method public showPopup()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 311
    #v0=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z

    if-nez v1, :cond_1

    .line 316
    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    .line 314
    :cond_1
    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z

    .line 315
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I

    #v0=(Integer);
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopupUnchecked(I)V

    .line 316
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

*/}
