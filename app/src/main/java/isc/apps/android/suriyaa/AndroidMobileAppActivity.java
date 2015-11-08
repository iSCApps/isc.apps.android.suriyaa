package isc.apps.android.suriyaa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.parse.Parse;

public class AndroidMobileAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView mainWebView = (WebView) findViewById(R.id.mainWebView);
        
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        mainWebView.setWebViewClient(new MyCustomWebViewClient());
        mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        
        mainWebView.loadUrl("http://bit.ly/Suriyaa");
    }

    public void onCreate() {
        Parse.initialize(this, "PaeS5Dwb89w55KsabIcHlfbBDdIOte8ER0bCLqL5", "roBo2hGaPFeEjf71JQD8vdHCcoV935AekM5VksQ3");
        com.parse.ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
    
    private class MyCustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}