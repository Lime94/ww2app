package inc.gradov.com.ww2history.common

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import inc.gradov.com.ww2history.R
import android.webkit.WebViewClient

class WebViewBaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_base)
        val webView: WebView = findViewById(R.id.webview)
        webView.loadUrl("file:///android_asset/matrosov_feat.html")
        webView.settings.javaScriptEnabled = true
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webView.webViewClient = WebViewClient()
    }

    companion object {
        fun newInstance(activity: Activity) {
            val intent = Intent(activity, WebViewBaseActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
