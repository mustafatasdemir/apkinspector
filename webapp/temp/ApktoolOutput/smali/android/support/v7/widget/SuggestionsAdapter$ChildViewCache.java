package android.support.v7.widget; class SuggestionsAdapter$ChildViewCache {/*

.class final Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
.super Ljava/lang/Object;
.source "SuggestionsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/SuggestionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ChildViewCache"
.end annotation


# instance fields
.field public final mIcon1:Landroid/widget/ImageView;

.field public final mIcon2:Landroid/widget/ImageView;

.field public final mIconRefine:Landroid/widget/ImageView;

.field public final mText1:Landroid/widget/TextView;

.field public final mText2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .parameter "v"

    .prologue
    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    #p0=(Reference);
    const v0, 0x1020014

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    .line 260
    const v0, 0x1020015

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText2:Landroid/widget/TextView;

    .line 261
    const v0, 0x1020007

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon1:Landroid/widget/ImageView;

    .line 262
    const v0, 0x1020008

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon2:Landroid/widget/ImageView;

    .line 263
    sget v0, Landroid/support/v7/appcompat/R$id;->edit_query:I

    #v0=(Integer);
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;

    .line 264
    return-void
.end method

*/}
