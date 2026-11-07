package com.myfit.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
 WebView view;
 @Override public void onCreate(Bundle b){ super.onCreate(b); view=new WebView(this); setContentView(view); view.setWebViewClient(new WebViewClient()); view.setWebChromeClient(new WebChromeClient()); WebSettings s=view.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); view.loadUrl("file:///android_asset/index.html"); }
 @Override public void onBackPressed(){ if(view.canGoBack())view.goBack();else super.onBackPressed(); }
}
