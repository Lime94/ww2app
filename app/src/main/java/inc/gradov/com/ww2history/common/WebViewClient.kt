package inc.gradov.com.ww2history.common

import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
        view.loadUrl(url)
        return true
    }
}