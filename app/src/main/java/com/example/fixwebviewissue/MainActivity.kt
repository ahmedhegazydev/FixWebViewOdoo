package com.example.fixwebviewissue

import android.os.Bundle
import android.util.Log
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fixwebviewissue.ui.theme.FixWebViewIssueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        webView.settings.apply {
            javaScriptEnabled = true // Enable JavaScript
            domStorageEnabled = true // Enable Local Storage & IndexedDB
            cacheMode = WebSettings.LOAD_NO_CACHE // Disable cache to force fresh content
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW // Allow HTTP/HTTPS mixed content
            allowFileAccess = true
            allowContentAccess = true
            useWideViewPort = true
            loadWithOverviewMode = true
            javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
            databaseEnabled = true
            setSupportZoom(true)
            builtInZoomControls = true
            displayZoomControls = false
            mediaPlaybackRequiresUserGesture = false
        }

        webView.settings.safeBrowsingEnabled = false // Prevents HTTP2 handshake issues

        webView.settings.userAgentString =
            "Mozilla/5.0 (Linux; Android 9; WebView) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Mobile Safari/537.36"

        webView.clearCache(true)
        webView.clearHistory()

        CookieManager.getInstance().removeAllCookies(null)
        CookieManager.getInstance().flush()

        webView.webViewClient = object : WebViewClient() {
            override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                val headers = mapOf("Upgrade-Insecure-Requests" to "1", "Cache-Control" to "no-cache")
                request?.requestHeaders?.putAll(headers)
                return super.shouldInterceptRequest(view, request)
            }
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(request?.url.toString())
                Log.e("request?.url.toString()=  ", request?.url.toString())
//                2025-02-20 15:19:13.837 24376-24376 request?.u...oString()= com.example.fixwebviewissue          E  https://demo3.odoo.com/saas_worker/demo/login?dbname=demo_saas-181_b02957276536_1740057553&user=admin&key=admin&redirect=
//                2025-02-20 15:19:06.334 24376-24376 request?.u...oString()= com.example.fixwebviewissue          E  https://demo3.odoo.com/saas_worker/demo?user=admin&key=admin&redirect=
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                Log.d("WebView", "Finished loading: $url")
            }
        }
        WebView.setWebContentsDebuggingEnabled(true)

        webView.loadUrl("https://master.odoo.com/saas_master/demo/")

    }



}

