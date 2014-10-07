package android.support.v7.internal.widget; class ActionBarView$1 {/*

.class Landroid/support/v7/internal/widget/ActionBarView$1;
.super Ljava/lang/Object;
.source "ActionBarView.java"

# interfaces
.implements Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ActionBarView;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ActionBarView;)V
    .locals 0
    .parameter

    .prologue
    .line 136
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$1;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
    .locals 1
    .parameter
    .parameter "view"
    .parameter "position"
    .parameter "id"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/internal/widget/AdapterViewICS",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 139
    .local p1, parent:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<*>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$1;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/app/ActionBar$OnNavigationListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$1;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/app/ActionBar$OnNavigationListener;

    move-result-object v0

    invoke-interface {v0, p3, p4, p5}, Landroid/support/v7/app/ActionBar$OnNavigationListener;->onNavigationItemSelected(IJ)Z

    .line 142
    :cond_0
    return-void
.end method

.method public onNothingSelected(Landroid/support/v7/internal/widget/AdapterViewICS;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/internal/widget/AdapterViewICS",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 146
    .local p1, parent:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<*>;"
    return-void
.end method

*/}
