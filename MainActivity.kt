package com.example.hisabati
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebSettings

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val web = WebView(this)
    web.webViewClient = WebViewClient()
    web.settings.javaScriptEnabled = true
    web.settings.domStorageEnabled = true
    web.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
    setContentView(web)
    web.loadUrl("file:///android_asset/index.html")
  }
  @Deprecated("Deprecated in Java")
  override fun onBackPressed() { super.onBackPressed() }
}
