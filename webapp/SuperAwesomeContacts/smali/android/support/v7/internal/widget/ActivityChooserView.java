package android.support.v7.internal.widget; class ActivityChooserView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "ActivityChooserView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/widget/ActivityChooserModel$ActivityChooserModelClient;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;,
a=0;//         Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private final mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private final mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;// .field private final mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;// .field private mDefaultActionButtonContentDescription:I
a=0;// 
a=0;// .field private final mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private final mDefaultActivityButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private final mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private final mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mInitialActivityCount:I
a=0;// 
a=0;// .field private mIsAttachedToWindow:Z
a=0;// 
a=0;// .field private mIsSelectingDefaultActivity:Z
a=0;// 
a=0;// .field private final mListPopupMaxWidth:I
a=0;// 
a=0;// .field private mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;// .field private final mModelDataSetOberver:Landroid/database/DataSetObserver;
a=0;// 
a=0;// .field private mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;// .field private final mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;// .field mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 189
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 199
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 9
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 209
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$1;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView$1;);
a=0;//     invoke-direct {v4, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$1;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$1;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$2;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView$2;);
a=0;//     invoke-direct {v4, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$2;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$2;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;//     .line 170
a=0;//     iput v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I
a=0;// 
a=0;//     .line 211
a=0;//     sget-object v4, Landroid/support/v7/appcompat/R$styleable;->ActivityChooserView:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v4, p3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "attributesArray":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 221
a=0;//     .local v1, "expandActivityOverflowButtonDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 224
a=0;//     .local v2, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v2=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$layout;->abc_activity_chooser_view:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4, p0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     invoke-direct {v4, p0, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     .line 228
a=0;//     sget v4, Landroid/support/v7/appcompat/R$id;->activity_chooser_view_content:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/LinearLayout;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 231
a=0;//     sget v4, Landroid/support/v7/appcompat/R$id;->default_activity_button:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$id;->image:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 236
a=0;//     sget v4, Landroid/support/v7/appcompat/R$id;->expand_activities_button:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$id;->image:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 242
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-direct {v4, p0, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     .line 243
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     new-instance v5, Landroid/support/v7/internal/widget/ActivityChooserView$3;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView$3;);
a=0;//     invoke-direct {v5, p0}, Landroid/support/v7/internal/widget/ActivityChooserView$3;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$3;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 252
a=0;//     .local v3, "resources":Landroid/content/res/Resources;
a=0;//     #v3=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$dimen;->abc_config_prefDialogWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupMaxWidth:I
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/PopupWindow$OnDismissListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/DataSetObserver;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->updateAppearance()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopupUnchecked(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v7/internal/widget/ActivityChooserView;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .line 484
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 486
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setModal(Z)V
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mCallbacks:Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupWindow:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private showPopupUnchecked(I)V
a=0;//     .locals 9
a=0;//     .param p1, "maxActivityCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 325
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v6, "No data model. Did you call #setDataModel?"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 329
a=0;//     :cond_0
a=0;//     #v5=(One);v6=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/FrameLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 334
a=0;//     .local v2, "defaultActivityButtonShown":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getActivityCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "activityCount":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 336
a=0;//     .local v3, "maxActivityCountOffset":I
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     const v7, 0x7fffffff
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eq p1, v7, :cond_6
a=0;// 
a=0;//     add-int v7, p1, v3
a=0;// 
a=0;//     if-le v0, v7, :cond_6
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v7, v5}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowFooterView(Z)V
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     add-int/lit8 v8, p1, -0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setMaxActivityCount(I)V
a=0;// 
a=0;//     .line 345
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 346
a=0;//     .local v4, "popupWindow":Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 347
a=0;//     iget-boolean v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 348
a=0;//     :cond_1
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v6, v5, v2}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowDefaultActivity(ZZ)V
a=0;// 
a=0;//     .line 352
a=0;//     :goto_3
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->measureContentWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mListPopupMaxWidth:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 353
a=0;//     .local v1, "contentWidth":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v4, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setContentWidth(I)V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Landroid/support/v4/view/ActionProvider;->subUiVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 358
a=0;//     :cond_2
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$string;->abc_activitychooserview_choose_application:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 361
a=0;//     .end local v1    # "contentWidth":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "activityCount":I
a=0;//     .end local v2    # "defaultActivityButtonShown":Z
a=0;//     .end local v3    # "maxActivityCountOffset":I
a=0;//     .end local v4    # "popupWindow":Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Null);v8=(Reference,Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 331
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "activityCount":I
a=0;//     .restart local v2    # "defaultActivityButtonShown":Z
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Boolean);v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 335
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 341
a=0;//     .restart local v3    # "maxActivityCountOffset":I
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v7=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v7, v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowFooterView(Z)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setMaxActivityCount(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 350
a=0;//     .restart local v4    # "popupWindow":Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     :cond_7
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);v7=(Boolean);v8=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v7, v6, v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setShowDefaultActivity(ZZ)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private updateAppearance()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 498
a=0;//     #v8=(One);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_2
a=0;// 
a=0;//     .line 499
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v6, v8}, Landroid/widget/FrameLayout;->setEnabled(Z)V
a=0;// 
a=0;//     .line 504
a=0;//     :goto_0
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getActivityCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 505
a=0;//     .local v1, "activityCount":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getHistorySize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 506
a=0;//     .local v3, "historySize":I
a=0;//     #v3=(Integer);
a=0;//     if-eq v1, v8, :cond_0
a=0;// 
a=0;//     if-le v1, v8, :cond_3
a=0;// 
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 507
a=0;//     :cond_0
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v6, v9}, Landroid/widget/FrameLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 508
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 509
a=0;//     .local v0, "activity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 510
a=0;//     .local v5, "packageManager":Landroid/content/pm/PackageManager;
a=0;//     #v5=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 511
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 512
a=0;//     invoke-virtual {v0, v5}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 513
a=0;//     .local v4, "label":Ljava/lang/CharSequence;
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v4, v8, v9
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 515
a=0;//     .local v2, "contentDescription":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Landroid/widget/FrameLayout;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 521
a=0;//     .end local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v2    # "contentDescription":Ljava/lang/String;
a=0;//     .end local v4    # "label":Ljava/lang/CharSequence;
a=0;//     .end local v5    # "packageManager":Landroid/content/pm/PackageManager;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v6}, Landroid/widget/FrameLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContentBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 526
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 501
a=0;//     .end local v1    # "activityCount":I
a=0;//     .end local v3    # "historySize":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);v7=(Uninit);v8=(One);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v6, v9}, Landroid/widget/FrameLayout;->setEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 518
a=0;//     .restart local v1    # "activityCount":I
a=0;//     .restart local v3    # "historySize":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);v3=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/FrameLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 524
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dismissPopup()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 372
a=0;//     .local v0, "viewTreeObserver":Landroid/view/ViewTreeObserver;
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 376
a=0;//     .end local v0    # "viewTreeObserver":Landroid/view/ViewTreeObserver;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isShowingPopup()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getListPopupWindow()Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 391
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 392
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->registerObserver(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z
a=0;// 
a=0;//     .line 396
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 402
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mModelDataSetOberver:Landroid/database/DataSetObserver;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->unregisterObserver(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 406
a=0;//     .local v1, "viewTreeObserver":Landroid/view/ViewTreeObserver;
a=0;//     #v1=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnGlobalLayoutListener:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 409
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 412
a=0;//     :cond_2
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z
a=0;// 
a=0;//     .line 413
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 4
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 431
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     sub-int v1, p4, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v2, p5, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v3, v3, v1, v2}, Landroid/widget/LinearLayout;->layout(IIII)V
a=0;// 
a=0;//     .line 432
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 435
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 3
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mActivityChooserContent:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 421
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActivityButton:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 422
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/high16 v2, 0x40000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     .line 425
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0, v0, p1, p2}, Landroid/support/v7/internal/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 426
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 427
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setActivityChooserModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
a=0;//     .locals 1
a=0;//     .param p1, "dataModel"    # Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mAdapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->setDataModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopup()Z
a=0;// 
a=0;//     .line 265
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDefaultActionButtonContentDescription(I)V
a=0;//     .locals 0
a=0;//     .param p1, "resourceId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mDefaultActionButtonContentDescription:I
a=0;// 
a=0;//     .line 474
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExpandActivityOverflowButtonContentDescription(I)V
a=0;//     .locals 2
a=0;//     .param p1, "resourceId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 294
a=0;//     .local v0, "contentDescription":Ljava/lang/CharSequence;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 295
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mExpandActivityOverflowButtonImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 280
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInitialActivityCount(I)V
a=0;//     .locals 0
a=0;//     .param p1, "itemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I
a=0;// 
a=0;//     .line 460
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mOnDismissListener:Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProvider(Landroid/support/v4/view/ActionProvider;)V
a=0;//     .locals 0
a=0;//     .param p1, "provider"    # Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showPopup()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 311
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShowingPopup()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsAttachedToWindow:Z
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 314
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mIsSelectingDefaultActivity:Z
a=0;// 
a=0;//     .line 315
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView;->mInitialActivityCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->showPopupUnchecked(I)V
a=0;// 
a=0;//     .line 316
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
