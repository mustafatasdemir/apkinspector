package android.support.v4.app; class ActivityCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/ActivityCompat;
a=0;// .super Landroid/support/v4/content/ContextCompat;
a=0;// .source "ActivityCompat.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Landroid/support/v4/content/ContextCompat;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ActivityCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static finishAffinity(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-static {p0}, Landroid/support/v4/app/ActivityCompatJB;->finishAffinity(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static invalidateOptionsMenu(Landroid/app/Activity;)Z
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static startActivity(Landroid/app/Activity;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "options"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityCompatJB;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 94
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "requestCode"    # I
a=0;//     .param p3, "options"    # Landroid/os/Bundle;
a=0;//         .annotation build Landroid/support/annotation/Nullable;
a=0;//         .end annotation
a=0;//     .end param
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {p0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompatJB;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
