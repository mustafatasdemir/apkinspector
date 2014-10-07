package android.support.v7.widget; class SearchView {/*

.class public Landroid/support/v7/widget/SearchView;
.super Landroid/widget/LinearLayout;
.source "SearchView.java"

# interfaces
.implements Landroid/support/v7/view/CollapsibleActionView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;,
        Landroid/support/v7/widget/SearchView$SearchAutoComplete;,
        Landroid/support/v7/widget/SearchView$OnSuggestionListener;,
        Landroid/support/v7/widget/SearchView$OnCloseListener;,
        Landroid/support/v7/widget/SearchView$OnQueryTextListener;
    }
.end annotation


# static fields
.field private static final DBG:Z = false

.field static final HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector; = null

.field private static final IME_OPTION_NO_MICROPHONE:Ljava/lang/String; = "nm"

.field private static final LOG_TAG:Ljava/lang/String; = "SearchView"


# instance fields
.field private mAppSearchData:Landroid/os/Bundle;

.field private mClearingFocus:Z

.field private mCloseButton:Landroid/widget/ImageView;

.field private mCollapsedImeOptions:I

.field private mDropDownAnchor:Landroid/view/View;

.field private mExpandedInActionView:Z

.field private mIconified:Z

.field private mIconifiedByDefault:Z

.field private mMaxWidth:I

.field private mOldQueryText:Ljava/lang/CharSequence;

.field private final mOnClickListener:Landroid/view/View$OnClickListener;

.field private mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;

.field private final mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

.field private final mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private final mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

.field private mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private mOnSearchClickListener:Landroid/view/View$OnClickListener;

.field private mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

.field private final mOutsideDrawablesCache:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private mQueryHint:Ljava/lang/CharSequence;

.field private mQueryRefinement:Z

.field private mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

.field private mReleaseCursorRunnable:Ljava/lang/Runnable;

.field private mSearchButton:Landroid/view/View;

.field private mSearchEditFrame:Landroid/view/View;

.field private mSearchHintIcon:Landroid/widget/ImageView;

.field private mSearchPlate:Landroid/view/View;

.field private mSearchable:Landroid/app/SearchableInfo;

.field private mShowImeRunnable:Ljava/lang/Runnable;

.field private mSubmitArea:Landroid/view/View;

.field private mSubmitButton:Landroid/view/View;

.field private mSubmitButtonEnabled:Z

.field private mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

.field mTextKeyListener:Landroid/view/View$OnKeyListener;

.field private mTextWatcher:Landroid/text/TextWatcher;

.field private mUpdateDrawableStateRunnable:Ljava/lang/Runnable;

.field private mUserQuery:Ljava/lang/CharSequence;

.field private final mVoiceAppSearchIntent:Landroid/content/Intent;

.field private mVoiceButton:Landroid/view/View;

.field private mVoiceButtonEnabled:Z

.field private final mVoiceWebSearchIntent:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 146
    new-instance v0, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v7/widget/SearchView;->HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 254
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 255
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/high16 v12, 0x1000

    #v12=(Integer);
    const/4 v11, 0x1

    #v11=(One);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v9, -0x1

    .line 258
    #v9=(Byte);
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 152
    #p0=(Reference);
    new-instance v7, Landroid/support/v7/widget/SearchView$1;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$1;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;

    .line 163
    new-instance v7, Landroid/support/v7/widget/SearchView$2;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$2;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;

    .line 169
    new-instance v7, Landroid/support/v7/widget/SearchView$3;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$3;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mReleaseCursorRunnable:Ljava/lang/Runnable;

    .line 183
    new-instance v7, Ljava/util/WeakHashMap;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/WeakHashMap;-><init>()V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    .line 883
    new-instance v7, Landroid/support/v7/widget/SearchView$7;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$7;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 923
    new-instance v7, Landroid/support/v7/widget/SearchView$8;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$8;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mTextKeyListener:Landroid/view/View$OnKeyListener;

    .line 1098
    new-instance v7, Landroid/support/v7/widget/SearchView$9;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$9;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 1274
    new-instance v7, Landroid/support/v7/widget/SearchView$10;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$10;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 1285
    new-instance v7, Landroid/support/v7/widget/SearchView$11;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$11;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 1572
    new-instance v7, Landroid/support/v7/widget/SearchView$12;

    #v7=(UninitRef);
    invoke-direct {v7, p0}, Landroid/support/v7/widget/SearchView$12;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mTextWatcher:Landroid/text/TextWatcher;

    .line 260
    const-string v7, "layout_inflater"

    invoke-virtual {p1, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/LayoutInflater;

    .line 262
    .local v3, inflater:Landroid/view/LayoutInflater;
    sget v7, Landroid/support/v7/appcompat/R$layout;->abc_search_view:I

    #v7=(Integer);
    invoke-virtual {v3, v7, p0, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 264
    sget v7, Landroid/support/v7/appcompat/R$id;->search_button:I

    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSearchButton:Landroid/view/View;

    .line 265
    sget v7, Landroid/support/v7/appcompat/R$id;->search_src_text:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 266
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v7, p0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSearchView(Landroid/support/v7/widget/SearchView;)V

    .line 268
    sget v7, Landroid/support/v7/appcompat/R$id;->search_edit_frame:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSearchEditFrame:Landroid/view/View;

    .line 269
    sget v7, Landroid/support/v7/appcompat/R$id;->search_plate:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSearchPlate:Landroid/view/View;

    .line 270
    sget v7, Landroid/support/v7/appcompat/R$id;->submit_area:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSubmitArea:Landroid/view/View;

    .line 271
    sget v7, Landroid/support/v7/appcompat/R$id;->search_go_btn:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    .line 272
    sget v7, Landroid/support/v7/appcompat/R$id;->search_close_btn:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/widget/ImageView;

    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;

    .line 273
    sget v7, Landroid/support/v7/appcompat/R$id;->search_voice_btn:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceButton:Landroid/view/View;

    .line 274
    sget v7, Landroid/support/v7/appcompat/R$id;->search_mag_icon:I

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/widget/ImageView;

    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mSearchHintIcon:Landroid/widget/ImageView;

    .line 276
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mSearchButton:Landroid/view/View;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    #v8=(Reference);
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceButton:Landroid/view/View;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 283
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 284
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 285
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 286
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v8, p0, Landroid/support/v7/widget/SearchView;->mTextKeyListener:Landroid/view/View$OnKeyListener;

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 288
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    new-instance v8, Landroid/support/v7/widget/SearchView$4;

    #v8=(UninitRef);
    invoke-direct {v8, p0}, Landroid/support/v7/widget/SearchView$4;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v8=(Reference);
    invoke-virtual {v7, v8}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 297
    sget-object v7, Landroid/support/v7/appcompat/R$styleable;->SearchView:[I

    invoke-virtual {p1, p2, v7, v10, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 298
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v7, 0x3

    #v7=(PosByte);
    invoke-virtual {v0, v7, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    #v7=(Boolean);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 299
    invoke-virtual {v0, v10, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    .line 300
    .local v5, maxWidth:I
    #v5=(Integer);
    if-eq v5, v9, :cond_0

    .line 301
    invoke-virtual {p0, v5}, Landroid/support/v7/widget/SearchView;->setMaxWidth(I)V

    .line 303
    :cond_0
    const/4 v7, 0x4

    #v7=(PosByte);
    invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v6

    .line 304
    .local v6, queryHint:Ljava/lang/CharSequence;
    #v6=(Reference);
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_1

    .line 305
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 307
    :cond_1
    const/4 v7, 0x2

    #v7=(PosByte);
    invoke-virtual {v0, v7, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 308
    .local v2, imeOptions:I
    #v2=(Integer);
    if-eq v2, v9, :cond_2

    .line 309
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/SearchView;->setImeOptions(I)V

    .line 311
    :cond_2
    invoke-virtual {v0, v11, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 312
    .local v4, inputType:I
    #v4=(Integer);
    if-eq v4, v9, :cond_3

    .line 313
    invoke-virtual {p0, v4}, Landroid/support/v7/widget/SearchView;->setInputType(I)V

    .line 316
    :cond_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 318
    const/4 v1, 0x1

    .line 320
    .local v1, focusable:Z
    #v1=(One);
    sget-object v7, Landroid/support/v7/appcompat/R$styleable;->View:[I

    #v7=(Reference);
    invoke-virtual {p1, p2, v7, v10, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 321
    invoke-virtual {v0, v10, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 322
    #v1=(Boolean);
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 323
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/SearchView;->setFocusable(Z)V

    .line 326
    new-instance v7, Landroid/content/Intent;

    #v7=(UninitRef);
    const-string v8, "android.speech.action.WEB_SEARCH"

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;

    .line 327
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;

    invoke-virtual {v7, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 328
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;

    const-string v8, "android.speech.extra.LANGUAGE_MODEL"

    const-string v9, "web_search"

    #v9=(Reference);
    invoke-virtual {v7, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 331
    new-instance v7, Landroid/content/Intent;

    #v7=(UninitRef);
    const-string v8, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;

    .line 332
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;

    invoke-virtual {v7, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 334
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v7}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getDropDownAnchor()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {p0, v7}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v7

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    .line 335
    iget-object v7, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    if-eqz v7, :cond_4

    .line 336
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    #v7=(Integer);
    const/16 v8, 0xb

    #v8=(PosByte);
    if-lt v7, v8, :cond_5

    .line 337
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->addOnLayoutChangeListenerToDropDownAnchorSDK11()V

    .line 343
    :cond_4
    :goto_0
    #v7=(Conflicted);v8=(Conflicted);
    iget-boolean v7, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v7=(Boolean);
    invoke-direct {p0, v7}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 344
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateQueryHint()V

    .line 345
    return-void

    .line 339
    :cond_5
    #v7=(Integer);v8=(PosByte);
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->addOnLayoutChangeListenerToDropDownAnchorBase()V

    goto :goto_0
.end method

.method static synthetic access$000(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateFocusedState()V

    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/widget/SearchView;)Landroid/support/v4/widget/CursorAdapter;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1000(Landroid/support/v7/widget/SearchView;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mVoiceButton:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1100(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onVoiceClicked()V

    return-void
.end method

.method static synthetic access$1200(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1300(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->forceSuggestionQuery()V

    return-void
.end method

.method static synthetic access$1400(Landroid/support/v7/widget/SearchView;)Landroid/app/SearchableInfo;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1500(Landroid/support/v7/widget/SearchView;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"

    .prologue
    .line 103
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/SearchView;->onSuggestionsKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$1700(Landroid/support/v7/widget/SearchView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"

    .prologue
    .line 103
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/SearchView;->launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1800(Landroid/support/v7/widget/SearchView;IILjava/lang/String;)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"

    .prologue
    .line 103
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/SearchView;->onItemClicked(IILjava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$1900(Landroid/support/v7/widget/SearchView;I)Z
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 103
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->onItemSelected(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$200(Landroid/support/v7/widget/SearchView;)Landroid/view/View$OnFocusChangeListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$2000(Landroid/support/v7/widget/SearchView;Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 103
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->onTextChanged(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic access$2100(Landroid/support/v7/widget/SearchView;Z)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 103
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    return-void
.end method

.method static synthetic access$300(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->adjustDropDownSizeAndPosition()V

    return-void
.end method

.method static synthetic access$400(Landroid/support/v7/widget/SearchView;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchButton:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$500(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onSearchClicked()V

    return-void
.end method

.method static synthetic access$600(Landroid/support/v7/widget/SearchView;)Landroid/widget/ImageView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onCloseClicked()V

    return-void
.end method

.method static synthetic access$800(Landroid/support/v7/widget/SearchView;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 103
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onSubmitQuery()V

    return-void
.end method

.method private addOnLayoutChangeListenerToDropDownAnchorBase()V
    .locals 2

    .prologue
    .line 358
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Landroid/support/v7/widget/SearchView$6;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/support/v7/widget/SearchView$6;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 365
    return-void
.end method

.method private addOnLayoutChangeListenerToDropDownAnchorSDK11()V
    .locals 2

    .prologue
    .line 348
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    #v0=(Reference);
    new-instance v1, Landroid/support/v7/widget/SearchView$5;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/support/v7/widget/SearchView$5;-><init>(Landroid/support/v7/widget/SearchView;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 355
    return-void
.end method

.method private adjustDropDownSizeAndPosition()V
    .locals 8

    .prologue
    .line 1237
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    #v6=(Integer);
    const/4 v7, 0x1

    #v7=(One);
    if-le v6, v7, :cond_0

    .line 1238
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 1239
    .local v4, res:Landroid/content/res/Resources;
    #v4=(Reference);
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mSearchPlate:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 1240
    .local v0, anchorPadding:I
    #v0=(Integer);
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1241
    .local v1, dropDownPadding:Landroid/graphics/Rect;
    #v1=(Reference);
    iget-boolean v6, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v6=(Boolean);
    if-eqz v6, :cond_1

    sget v6, Landroid/support/v7/appcompat/R$dimen;->abc_dropdownitem_icon_width:I

    #v6=(Integer);
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    sget v7, Landroid/support/v7/appcompat/R$dimen;->abc_dropdownitem_text_padding_left:I

    #v7=(Integer);
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    add-int v2, v6, v7

    .line 1245
    .local v2, iconOffset:I
    :goto_0
    #v2=(Integer);
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1246
    iget v6, v1, Landroid/graphics/Rect;->left:I

    #v6=(Integer);
    add-int/2addr v6, v2

    sub-int v3, v0, v6

    .line 1247
    .local v3, offset:I
    #v3=(Integer);
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v6=(Reference);
    invoke-virtual {v6, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setDropDownHorizontalOffset(I)V

    .line 1248
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mDropDownAnchor:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    #v6=(Integer);
    iget v7, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    iget v7, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v6, v7

    add-int/2addr v6, v2

    sub-int v5, v6, v0

    .line 1250
    .local v5, width:I
    #v5=(Integer);
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v6=(Reference);
    invoke-virtual {v6, v5}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setDropDownWidth(I)V

    .line 1252
    .end local v0           #anchorPadding:I
    .end local v1           #dropDownPadding:Landroid/graphics/Rect;
    .end local v2           #iconOffset:I
    .end local v3           #offset:I
    .end local v4           #res:Landroid/content/res/Resources;
    .end local v5           #width:I
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 1241
    .restart local v0       #anchorPadding:I
    .restart local v1       #dropDownPadding:Landroid/graphics/Rect;
    .restart local v4       #res:Landroid/content/res/Resources;
    :cond_1
    #v0=(Integer);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Uninit);v6=(Boolean);v7=(One);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0
.end method

.method private createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
    .locals 3
    .parameter "action"
    .parameter "data"
    .parameter "extraData"
    .parameter "query"
    .parameter "actionKey"
    .parameter "actionMsg"

    .prologue
    .line 1401
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1402
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    const/high16 v1, 0x1000

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1406
    if-eqz p2, :cond_0

    .line 1407
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1409
    :cond_0
    const-string v1, "user_query"

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1410
    if-eqz p4, :cond_1

    .line 1411
    const-string v1, "query"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1413
    :cond_1
    if-eqz p3, :cond_2

    .line 1414
    const-string v1, "intent_extra_data_key"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1416
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;

    if-eqz v1, :cond_3

    .line 1417
    const-string v1, "app_data"

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1419
    :cond_3
    if-eqz p5, :cond_4

    .line 1420
    const-string v1, "action_key"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1421
    const-string v1, "action_msg"

    invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1423
    :cond_4
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1424
    return-object v0
.end method

.method private createIntentFromSuggestion(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
    .locals 12
    .parameter "c"
    .parameter "actionKey"
    .parameter "actionMsg"

    .prologue
    .line 1519
    :try_start_0
    const-string v0, "suggest_intent_action"

    #v0=(Reference);
    invoke-static {p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1521
    .local v1, action:Ljava/lang/String;
    #v1=(Reference);
    if-nez v1, :cond_0

    .line 1522
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object v1

    .line 1524
    :cond_0
    if-nez v1, :cond_1

    .line 1525
    const-string v1, "android.intent.action.SEARCH"

    .line 1529
    :cond_1
    const-string v0, "suggest_intent_data"

    invoke-static {p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1530
    .local v7, data:Ljava/lang/String;
    #v7=(Reference);
    if-nez v7, :cond_2

    .line 1531
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object v7

    .line 1534
    :cond_2
    if-eqz v7, :cond_3

    .line 1535
    const-string v0, "suggest_intent_data_id"

    invoke-static {p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1536
    .local v10, id:Ljava/lang/String;
    #v10=(Reference);
    if-eqz v10, :cond_3

    .line 1537
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "/"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1540
    .end local v10           #id:Ljava/lang/String;
    :cond_3
    #v5=(Conflicted);v10=(Conflicted);
    if-nez v7, :cond_4

    const/4 v2, 0x0

    .line 1542
    .local v2, dataUri:Landroid/net/Uri;
    :goto_0
    #v2=(Reference);
    const-string v0, "suggest_intent_query"

    invoke-static {p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1543
    .local v4, query:Ljava/lang/String;
    #v4=(Reference);
    const-string v0, "suggest_intent_extra_data"

    invoke-static {p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .local v3, extraData:Ljava/lang/String;
    #v3=(Reference);
    move-object v0, p0

    move v5, p2

    #v5=(Integer);
    move-object v6, p3

    .line 1545
    #v6=(Reference);
    invoke-direct/range {v0 .. v6}, Landroid/support/v7/widget/SearchView;->createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 1555
    .end local v1           #action:Ljava/lang/String;
    .end local v2           #dataUri:Landroid/net/Uri;
    .end local v3           #extraData:Ljava/lang/String;
    .end local v4           #query:Ljava/lang/String;
    .end local v7           #data:Ljava/lang/String;
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    return-object v0

    .line 1540
    .restart local v1       #action:Ljava/lang/String;
    .restart local v7       #data:Ljava/lang/String;
    :cond_4
    #v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Reference);v8=(Uninit);v9=(Uninit);v11=(Uninit);
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 1546
    .end local v1           #action:Ljava/lang/String;
    .end local v7           #data:Ljava/lang/String;
    :catch_0
    move-exception v8

    .line 1549
    .local v8, e:Ljava/lang/RuntimeException;
    :try_start_1
    #v8=(Reference);
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v11

    .line 1553
    .local v11, rowNum:I
    :goto_2
    #v9=(Conflicted);v11=(Integer);
    const-string v0, "SearchView"

    #v0=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "Search suggestions cursor at row "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " returned exception."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1555
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1

    .line 1550
    .end local v11           #rowNum:I
    :catch_1
    #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Uninit);v11=(Uninit);
    move-exception v9

    .line 1551
    .local v9, e2:Ljava/lang/RuntimeException;
    #v9=(Reference);
    const/4 v11, -0x1

    .restart local v11       #rowNum:I
    #v11=(Byte);
    goto :goto_2
.end method

.method private createVoiceAppSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .locals 13
    .parameter "baseIntent"
    .parameter "searchable"

    .prologue
    .line 1446
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v8

    .line 1451
    .local v8, searchActivity:Landroid/content/ComponentName;
    #v8=(Reference);
    new-instance v6, Landroid/content/Intent;

    #v6=(UninitRef);
    const-string v10, "android.intent.action.SEARCH"

    #v10=(Reference);
    invoke-direct {v6, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1452
    .local v6, queryIntent:Landroid/content/Intent;
    #v6=(Reference);
    invoke-virtual {v6, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1453
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v10

    const/4 v11, 0x0

    #v11=(Null);
    const/high16 v12, 0x4000

    #v12=(Integer);
    invoke-static {v10, v11, v6, v12}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 1460
    .local v3, pending:Landroid/app/PendingIntent;
    #v3=(Reference);
    new-instance v5, Landroid/os/Bundle;

    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1461
    .local v5, queryExtras:Landroid/os/Bundle;
    #v5=(Reference);
    iget-object v10, p0, Landroid/support/v7/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;

    if-eqz v10, :cond_0

    .line 1462
    const-string v10, "app_data"

    iget-object v11, p0, Landroid/support/v7/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;

    #v11=(Reference);
    invoke-virtual {v5, v10, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1468
    :cond_0
    new-instance v9, Landroid/content/Intent;

    #v9=(UninitRef);
    invoke-direct {v9, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1471
    .local v9, voiceIntent:Landroid/content/Intent;
    #v9=(Reference);
    const-string v1, "free_form"

    .line 1472
    .local v1, languageModel:Ljava/lang/String;
    #v1=(Reference);
    const/4 v4, 0x0

    .line 1473
    .local v4, prompt:Ljava/lang/String;
    #v4=(Null);
    const/4 v0, 0x0

    .line 1474
    .local v0, language:Ljava/lang/String;
    #v0=(Null);
    const/4 v2, 0x1

    .line 1476
    .local v2, maxResults:I
    #v2=(One);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    .line 1477
    .local v7, resources:Landroid/content/res/Resources;
    #v7=(Reference);
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v10

    #v10=(Integer);
    if-eqz v10, :cond_1

    .line 1478
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1480
    :cond_1
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v10

    if-eqz v10, :cond_2

    .line 1481
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1483
    :cond_2
    #v4=(Reference);
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v10

    if-eqz v10, :cond_3

    .line 1484
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v10

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1486
    :cond_3
    #v0=(Reference);
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v10

    if-eqz v10, :cond_4

    .line 1487
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v2

    .line 1489
    :cond_4
    #v2=(Integer);
    const-string v10, "android.speech.extra.LANGUAGE_MODEL"

    #v10=(Reference);
    invoke-virtual {v9, v10, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1490
    const-string v10, "android.speech.extra.PROMPT"

    invoke-virtual {v9, v10, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1491
    const-string v10, "android.speech.extra.LANGUAGE"

    invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1492
    const-string v10, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v9, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1493
    const-string v11, "calling_package"

    if-nez v8, :cond_5

    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v9, v11, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1497
    const-string v10, "android.speech.extra.RESULTS_PENDINGINTENT"

    invoke-virtual {v9, v10, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1498
    const-string v10, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    invoke-virtual {v9, v10, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1500
    return-object v9

    .line 1493
    :cond_5
    invoke-virtual {v8}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v10

    goto :goto_0
.end method

.method private createVoiceWebSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .locals 4
    .parameter "baseIntent"
    .parameter "searchable"

    .prologue
    .line 1431
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1432
    .local v1, voiceIntent:Landroid/content/Intent;
    #v1=(Reference);
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 1433
    .local v0, searchActivity:Landroid/content/ComponentName;
    #v0=(Reference);
    const-string v3, "calling_package"

    #v3=(Reference);
    if-nez v0, :cond_0

    const/4 v2, 0x0

    :goto_0
    #v2=(Reference);
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1435
    return-object v1

    .line 1433
    :cond_0
    #v2=(Uninit);
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    goto :goto_0
.end method

.method private dismissSuggestions()V
    .locals 1

    .prologue
    .line 1138
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->dismissDropDown()V

    .line 1139
    return-void
.end method

.method private forceSuggestionQuery()V
    .locals 2

    .prologue
    .line 1560
    sget-object v0, Landroid/support/v7/widget/SearchView;->HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doBeforeTextChanged(Landroid/widget/AutoCompleteTextView;)V

    .line 1561
    sget-object v0, Landroid/support/v7/widget/SearchView;->HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->doAfterTextChanged(Landroid/widget/AutoCompleteTextView;)V

    .line 1562
    return-void
.end method

.method private getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 8
    .parameter "hintText"

    .prologue
    const/4 v7, 0x0

    .line 1015
    #v7=(Null);
    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 1023
    .end local p1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object p1

    .line 1017
    .restart local p1
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v1, Landroid/text/SpannableStringBuilder;

    #v1=(UninitRef);
    const-string v3, "   "

    #v3=(Reference);
    invoke-direct {v1, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1018
    .local v1, ssb:Landroid/text/SpannableStringBuilder;
    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1019
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->getSearchIconId()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1020
    .local v0, searchIcon:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getTextSize()F

    move-result v3

    #v3=(Float);
    float-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide/high16 v5, 0x3ff4

    #v5=(LongLo);v6=(LongHi);
    mul-double/2addr v3, v5

    double-to-int v2, v3

    .line 1021
    .local v2, textSize:I
    #v2=(Integer);
    invoke-virtual {v0, v7, v7, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1022
    new-instance v3, Landroid/text/style/ImageSpan;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    #v3=(Reference);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x2

    #v5=(PosByte);
    const/16 v6, 0x21

    #v6=(PosByte);
    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    move-object p1, v1

    .line 1023
    goto :goto_0
.end method

.method private getPreferredWidth()I
    .locals 2

    .prologue
    .line 774
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/appcompat/R$dimen;->abc_search_view_preferred_width:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method private getSearchIconId()I
    .locals 4

    .prologue
    .line 1008
    new-instance v0, Landroid/util/TypedValue;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 1009
    .local v0, outValue:Landroid/util/TypedValue;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$attr;->searchViewSearchIcon:I

    #v2=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 1010
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    #v1=(Integer);
    return v1
.end method

.method private hasVoiceSearch()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 795
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v3=(Reference);
    if-eqz v3, :cond_1

    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 796
    const/4 v1, 0x0

    .line 797
    .local v1, testIntent:Landroid/content/Intent;
    #v1=(Null);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 798
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;

    .line 802
    :cond_0
    :goto_0
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 803
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/high16 v4, 0x1

    #v4=(Integer);
    invoke-virtual {v3, v1, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 805
    .local v0, ri:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    if-eqz v0, :cond_1

    const/4 v2, 0x1

    .line 808
    .end local v0           #ri:Landroid/content/pm/ResolveInfo;
    .end local v1           #testIntent:Landroid/content/Intent;
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 799
    .restart local v1       #testIntent:Landroid/content/Intent;
    :cond_2
    #v0=(Uninit);v1=(Null);v2=(Null);v3=(Boolean);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 800
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;

    #v1=(Reference);
    goto :goto_0
.end method

.method static isLandscapeMode(Landroid/content/Context;)Z
    .locals 2
    .parameter "context"

    .prologue
    .line 1565
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private isSubmitAreaEnabled()Z
    .locals 1

    .prologue
    .line 812
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mSubmitButtonEnabled:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mVoiceButtonEnabled:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private launchIntent(Landroid/content/Intent;)V
    .locals 4
    .parameter "intent"

    .prologue
    .line 1358
    if-nez p1, :cond_0

    .line 1368
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 1364
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1365
    :catch_0
    #v1=(Conflicted);
    move-exception v0

    .line 1366
    .local v0, ex:Ljava/lang/RuntimeException;
    #v0=(Reference);
    const-string v1, "SearchView"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Failed launch activity: "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V
    .locals 8
    .parameter "actionKey"
    .parameter "actionMsg"
    .parameter "query"

    .prologue
    const/4 v2, 0x0

    .line 1380
    #v2=(Null);
    const-string v1, "android.intent.action.SEARCH"

    .local v1, action:Ljava/lang/String;
    #v1=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move-object v3, v2

    #v3=(Null);
    move-object v4, p3

    #v4=(Reference);
    move v5, p1

    #v5=(Integer);
    move-object v6, p2

    .line 1381
    #v6=(Reference);
    invoke-direct/range {v0 .. v6}, Landroid/support/v7/widget/SearchView;->createIntent(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    .line 1382
    .local v7, intent:Landroid/content/Intent;
    #v7=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1383
    return-void
.end method

.method private launchSuggestion(IILjava/lang/String;)Z
    .locals 3
    .parameter "position"
    .parameter "actionKey"
    .parameter "actionMsg"

    .prologue
    .line 1341
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    .line 1342
    .local v0, c:Landroid/database/Cursor;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 1344
    invoke-direct {p0, v0, p2, p3}, Landroid/support/v7/widget/SearchView;->createIntentFromSuggestion(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 1347
    .local v1, intent:Landroid/content/Intent;
    #v1=(Reference);
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->launchIntent(Landroid/content/Intent;)V

    .line 1349
    const/4 v2, 0x1

    .line 1351
    .end local v1           #intent:Landroid/content/Intent;
    :goto_0
    #v1=(Conflicted);
    return v2

    :cond_0
    #v1=(Uninit);v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0
.end method

.method private onCloseClicked()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1142
    #v3=(One);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1143
    .local v0, text:Ljava/lang/CharSequence;
    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 1144
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    if-eqz v1, :cond_1

    .line 1146
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;

    invoke-interface {v1}, Landroid/support/v7/widget/SearchView$OnCloseListener;->onClose()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 1148
    :cond_0
    #v1=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 1150
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 1159
    :cond_1
    :goto_0
    #v2=(Conflicted);
    return-void

    .line 1154
    :cond_2
    #v1=(Boolean);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1155
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 1156
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    goto :goto_0
.end method

.method private onItemClicked(IILjava/lang/String;)Z
    .locals 2
    .parameter "position"
    .parameter "actionKey"
    .parameter "actionMsg"

    .prologue
    const/4 v0, 0x0

    .line 1255
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

    invoke-interface {v1, p1}, Landroid/support/v7/widget/SearchView$OnSuggestionListener;->onSuggestionClick(I)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 1257
    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/widget/SearchView;->launchSuggestion(IILjava/lang/String;)Z

    .line 1258
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 1259
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->dismissSuggestions()V

    .line 1260
    const/4 v0, 0x1

    .line 1262
    :cond_1
    #v0=(Boolean);v1=(Boolean);
    return v0
.end method

.method private onItemSelected(I)Z
    .locals 1
    .parameter "position"

    .prologue
    .line 1266
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/SearchView$OnSuggestionListener;->onSuggestionSelect(I)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 1268
    :cond_0
    #v0=(Conflicted);
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->rewriteQueryFromSuggestion(I)V

    .line 1269
    const/4 v0, 0x1

    .line 1271
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private onSearchClicked()V
    .locals 1

    .prologue
    .line 1162
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 1163
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 1164
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 1165
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1166
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 1168
    :cond_0
    return-void
.end method

.method private onSubmitQuery()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1124
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1125
    .local v0, query:Ljava/lang/CharSequence;
    #v0=(Reference);
    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_2

    .line 1126
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/support/v7/widget/SearchView$OnQueryTextListener;->onQueryTextSubmit(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    .line 1128
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 1129
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {p0, v3, v1, v2}, Landroid/support/v7/widget/SearchView;->launchQuerySearch(ILjava/lang/String;Ljava/lang/String;)V

    .line 1130
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 1132
    :cond_1
    #v1=(Reference);v2=(Conflicted);
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->dismissSuggestions()V

    .line 1135
    :cond_2
    #v1=(Conflicted);
    return-void
.end method

.method private onSuggestionsKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6
    .parameter "v"
    .parameter "keyCode"
    .parameter "event"

    .prologue
    const/16 v5, 0x15

    #v5=(PosByte);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 967
    #v2=(Null);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v4=(Reference);
    if-nez v4, :cond_1

    .line 1004
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Integer);v4=(Conflicted);
    return v2

    .line 970
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(One);v4=(Reference);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    if-eqz v4, :cond_0

    .line 973
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_0

    invoke-static {p3}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 976
    const/16 v4, 0x42

    #v4=(PosByte);
    if-eq p2, v4, :cond_2

    const/16 v4, 0x54

    if-eq p2, v4, :cond_2

    const/16 v4, 0x3d

    if-ne p2, v4, :cond_3

    .line 978
    :cond_2
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result v0

    .line 979
    .local v0, position:I
    #v0=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {p0, v0, v2, v3}, Landroid/support/v7/widget/SearchView;->onItemClicked(IILjava/lang/String;)Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0

    .line 984
    .end local v0           #position:I
    :cond_3
    #v0=(Uninit);v2=(Null);v3=(One);
    if-eq p2, v5, :cond_4

    const/16 v4, 0x16

    if-ne p2, v4, :cond_6

    .line 987
    :cond_4
    if-ne p2, v5, :cond_5

    move v1, v2

    .line 989
    .local v1, selPoint:I
    :goto_1
    #v1=(Integer);v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v4=(Reference);
    invoke-virtual {v4, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 990
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v4, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setListSelection(I)V

    .line 991
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->clearListSelection()V

    .line 992
    sget-object v2, Landroid/support/v7/widget/SearchView;->HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;

    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2, v4, v3}, Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;->ensureImeVisible(Landroid/widget/AutoCompleteTextView;Z)V

    move v2, v3

    .line 994
    #v2=(One);
    goto :goto_0

    .line 987
    .end local v1           #selPoint:I
    :cond_5
    #v1=(Uninit);v2=(Null);v4=(PosByte);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->length()I

    move-result v1

    #v1=(Integer);
    goto :goto_1

    .line 998
    :cond_6
    #v1=(Uninit);v4=(PosByte);
    const/16 v3, 0x13

    #v3=(PosByte);
    if-ne p2, v3, :cond_0

    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_0

    goto :goto_0
.end method

.method private onTextChanged(Ljava/lang/CharSequence;)V
    .locals 5
    .parameter "newText"

    .prologue
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    .line 1110
    #v3=(Null);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 1111
    .local v1, text:Ljava/lang/CharSequence;
    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;

    .line 1112
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1

    move v0, v2

    .line 1113
    .local v0, hasText:Z
    :goto_0
    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateSubmitButton(Z)V

    .line 1114
    if-nez v0, :cond_2

    :goto_1
    #v2=(Boolean);
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->updateVoiceButton(Z)V

    .line 1115
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateCloseButton()V

    .line 1116
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateSubmitArea()V

    .line 1117
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mOldQueryText:Ljava/lang/CharSequence;

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 1118
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    #v2=(Reference);
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    invoke-interface {v2, v3}, Landroid/support/v7/widget/SearchView$OnQueryTextListener;->onQueryTextChange(Ljava/lang/String;)Z

    .line 1120
    :cond_0
    #v2=(Conflicted);
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v7/widget/SearchView;->mOldQueryText:Ljava/lang/CharSequence;

    .line 1121
    return-void

    .end local v0           #hasText:Z
    :cond_1
    #v0=(Uninit);v2=(One);v3=(Null);
    move v0, v3

    .line 1112
    #v0=(Null);
    goto :goto_0

    .restart local v0       #hasText:Z
    :cond_2
    #v0=(Boolean);
    move v2, v3

    .line 1114
    #v2=(Null);
    goto :goto_1
.end method

.method private onVoiceClicked()V
    .locals 6

    .prologue
    .line 1172
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v4=(Reference);
    if-nez v4, :cond_1

    .line 1191
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 1175
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Uninit);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    .line 1177
    .local v2, searchable:Landroid/app/SearchableInfo;
    :try_start_0
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    .line 1178
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mVoiceWebSearchIntent:Landroid/content/Intent;

    #v4=(Reference);
    invoke-direct {p0, v4, v2}, Landroid/support/v7/widget/SearchView;->createVoiceWebSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v3

    .line 1180
    .local v3, webSearchIntent:Landroid/content/Intent;
    #v3=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1186
    .end local v3           #webSearchIntent:Landroid/content/Intent;
    :catch_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    .line 1189
    .local v1, e:Landroid/content/ActivityNotFoundException;
    #v1=(Reference);
    const-string v4, "SearchView"

    #v4=(Reference);
    const-string v5, "Could not find voice search activity"

    #v5=(Reference);
    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1181
    .end local v1           #e:Landroid/content/ActivityNotFoundException;
    :cond_2
    :try_start_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1182
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mVoiceAppSearchIntent:Landroid/content/Intent;

    #v4=(Reference);
    invoke-direct {p0, v4, v2}, Landroid/support/v7/widget/SearchView;->createVoiceAppSearchIntent(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object v0

    .line 1184
    .local v0, appSearchIntent:Landroid/content/Intent;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private postUpdateFocusedState()V
    .locals 1

    .prologue
    .line 844
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 845
    return-void
.end method

.method private rewriteQueryFromSuggestion(I)V
    .locals 4
    .parameter "position"

    .prologue
    .line 1308
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 1309
    .local v2, oldQuery:Ljava/lang/CharSequence;
    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    invoke-virtual {v3}, Landroid/support/v4/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    .line 1310
    .local v0, c:Landroid/database/Cursor;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 1328
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);
    return-void

    .line 1313
    :cond_0
    #v1=(Uninit);v3=(Reference);
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 1315
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Landroid/support/v4/widget/CursorAdapter;->convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 1316
    .local v1, newQuery:Ljava/lang/CharSequence;
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 1319
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1322
    :cond_1
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1326
    .end local v1           #newQuery:Ljava/lang/CharSequence;
    :cond_2
    #v1=(Uninit);v3=(Boolean);
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private setImeVisibility(Z)V
    .locals 3
    .parameter "visible"

    .prologue
    .line 862
    if-eqz p1, :cond_1

    .line 863
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 873
    :cond_0
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 865
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mShowImeRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 866
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 869
    .local v0, imm:Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 870
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method

.method private setQuery(Ljava/lang/CharSequence;)V
    .locals 2
    .parameter "query"

    .prologue
    .line 1374
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1376
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 1377
    return-void

    .line 1376
    :cond_0
    #v0=(Boolean);
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method private updateCloseButton()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 835
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    move v0, v1

    .line 838
    .local v0, hasText:Z
    :goto_0
    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->mExpandedInActionView:Z

    if-nez v3, :cond_2

    .line 839
    .local v1, showClose:Z
    :cond_0
    :goto_1
    #v1=(Boolean);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;

    #v3=(Reference);
    if-eqz v1, :cond_3

    :goto_2
    #v2=(PosByte);
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 840
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mCloseButton:Landroid/widget/ImageView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v0, :cond_4

    sget-object v2, Landroid/support/v7/widget/SearchView;->ENABLED_STATE_SET:[I

    :goto_3
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 841
    return-void

    .end local v0           #hasText:Z
    .end local v1           #showClose:Z
    :cond_1
    #v0=(Uninit);v1=(One);v2=(Null);v3=(Boolean);
    move v0, v2

    .line 835
    #v0=(Null);
    goto :goto_0

    .restart local v0       #hasText:Z
    :cond_2
    #v0=(Boolean);
    move v1, v2

    .line 838
    #v1=(Null);
    goto :goto_1

    .line 839
    .restart local v1       #showClose:Z
    :cond_3
    #v1=(Boolean);v3=(Reference);
    const/16 v2, 0x8

    #v2=(PosByte);
    goto :goto_2

    .line 840
    :cond_4
    #v2=(Reference);
    sget-object v2, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_3
.end method

.method private updateFocusedState()V
    .locals 3

    .prologue
    .line 848
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    .line 849
    .local v0, focused:Z
    #v0=(Boolean);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchPlate:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    #v2=(Reference);
    if-eqz v0, :cond_0

    sget-object v1, Landroid/support/v7/widget/SearchView;->FOCUSED_STATE_SET:[I

    :goto_0
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 850
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitArea:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v0, :cond_1

    sget-object v1, Landroid/support/v7/widget/SearchView;->FOCUSED_STATE_SET:[I

    :goto_1
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 851
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->invalidate()V

    .line 852
    return-void

    .line 849
    :cond_0
    sget-object v1, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_0

    .line 850
    :cond_1
    sget-object v1, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_1
.end method

.method private updateQueryHint()V
    .locals 4

    .prologue
    .line 1027
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 1028
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;

    #v3=(Reference);
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    .line 1041
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void

    .line 1029
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    if-eqz v2, :cond_3

    .line 1030
    const/4 v0, 0x0

    .line 1031
    .local v0, hint:Ljava/lang/CharSequence;
    #v0=(Null);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    .line 1032
    .local v1, hintId:I
    #v1=(Integer);
    if-eqz v1, :cond_2

    .line 1033
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1035
    :cond_2
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1036
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1039
    .end local v0           #hint:Ljava/lang/CharSequence;
    .end local v1           #hintId:I
    :cond_3
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v3, ""

    #v3=(Reference);
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->getDecoratedHint(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private updateSearchAutoComplete()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 1047
    #v2=(One);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v1, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    .line 1048
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v1, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1049
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getInputType()I

    move-result v0

    .line 1052
    .local v0, inputType:I
    #v0=(Integer);
    and-int/lit8 v1, v0, 0xf

    #v1=(Integer);
    if-ne v1, v2, :cond_0

    .line 1055
    const v1, -0x10001

    and-int/2addr v0, v1

    .line 1056
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1057
    const/high16 v1, 0x1

    #v1=(Integer);
    or-int/2addr v0, v1

    .line 1064
    const/high16 v1, 0x8

    or-int/2addr v0, v1

    .line 1067
    :cond_0
    #v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 1068
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    if-eqz v1, :cond_1

    .line 1069
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v1, v3}, Landroid/support/v4/widget/CursorAdapter;->changeCursor(Landroid/database/Cursor;)V

    .line 1073
    :cond_1
    #v3=(Integer);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1074
    new-instance v1, Landroid/support/v7/widget/SuggestionsAdapter;

    #v1=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v5=(Reference);
    invoke-direct {v1, v3, p0, v4, v5}, Landroid/support/v7/widget/SuggestionsAdapter;-><init>(Landroid/content/Context;Landroid/support/v7/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    .line 1076
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    invoke-virtual {v1, v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1077
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    check-cast v1, Landroid/support/v7/widget/SuggestionsAdapter;

    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->mQueryRefinement:Z

    #v3=(Boolean);
    if-eqz v3, :cond_2

    const/4 v2, 0x2

    :cond_2
    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/support/v7/widget/SuggestionsAdapter;->setQueryRefinement(I)V

    .line 1081
    :cond_3
    #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method private updateSubmitArea()V
    .locals 2

    .prologue
    .line 825
    const/16 v0, 0x8

    .line 826
    .local v0, visibility:I
    #v0=(PosByte);
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->isSubmitAreaEnabled()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceButton:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_1

    .line 829
    :cond_0
    const/4 v0, 0x0

    .line 831
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitArea:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 832
    return-void
.end method

.method private updateSubmitButton(Z)V
    .locals 2
    .parameter "hasText"

    .prologue
    .line 816
    const/16 v0, 0x8

    .line 817
    .local v0, visibility:I
    #v0=(PosByte);
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitButtonEnabled:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->isSubmitAreaEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p1, :cond_0

    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceButtonEnabled:Z

    if-nez v1, :cond_1

    .line 819
    :cond_0
    const/4 v0, 0x0

    .line 821
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 822
    return-void
.end method

.method private updateViewsVisibility(Z)V
    .locals 7
    .parameter "collapsed"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/16 v3, 0x8

    #v3=(PosByte);
    const/4 v2, 0x0

    .line 779
    #v2=(Null);
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->mIconified:Z

    .line 781
    if-eqz p1, :cond_0

    move v1, v2

    .line 783
    .local v1, visCollapsed:I
    :goto_0
    #v1=(PosByte);
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_1

    move v0, v4

    .line 785
    .local v0, hasText:Z
    :goto_1
    #v0=(Boolean);
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->mSearchButton:Landroid/view/View;

    #v5=(Reference);
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 786
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateSubmitButton(Z)V

    .line 787
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->mSearchEditFrame:Landroid/view/View;

    #v6=(Reference);
    if-eqz p1, :cond_2

    move v5, v3

    :goto_2
    #v5=(PosByte);
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 788
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->mSearchHintIcon:Landroid/widget/ImageView;

    #v5=(Reference);
    iget-boolean v6, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v6=(Boolean);
    if-eqz v6, :cond_3

    :goto_3
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 789
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateCloseButton()V

    .line 790
    if-nez v0, :cond_4

    :goto_4
    #v4=(Boolean);
    invoke-direct {p0, v4}, Landroid/support/v7/widget/SearchView;->updateVoiceButton(Z)V

    .line 791
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateSubmitArea()V

    .line 792
    return-void

    .end local v0           #hasText:Z
    .end local v1           #visCollapsed:I
    :cond_0
    #v0=(Uninit);v1=(Uninit);v4=(One);v5=(Uninit);v6=(Uninit);
    move v1, v3

    .line 781
    #v1=(PosByte);
    goto :goto_0

    .restart local v1       #visCollapsed:I
    :cond_1
    #v5=(Boolean);
    move v0, v2

    .line 783
    #v0=(Null);
    goto :goto_1

    .restart local v0       #hasText:Z
    :cond_2
    #v0=(Boolean);v5=(Reference);v6=(Reference);
    move v5, v2

    .line 787
    #v5=(Null);
    goto :goto_2

    :cond_3
    #v5=(Reference);v6=(Boolean);
    move v3, v2

    .line 788
    #v3=(Null);
    goto :goto_3

    :cond_4
    #v3=(PosByte);
    move v4, v2

    .line 790
    #v4=(Null);
    goto :goto_4
.end method

.method private updateVoiceButton(Z)V
    .locals 3
    .parameter "empty"

    .prologue
    .line 1090
    const/16 v0, 0x8

    .line 1091
    .local v0, visibility:I
    #v0=(PosByte);
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceButtonEnabled:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    .line 1092
    const/4 v0, 0x0

    .line 1093
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSubmitButton:Landroid/view/View;

    #v1=(Reference);
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1095
    :cond_0
    #v0=(PosByte);v1=(Conflicted);v2=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mVoiceButton:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1096
    return-void
.end method


# virtual methods
.method public clearFocus()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 468
    #v1=(Null);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mClearingFocus:Z

    .line 469
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 470
    invoke-super {p0}, Landroid/widget/LinearLayout;->clearFocus()V

    .line 471
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->clearFocus()V

    .line 472
    iput-boolean v1, p0, Landroid/support/v7/widget/SearchView;->mClearingFocus:Z

    .line 473
    return-void
.end method

.method public getImeOptions()I
    .locals 1

    .prologue
    .line 421
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getInputType()I
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getInputType()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .prologue
    .line 735
    iget v0, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    #v0=(Integer);
    return v0
.end method

.method public getQuery()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 530
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getQueryHint()Ljava/lang/CharSequence;
    .locals 3

    .prologue
    .line 574
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 575
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;

    .line 584
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    .line 576
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    if-eqz v2, :cond_2

    .line 577
    const/4 v0, 0x0

    .line 578
    .local v0, hint:Ljava/lang/CharSequence;
    #v0=(Null);
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    .line 579
    .local v1, hintId:I
    #v1=(Integer);
    if-eqz v1, :cond_0

    .line 580
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    .line 584
    .end local v0           #hint:Ljava/lang/CharSequence;
    .end local v1           #hintId:I
    :cond_2
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getSuggestionsAdapter()Landroid/support/v4/widget/CursorAdapter;
    .locals 1

    .prologue
    .line 713
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method public isIconfiedByDefault()Z
    .locals 1

    .prologue
    .line 613
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v0=(Boolean);
    return v0
.end method

.method public isIconified()Z
    .locals 1

    .prologue
    .line 641
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mIconified:Z

    #v0=(Boolean);
    return v0
.end method

.method public isQueryRefinementEnabled()Z
    .locals 1

    .prologue
    .line 693
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mQueryRefinement:Z

    #v0=(Boolean);
    return v0
.end method

.method public isSubmitButtonEnabled()Z
    .locals 1

    .prologue
    .line 663
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mSubmitButtonEnabled:Z

    #v0=(Boolean);
    return v0
.end method

.method public onActionViewCollapsed()V
    .locals 2

    .prologue
    .line 1215
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 1216
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 1217
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/widget/SearchView;->mCollapsedImeOptions:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1218
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mExpandedInActionView:Z

    .line 1219
    return-void
.end method

.method public onActionViewExpanded()V
    .locals 3

    .prologue
    .line 1226
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mExpandedInActionView:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1233
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 1228
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mExpandedInActionView:Z

    .line 1229
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/widget/SearchView;->mCollapsedImeOptions:I

    .line 1230
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/widget/SearchView;->mCollapsedImeOptions:I

    #v1=(Integer);
    const/high16 v2, 0x200

    #v2=(Integer);
    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1231
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1232
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 856
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mUpdateDrawableStateRunnable:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 857
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mReleaseCursorRunnable:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 858
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 859
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 911
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 912
    const/4 v0, 0x0

    .line 915
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 3
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 741
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 742
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 771
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);
    return-void

    .line 746
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 747
    .local v1, widthMode:I
    #v1=(Integer);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 749
    .local v0, width:I
    #v0=(Integer);
    sparse-switch v1, :sswitch_data_0

    .line 769
    :cond_1
    :goto_1
    #v2=(Integer);
    const/high16 v1, 0x4000

    .line 770
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-super {p0, v2, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    goto :goto_0

    .line 752
    :sswitch_0
    #v2=(Boolean);
    iget v2, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    #v2=(Integer);
    if-lez v2, :cond_2

    .line 753
    iget v2, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 755
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->getPreferredWidth()I

    move-result v2

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 757
    goto :goto_1

    .line 760
    :sswitch_1
    #v2=(Boolean);
    iget v2, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    #v2=(Integer);
    if-lez v2, :cond_1

    .line 761
    iget v2, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 766
    :sswitch_2
    #v2=(Boolean);
    iget v2, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    #v2=(Integer);
    if-lez v2, :cond_3

    iget v0, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    :goto_2
    goto :goto_1

    :cond_3
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->getPreferredWidth()I

    move-result v0

    goto :goto_2

    .line 749
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x0 -> :sswitch_2
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method onQueryRefine(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "queryText"

    .prologue
    .line 880
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    .line 881
    return-void
.end method

.method onTextFocusChanged()V
    .locals 1

    .prologue
    .line 1194
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 1197
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->postUpdateFocusedState()V

    .line 1198
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1199
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->forceSuggestionQuery()V

    .line 1201
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0
    .parameter "hasWindowFocus"

    .prologue
    .line 1205
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onWindowFocusChanged(Z)V

    .line 1207
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->postUpdateFocusedState()V

    .line 1208
    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 3
    .parameter "direction"
    .parameter "previouslyFocusedRect"

    .prologue
    const/4 v1, 0x0

    .line 450
    #v1=(Null);
    iget-boolean v2, p0, Landroid/support/v7/widget/SearchView;->mClearingFocus:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    move v0, v1

    .line 461
    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    .line 452
    :cond_1
    #v0=(Uninit);v2=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isFocusable()Z

    move-result v2

    if-nez v2, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    .line 454
    :cond_2
    #v0=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v2

    if-nez v2, :cond_3

    .line 455
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v2=(Reference);
    invoke-virtual {v2, p1, p2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    .line 456
    .local v0, result:Z
    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 457
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    goto :goto_0

    .line 461
    .end local v0           #result:Z
    :cond_3
    #v0=(Uninit);v2=(Boolean);
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .locals 0
    .parameter "appSearchData"

    .prologue
    .line 398
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mAppSearchData:Landroid/os/Bundle;

    .line 399
    return-void
.end method

.method public setIconified(Z)V
    .locals 0
    .parameter "iconify"

    .prologue
    .line 627
    if-eqz p1, :cond_0

    .line 628
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onCloseClicked()V

    .line 632
    :goto_0
    return-void

    .line 630
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onSearchClicked()V

    goto :goto_0
.end method

.method public setIconifiedByDefault(Z)V
    .locals 1
    .parameter "iconified"

    .prologue
    .line 600
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    #v0=(Boolean);
    if-ne v0, p1, :cond_0

    .line 604
    :goto_0
    return-void

    .line 601
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->mIconifiedByDefault:Z

    .line 602
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 603
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateQueryHint()V

    goto :goto_0
.end method

.method public setImeOptions(I)V
    .locals 1
    .parameter "imeOptions"

    .prologue
    .line 410
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 411
    return-void
.end method

.method public setInputType(I)V
    .locals 1
    .parameter "inputType"

    .prologue
    .line 433
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 434
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 0
    .parameter "maxpixels"

    .prologue
    .line 722
    iput p1, p0, Landroid/support/v7/widget/SearchView;->mMaxWidth:I

    .line 724
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->requestLayout()V

    .line 725
    return-void
.end method

.method public setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 491
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;

    .line 492
    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 500
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mOnQueryTextFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 501
    return-void
.end method

.method public setOnQueryTextListener(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 482
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    .line 483
    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 521
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mOnSearchClickListener:Landroid/view/View$OnClickListener;

    .line 522
    return-void
.end method

.method public setOnSuggestionListener(Landroid/support/v7/widget/SearchView$OnSuggestionListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 509
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;

    .line 510
    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;Z)V
    .locals 2
    .parameter "query"
    .parameter "submit"

    .prologue
    .line 542
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 543
    if-eqz p1, :cond_0

    .line 544
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->length()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 545
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mUserQuery:Ljava/lang/CharSequence;

    .line 549
    :cond_0
    #v1=(Conflicted);
    if-eqz p2, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 550
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->onSubmitQuery()V

    .line 552
    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "hint"

    .prologue
    .line 563
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mQueryHint:Ljava/lang/CharSequence;

    .line 564
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateQueryHint()V

    .line 565
    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .locals 2
    .parameter "enable"

    .prologue
    .line 681
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->mQueryRefinement:Z

    .line 682
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v0=(Reference);
    instance-of v0, v0, Landroid/support/v7/widget/SuggestionsAdapter;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 683
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/widget/SuggestionsAdapter;

    if-eqz p1, :cond_1

    const/4 v1, 0x2

    :goto_0
    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->setQueryRefinement(I)V

    .line 686
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 683
    :cond_1
    #v0=(Reference);v1=(Uninit);
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .locals 2
    .parameter "searchable"

    .prologue
    .line 376
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    .line 377
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mSearchable:Landroid/app/SearchableInfo;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 378
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateSearchAutoComplete()V

    .line 379
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->updateQueryHint()V

    .line 382
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->hasVoiceSearch()Z

    move-result v0

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mVoiceButtonEnabled:Z

    .line 384
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->mVoiceButtonEnabled:Z

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    const-string v1, "nm"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 389
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 390
    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .locals 1
    .parameter "enabled"

    .prologue
    .line 653
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->mSubmitButtonEnabled:Z

    .line 654
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v0

    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->updateViewsVisibility(Z)V

    .line 655
    return-void
.end method

.method public setSuggestionsAdapter(Landroid/support/v4/widget/CursorAdapter;)V
    .locals 2
    .parameter "adapter"

    .prologue
    .line 703
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    .line 705
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->mQueryTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 706
    return-void
.end method

*/}
